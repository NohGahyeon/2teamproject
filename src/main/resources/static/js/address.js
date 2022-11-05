// document.querySelector(".address-button").onclick = () => {
//     new daum.Postcode({
//     oncomplete: function(data) {
//         console.log(data);
//     }
// }).open();
// }


class AddressApi {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new AddressApi();
        }

        return this.#instance;
    }

    #daumApi = null;
    constructor() {
        this.#daumApi = new daum.Postcode({
            oncomplete: function(data) {
                const addressZonecode = document.querySelector(".address-zonecode");
                const addressBasic = document.querySelector(".address-basic");

                addressZonecode.value = data.zonecode;
                addressBasic.value = data.address;
            } 
    });

}

    addAddressButtonEvent() {
        document.querySelector(".address-button").onclick = () => {
            this.#daumApi.open();
        }
    }
}

window.onload = () => {
    AddressApi.getInstance().addAddressButtonEvent();
    new Payment();
}