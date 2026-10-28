.class Ljy1/c$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljy1/c;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljy1/c;


# direct methods
.method public constructor <init>(Ljy1/c;)V
    .locals 0

    iput-object p1, p0, Ljy1/c$a;->a:Ljy1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Ljy1/a;)V
    .locals 4

    invoke-virtual {p2}, Ljy1/a;->c()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Ljy1/a;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljy1/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Ljy1/a;->g()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljy1/a;->g()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v2, v3, v1}, Ltb/c;->t(DI)V

    :goto_1
    iget-object v0, p0, Ljy1/c$a;->a:Ljy1/c;

    invoke-static {v0}, Ljy1/c;->g(Ljy1/c;)Lky1/a;

    move-result-object v0

    invoke-virtual {p2}, Ljy1/a;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lky1/a;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Ljy1/a;->d()Lcom/whoop/metrics/domain/models/MetricPostType;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_3
    iget-object v0, p0, Ljy1/c$a;->a:Ljy1/c;

    invoke-virtual {p2}, Ljy1/a;->d()Lcom/whoop/metrics/domain/models/MetricPostType;

    move-result-object p2

    invoke-static {v0, p2}, Ljy1/c;->h(Ljy1/c;Lcom/whoop/metrics/domain/models/MetricPostType;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljy1/a;

    invoke-virtual {p0, p1, p2}, Ljy1/c$a;->a(Ltb/c;Ljy1/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `metrics_table` (`id`,`name`,`value`,`tags`,`metric_type`) VALUES (nullif(?, 0),?,?,?,?)"

    return-object v0
.end method
