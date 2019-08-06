var Brewer = Brewer || {};

Brewer.MaskMoney = (function(){
	
	function MaskMoney(){
		this.decimal = $('.js-decimal');
		this.plain = $('.js-plain');
	}
	
	MaskMoney.prototype.enable = function(){
		this.decimal.maskMoney({ decimal: ',' , thousands: '.' });
		this.plain.maskMoney({ precision: 0, thousands: '.' });
	}
	
	return MaskMoney;
}());

$(function(){
	var maskMoney = new Brewer.MaskMoney();
	maskMoney.enable();
	
});


// modo sem designer patter
//$(function() {
//	var decimal = $('.js-decimal');
//	decimal.maskMoney({ decimal: ',', thousands: '.' });
//	
//	var plain = $('.js-plain');
//	plain.maskMoney({ precision: 0, thousands: '.' });
//});