package com.andrew.simpleandroidapp

object NuclearsData {
    private val nuclearNames = arrayOf(
        "Kashiwazaki-Kariwa Power Plant",
        "Kori Nuclear Power Plant",
        "Bruce Nuclear Power Plant",
        "Tianwan Nuclear Power Plant",
        "Zaporizhzhia Nuclear Power Plant",
        "Gravelines Nuclear Power Plant",
        "Palo Verde Nuclear Power Plant",
        "Rostov Nuclear Power Plant",
        "Forsmark Nuclear Power Plant",
        "Tihange Nuclear Power Plant")

    private val nuclearDetails = arrayOf(
        "The Kashiwazaki-Kariwa Nuclear Power Plant (柏崎刈羽原子力発電所, Kashiwazaki-Kariwa genshiryoku-hatsudensho, Kashiwazaki-Kariwa NPP) is a large, modern (housing the world's first advanced boiling water reactor or ABWR) nuclear power plant on a 4.2-square-kilometer (1,000-acre) site including land in the towns of Kashiwazaki and Kariwa in Niigata Prefecture, Japan, on the coast of the Sea of Japan, from where it gets cooling water. The plant is owned and operated by Tokyo Electric Power Company (TEPCO). It is the largest nuclear generating station in the world by net electrical power rating.",
        "The Kori Nuclear Power Plant (Korean: 고리원자력발전소, Hanja: 古里原子力發電所) is a South Korean nuclear power plant located in Kori, a suburban village in Busan. It is the world's largest fully operational nuclear generating station by total reactor count and the number of currently operational reactors since 2016, after it exceeded in nameplate capacity Canada's Bruce Nuclear Generating Station. It is owned and operated by Korea Hydro & Nuclear Power, a subsidiary of KEPCO. The first reactor began commercial operation in 1978 and operated until 2017 when it was decommissioned. Units 2, 3, and 4 started commercial operations in the 1980s. All reactors on site are pressurized water reactors.",
        "Bruce Nuclear Generating Station is a nuclear power station located on the eastern shore of Lake Huron in Ontario, Canada. It occupies 932 ha (2300 acres) of land. The facility derives its name from Bruce Township, the local municipality when the plant was constructed, now Kincardine due to amalgamation. With eight CANDU pressurized heavy-water reactors, it was the world's largest fully operational nuclear generating station by total reactor count and the number of currently operational reactors until 2016, when it was exceeded in nameplate capacity by South Korea's Kori Nuclear Power Plant.The station is the largest employer in Bruce County, with over 4000 workers.",
        "Tianwan Nuclear Power Plant is a nuclear power plant (NPP) in the city of Lianyungang in Jiangsu Province, China. It is located on the coast of the Yellow Sea approximately 30 kilometers east of Lianyungang proper. It is co-owned by Jiangsu Nuclear Power Corporation, a joint venture partially owned by the China National Nuclear Corporation (CNNC), and Atomstroyexport (ASE), the nuclear equipment exporter branch of the Russian nuclear corporation Rosatom.",
        "The Zaporizhzhia Nuclear Power Station (Ukrainian: Запорізька атомна електростанція, romanized: Zaporizʹka atomna elektrostantsiya) in southeastern Ukraine is the largest nuclear power plant in Europe and among the 10 largest in the world. It was built by the Soviet Union near the city of Enerhodar, on the southern shore of the Kakhovka Reservoir on the Dnieper river. It is operated by Energoatom, who operate Ukraine's three other nuclear power stations also.",
        "The Gravelines Nuclear Power Station is a nuclear power plant located near the commune of Gravelines in Nord, France, approximately 20 km (12 mi) from Dunkerque and Calais. It is the seventh largest nuclear power station in the world, and the largest in Western Europe. Its cooling water comes from the North Sea. The plant consists of 6 nuclear reactors of 900 MW each. In 2017 the plant produced 31.67 TWh of electric energy, 5.9% of French electricity production. Two reactors entered service in 1980, two in 1981, and two in 1985.",
        "The Palo Verde Generating Station is a nuclear power plant located near Tonopah, Arizona, in western Arizona. It is located about 45 miles (72 km) due west of downtown Phoenix, Arizona, and it is located near the Gila River, which is dry save for the rainy season in late summer.",
        "Rostov Nuclear Power Plant (Russian: Ростовская АЭС []), also known as Volgodonsk Nuclear Power Plant (Russian: Волгодонская АЭС []), is a Russian nuclear power plant located on the left bank of the Tsimlyansk reservoir in the lower stream of the Don River near Volgodonsk, Rostov Oblast. The post-Soviet Union revival of the nuclear industry of Russia took place at Rostov in the early 2000s, with the completion of the building of unit 2 in 2010, unit 3 in 2015 and unit 4 in 2017. Unit 4 was the last VVER-1000/V-320 reactor built.",
        "Forsmark Nuclear Power Plant is a nuclear power plant in Forsmark, Sweden, and also the site of the Swedish Final repository for radioactive operational waste. It is operated by a company mainly owned by Vattenfall. The radiation monitors at Forsmark were the first outside the Soviet Union to detect the elevated radiation levels resulting from the Chernobyl disaster in April 1986, over 1,000 km away, forcing the Soviet government to publicly acknowledge it after two days of them trying to cover it up.",
        "The Tihange Nuclear Power Station is one of two nuclear energy production sites in Belgium and contains 3 nuclear power plants. The site is located on the bank of the Meuse river, near the village of Tihange in the Walloon province of Liège. The station is operated and majority-owned by vertically-integrated Belgian energy corporation Electrabel. EDF Luminus has a 50% stake in the oldest unit and a 10% stake in the two newest units. It employs 1074 workers and covers an area of 75 hectares (190 acres). The plant represents about 15% of Belgium's total electricity production capacity. Nuclear energy typically provides half of Belgium's domestically-generated electricity and is the country's lowest-cost source of power.")

    private val nuclearsImages = intArrayOf(
        R.drawable.kashiwazaki_kariwa,
        R.drawable.kori,
        R.drawable.bruce,
        R.drawable.tianwan,
        R.drawable.zaporizhzhia,
        R.drawable.gravelines,
        R.drawable.palo_verde,
        R.drawable.rostov,
        R.drawable.forsmark,
        R.drawable.tihange)

    val listData: ArrayList<Nuclear>
        get() {
            val list = arrayListOf<Nuclear>()
            for (position in nuclearNames.indices) {
                val nuclear = Nuclear()
                nuclear.name = nuclearNames[position]
                nuclear.detail = nuclearDetails[position]
                nuclear.photo = nuclearsImages[position]
                list.add(nuclear)
            }
            return list
        }
}
