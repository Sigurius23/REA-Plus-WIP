.class public final Lxk2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JC\u0010\u0014\u001a\u00020\u00042\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lxk2/g;",
        "",
        "<init>",
        "()V",
        "",
        "heartRate",
        "restingHeartRate",
        "maximumHeartRate",
        "b",
        "(DDD)D",
        "reserve",
        "e",
        "(D)D",
        "",
        "",
        "timestampsMillis",
        "nextTimestampMillis",
        "d",
        "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;",
        "heartRates",
        "a",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;DD)D",
        "raw",
        "",
        "c",
        "(D)F",
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
.field public static final a:Lxk2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxk2/g;

    invoke-direct {v0}, Lxk2/g;-><init>()V

    sput-object v0, Lxk2/g;->a:Lxk2/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;DD)D
    .locals 16
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
            "DD)D"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "heartRates"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "timestampsMillis"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    invoke-virtual {v2, v1, v3}, Lxk2/g;->d(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v1

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    move-object v8, v3

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    sget-object v9, Lxk2/g;->a:Lxk2/g;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    invoke-virtual/range {v9 .. v15}, Lxk2/g;->b(DDD)D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lxk2/g;->e(D)D

    move-result-wide v9

    const-wide v11, 0x4125180000000000L    # 691200.0

    div-double/2addr v9, v11

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v11

    mul-double/2addr v11, v9

    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v8

    add-double/2addr v6, v8

    goto :goto_0

    :cond_0
    return-wide v6
.end method

.method public final b(DDD)D
    .locals 6

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    add-double/2addr p5, v0

    sub-double/2addr p1, p3

    sub-double/2addr p5, p3

    div-double v0, p1, p5

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v0 .. v5}, Le93/b;->l(DDD)D

    move-result-wide p1

    return-wide p1
.end method

.method public final c(D)F
    .locals 11

    invoke-static {}, Lxk2/i;->a()[D

    move-result-object v0

    array-length v0, v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move v5, v3

    move-wide v3, v1

    :goto_0
    if-ge v5, v0, :cond_2

    invoke-static {}, Lxk2/i;->a()[D

    move-result-object v6

    aget-wide v6, v6, v5

    cmpg-double v8, p1, v6

    const-wide v9, 0x3fb999999999999aL    # 0.1

    if-gez v8, :cond_1

    add-double/2addr v3, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v6

    cmpg-double p1, p1, v3

    if-gez p1, :cond_0

    double-to-float p1, v1

    return p1

    :cond_0
    int-to-double p1, v5

    mul-double/2addr p1, v9

    double-to-float p1, p1

    return p1

    :cond_1
    int-to-double v1, v5

    mul-double/2addr v1, v9

    add-int/lit8 v5, v5, 0x1

    move-wide v3, v6

    goto :goto_0

    :cond_2
    double-to-float p1, v1

    return p1
.end method

.method public final d(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const-string v0, "timestampsMillis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {p2, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_3

    add-int/lit8 v3, v1, 0x1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eq p2, p1, :cond_4

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method

.method public final e(D)D
    .locals 4

    const-wide v0, 0x3fd3333333333333L    # 0.3

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double p1, v0, p1

    const-wide v2, 0x3fc3333333333333L    # 0.15

    div-double/2addr p1, v2

    invoke-static {p1, p2}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    add-double/2addr p1, v0

    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    div-double/2addr v0, p1

    return-wide v0
.end method
