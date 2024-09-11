package train.common.library;

import train.common.api.TrackRecord;
import train.common.items.TCRailTypes;

import static train.common.items.TCRailTypes.RailTypes.*;




public enum EnumTracks implements TrackRecord {

    /**
     * Tooltip gets shown when hovering over item.
     * switchSize is the amount of tile entities that change when activating a switch, used in TileTCRail > changeSwitchState
     */


    SMALL_STRAIGHT("SMALL_STRAIGHT", STRAIGHT, "NORMAL", ItemIDs.tcRailSmallStraight, 0, "1x1"),
    MEDIUM_STRAIGHT("MEDIUM_STRAIGHT", STRAIGHT,  "NORMAL", ItemIDs.tcRailMediumStraight, 0, "1x3"),
    LONG_STRAIGHT("LONG_STRAIGHT", STRAIGHT,  "NORMAL", ItemIDs.tcRailLongStraight,0, "1x6"),
    VERY_LONG_STRAIGHT("VERY_LONG_STRAIGHT", STRAIGHT,  "NORMAL", ItemIDs.tcRailVeryLongStraight, 0,"1x12"),

    SMALL_DIAGONAL_STRAIGHT("SMALL_DIAGONAL_STRAIGHT", DIAGONAL, "NORMAL", ItemIDs.tcRailSmallDiagonalStraight,0, "1x1"),
    MEDIUM_DIAGONAL_STRAIGHT("MEDIUM_DIAGONAL_STRAIGHT", DIAGONAL, "NORMAL", ItemIDs.tcRailMediumDiagonalStraight,0, "1x3"),
    LONG_DIAGONAL_STRAIGHT("LONG_DIAGONAL_STRAIGHT", DIAGONAL, "NORMAL", ItemIDs.tcRailLongDiagonalStraight, 0,"1x6"),
    VERY_LONG_DIAGONAL_STRAIGHT("VERY_LONG_DIAGONAL_STRAIGHT", DIAGONAL, "NORMAL", ItemIDs.tcRailVeryLongDiagonalStraight, 0,"1x12"),

    TURN_1X1("TURN_1X1", TURN, "NORMAL", ItemIDs.tcRail1X1Turn, 0,"1x1"),
    LEFT_TURN_1X1("LEFT_TURN_1X1", TURN, "NORMAL", ItemIDs.tcRail1X1Turn, 0,""),
    RIGHT_TURN_1X1("RIGHT_TURN_1X1", TURN, "NORMAL", ItemIDs.tcRail1X1Turn,0, ""),

    MEDIUM_TURN("MEDIUM_TURN", TURN, "NORMAL", ItemIDs.tcRailMediumTurn,0, "3x3"),
    MEDIUM_RIGHT_TURN("MEDIUM_RIGHT_TURN", TURN, "NORMAL", ItemIDs.tcRailMediumTurn, 0,""),
    MEDIUM_LEFT_TURN("MEDIUM_LEFT_TURN", TURN, "NORMAL", ItemIDs.tcRailMediumTurn,0, ""),

    LARGE_TURN("LARGE_TURN", TURN, "NORMAL", ItemIDs.tcRailLargeTurn,0, "5x5"),
    LARGE_RIGHT_TURN("LARGE_RIGHT_TURN", TURN, "NORMAL", ItemIDs.tcRailLargeTurn, 0,""),
    LARGE_LEFT_TURN("LARGE_LEFT_TURN", TURN, "NORMAL", ItemIDs.tcRailLargeTurn, 0,""),

    VERY_LARGE_TURN("VERY_LARGE_TURN", TURN, "NORMAL", ItemIDs.tcRailVeryLargeTurn,0, "10x10"),
    VERY_LARGE_RIGHT_TURN("VERY_LARGE_RIGHT_TURN", TURN, "NORMAL", ItemIDs.tcRailVeryLargeTurn, 0,""),
    VERY_LARGE_LEFT_TURN("VERY_LARGE_LEFT_TURN", TURN, "NORMAL", ItemIDs.tcRailVeryLargeTurn,0, ""),

    SUPER_LARGE_TURN("SUPER_LARGE_TURN", TURN, "NORMAL", ItemIDs.tcRailSuperLargeTurn,0, "16x16"),
    SUPER_LARGE_LEFT_TURN("SUPER_LARGE_LEFT_TURN", TURN, "NORMAL", ItemIDs.tcRailSuperLargeTurn,0, ""),
    SUPER_LARGE_RIGHT_TURN("SUPER_LARGE_RIGHT_TURN", TURN, "NORMAL", ItemIDs.tcRailSuperLargeTurn, 0,""),

