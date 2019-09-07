"use strict"
define("webclient/app",["exports","webclient/resolver","ember-load-initializers","webclient/config/environment"],function(e,t,i,n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var a=Ember.Application.extend({modulePrefix:n.default.modulePrefix,podModulePrefix:n.default.podModulePrefix,Resolver:t.default});(0,i.default)(a,n.default.modulePrefix)
var r=a
e.default=r}),define("webclient/helpers/app-version",["exports","webclient/config/environment","ember-cli-app-version/utils/regexp"],function(e,t,i){function n(e){var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{},a=t.default.APP.version,r=n.versionOnly||n.hideSha,l=n.shaOnly||n.hideVersion,o=null
return r&&(n.showExtended&&(o=a.match(i.versionExtendedRegExp)),o||(o=a.match(i.versionRegExp))),l&&(o=a.match(i.shaRegExp)),o?o[0]:a}Object.defineProperty(e,"__esModule",{value:!0}),e.appVersion=n,e.default=void 0
var a=Ember.Helper.helper(n)
e.default=a}),define("webclient/helpers/pluralize",["exports","ember-inflector/lib/helpers/pluralize"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var i=t.default
e.default=i}),define("webclient/helpers/singularize",["exports","ember-inflector/lib/helpers/singularize"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var i=t.default
e.default=i}),define("webclient/initializers/app-version",["exports","ember-cli-app-version/initializer-factory","webclient/config/environment"],function(e,t,i){var n,a
Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i.default.APP&&(n=i.default.APP.name,a=i.default.APP.version)
var r={name:"App Version",initialize:(0,t.default)(n,a)}
e.default=r}),define("webclient/initializers/container-debug-adapter",["exports","ember-resolver/resolvers/classic/container-debug-adapter"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var i={name:"container-debug-adapter",initialize:function(){var e=arguments[1]||arguments[0]
e.register("container-debug-adapter:main",t.default),e.inject("container-debug-adapter:main","namespace","application:main")}}
e.default=i}),define("webclient/initializers/ember-data",["exports","ember-data/setup-container","ember-data"],function(e,t,i){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var n={name:"ember-data",initialize:t.default}
e.default=n}),define("webclient/initializers/export-application-global",["exports","webclient/config/environment"],function(e,t){function i(){var e=arguments[1]||arguments[0]
if(!1!==t.default.exportApplicationGlobal){var i
if("undefined"!=typeof window)i=window
else if("undefined"!=typeof global)i=global
else{if("undefined"==typeof self)return
i=self}var n,a=t.default.exportApplicationGlobal
n="string"==typeof a?a:Ember.String.classify(t.default.modulePrefix),i[n]||(i[n]=e,e.reopen({willDestroy:function(){this._super.apply(this,arguments),delete i[n]}}))}}Object.defineProperty(e,"__esModule",{value:!0}),e.initialize=i,e.default=void 0
var n={name:"export-application-global",initialize:i}
e.default=n}),define("webclient/instance-initializers/ember-data",["exports","ember-data/initialize-store-service"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var i={name:"ember-data",initialize:t.default}
e.default=i}),define("webclient/resolver",["exports","ember-resolver"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var i=t.default
e.default=i}),define("webclient/router",["exports","webclient/config/environment"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var i=Ember.Router.extend({location:t.default.locationType,rootURL:t.default.rootURL})
i.map(function(){})
var n=i
e.default=n}),define("webclient/services/ajax",["exports","ember-ajax/services/ajax"],function(e,t){Object.defineProperty(e,"__esModule",{value:!0}),Object.defineProperty(e,"default",{enumerable:!0,get:function(){return t.default}})}),define("webclient/templates/application",["exports"],function(e){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0
var t=Ember.HTMLBars.template({id:"OtU8JDxP",block:'{"symbols":[],"statements":[[5,"welcome-page",[],[[],[]]],[0,"\\n"],[0,"\\n"],[1,[22,"outlet"],false]],"hasEval":false}',meta:{moduleName:"webclient/templates/application.hbs"}})
e.default=t}),define("webclient/config/environment",[],function(){try{var e="webclient/config/environment",t=document.querySelector('meta[name="'+e+'"]').getAttribute("content"),i={default:JSON.parse(decodeURIComponent(t))}
return Object.defineProperty(i,"__esModule",{value:!0}),i}catch(n){throw new Error('Could not read config from meta tag with name "'+e+'".')}}),runningTests||require("webclient/app").default.create({name:"webclient",version:"0.0.0"})
