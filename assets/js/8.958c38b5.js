(window.webpackJsonp=window.webpackJsonp||[]).push([[8],{87:function(t,a,e){"use strict";e.r(a);var r={name:"MavenBadge",props:["artifact"],methods:{mavenSearchUrl:function(){return"http://search.maven.org/#search|ga|1|g%3A%22ru.noties%22%20AND%20a%3A%22"+this.artifact+"%22"},shieldImgageUrl:function(){return"https://img.shields.io/maven-central/v/ru.noties/"+this.artifact+".svg?label="+this.artifact}}},s=e(0),i=Object(s.a)(r,function(){var t=this.$createElement,a=this._self._c||t;return a("a",{attrs:{href:this.mavenSearchUrl()}},[a("img",{attrs:{src:this.shieldImgageUrl(),alt:""+this.artifact}})])},[],!1,null,null,null);i.options.__file="MavenBadge.vue";a.default=i.exports}}]);