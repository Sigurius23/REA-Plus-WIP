.class public final Lxk2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxk2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u000cB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lxk2/b;",
        "",
        "<init>",
        "()V",
        "",
        "Lxk2/j;",
        "segment",
        "c",
        "(Ljava/util/List;)Ljava/util/List;",
        "",
        "values",
        "percentile",
        "a",
        "(Ljava/util/List;D)D",
        "buffer",
        "",
        "lastProcessedTimestampMillis",
        "Lxk2/b$a;",
        "b",
        "(Ljava/util/List;Ljava/lang/Long;)Lxk2/b$a;",
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
.field public static final a:Lxk2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxk2/b;

    invoke-direct {v0}, Lxk2/b;-><init>()V

    sput-object v0, Lxk2/b;->a:Lxk2/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/util/List;D)D
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;D)D"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    return-wide p1

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->t1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    cmpg-double v0, p2, v1

    if-gtz v0, :cond_2

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    return-wide p1

    :cond_2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, p2, v0

    if-ltz v2, :cond_3

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    return-wide p1

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    int-to-double v4, v2

    sub-double/2addr v4, v0

    mul-double/2addr v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide p2

    double-to-int p2, p2

    int-to-double v0, p2

    sub-double/2addr v4, v0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    add-int/2addr p2, v3

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    sub-double/2addr p1, v0

    mul-double/2addr p1, v4

    add-double/2addr p1, v0

    return-wide p1
.end method

.method private final c(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;)",
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lxk2/j;

    check-cast v2, Lxk2/j;

    invoke-virtual {v4}, Lxk2/j;->b()J

    move-result-wide v4

    invoke-virtual {v2}, Lxk2/j;->b()J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v3

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_1
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->T0(Ljava/lang/Iterable;)Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_2

    goto :goto_4

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    cmpl-double v5, v5, v3

    if-ltz v5, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, -0x1

    :goto_3
    const/16 v0, 0x1e

    if-le v2, v0, :cond_5

    add-int/lit8 v2, v2, 0x1

    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    :cond_6
    :goto_4
    return-object p1
.end method


# virtual methods
.method public final b(Ljava/util/List;Ljava/lang/Long;)Lxk2/b$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxk2/j;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lxk2/b$a;"
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v1

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lxk2/j;

    invoke-virtual {v6}, Lxk2/j;->b()J

    move-result-wide v6

    cmp-long v6, v6, v2

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, -0x1

    :goto_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-ltz v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v0

    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v4, v0

    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_8

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1e

    if-ge v2, v5, :cond_7

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxk2/j;

    invoke-virtual {p2}, Lxk2/j;->b()J

    move-result-wide v4

    add-int/lit8 p2, v2, -0x1e

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v7, v2, 0x1e

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-interface {p1, p2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p2}, Lxk2/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    check-cast p2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {p2, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxk2/j;

    invoke-virtual {v7}, Lxk2/j;->a()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    const-wide/high16 v7, 0x3fd0000000000000L    # 0.25

    invoke-direct {p0, v6, v7, v8}, Lxk2/b;->a(Ljava/util/List;D)D

    move-result-wide v6

    new-instance p2, Lxk2/j;

    invoke-direct {p2, v4, v5, v6, v7}, Lxk2/j;-><init>(JD)V

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    add-int/lit8 v4, v2, 0x1

    invoke-static {v4, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxk2/j;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lxk2/j;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_6

    :cond_6
    move-object v4, v0

    :cond_7
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    :cond_8
    add-int/lit8 v2, v2, -0x3c

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v1, Lxk2/b$a;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, v3, v4, p2, p1}, Lxk2/b$a;-><init>(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V

    return-object v1
.end method
