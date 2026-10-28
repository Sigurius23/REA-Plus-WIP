.class Lrk2/d$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrk2/d;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lrk2/d;


# direct methods
.method public constructor <init>(Lrk2/d;)V
    .locals 0

    iput-object p1, p0, Lrk2/d$a;->a:Lrk2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lrk2/e;)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p2}, Lrk2/e;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lrk2/e;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lrk2/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lrk2/e;->c()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lrk2/e;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lrk2/e;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lrk2/e;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lrk2/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lrk2/e;->d()Z

    move-result v0

    const/4 v1, 0x6

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x7

    invoke-virtual {p2}, Lrk2/e;->g()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lrk2/d$a;->a:Lrk2/d;

    invoke-static {v0}, Lrk2/d;->g(Lrk2/d;)Lrk2/a;

    move-result-object v0

    invoke-virtual {p2}, Lrk2/e;->f()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Lrk2/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x8

    if-nez p2, :cond_3

    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    :cond_3
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lrk2/e;

    invoke-virtual {p0, p1, p2}, Lrk2/d$a;->a(Ltb/c;Lrk2/e;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR ABORT INTO `pending_activity_save_table` (`id`,`activityInternalName`,`garmentId`,`startTime`,`endTime`,`gpsEnabled`,`queuedAtMs`,`pauseSegmentsJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)"

    return-object v0
.end method
