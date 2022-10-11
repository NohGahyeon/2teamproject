const $topBtn = document.querySelector(".view_up");

$topBtn.onclick = () => {
    window.scrollTo({top:0, behavior: "smooth"});
}
