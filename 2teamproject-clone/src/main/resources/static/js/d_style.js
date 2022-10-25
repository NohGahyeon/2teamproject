const $topBtn = document.querySelector(".view_up");

$topBtn.onclick = () => {
    window.scrollTo({top:0, behavior: "smooth"});
}


const gomain = document.querySelector(".h_main a");

gomain.onclick = () => {
    location.href = "/main";
}