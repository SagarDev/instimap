package com.mrane.data;

import java.util.HashMap;

import android.content.Context;

public class Locations {
	public HashMap<String, Marker> data = new HashMap<String, Marker>();

	public Locations(Context context) {
		Marker m0 = new Room("Advanced Centre for Research in Electronics",
				"ACRE", 4081, 1344, 1, "NanoTech. & Science Research Centre",
				"Inside", "");
		data.put(m0.name, m0);
		Marker m1 = new Building(
				"Aerospace Engineering Department",
				"Aero engg",
				4153,
				2249,
				1,
				new String[] { "Centre for Aerospace Systems Design and Engineering" },
				"http://www.aero.iitb.ac.in/\nPhone No.: +912225767101 / +9122 25767102\nFax No.: +91-22 2572 2602.\nEmail: office@aero.iitb.ac.in \nThe department offers academic programs for B. Tech, M. Tech, Ph. D. Specialization are offered: Aerodynamics, Control and Guidance, Propulsion, Structures, and Systems Engineering");
		data.put(m1.name, m1);
		Marker m2 = new Marker("B 22 Ananta ", "0", 4695, 925, 3,
				"Flat nos. 147-206");
		data.put(m2.name, m2);
		Marker m3 = new Marker("B 23 Aravali ", "0", 4404, 968, 3,
				"Flat nos. 207-267");
		data.put(m3.name, m3);
		Marker m4 = new Room("ATM - Canara Bank near Gulmohar", "Canara ATM",
				2989, 2154, 6, "Canara Bank", "First floor", "");
		data.put(m4.name, m4);
		Marker m5 = new Room("ATM - Canara Bank near H6", "Canara ATM", 2500,
				748, 6, "Hostel 06 Vikings", "Near", "");
		data.put(m5.name, m5);
		Marker m6 = new Room("ATM - State Bank near Tansa", "SBI ATM", 3028,
				989, 6, "Tansa House King of campus (Proj. Staff Boys)",
				"Near", "");
		data.put(m6.name, m6);
		Marker m7 = new Marker("Jayantia B-19", "0", 1413, 2885, 3, "");
		data.put(m7.name, m7);
		Marker m8 = new Room("Badminton Court", "0", 3480, 1081, 8,
				"Indoor Stadium", "Inside", "");
		data.put(m8.name, m8);
		Marker m9 = new Room(
				"Bio-diesel Lab",
				"0",
				4220,
				1558,
				12,
				"Treelabs",
				"Backside",
				"www.che.iitb.ac.in/chea/biosynth/be-a-part.php\ncontact@biosynthiitb.org\nProject Biosynth is an initiative by the students of the Department of Chemical Engineering, IIT Bombay to install a Biodiesel plant. This student-managed initiative was started in 2008. The R & D activities at the plant include:\nthe adaptation of the standard biodiesel production process to the available waste vegetable oil, the quality control for the biodiesel produced, allied issues pertaining to design and planning and research projects.");
		data.put(m9.name, m9);
		Marker m10 = new Building(
				"Biosciences and Bioengineering Department",
				"BSBE ",
				3934,
				2241,
				1,
				new String[] { "WRCBB Wadhwani Research Centre in Biosciences and Bioengineering " },
				"Phone: +912225767771\nFax: +912225767771\nE-mail: office.bio@iitb.ac.in\nThe department offers academic programs in MSc (Biotechnology), MTech (Biomedical Engineering), MSc-PhD Dual Degree Program, PhD Program ");
		data.put(m10.name, m10);
		Marker m11 = new Marker("Boat House", "0", 1960, 1757, 9,
				"Timings: 6 am to 6 pm");
		data.put(m11.name, m11);
		Marker m12 = new Room("Brewberrys Cafe", "Brewberrys", 2967, 1271, 5,
				"Hostel 08 Woodland", "Inside",
				"Ph no: +912265641001, Hostel 8, IIT Bombay, Powai, Mumbai");
		data.put(m12.name, m12);
		Marker m13 = new Marker(
				"Campus School",
				"0",
				3331,
				2865,
				7,
				"Principal: MS.BHAGWAT A.S\n+91222576 8992\nCampus School began as a primary school on 29 June 1976. V to X standard was added by 1986 with 100% results in X std in 1986, 1987 and 1988. The junior college classes FYJC or XI Std and SYJC or XII Std were started in science stream under Principal Chandra Rao in 1989. The Primary to JC complex has about 400 students on its roll, 35 teachers and 20 non-teaching staff. Admission to all classes is restricted to children of IIT employees with some seats made available to the children of NITIE and SAMEER employees.");
		data.put(m13.name, m13);
		Marker m14 = new Marker(
				"Central Library",
				"0",
				3820,
				1455,
				1,
				"http://www.library.iitb.ac.in/\n+912225768921\nLibrary Working Hours\nMonday through Friday 0900  2300 hrs\nMonday through Friday 0900  0100 hrs (during examination)\nSaturdays / Sundays / Holidays   1000  1700 hrs\nSaturdays / Sundays / Holidays   1000  0100 hrs (during examination)\n\nCirculation Hours\nMonday through Friday 09002000 hrs\nSaturday, Sunday & Holidays 11001300 hrs\nSelf Issue / self Check out, any time till library is open.\nStudy room books issued for overnight, one hour before closing of the library on all days");
		data.put(m14.name, m14);
		Marker m15 = new Marker(
				"Centre for Environmental Science and Engineering",
				"CESE",
				4340,
				1985,
				1,
				"http://www.cese.iitb.ac.in/\nTel +91-22-25767851 Fax +91-22-25764650\nThe Centre offers M.Tech. and Ph.D. programmes, which are interdisciplinary in nature and consists of course work followed by a research project. The duration of the Ph.D. programme varies depending upon the background of the candidate.");
		data.put(m15.name, m15);
		Marker m16 = new Room(
				"Chemistry Department",
				"Chemistry",
				3788,
				2350,
				1,
				"Chemical Engineering Department",
				"",
				"http://www.chem.iitb.ac.in/\nPhone: 022-2576-7151 \nFax: 022-2572-3480, 022-2576-7152 \nThe department offers academic programs for M.Sc, Ph.D, (M.Sc + Ph.D) Dual Degree Courses, 4 year BS degree course (From 2014, the 5 year Integrated M.Sc course has been replaced by the 4 year B.S course).");
		data.put(m16.name, m16);
		Marker m17 = new Building(
				"Civil Engineering Department",
				"Civil",
				3879,
				1804,
				1,
				new String[] {
						"Centre for Urban Science and Engineering (inside civil)",
						"Inter-disciplinary Programme in Climate Studies" },
				"http://www.civil.iitb.ac.in/\nTel:+91222576 7301\nFax:+91222576 7302\nThe department offers academic programs for B Tech, Dual Degree (B Tech + M Tech), M Tech, MS and Ph.D across different divisions such as\nBuilding Technology and Construction Management (BTCM)\nEnvironmental and Water Resources Engineering (EWRE)\nGeotechnical Engineering (GT)\nStructural Engineering (ST)\nTransportation Engineering (TR)");
		data.put(m17.name, m17);
		Marker m18 = new Marker("Convocation Hall", "0", 3255, 1711, 4,
				"Tel: +912225762781");
		data.put(m18.name, m18);
		Marker m19 = new Building(
				"NanoTech. & Science Research Centre",
				"CRNTS",
				4081,
				1344,
				1,
				new String[] { "Advanced Centre for Research in Electronics",
						"Sophisticated Analytical Instruments Facility" },
				"http://www.iitb.ac.in/~crnts/\nTel:+912225767691\nCRNTS offers programs such as\nDual degree programme-1 (B.Tech. Engg. Physics & M.Tech. Engg. Physics with specialization in Nanoscience. Admission Through: JEE. Offered by: Department of Physics. Duration: 5 years)\n\nDual degree programme-2 (M.Sc. Physics & M.Tech. in Materials Science with specialization in Nanoscience., Input : B.Sc. (Physics), Admission through: J.A.M. Jointly offered by Department of Physics & Department of Metallurgical Engg. & Materials Science)\n\nPh.D ( Interdisciplinary program. Research Domains include Nanomaterials, Nanobiotechnology,  Nanofluidics, Nanoelectronics, Nanomanufacturing, Nanosensors, Computational research in Nanosystems)");
		data.put(m19.name, m19);
		Marker m20 = new Marker(
				"Centre of Studies in Resources Engineering",
				"CSRE",
				4096,
				1993,
				1,
				"http://www.csre.iitb.ac.in/\nTel:+912225767662\nThe centre offers Ph.D, M Tech, UG Minor and institute elective. Research areas include Spatial Analysis, Digital Image Processing, Global Positioning System (GPS) and Photogrammetry, Geocomputational Systems, Microwave Remote Sensing, Snow and Glacier Studies, Geology and Mineral Resources, Agro-Informatics and rural development, Terrain evaluation group, Environment, natural hazards and disaster management, Coastal and marine sciences");
		data.put(m20.name, m20);
		Marker m21 = new Marker("A1 Director Bungalow", "Dir. Bunglw.", 2594,
				2495, 3, "");
		data.put(m21.name, m21);
		Marker m22 = new Marker("Defence Research & Development Organization",
				"DRDO", 4125, 1048, 3, "Flat nos. 101 - 404");
		data.put(m22.name, m22);
		Marker m23 = new Marker(
				"Earth Science Department",
				"Earth Sci",
				4038,
				2123,
				1,
				"http://www.geos.iitb.ac.in/\n+912225767251,+91222576 7265\nThe department offers academic programs for M.Sc (Applied Geology, Applied Geophysics, Geoexploration), M Tech (Petroleum Geoscience) and Ph.D. Research areas include Mineralogy, Geochemistry and Ore Deposits Structural Geology Igneous and Metamorphic Petrology Engineering geology, Hydro-geology Sedimentology Stratigraphy and Micro-Paleontology Mathematical Geology/ Ore Deposit Modelling Rock Magnetism and Marine Geology Seismology, Geothermics");
		data.put(m23.name, m23);
		Marker m24 = new Building(
				"Electrical Engineering Annexe Building",
				"Elec engg Anx",
				3932,
				1997,
				1,
				new String[] { "Centre for Technology Alternatives for Rural Areas" },
				"http://www.ee.iitb.ac.in/\n+912225764408 \n\n");
		data.put(m24.name, m24);
		Marker m25 = new Building(
				"Electrical Engineering Department",
				"Elec engg",
				3780,
				1900,
				1,
				new String[] { "Computer Centre" },
				"http://www.ee.iitb.ac.in/\nMain office is inside GG Building on second floor\nMadhumati Shetty +912225767401\nVaishali Deshpande  +912225767402\nSantosh S. Kharat +912225767402\nTanvi D. Shelatkar +912225767402\nB Tech, B Tech Honors, Dual Degree Program (B Tech + M Tech), M Tech (Full time 2 yrs, Part time 3yrs with specializations such as Communications, Engineering (termed as EE1), Control and Computing (EE2), Power Electronics and Power System (EE3), Microelectronics and VLSI (EE4), Electronic Systems (EE5)) and Ph D");
		data.put(m25.name, m25);
		Marker m26 = new Building(
				"Chemical Engineering Department",
				"Chem Engg",
				3788,
				2350,
				1,
				new String[] { "Chemistry Department" },
				"http://www.che.iitb.ac.in/\n+912225767201, +912225767202\nPrograms offered in B Tech, M Tech, Dual Degree (M Tech + Ph D) and Ph D. Research areas include Biological Systems Engineering, Energy & Environment, Materials Engineering, Process Systems Engineering, Reactor Engineering, and Transport Phenomena and Complex Fluids");
		data.put(m26.name, m26);
		Marker m27 = new Marker("Electrical Maintenence", "Elec Maint", 4544,
				1830, 1, "Tel: +912225767971/ +912225764077");
		data.put(m27.name, m27);
		Marker m28 = new Marker("Guest House/ Jalvihar", "Jalvihar", 2610,
				2138, 3, "Tel: +912225768940 /  +912225768942 /  +912225768943");
		data.put(m28.name, m28);
		Marker m29 = new Marker("Guest House/ Vanvihar", "Vanvihar", 2881,
				2106, 3, "Tel: +912225761200 / +912225768945");
		data.put(m29.name, m29);
		Marker m30 = new Room("Gulmohar Restaurant", "Gulmohar", 2989, 2154, 5,
				"Canara Bank", "Second floor",
				"Tel: +912225762783 / Tel: +912225762786");
		data.put(m30.name, m30);
		Marker m31 = new Marker("Hospital", "Hosp.", 3018, 1917, 9,
				"Hospital Tel: +912225767051,\nAmbulance Tel: +912225761101");
		data.put(m31.name, m31);
		Marker m32 = new Marker(
				"Hostel 01 Queen of the campus",
				"H1",
				3908,
				1077,
				2,
				"Hostel security: +912225762601\nHall Manager: +912225762701\nG.Sec: Ratikant +919930836852");
		data.put(m32.name, m32);
		Marker m33 = new Marker(
				"Hostel 10 Girls Annexe  ",
				"H10 Annx",
				2886,
				2452,
				2,
				"Hostel security: +912225762610\nHall Manager: +912225762710\nG.Sec: Madhu Lekha +919769372532");
		data.put(m33.name, m33);
		Marker m34 = new Marker(
				"Hostel 10 Girls Hostel New",
				"H10 New",
				3005,
				2342,
				2,
				"Hostel security: +912225762610\nHall Manager: +912225762710\nG.Sec: Madhu Lekha +919769372532");
		data.put(m34.name, m34);
		Marker m35 = new Marker(
				"Hostel 10A Girls (P. Staff and Ph D, QIP building)",
				"H10A QIP",
				4716,
				1448,
				2,
				"Hostel security: +912225762619\nHall Manager: +912225762719\nG.Sec: Sagarika Kumar +919167273231");
		data.put(m35.name, m35);
		Marker m36 = new Building(
				"Hostel 11 Athena (Girls Hostel)",
				"H11",
				2987,
				1368,
				2,
				new String[] { "Printing and photocopying H11" },
				"Hostel security: +912225762611\nHall Manager: +912225762711\nG.Sec: Nanditha +919769834234");
		data.put(m36.name, m36);
		Marker m37 = new Marker(
				"Hostel 12 Crown of the campus",
				"H12",
				2096,
				667,
				2,
				"Hostel security: +912225762612\nHall Manager: +912225762712\nG.Sec: Ashutosh +919167782489");
		data.put(m37.name, m37);
		Marker m38 = new Building(
				"Hostel 13",
				"H13",
				1918,
				745,
				2,
				new String[] { "H13 Night Canteen" },
				"Hostel security: +912225762613\nHall Manager: +912225762713\nG.Sec: Raj Kumar Yadav +919769484219");
		data.put(m38.name, m38);
		Marker m39 = new Marker(
				"Hostel 14 Silicon ship",
				"H14",
				2114,
				800,
				2,
				"Hostel security: +912225762614\nHall Manager: 022-25762714\nG.Sec: Mayuresh Pant +919730694513");
		data.put(m39.name, m39);
		Marker m40 = new Marker("Hostel 15", "H15", 4196, 870, 2,
				"Hostel security: +912225762715\nHall Manager: \nG.Sec:");
		data.put(m40.name, m40);
		Marker m41 = new Marker("Hostel 16", "H16", 3972, 849, 2,
				"Hostel security: +91222576 2716\nHall Manager: 022-2576\nG.Sec:");
		data.put(m41.name, m41);
		Marker m42 = new Marker(
				"Hostel 02 The wild ones",
				"H2",
				3672,
				1000,
				2,
				"Hostel security:+912225762602\nHall Manager: +912225762702\nG.Sec: Manohar Reddy Devarpalli +918796879949");
		data.put(m42.name, m42);
		Marker m43 = new Marker(
				"Hostel 03",
				"H3 ",
				3435,
				946,
				2,
				"Hostel security: +912225762603\nHall Manager: +912225762703\nG.Sec: Arvind Jangid +919820525369");
		data.put(m43.name, m43);
		Marker m44 = new Marker(
				"Hostel 04 Madhouse",
				"H4",
				3176,
				867,
				2,
				"Hostel security: +912225762604\nHall Manager: +912225762704\nG.Sec: Kumar Gaurav +919969800320");
		data.put(m44.name, m44);
		Marker m45 = new Marker(
				"Hostel 05 Penthouse",
				"H5",
				2820,
				970,
				2,
				"Hostel security: +912225762605\nHall Manager: +912225762705\nG.Sec: Shashank Patidar +919820717487");
		data.put(m45.name, m45);
		Marker m46 = new Building(
				"Hostel 06 Vikings",
				"H6",
				2500,
				748,
				2,
				new String[] { "ATM - Canara Bank near H6" },
				"Hostel security: +912225762606\nHall Manager:+912225762706\nG.Sec: Anil Reddy +919022623186");
		data.put(m46.name, m46);
		Marker m47 = new Marker(
				"Hostel 07 The lady of the lake",
				"H7",
				2454,
				942,
				2,
				"Hostel security: +912225762607\nHall Manager: +912225762707\nG.Sec: Archit Laddha +919930239739");
		data.put(m47.name, m47);
		Marker m48 = new Building(
				"Hostel 08 Woodland",
				"H8",
				2834,
				1257,
				2,
				new String[] { "Brewberrys Cafe",
						"Printing and photocopying H8" },
				"Hostel security: +912225762608\nHall Manager:+912225762708\nG.Sec: Mayur Kalambe +919920147585");
		data.put(m48.name, m48);
		Marker m49 = new Marker(
				"Hostel 09 Nawaabon Ki Basti",
				"H9",
				2676,
				844,
				2,
				"Hostel security: +912225762609\nHall Manager: +912225762709\nG.Sec: Shubham Meena +919619835583");
		data.put(m49.name, m49);
		Marker m50 = new Building(
				"Humanities and Social Sciences Department",
				"HSS",
				3911,
				2171,
				1,
				new String[] { "Aerospace Engineering Annexe" },
				"http://www.hss.iitb.ac.in/\n+912225767351 / +91222576 7351 / +912225767352\nThe department offers academic programs for B. Tech, M. Phil, Ph. D. Research areas include Economics, English, Philosophy, Psychology, Sociology");
		data.put(m50.name, m50);
		Marker m51 = new Building(
				"Industrial Design Centre",
				"IDC",
				4207,
				1732,
				1,
				new String[] { "IDC Canteen", "IDC Shakti" },
				"http://www.idc.iitb.ac.in\n+91222576 7801\nThe department offers academic programs for M. Des and Ph. D. Sub-disciplines include Product Design, Industrial Design, Visual Communication, Animation, Interaction Design, Mobility and vehicle design");
		data.put(m51.name, m51);
		Marker m52 = new Building("Indoor Stadium", "0", 3480, 1081, 8,
				new String[] { "Badminton Court" }, "");
		data.put(m52.name, m52);
		Marker m53 = new Room(
				"Industrial Research & Consultancy Centre",
				"IRCC",
				3505,
				1867,
				1,
				"School of Management",
				"Level 2",
				"Tel: +912225767030, +912225767039\nwww.ircc.iitb.ac.in\nThe Industrial Research and Consultancy Centre (IRCC) co-ordinates and facilitates all research and development activities at the Institute.");
		data.put(m53.name, m53);
		Marker m54 = new Building(
				"Kanwal Rekhi School of Information Technology ",
				"KReSIT",
				3301,
				2106,
				1,
				new String[] { "KReSIT Canteen" },
				"For admission / general queries +9125767967 / +9125767977\nOffice +9125767901 / +9125767902\nSecurity +912225762784");
		data.put(m54.name, m54);
		Marker m55 = new Marker("Kshitij Udyan", "0", 2971, 1744, 9, "");
		data.put(m55.name, m55);
		Marker m56 = new Building("Kendriya Vidyalaya ", "KV", 3883, 2714, 7,
				new String[] { "K.G School" }, "Tel: +912225768983");
		data.put(m56.name, m56);
		Marker m57 = new Marker("Lake Side Gate no. 1", "0", 792, 2777, 10,
				"Tel: +912225761124");
		data.put(m57.name, m57);
		Marker m58 = new Building("Lecture Hall Complex - 1 & 2",
				"Lec Hall 1 & 2", 3570, 2152, 4, new String[] {
						"LT 001 (LCT 01)", "LT 002 (LCT 02)",
						"LT 003 (LCT 03)", "LT 004 (LCT 04)",
						"LT 005 (LCT 05)", "LT 006 (LCT 06)",
						"LT 101 (LCT 11)", "LT 102 (LCT 12)",
						"LT 103 (LCT 13)", "LT 104 (LCT 14)",
						"LT 105 (LCT 15)", "LT 106 (LCT 16)",
						"LT 201 (LCT 21)", "LT 202 (LCT 22)",
						"LT 203 (LCT 23)", "LT 204 (LCT 24)",
						"LT 205 (LCT 25)", "LT 206 (LCT 26)",
						"LT 301 (LCT 31)", "LT 302 (LCT 32)",
						"LT 303 (LCT 33)", "LT 304 (LCT 34)",
						"LT 305 (LCT 35)", "LT 306 (LCT 36)", "LC 001 (LCC 1)",
						"LC 002 (LCC 2)", "LC 101 (LCC 11)", "LC 102 (LCC 12)",
						"LC 201 (LCC 21)", "LC 202 (LCC 22)",
						"LC 301 (LCC 31)", "LC 302 (LCC 32)",
						"LH 101 (LCH 11)", "LH 102 (LCH 12)",
						"LH 301 (LCH 31)", "LH 302 (LCH 32)" }, "");
		data.put(m58.name, m58);
		Marker m59 = new Building("Lecture Hall Complex - 3", "Lec Hall 3",
				3779, 2220, 4,
				new String[] { "HALL 1 (LA 101)", "HALL 2 (LA 102)",
						"HALL 3 (LA 103)", "HALL 4 (LA 104)" }, "");
		data.put(m59.name, m59);
		Marker m60 = new Building("Main Building", "0", 3628, 1640, 1,
				new String[] { "Hostel Coordinating Unit",
						"Graduate apptitude test in engineering Office",
						"Joint Admission Test for M.Sc. Office",
						"Joint Entrance Examination Office",
						"Printing and photocopying Main Building" }, "");
		data.put(m60.name, m60);
		Marker m61 = new Marker("Main Gate no. 2", "0", 2259, 3237, 10,
				"Tel: +9125768978 / +9125761123. Tum Tum coupons available at Main Gate");
		data.put(m61.name, m61);
		Marker m62 = new Marker("Market Gate, Y point Gate no. 3",
				"Market Gate", 3829, 2972, 10,
				"Tel: +912225768979 / +912225761121");
		data.put(m62.name, m62);
		Marker m63 = new Building(
				"Mathematics Department",
				"Maths",
				3928,
				1496,
				1,
				new String[] {
						"Centre for Formal Design and Verification of Software",
						"Centre for Distance Engineering Education Programme",
						"Old Software Lab",
						"Inter-disciplinary Programme in Educational Technology" },
				"http://www.math.iitb.ac.in/\nTel: +912225767451\nB Tech (core courses), MSc (ASI, Maths), Ph D");
		data.put(m63.name, m63);
		Marker m64 = new Building(
				"Mechanical Engineering Department",
				"Mech ",
				4009,
				1645,
				1,
				new String[] { "Industrial Engineering and Operations Research" },
				"http://www.me.iitb.ac.in/\nTel: +912225762545 Ext. 7500, 7501, 2576 7500, 2576 7501.\nThe department offers academic programs for B. Tech, Dual degree, M. Tech and Ph. D. Research areas include design enggineering, manufacturing enggineering, thermal and fluid enggineering");
		data.put(m64.name, m64);
		Marker m65 = new Marker("Medical Store", "Med. Store", 4000, 2808, 9,
				"");
		data.put(m65.name, m65);
		Marker m66 = new Building(
				"Metallurgical Engineering and Material Science Department",
				"MEMS",
				3631,
				2044,
				1,
				new String[] {
						"Inter-disciplinary Programme in Corrosion Science & Engineering",
						"Aqueous corrosion lab", "Corrosion lab I",
						"Corrosion science paint lab" },
				"http://www.met.iitb.ac.in/\nTel: +912225767601 / +912225767602\nThe department offers academic programs for B. Tech, Dual degree (B Tech + M Tech), M. Tech and Ph. D. Dual degree specializations include Ceramics and Composites and Metallurgical Process Engineering. M Tech specializations include Materials Science, Steel Technology, Process Engineering and Corrosion Science.");
		data.put(m66.name, m66);
		Marker m67 = new Building("Non- Academic Staff Association", "NASA",
				4326, 1896, 1, new String[] { "Printing Press" },
				"Tel: +912225768919");
		data.put(m67.name, m67);
		Marker m68 = new Marker("NCC Office", "0", 3387, 1421, 9,
				"Tel: +912225768917");
		data.put(m68.name, m68);
		Marker m69 = new Marker("Nestle Cafe (Coffee Shack)", "Coffee Shack",
				3492, 1784, 5, "");
		data.put(m69.name, m69);
		Marker m70 = new Marker(
				"New Computer Science Engineering Department",
				"New CSE",
				3422,
				1986,
				1,
				"http://www.cse.iitb.ac.in/\nTel: +912225767901/02\nThe department offers academic programs for B. Tech, Dual degree (B Tech + M Tech), M Tech, Dual Degree PG (M. Tech + Ph. D) and Ph. D. Research areas include algorithms, programming languages and Compilers, database and information systems, artificial intelligence and natural language processing, software engineering, formal methods, distributed systems, computer networks, data mining, computer graphics, computer vision and image understanding, real-time and embedded systems, formal languages and bio-inspired computing");
		data.put(m70.name, m70);
		Marker m71 = new Marker("B 24 Nilgiri", "B 24 Nilgiri", 3318, 2324, 3,
				"Flat nos. 268-326 ");
		data.put(m71.name, m71);
		Marker m72 = new Building(
				"Old Computer Science Engineering Department",
				"Old CSE",
				4002,
				1545,
				1,
				new String[] { "New Software Lab" },
				"http://www.cse.iitb.ac.in/\nTel: +912225767701 / +912225767702 / +912225762771\nThe department offers academic programs for B. Tech, Dual degree (B Tech + M Tech), Dual Degree PG (M. Tech + Ph. D) and Ph. D. Research areas include algorithms, programming languages and Compilers, database and information systems, artificial intelligence and natural language processing, software engineering, formal methods, distributed systems, computer networks, data mining, computer graphics, computer vision and image understanding, real-time and embedded systems, formal languages and bio-inspired computing");
		data.put(m72.name, m72);
		Marker m73 = new Marker("B 19 Old Multistoried Building- Residence ",
				"0", 1413, 2885, 3,
				"Building lift phone Tel: +912225762884\nFlat nos. 75-98");
		data.put(m73.name, m73);
		Marker m74 = new Marker(
				"ONGC Research Centre",
				"0",
				4234,
				2162,
				1,
				"Currently, the centre is working on a project titled Physical and Numerical Models for Un-conventional Flood Patterns. The project relates to increasing countrys currrent oil production by means of Enhanced Oil Recovery (EOR) processes. ");
		data.put(m74.name, m74);
		Marker m75 = new Marker(
				"OrthoCad Lab",
				"0",
				4644,
				1767,
				12,
				"The OrthoCAD Network Research Cell was established in 2007 to jump-start indigenous research and development activities in orthopaedic reconstruction systems. The OrthoCAD Network addresses a critical need for mega-prostheses to reconstruct massive gaps or loss of bone from osteo-sarcoma (cancer), congenital (birth) defects or trauma (accidents).");
		data.put(m75.name, m75);
		Marker m76 = new Marker("Padmavati Devi Temple", "0", 946, 2178, 9, "");
		data.put(m76.name, m76);
		Marker m77 = new Marker("PC Saxena Auditorium / Leacture Theatre",
				"PCSA, LT", 3648, 1790, 4, "022 2576 4999");
		data.put(m77.name, m77);
		Marker m78 = new Marker(
				"Physics Department",
				"Physics",
				3479,
				2247,
				1,
				"The department offers academic programs for B.Tech Engineering Physics (through JEE), Dual degree B.Tech + M.Tech in Engineering Physics with specialisation in Nanoscience (through JEE), MSc Physics 2 Years programme (through JAM), Dual degree programme of MSc and PhD in physics (through JAM). Research areas include Condensed Matter Physics, Photonics and Optics, Nuclear Physics, High Energy Physics, Statistical Physics");
		data.put(m78.name, m78);
		Marker m79 = new Marker("Post Office", "0", 3918, 2846, 9,
				"Tel: +912225762774");
		data.put(m79.name, m79);
		Marker m80 = new Marker("Power House", "0", 4671, 1590, 9, "");
		data.put(m80.name, m80);
		Marker m81 = new Room("Printing Press", "Press", 4326, 1896, 9,
				"Non- Academic Staff Association", "Inside",
				"Tel: +912225768961");
		data.put(m81.name, m81);
		Marker m82 = new Building("Students Activity Centre", "SAC", 3599,
				1225, 8, new String[] { "Open Air Theatre" },
				"Tel: +912225768968");
		data.put(m82.name, m82);
		Marker m83 = new Room("Sophisticated Analytical Instruments Facility",
				"SAIF", 4081, 1344, 1, "NanoTech. & Science Research Centre",
				"Inside", "Tel: +912225767691 / +912225767692");
		data.put(m83.name, m83);
		Marker m84 = new Marker("Seminar Hall", "0", 3792, 2025, 4,
				"Tel: +912225764912, for booking  +912225764420");
		data.put(m84.name, m84);
		Marker m85 = new Marker("Shishu Vihar", "0", 2318, 2851, 9,
				"Shishu Vihar is temporarily located at A5\nTel: +912225764978");
		data.put(m85.name, m85);
		Marker m86 = new Marker("Shivalik C 23 (187-240)", "Shivalik C 23",
				3129, 2612, 3, "C- Type Quartera Flat nos. 187 - 240");
		data.put(m86.name, m86);
		Marker m87 = new Building(
				"School of Management",
				"SOM",
				3505,
				1867,
				1,
				new String[] { "Industrial Research & Consultancy Centre" },
				"http://www.som.iitb.ac.in/\nOffice - +91 22 2576 7781\nPh. D. admissions - +91222576 7782\nM. Mgt. admissions - +9122 25768781 \nThe department offers academic programs in Master Of Management Programme - Full Time, Doctoral Programme in Management - PhD Degree, Management Development Programme - For Corporate Executives");
		data.put(m87.name, m87);
		Marker m88 = new Marker("Staff Canteen", "Staff Cant.", 3622, 1547, 5,
				"Tel: +912225768952");
		data.put(m88.name, m88);
		Marker m89 = new Marker("Staff Club", "0", 2931, 2027, 8,
				"Tel: +91223576 4075");
		data.put(m89.name, m89);
		Marker m90 = new Marker("Staff Hostel", "0", 2872, 1472, 3,
				"Tel: +91222576 1113");
		data.put(m90.name, m90);
		Marker m91 = new Marker("State Bank of India, IIT Powai branch", "SBI",
				2164, 3227, 6,
				"Phone +912225722894 / +912225721103\nwork hours: 10:30 am to 4:30 pm");
		data.put(m91.name, m91);
		Marker m92 = new Marker("Swimming Pool (new)", "S. Pool new", 3558,
				1141, 8, "Tel: +912225762755");
		data.put(m92.name, m92);
		Marker m93 = new Marker("Swimming Pool (old)", "S. Pool old", 3742,
				1229, 8, "Tel: +912225768967");
		data.put(m93.name, m93);
		Marker m94 = new Building(
				"Tansa House King of campus (Proj. Staff Boys)", "Tansa", 3028,
				932, 2, new String[] { "ATM - State Bank near Tansa" },
				"Tel: +912225762620");
		data.put(m94.name, m94);
		Marker m95 = new Marker("Tennis Court (new)", "0", 3046, 1513, 8, "");
		data.put(m95.name, m95);
		Marker m96 = new Marker("Tennis Court (old)", "0", 3177, 1624, 8, "");
		data.put(m96.name, m96);
		Marker m97 = new Marker("Victor Menezes Convention Centre", "VMCC",
				4110, 1847, 4, "Tel: +912225761125");
		data.put(m97.name, m97);
		Marker m98 = new Marker("Vidya Niwas", "0", 4911, 1111, 3, "");
		data.put(m98.name, m98);
		Marker m99 = new Marker("Vihar House", "0", 4558, 1429, 3, "");
		data.put(m99.name, m99);
		Marker m100 = new Marker(
				"White House",
				"0",
				1909,
				2799,
				3,
				"B- 20, A wing Tel: +912225762885, Flat nos. 99-110\nB- 20, B wing Tel: +912225762840, Flat nos.111-122");
		data.put(m100.name, m100);
		Marker m101 = new Building("Canara Bank", "0", 2989, 2154, 6,
				new String[] { "ATM - Canara Bank near Gulmohar",
						"Gulmohar Restaurant" }, "Tel: +912225762797");
		data.put(m101.name, m101);
		Marker m102 = new Room("Hostel Coordinating Unit", "HCU", 3628, 1640,
				1, "Main Building", "Inside",
				"Chairman Tel: +91222576 8901,\nOfficeTel: +91222576 8900");
		data.put(m102.name, m102);
		Marker m103 = new Room("Graduate apptitude test in engineering Office",
				"GATE Off.", 3628, 1640, 1, "Main Building", "Inside",
				"Tel: +91222576 2924");
		data.put(m103.name, m103);
		Marker m104 = new Room("Joint Admission Test for M.Sc. Office",
				"JAM Off.", 3628, 1640, 1, "Main Building", "Inside",
				"Tel: +91222576 2924");
		data.put(m104.name, m104);
		Marker m105 = new Room("Joint Entrance Examination Office", "JEE Off.",
				3628, 1640, 1, "Main Building", "Inside", "Tel: +91222576 4063");
		data.put(m105.name, m105);
		Marker m106 = new Marker(
				"Energy Science and enggineering",
				"ESE",
				4239,
				2028,
				1,
				"http://www.ese.iitb.ac.in/\nTel: +912225767890\nThe department offers academic programs in Dual degree (B Tech + M Tech), M Tech, M.Sc.-Ph.D and Ph.D. Research areas include Energy Efficiency and Conservation, Solar PV and Thermal, Battery and Storage Engineering, Hydrogen and Fuel Cells, Smart microgrids, Biomass and Bio-Fuels, Wind Energy, Nuclear");
		data.put(m106.name, m106);
		Marker m107 = new Room(
				"Centre for Urban Science and Engineering (inside civil)",
				"C-USE",
				3879,
				1804,
				1,
				"Civil Engineering Department",
				"Inside",
				"http://cuse.iitb.ac.in/\nTel: +912225769301\nPh. D program. Research areas include Planning and Design (Housing, Land use policies, Public Spaces, Risk Management)\nPolicy and Governance (Housing Economics, Health, Education, Employment, Environment) Infrastructure (Buildings,Transportation & Land use, Urban water, Waste Management, Smart Energy); Informatics (Citizen Science, Cyber-Physical Systems, Urban Knowledge, Geo-Spatial Technologies)");
		data.put(m107.name, m107);
		Marker m108 = new Room(
				"Centre for Formal Design and Verification of Software",
				"CFDVS", 3928, 1496, 1, "Mathematics Department",
				"In basement", "http://www.cfdvs.iitb.ac.in/\n+912225768701");
		data.put(m108.name, m108);
		Marker m109 = new Room(
				"Centre for Technology Alternatives for Rural Areas",
				"CTARA",
				3932,
				1997,
				1,
				"Electrical Engineering Annexe Building",
				"Inside",
				"http://www.ctara.iitb.ac.in/\nTel: +912225767870\nOffers M. Tech, Ph D and TDSL (Minor for UG). Research areas include agriculture and food, appropriate technology, drinking water, environment, energy and health");
		data.put(m109.name, m109);
		Marker m110 = new Room(
				"Centre for Distance Engineering Education Programme", "CDEEP",
				3928, 1496, 1, "Mathematics Department", "Ground floor",
				"http://www.cdeep.iitb.ac.in/\nTel: +912225764820/4812");
		data.put(m110.name, m110);
		Marker m111 = new Room("Computer Centre", "CC", 3932, 1997, 1,
				"Electrical Engineering Department", "In room 243",
				"http://www.cc.iitb.ac.in/\nTel: +912225767751");
		data.put(m111.name, m111);
		Marker m112 = new Room(
				"Centre for Aerospace Systems Design and Engineering", "CASDE",
				4153, 2249, 1, "Aerospace Engineering Department", "Inside",
				"http://www.casde.iitb.ac.in/aboutus/\nTel: +912225767840");
		data.put(m112.name, m112);
		Marker m113 = new Room("Centrifugal Lab", "0", 4370, 1395, 12,
				"National Geotechnical Centrifuge Facility", "Near", "");
		data.put(m113.name, m113);
		Marker m114 = new Room(
				"Concrete Technology Lab",
				"Concrete Tech Lab",
				4330,
				1495,
				12,
				"Heavy Structure Lab",
				"Near",
				"Comes under Structural Engineering Laboratories of Civil Engineering  Department ");
		data.put(m114.name, m114);
		Marker m115 = new Marker("Cummins Engine Research facility", "Cummins",
				4350, 1580, 1,
				"Incharge: Prof. Anuradda Ganesh\nTel: +912225764506\nLocation");
		data.put(m115.name, m115);
		Marker m116 = new Room(
				"ENELEK Power Sine",
				"ENELEK",
				4160,
				1620,
				9,
				"Treelabs",
				"Beside",
				"Enelek is a technology driven company, dedicated to delivery to quality and affordability through state-of-the art solar thermal & solar power products, systems and providing technology solutions & services.\nAddress: CM-06, SINE Office\n3rd Floor, CSRE Building\nIIT Bombay\nPowai, Mumbai - 400076\nContact No. - +919167939941 | info@enelek.com\nCareers Enquiry - career@enelek.com");
		data.put(m116.name, m116);
		Marker m117 = new Room(
				"Energy Systems Lab",
				"Enrgy Sys Lab",
				4230,
				1435,
				12,
				"Geotechnical Engg. Lab",
				"Near",
				"Comes under Energy Systems Engineering Department\nhttp://www.ese.iitb.ac.in/\n+912225767890\nThe department offers academic programs in Dual degree (B Tech + M Tech), M Tech, M.Sc.-Ph.D and Ph.D. Research areas include Energy Efficiency and Conservation, Solar PV and Thermal, Battery and Storage Engineering, Hydrogen and Fuel Cells, Smart microgrids, Biomass and Bio-Fuels, Wind Energy, Nuclear");
		data.put(m117.name, m117);
		Marker m118 = new Building(
				"Fluid Mechanics and Fluid Power Lab",
				"Fluid Mech Lab",
				4060,
				1585,
				12,
				new String[] { "Hydraulics Lab (New)" },
				"Comes under Mechanical Engineering Department\nFluid Mechanics Lab Tel: +912225764232 \nFluid Power LabTel: +912225764532 / +912225764549");
		data.put(m118.name, m118);
		Marker m119 = new Room(
				"Fuel Cell Research Facility",
				"Fuel Cell Re. Fac.",
				4525,
				1680,
				1,
				"N1 Bay",
				"Inside",
				"Comes under Energy Systems Engineering Department\nhttp://www.ese.iitb.ac.in/\n+912225764897");
		data.put(m119.name, m119);
		Marker m120 = new Building("Geotechnical Engg. Lab", "GeoTech Lab",
				4280, 1425, 12, new String[] { "Energy Systems Lab" },
				"Comes under Civil Engineering Department\n+912225764320");
		data.put(m120.name, m120);
		Marker m121 = new Marker(
				"GMFL Lab / Geophysical and multiphase Flows Lab", "GMFL Lab",
				4530, 1485, 12, "");
		data.put(m121.name, m121);
		Marker m122 = new Room("Greenhouse Lab", "0", 4790, 1055, 12,
				"K-Yantra Lab (CSE Dept.)", "Inside", "");
		data.put(m122.name, m122);
		Marker m123 = new Marker("Heat Pump Lab", "0", 4153, 1539, 12,
				"Comes under Mechanical Engineering Department\n+912225764527 / +912225764593");
		data.put(m123.name, m123);
		Marker m124 = new Building("Heat Transfer and Thermodynamic Lab",
				"Heat Trans Lab", 4390, 1550, 12,
				new String[] { "Steam Power Lab" },
				"Comes under Mechanical Engineering Department\n+912225764533");
		data.put(m124.name, m124);
		Marker m125 = new Room(
				"Heavy Structure Lab",
				"0",
				4330,
				1495,
				12,
				"Hydraulics Lab",
				"Near",
				"Comes under Structural Engineering Laboratories of Civil Engineering Department +912225764323");
		data.put(m125.name, m125);
		Marker m126 = new Room(
				"Hydraulics Lab",
				"0",
				4215,
				1490,
				12,
				"Hydraulics Lab",
				"Near",
				"Comes under Civil Engineering Department\nWater Resources Hydraulics Lab +912225764303");
		data.put(m126.name, m126);
		Marker m127 = new Room(
				"Hydraulics Lab (New)",
				"0",
				4110,
				1525,
				12,
				"Fluid Mechanics and Fluid Power Lab",
				"Inside",
				"Comes under Civil Engineering Department\nHYDRAULICS LAB (VMCC) +91222576 4301");
		data.put(m127.name, m127);
		Marker m128 = new Room("Hydraulics Lab Workshop", "0", 4180, 1450, 12,
				"Hydraulics Lab", "Near", "");
		data.put(m128.name, m128);
		Marker m129 = new Room("IC Engine and Combustion Lab",
				"Combustion Lab", 4295, 1570, 12, "Treelabs", "Backside",
				"Comes under Mechanical Engineering Department\n+912225764586");
		data.put(m129.name, m129);
		Marker m130 = new Building(
				"K-Yantra Lab (CSE Dept.)",
				"K-Yantra",
				4790,
				1055,
				1,
				new String[] { "Greenhouse Lab" },
				"ERTS Lab\nFirst Floor, KReSIT Building, CSE Department\nIIT Bombay - Powai, Mumbai 400076\nhelpdesk@e-yantra.org");
		data.put(m130.name, m130);
		Marker m131 = new Room("Machine Lab", "Mach. Lab", 1445, 1669, 12,
				"N2 Bay", "Near",
				"Comes under Electrical Engineering Department\n+912225764422");
		data.put(m131.name, m131);
		Marker m132 = new Room("Machine Tool Lab", "Mach. Tool Lab", 4410,
				1740, 12, "S2 Bay", "Near",
				"Comes under Mechanical Engineering Department\n+912225764518 / +912225764537");
		data.put(m132.name, m132);
		Marker m133 = new Room("Metal Forming Lab", "0", 4290, 1470, 12,
				"Structural Evaluation & Material Technologies Lab", "Near",
				"Comes under Mechanical Engineering Department\n+912225764561");
		data.put(m133.name, m133);
		Marker m134 = new Building("Micro Fluidics Lab", "0", 4620, 1783, 12,
				new String[] { "RM Lab (Rapid manufacturing)" }, "");
		data.put(m134.name, m134);
		Marker m135 = new Room("N1 Bay", "0", 4525, 1680, 1,
				"SMAmL Suman Mashruwala Advanced Microengineering Lab", "Near",
				"Comes under Chemical Engineering Department\n+912225764211");
		data.put(m135.name, m135);
		Marker m136 = new Room("N2 Bay", "0", 4445, 1669, 1,
				"SMAmL Suman Mashruwala Advanced Microengineering Lab", "Near",
				"");
		data.put(m136.name, m136);
		Marker m137 = new Room("N3 Bay", "0", 4360, 1645, 1,
				"SMAmL Suman Mashruwala Advanced Microengineering Lab", "Near",
				"");
		data.put(m137.name, m137);
		Marker m138 = new Building("National Geotechnical Centrifuge Facility",
				"GeoTech Centrifuge", 4370, 1395, 1,
				new String[] { "Centrifugal Lab" }, "");
		data.put(m138.name, m138);
		Marker m139 = new Marker("OrthoCad Lab", "0", 4683, 1702, 12,
				"Comes under Mechanical Engineering Department\n+912225764399");
		data.put(m139.name, m139);
		Marker m140 = new Room("Old ONGC Lab", "0", 4275, 1555, 12,
				"IC Engine and Combustion Lab", "Near", "");
		data.put(m140.name, m140);
		Marker m141 = new Building("Physics Lab (Ist Years)", "Phy Lab (1 Yr)",
				4585, 1540, 12, new String[] { "UG Lab (Ist Years)" },
				"Comes under Physics department");
		data.put(m141.name, m141);
		Marker m142 = new Room("Refrigeration, A/C and Cryogenics Lab", "0",
				4225, 1630, 12, "Treelabs", "Near",
				"Comes under Mechanical Engineering Department\n+912225764587");
		data.put(m142.name, m142);
		Marker m143 = new Room("RM Lab (Rapid manufacturing)", "RM Lab", 4650,
				1757, 12, "Micro Fluidics Lab", "Near", "");
		data.put(m143.name, m143);
		Marker m144 = new Room("Rock Cutting Lab", "0", 3921, 2095, 12,
				"Rock Powdering Lab", "Near", "");
		data.put(m144.name, m144);
		Marker m145 = new Building("Rock Powdering Lab", "0", 3921, 2095, 12,
				new String[] { "Rock Cutting Lab" }, "");
		data.put(m145.name, m145);
		Marker m146 = new Room("S1 Bay", "0", 4490, 1760, 1,
				"Structural integrity Testing and Analysis Centre", "Near", "");
		data.put(m146.name, m146);
		Marker m147 = new Room("S2 Bay", "0", 4410, 1740, 1,
				"Structural integrity Testing and Analysis Centre", "Near",
				"Tel:+912225764213");
		data.put(m147.name, m147);
		Marker m148 = new Room("S3 Bay", "0", 4325, 1720, 1,
				"Structural integrity Testing and Analysis Centre", "Near", "");
		data.put(m148.name, m148);
		Marker m149 = new Room(
				"Structural Evaluation & Material Technologies Lab",
				"SEMT Lab", 4280, 1510, 12, "Hydraulics Lab", "Near",
				"Comes under Civil Engineering Department\n+912225764318");
		data.put(m149.name, m149);
		Marker m150 = new Building(
				"Structural integrity Testing and Analysis Centre", "SITAC",
				4355, 1750, 1, new String[] { "S1 Bay", "S2 Bay", "S3 Bay" },
				"Comes under Mechanical Engineering Department\n+912225764528");
		data.put(m150.name, m150);
		Marker m151 = new Room(
				"Solar Lab",
				"0",
				4230,
				1435,
				12,
				"Energy Systems Lab",
				"",
				"Comes under Chemistry Department\n+912225764887\nSOLAR LAB (308) Phone: +912225764173 ");
		data.put(m151.name, m151);
		Marker m152 = new Room("Steam Power Lab", "0", 4376, 1526, 12,
				"Heat Transfer and Thermodynamic Lab", "",
				"Comes under Mechanical Engineering Department\n+912225764584");
		data.put(m152.name, m152);
		Marker m153 = new Building(
				"SMAmL Suman Mashruwala Advanced Microengineering Lab",
				"Adv. MicroEngg Lab",
				4431,
				1615,
				12,
				new String[] { "N1 Bay", "N2 Bay", "N3 Bay" },
				"Phone: +912225767519 / +912225764534\nFax:-+912225726875\nE-mail: gandhi@me.iitb.ac.in");
		data.put(m153.name, m153);
		Marker m154 = new Room(
				"Supercritical fluid Processing facility (Chemical Engg.)",
				"Fluid Processing", 4490, 1760, 1, "S1 Bay", "",
				"Comes under Chemical Engineering Department\n+912225767201 / +912225767202");
		data.put(m154.name, m154);
		Marker m155 = new Marker(
				"Thermal Hydraulic Test Facility",
				"Hydraulic Test",
				4463,
				1536,
				1,
				"Comes under Mechanical Engineering Department\n+912225762545 Ext. 7500, 7501, 2576 7500, 2576 7501.");
		data.put(m155.name, m155);
		Marker m156 = new Room("Tinkerers Lab (STAB)", "0", 4225, 1630, 12,
				"Treelabs", "", "");
		data.put(m156.name, m156);
		Marker m157 = new Building(
				"Treelabs",
				"0",
				4225,
				1630,
				9,
				new String[] { "Bio-diesel Lab", "ENELEK Power Sine",
						"IC Engine and Combustion Lab",
						"Refrigeration, A/C and Cryogenics Lab",
						"Tinkerers Lab (STAB)" },
				"TreeLabs is an inventions factory to nurture and encourage inventors and innovations, leading to entrepreneurship\nAddress: Electrical Engineering Dept, \nN-5 Bay (near Mech Engg Dept), \nI.I.T.Bombay, Powai, \nMumbai - 400076, India. \nPhone: +912225723001 / +912225764410\nEmail: Prof. Dipankar : dipankar@iitbombay.org");
		data.put(m157.name, m157);
		Marker m158 = new Room("UG Lab / S2 Bay", "0", 4410, 1740, 12,
				"S2 Bay", "",
				"Comes under Chemical Engineering Department \n+912225764207");
		data.put(m158.name, m158);
		Marker m159 = new Room("UG Lab (Ist Years)", "0", 4585, 1540, 12,
				"Physics Lab (Ist Years)", "", "");
		data.put(m159.name, m159);
		Marker m160 = new Room("Printing and photocopying H11", "Prints", 2987,
				1368, 11, "Hostel 11 Athena (Girls Hostel)", "Inside", "");
		data.put(m160.name, m160);
		Marker m161 = new Room("Printing and photocopying H8", "Prints", 2834,
				1257, 11, "Hostel 08 Woodland", "Inside", "");
		data.put(m161.name, m161);
		Marker m162 = new Room("Printing and photocopying Main Building",
				"Prints", 3628, 1640, 11, "Main Building", "Inside", "");
		data.put(m162.name, m162);
		Marker m163 = new Marker("ATM - State Bank main gate", "SBI ATM", 2164,
				3227, 6, "");
		data.put(m163.name, m163);
		Marker m164 = new Room("KReSIT Canteen", "KReSIT Canteen", 3301, 2106,
				5, "Kanwal Rekhi School of Information Technology ", "Inside",
				"From 10 to 8. Samosas run out by 5:30ish though!");
		data.put(m164.name, m164);
		Marker m165 = new Room(
				"IDC Canteen",
				"IDC Cant.",
				4207,
				1732,
				5,
				"Industrial Design Centre",
				"Inside",
				"Santosh bhaiyas Canteen 9am to 5:30 pm, weekdays only\nSantosh Bhaiyas tel: +918652423193");
		data.put(m165.name, m165);
		Marker m166 = new Room(
				"IDC Shakti",
				"Shakti",
				4207,
				1732,
				5,
				"Industrial Design Centre",
				"Inside",
				"Piping hot, home style food between 1 pm and 2 pm, weekdays only!\nCall Mr. Gaikwad to order a tiffin at +919833575881");
		data.put(m166.name, m166);
		Marker m167 = new Room("H13 Night Canteen", "H13 Night Cant.", 1918,
				745, 5, "Hostel 13", "Inside",
				"Open till 3 am, recomended for night-outs!");
		data.put(m167.name, m167);
		Marker m168 = new Room(
				"HALL 1 (LA 101)",
				"0",
				3779,
				2220,
				4,
				"Lecture Hall Complex - 3",
				"Ground and First floors",
				"The classroom has 4 entrance doors, two in ground floor and two in first floor.");
		data.put(m168.name, m168);
		Marker m169 = new Room(
				"HALL 2 (LA 102)",
				"0",
				3779,
				2220,
				4,
				"Lecture Hall Complex - 3",
				"Ground and First floors",
				"The classroom has 4 entrance doors, two in ground floor and two in first floor.");
		data.put(m169.name, m169);
		Marker m170 = new Room(
				"HALL 3 (LA 103)",
				"0",
				3779,
				2220,
				4,
				"Lecture Hall Complex - 3",
				"Second and Third floors",
				"The classroom has 4 entrance doors, two in secong floor and two in third floor.");
		data.put(m170.name, m170);
		Marker m171 = new Room(
				"HALL 4 (LA 104)",
				"0",
				3779,
				2220,
				4,
				"Lecture Hall Complex - 3",
				"Second and Third floors",
				"The classroom has 4 entrance doors, two in secong floor and two in third floor.");
		data.put(m171.name, m171);
		Marker m172 = new Room("LT 001 (LCT 01)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m172.name, m172);
		Marker m173 = new Room("LT 002 (LCT 02)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m173.name, m173);
		Marker m174 = new Room("LT 003 (LCT 03)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m174.name, m174);
		Marker m175 = new Room("LT 004 (LCT 04)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m175.name, m175);
		Marker m176 = new Room("LT 005 (LCT 05)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m176.name, m176);
		Marker m177 = new Room("LT 006 (LCT 06)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m177.name, m177);
		Marker m178 = new Room("LT 101 (LCT 11)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m178.name, m178);
		Marker m179 = new Room("LT 102 (LCT 12)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m179.name, m179);
		Marker m180 = new Room("LT 103 (LCT 13)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m180.name, m180);
		Marker m181 = new Room("LT 104 (LCT 14)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m181.name, m181);
		Marker m182 = new Room("LT 105 (LCT 15)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m182.name, m182);
		Marker m183 = new Room("LT 106 (LCT 16)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m183.name, m183);
		Marker m184 = new Room("LT 201 (LCT 21)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m184.name, m184);
		Marker m185 = new Room("LT 202 (LCT 22)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m185.name, m185);
		Marker m186 = new Room("LT 203 (LCT 23)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m186.name, m186);
		Marker m187 = new Room("LT 204 (LCT 24)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m187.name, m187);
		Marker m188 = new Room("LT 205 (LCT 25)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m188.name, m188);
		Marker m189 = new Room("LT 206 (LCT 26)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m189.name, m189);
		Marker m190 = new Room("LT 301 (LCT 31)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m190.name, m190);
		Marker m191 = new Room("LT 302 (LCT 32)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m191.name, m191);
		Marker m192 = new Room("LT 303 (LCT 33)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m192.name, m192);
		Marker m193 = new Room("LT 304 (LCT 34)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m193.name, m193);
		Marker m194 = new Room("LT 305 (LCT 35)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m194.name, m194);
		Marker m195 = new Room("LT 306 (LCT 36)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m195.name, m195);
		Marker m196 = new Room("LC 001 (LCC 1)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m196.name, m196);
		Marker m197 = new Room("LC 002 (LCC 2)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Ground floor", "");
		data.put(m197.name, m197);
		Marker m198 = new Room("LC 101 (LCC 11)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m198.name, m198);
		Marker m199 = new Room("LC 102 (LCC 12)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m199.name, m199);
		Marker m200 = new Room("LC 201 (LCC 21)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m200.name, m200);
		Marker m201 = new Room("LC 202 (LCC 22)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Second floor", "");
		data.put(m201.name, m201);
		Marker m202 = new Room("LC 301 (LCC 31)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m202.name, m202);
		Marker m203 = new Room("LC 302 (LCC 32)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m203.name, m203);
		Marker m204 = new Room("LH 101 (LCH 11)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m204.name, m204);
		Marker m205 = new Room("LH 102 (LCH 12)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "First floor", "");
		data.put(m205.name, m205);
		Marker m206 = new Room("LH 301 (LCH 31)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m206.name, m206);
		Marker m207 = new Room("LH 302 (LCH 32)", "0", 3570, 2152, 4,
				"Lecture Hall Complex - 1 & 2", "Third floor", "");
		data.put(m207.name, m207);
		Marker m208 = new Room("New Software Lab", "NSL", 4002, 1545, 12,
				"Old Computer Science Engineering Department", "Ground floor",
				"");
		data.put(m208.name, m208);
		Marker m209 = new Room("Old Software Lab", "OSL", 3928, 1496, 12,
				"Mathematics Department", "Ground floor", "");
		data.put(m209.name, m209);
		Marker m210 = new Marker(
				"Inter-disciplinary Programme in Systems and Control Engineering",
				"IDP Sys & Cntrl Engg.",
				4011,
				1411,
				1,
				"http://www.sc.iitb.ac.in/\nTel: +91-22-25767884, +91-22-2572 2545\nFax:+91-22-2572 0057\nM Tech and Ph D offered in this programme. Research ares include nonlinear control, robotics, path-planning, embedded control, coordination of autonomous vehicles, multi-agent systems, game theory, information theory, combinatorics, sliding mode control and applications, fractional-order modelling and control, optimization and optimization-based control, and stochastic processes. In addition, research in the areas of process control, identification, behavioural theory, matrix computation, automotive control are being pursued by the associate faculty members. ");
		data.put(m210.name, m210);
		Marker m211 = new Room(
				"WRCBB Wadhwani Research Centre in Biosciences and Bioengineering ",
				"Wadhwani Research Centre BB", 3934, 2241, 1,
				"Biosciences and Bioengineering Department", "Inside", "");
		data.put(m211.name, m211);
		Marker m212 = new Room(
				"Aerospace Engineering Annexe",
				"Aero Annx",
				3911,
				2171,
				1,
				"Humanities and Social Sciences Department",
				"Inside",
				"http://www.aero.iitb.ac.in/\nPhone No.: +912225764111\nFax No.: +912225722602.\nEmail: office@aero.iitb.ac.in \nThe department offers academic programs for B. Tech, M. Tech, Ph. D. Specialization are offered: Aerodynamics, Control and Guidance, Propulsion, Structures, and Systems Engineering");
		data.put(m212.name, m212);
		Marker m213 = new Room("Open Air Theatre", "OAT", 3599, 1225, 8,
				"Students Activity Centre", "Inside", "Tel: +912225768968");
		data.put(m213.name, m213);
		Marker m214 = new Room(
				"Inter-disciplinary Programme in Educational Technology",
				"IDP Edu Tech",
				3928,
				1496,
				1,
				"Mathematics Department",
				"Inside",
				"http://www.et.iitb.ac.in/\nMain Office: Mathematics Building, Near Central Library.\nTel:+912225764820\nFax: +912225764812\nPh.D. is offered in this programme. Research areas include Pan-Domain Cognitive Abilities, Teacher Use of Educational Technology Tools and Strategies, Educational Technology Tools.");
		data.put(m214.name, m214);
		Marker m215 = new Room(
				"Inter-disciplinary Programme in Climate Studies",
				"IDP Climate Studies",
				3879,
				1804,
				1,
				"Civil Engineering Department",
				"Inside",
				"http://www.climate.iitb.ac.in/\nOffice inside Civil Engineering building\nTel:+91222576 7301\nFax:+91222576 7302\nPh.D. is offered in this programme. Research areas include Climate science and technology, Technology evaluation and assessment, Impacts, Vulnerability and Adaptation");
		data.put(m215.name, m215);
		Marker m216 = new Room(
				"Inter-disciplinary Programme in Corrosion Science & Engineering",
				"IDP Corro Sci & Engg",
				3631,
				2044,
				1,
				"Metallurgical Engineering and Material Science Department",
				"Inside",
				"http://www.iitb.ac.in/~corrsci/\nOffice inside Metallurgical Engineering and Material Science building\nTel: +912225767601 / +912225767602\nPh. D and M.Tech offered in this programme. Research focuses on corrosion and its control with applications in industris such as Oil and gas industry, Marine and aerospace industry, Automobile industry, Building and constructions, General engineering industry, Power plants, etc.");
		data.put(m216.name, m216);
		Marker m217 = new Room(
				"Industrial Engineering and Operations Research",
				"IDP IEOR",
				4009,
				1645,
				1,
				"Mechanical Engineering Department",
				"Inside",
				"http://www.ieor.iitb.ac.in/\nRoom 308A, Mechanical Engineering Building,\nIndian Institute of Technology Bombay,\nPowai, Mumbai (INDIA),  PIN: 400076,   \nFax: +91-22-2572 6875, 2572 3480\nM.Tech, Dual Degree (MSc-PhD) and PhD offered in this programme. Research areas include Optimization: Models, theory and algorithms, Stochastic models, Stochastic control, Simulation Modeling and Analysis, Artificial Intelligence based methods, Game theory, Logistics and Transportation, Supply Chain, Analysis and Inventory Planning, Financial Engineering, Optimization, Planning and Control in Manufacturing and Robotics, Scheduling and ERP");
		data.put(m217.name, m217);
		Marker m218 = new Room("Aqueous corrosion lab", "Aq Corro Lab", 3631,
				2044, 12,
				"Metallurgical Engineering and Material Science Department",
				"Inside", "Tel: +912225764607");
		data.put(m218.name, m218);
		Marker m219 = new Room("Corrosion lab I", "Corro Lab I", 3631, 2044,
				12,
				"Metallurgical Engineering and Material Science Department",
				"Inside", "Tel: +912225764618");
		data.put(m219.name, m219);
		Marker m220 = new Room("Corrosion science paint lab",
				"Corro Sci Paint Lab", 3631, 2044, 12,
				"Metallurgical Engineering and Material Science Department",
				"Inside", "Tel: +912225764606");
		data.put(m220.name, m220);
		Marker m221 = new Room(
				"K.G School",
				"0",
				3883,
				2714,
				7,
				"Kendriya Vidyalaya ",
				"Inside",
				"Principal: Ms. Lata P. Jagdeesh\nhttp://www.iitb.ac.in/facilities/kgschool/\nSchool Office: +912225768991\nIn Charges Office: +912225768913\nEmail: kgschool@iitb.ac.in\nIn 1963 for the benefit of the children of the staff members staying in the campus of IIT Bombay, a School consisting of K.G. and primary classes commenced functioning from 10th June 1963. This School had one Nursery class, one Kindergarten class and one class each of I and II (4 classes). From a small number of 53 students at the start today the School has 250 children on roll, 7 teaching staff, 12 supporting staff and one office staff working with the School In Charge.\n");
		data.put(m221.name, m221);
		Marker m222 = new Marker(
				"Society for Applied Microwave Electronics Engineering & Research",
				"SAMEER ",
				4538,
				837,
				1,
				"http://www.sameer.gov.in/\nPhone: +912225727100\nFax: +912225723254\nSAMEER was set up as an autonomous R & D laboratory at Mumbai under the then Department of Electronics, Government of India with a broad mandate to undertake R & D work in the areas of Microwave Engineering and Electromagnetic Engineering Technology. It is an offshoot of the special microwave products unit (SMPU) set up in 1977 at the TATA INSTITUTE OF FUNDAMENTAL RESEARCH (TIFR), Mumbai. SAMEER, Mumbai was setup in 1984.");
		data.put(m222.name, m222);
		Marker m223 = new Marker("Sameer Hill", "0", 4830, 675, 9, "");
		data.put(m223.name, m223);
		Marker m224 = new Marker("C22, A wing, Sahyadri", "Sahyadri", 4657,
				1093, 3, "Hill side, Flat nos. 151 - 168");
		data.put(m224.name, m224);
		Marker m225 = new Marker("B21 Satpura ", "", 3332, 2602, 3, "");
		data.put(m225.name, m225);
		Marker m226 = new Marker(
				"Girish Gaitonde Building",
				"GG Bldg",
				3668,
				1937,
				1,
				"Contact persons:\nMadhumati Shetty +912225767401\nVaishali Deshpande  +912225767402\nSantosh S. Kharat +912225767402\nTanvi D. Shelatkar +912225767402");
		data.put(m226.name, m226);
		Marker m227 = new Marker(
				"Uphar",
				"0",
				4052,
				2815,
				5,
				"Upkar food joint\nBreakfast: 6:30 am to 12 pm\nLunch: 12pm to 3 pm\nEvening snacks: 4 pm to 7:30 pm");
		data.put(m227.name, m227);
		Marker m228 = new Marker("Campus Hub", "0", 2815, 1067, 5,
				"Tel:+912264909044\nOpen from 8:00 am  1:00 am");
		data.put(m228.name, m228);
		Marker m229 = new Marker("C22, B wing, Vindya", "Vindya", 4651, 1093,
				3, "Hill side, Flat nos. 169 - 186");
		data.put(m229.name, m229);
		Marker m230 = new Marker("Tulsi A", "0", 4515, 952, 3, "PS Quarters");
		data.put(m230.name, m230);
		Marker m231 = new Marker("Tulsi B", "0", 4573, 987, 3, "PS Quarters");
		data.put(m231.name, m231);
		Marker m232 = new Marker("Tulsi C", "0", 4607, 1031, 3, "PS Quarters");
		data.put(m232.name, m232);
		Marker m233 = new Marker("2B 1 ", "0", 4421, 2264, 3,
				"2B-Type Quarters, Flat nos 1 - 6");
		data.put(m233.name, m233);
		Marker m234 = new Marker("2B 2", "0", 4381, 2311, 3,
				"2B-Type Quarters, Flat nos 7 - 12");
		data.put(m234.name, m234);
		Marker m235 = new Marker("2B 3", "0", 4331, 2388, 3,
				"2B-Type Quarters, Flat nos 13 - 18");
		data.put(m235.name, m235);
		Marker m236 = new Marker("2B 4", "0", 4284, 2462, 3,
				"2B-Type Quarters, Flat nos 19 - 24");
		data.put(m236.name, m236);
		Marker m237 = new Marker("2B 5", "0", 4196, 2455, 3,
				"2B-Type Quarters, Flat nos 25 - 30");
		data.put(m237.name, m237);
		Marker m238 = new Marker("2B 6", "0", 4243, 2391, 3,
				"2B-Type Quarters, Flat nos 31 - 36");
		data.put(m238.name, m238);
		Marker m239 = new Marker("2B 7", "0", 4296, 2312, 3,
				"2B-Type Quarters, Flat nos 37 - 42");
		data.put(m239.name, m239);
		Marker m240 = new Marker("2B 8", "0", 4348, 2247, 3,
				"2B-Type Quarters, Flat nos 43 - 48");
		data.put(m240.name, m240);
		Marker m241 = new Marker("2B 9", "0", 4384, 2192, 3,
				"2B-Type Quarters, Flat nos 49 - 54");
		data.put(m241.name, m241);
		Marker m242 = new Marker("2B 11", "0", 808, 2612, 3,
				"2B-Type Quarters, Flat nos 61 - 66");
		data.put(m242.name, m242);
		Marker m243 = new Marker("2B 12", "0", 722, 2624, 3,
				"2B-Type Quarters, Flat nos 67 - 72");
		data.put(m243.name, m243);
		Marker m244 = new Marker("2B 13", "0", 691, 2555, 3,
				"2B-Type Quarters, Flat nos 73 - 78");
		data.put(m244.name, m244);
		Marker m245 = new Marker("2B 14", "0", 1144, 2866, 3,
				"2B-Type Quarters, Flat nos 79 - 84");
		data.put(m245.name, m245);
		Marker m246 = new Marker("2B 15", "0", 1076, 2833, 3,
				"2B-Type Quarters, Flat nos 85 - 90");
		data.put(m246.name, m246);
		Marker m247 = new Marker("2B 16", "0", 908, 2798, 3,
				"2B-Type Quarters, Flat nos 91 - 96");
		data.put(m247.name, m247);
		Marker m248 = new Marker("2B 17", "0", 878, 2756, 3,
				"2B-Type Quarters, Flat nos 97 - 102");
		data.put(m248.name, m248);
		Marker m249 = new Marker("2B 18", "0", 615, 2492, 3,
				"2B-Type Quarters, Flat nos 103 - 108");
		data.put(m249.name, m249);
		Marker m250 = new Marker("2B 19", "0", 2573, 2468, 3,
				"2B-Type Quarters, Flat nos 109 - 114");
		data.put(m250.name, m250);
		Marker m251 = new Marker("2B 20", "0", 4786, 1431, 3,
				"2B-Type Quarters, Flat nos 115 - 134");
		data.put(m251.name, m251);
		Marker m252 = new Marker("2B 21", "0", 4723, 1371, 3,
				"2B-Type Quarters, Flat nos 135 - 140");
		data.put(m252.name, m252);
		Marker m253 = new Marker("2B 22", "0", 4748, 1370, 3,
				"2B-Type Quarters, Flat nos 141 - 164");
		data.put(m253.name, m253);
		Marker m254 = new Marker("2B 23", "0", 4365, 1180, 3,
				"2B-Type Quarters, Flat nos 165 - 192");
		data.put(m254.name, m254);
		Marker m255 = new Marker("2B 24", "0", 4124, 1238, 3,
				"2B-Type Quarters, Flat nos 193 - 220");
		data.put(m255.name, m255);
		Marker m256 = new Marker("A2 Bungalow", "0", 2491, 2581, 3,
				"A-Type Bungalow");
		data.put(m256.name, m256);
		Marker m257 = new Marker("A3 Bungalow", "0", 2415, 2682, 3,
				"A-Type Bungalow");
		data.put(m257.name, m257);
		Marker m258 = new Marker("A4 Bungalow", "0", 2373, 2767, 3,
				"A-Type Bungalow");
		data.put(m258.name, m258);
		Marker m259 = new Marker("A5 Bungalow", "0", 2319, 2848, 3,
				"A-Type Bungalow");
		data.put(m259.name, m259);
		Marker m260 = new Marker("A6 Bungalow", "0", 2254, 2963, 3,
				"A-Type Bungalow");
		data.put(m260.name, m260);
		Marker m261 = new Marker("A7 Bungalow", "0", 2211, 3055, 3,
				"A-Type Bungalow");
		data.put(m261.name, m261);
		Marker m262 = new Marker("A8 Bungalow", "0", 2176, 3135, 3,
				"A-Type Bungalow");
		data.put(m262.name, m262);
		Marker m263 = new Marker("A9 Bungalow", "0", 1888, 2960, 3,
				"A-Type Bungalow");
		data.put(m263.name, m263);
		Marker m264 = new Marker("A10 Bungalow", "0", 1962, 2928, 3,
				"A-Type Bungalow");
		data.put(m264.name, m264);
		Marker m265 = new Marker("A11 Bungalow", "0", 2074, 2885, 3,
				"A-Type Bungalow");
		data.put(m265.name, m265);
		Marker m266 = new Marker("A12 Bungalow", "0", 2157, 2855, 3,
				"A-Type Bungalow");
		data.put(m266.name, m266);
		Marker m267 = new Marker("A13 Bungalow", "0", 2536, 2374, 3,
				"A-Type Bungalow");
		data.put(m267.name, m267);
		Marker m268 = new Marker("A14 Bungalow", "0", 3950, 1273, 3,
				"A-Type Bungalow");
		data.put(m268.name, m268);
		Marker m269 = new Marker("A15 Bungalow", "0", 4017, 1243, 3,
				"A-Type Bungalow");
		data.put(m269.name, m269);
		Marker m270 = new Marker("A16 Bungalow", "0", 4085, 1210, 3,
				"A-Type Bungalow");
		data.put(m270.name, m270);
		Marker m271 = new Marker("A17 Bungalow", "0", 4155, 1175, 3,
				"A-Type Bungalow");
		data.put(m271.name, m271);
		Marker m272 = new Marker("A18 Bungalow", "0", 4220, 1142, 3,
				"A-Type Bungalow");
		data.put(m272.name, m272);
		Marker m273 = new Marker("A19 Bungalow", "0", 4280, 1110, 3,
				"A-Type Bungalow");
		data.put(m273.name, m273);
		Marker m274 = new Marker("B1", "0", 2680, 2368, 3,
				"B-Type Quarters Flat nos. 1 - 6");
		data.put(m274.name, m274);
		Marker m275 = new Marker("B2", "0", 2848, 2685, 3,
				"B-Type Quarters Flat nos. 7 - 10");
		data.put(m275.name, m275);
		Marker m276 = new Marker("B3", "0", 2797, 2820, 3,
				"B-Type Quarters Flat nos. 11 - 14");
		data.put(m276.name, m276);
		Marker m277 = new Marker("B4", "0", 2743, 2947, 3,
				"B-Type Quarters Flat nos. 15 - 18");
		data.put(m277.name, m277);
		Marker m278 = new Marker("B5", "0", 2687, 3079, 3,
				"B-Type Quarters Flat nos. 19 - 22");
		data.put(m278.name, m278);
		Marker m279 = new Marker("B6", "0", 2508, 3189, 3,
				"B-Type Quarters Flat nos. 23 - 26");
		data.put(m279.name, m279);
		Marker m280 = new Marker("B7", "0", 2529, 3009, 3,
				"B-Type Quarters Flat nos. 27 - 30");
		data.put(m280.name, m280);
		Marker m281 = new Marker("B8", "0", 2600, 2867, 3,
				"B-Type Quarters Flat nos. 31 - 34");
		data.put(m281.name, m281);
		Marker m282 = new Marker("B9", "0", 2653, 2748, 3,
				"B-Type Quarters Flat nos. 35 - 38");
		data.put(m282.name, m282);
		Marker m283 = new Marker("B10", "0", 2726, 2634, 3,
				"B-Type Quarters Flat nos. 39 - 42");
		data.put(m283.name, m283);
		Marker m284 = new Marker("B11", "0", 2232, 2552, 3,
				"B-Type Quarters Flat nos. 43 - 46");
		data.put(m284.name, m284);
		Marker m285 = new Marker("B12", "0", 2080, 2631, 3,
				"B-Type Quarters Flat nos. 47 - 50");
		data.put(m285.name, m285);
		Marker m286 = new Marker("B13", "0", 2356, 2478, 3,
				"B-Type Quarters Flat nos. 51 - 54");
		data.put(m286.name, m286);
		Marker m287 = new Marker("B14", "0", 2470, 2291, 3,
				"B-Type Quarters Flat nos. 55 - 58");
		data.put(m287.name, m287);
		Marker m288 = new Marker("B15", "0", 2192, 2665, 3,
				"B-Type Quarters Flat nos. 59 - 62");
		data.put(m288.name, m288);
		Marker m289 = new Marker("B16", "0", 2085, 2719, 3,
				"B-Type Quarters Flat nos. 63 - 66");
		data.put(m289.name, m289);
		Marker m290 = new Marker("B17", "0", 3040, 2461, 3,
				"B-Type Quarters Flat nos. 67 - 72");
		data.put(m290.name, m290);
		Marker m291 = new Marker("B18", "0", 3159, 2368, 3,
				"B-Type Quarters Flat nos. 73 - 74 and 73A - 74A ");
		data.put(m291.name, m291);
		Marker m292 = new Marker("BTR Building  A & B", "BTR A & B", 2002,
				3087, 3, "BTR Quarters");
		data.put(m292.name, m292);
		Marker m293 = new Marker("C2", "0", 3108, 2552, 3,
				"C-Type Quarters Flat nos. 13 - 18");
		data.put(m293.name, m293);
		Marker m294 = new Marker("C5", "0", 3464, 2708, 3,
				"C-Type Quarters Flat nos. 31 - 36");
		data.put(m294.name, m294);
		Marker m295 = new Marker("C6", "0", 3547, 2771, 3,
				"C-Type Quarters Flat nos. 37 - 42");
		data.put(m295.name, m295);
		Marker m296 = new Marker("C7", "0", 3440, 2787, 3,
				"C-Type Quarters Flat nos. 43 - 48");
		data.put(m296.name, m296);
		Marker m297 = new Marker("C8", "0", 3078, 2878, 3,
				"C-Type Quarters Flat nos. 49 - 54");
		data.put(m297.name, m297);
		Marker m298 = new Marker("C9", "0", 2904, 2910, 3,
				"C-Type Quarters Flat nos. 55 - 60");
		data.put(m298.name, m298);
		Marker m299 = new Marker("C10", "0", 2944, 2820, 3,
				"C-Type Quarters Flat nos. 61 - 66");
		data.put(m299.name, m299);
		Marker m300 = new Marker("C11", "0", 2832, 3131, 3,
				"C-Type Quarters Flat nos. 67 - 72");
		data.put(m300.name, m300);
		Marker m301 = new Marker("C12", "0", 2867, 3006, 3,
				"C-Type Quarters Flat nos. 73 - 78");
		data.put(m301.name, m301);
		Marker m302 = new Marker("C13", "0", 2974, 3070, 3,
				"C-Type Quarters Flat nos. 79 - 84");
		data.put(m302.name, m302);
		Marker m303 = new Marker("C14", "0", 3140, 3047, 3,
				"C-Type Quarters Flat nos. 85 - 90");
		data.put(m303.name, m303);
		Marker m304 = new Marker("C15", "0", 3360, 3033, 3,
				"C-Type Quarters Flat nos. 91 - 96");
		data.put(m304.name, m304);
		Marker m305 = new Marker("C16", "0", 3162, 2991, 3,
				"C-Type Quarters Flat nos. 97 - 102");
		data.put(m305.name, m305);
		Marker m306 = new Marker("C17", "0", 3453, 2987, 3,
				"C-Type Quarters Flat nos. 103 - 108");
		data.put(m306.name, m306);
		Marker m307 = new Marker("C18", "0", 3537, 2963, 3,
				"C-Type Quarters Flat nos. 109 - 114");
		data.put(m307.name, m307);
		Marker m308 = new Marker("CSRE A, B, C", "0", 4275, 1177, 3,
				"CSRE Quarters");
		data.put(m308.name, m308);
		Marker m309 = new Marker("CTR 19", "0", 1815, 3040, 3,
				"CTR Quarters Flat nos. 115 - 126");
		data.put(m309.name, m309);
		Marker m310 = new Marker("CTR 20", "0", 1749, 2959, 3,
				"CTR Quarters Flat nos. 127 - 138");
		data.put(m310.name, m310);
		Marker m311 = new Marker("H1 1", "0", 866, 2684, 3,
				"H1 Type Quarters Flat nos. 1 - 12");
		data.put(m311.name, m311);
		Marker m312 = new Marker("H1 2", "0", 910, 2613, 3,
				"H1 Type Quarters Flat nos. 13 - 24");
		data.put(m312.name, m312);
		Marker m313 = new Marker("H1 3", "0", 867, 2575, 3,
				"H1 Type Quarters Flat nos. 25 - 36");
		data.put(m313.name, m313);
		Marker m314 = new Marker("H1 4", "0", 812, 2560, 3,
				"H1 Type Quarters Flat nos. 37 - 48");
		data.put(m314.name, m314);
		Marker m315 = new Marker("H1 5", "0", 4552, 1173, 3,
				"H1 Type Quarters Flat nos. 49 - 60");
		data.put(m315.name, m315);
		Marker m316 = new Marker("H1 6", "0", 4468, 1189, 3,
				"H1 Type Quarters Flat nos. 61 - 72");
		data.put(m316.name, m316);
		Marker m317 = new Marker("H1 7", "0", 4542, 1238, 3,
				"H1 Type Quarters Flat nos. 73 - 84");
		data.put(m317.name, m317);
		Marker m318 = new Marker("H1 8", "0", 4442, 1239, 3,
				"H1 Type Quarters Flat nos. 85 - 96");
		data.put(m318.name, m318);
		Marker m319 = new Marker("H1 9", "0", 640, 2329, 3,
				"H1 Type Quarters Flat nos. 97 - 108");
		data.put(m319.name, m319);
		Marker m320 = new Marker("H1 10", "0", 703, 2275, 3,
				"H1 Type Quarters Flat nos. 109 - 120");
		data.put(m320.name, m320);
		Marker m321 = new Marker("H1 11", "0", 849, 2249, 3,
				"H1 Type Quarters Flat nos. 121 - 134");
		data.put(m321.name, m321);
		Marker m322 = new Marker("H1 12", "0", 4747, 1173, 3,
				"H1 Type Quarters Flat nos. 135 - 151");
		data.put(m322.name, m322);
		Marker m323 = new Marker("H1 13", "0", 4786, 1218, 3,
				"H1 Type Quarters Flat nos. 152 - 168");
		data.put(m323.name, m323);
		Marker m324 = new Marker("H1 14", "0", 4645, 1407, 3,
				"H1 Type Quarters Flat nos. 169 - 176 and 1A - 2A");
		data.put(m324.name, m324);
		Marker m325 = new Marker("H1 BB", "0", 921, 2122, 3,
				"H1 BB Type Quarters Flat nos. 1 - 26");
		data.put(m325.name, m325);
		Marker m326 = new Marker("H2 1", "0", 1257, 2812, 3,
				"H2 Type Quarters Flat nos. 1 - 8");
		data.put(m326.name, m326);
		Marker m327 = new Marker("H2 2", "0", 1344, 2832, 3,
				"H2 Type Quarters Flat nos. 9 - 16");
		data.put(m327.name, m327);
		Marker m328 = new Marker("H2 3", "0", 1417, 2797, 3,
				"H2 Type Quarters Flat nos. 17 - 24");
		data.put(m328.name, m328);
		Marker m329 = new Marker("H2 4", "0", 1187, 2785, 3,
				"H2 Type Quarters Flat nos. 25 - 32");
		data.put(m329.name, m329);
		Marker m330 = new Marker("H2 5", "0", 1302, 2738, 3,
				"H2 Type Quarters Flat nos. 33 - 40");
		data.put(m330.name, m330);
		Marker m331 = new Marker("H2 6", "0", 1101, 2774, 3,
				"H2 Type Quarters Flat nos. 41 - 48");
		data.put(m331.name, m331);
		Marker m332 = new Marker("H2 7", "0", 1211, 2702, 3,
				"H2 Type Quarters Flat nos. 49 - 56");
		data.put(m332.name, m332);
		Marker m333 = new Marker("H2 8", "0", 1059, 2719, 3,
				"H2 Type Quarters Flat nos. 57 - 64");
		data.put(m333.name, m333);
		Marker m334 = new Marker("H2 9", "0", 1145, 2682, 3,
				"H2 Type Quarters Flat nos. 65 - 72");
		data.put(m334.name, m334);
		Marker m335 = new Marker("H2 10", "0", 978, 2702, 3,
				"H2 Type Quarters Flat nos. 73 - 80");
		data.put(m335.name, m335);
		Marker m336 = new Marker("H2 11", "0", 1049, 2666, 3,
				"H2 Type Quarters Flat nos. 81 - 88");
		data.put(m336.name, m336);
		Marker m337 = new Marker("H2 12", "0", 960, 2640, 3,
				"H2 Type Quarters Flat nos. 89 - 96");
		data.put(m337.name, m337);
		Marker m338 = new Marker("H2 13", "0", 753, 2520, 3,
				"H2 Type Quarters Flat nos. 97 - 104");
		data.put(m338.name, m338);
		Marker m339 = new Marker("H2 14", "0", 717, 2510, 3,
				"H2 Type Quarters Flat nos. 105 - 112");
		data.put(m339.name, m339);
		Marker m340 = new Marker("H2 15", "0", 695, 2461, 3,
				"H2 Type Quarters Flat nos. 113 - 120");
		data.put(m340.name, m340);
		Marker m341 = new Marker("H2 16", "0", 774, 2412, 3,
				"H2 Type Quarters Flat nos. 121 - 128");
		data.put(m341.name, m341);
		Marker m342 = new Marker("H2 17", "0", 3110, 1832, 3,
				"H2 Type Quarters Flat nos. 129 - 136");
		data.put(m342.name, m342);
		Marker m343 = new Marker("H2 18", "0", 4451, 1320, 3,
				"H2 Type Quarters Flat nos. 137 - 144");
		data.put(m343.name, m343);
		Marker m344 = new Marker("H2 19", "0", 4377, 1329, 3,
				"H2 Type Quarters Flat nos. 145 - 152");
		data.put(m344.name, m344);
		Marker m345 = new Marker("H2 20", "0", 4307, 1320, 3,
				"H2 Type Quarters Flat nos. 153 - 160");
		data.put(m345.name, m345);
		Marker m346 = new Marker("H2 21", "0", 4304, 1260, 3,
				"H2 Type Quarters Flat nos. 161 - 168");
		data.put(m346.name, m346);
		Marker m347 = new Marker("H2 22", "0", 4231, 1259, 3,
				"H2 Type Quarters Flat nos. 169 - 176");
		data.put(m347.name, m347);
		Marker m348 = new Marker("H2 24", "0", 522, 2424, 3,
				"H2 Type Quarters Flat nos. 185 - 192");
		data.put(m348.name, m348);
		Marker m349 = new Marker("H2 25", "0", 568, 2377, 3,
				"H2 Type Quarters Flat nos. 193 - 200");
		data.put(m349.name, m349);
		Marker m350 = new Marker("H2 26", "0", 746, 2246, 3,
				"H2 Type Quarters Flat nos. 201 - 208");
		data.put(m350.name, m350);
		Marker m351 = new Marker("H2 27", "0", 793, 2214, 3,
				"H2 Type Quarters Flat nos. 209 - 216");
		data.put(m351.name, m351);
		Marker m352 = new Marker("H2 28", "0", 4193, 1295, 3,
				"H2 Type Quarters Flat nos. 217 - 232");
		data.put(m352.name, m352);
		Marker m353 = new Marker("H2 29", "0", 691, 2410, 3,
				"H2 Type Quarters ");
		data.put(m353.name, m353);
		Marker m354 = new Marker("H2 BB", "0", 840, 2180, 3,
				"H2 BB Type Quarters Flat nos. 1 - 18");
		data.put(m354.name, m354);
		Marker m355 = new Marker("KV 1", "0", 3592, 2817, 3, "KV Quarters");
		data.put(m355.name, m355);
		Marker m356 = new Marker("KV 2", "0", 3498, 2854, 3, "KV Quarters");
		data.put(m356.name, m356);
		Marker m357 = new Marker("MW 1", "0", 4267, 752, 3, "MW Quarters");
		data.put(m357.name, m357);
		Marker m358 = new Marker("MW 2", "0", 4124, 780, 3, "MW Quarters");
		data.put(m358.name, m358);
		Marker m359 = new Marker("Type1 1", "0", 4113, 2583, 3,
				"Type 1 Quarters Flat nos. 1 - 12");
		data.put(m359.name, m359);
		Marker m360 = new Marker("Type1 2", "0", 4214, 2586, 3,
				"Type 1 Quarters Flat nos. 13 - 24");
		data.put(m360.name, m360);
		Marker m361 = new Marker("Type1 3", "0", 4177, 2652, 3,
				"Type 1 Quarters Flat nos. 25 - 36");
		data.put(m361.name, m361);
		Marker m362 = new Marker("Type1 4", "0", 4067, 2658, 3,
				"Type 1 Quarters Flat nos. 37 - 48");
		data.put(m362.name, m362);
		Marker m363 = new Marker("Type1 6", "0", 4660, 1367, 3,
				"Type 1 Quarters Flat nos. 61 - 72");
		data.put(m363.name, m363);
		Marker m364 = new Marker("Type1 7", "0", 4600, 1351, 3,
				"Type 1 Quarters Flat nos. 73 - 84");
		data.put(m364.name, m364);
		Marker m365 = new Marker("Type1 8", "0", 4616, 1271, 3,
				"Type 1 Quarters Flat nos. 85 - 96");
		data.put(m365.name, m365);
		Marker m366 = new Marker("Type1 9", "0", 4675, 1293, 3,
				"Type 1 Quarters Flat nos. 97 - 108");
		data.put(m366.name, m366);
		Marker m367 = new Marker("Type1 10", "0", 4373, 758, 3, "");
		data.put(m367.name, m367);
		Marker m368 = new Marker("Type1 11", "0", 3354, 812, 3,
				"Type 1 Quarters Flat nos. 121 - 132");
		data.put(m368.name, m368);
		Marker m369 = new Marker("Type1 13", "0", 4637, 1237, 3, "");
		data.put(m369.name, m369);
		Marker m370 = new Marker("Type1 14", "0", 4670, 1198, 3, "");
		data.put(m370.name, m370);
		Marker m371 = new Marker("Type1 15", "0", 3151, 1798, 3, "");
		data.put(m371.name, m371);
		Marker m372 = new Marker("Type1 16", "0", 4713, 1252, 3, "");
		data.put(m372.name, m372);
		Marker m373 = new Marker("Type1 17", "0", 4785, 1290, 3, "");
		data.put(m373.name, m373);
		Marker m374 = new Marker("Type1 18", "0", 4801, 1269, 3, "");
		data.put(m374.name, m374);
		Marker m375 = new Marker("Type1 19", "0", 4340, 815, 3, "");
		data.put(m375.name, m375);
		Marker m376 = new Marker("Type1 20", "0", 4328, 871, 3, "");
		data.put(m376.name, m376);
		Marker m377 = new Marker("Type1 21", "0", 4521, 1346, 3,
				"Type 1 Quarters Flat nos. 290 - 300");
		data.put(m377.name, m377);
		Marker m378 = new Marker("Type1 22", "0", 2565, 680, 3,
				"Type 1 Quarters Flat nos. 310 - 321");
		data.put(m378.name, m378);
		Marker m379 = new Marker("QIP 1", "0", 4830, 1376, 3,
				"QIP Quarters Flat nos. 1 - 16");
		data.put(m379.name, m379);
		Marker m380 = new Marker("QIP 2", "0", 4869, 1328, 3,
				"QIP Quarters Flat nos. 17 - 35");
		data.put(m380.name, m380);

		data.get("Convocation Hall").showDefault = true;
		data.get("Hostel 13").showDefault = true;
		data.get("Hostel 15").showDefault = true;
		data.get("Main Gate").showDefault = true;
		data.get("Market Gate, Y point Gate").showDefault = true;
		data.get("Canara Bank").showDefault = true;
		data.get("Convocation Hall").showDefault = true;
	}
}