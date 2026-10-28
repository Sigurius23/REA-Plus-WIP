.class Lrd1/d$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/d$m;-><init>(Lrd1/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd1/d;


# direct methods
.method public constructor <init>(Lrd1/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lod1/t$e;
    .locals 2

    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "TimeoutState EnterAction"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->s(Lrd1/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lrd1/d$k;->DISABLING:Lrd1/d$k;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->t(Lrd1/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->y(Lrd1/d;)Ltd1/d;

    move-result-object p1

    invoke-virtual {p1}, Ltd1/d;->A()Ltd1/e;

    move-result-object p1

    invoke-virtual {p1}, Ltd1/e;->isReady()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    sget-object v0, Lqr2/a$a;->REAL_TIME:Lqr2/a$a;

    filled-new-array {v0}, [Lqr2/a$a;

    move-result-object v0

    const-string v1, "Real time stream timed out.  Attempting to re-enable."

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lrd1/d$k;->ENABLING:Lrd1/d$k;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    sget-object v0, Lqr2/a$a;->REAL_TIME:Lqr2/a$a;

    filled-new-array {v0}, [Lqr2/a$a;

    move-result-object v0

    const-string v1, "Real time stream timed out.  Attempting to re-enable when strap reconnects."

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lrd1/d$k;->DISABLED:Lrd1/d$k;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    sget-object v0, Lqr2/a$a;->REAL_TIME:Lqr2/a$a;

    filled-new-array {v0}, [Lqr2/a$a;

    move-result-object v0

    const-string v1, "Real time stream timed out.  Trying to disable."

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lrd1/d$k;->DISABLING:Lrd1/d$k;

    :goto_0
    new-instance v0, Lod1/t$e;

    iget-object v1, p0, Lrd1/d$m$a;->a:Lrd1/d;

    invoke-static {v1, p1}, Lrd1/d;->J(Lrd1/d;Lod1/t$i;)Lod1/t$h;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lod1/t$e;-><init>(Lod1/t$h;Ljava/lang/Object;)V

    return-object v0
.end method
