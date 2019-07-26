$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney({decimal: ',', thousands: ','});
//   decimal.maskMoney({allowNegative: true, thousands:'.', decimal:',', affixesStay: false});	
	
	var plain = $('.js-plain');
	plain.maskMoney({ precision:0, thousands: '.'});
	
    var bswitch = $('.js-status');
    bswitch.bootstrapSwitch();

	
})