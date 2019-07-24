$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney();
//   decimal.maskMoney({allowNegative: true, thousands:'.', decimal:',', affixesStay: false});	
	
	var plain = $('.js-plain');
	plain.maskMoney({ precision:0});
	
    var bswitch = $('.js-status');
    bswitch.bootstrapSwitch();

	
})