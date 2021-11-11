function vendingMachine(products, money, productIndex){

    var coins = [500, 200, 100, 50, 20, 10];
    var change = [];

    if(products[productIndex] == undefined) return "Enter a valid product number";
    if(products[productIndex][1] > money) return "Not enough money for this product";

    money -= products[productIndex][1];

    coins.forEach(element => {
        while(element <= money){
            change.push(element);
            money -= element;
        }
    });

    return {
        product: products[productIndex][0],
        change: change
    }

}

var products = [["Crackers", 250], ["Twizzlers", 150], ["Cookies", 300]]

console.log(vendingMachine(products, 50, 0));
console.log(vendingMachine(products, 50, 10));
console.log(vendingMachine(products, 550, 0));
console.log(vendingMachine(products, 200, 1));
console.log(vendingMachine(products, 1000, 2));
console.log(vendingMachine(products, 300, 2));
