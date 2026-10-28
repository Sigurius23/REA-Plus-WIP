.class public final Ljy1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljy1/b;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lky1/a;

.field private final d:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lky1/a;

    invoke-direct {v0}, Lky1/a;-><init>()V

    iput-object v0, p0, Ljy1/c;->c:Lky1/a;

    iput-object p1, p0, Ljy1/c;->a:Landroidx/room/z0;

    new-instance p1, Ljy1/c$a;

    invoke-direct {p1, p0}, Ljy1/c$a;-><init>(Ljy1/c;)V

    iput-object p1, p0, Ljy1/c;->b:Landroidx/room/k;

    new-instance p1, Ljy1/c$b;

    invoke-direct {p1, p0}, Ljy1/c$b;-><init>(Ljy1/c;)V

    iput-object p1, p0, Ljy1/c;->d:Landroidx/room/i;

    return-void
.end method

.method public static synthetic d(Ljy1/c;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljy1/c;->l(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljy1/c;Ljy1/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljy1/c;->n(Ljy1/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljy1/c;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljy1/c;->m(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g(Ljy1/c;)Lky1/a;
    .locals 0

    iget-object p0, p0, Ljy1/c;->c:Lky1/a;

    return-object p0
.end method

.method public static bridge synthetic h(Ljy1/c;Lcom/whoop/metrics/domain/models/MetricPostType;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Ljy1/c;->i(Lcom/whoop/metrics/domain/models/MetricPostType;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private i(Lcom/whoop/metrics/domain/models/MetricPostType;)Ljava/lang/String;
    .locals 3

    sget-object v0, Ljy1/c$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const-string p1, "HISTOGRAM"

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string p1, "GAUGE"

    return-object p1

    :cond_2
    const-string p1, "DISTRIBUTION"

    return-object p1

    :cond_3
    const-string p1, "COUNT"

    return-object p1
.end method

.method private j(Ljava/lang/String;)Lcom/whoop/metrics/domain/models/MetricPostType;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "DISTRIBUTION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "HISTOGRAM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "GAUGE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "COUNT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t convert value to enum, unknown value: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/whoop/metrics/domain/models/MetricPostType;->HISTOGRAM:Lcom/whoop/metrics/domain/models/MetricPostType;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/whoop/metrics/domain/models/MetricPostType;->GAUGE:Lcom/whoop/metrics/domain/models/MetricPostType;

    return-object p1

    :pswitch_3
    sget-object p1, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x3d558ef -> :sswitch_3
        0x40758d9 -> :sswitch_2
        0xcec1144 -> :sswitch_1
        0x2be73684 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private synthetic l(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Ljy1/c;->d:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handleMultiple(Ltb/a;Ljava/lang/Iterable;)I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic m(ILtb/a;)Ljava/util/List;
    .locals 13

    const-string v0, "SELECT * FROM metrics_table LIMIT ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    int-to-long v1, p1

    :try_start_0
    invoke-interface {p2, v0, v1, v2}, Ltb/c;->p(IJ)V

    const-string p1, "id"

    invoke-static {p2, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string v0, "name"

    invoke-static {p2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "value"

    invoke-static {p2, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "tags"

    invoke-static {p2, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "metric_type"

    invoke-static {p2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p2}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p2, p1}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v8, v5

    invoke-interface {p2, v0}, Ltb/c;->isNull(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    move-object v9, v6

    goto :goto_1

    :cond_0
    invoke-interface {p2, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    move-object v9, v5

    :goto_1
    invoke-interface {p2, v1}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v10, v6

    goto :goto_2

    :cond_1
    invoke-interface {p2, v1}, Ltb/c;->getDouble(I)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    move-object v10, v5

    :goto_2
    invoke-interface {p2, v2}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v6

    goto :goto_3

    :cond_2
    invoke-interface {p2, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3
    iget-object v7, p0, Ljy1/c;->c:Lky1/a;

    invoke-virtual {v7, v5}, Lky1/a;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    invoke-interface {p2, v3}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_4
    move-object v12, v6

    goto :goto_5

    :cond_3
    invoke-interface {p2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Ljy1/c;->j(Ljava/lang/String;)Lcom/whoop/metrics/domain/models/MetricPostType;

    move-result-object v6

    goto :goto_4

    :goto_5
    new-instance v7, Ljy1/a;

    invoke-direct/range {v7 .. v12}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :cond_4
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_6
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private synthetic n(Ljy1/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Ljy1/c;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Ljy1/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljy1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ljy1/c;->a:Landroidx/room/z0;

    new-instance v1, Lbp0/n;

    const/16 v2, 0x10

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljy1/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ljy1/c;->a:Landroidx/room/z0;

    new-instance v1, Lbp0/n;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljy1/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljy1/c;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v2, 0xc

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
