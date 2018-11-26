package ru.noties.markwon.html;

import android.support.annotation.NonNull;

import ru.noties.markwon.MarkwonConfiguration;
import ru.noties.markwon.SpannableBuilder;

public abstract class TagHandler {

    public abstract void handle(
            @NonNull MarkwonConfiguration configuration,
            @NonNull SpannableBuilder builder,
            @NonNull HtmlTag tag
    );

    protected static void visitChildren(
            @NonNull MarkwonConfiguration configuration,
            @NonNull SpannableBuilder builder,
            @NonNull HtmlTag.Block block) {

        TagHandler handler;

        for (HtmlTag.Block child : block.children()) {

            if (!child.isClosed()) {
                continue;
            }

            handler = configuration.htmlRenderer().tagHandler(child.name());
            if (handler != null) {
                handler.handle(configuration, builder, child);
            } else {
                visitChildren(configuration, builder, child);
            }
        }
    }
}