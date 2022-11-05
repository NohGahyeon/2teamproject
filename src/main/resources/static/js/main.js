
//more 버튼 클릭시 각 카테고리 페이지로 이동

const moreProductButton = document.querySelectorAll(".more");

moreProductButton[0].onclick = () => {
    location.href = "/collections/outer";
}

moreProductButton[1].onclick = () => {
    location.href = "/collections/top";
}

moreProductButton[2].onclick = () => {
    location.href = "/collections/bottom";
}

moreProductButton[3].onclick = () => {
    location.href = "/collections/headwear";
}

moreProductButton[4].onclick = () => {
    location.href = "/collections/acc";
}

//상품 선택시 디테일페이지 불러오기 



//메인 슬라이드
let slideIndex = 0;
showSlides();

function showSlides(){
    let i;
    let slides = document.getElementsByClassName("mySlides");
    for( i=0 ; i<slides.length ; i++){
        slides[i].style.display = "none";
    }
    slideIndex++;
    if(slideIndex > slides.length ) {
        slideIndex=1
    }
    slides[slideIndex-1].style.display = "block";
    setTimeout(showSlides,4000);

}

