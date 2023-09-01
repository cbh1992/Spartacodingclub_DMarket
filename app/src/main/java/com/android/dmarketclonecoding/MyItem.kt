package com.android.dmarketclonecoding


class MyItem(val aIcon:Int, //이미지
             val aTitle:String, //제목
             val aSubscrib:String, //설명
             val aName:String, //이름
             val aPrice: Int, //가격
             val aRegion:String, //지역
             var aLikeCount:Int, //좋아요수
             var aReplyCount:Int, //리플수
             val aiLike:Boolean  //사용자의 좋아요 체크 여부
             ) {}