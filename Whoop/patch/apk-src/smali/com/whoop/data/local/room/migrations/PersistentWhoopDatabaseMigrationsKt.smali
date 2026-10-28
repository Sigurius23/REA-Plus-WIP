.class public final Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0002\u0018\u0002\n\u0003\u0008\u008a\u0001\n\u0002\u0010\u0011\n\u0002\u0008\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\n\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u000c\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0002\u001a\u0004\u0008\u000e\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0002\u001a\u0004\u0008\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0002\u001a\u0004\u0008\u0012\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0002\u001a\u0004\u0008\u0014\u0010\u0004\"\u0017\u0010\u0015\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0002\u001a\u0004\u0008\u0016\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0002\u001a\u0004\u0008\u0018\u0010\u0004\"\u0017\u0010\u0019\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0002\u001a\u0004\u0008\u001a\u0010\u0004\"\u0017\u0010\u001b\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0002\u001a\u0004\u0008\u001c\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0002\u001a\u0004\u0008\u001e\u0010\u0004\"\u0017\u0010\u001f\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0002\u001a\u0004\u0008 \u0010\u0004\"\u0017\u0010!\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0002\u001a\u0004\u0008\"\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0002\u001a\u0004\u0008$\u0010\u0004\"\u0017\u0010%\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0002\u001a\u0004\u0008&\u0010\u0004\"\u0017\u0010\'\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u0002\u001a\u0004\u0008(\u0010\u0004\"\u0017\u0010)\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010\u0002\u001a\u0004\u0008*\u0010\u0004\"\u0017\u0010+\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u0002\u001a\u0004\u0008,\u0010\u0004\"\u0017\u0010-\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u0002\u001a\u0004\u0008.\u0010\u0004\"\u0017\u0010/\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010\u0002\u001a\u0004\u00080\u0010\u0004\"\u0017\u00101\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010\u0002\u001a\u0004\u00082\u0010\u0004\"\u0017\u00103\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010\u0002\u001a\u0004\u00084\u0010\u0004\"\u0017\u00105\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010\u0002\u001a\u0004\u00086\u0010\u0004\"\u0017\u00107\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010\u0002\u001a\u0004\u00088\u0010\u0004\"\u0017\u00109\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010\u0002\u001a\u0004\u0008:\u0010\u0004\"\u0017\u0010;\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010\u0002\u001a\u0004\u0008<\u0010\u0004\"\u0017\u0010=\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010\u0002\u001a\u0004\u0008>\u0010\u0004\"\u0017\u0010?\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010\u0002\u001a\u0004\u0008@\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010\u0002\u001a\u0004\u0008B\u0010\u0004\"\u0017\u0010C\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010\u0002\u001a\u0004\u0008D\u0010\u0004\"\u0017\u0010E\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010\u0002\u001a\u0004\u0008F\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010\u0002\u001a\u0004\u0008H\u0010\u0004\"\u0017\u0010I\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010\u0002\u001a\u0004\u0008J\u0010\u0004\"\u0017\u0010K\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010\u0002\u001a\u0004\u0008L\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008M\u0010\u0002\u001a\u0004\u0008N\u0010\u0004\"\u0017\u0010O\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008O\u0010\u0002\u001a\u0004\u0008P\u0010\u0004\"\u0017\u0010Q\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008Q\u0010\u0002\u001a\u0004\u0008R\u0010\u0004\"\u0017\u0010S\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008S\u0010\u0002\u001a\u0004\u0008T\u0010\u0004\"\u0017\u0010U\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008U\u0010\u0002\u001a\u0004\u0008V\u0010\u0004\"\u0017\u0010W\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010\u0002\u001a\u0004\u0008X\u0010\u0004\"\u0017\u0010Y\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008Y\u0010\u0002\u001a\u0004\u0008Z\u0010\u0004\"\u0017\u0010[\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008[\u0010\u0002\u001a\u0004\u0008\\\u0010\u0004\"\u0017\u0010]\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008]\u0010\u0002\u001a\u0004\u0008^\u0010\u0004\"\u0017\u0010_\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008_\u0010\u0002\u001a\u0004\u0008`\u0010\u0004\"\u0017\u0010a\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008a\u0010\u0002\u001a\u0004\u0008b\u0010\u0004\"\u0017\u0010c\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008c\u0010\u0002\u001a\u0004\u0008d\u0010\u0004\"\u0017\u0010e\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010\u0002\u001a\u0004\u0008f\u0010\u0004\"\u0017\u0010g\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008g\u0010\u0002\u001a\u0004\u0008h\u0010\u0004\"\u0017\u0010i\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008i\u0010\u0002\u001a\u0004\u0008j\u0010\u0004\"\u0017\u0010k\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008k\u0010\u0002\u001a\u0004\u0008l\u0010\u0004\"\u0017\u0010m\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008m\u0010\u0002\u001a\u0004\u0008n\u0010\u0004\"\u0017\u0010o\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008o\u0010\u0002\u001a\u0004\u0008p\u0010\u0004\"\u0017\u0010q\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008q\u0010\u0002\u001a\u0004\u0008r\u0010\u0004\"\u0017\u0010s\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008s\u0010\u0002\u001a\u0004\u0008t\u0010\u0004\"\u0017\u0010u\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008u\u0010\u0002\u001a\u0004\u0008v\u0010\u0004\"\u0017\u0010w\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008w\u0010\u0002\u001a\u0004\u0008x\u0010\u0004\"\u0017\u0010y\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008y\u0010\u0002\u001a\u0004\u0008z\u0010\u0004\"\u0017\u0010{\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008{\u0010\u0002\u001a\u0004\u0008|\u0010\u0004\"\u0017\u0010}\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008}\u0010\u0002\u001a\u0004\u0008~\u0010\u0004\"\u0018\u0010\u007f\u001a\u00020\u00008\u0006\u00a2\u0006\r\n\u0004\u0008\u007f\u0010\u0002\u001a\u0005\u0008\u0080\u0001\u0010\u0004\"\u001a\u0010\u0081\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0081\u0001\u0010\u0002\u001a\u0005\u0008\u0082\u0001\u0010\u0004\"\u001a\u0010\u0083\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0083\u0001\u0010\u0002\u001a\u0005\u0008\u0084\u0001\u0010\u0004\"\u001a\u0010\u0085\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0085\u0001\u0010\u0002\u001a\u0005\u0008\u0086\u0001\u0010\u0004\"\u001a\u0010\u0087\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0087\u0001\u0010\u0002\u001a\u0005\u0008\u0088\u0001\u0010\u0004\"\u001a\u0010\u0089\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0089\u0001\u0010\u0002\u001a\u0005\u0008\u008a\u0001\u0010\u0004\"#\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u008b\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001\u00a8\u0006\u0090\u0001"
    }
    d2 = {
        "Lmb/b;",
        "DB_MIGRATION_1_2",
        "Lmb/b;",
        "getDB_MIGRATION_1_2",
        "()Lmb/b;",
        "DB_MIGRATION_2_3",
        "getDB_MIGRATION_2_3",
        "DB_MIGRATION_3_4",
        "getDB_MIGRATION_3_4",
        "DB_MIGRATION_4_5",
        "getDB_MIGRATION_4_5",
        "DB_MIGRATION_5_6",
        "getDB_MIGRATION_5_6",
        "DB_MIGRATION_6_7",
        "getDB_MIGRATION_6_7",
        "DB_MIGRATION_7_8",
        "getDB_MIGRATION_7_8",
        "DB_MIGRATION_8_9",
        "getDB_MIGRATION_8_9",
        "DB_MIGRATION_9_10",
        "getDB_MIGRATION_9_10",
        "DB_MIGRATION_10_11",
        "getDB_MIGRATION_10_11",
        "DB_MIGRATION_11_12",
        "getDB_MIGRATION_11_12",
        "DB_MIGRATION_12_13",
        "getDB_MIGRATION_12_13",
        "DB_MIGRATION_13_14",
        "getDB_MIGRATION_13_14",
        "DB_MIGRATION_14_15",
        "getDB_MIGRATION_14_15",
        "DB_MIGRATION_15_16",
        "getDB_MIGRATION_15_16",
        "DB_MIGRATION_16_17",
        "getDB_MIGRATION_16_17",
        "DB_MIGRATION_17_18",
        "getDB_MIGRATION_17_18",
        "DB_MIGRATION_18_19",
        "getDB_MIGRATION_18_19",
        "DB_MIGRATION_19_20",
        "getDB_MIGRATION_19_20",
        "DB_MIGRATION_20_21",
        "getDB_MIGRATION_20_21",
        "DB_MIGRATION_21_22",
        "getDB_MIGRATION_21_22",
        "DB_MIGRATION_22_23",
        "getDB_MIGRATION_22_23",
        "DB_MIGRATION_23_24",
        "getDB_MIGRATION_23_24",
        "DB_MIGRATION_24_25",
        "getDB_MIGRATION_24_25",
        "DB_MIGRATION_25_26",
        "getDB_MIGRATION_25_26",
        "DB_MIGRATION_26_27",
        "getDB_MIGRATION_26_27",
        "DB_MIGRATION_27_28",
        "getDB_MIGRATION_27_28",
        "DB_MIGRATION_28_29",
        "getDB_MIGRATION_28_29",
        "DB_MIGRATION_29_30",
        "getDB_MIGRATION_29_30",
        "DB_MIGRATION_30_31",
        "getDB_MIGRATION_30_31",
        "DB_MIGRATION_31_32",
        "getDB_MIGRATION_31_32",
        "DB_MIGRATION_32_33",
        "getDB_MIGRATION_32_33",
        "DB_MIGRATION_33_34",
        "getDB_MIGRATION_33_34",
        "DB_MIGRATION_34_35",
        "getDB_MIGRATION_34_35",
        "DB_MIGRATION_35_36",
        "getDB_MIGRATION_35_36",
        "DB_MIGRATION_36_37",
        "getDB_MIGRATION_36_37",
        "DB_MIGRATION_37_38",
        "getDB_MIGRATION_37_38",
        "DB_MIGRATION_38_39",
        "getDB_MIGRATION_38_39",
        "DB_MIGRATION_39_40",
        "getDB_MIGRATION_39_40",
        "DB_MIGRATION_40_41",
        "getDB_MIGRATION_40_41",
        "DB_MIGRATION_41_42",
        "getDB_MIGRATION_41_42",
        "DB_MIGRATION_42_43",
        "getDB_MIGRATION_42_43",
        "DB_MIGRATION_43_44",
        "getDB_MIGRATION_43_44",
        "DB_MIGRATION_44_45",
        "getDB_MIGRATION_44_45",
        "DB_MIGRATION_45_46",
        "getDB_MIGRATION_45_46",
        "DB_MIGRATION_46_47",
        "getDB_MIGRATION_46_47",
        "DB_MIGRATION_47_48",
        "getDB_MIGRATION_47_48",
        "DB_MIGRATION_48_49",
        "getDB_MIGRATION_48_49",
        "DB_MIGRATION_49_50",
        "getDB_MIGRATION_49_50",
        "DB_MIGRATION_50_51",
        "getDB_MIGRATION_50_51",
        "DB_MIGRATION_51_52",
        "getDB_MIGRATION_51_52",
        "DB_MIGRATION_52_53",
        "getDB_MIGRATION_52_53",
        "DB_MIGRATION_53_54",
        "getDB_MIGRATION_53_54",
        "DB_MIGRATION_54_55",
        "getDB_MIGRATION_54_55",
        "DB_MIGRATION_55_56",
        "getDB_MIGRATION_55_56",
        "DB_MIGRATION_56_57",
        "getDB_MIGRATION_56_57",
        "DB_MIGRATION_57_58",
        "getDB_MIGRATION_57_58",
        "DB_MIGRATION_58_59",
        "getDB_MIGRATION_58_59",
        "DB_MIGRATION_59_60",
        "getDB_MIGRATION_59_60",
        "DB_MIGRATION_60_61",
        "getDB_MIGRATION_60_61",
        "DB_MIGRATION_61_62",
        "getDB_MIGRATION_61_62",
        "DB_MIGRATION_62_63",
        "getDB_MIGRATION_62_63",
        "DB_MIGRATION_63_64",
        "getDB_MIGRATION_63_64",
        "DB_MIGRATION_64_65",
        "getDB_MIGRATION_64_65",
        "DB_MIGRATION_65_66",
        "getDB_MIGRATION_65_66",
        "DB_MIGRATION_66_67",
        "getDB_MIGRATION_66_67",
        "DB_MIGRATION_67_68",
        "getDB_MIGRATION_67_68",
        "DB_MIGRATION_68_69",
        "getDB_MIGRATION_68_69",
        "",
        "ALL_MIGRATIONS",
        "[Lmb/b;",
        "getALL_MIGRATIONS",
        "()[Lmb/b;",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ALL_MIGRATIONS:[Lmb/b;

.field private static final DB_MIGRATION_10_11:Lmb/b;

.field private static final DB_MIGRATION_11_12:Lmb/b;

.field private static final DB_MIGRATION_12_13:Lmb/b;

.field private static final DB_MIGRATION_13_14:Lmb/b;

.field private static final DB_MIGRATION_14_15:Lmb/b;

.field private static final DB_MIGRATION_15_16:Lmb/b;

.field private static final DB_MIGRATION_16_17:Lmb/b;

.field private static final DB_MIGRATION_17_18:Lmb/b;

.field private static final DB_MIGRATION_18_19:Lmb/b;

.field private static final DB_MIGRATION_19_20:Lmb/b;

.field private static final DB_MIGRATION_1_2:Lmb/b;

.field private static final DB_MIGRATION_20_21:Lmb/b;

.field private static final DB_MIGRATION_21_22:Lmb/b;

.field private static final DB_MIGRATION_22_23:Lmb/b;

.field private static final DB_MIGRATION_23_24:Lmb/b;

.field private static final DB_MIGRATION_24_25:Lmb/b;

.field private static final DB_MIGRATION_25_26:Lmb/b;

.field private static final DB_MIGRATION_26_27:Lmb/b;

.field private static final DB_MIGRATION_27_28:Lmb/b;

.field private static final DB_MIGRATION_28_29:Lmb/b;

.field private static final DB_MIGRATION_29_30:Lmb/b;

.field private static final DB_MIGRATION_2_3:Lmb/b;

.field private static final DB_MIGRATION_30_31:Lmb/b;

.field private static final DB_MIGRATION_31_32:Lmb/b;

.field private static final DB_MIGRATION_32_33:Lmb/b;

.field private static final DB_MIGRATION_33_34:Lmb/b;

.field private static final DB_MIGRATION_34_35:Lmb/b;

.field private static final DB_MIGRATION_35_36:Lmb/b;

.field private static final DB_MIGRATION_36_37:Lmb/b;

.field private static final DB_MIGRATION_37_38:Lmb/b;

.field private static final DB_MIGRATION_38_39:Lmb/b;

.field private static final DB_MIGRATION_39_40:Lmb/b;

.field private static final DB_MIGRATION_3_4:Lmb/b;

.field private static final DB_MIGRATION_40_41:Lmb/b;

.field private static final DB_MIGRATION_41_42:Lmb/b;

.field private static final DB_MIGRATION_42_43:Lmb/b;

.field private static final DB_MIGRATION_43_44:Lmb/b;

.field private static final DB_MIGRATION_44_45:Lmb/b;

.field private static final DB_MIGRATION_45_46:Lmb/b;

.field private static final DB_MIGRATION_46_47:Lmb/b;

.field private static final DB_MIGRATION_47_48:Lmb/b;

.field private static final DB_MIGRATION_48_49:Lmb/b;

.field private static final DB_MIGRATION_49_50:Lmb/b;

.field private static final DB_MIGRATION_4_5:Lmb/b;

.field private static final DB_MIGRATION_50_51:Lmb/b;

.field private static final DB_MIGRATION_51_52:Lmb/b;

.field private static final DB_MIGRATION_52_53:Lmb/b;

.field private static final DB_MIGRATION_53_54:Lmb/b;

.field private static final DB_MIGRATION_54_55:Lmb/b;

.field private static final DB_MIGRATION_55_56:Lmb/b;

.field private static final DB_MIGRATION_56_57:Lmb/b;

.field private static final DB_MIGRATION_57_58:Lmb/b;

.field private static final DB_MIGRATION_58_59:Lmb/b;

.field private static final DB_MIGRATION_59_60:Lmb/b;

.field private static final DB_MIGRATION_5_6:Lmb/b;

.field private static final DB_MIGRATION_60_61:Lmb/b;

.field private static final DB_MIGRATION_61_62:Lmb/b;

.field private static final DB_MIGRATION_62_63:Lmb/b;

.field private static final DB_MIGRATION_63_64:Lmb/b;

.field private static final DB_MIGRATION_64_65:Lmb/b;

.field private static final DB_MIGRATION_65_66:Lmb/b;

.field private static final DB_MIGRATION_66_67:Lmb/b;

.field private static final DB_MIGRATION_67_68:Lmb/b;

.field private static final DB_MIGRATION_68_69:Lmb/b;

.field private static final DB_MIGRATION_6_7:Lmb/b;

.field private static final DB_MIGRATION_7_8:Lmb/b;

.field private static final DB_MIGRATION_8_9:Lmb/b;

.field private static final DB_MIGRATION_9_10:Lmb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 70

    new-instance v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_1_2$1;

    invoke-direct {v0}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_1_2$1;-><init>()V

    sput-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_1_2:Lmb/b;

    new-instance v1, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_2_3$1;

    invoke-direct {v1}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_2_3$1;-><init>()V

    sput-object v1, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_2_3:Lmb/b;

    new-instance v2, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_3_4$1;

    invoke-direct {v2}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_3_4$1;-><init>()V

    sput-object v2, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_3_4:Lmb/b;

    new-instance v3, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_4_5$1;

    invoke-direct {v3}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_4_5$1;-><init>()V

    sput-object v3, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_4_5:Lmb/b;

    new-instance v4, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_5_6$1;

    invoke-direct {v4}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_5_6$1;-><init>()V

    sput-object v4, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_5_6:Lmb/b;

    new-instance v5, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_6_7$1;

    invoke-direct {v5}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_6_7$1;-><init>()V

    sput-object v5, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_6_7:Lmb/b;

    new-instance v6, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_7_8$1;

    invoke-direct {v6}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_7_8$1;-><init>()V

    sput-object v6, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_7_8:Lmb/b;

    new-instance v7, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_8_9$1;

    invoke-direct {v7}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_8_9$1;-><init>()V

    sput-object v7, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_8_9:Lmb/b;

    new-instance v8, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_9_10$1;

    invoke-direct {v8}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_9_10$1;-><init>()V

    sput-object v8, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_9_10:Lmb/b;

    new-instance v9, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_10_11$1;

    invoke-direct {v9}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_10_11$1;-><init>()V

    sput-object v9, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_10_11:Lmb/b;

    new-instance v10, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_11_12$1;

    invoke-direct {v10}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_11_12$1;-><init>()V

    sput-object v10, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_11_12:Lmb/b;

    new-instance v11, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_12_13$1;

    invoke-direct {v11}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_12_13$1;-><init>()V

    sput-object v11, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_12_13:Lmb/b;

    new-instance v12, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_13_14$1;

    invoke-direct {v12}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_13_14$1;-><init>()V

    sput-object v12, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_13_14:Lmb/b;

    new-instance v13, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_14_15$1;

    invoke-direct {v13}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_14_15$1;-><init>()V

    sput-object v13, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_14_15:Lmb/b;

    new-instance v14, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_15_16$1;

    invoke-direct {v14}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_15_16$1;-><init>()V

    sput-object v14, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_15_16:Lmb/b;

    new-instance v15, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_16_17$1;

    invoke-direct {v15}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_16_17$1;-><init>()V

    sput-object v15, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_16_17:Lmb/b;

    new-instance v16, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_17_18$1;

    invoke-direct/range {v16 .. v16}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_17_18$1;-><init>()V

    sput-object v16, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_17_18:Lmb/b;

    new-instance v17, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_18_19$1;

    invoke-direct/range {v17 .. v17}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_18_19$1;-><init>()V

    sput-object v17, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_18_19:Lmb/b;

    new-instance v18, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_19_20$1;

    invoke-direct/range {v18 .. v18}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_19_20$1;-><init>()V

    sput-object v18, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_19_20:Lmb/b;

    new-instance v19, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_20_21$1;

    invoke-direct/range {v19 .. v19}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_20_21$1;-><init>()V

    sput-object v19, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_20_21:Lmb/b;

    new-instance v20, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_21_22$1;

    invoke-direct/range {v20 .. v20}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_21_22$1;-><init>()V

    sput-object v20, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_21_22:Lmb/b;

    new-instance v21, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_22_23$1;

    invoke-direct/range {v21 .. v21}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_22_23$1;-><init>()V

    sput-object v21, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_22_23:Lmb/b;

    new-instance v22, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_23_24$1;

    invoke-direct/range {v22 .. v22}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_23_24$1;-><init>()V

    sput-object v22, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_23_24:Lmb/b;

    new-instance v23, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_24_25$1;

    invoke-direct/range {v23 .. v23}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_24_25$1;-><init>()V

    sput-object v23, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_24_25:Lmb/b;

    new-instance v24, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_25_26$1;

    invoke-direct/range {v24 .. v24}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_25_26$1;-><init>()V

    sput-object v24, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_25_26:Lmb/b;

    new-instance v25, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_26_27$1;

    invoke-direct/range {v25 .. v25}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_26_27$1;-><init>()V

    sput-object v25, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_26_27:Lmb/b;

    new-instance v26, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_27_28$1;

    invoke-direct/range {v26 .. v26}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_27_28$1;-><init>()V

    sput-object v26, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_27_28:Lmb/b;

    new-instance v27, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_28_29$1;

    invoke-direct/range {v27 .. v27}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_28_29$1;-><init>()V

    sput-object v27, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_28_29:Lmb/b;

    new-instance v28, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_29_30$1;

    invoke-direct/range {v28 .. v28}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_29_30$1;-><init>()V

    sput-object v28, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_29_30:Lmb/b;

    new-instance v29, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_30_31$1;

    invoke-direct/range {v29 .. v29}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_30_31$1;-><init>()V

    sput-object v29, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_30_31:Lmb/b;

    new-instance v30, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_31_32$1;

    invoke-direct/range {v30 .. v30}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_31_32$1;-><init>()V

    sput-object v30, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_31_32:Lmb/b;

    new-instance v31, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_32_33$1;

    invoke-direct/range {v31 .. v31}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_32_33$1;-><init>()V

    sput-object v31, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_32_33:Lmb/b;

    new-instance v32, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_33_34$1;

    invoke-direct/range {v32 .. v32}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_33_34$1;-><init>()V

    sput-object v32, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_33_34:Lmb/b;

    new-instance v33, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_34_35$1;

    invoke-direct/range {v33 .. v33}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_34_35$1;-><init>()V

    sput-object v33, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_34_35:Lmb/b;

    new-instance v34, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_35_36$1;

    invoke-direct/range {v34 .. v34}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_35_36$1;-><init>()V

    sput-object v34, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_35_36:Lmb/b;

    new-instance v35, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_36_37$1;

    invoke-direct/range {v35 .. v35}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_36_37$1;-><init>()V

    sput-object v35, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_36_37:Lmb/b;

    new-instance v36, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_37_38$1;

    invoke-direct/range {v36 .. v36}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_37_38$1;-><init>()V

    sput-object v36, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_37_38:Lmb/b;

    new-instance v37, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_38_39$1;

    invoke-direct/range {v37 .. v37}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_38_39$1;-><init>()V

    sput-object v37, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_38_39:Lmb/b;

    new-instance v38, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_39_40$1;

    invoke-direct/range {v38 .. v38}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_39_40$1;-><init>()V

    sput-object v38, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_39_40:Lmb/b;

    new-instance v39, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_40_41$1;

    invoke-direct/range {v39 .. v39}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_40_41$1;-><init>()V

    sput-object v39, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_40_41:Lmb/b;

    new-instance v40, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_41_42$1;

    invoke-direct/range {v40 .. v40}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_41_42$1;-><init>()V

    sput-object v40, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_41_42:Lmb/b;

    new-instance v41, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_42_43$1;

    invoke-direct/range {v41 .. v41}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_42_43$1;-><init>()V

    sput-object v41, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_42_43:Lmb/b;

    new-instance v42, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_43_44$1;

    invoke-direct/range {v42 .. v42}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_43_44$1;-><init>()V

    sput-object v42, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_43_44:Lmb/b;

    new-instance v43, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_44_45$1;

    invoke-direct/range {v43 .. v43}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_44_45$1;-><init>()V

    sput-object v43, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_44_45:Lmb/b;

    new-instance v44, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_45_46$1;

    invoke-direct/range {v44 .. v44}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_45_46$1;-><init>()V

    sput-object v44, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_45_46:Lmb/b;

    new-instance v45, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_46_47$1;

    invoke-direct/range {v45 .. v45}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_46_47$1;-><init>()V

    sput-object v45, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_46_47:Lmb/b;

    new-instance v46, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_47_48$1;

    invoke-direct/range {v46 .. v46}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_47_48$1;-><init>()V

    sput-object v46, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_47_48:Lmb/b;

    new-instance v47, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_48_49$1;

    invoke-direct/range {v47 .. v47}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_48_49$1;-><init>()V

    sput-object v47, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_48_49:Lmb/b;

    new-instance v48, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_49_50$1;

    invoke-direct/range {v48 .. v48}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_49_50$1;-><init>()V

    sput-object v48, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_49_50:Lmb/b;

    new-instance v49, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_50_51$1;

    invoke-direct/range {v49 .. v49}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_50_51$1;-><init>()V

    sput-object v49, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_50_51:Lmb/b;

    new-instance v50, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_51_52$1;

    invoke-direct/range {v50 .. v50}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_51_52$1;-><init>()V

    sput-object v50, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_51_52:Lmb/b;

    new-instance v51, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_52_53$1;

    invoke-direct/range {v51 .. v51}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_52_53$1;-><init>()V

    sput-object v51, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_52_53:Lmb/b;

    new-instance v52, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_53_54$1;

    invoke-direct/range {v52 .. v52}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_53_54$1;-><init>()V

    sput-object v52, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_53_54:Lmb/b;

    new-instance v53, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_54_55$1;

    invoke-direct/range {v53 .. v53}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_54_55$1;-><init>()V

    sput-object v53, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_54_55:Lmb/b;

    new-instance v54, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_55_56$1;

    invoke-direct/range {v54 .. v54}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_55_56$1;-><init>()V

    sput-object v54, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_55_56:Lmb/b;

    new-instance v55, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_56_57$1;

    invoke-direct/range {v55 .. v55}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_56_57$1;-><init>()V

    sput-object v55, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_56_57:Lmb/b;

    new-instance v56, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_57_58$1;

    invoke-direct/range {v56 .. v56}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_57_58$1;-><init>()V

    sput-object v56, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_57_58:Lmb/b;

    new-instance v57, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_58_59$1;

    invoke-direct/range {v57 .. v57}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_58_59$1;-><init>()V

    sput-object v57, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_58_59:Lmb/b;

    new-instance v58, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_59_60$1;

    invoke-direct/range {v58 .. v58}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_59_60$1;-><init>()V

    sput-object v58, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_59_60:Lmb/b;

    new-instance v59, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_60_61$1;

    invoke-direct/range {v59 .. v59}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_60_61$1;-><init>()V

    sput-object v59, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_60_61:Lmb/b;

    new-instance v60, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_61_62$1;

    invoke-direct/range {v60 .. v60}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_61_62$1;-><init>()V

    sput-object v60, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_61_62:Lmb/b;

    new-instance v61, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_62_63$1;

    invoke-direct/range {v61 .. v61}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_62_63$1;-><init>()V

    sput-object v61, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_62_63:Lmb/b;

    new-instance v62, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_63_64$1;

    invoke-direct/range {v62 .. v62}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_63_64$1;-><init>()V

    sput-object v62, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_63_64:Lmb/b;

    new-instance v63, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_64_65$1;

    invoke-direct/range {v63 .. v63}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_64_65$1;-><init>()V

    sput-object v63, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_64_65:Lmb/b;

    new-instance v64, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_65_66$1;

    invoke-direct/range {v64 .. v64}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_65_66$1;-><init>()V

    sput-object v64, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_65_66:Lmb/b;

    new-instance v65, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_66_67$1;

    invoke-direct/range {v65 .. v65}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_66_67$1;-><init>()V

    sput-object v65, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_66_67:Lmb/b;

    new-instance v66, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_67_68$1;

    invoke-direct/range {v66 .. v66}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_67_68$1;-><init>()V

    sput-object v66, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_67_68:Lmb/b;

    new-instance v67, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_68_69$1;

    invoke-direct/range {v67 .. v67}, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_68_69$1;-><init>()V

    sput-object v67, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_68_69:Lmb/b;

    move-object/from16 v68, v0

    const/16 v0, 0x44

    new-array v0, v0, [Lmb/b;

    const/16 v69, 0x0

    aput-object v68, v0, v69

    const/16 v68, 0x1

    aput-object v1, v0, v68

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    aput-object v4, v0, v1

    const/4 v1, 0x5

    aput-object v5, v0, v1

    const/4 v1, 0x6

    aput-object v6, v0, v1

    const/4 v1, 0x7

    aput-object v7, v0, v1

    const/16 v1, 0x8

    aput-object v8, v0, v1

    const/16 v1, 0x9

    aput-object v9, v0, v1

    const/16 v1, 0xa

    aput-object v10, v0, v1

    const/16 v1, 0xb

    aput-object v11, v0, v1

    const/16 v1, 0xc

    aput-object v12, v0, v1

    const/16 v1, 0xd

    aput-object v13, v0, v1

    const/16 v1, 0xe

    aput-object v14, v0, v1

    const/16 v1, 0xf

    aput-object v15, v0, v1

    const/16 v1, 0x10

    aput-object v16, v0, v1

    const/16 v1, 0x11

    aput-object v17, v0, v1

    const/16 v1, 0x12

    aput-object v18, v0, v1

    const/16 v1, 0x13

    aput-object v19, v0, v1

    const/16 v1, 0x14

    aput-object v20, v0, v1

    const/16 v1, 0x15

    aput-object v21, v0, v1

    const/16 v1, 0x16

    aput-object v22, v0, v1

    const/16 v1, 0x17

    aput-object v23, v0, v1

    const/16 v1, 0x18

    aput-object v24, v0, v1

    const/16 v1, 0x19

    aput-object v25, v0, v1

    const/16 v1, 0x1a

    aput-object v26, v0, v1

    const/16 v1, 0x1b

    aput-object v27, v0, v1

    const/16 v1, 0x1c

    aput-object v28, v0, v1

    const/16 v1, 0x1d

    aput-object v29, v0, v1

    const/16 v1, 0x1e

    aput-object v30, v0, v1

    const/16 v1, 0x1f

    aput-object v31, v0, v1

    const/16 v1, 0x20

    aput-object v32, v0, v1

    const/16 v1, 0x21

    aput-object v33, v0, v1

    const/16 v1, 0x22

    aput-object v34, v0, v1

    const/16 v1, 0x23

    aput-object v35, v0, v1

    const/16 v1, 0x24

    aput-object v36, v0, v1

    const/16 v1, 0x25

    aput-object v37, v0, v1

    const/16 v1, 0x26

    aput-object v38, v0, v1

    const/16 v1, 0x27

    aput-object v39, v0, v1

    const/16 v1, 0x28

    aput-object v40, v0, v1

    const/16 v1, 0x29

    aput-object v41, v0, v1

    const/16 v1, 0x2a

    aput-object v42, v0, v1

    const/16 v1, 0x2b

    aput-object v43, v0, v1

    const/16 v1, 0x2c

    aput-object v44, v0, v1

    const/16 v1, 0x2d

    aput-object v45, v0, v1

    const/16 v1, 0x2e

    aput-object v46, v0, v1

    const/16 v1, 0x2f

    aput-object v47, v0, v1

    const/16 v1, 0x30

    aput-object v48, v0, v1

    const/16 v1, 0x31

    aput-object v49, v0, v1

    const/16 v1, 0x32

    aput-object v50, v0, v1

    const/16 v1, 0x33

    aput-object v51, v0, v1

    const/16 v1, 0x34

    aput-object v52, v0, v1

    const/16 v1, 0x35

    aput-object v53, v0, v1

    const/16 v1, 0x36

    aput-object v54, v0, v1

    const/16 v1, 0x37

    aput-object v55, v0, v1

    const/16 v1, 0x38

    aput-object v56, v0, v1

    const/16 v1, 0x39

    aput-object v57, v0, v1

    const/16 v1, 0x3a

    aput-object v58, v0, v1

    const/16 v1, 0x3b

    aput-object v59, v0, v1

    const/16 v1, 0x3c

    aput-object v60, v0, v1

    const/16 v1, 0x3d

    aput-object v61, v0, v1

    const/16 v1, 0x3e

    aput-object v62, v0, v1

    const/16 v1, 0x3f

    aput-object v63, v0, v1

    const/16 v1, 0x40

    aput-object v64, v0, v1

    const/16 v1, 0x41

    aput-object v65, v0, v1

    const/16 v1, 0x42

    aput-object v66, v0, v1

    const/16 v1, 0x43

    aput-object v67, v0, v1

    sput-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->ALL_MIGRATIONS:[Lmb/b;

    return-void
.end method

.method public static final getALL_MIGRATIONS()[Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->ALL_MIGRATIONS:[Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_10_11()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_10_11:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_11_12()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_11_12:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_12_13()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_12_13:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_13_14()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_13_14:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_14_15()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_14_15:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_15_16()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_15_16:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_16_17()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_16_17:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_17_18()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_17_18:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_18_19()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_18_19:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_19_20()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_19_20:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_1_2()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_1_2:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_20_21()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_20_21:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_21_22()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_21_22:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_22_23()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_22_23:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_23_24()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_23_24:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_24_25()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_24_25:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_25_26()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_25_26:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_26_27()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_26_27:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_27_28()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_27_28:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_28_29()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_28_29:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_29_30()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_29_30:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_2_3()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_2_3:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_30_31()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_30_31:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_31_32()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_31_32:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_32_33()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_32_33:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_33_34()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_33_34:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_34_35()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_34_35:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_35_36()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_35_36:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_36_37()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_36_37:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_37_38()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_37_38:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_38_39()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_38_39:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_39_40()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_39_40:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_3_4()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_3_4:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_40_41()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_40_41:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_41_42()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_41_42:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_42_43()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_42_43:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_43_44()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_43_44:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_44_45()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_44_45:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_45_46()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_45_46:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_46_47()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_46_47:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_47_48()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_47_48:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_48_49()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_48_49:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_49_50()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_49_50:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_4_5()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_4_5:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_50_51()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_50_51:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_51_52()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_51_52:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_52_53()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_52_53:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_53_54()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_53_54:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_54_55()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_54_55:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_55_56()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_55_56:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_56_57()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_56_57:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_57_58()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_57_58:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_58_59()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_58_59:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_59_60()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_59_60:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_5_6()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_5_6:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_60_61()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_60_61:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_61_62()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_61_62:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_62_63()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_62_63:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_63_64()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_63_64:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_64_65()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_64_65:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_65_66()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_65_66:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_66_67()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_66_67:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_67_68()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_67_68:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_68_69()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_68_69:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_6_7()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_6_7:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_7_8()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_7_8:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_8_9()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_8_9:Lmb/b;

    return-object v0
.end method

.method public static final getDB_MIGRATION_9_10()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;->DB_MIGRATION_9_10:Lmb/b;

    return-object v0
.end method
