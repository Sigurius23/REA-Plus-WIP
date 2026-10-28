.class Lx90/b$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx90/b;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lx90/b;


# direct methods
.method public constructor <init>(Lx90/b;)V
    .locals 0

    iput-object p1, p0, Lx90/b$a;->a:Lx90/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lx90/c;)V
    .locals 4

    invoke-virtual {p2}, Lx90/c;->e()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lx90/c;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lx90/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lx90/c;->j()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lx90/c;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lx90/c;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lx90/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lx90/c;->d()Z

    move-result v0

    const/4 v1, 0x5

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x6

    invoke-virtual {p2}, Lx90/c;->i()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lx90/c;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lx90/c;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lx90/b$a;->a:Lx90/b;

    invoke-static {v0}, Lx90/b;->f(Lx90/b;)Lcom/whoop/activitysession/a;

    move-result-object v0

    invoke-virtual {p2}, Lx90/c;->f()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/whoop/activitysession/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x8

    if-nez p2, :cond_4

    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    :cond_4
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx90/c;

    invoke-virtual {p0, p1, p2}, Lx90/b$a;->a(Ltb/c;Lx90/c;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `active_activity_session_table` (`id`,`activitySessionId`,`state`,`selectedActivityInternalName`,`gpsTrackingEnabled`,`startTimeMs`,`resumeNavigationJson`,`pauseSegmentsJson`) VALUES (?,?,?,?,?,?,?,?)"

    return-object v0
.end method
