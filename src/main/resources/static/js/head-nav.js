//h-top 버튼 클릭시 이동

const headerTopButton = document.querySelectorAll(".h_mn button");

headerTopButton[0].onclick = () => {
    location.href = "/account/login";
}

headerTopButton[1].onclick = () => {
    location.href = "/account/register";
}

headerTopButton[2].onclick = () => {
    location.href = "/mypage/cart";
}

headerTopButton[3].onclick = () => {
    location.href = "/mypage";
}

//nav 버튼 클릭시 이동

const categoryNavButton = document.querySelectorAll(".nav button");

categoryNavButton[0].onclick = () => {
    location.href = "/collections/outer";
}

categoryNavButton[1].onclick = () => {
    location.href = "/collections/top";
}

categoryNavButton[2].onclick = () => {
    location.href = "/collections/bottom";
}

categoryNavButton[3].onclick = () => {
    location.href = "/collections/headwear";
}

categoryNavButton[4].onclick = () => {
    location.href = "/collections/acc";
}

//스크롤 상단이동
const $topBtn = document.querySelector(".view_up");

$topBtn.onclick = () => {
    window.scrollTo({top:0, behavior: "smooth"});
}
