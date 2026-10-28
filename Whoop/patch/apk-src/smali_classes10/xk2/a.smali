.class public final Lxk2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxk2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJK\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Jc\u0010\u0019\u001a\u00020\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00132\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00132\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lxk2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/domain/model/GenderBaseline;",
        "baseline",
        "",
        "weightKg",
        "heightM",
        "",
        "age",
        "a",
        "(Lcom/whoop/domain/model/GenderBaseline;DDI)D",
        "maximumHeartRate",
        "restingCaloriesPerSecond",
        "heartRateThreshold",
        "Ll83/k;",
        "c",
        "(Lcom/whoop/domain/model/GenderBaseline;DIDDD)Ll83/k;",
        "",
        "heartRates",
        "",
        "timestampsMillis",
        "nextTimestampMillis",
        "restingHeartRate",
        "b",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;DDLcom/whoop/domain/model/GenderBaseline;DDI)D",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lxk2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxk2/a;

    invoke-direct {v0}, Lxk2/a;-><init>()V

    sput-object v0, Lxk2/a;->a:Lxk2/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lcom/whoop/domain/model/GenderBaseline;DDI)D
    .locals 8

    const-wide v0, 0x402acb4395810625L    # 13.397

    mul-double/2addr v0, p2

    const-wide v2, 0x407dfe6666666666L    # 479.9

    mul-double/2addr v2, p4

    add-double/2addr v2, v0

    int-to-double v0, p6

    const-wide v4, 0x4016b53f7ced9168L    # 5.677

    mul-double/2addr v4, v0

    sub-double/2addr v2, v4

    const-wide v4, 0x4056172b020c49baL    # 88.362

    add-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    const-wide v6, 0x40227e76c8b43958L    # 9.247

    mul-double/2addr p2, v6

    const-wide v6, 0x40735ccccccccccdL    # 309.8

    mul-double/2addr p4, v6

    add-double/2addr p4, p2

    const-wide p2, 0x401151eb851eb852L    # 4.33

    mul-double/2addr v0, p2

    sub-double/2addr p4, v0

    const-wide p2, 0x407bf97ced916873L    # 447.593

    add-double/2addr p4, p2

    invoke-static {v4, v5, p4, p5}, Ljava/lang/Math;->max(DD)D

    move-result-wide p2

    sget-object p4, Lxk2/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p4, p1

    const/4 p4, 0x1

    if-eq p1, p4, :cond_2

    const/4 p4, 0x2

    if-eq p1, p4, :cond_1

    const/4 p4, 0x3

    if-ne p1, p4, :cond_0

    add-double/2addr v2, p2

    const-wide/high16 p1, 0x4000000000000000L    # 2.0

    div-double/2addr v2, p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move-wide v2, p2

    :cond_2
    :goto_0
    const-wide p1, 0x40f5180000000000L    # 86400.0

    div-double/2addr v2, p1

    return-wide v2
.end method

.method private final c(Lcom/whoop/domain/model/GenderBaseline;DIDDD)Ll83/k;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/GenderBaseline;",
            "DIDDD)",
            "Ll83/k;"
        }
    .end annotation

    const-wide v0, 0x3fe4305532617c1cL    # 0.6309

    mul-double/2addr v0, p5

    const-wide v2, -0x3fb47398c7e28241L    # -55.0969

    add-double/2addr v0, v2

    const-wide v2, 0x3fc972474538ef35L    # 0.1988

    mul-double/2addr v2, p2

    add-double/2addr v2, v0

    int-to-double v0, p4

    const-wide v4, 0x3fc9d14e3bcd35a8L    # 0.2017

    mul-double/2addr v4, v0

    add-double/2addr v4, v2

    const-wide v2, 0x406f6147ae147ae2L    # 251.04000000000002

    div-double/2addr v4, v2

    const-wide v6, 0x3fdc9eecbfb15b57L    # 0.4472

    mul-double/2addr v6, p5

    const-wide v8, -0x3fcb99096bb98c7eL    # -20.4022

    add-double/2addr v6, v8

    const-wide v8, -0x403fd566cf41f213L    # -0.1263

    mul-double/2addr p2, v8

    add-double/2addr p2, v6

    const-wide v6, 0x3fb2f1a9fbe76c8bL    # 0.074

    mul-double/2addr v0, v6

    add-double/2addr v0, p2

    div-double/2addr v0, v2

    sget-object p2, Lxk2/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    add-double/2addr v4, v0

    const-wide/high16 p1, 0x4000000000000000L    # 2.0

    div-double/2addr v4, p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move-wide v4, v0

    :cond_2
    :goto_0
    sub-double v4, v4, p7

    sub-double p1, p5, p9

    div-double/2addr v4, p1

    mul-double p1, p9, v4

    sub-double p1, p7, p1

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    new-instance p2, Ll83/k;

    invoke-direct {p2, p3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public final b(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;DDLcom/whoop/domain/model/GenderBaseline;DDI)D
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/Long;",
            "DD",
            "Lcom/whoop/domain/model/GenderBaseline;",
            "DDI)D"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "heartRates"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "timestampsMillis"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "baseline"

    move-object/from16 v4, p8

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    move-wide/from16 v5, p9

    move-wide/from16 v7, p11

    move/from16 v9, p13

    invoke-direct/range {v3 .. v9}, Lxk2/a;->a(Lcom/whoop/domain/model/GenderBaseline;DDI)D

    move-result-wide v10

    sget-object v2, Lxk2/g;->a:Lxk2/g;

    move-object/from16 v3, p3

    invoke-virtual {v2, v1, v3}, Lxk2/g;->d(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v1

    const-wide v2, 0x3fd3333333333333L    # 0.3

    sub-double v4, p6, p4

    mul-double/2addr v4, v2

    add-double v12, v4, p4

    move-object/from16 v3, p0

    move-wide/from16 v8, p6

    move-object/from16 v4, p8

    move-wide/from16 v5, p9

    move/from16 v7, p13

    invoke-direct/range {v3 .. v13}, Lxk2/a;->c(Lcom/whoop/domain/model/GenderBaseline;DIDDD)Ll83/k;

    move-result-object v2

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v7, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v9, v2

    check-cast v9, Lm83/e0;

    invoke-virtual {v9}, Lm83/e0;->nextInt()I

    move-result v9

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v14

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v16

    cmpg-double v9, v14, v12

    if-gez v9, :cond_0

    mul-double v16, v16, v10

    goto :goto_1

    :cond_0
    mul-double/2addr v14, v3

    add-double/2addr v14, v5

    mul-double v16, v16, v14

    :goto_1
    add-double v7, v7, v16

    goto :goto_0

    :cond_1
    return-wide v7
.end method
