package com.arm07.android.bbvachallenge.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class JsonResponse {
    /**
     * html_attributions : []
     * next_page_token : CqQCHwEAAOUGGuvOkjq5ILYoIisxRqHQcexUBk7kil11Xq-iKAIq_xaCwMHLS20Mxr07J198J10IviODhNqzCR7IJ3DeqxjucP5RTl71KXMqqFxTdWqCLKOi3vJ59VYk15wFjo8pnHDr0U-TY8abwEOVgy1hXpPxeSW98zMJa8J5bQAsTl5MmHr8Lrtq7ViuKVTtx_1qrkKRN3L6kfpfqRswB3G6kQfoH97NQgjKNf3Dwb5aZxewrIzbTBgYhMguOcqzCmJ5RC_ihazEmxNtec0UfjzZCaofVt87972X2bgB0aYV7zZtjn2wzwW7RXgWWQ2sKhXepqVvhfbYTViHCGtorvAQ072k4jRwraoeJaVePGDe97o-DEJLM2LrEcOUROntWhjfahIQsZz-KA7hqD4Om6g5_UsClRoUMyNLmbi1t_ZVN3ojFH9Kkl06sJw
     * results : [{"formatted_address":"311 S Wacker Dr #2590, Chicago, IL 60606, United States","geometry":{"location":{"lat":41.877458,"lng":-87.63596299999999},"viewport":{"northeast":{"lat":41.8788006802915,"lng":-87.63495641970849},"southwest":{"lat":41.8761027197085,"lng":-87.6376543802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"6db3ed9177927a6350fe5f7ad0685ea2c9094bb8","name":"BBVA Compass Loan Production Office (LPO)","place_id":"ChIJ2flErb8sDogRVHcsQoP_Scg","reference":"CmRSAAAAA8WfLFsIibjoGHamoktN5EqQ9WldUEF5-5l0Ney62lcoqgLNw3mTUURSJVJflbU0cK0h_s07aFnzYpbNoD2gccyuM_gjxWg-6-j_-hrB86T9Z3d7qE4ks2XTrF7VI8qmEhDACiYWBb9Lpaw8w_aWD5cfGhTA5YW1J4vtuneFL-JCggkH16n1tA","types":["finance","point_of_interest","establishment"]},{"formatted_address":"2215 80th St, Kenosha, WI 53143, United States","geometry":{"location":{"lat":42.5571574,"lng":-87.8361534},"viewport":{"northeast":{"lat":42.55935204999999,"lng":-87.83479011970849},"southwest":{"lat":42.55642585,"lng":-87.8374880802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"93b0de67c4af48e521dc6bf8d0d1c8b5f103bf39","name":"BBVA Compass","place_id":"ChIJoW5uncdfBYgR2hilxrtJjZQ","reference":"CmRSAAAAnqE4yFsS8JvJ8uqM-NRCdhNoZYjr1IsBz-zP9OMrTIPj_91p90Hc9lzkqbxInpNRONKVslF_kz3_ouszML4A8V6I8xPdRt8V65Q-wGJ-uYsLjVUwjiqs1CPalj9erDSBEhCa7RhUAXubHx1St2vLZfnfGhTCaAJRN3InE-nqjFQfNDckeiDSGw","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"5111 Douglas Ave, Racine, WI 53402, United States","geometry":{"location":{"lat":42.7858457,"lng":-87.80718279999999},"viewport":{"northeast":{"lat":42.7869127802915,"lng":-87.80607859999998},"southwest":{"lat":42.7842148197085,"lng":-87.8104954}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"56679a926ad1ef97b38b309ba7b5d363289b9c9f","name":"BBVA Compass","place_id":"ChIJbzB2HQ1BBYgR1EpVpgWirSc","reference":"CmRRAAAAQJQHUycNyb8YaXqgHrIOf0YcoUxZsD91HgJZot-eTms31jehUUbUNHYH4u-LJa2PiJUiGi0pUwF0xJ9dreyYBT__OBdzR79bm2R27LKjaLjj4sk0JI087hl-qtQ-45uvEhAuIK4dwtbeS3lPOwX3MS-kGhQFRTNbmbAAhBphOYPf-6xyYtsVVw","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"2801 14th Pl, Kenosha, WI 53140, United States","geometry":{"location":{"lat":42.6304929,"lng":-87.8440315},"viewport":{"northeast":{"lat":42.6318418802915,"lng":-87.8426825197085},"southwest":{"lat":42.6291439197085,"lng":-87.84538048029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"849940cf33d50e6a6821a5882a068e55b3aa681c","name":"BBVA Compass","place_id":"ChIJheFW9JJdBYgRLS5aIlc31SQ","reference":"CmRRAAAABjXzi9o_G0crMyQ2NaYrjHTPnUCcINiqxM4PvCXL_C3ribLD1liptBAD0b-i7ZdfjjCOgYPGN2DmsnzQMLmwRcXaJc_1hscxHUYHzV0IYaTn5QOMGwiByBpZJ8g5A7eoEhBD3XbM9tuRDyZBrdMrAbg6GhRechg0c4u-q3u8u8MclMowXpnNJA","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"2201 E Rawson Ave, Oak Creek, WI 53154, United States","geometry":{"location":{"lat":42.91452,"lng":-87.883624},"viewport":{"northeast":{"lat":42.9162717302915,"lng":-87.8822813197085},"southwest":{"lat":42.91357376970851,"lng":-87.8849792802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"b6f6a95e673d177bd98c261073d4cebf4d23b2eb","name":"BBVA Compass","place_id":"ChIJpXlUXNoVBYgRxDcdKUgXlvs","reference":"CmRSAAAAQAAVBuz5FFvffA0wNPE1fTgHE04PosMVPoPPixjeGNVlfCdiGua5xMdYxAG42usOgGcGJt00wrTg2udWIo8c05VlLGHtEOvUbA6KrL7FLwvIknqIGCrZjMD1KAUxINf2EhBUgDDDXIuYusifHZL46oGDGhSg4RJWQxMmWrP4fQufVuFjjHJHHw","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"161 W Wisconsin Ave #54, Milwaukee, WI 53203, United States","geometry":{"location":{"lat":43.0383653,"lng":-87.9121076},"viewport":{"northeast":{"lat":43.0399193302915,"lng":-87.9107564697085},"southwest":{"lat":43.0372213697085,"lng":-87.91345443029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"a1115e802044efb5eb33218e8adb0580c0bb3e5b","name":"BBVA Compass","place_id":"ChIJER2reqAZBYgRnW1H2AIFz30","reference":"CmRRAAAAe2nsrDjelpGYfIprXuGDvHkbNEgBOtH1TgZ8SNnwEEymz_J9rd2r4sQ_GMc3UOe1z-BxA4XzEMRLCoOT3Ep-3MzMIeFbOZxguKt1SeuliZpRF5sBWfG8j-G6x1_MUqaHEhDZDjXYacbR1TwqWj5rAPdiGhSB-USZysUbGMg3qOCBBs-FY_oxRw","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"524 S Layton Blvd, Milwaukee, WI 53215, United States","geometry":{"location":{"lat":43.0261557,"lng":-87.9463935},"viewport":{"northeast":{"lat":43.0274986302915,"lng":-87.9457045697085},"southwest":{"lat":43.0248006697085,"lng":-87.9484025302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"19e657de896232ff19db1b376f7265aeadc2aaf4","name":"BBVA Compass","place_id":"ChIJM3djkDsaBYgR2bwd1iiQlL4","reference":"CmRSAAAATFwVeEqYmzhZWcUN8DbIVvhn6BdRlvsRTlmT4ZVfajq8I6n1kI2j1bFFF0FCR0bLKKcJL0D_BBNNWNgOHLk3HQRisG4S_F5YUnYMIOkYWtCvhIHmJS-2SpZhZ_CPEFqCEhB36ZQHcRSEBwZeHV4f1Y9iGhR0Crx3uP1SiRsw4RtnC8z0X618WQ","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"501 West Northshore Drive, Glendale, WI 53217, United States","geometry":{"location":{"lat":43.1203356,"lng":-87.9154598},"viewport":{"northeast":{"lat":43.1216399302915,"lng":-87.91411811970849},"southwest":{"lat":43.1189419697085,"lng":-87.91681608029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"d61599e6ca4d724db771b4ba6069f247280c5f7c","name":"BBVA Compass","opening_hours":{"open_now":true,"weekday_text":[]},"place_id":"ChIJ3UyN7mAeBYgRsfTNnEEWYCU","reference":"CmRRAAAAFAJcGASRk6BuA4crNcq9Smn-ldEWJqtd9NTfwlZ0OId1o3N-MfEBi1xH_Gh4bTaBJ9L6NCaQ9AA5rXEWo1jPILTpnmD6Hb20AeZANZEYq0Poewp5Nmabysqj32uYoF_wEhCnsSC5n97h1oWUHudO2m0UGhQrktPMVpXaVtKIpMDHcyjMQ8QxAw","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"6700 W State St, Wauwatosa, WI 53213, United States","geometry":{"location":{"lat":43.04644500000001,"lng":-87.99565299999999},"viewport":{"northeast":{"lat":43.0474236302915,"lng":-87.99452521970849},"southwest":{"lat":43.04472566970851,"lng":-87.99722318029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"92ca02045fc456aae296e9971bf7579455e080bd","name":"BBVA Compass","place_id":"ChIJeWAq4CMbBYgR717MKrZq96k","reference":"CmRSAAAARUQYbi6BpTUT2WIBN4_e26-Q2Apcu99BfKP-MKAlJaPJBDEA2rrNuy0B7Hhb8HZNID_xErmeUiDe0ppGJbpjYpbW_ZDTfw26M0ifaYeUWHMHHpxDWJaKOLtH4glG6ow3EhArovkOZLd4qSm7NuEMjc4GGhQPf1HdDzFRfv_5bGGpHoKSrG88iw","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"8340 W Appleton Ave, Milwaukee, WI 53218, United States","geometry":{"location":{"lat":43.1061049,"lng":-88.01665349999999},"viewport":{"northeast":{"lat":43.1073208302915,"lng":-88.0155002197085},"southwest":{"lat":43.1046228697085,"lng":-88.0181981802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"5a145db033645dab561ecee9050020dda4a4d194","name":"BBVA Compass","place_id":"ChIJ8dhJwjMDBYgRbMV37srg4dE","reference":"CmRSAAAA4ywTyrMEZL3Ga0KXcr03KOD9NTplrlB4uCL5VetgNmV8nExPZmjTLeXWlneOAZ7UBYaDlO-YtVeqXUaYtfJ3q0IBke85EmESjNByvp_gDXvbLCJ1Mted0lUSNRmT4oleEhD79SIs0tP1RS3EZXK9zNZcGhR4H4dh5FKfYvEh_k3TVYSHDE2LPQ","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"3711 S Taylor Dr, Sheboygan, WI 53081, United States","geometry":{"location":{"lat":43.71496,"lng":-87.75447},"viewport":{"northeast":{"lat":43.71630898029149,"lng":-87.7531210197085},"southwest":{"lat":43.7136110197085,"lng":-87.75581898029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"f340dde8ca8f7ecbd1342ca47cc7088e96a492b7","name":"BBVA Compass","place_id":"ChIJF__3h8GmBIgRJSUU9lB6SYQ","reference":"CmRSAAAAqCLMTKpJBAerZCWJ4alwaIiD9OtA21ldrAVYy9_Xwv0QqOOMhQgHPMh3eoV1Q2tun9x-O6uyJKpdWiXXA6mpNleTFm6nEtbj1rVE6dI5FsKeuLKBbWNZlusRwbx4qjlPEhBTJqce8A5rfQW7YDamNONAGhSPmTrLIxGjPZ81qmDRn5rjdQzggg","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1901 Milwaukee Ave, Burlington, WI 53105, United States","geometry":{"location":{"lat":42.7034715,"lng":-88.25409450000001},"viewport":{"northeast":{"lat":42.7048204802915,"lng":-88.2527455197085},"southwest":{"lat":42.7021225197085,"lng":-88.2554434802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"134b5e936b9ea503c96e0155687ba2a4259fef60","name":"BBVA Compass","place_id":"ChIJH3Ms-FCbBYgRBzvoHBtzbc8","reference":"CmRSAAAAdgls7nGEcxtRJZbXUaKW4_Wjsy-NsTQ74Nq5eYQibpQfMveT8nQBX9i-vLNYskP-pqEBCfBoOg6SvQljwOkZtlP1oJychaMbZBLb1kU5lMMDUmn9y8aIWni84ANRINdKEhABN4dpQHIBtefY5-xOv7y5GhSrNV_-q1Gup3K3Co6tIRrZ1pcRrA","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1234 WI-175, Hubertus, WI 53033, United States","geometry":{"location":{"lat":43.2343152,"lng":-88.18388809999999},"viewport":{"northeast":{"lat":43.2354990302915,"lng":-88.18315199999998},"southwest":{"lat":43.2328010697085,"lng":-88.18609640000001}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"04ef4efe326f8ed19b838f4d30d3a4265b3a5985","name":"BBVA Compass","place_id":"ChIJhzykKeFVBIgREp8AtWapYK8","reference":"CmRSAAAAqSDGHDttCPehFiMQeWw5uQrJG4hl17vUpz9lCu50lc08fmfVE5mFKDjhR4LIVepF-Wj0uafy1Ndz_mnImK2BINJ7dcAyENNsacR85h3suHH8R_qkuoH8udVaCiVAMAl3EhBSGBeKr73Rxag9lKlpA_pNGhQXhBYMCjkyJ02iPTLY_uHmO6SF3A","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"201 Edwards Blvd, Lake Geneva, WI 53147, United States","geometry":{"location":{"lat":42.5911729,"lng":-88.41167879999999},"viewport":{"northeast":{"lat":42.59252478029149,"lng":-88.41048199999999},"southwest":{"lat":42.5898268197085,"lng":-88.4152692}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"1674651ad4e5fdaf6af62a626630d2249dfb6b03","name":"BBVA Compass","place_id":"ChIJ4dg8HsWLBYgRY-ArGkY7t5U","reference":"CmRSAAAA4wBLaYglDKaYCK0JSsAM6p1ZXOwCP_V-CDCmOZPkqwi7VX8jtAT0nLVCmkZ1-RJ1iMleWBy1QL7vItBskYViaj1c3Ou3ZUKGhIsE7iZMIWhSm3L3eQgzYUOur1hZ68wwEhBONpDBe-l5MyUkp7HmtPaTGhR0ZVUQ2hDstkfEpb43xRxnKZr9IA","types":["atm","finance","point_of_interest","establishment"]},{"formatted_address":"1100 E Commerce Blvd, Slinger, WI 53086, United States","geometry":{"location":{"lat":43.32535110000001,"lng":-88.2642884},"viewport":{"northeast":{"lat":43.32670008029151,"lng":-88.26293941970849},"southwest":{"lat":43.32400211970851,"lng":-88.2656373802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"2bb9fcbefe3e592b4402d521af701bce32eaf65c","name":"BBVA Compass","place_id":"ChIJQ-q-Zw1aBIgR5KSUtjiPm3c","reference":"CmRRAAAAvI5Qs9Qt2H6OVC4zJZ1zPOjApHrZ2dw2fjRH9rVGqjWnf82Iu_p9v64c63hyTjpIBb_ep-KSG08-1M9C47KMcCvtOf6HMgxFOj5LcVF-C3jGdVa84DCP1O9Qr9QSrkWLEhCz6O41XunkqpGW2Mmt7lqfGhS0jf0BdY4-Hgesy1CpfjtXRdSGpQ","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1819 E Geneva St, Delavan, WI 53115, United States","geometry":{"location":{"lat":42.6306385,"lng":-88.6126699},"viewport":{"northeast":{"lat":42.6319874802915,"lng":-88.61132091970849},"southwest":{"lat":42.6292895197085,"lng":-88.6140188802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"6ef78c5b01baeea8e6462be20195e41ce5948fdb","name":"BBVA Compass","place_id":"ChIJqX-wbcjwBYgR2I5zYUIJXyI","reference":"CmRRAAAADAR_WlDSAQKQEkOuVItCaJlsa14PmEM9FQV3_pR4EXKw_kx-thIWz2yz9SDctlF2xg4rzzR62GUVddqKReGKB1MPd9l-EkYfeE6VVKWVuZ2FyZa7jONBpfsZ3WIlF17wEhCvGA5h3dcRTLVLoahFuuvFGhQDkL_YqSCyfIq8zUTuKvgMGEaTDw","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"250 W Pratt St #1350, Baltimore, MD 21201, United States","geometry":{"location":{"lat":39.286703,"lng":-76.61878109999999},"viewport":{"northeast":{"lat":39.2878666302915,"lng":-76.61742336970849},"southwest":{"lat":39.2851686697085,"lng":-76.62012133029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"3cace19a36d4ae2fc08fdf851f659b5a9da02077","name":"BBVA Compass Loan Production Office (LPO)","place_id":"ChIJ-b4Z218DyIkRQ425_LgQSMk","reference":"CmRSAAAAzf4yYn18r1B1ikA21QsUr9W2_7Abg_RiiJbWZbTjcvGo1S1FmepemgJlKVLNCihA7n7Oe2xpgdzIx1xGW3-TPUCZN-aK9LvFZYuUNyegftX27nBGDwQ-mwBNCA7rOZwUEhAteU-Ik4Q7Kxrq3y1W1_pNGhTdRiu8dpHfbspij1m24WfOOSV5TA","types":["finance","point_of_interest","establishment"]},{"formatted_address":"Fifth Third Center, 424 Church St #2000, Nashville, TN 37219, United States","geometry":{"location":{"lat":36.16373180000001,"lng":-86.7801247},"viewport":{"northeast":{"lat":36.1648702802915,"lng":-86.7786466197085},"southwest":{"lat":36.16217231970851,"lng":-86.7813445802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"79467be5401e2faa33b99a1cc752447ea4ffb47e","name":"BBVA Compass Loan Production Office (LPO)","place_id":"ChIJmZ0gRVhmZIgRt90sUYDRiL4","rating":1,"reference":"CmRSAAAAqWJyJtg2xOoSRc03USyHl-ADtLGVEwOq4gBcKexlOJlonhzVVAVVjQrT_NCA4NI_3sUljmtp2pov8XmF0pvsb647J_E6z3UqzFbl2E4CCwknAmQ7dZC5F3YbeLzUU2JPEhDtYcndX2-bZT_akcDrF7WzGhQWppxFR751RQueKlj0JuRIlUTM-A","types":["finance","point_of_interest","establishment"]},{"formatted_address":"4350 Lassiter at North Hills Ave #350, Raleigh, NC 27609, United States","geometry":{"location":{"lat":35.8380102,"lng":-78.6431106},"viewport":{"northeast":{"lat":35.8392114802915,"lng":-78.64189736970849},"southwest":{"lat":35.8365135197085,"lng":-78.64459533029151}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"3073df7edb1b294103f0fa15abdaee7e13307f98","name":"BBVA Compass Loan Production Office (LPO)","place_id":"ChIJwX7a0JBYrIkRz574qjNYk2I","rating":5,"reference":"CmRRAAAAfHqAlE0Mvz_mpVHBtN-fchAL0I1btOb9PHagoIyQA0QuZ9ho8ShpYC2XVXE9hom03-MTLrso4wynobydfjzXaEmbdAmjB7AU8VNnB3M0TaCSwHaynHyRzM0CogM85-H4EhD7J1oFKjNY6hZHalJ5eR6kGhQJ6jCVodBuQL8toJt_MoAxlZBd6g","types":["finance","point_of_interest","establishment"]},{"formatted_address":"300 N Beaty St, Athens, AL 35611, United States","geometry":{"location":{"lat":34.806763,"lng":-86.9645547},"viewport":{"northeast":{"lat":34.80811198029149,"lng":-86.9632057197085},"southwest":{"lat":34.8054140197085,"lng":-86.9659036802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/atm-71.png","id":"a01109d6964495638a2f35cbde589421920fb36f","name":"BBVA Compass ATM","place_id":"ChIJAUBY50CLYogRwGC9zZ3pvkE","reference":"CmRRAAAA7L6_eG_xXdehXb8SChOtbYSWggZOrE2x2YSKOgPpn2VAINeGLoZaQ9OtJoVhIKln3RvcaxnYQMQS_tA0rgib71rg6f_xQPm8vLBtw9Uo_IdgyOgLvpu7hIWgriSzmyN_EhC50hOuZWbN7VOs17BSYkHSGhTlTLu5v_qCRg5LbNI5ReyM6nWKYg","types":["atm","finance","point_of_interest","establishment"]}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Parcelable {
        /**
         * formatted_address : 311 S Wacker Dr #2590, Chicago, IL 60606, United States
         * geometry : {"location":{"lat":41.877458,"lng":-87.63596299999999},"viewport":{"northeast":{"lat":41.8788006802915,"lng":-87.63495641970849},"southwest":{"lat":41.8761027197085,"lng":-87.6376543802915}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png
         * id : 6db3ed9177927a6350fe5f7ad0685ea2c9094bb8
         * name : BBVA Compass Loan Production Office (LPO)
         * place_id : ChIJ2flErb8sDogRVHcsQoP_Scg
         * reference : CmRSAAAAA8WfLFsIibjoGHamoktN5EqQ9WldUEF5-5l0Ney62lcoqgLNw3mTUURSJVJflbU0cK0h_s07aFnzYpbNoD2gccyuM_gjxWg-6-j_-hrB86T9Z3d7qE4ks2XTrF7VI8qmEhDACiYWBb9Lpaw8w_aWD5cfGhTA5YW1J4vtuneFL-JCggkH16n1tA
         * types : ["finance","point_of_interest","establishment"]
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * rating : 1
         */

        private String formatted_address;
        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private String place_id;
        private String reference;
        private OpeningHoursBean opening_hours;
        private int rating;
        private List<String> types;

        protected ResultsBean(Parcel in) {
            formatted_address = in.readString();
            icon = in.readString();
            id = in.readString();
            name = in.readString();
            place_id = in.readString();
            reference = in.readString();
            rating = in.readInt();
            types = in.createStringArrayList();
            //       geometry = in.readParcelable(GeometryBean.class.getClassLoader());
        }

        public static final Creator<ResultsBean> CREATOR = new Creator<ResultsBean>() {
            @Override
            public ResultsBean createFromParcel(Parcel in) {
                return new ResultsBean(in);
            }

            @Override
            public ResultsBean[] newArray(int size) {
                return new ResultsBean[size];
            }
        };

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(formatted_address);
            parcel.writeString(icon);
            parcel.writeString(id);
            parcel.writeString(name);
            parcel.writeString(place_id);
            parcel.writeString(reference);
            parcel.writeStringList(types);
            parcel.writeParcelable(geometry,i);
        }

        public static class GeometryBean implements Parcelable {
            /**
             * location : {"lat":41.877458,"lng":-87.63596299999999}
             * viewport : {"northeast":{"lat":41.8788006802915,"lng":-87.63495641970849},"southwest":{"lat":41.8761027197085,"lng":-87.6376543802915}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            protected GeometryBean(Parcel in) {
                //     location = in.readParcelable(LocationBean.class.getClassLoader());
            }

            public static final Creator<GeometryBean> CREATOR = new Creator<GeometryBean>() {
                @Override
                public GeometryBean createFromParcel(Parcel in) {
                    return new GeometryBean(in);
                }

                @Override
                public GeometryBean[] newArray(int size) {
                    return new GeometryBean[size];
                }
            };

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(location,i);
            }

            public static class LocationBean implements Parcelable{
                /**
                 * lat : 41.877458
                 * lng : -87.63596299999999
                 */

                private double lat;
                private double lng;

                protected LocationBean(Parcel in) {
                    lat = in.readDouble();
                    lng = in.readDouble();
                }

                public static final Creator<LocationBean> CREATOR = new Creator<LocationBean>() {
                    @Override
                    public LocationBean createFromParcel(Parcel in) {
                        return new LocationBean(in);
                    }

                    @Override
                    public LocationBean[] newArray(int size) {
                        return new LocationBean[size];
                    }
                };

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeDouble(lat);
                    parcel.writeDouble(lng);
                }
            }

            public static class ViewportBean {
                /**
                 * northeast : {"lat":41.8788006802915,"lng":-87.63495641970849}
                 * southwest : {"lat":41.8761027197085,"lng":-87.6376543802915}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    /**
                     * lat : 41.8788006802915
                     * lng : -87.63495641970849
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    /**
                     * lat : 41.8761027197085
                     * lng : -87.6376543802915
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }
    }
}
