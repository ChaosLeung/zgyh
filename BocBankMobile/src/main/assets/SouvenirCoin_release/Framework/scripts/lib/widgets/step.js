/*! BUILD: 2016-12-19 */
define("StepWidget",["zepto","vewController"],function(a){a.extendCls({name:"账单缴付",panes:"",nav:"",el:null})}),define("StepPane",["zepto","viewController"],function(a,b){a.extendCls({hasNext:!0,hasPrev:!1,services:[],onNext:null,onPrev:null,onLoad:null,title:"账单信息查询",stepWidget:null,templeString:"",ejs:"",panename:"",view:null,setTitle:function(){},setContent:function(){},setTemplate:function(){},placeAt:function(){},load:function(){this.view=new a.extendCls(b,{id:this.panename+4095*Math.random()})({templateString:this.templateString,ejs:this.ejs,onPrev:this.onPrev,onNext:this.onNext,onLoadFinish:this.onLoad}),this.view.load(),this.active()},active:function(){}})});