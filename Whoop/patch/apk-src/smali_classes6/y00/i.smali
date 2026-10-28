.class public final enum Ly00/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final M:Lt9/c0;

.field public static final N:Ljava/util/List;

.field public static final enum O:Ly00/i;

.field public static final enum P:Ly00/i;

.field public static final enum Q:Ly00/i;

.field public static final enum R:Ly00/i;

.field public static final enum S:Ly00/i;

.field public static final enum T:Ly00/i;

.field public static final enum U:Ly00/i;

.field public static final enum V:Ly00/i;

.field public static final enum W:Ly00/i;

.field public static final enum X:Ly00/i;

.field public static final synthetic Y:[Ly00/i;

.field public static final synthetic Z:Lt83/b;


# instance fields
.field public final E:I

.field public final F:Ljava/util/Set;

.field public final G:I

.field public final H:Ljava/util/regex/Pattern;

.field public final I:Ljava/util/Map;

.field public final J:Ljava/util/Map;

.field public final K:Z

.field public final L:I

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 35

    new-instance v0, Ly00/i;

    const-string v1, "^(4)[0-9]*$"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-string v14, "^4$"

    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v13, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v9

    const/4 v11, 0x1

    const/16 v12, 0x678

    const-string v1, "Visa"

    const/4 v2, 0x0

    const-string v3, "visa"

    const-string v4, "Visa"

    const v5, 0x7f080853

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v0, Ly00/i;->O:Ly00/i;

    new-instance v1, Ly00/i;

    const-string v2, "^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v23

    const-string v2, "^2|5|6$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v13, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v7}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v24

    const/16 v26, 0x2

    const/16 v27, 0x678

    const-string v16, "MasterCard"

    const/16 v17, 0x1

    const-string v18, "mastercard"

    const-string v19, "Mastercard"

    const v20, 0x7f0807dd

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object v15, v1

    invoke-direct/range {v15 .. v27}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v1, Ly00/i;->P:Ly00/i;

    new-instance v15, Ly00/i;

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v4, v6}, [Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v21

    const-string v7, "^(34|37)[0-9]*$"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v23

    const-string v7, "^3$"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v13, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v24

    const/16 v26, 0x3

    const/16 v27, 0x610

    const-string v16, "AmericanExpress"

    const/16 v17, 0x2

    const-string v18, "amex"

    const-string v19, "American Express"

    const v20, 0x7f0807a5

    const/16 v22, 0xf

    invoke-direct/range {v15 .. v27}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v15, Ly00/i;->Q:Ly00/i;

    new-instance v16, Ly00/i;

    const-string v8, "^(60|64|65)[0-9]*$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v24

    const-string v8, "^6$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v13, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v25

    const/16 v27, 0x4

    const/16 v28, 0x678

    const-string v17, "Discover"

    const/16 v18, 0x3

    const-string v19, "discover"

    const-string v20, "Discover"

    const v21, 0x7f0807cc

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v16, Ly00/i;->R:Ly00/i;

    new-instance v17, Ly00/i;

    const-string v8, "^(352[89]|35[3-8][0-9])[0-9]*$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v25

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v13, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "^(35)$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    new-instance v10, Ll83/k;

    invoke-direct {v10, v3, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "^(35[2-8])$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    new-instance v11, Ll83/k;

    invoke-direct {v11, v4, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v9, v10, v11}, [Ll83/k;

    move-result-object v8

    invoke-static {v8}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v26

    const/16 v28, 0x5

    const/16 v29, 0x678

    const-string v18, "JCB"

    const/16 v19, 0x4

    const-string v20, "jcb"

    const-string v21, "JCB"

    const v22, 0x7f0807d9

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v17 .. v29}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v17, Ly00/i;->S:Ly00/i;

    new-instance v18, Ly00/i;

    const-string v8, "^(36|30|38|39)[0-9]*$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v26

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    new-instance v8, Ll83/k;

    invoke-direct {v8, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v27

    const-string v7, "^(36)[0-9]*$"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    const/16 v8, 0xe

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v28

    const/16 v29, 0x6

    const/16 v30, 0x438

    const-string v19, "DinersClub"

    const/16 v20, 0x5

    const-string v21, "diners"

    const-string v22, "Diners Club"

    const v23, 0x7f0807c9

    const/16 v24, 0x0

    const/16 v25, 0x10

    invoke-direct/range {v18 .. v30}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v18, Ly00/i;->T:Ly00/i;

    new-instance v19, Ly00/i;

    const-string v7, "^(62|81)[0-9]*$"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v27

    const-string v7, "^6|8$"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    new-instance v8, Ll83/k;

    invoke-direct {v8, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v28

    const/16 v30, 0x7

    const/16 v31, 0x678

    const-string v20, "UnionPay"

    const/16 v21, 0x6

    const-string v22, "unionpay"

    const-string v23, "UnionPay"

    const v24, 0x7f08084e

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v19 .. v31}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v19, Ly00/i;->U:Ly00/i;

    new-instance v20, Ly00/i;

    const-string v7, "(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v28

    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    new-instance v8, Ll83/k;

    invoke-direct {v8, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v7, v5}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v29

    const/16 v31, 0x8

    const/16 v32, 0x278

    const-string v21, "CartesBancaires"

    const/16 v22, 0x7

    const-string v23, "cartes_bancaires"

    const-string v24, "Cartes Bancaires"

    const v25, 0x7f0807be

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v20 .. v32}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v20, Ly00/i;->V:Ly00/i;

    new-instance v21, Ly00/i;

    const-string v2, "^(4506|4519|4724|4536|500|5510|629449)[0-9]*$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v29

    const-string v2, "^(4|5|6)$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v13, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "^(45|50|55|62)$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v8, Ll83/k;

    invoke-direct {v8, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "^(450|451|472|453|500|551|629)$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v9, Ll83/k;

    invoke-direct {v9, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "^(4506|4519|4724|4536|5510|6294)$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v10, Ll83/k;

    invoke-direct {v10, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "^(62944)$"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    new-instance v11, Ll83/k;

    invoke-direct {v11, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "^(629449)$"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    new-instance v12, Ll83/k;

    invoke-direct {v12, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v7 .. v12}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v30

    const/16 v32, 0x9

    const/16 v33, 0x278

    const-string v22, "Interac"

    const/16 v23, 0x8

    const-string v24, "interac"

    const-string v25, "Interac"

    const v26, 0x7f0807d6

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v21 .. v33}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v21, Ly00/i;->W:Ly00/i;

    new-instance v22, Ly00/i;

    filled-new-array {v4, v6}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v28

    const/16 v33, -0x1

    const/16 v34, 0x6d8

    const-string v23, "Unknown"

    const/16 v24, 0x9

    const-string v25, "unknown"

    const-string v26, "Unknown"

    const v27, 0x7f080851

    const/16 v29, 0x0

    const/16 v30, 0x0

    sget-object v31, Lm83/z;->w:Lm83/z;

    const/16 v32, 0x0

    invoke-direct/range {v22 .. v34}, Ly00/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V

    sput-object v22, Ly00/i;->X:Ly00/i;

    move-object v2, v15

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    move-object/from16 v7, v20

    move-object/from16 v8, v21

    move-object/from16 v9, v22

    filled-new-array/range {v0 .. v9}, [Ly00/i;

    move-result-object v0

    sput-object v0, Ly00/i;->Y:[Ly00/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/i;->Z:Lt83/b;

    new-instance v1, Lt9/c0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Ly00/i;->M:Lt9/c0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, La0/i1;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    :goto_0
    invoke-virtual {v2}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ly00/i;

    iget-boolean v3, v3, Ly00/i;->K:Z

    if-eqz v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ly00/i;

    iget v3, v3, Ly00/i;->L:I

    if-lez v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v1, Lqx/d0;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lqx/d0;-><init>(I)V

    invoke-static {v0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ly00/i;->N:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;II)V
    .locals 2

    and-int/lit8 v0, p12, 0x8

    if-eqz v0, :cond_0

    const v0, 0x7f0807c6

    goto :goto_0

    :cond_0
    const v0, 0x7f0807c7

    :goto_0
    and-int/lit8 v1, p12, 0x20

    if-eqz v1, :cond_1

    const/4 p6, 0x3

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-static {p6}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p6

    :cond_1
    and-int/lit8 v1, p12, 0x40

    if-eqz v1, :cond_2

    const/16 p7, 0x10

    :cond_2
    and-int/lit16 v1, p12, 0x80

    if-eqz v1, :cond_3

    const/4 p8, 0x0

    :cond_3
    and-int/lit16 v1, p12, 0x200

    if-eqz v1, :cond_4

    sget-object p10, Lm83/z;->w:Lm83/z;

    :cond_4
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_5

    const/4 p12, 0x1

    goto :goto_1

    :cond_5
    const/4 p12, 0x0

    :goto_1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/i;->w:Ljava/lang/String;

    iput-object p4, p0, Ly00/i;->x:Ljava/lang/String;

    iput p5, p0, Ly00/i;->y:I

    iput v0, p0, Ly00/i;->z:I

    const p1, 0x7f0807d1

    iput p1, p0, Ly00/i;->E:I

    iput-object p6, p0, Ly00/i;->F:Ljava/util/Set;

    iput p7, p0, Ly00/i;->G:I

    iput-object p8, p0, Ly00/i;->H:Ljava/util/regex/Pattern;

    iput-object p9, p0, Ly00/i;->I:Ljava/util/Map;

    iput-object p10, p0, Ly00/i;->J:Ljava/util/Map;

    iput-boolean p12, p0, Ly00/i;->K:Z

    iput p11, p0, Ly00/i;->L:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/i;
    .locals 1

    const-class v0, Ly00/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/i;

    return-object p0
.end method

.method public static values()[Ly00/i;
    .locals 1

    sget-object v0, Ly00/i;->Y:[Ly00/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/i;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/i;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Ly00/i;->F:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method public final c(Ljava/lang/String;)I
    .locals 4

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzx/g;

    invoke-direct {v0, p1}, Lzx/g;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ly00/i;->J:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/regex/Pattern;

    iget-object v3, v0, Lzx/g;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_2
    iget p1, p0, Ly00/i;->G:I

    return p1
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-virtual {p0}, Ly00/i;->b()I

    move-result v1

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
