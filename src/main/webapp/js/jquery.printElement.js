/*! jQuery Printelement - v2.0.0 - 2012-04-19
 * https://github.com/erikzaadi/jQuery.printElement
 * Copyright (c) 2012 erikzaadi; Licensed MIT, GPL */
(function(a,b){function e(b,e){var g=i(b,e),h=null,j=null;if(e.printMode.toLowerCase()==="popup")h=a.open("about:blank","printElementWindow","width=650,height=440,scrollbars=yes"),j=h.document;else{var k="printElement_"+Math.round(Math.random()*99999).toString(),l=c.createElement("IFRAME");d(l).attr({style:e.iframeElementOptions.styleToAdd,id:k,className:e.iframeElementOptions.classNameToAdd,frameBorder:0,scrolling:"no",src:"about:blank"}),c.body.appendChild(l),j=l.contentWindow||l.contentDocument,j.document&&(j=j.document),l=c.frames?c.frames[k]:c.getElementById(k),h=l.contentWindow||l}focus(),j.open(),j.write(g),j.close(),f(h)}function f(a){a&&a.printPage?a.printPage():setTimeout(function(){f(a)},50)}function g(a){var b=d(a);d(":checked",b).each(function(){this.setAttribute("checked","checked")}),d("input[type='text']",b).each(function(){this.setAttribute("value",d(this).val())}),d("select",b).each(function(){var a=d(this);d("option",a).each(function(){a.val()===d(this).val()&&this.setAttribute("selected","selected")})}),d("textarea",b).each(function(){var a=d(this).attr("value");d.browser.mozilla&&this.firstChild?this.firstChild.textContent=a:this.innerHTML=a});var c=d("<div></div>").append(b.clone()).html();return c}function h(){var b=a.location.port?":"+a.location.port:"";return a.location.protocol+"//"+a.location.hostname+b+a.location.pathname}function i(a,b){var e=d(a),f=g(a),i=[];i.push("<html><head><title>"+b.pageTitle+"</title>");if(b.overrideElementCSS){if(b.overrideElementCSS.length>0)for(var j=0;j<b.overrideElementCSS.length;j++){var k=b.overrideElementCSS[j];typeof k=="string"?i.push('<link type="text/css" rel="stylesheet" href="'+k+'" >'):i.push('<link type="text/css" rel="stylesheet" href="'+k.href+'" media="'+k.media+'" >')}}else d("link",c).filter(function(){return d(this).attr("rel").toLowerCase()==="stylesheet"}).each(function(){i.push('<link type="text/css" rel="stylesheet" href="'+d(this).attr("href")+'" media="'+d(this).attr("media")+'" >')});return i.push('<base href="'+h()+'" />'),i.push('</head><body style="'+b.printBodyOptions.styleToAdd+'" class="'+b.printBodyOptions.classNameToAdd+'">'),i.push('<div class="'+e.attr("class")+'">'+f+"</div>"),i.push('<script type="text/javascript">function printPage(){focus();print();'+(!d.browser.opera&&!b.leaveOpen&&b.printMode.toLowerCase()==="popup"?"close();":"")+"}</script>"),i.push("</body></html>"),i.join("")}var c=a.document,d=a.jQuery;d.fn.printElement=function(a){var b=d.extend({},d.fn.printElement.defaults,a);return b.printMode==="iframe"&&(d.browser.opera||/chrome/.test(navigator.userAgent.toLowerCase()))&&(b.printMode="popup"),d("[id^='printElement_']").remove(),this.each(function(){var a=d.meta?d.extend({},b,d(this).data()):b;e(d(this),a)})},d.fn.printElement.defaults={printMode:"iframe",pageTitle:"",overrideElementCSS:null,printBodyOptions:{styleToAdd:"padding:10px;margin:10px;",classNameToAdd:""},leaveOpen:!1,iframeElementOptions:{styleToAdd:"border:none;position:absolute;width:0px;height:0px;bottom:0px;left:0px;",classNameToAdd:""}},d.fn.printElement.cssElement={href:"",media:""}})(window);