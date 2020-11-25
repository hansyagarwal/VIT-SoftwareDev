let  scor = 0;
let count = 0
let ballcount = 0;
let ball = document.querySelector("#ball").textContent;
document.querySelector("#hit").addEventListener("click",()=>{
    const s = Math.floor(Math.random() * 6) + 1;
    scor = scor + s;
    ball = ball - 1;
    document.querySelector("#ball").innerHTML = ball
    document.querySelector("#score").innerHTML = scor;
    document.querySelector("#caption").innerHTML = s;
    count++;
    if(count==6)
    {
        document.querySelector("#hit").disabled = true;
    }
})