    TURN_29X29("TURN_29X29", TURN, "NORMAL", ItemIDs.tcRail29X29Turn, 0,"29x29"),
    LEFT_TURN_29X29("LEFT_TURN_29X29", TURN, "NORMAL", ItemIDs.tcRail29X29Turn,0, ""),
    RIGHT_TURN_29X29("RIGHT_TURN_29X29", TURN, "NORMAL", ItemIDs.tcRail29X29Turn, 0,""),

    TURN_32X32("TURN_32X32", TURN, "NORMAL", ItemIDs.tcRail32X32Turn,0, "32x32"),
    LEFT_TURN_32X32("LEFT_TURN_32X32", TURN, "NORMAL", ItemIDs.tcRail32X32Turn, 0,""),
    RIGHT_TURN_32X32("RIGHT_TURN_32X32", TURN, "NORMAL", ItemIDs.tcRail32X32Turn, 0,""),

    MEDIUM_45DEGREE_TURN("MEDIUM_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailMedium45DegreeTurn, 0,"3x4 hold sneak to attach to the back of another curve"),
    MEDIUM_RIGHT_45DEGREE_TURN("MEDIUM_RIGHT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailMedium45DegreeTurn,0, ""),
    MEDIUM_LEFT_45DEGREE_TURN("MEDIUM_LEFT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailMedium45DegreeTurn, 0,""),

    LARGE_45DEGREE_TURN("LARGE_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailLarge45DegreeTurn,0, "3x6 hold sneak to attach to the back of another curve"),
    LARGE_RIGHT_45DEGREE_TURN("LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailLarge45DegreeTurn, 0,""),
    LARGE_LEFT_45DEGREE_TURN("LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailLarge45DegreeTurn,0, ""),

    VERY_LARGE_45DEGREE_TURN("VERY_LARGE_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailVeryLarge45DegreeTurn, 0,"4x8 hold sneak to attach to the back of another curve"),
    VERY_LARGE_RIGHT_45DEGREE_TURN("VERY_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailVeryLarge45DegreeTurn, 0,""),
    VERY_LARGE_LEFT_45DEGREE_TURN("VERY_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailVeryLarge45DegreeTurn,0, ""),



    SUPER_LARGE_45DEGREE_TURN("SUPER_LARGE_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailSuperLarge45DegreeTurn,0, "5x11 hold sneak to attach to the back of another curve"),
    SUPER_LARGE_RIGHT_45DEGREE_TURN("SUPER_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailSuperLarge45DegreeTurn, 0,""),
    SUPER_LARGE_LEFT_45DEGREE_TURN("SUPER_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, "NORMAL", ItemIDs.tcRailSuperLarge45DegreeTurn,0, ""),

    DIAGONAL_TURN_9X20("DIAGONAL_TURN_9X20", DIAGONALTURN, "NORMAL", ItemIDs.tcRail45DegreeTurn9x20, 0, "9x20 hold sneak to attach to the back of another curve"),
    DIAGONAL_LEFT_TURN_9X20("DIAGONAL_LEFT_TURN_9X20", DIAGONALTURN, "NORMAL", ItemIDs.tcRail45DegreeTurn9x20, 0, ""),
    DIAGONAL_RIGHT_TURN_9X20("DIAGONAL_RIGHT_TURN_9X20", DIAGONALTURN, "NORMAL", ItemIDs.tcRail45DegreeTurn9x20, 0, ""),

    DIAGONAL_TURN_10X22("DIAGONAL_TURN_10X22", DIAGONALTURN, "NORMAL", ItemIDs.tcRail45DegreeTurn10x22, 0, "10x22 hold sneak to attach to the back of another curve"),
    DIAGONAL_LEFT_TURN_10X22("DIAGONAL_LEFT_TURN_10X22", DIAGONALTURN, "NORMAL", ItemIDs.tcRail45DegreeTurn10x22, 0, ""),
    DIAGONAL_RIGHT_TURN_10X22("DIAGONAL_RIGHT_TURN_10X22", DIAGONALTURN, "NORMAL", ItemIDs.tcRail45DegreeTurn10x22, 0, ""),

    SMALL_PARALLEL_CURVE("SMALL_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailSmallParallelCurve, 0,"2x8"),
    SMALL_RIGHT_PARALLEL_CURVE("SMALL_RIGHT_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailSmallParallelCurve, 0,""),
    SMALL_LEFT_PARALLEL_CURVE("SMALL_LEFT_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailSmallParallelCurve, 0,""),

    MEDIUM_PARALLEL_CURVE("MEDIUM_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailMediumParallelCurve, 0,"3x12"),
    MEDIUM_RIGHT_PARALLEL_CURVE("MEDIUM_RIGHT_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailMediumParallelCurve, 0,""),
    MEDIUM_LEFT_PARALLEL_CURVE("MEDIUM_LEFT_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailMediumParallelCurve, 0,""),

    LARGE_PARALLEL_CURVE("LARGE_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailLargeParallelCurve,0, "4x16"),
    LARGE_RIGHT_PARALLEL_CURVE("LARGE_RIGHT_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailLargeParallelCurve, 0,""),
    LARGE_LEFT_PARALLEL_CURVE("LARGE_LEFT_PARALLEL_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRailLargeParallelCurve, 0,""),

    S_CURVE_20x2("20x2_S_CURVE", PARALLEL, "NORMAL", ItemIDs.tcRail20x2SCurve, 0, "2x20"),
    S_CURVE_20x2_RIGHT("20x2_S_CURVE_RIGHT", PARALLEL, "NORMAL", ItemIDs.tcRail20x2SCurve, 0, ""),
    S_CURVE_20x2_LEFT("20x2_S_CURVE_LEFT", PARALLEL, "NORMAL", ItemIDs.tcRail20x2SCurve, 0, ""),

    TWO_WAYS_CROSSING("TWO_WAYS_CROSSING", CROSSING, "NORMAL", ItemIDs.tcRailTwoWaysCrossing, 0,"3x3"),

    DIAMOND_CROSSING("DIAMOND_CROSSING", DIAGONAL_CROSSING, "NORMAL", ItemIDs.tcRailDiamondCrossing, 0,"3x3"),
    RIGHT_DIAMOND_CROSSING("RIGHT_DIAMOND_CROSSING", DIAGONAL_CROSSING, "NORMAL", ItemIDs.tcRailDiamondCrossing,0, "3x3"),
    LEFT_DIAMOND_CROSSING("LEFT_DIAMOND_CROSSING", DIAGONAL_CROSSING, "NORMAL", ItemIDs.tcRailDiamondCrossing, 0,"3x3"),

    DOUBLE_DIAMOND_CROSSING("DOUBLE_DIAMOND_CROSSING", DIAGONAL_CROSSING, "NORMAL", ItemIDs.tcRailDoubleDiamondCrossing, 0,"3x3"),
    DIAGONAL_TWO_WAYS_CROSSING("DIAGONAL_TWO_WAYS_CROSSING", DIAGONAL_CROSSING, "NORMAL", ItemIDs.tcRailDiagonalTwoWaysCrossing, 0,"3x3"),
    FOUR_WAYS_CROSSING("FOUR_WAYS_CROSSING", DIAGONAL_CROSSING, "NORMAL", ItemIDs.tcRailFourWaysCrossing, 0,"3x3"),

    MEDIUM_SWITCH("MEDIUM_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMediumSwitch, 2, "4x4"),
    MEDIUM_RIGHT_SWITCH("MEDIUM_RIGHT_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMediumSwitch, 2,""),
    MEDIUM_LEFT_SWITCH("MEDIUM_LEFT_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMediumSwitch,2, ""),

    LARGE_SWITCH("LARGE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLargeSwitch, 3,"6x6"),
    LARGE_RIGHT_SWITCH("LARGE_RIGHT_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLargeSwitch, 3,""),
    LARGE_LEFT_SWITCH("LARGE_LEFT_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLargeSwitch, 3,""),

    VERY_LARGE_SWITCH("VERY_LARGE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailVeryLargeSwitch, 4,"11x11"),
    VERY_LARGE_RIGHT_SWITCH("VERY_LARGE_RIGHT_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailVeryLargeSwitch,4, ""),
    VERY_LARGE_LEFT_SWITCH("VERY_LARGE_LEFT_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailVeryLargeSwitch, 4,""),

    MEDIUM_PARALLEL_SWITCH("MEDIUM_PARALLEL_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMediumParallelSwitch, 3,"4x11"),
    MEDIUM_RIGHT_PARALLEL_SWITCH("MEDIUM_RIGHT_PARALLEL_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMediumParallelSwitch, 3,""),
    MEDIUM_LEFT_PARALLEL_SWITCH("MEDIUM_LEFT_PARALLEL_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMediumParallelSwitch, 3, ""),

    LARGE_PARALLEL_SWITCH("LARGE_PARALLEL_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLargeParallelSwitch, 4,"4x17"),
    LARGE_RIGHT_PARALLEL_SWITCH("LARGE_RIGHT_PARALLEL_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLargeParallelSwitch, 4,""),
    LARGE_LEFT_PARALLEL_SWITCH("LARGE_LEFT_PARALLEL_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLargeParallelSwitch, 4, ""),

    MEDIUM_45DEGREE_SWITCH("MEDIUM_45DEGREE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMedium45DegreeSwitch, 2 ,"3x5 hold sneak to attach to the back of another curve"),
    MEDIUM_RIGHT_45DEGREE_SWITCH("MEDIUM_RIGHT_45DEGREE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMedium45DegreeSwitch, 2,""),
    MEDIUM_LEFT_45DEGREE_SWITCH("MEDIUM_LEFT_45DEGREE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailMedium45DegreeSwitch, 2,""),

    LARGE_45DEGREE_SWITCH("LARGE_45DEGREE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLarge45DegreeSwitch, 4,"4x8 hold sneak to attach to the back of another curve"),
    LARGE_RIGHT_45DEGREE_SWITCH("LARGE_RIGHT_45DEGREE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLarge45DegreeSwitch,4, ""),
    LARGE_LEFT_45DEGREE_SWITCH("LARGE_LEFT_45DEGREE_SWITCH", SWITCH, "NORMAL", ItemIDs.tcRailLarge45DegreeSwitch,4, ""),

    SLOPE_WOOD("SLOPE_WOOD", SLOPE, "NORMAL", ItemIDs.tcRailSlopeWood, 0,"1x6"),
    LARGE_SLOPE_WOOD("LARGE_SLOPE_WOOD", SLOPE, "NORMAL", ItemIDs.tcRailLargeSlopeWood, 0,"1x12"),
    VERY_LARGE_SLOPE_WOOD("VERY_LARGE_SLOPE_WOOD", SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeSlopeWood, 0,"1x18"),

    SLOPE_GRAVEL("SLOPE_GRAVEL", SLOPE, "NORMAL", ItemIDs.tcRailSlopeGravel, 0,"1x6"),
    LARGE_SLOPE_GRAVEL("LARGE_SLOPE_GRAVEL", SLOPE, "NORMAL", ItemIDs.tcRailLargeSlopeGravel, 0,"1x12"),
    VERY_LARGE_SLOPE_GRAVEL("VERY_LARGE_SLOPE_GRAVEL", SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeSlopeGravel, 0,"1x18"),

    SLOPE_BALLAST("SLOPE_BALLAST", SLOPE, "NORMAL", ItemIDs.tcRailSlopeBallast, 0,"1x6"),
    LARGE_SLOPE_BALLAST("LARGE_SLOPE_BALLAST", SLOPE, "NORMAL", ItemIDs.tcRailLargeSlopeBallast,0, "1x12"),
    VERY_LARGE_SLOPE_BALLAST("VERY_LARGE_SLOPE_BALLAST", SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeSlopeBallast, 0,"1x18"),

    SLOPE_SNOW_GRAVEL("SLOPE_SNOW_GRAVEL", SLOPE, "NORMAL", ItemIDs.tcRailSlopeSnowGravel, 0,"1x6"),
    LARGE_SLOPE_SNOW_GRAVEL("LARGE_SLOPE_SNOW_GRAVEL", SLOPE, "NORMAL", ItemIDs.tcRailLargeSlopeSnowGravel, 0,"1x12"),
    VERY_LARGE_SLOPE_SNOW_GRAVEL("VERY_LARGE_SLOPE_SNOW_GRAVEL", SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeSlopeSnowGravel,0, "1x18"),

    SLOPE_DYNAMIC("SLOPE_DYNAMIC", SLOPE, "NORMAL", ItemIDs.tcRailSlopeDynamic, 0,"1x6"),
    LARGE_SLOPE_DYNAMIC("LARGE_SLOPE_DYNAMIC", SLOPE, "NORMAL", ItemIDs.tcRailLargeSlopeDynamic, 0,"1x12" ),
    VERY_LARGE_SLOPE_DYNAMIC("VERY_LARGE_SLOPE_DYNAMIC", SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeSlopeDynamic, 0,"1x18"),

    LARGE_CURVED_SLOPE_DYNAMIC("LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailLargeCurvedSlopeDynamic,0, "5x5"),
    LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailLargeCurvedSlopeDynamic, 0,"xxx"),
    LARGE_LEFT_CURVED_SLOPE_DYNAMIC("LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailLargeCurvedSlopeDynamic, 0,"xxx"),

    VERY_LARGE_CURVED_SLOPE_DYNAMIC("VERY_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeCurvedSlopeDynamic,0, "9x9"),
    VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeCurvedSlopeDynamic, 0,"xxx"),
    VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailVeryLargeCurvedSlopeDynamic, 0,"xxx"),

    SUPER_LARGE_CURVED_SLOPE_DYNAMIC("SUPER_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailSuperLargeCurvedSlopeDynamic, 0,"16x16"),
    SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailSuperLargeCurvedSlopeDynamic, 0,"xxx"),
    SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "NORMAL", ItemIDs.tcRailSuperLargeCurvedSlopeDynamic,0, "xxx"),
    /**
     * Embedded Tracks
     */

    EMBEDDED_SMALL_STRAIGHT("EMBEDDED_SMALL_STRAIGHT", STRAIGHT, "EMBEDDED",  ItemIDs.tcRailEmbeddedSmallStraight, 0,"1x1"),
    EMBEDDED_MEDIUM_STRAIGHT("EMBEDDED_MEDIUM_STRAIGHT", STRAIGHT, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumStraight, 0,"1x3"),
    EMBEDDED_LONG_STRAIGHT("EMBEDDED_LONG_STRAIGHT", STRAIGHT, "EMBEDDED", ItemIDs.tcRailEmbeddedLongStraight, 0,"1x6"),
    EMBEDDED_VERY_LONG_STRAIGHT("EMBEDDED_VERY_LONG_STRAIGHT", STRAIGHT, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLongStraight, 0,"1x12"),

    EMBEDDED_SMALL_DIAGONAL_STRAIGHT("EMBEDDED_SMALL_DIAGONAL_STRAIGHT", DIAGONAL, "EMBEDDED", ItemIDs.tcRailEmbeddedSmallDiagonalStraight, 0,"1x1"),
    EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT("EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT", DIAGONAL, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumDiagonalStraight, 0,"1x3"),
    EMBEDDED_LONG_DIAGONAL_STRAIGHT("EMBEDDED_LONG_DIAGONAL_STRAIGHT", DIAGONAL, "EMBEDDED", ItemIDs.tcRailEmbeddedLongDiagonalStraight, 0,"1x6"),
    EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT("EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT", DIAGONAL, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLongDiagonalStraight, 0,"1x12"),


    EMBEDDED_TURN_1X1("EMBEDDED_TURN_1X1", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded1X1Turn, 0,"1x1"),
    EMBEDDED_LEFT_TURN_1X1("EMBEDDED_LEFT_TURN_1X1", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded1X1Turn, 0,""),
    EMBEDDED_RIGHT_TURN_1X1("EMBEDDED_RIGHT_TURN_1X1", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded1X1Turn, 0,""),

    EMBEDDED_MEDIUM_TURN("EMBEDDED_MEDIUM_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumTurn,0, "3x3"),
    EMBEDDED_MEDIUM_RIGHT_TURN("EMBEDDED_MEDIUM_RIGHT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumTurn, 0,""),
    EMBEDDED_MEDIUM_LEFT_TURN("EMBEDDED_MEDIUM_LEFT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumTurn, 0,""),

    EMBEDDED_LARGE_TURN("EMBEDDED_LARGE_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeTurn, 0,"5x5"),
    EMBEDDED_LARGE_RIGHT_TURN("EMBEDDED_LARGE_RIGHT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeTurn, 0,""),
    EMBEDDED_LARGE_LEFT_TURN("EMBEDDED_LARGE_LEFT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeTurn, 0,""),

    EMBEDDED_VERY_LARGE_TURN("EMBEDDED_VERY_LARGE_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeTurn, 0,"10x10"),
    EMBEDDED_VERY_LARGE_RIGHT_TURN("EMBEDDED_VERY_LARGE_RIGHT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeTurn,0, ""),
    EMBEDDED_VERY_LARGE_LEFT_TURN("EMBEDDED_VERY_LARGE_LEFT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeTurn, 0,""),

    EMBEDDED_SUPER_LARGE_TURN("EMBEDDED_SUPER_LARGE_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLargeTurn,0, "16x16"),
    EMBEDDED_SUPER_LARGE_RIGHT_TURN("EMBEDDED_SUPER_LARGE_RIGHT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLargeTurn,0, ""),
    EMBEDDED_SUPER_LARGE_LEFT_TURN("EMBEDDED_SUPER_LARGE_LEFT_TURN", TURN, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLargeTurn, 0,""),

    EMBEDDED_TURN_29X29("EMBEDDED_TURN_29X29", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded29X29Turn, 0,"29x29"),
    EMBEDDED_LEFT_TURN_29X29("EMBEDDED_LEFT_TURN_29X29", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded29X29Turn, 0,""),
    EMBEDDED_RIGHT_TURN_29X29("EMBEDDED_RIGHT_TURN_29X29", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded29X29Turn, 0,""),

    EMBEDDED_TURN_32X32("EMBEDDED_TURN_32X32", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded32X32Turn, 0,"32x32"),
    EMBEDDED_LEFT_TURN_32X32("EMBEDDED_LEFT_TURN_32X32", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded32X32Turn, 0,""),
    EMBEDDED_RIGHT_TURN_32X32("EMBEDDED_RIGHT_TURN_32X32", TURN, "EMBEDDED", ItemIDs.tcRailEmbedded32X32Turn, 0,""),

    EMBEDDED_MEDIUM_45DEGREE_TURN("EMBEDDED_MEDIUM_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedMedium45DegreeTurn, 0,"3x4 hold sneak to attach to the back of another curve"),
    EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN("EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedMedium45DegreeTurn, 0,""),
    EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN("EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedMedium45DegreeTurn,0, ""),

    EMBEDDED_LARGE_45DEGREE_TURN("EMBEDDED_LARGE_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedLarge45DegreeTurn, 0,"3x6 hold sneak to attach to the back of another curve"),
    EMBEDDED_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedLarge45DegreeTurn, 0,""),
    EMBEDDED_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedLarge45DegreeTurn, 0,""),



    EMBEDDED_VERY_LARGE_45DEGREE_TURN("EMBEDDED_VERY_LARGE_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, 0,"4x8 hold sneak to attach to the back of another curve"),
    EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, 0,""),
    EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn,0, ""),


    EMBEDDED_SUPER_LARGE_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, 0,"5x11 hold sneak to attach to the back of another curve"),
    EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, 0,""),
    EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn,0, ""),


    EMBEDDED_DIAGONAL_TURN_9X20("EMBEDDED_DIAGONAL_TURN_9X20", DIAGONALTURN, "NORMAL", ItemIDs.tcRailEmbedded45DegreeTurn9x20, 0, "9x20 hold sneak to attach to the back of another curve"),
    EMBEDDED_DIAGONAL_LEFT_TURN_9X20("EMBEDDED_DIAGONAL_LEFT_TURN_9X20", DIAGONALTURN, "NORMAL", ItemIDs.tcRailEmbedded45DegreeTurn9x20, 0, ""),
    EMBEDDED_DIAGONAL_RIGHT_TURN_9X20("EMBEDDED_DIAGONAL_RIGHT_TURN_9X20", DIAGONALTURN, "NORMAL", ItemIDs.tcRailEmbedded45DegreeTurn9x20, 0, ""),


    EMBEDDED_DIAGONAL_TURN_10X22("EMBEDDED_DIAGONAL_TURN_10X22", DIAGONALTURN, "NORMAL", ItemIDs.tcRailEmbedded45DegreeTurn10x22, 0, "10x22 hold sneak to attach to the back of another curve"),
    EMBEDDED_DIAGONAL_LEFT_TURN_10X22("EMBEDDED_DIAGONAL_LEFT_TURN_10X22", DIAGONALTURN, "NORMAL", ItemIDs.tcRailEmbedded45DegreeTurn10x22, 0, ""),
    EMBEDDED_DIAGONAL_RIGHT_TURN_10X22("EMBEDDED_DIAGONAL_RIGHT_TURN_10X22", DIAGONALTURN, "NORMAL", ItemIDs.tcRailEmbedded45DegreeTurn10x22, 0, ""),

    EMBEDDED_SMALL_PARALLEL_CURVE("EMBEDDED_SMALL_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedSmallParallelCurve, 0,"2x8"),
    EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE("EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedSmallParallelCurve, 0,""),
    EMBEDDED_SMALL_LEFT_PARALLEL_CURVE("EMBEDDED_SMALL_LEFT_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedSmallParallelCurve, 0,""),

    EMBEDDED_MEDIUM_PARALLEL_CURVE("EMBEDDED_MEDIUM_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumParallelCurve, 0,"3x12"),
    EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE("EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumParallelCurve,0, ""),
    EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE("EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumParallelCurve, 0,""),

    EMBEDDED_LARGE_PARALLEL_CURVE("EMBEDDED_LARGE_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeParallelCurve, 0,"4x16"),
    EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE("EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeParallelCurve,0, ""),
    EMBEDDED_LARGE_LEFT_PARALLEL_CURVE("EMBEDDED_LARGE_LEFT_PARALLEL_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeParallelCurve, 0,""),

    EMBEDDED_S_CURVE_20x2("EMBEDDED_20x2_S_CURVE", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbedded20x2SCurve, 0, "2x20"),
    EMBEDDED_S_CURVE_20x2_RIGHT("EMBEDDED_20x2_S_CURVE_RIGHT", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbedded20x2SCurve, 0, ""),
    EMBEDDED_S_CURVE_20x2_LEFT("EMBEDDED_20x2_S_CURVE_LEFT", PARALLEL, "EMBEDDED", ItemIDs.tcRailEmbedded20x2SCurve, 0, ""),

    EMBEDDED_TWO_WAYS_CROSSING("EMBEDDED_TWO_WAYS_CROSSING", CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedTwoWaysCrossing, 0,"3x3"),
    EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING("EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING", DIAGONAL_CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedDiagonalTwoWaysCrossing, 0,"3x3"),
    EMBEDDED_FOUR_WAYS_CROSSING("EMBEDDED_FOUR_WAYS_CROSSING", DIAGONAL_CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedFourWaysCrossing,0, "3x3"),

    EMBEDDED_DIAMOND_CROSSING("EMBEDDED_DIAMOND_CROSSING", DIAGONAL_CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedDiamondCrossing, 0,"3x3"),
    EMBEDDED_RIGHT_DIAMOND_CROSSING("EMBEDDED_RIGHT_DIAMOND_CROSSING", DIAGONAL_CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedDiamondCrossing,0, "3x3"),
    EMBEDDED_LEFT_DIAMOND_CROSSING("EMBEDDED_LEFT_DIAMOND_CROSSING", DIAGONAL_CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedDiamondCrossing,0, "3x3"),
    EMBEDDED_DOUBLE_DIAMOND_CROSSING("EMBEDDED_DOUBLE_DIAMOND_CROSSING", DIAGONAL_CROSSING, "EMBEDDED", ItemIDs.tcRailEmbeddedDoubleDiamondCrossing, 0,"3x3"),


    EMBEDDED_MEDIUM_SWITCH("EMBEDDED_MEDIUM_RIGHT_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumSwitch, 2,"4x4"),
    EMBEDDED_MEDIUM_RIGHT_SWITCH("EMBEDDED_MEDIUM_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumSwitch, 2, ""),
    EMBEDDED_MEDIUM_LEFT_SWITCH("EMBEDDED_MEDIUM_LEFT_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumSwitch, 2, ""),

    EMBEDDED_LARGE_SWITCH("EMBEDDED_LARGE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeSwitch, 3, "6x6"),
    EMBEDDED_LARGE_RIGHT_SWITCH("EMBEDDED_LARGE_RIGHT_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeSwitch, 3, ""),
    EMBEDDED_LARGE_LEFT_SWITCH("EMBEDDED_LARGE_LEFT_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeSwitch, 3, ""),

    EMBEDDED_VERY_LARGE_SWITCH("EMBEDDED_VERY_LARGE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeSwitch, 4, "11x11"),
    EMBEDDED_VERY_LARGE_RIGHT_SWITCH("EMBEDDED_VERY_LARGE_RIGHT_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeSwitch, 4, ""),
    EMBEDDED_VERY_LARGE_LEFT_SWITCH("EMBEDDED_VERY_LARGE_LEFT_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeSwitch, 4, ""),

    EMBEDDED_MEDIUM_PARALLEL_SWITCH("EMBEDDED_", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumParallelSwitch, 3, "4x11"),
    EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH("EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumParallelSwitch, 3,  ""),
    EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH("EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMediumParallelSwitch, 3,  ""),

    EMBEDDED_LARGE_PARALLEL_SWITCH("EMBEDDED_LARGE_PARALLEL_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeParallelSwitch, 4, "4x17"),
    EMBEDDED_LARGE_RIGHT_PARALLEL_SWITCH("EMBEDDED_LARGE_RIGHT_PARALLEL_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeParallelSwitch, 4, ""),
    EMBEDDED_LARGE_LEFT_PARALLEL_SWITCH("EMBEDDED_LARGE_LEFT_PARALLEL_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeParallelSwitch, 4, ""),

    EMBEDDED_MEDIUM_45DEGREE_SWITCH("EMBEDDED_MEDIUM_45DEGREE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMedium45DegreeSwitch, 2,  "3x5 hold sneak to attach to the back of another curve"),
    EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH("EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMedium45DegreeSwitch, 2,  ""),
    EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH("EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedMedium45DegreeSwitch, 2,  ""),

    EMBEDDED_LARGE_45DEGREE_SWITCH("EMBEDDED_LARGE_45DEGREE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLarge45DegreeSwitch, 4, "4x8 hold sneak to attach to the back of another curve"),
    EMBEDDED_LARGE_RIGHT_45DEGREE_SWITCH("EMBEDDED_LARGE_RIGHT_45DEGREE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLarge45DegreeSwitch, 4, ""),
    EMBEDDED_LARGE_LEFT_45DEGREE_SWITCH("EMBEDDED_LARGE_LEFT_45DEGREE_SWITCH", SWITCH, "EMBEDDED", ItemIDs.tcRailEmbeddedLarge45DegreeSwitch, 4,  ""),

    EMBEDDED_SLOPE_DYNAMIC("EMBEDDED_SLOPE_DYNAMIC", SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedSlopeDynamic, 0, "1x6"),
    EMBEDDED_LARGE_SLOPE_DYNAMIC("EMBEDDED_LARGE_SLOPE_DYNAMIC", SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeSlopeDynamic, 0,"1x12"),
    EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC", SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic, 0,"1x18"),

    EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, 0,"5x5"),
    EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, 0,"xxx"),
    EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, 0,"xxx"),

    EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic,0, "9x9"),
    EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, 0,"xxx"),
    EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, 0,"xxx"),

    EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, 0,"16x16"),
    EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, 0,"xxx"),
    EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, "EMBEDDED", ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, 0,"xxx"),

    SMALL_ROAD_CROSSING("SMALL_ROAD_CROSSING", STRAIGHT, "EMBEDDED", ItemIDs.tcRailSmallRoadCrossing, 0,"1x1"),
    SMALL_ROAD_CROSSING_1("SMALL_ROAD_CROSSING_1", STRAIGHT, "EMBEDDED", ItemIDs.tcRailSmallRoadCrossing1, 0,"1x1"),
    SMALL_ROAD_CROSSING_2("SMALL_ROAD_CROSSING_2", STRAIGHT, "EMBEDDED", ItemIDs.tcRailSmallRoadCrossing2,0, "1x1"),

    SMALL_ROAD_CROSSING_DYNAMIC("SMALL_ROAD_CROSSING_DYNAMIC", STRAIGHT, "EMBEDDED", ItemIDs.tcRailSmallRoadCrossingDynamic, 0,"1x1");



    private final String label;
    private final TCRailTypes.RailTypes railType;

    private final String variant;
    private final ItemIDs item;
    private final int switchSize;
    private final String toolTip;

    EnumTracks(String label, TCRailTypes.RailTypes railType, String variant, ItemIDs item, int switchSize, String tooltip){
        this.label = label;
        this.railType = railType;
        this.variant = variant;
        this.item = item;
        this.switchSize = switchSize;
        this.toolTip = tooltip;

    }




    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public TCRailTypes.RailTypes getRailType() {
        return railType;
    }

    @Override
    public String getVariant() {return variant; }

    @Override
    public ItemIDs getItem(){
        return item;
    }

    @Override
    public int getSwitchSize() {
        return switchSize;
    }
    @Override
    public String getItemToolTip() {
        return toolTip;
    }


}
