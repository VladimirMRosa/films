create table PUBLIC."Films"(
    id             int,
    "episodeId"    int,
    "titulo"      TEXT,
    "openingCrawl" TEXT,
    "releaseDate"  TEXT,
    created        DATETIME,
    edited         DATETIME,
    url            TEXT);
create table PUBLIC."Planets"
(
    id             int,
    "planets"    TEXT);
create table PUBLIC."Species"
(
    id             int,
    "species"    TEXT);
create table PUBLIC."StarShips"
(
    id             int,
    "starships"    TEXT);
create table PUBLIC."Vehicles"
(
    id             int,
    "vehicles"    TEXT);
create table PUBLIC."Characters"
(
    id             int,
    "characters"    TEXT);
