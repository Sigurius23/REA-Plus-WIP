.class Lrd1/d$f$a;
.super Lq92/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd1/d$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic J:Lrd1/d$f;


# direct methods
.method public constructor <init>(Lrd1/d$f;)V
    .locals 0

    iput-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    invoke-direct {p0}, Lq92/d;-><init>()V

    return-void
.end method


# virtual methods
.method public m(Lzj0/w;)V
    .locals 2

    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onHistoryAbortResponse"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public n(Lzj0/b0;)V
    .locals 2

    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onLoadFirmwareDataResponse"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public o(Lzj0/c0;)V
    .locals 2

    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onProcessFirmwareImageResponse"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public q(Lzj0/a1;)V
    .locals 2

    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onStartFirmwareLoadResponse"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public s(Lzj0/j1;)V
    .locals 4

    iget-object v0, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object v0, v0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "onToggleRealTimeHrResponse "

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lzj0/h;->V()Lwj0/b;

    move-result-object p1

    sget-object v0, Lwj0/b;->FAILURE:Lwj0/b;

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    invoke-static {p1}, Lrd1/d$f;->k(Lrd1/d$f;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->D(Lrd1/d;)V

    return-void

    :cond_0
    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->C(Lrd1/d;)V

    return-void

    :cond_1
    iget-object p1, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    iget-object p1, p1, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Failed to "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lrd1/d$f$a;->J:Lrd1/d$f;

    invoke-static {v2}, Lrd1/d$f;->k(Lrd1/d$f;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "enable"

    goto :goto_0

    :cond_2
    const-string v2, "disable"

    :goto_0
    const-string v3, " real time stream"

    invoke-static {v2, v3, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
