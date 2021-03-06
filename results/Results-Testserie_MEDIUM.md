<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[Evaluation Overview, all Databases, Test Series MEDIUM](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) | [MongoDB](#MongoDB) | [ArangoDB](#ArangoDB) |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 19.80 ms | 131.28 ms | 542.26 ms | **4.89 ms** | Error | 7.42 ms | 185.46 ms |
| Load |  | 4.87E5 ms | 4.47E5 ms | 6.13E5 ms | **2.12E5 ms** | Error | 6.88E5 ms | 8.61E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 15549.49 ms</font> |<font color="#C0C0C0"> 16427.42 ms</font> |<font color="#C0C0C0"> **4591.04 ms**</font> |<font color="#C0C0C0"> 7599.10 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 15847.46 ms</font> |<font color="#C0C0C0"> 58226.17 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.73 ms | **0.52 ms** | 1.21 ms | 9382.19 ms | Error | 999.25 ms | 3235.56 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **3300.80 ms**</font> |<font color="#C0C0C0"> 11481.62 ms</font> |<font color="#C0C0C0"> 3814.14 ms</font> |<font color="#C0C0C0"> 4082.31 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 12924.41 ms</font> |<font color="#C0C0C0"> 57183.48 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 2.23 ms | **1.68 ms** | 2.17 ms | 1.89E5 ms | Error | 9527.43 ms | 32524.25 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3950.24 ms</font> |<font color="#C0C0C0"> 10487.82 ms</font> |<font color="#C0C0C0"> **3793.26 ms**</font> |<font color="#C0C0C0"> 7698.99 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 12830.62 ms</font> |<font color="#C0C0C0"> 56942.40 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 10.85 ms | **2.59 ms** | 3.91 ms | 1.37E6 ms | Error | 99333.86 ms | 3.23E5 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.62 ms</font> |<font color="#C0C0C0"> 5657.30 ms</font> |<font color="#C0C0C0"> 3302.00 ms</font> |<font color="#C0C0C0"> 6.06 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 3958.27 ms | 795.35 ms | 1138.18 ms | **737.28 ms** | Error | 4043.91 ms | 5209.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.90 ms</font> |<font color="#C0C0C0"> 6328.80 ms</font> |<font color="#C0C0C0"> 3290.99 ms</font> |<font color="#C0C0C0"> 2.54 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3992.14 ms | 838.87 ms | 1174.99 ms | **724.22 ms** | Error | 3870.72 ms | 5229.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.52 ms</font> |<font color="#C0C0C0"> 6177.23 ms</font> |<font color="#C0C0C0"> 3416.82 ms</font> |<font color="#C0C0C0"> 2.46 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 4273.47 ms | **1112.13 ms** | 1592.18 ms | 3018.93 ms | Error | 5229.01 ms | 8573.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.93 ms</font> |<font color="#C0C0C0"> 9436.19 ms</font> |<font color="#C0C0C0"> 5484.88 ms</font> |<font color="#C0C0C0"> 2.72 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3992.82 ms | 5587.86 ms | **975.43 ms** | 2456.79 ms | Error | 3063.77 ms | 8667.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.83 ms</font> |<font color="#C0C0C0"> 9695.52 ms</font> |<font color="#C0C0C0"> 5048.58 ms</font> |<font color="#C0C0C0"> 2.34 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 4269.83 ms | 5626.93 ms | **1034.89 ms** | 2489.62 ms | Error | 2758.35 ms | 8746.80 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.98 ms</font> |<font color="#C0C0C0"> 9649.27 ms</font> |<font color="#C0C0C0"> 5204.96 ms</font> |<font color="#C0C0C0"> 1.84 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 4025.16 ms | 5580.76 ms | **1010.88 ms** | 2562.25 ms | Error | 2920.50 ms | 8668.04 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.33 ms</font> |<font color="#C0C0C0"> 7273.73 ms</font> |<font color="#C0C0C0"> 4308.43 ms</font> |<font color="#C0C0C0"> 9.11 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 26747.31 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3842.06 ms | 4965.95 ms | 1989.96 ms | 3.42E5 ms | Error | 3676.14 ms | **1140.15 ms** |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.35 ms</font> |<font color="#C0C0C0"> 4.47 ms</font> |<font color="#C0C0C0"> 2237.44 ms</font> |<font color="#C0C0C0"> 9.23 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 25422.12 ms | 27719.41 ms | 29016.58 ms | 9.01E6 ms | Error | **15985.97 ms** | 79574.47 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.26 ms</font> |<font color="#C0C0C0"> 4.08 ms</font> |<font color="#C0C0C0"> 6118.23 ms</font> |<font color="#C0C0C0"> 14.56 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4796.04 ms | 5815.28 ms | **2164.36 ms** | 3.52E5 ms | Error | 4907.33 ms | 14780.01 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.63E5 ms</font> |<font color="#C0C0C0"> 4.13E5 ms</font> |<font color="#C0C0C0"> 5319.84 ms</font> |<font color="#C0C0C0"> **1398.54 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 3626.48 ms</font> |<font color="#C0C0C0"> 1.21E6 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 69.35 ms | 32.01 ms | **0.82 ms** | 2.30 ms | Error | 7374.98 ms | 1993.19 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2057.81 ms</font> |<font color="#C0C0C0"> 2781.29 ms</font> |<font color="#C0C0C0"> **1386.84 ms**</font> |<font color="#C0C0C0"> 1456.04 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 3878.45 ms</font> |<font color="#C0C0C0"> 26666.50 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 119.51 ms | 81.21 ms | **0.90 ms** | 27.33 ms | Error | 87055.70 ms | 16144.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1883.00 ms</font> |<font color="#C0C0C0"> 2668.29 ms</font> |<font color="#C0C0C0"> **1359.20 ms**</font> |<font color="#C0C0C0"> 1497.29 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 3824.36 ms</font> |<font color="#C0C0C0"> 54174.19 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1702.85 ms | 1436.59 ms | 2412.83 ms | **336.56 ms** | Error | 7.24E5 ms | 1.49E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 7.26 ms</font> |<font color="#C0C0C0"> 4.11 ms</font> |<font color="#C0C0C0"> 10.58 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.14 ms | **0.99 ms** | 25215.62 ms | Error | Error | 17724.65 ms | 3.44E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.15 ms</font> |<font color="#C0C0C0"> 4678.78 ms</font> |<font color="#C0C0C0"> 3456.47 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **21181.29 ms** | 23606.17 ms | 1.69E5 ms | Error | Error | 2.33E5 ms | 3.35E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 7.29 ms</font> |<font color="#C0C0C0"> 6.13 ms</font> |<font color="#C0C0C0"> 4841.35 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **66071.02 ms** | 77057.79 ms | 5.04E5 ms | Error | Error | 66910.28 ms | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.33 ms</font> |<font color="#C0C0C0"> 4.08 ms</font> |<font color="#C0C0C0"> 24.04 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 13795.24 ms | 17329.30 ms | **57.96 ms** | Error | Error | 15041.54 ms | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.72 ms</font> |<font color="#C0C0C0"> 8249.80 ms</font> |<font color="#C0C0C0"> 3809.45 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 17342.08 ms | 25041.33 ms | 1.57E5 ms | Error | Error | **15549.93 ms** | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 6.50 ms</font> |<font color="#C0C0C0"> 5910.08 ms</font> |<font color="#C0C0C0"> 5607.18 ms</font> |<font color="#C0C0C0"> 179.28 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3341.25 ms | **2984.77 ms** | 12806.84 ms | 50413.15 ms | Error | 3800.26 ms | Error |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.72 ms</font> |<font color="#C0C0C0"> 5132.60 ms</font> |<font color="#C0C0C0"> 3404.44 ms</font> |<font color="#C0C0C0"> 7.33 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7494.29 ms | 15184.78 ms | 15042.79 ms | **2.57 ms** | Error | 16511.32 ms | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.85 ms</font> |<font color="#C0C0C0"> 323.05 ms</font> |<font color="#C0C0C0"> 1920.53 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 281.05 ms | 217.26 ms | **97.68 ms** | Error | Error | 659.22 ms | Error |

# <a name="toc"></a>[Table of contents](#toc)

- [Evaluation Overview](#overview)
- [Test Series Datasets](#testseriesinformation)
- Evaluation Details
    - [sqlite4java](#sqlite4java)
    - [SQLite-Xerial](#SQLite-Xerial)
    - [PostgreSQL](#PostgreSQL)
    - [Virtuoso](#Virtuoso)
    - [Fuseki](#Fuseki)
    - [MongoDB](#MongoDB)
    - [ArangoDB](#ArangoDB)

## <a name="testseriesinformation"></a>[Test Series Datasets](#testseriesinformation)

| Test Series MEDIUM | Dataset Size |
| :-- | --: |
| hebis_10147116_13050073_rdf_gz | 206.285 MB |

## <a name="sqlite4java"></a>[Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series MEDIUM](#sqlite4java)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 19.80 ms |
| Load || 4.87E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15549.49 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 7.74 ms | 0.27 ms | 0.20 ms | 2.73 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3300.80 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 4.67 ms | 1.52 ms | 0.50 ms | 2.23 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3950.24 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 27.96 ms | 2.22 ms | 2.38 ms | 10.85 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.62 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 4091.66 ms | 3925.19 ms | 3857.96 ms | 3958.27 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.90 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3940.71 ms | 3940.56 ms | 4095.16 ms | 3992.14 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.52 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 4372.55 ms | 4272.08 ms | 4175.79 ms | 4273.47 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.93 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3916.88 ms | 4104.62 ms | 3956.97 ms | 3992.82 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.83 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 4239.59 ms | 4456.20 ms | 4113.70 ms | 4269.83 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.98 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 4025.15 ms | 4002.77 ms | 4047.56 ms | 4025.16 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.33 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3896.76 ms | 3810.43 ms | 3818.99 ms | 3842.06 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.35 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 24721.64 ms | 26283.99 ms | 25260.73 ms | 25422.12 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.26 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4780.61 ms | 4891.59 ms | 4715.94 ms | 4796.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.63E5 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 137.51 ms | 35.70 ms | 34.84 ms | 69.35 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2057.81 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 211.34 ms | 72.80 ms | 74.39 ms | 119.51 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1883.00 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1920.72 ms | 1580.46 ms | 1607.38 ms | 1702.85 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.26 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.14 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.15 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 21181.29 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.29 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 66071.02 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.33 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 13795.24 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.72 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 17342.08 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.50 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3341.25 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.72 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7494.29 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.85 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 281.05 ms |

## <a name="SQLite-Xerial"></a>[Evaluation Details for SQLite-Xerial, Version 3.8.11, Test Series MEDIUM](#SQLite-Xerial)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 131.28 ms |
| Load || 4.47E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16427.42 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.21 ms | 0.20 ms | 0.17 ms | 0.52 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11481.62 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 3.39 ms | 0.93 ms | 0.73 ms | 1.68 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10487.82 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.06 ms | 2.28 ms | 2.41 ms | 2.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5657.30 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 788.82 ms | 810.48 ms | 786.76 ms | 795.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6328.80 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 838.30 ms | 839.70 ms | 838.60 ms | 838.87 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6177.23 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1136.18 ms | 1115.80 ms | 1084.41 ms | 1112.13 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9436.19 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 5656.21 ms | 5577.21 ms | 5530.15 ms | 5587.86 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9695.52 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 5786.55 ms | 5513.64 ms | 5580.60 ms | 5626.93 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9649.27 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 5655.68 ms | 5536.46 ms | 5550.16 ms | 5580.76 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7273.73 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4967.76 ms | 4846.15 ms | 5083.95 ms | 4965.95 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.47 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 27866.32 ms | 27506.99 ms | 27784.92 ms | 27719.41 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.08 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 5937.04 ms | 5730.20 ms | 5778.59 ms | 5815.28 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.13E5 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 35.12 ms | 28.02 ms | 32.89 ms | 32.01 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2781.29 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 89.91 ms | 81.11 ms | 72.60 ms | 81.21 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2668.29 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1457.29 ms | 1418.60 ms | 1433.86 ms | 1436.59 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.11 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.99 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4678.78 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 23606.17 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.13 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 77057.79 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.08 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 17329.30 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8249.80 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 25041.33 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5910.08 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2984.77 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5132.60 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 15184.78 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">323.05 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 217.26 ms |

## <a name="PostgreSQL"></a>[Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series MEDIUM](#PostgreSQL)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 542.26 ms |
| Load || 6.13E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4591.04 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.43 ms | 0.57 ms | 0.63 ms | 1.21 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3814.14 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 3.84 ms | 1.42 ms | 1.26 ms | 2.17 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3793.26 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 5.50 ms | 3.11 ms | 3.11 ms | 3.91 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3302.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1339.26 ms | 1038.67 ms | 1036.60 ms | 1138.18 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3290.99 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 1327.32 ms | 1075.72 ms | 1121.94 ms | 1174.99 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3416.82 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1820.37 ms | 1520.27 ms | 1435.92 ms | 1592.18 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5484.88 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1287.32 ms | 813.11 ms | 825.87 ms | 975.43 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5048.58 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1213.48 ms | 990.76 ms | 900.43 ms | 1034.89 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5204.96 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1300.03 ms | 896.77 ms | 835.86 ms | 1010.88 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4308.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2236.56 ms | 1893.35 ms | 1839.98 ms | 1989.96 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2237.44 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 34506.99 ms | 28414.42 ms | 24128.33 ms | 29016.58 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6118.23 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2459.65 ms | 2031.49 ms | 2001.93 ms | 2164.36 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5319.84 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 1.28 ms | 0.60 ms | 0.58 ms | 0.82 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1386.84 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 1.36 ms | 0.64 ms | 0.69 ms | 0.90 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1359.20 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 3638.70 ms | 3533.27 ms | 66.53 ms | 2412.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.58 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 25215.62 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3456.47 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.69E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4841.35 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 5.04E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">24.04 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 57.96 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3809.45 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1.57E5 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5607.18 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 12806.84 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3404.44 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 15042.79 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1920.53 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 97.68 ms |

## <a name="Virtuoso"></a>[Evaluation Details for Virtuoso, Version 07.20.3214 / Virtuoso JDBC 4.1, Test Series MEDIUM](#Virtuoso)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 4.89 ms |
| Load || 2.12E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7599.10 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 13874.17 ms | 7202.89 ms | 7069.50 ms | 9382.19 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4082.31 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.66E5 ms | 1.94E5 ms | 2.06E5 ms | 1.89E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7698.99 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.51E6 ms | 1.30E6 ms | 1.30E6 ms | 1.37E6 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.06 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 760.02 ms | 729.15 ms | 722.66 ms | 737.28 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.54 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 715.86 ms | 727.20 ms | 729.60 ms | 724.22 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.46 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 3133.11 ms | 2925.65 ms | 2998.03 ms | 3018.93 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.72 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2433.03 ms | 2449.24 ms | 2488.10 ms | 2456.79 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.34 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2494.96 ms | 2484.53 ms | 2489.37 ms | 2489.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.84 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2559.47 ms | 2574.13 ms | 2553.15 ms | 2562.25 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.11 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.64E5 ms | 3.42E5 ms | 3.18E5 ms | 3.42E5 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.23 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 9.01E6 ms | Error | Error | 9.01E6 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.56 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.58E5 ms | 3.49E5 ms | 3.49E5 ms | 3.52E5 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1398.54 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 5.02 ms | 0.93 ms | 0.95 ms | 2.30 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1456.04 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 28.82 ms | 28.72 ms | 24.44 ms | 27.33 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1497.29 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 459.45 ms | 278.16 ms | 272.06 ms | 336.56 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">179.28 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 50413.15 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.33 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.57 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | Error |

## <a name="Fuseki"></a>[Evaluation Details for Fuseki, Version 2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0, Test Series MEDIUM](#Fuseki)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || Error |
| Load || Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | Error |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | Error |

## <a name="MongoDB"></a>[Evaluation Details for MongoDB, Version 3.0.6, Test Series MEDIUM](#MongoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 7.42 ms |
| Load || 6.88E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15847.46 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1064.41 ms | 940.48 ms | 992.86 ms | 999.25 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12924.41 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 9480.23 ms | 9674.86 ms | 9427.21 ms | 9527.43 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12830.62 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 98832.38 ms | 99950.01 ms | 99219.20 ms | 99333.86 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 4166.53 ms | 4162.24 ms | 3802.95 ms | 4043.91 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3851.31 ms | 3842.43 ms | 3918.42 ms | 3870.72 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 5047.42 ms | 5338.55 ms | 5301.05 ms | 5229.01 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3121.95 ms | 3083.72 ms | 2985.64 ms | 3063.77 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2867.48 ms | 2687.86 ms | 2719.70 ms | 2758.35 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2800.85 ms | 2847.12 ms | 3113.52 ms | 2920.50 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3642.24 ms | 3765.52 ms | 3620.67 ms | 3676.14 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16023.49 ms | 16218.87 ms | 15715.56 ms | 15985.97 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4753.62 ms | 5081.69 ms | 4886.67 ms | 4907.33 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3626.48 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 7385.30 ms | 7368.93 ms | 7370.72 ms | 7374.98 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3878.45 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 83988.05 ms | 86836.24 ms | 90342.80 ms | 87055.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3824.36 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 7.25E5 ms | 7.08E5 ms | 7.38E5 ms | 7.24E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 17724.65 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 2.33E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 66910.28 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 15041.54 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 15549.93 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3800.26 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 16511.32 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 659.22 ms |

## <a name="ArangoDB"></a>[Evaluation Details for ArangoDB, Version 2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8, Test Series MEDIUM](#ArangoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 185.46 ms |
| Load || 8.61E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">58226.17 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 3226.04 ms | 3228.97 ms | 3251.67 ms | 3235.56 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">57183.48 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 32326.06 ms | 32403.50 ms | 32843.19 ms | 32524.25 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">56942.40 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.21E5 ms | 3.25E5 ms | 3.25E5 ms | 3.23E5 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 5318.30 ms | 5155.03 ms | 5154.67 ms | 5209.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 5159.26 ms | 5286.73 ms | 5242.06 ms | 5229.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 8627.81 ms | 8449.40 ms | 8643.00 ms | 8573.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 8609.02 ms | 8814.36 ms | 8579.26 ms | 8667.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 8711.70 ms | 8441.43 ms | 9087.28 ms | 8746.80 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 8752.36 ms | 8620.36 ms | 8631.40 ms | 8668.04 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26747.31 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 1163.44 ms | 1138.12 ms | 1118.89 ms | 1140.15 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 79621.34 ms | 79662.87 ms | 79439.21 ms | 79574.47 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 14642.05 ms | 15018.80 ms | 14679.19 ms | 14780.01 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.21E6 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 2019.36 ms | 1956.50 ms | 2003.71 ms | 1993.19 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26666.50 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 16102.13 ms | 16170.04 ms | 16159.96 ms | 16144.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">54174.19 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1.49E5 ms | 1.49E5 ms | 1.49E5 ms | 1.49E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 3.44E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 3.35E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | Error |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | Error |
