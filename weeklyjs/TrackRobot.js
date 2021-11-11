
function trackRobot(...args){
    var ret = [0, 0]
    args.forEach((arg, i)=>{
        if(i % 4 == 0) ret[1] += arg;
        if(i % 4 == 1) ret[0] += arg;
        if(i % 4 == 2) ret[1] -= arg;
        if(i % 4 == 3) ret[0] -= arg;
    })
    return ret; 
}

console.log(trackRobot(20, 30, 10, 40))
console.log(trackRobot())
console.log(trackRobot(-10, 20, 10))
console.log(trackRobot(-10, 20, 10, 5, 10, 55, 45))