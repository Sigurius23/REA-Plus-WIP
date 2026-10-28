.class public final enum Lz30/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lz30/e;

.field public static final enum y:Lz30/e;

.field public static final synthetic z:[Lz30/e;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v1, Lz30/e;

    const/4 v0, 0x0

    const-string v2, "administrative_area_level_1"

    const-string v3, "ADMINISTRATIVE_AREA_LEVEL_1"

    invoke-direct {v1, v3, v0, v2}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lz30/e;->x:Lz30/e;

    new-instance v2, Lz30/e;

    const/4 v0, 0x1

    const-string v3, "administrative_area_level_2"

    const-string v4, "ADMINISTRATIVE_AREA_LEVEL_2"

    invoke-direct {v2, v4, v0, v3}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lz30/e;->y:Lz30/e;

    new-instance v3, Lz30/e;

    const/4 v0, 0x2

    const-string v4, "administrative_area_level_3"

    const-string v5, "ADMINISTRATIVE_AREA_LEVEL_3"

    invoke-direct {v3, v5, v0, v4}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lz30/e;

    const/4 v0, 0x3

    const-string v5, "administrative_area_level_4"

    const-string v6, "ADMINISTRATIVE_AREA_LEVEL_4"

    invoke-direct {v4, v6, v0, v5}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Lz30/e;

    const/4 v0, 0x4

    const-string v6, "country"

    const-string v7, "COUNTRY"

    invoke-direct {v5, v7, v0, v6}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lz30/e;

    const/4 v0, 0x5

    const-string v7, "locality"

    const-string v8, "LOCALITY"

    invoke-direct {v6, v8, v0, v7}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Lz30/e;

    const/4 v0, 0x6

    const-string v8, "neighborhood"

    const-string v9, "NEIGHBORHOOD"

    invoke-direct {v7, v9, v0, v8}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Lz30/e;

    const/4 v0, 0x7

    const-string v9, "postal_town"

    const-string v10, "POSTAL_TOWN"

    invoke-direct {v8, v10, v0, v9}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v9, Lz30/e;

    const/16 v0, 0x8

    const-string v10, "postal_code"

    const-string v11, "POSTAL_CODE"

    invoke-direct {v9, v11, v0, v10}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v10, Lz30/e;

    const/16 v0, 0x9

    const-string v11, "premise"

    const-string v12, "PREMISE"

    invoke-direct {v10, v12, v0, v11}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v11, Lz30/e;

    const/16 v0, 0xa

    const-string v12, "route"

    const-string v13, "ROUTE"

    invoke-direct {v11, v13, v0, v12}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v12, Lz30/e;

    const/16 v0, 0xb

    const-string v13, "street_number"

    const-string v14, "STREET_NUMBER"

    invoke-direct {v12, v14, v0, v13}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v13, Lz30/e;

    const/16 v0, 0xc

    const-string v14, "sublocality"

    const-string v15, "SUBLOCALITY"

    invoke-direct {v13, v15, v0, v14}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v14, Lz30/e;

    const/16 v0, 0xd

    const-string v15, "sublocality_level_1"

    move-object/from16 v16, v1

    const-string v1, "SUBLOCALITY_LEVEL_1"

    invoke-direct {v14, v1, v0, v15}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v15, Lz30/e;

    const/16 v0, 0xe

    const-string v1, "sublocality_level_2"

    move-object/from16 v17, v2

    const-string v2, "SUBLOCALITY_LEVEL_2"

    invoke-direct {v15, v2, v0, v1}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lz30/e;

    const/16 v1, 0xf

    const-string v2, "sublocality_level_3"

    move-object/from16 v18, v3

    const-string v3, "SUBLOCALITY_LEVEL_3"

    invoke-direct {v0, v3, v1, v2}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lz30/e;

    const/16 v2, 0x10

    const-string v3, "sublocality_level_4"

    move-object/from16 v19, v0

    const-string v0, "SUBLOCALITY_LEVEL_4"

    invoke-direct {v1, v0, v2, v3}, Lz30/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v17, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v19

    filled-new-array/range {v1 .. v17}, [Lz30/e;

    move-result-object v0

    sput-object v0, Lz30/e;->z:[Lz30/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lz30/e;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lz30/e;
    .locals 1

    const-class v0, Lz30/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz30/e;

    return-object p0
.end method

.method public static values()[Lz30/e;
    .locals 1

    sget-object v0, Lz30/e;->z:[Lz30/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz30/e;

    return-object v0
.end method
