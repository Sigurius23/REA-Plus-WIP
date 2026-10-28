.class Lrd1/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd1/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field private a:Ljk0/d;

.field private b:Ln73/b;

.field private c:Z

.field private d:Lq92/d;

.field final synthetic e:Lrd1/d;


# direct methods
.method public constructor <init>(Lrd1/d;Ljk0/d;)V
    .locals 0

    iput-object p1, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lrd1/d$f$a;

    invoke-direct {p1, p0}, Lrd1/d$f$a;-><init>(Lrd1/d$f;)V

    iput-object p1, p0, Lrd1/d$f;->d:Lq92/d;

    iput-object p2, p0, Lrd1/d$f;->a:Ljk0/d;

    return-void
.end method

.method public static bridge synthetic k(Lrd1/d$f;)Z
    .locals 0

    iget-boolean p0, p0, Lrd1/d$f;->c:Z

    return p0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Removing whoop strap command callback"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrd1/d$f;->a:Ljk0/d;

    iget-object v1, p0, Lrd1/d$f;->d:Lq92/d;

    invoke-interface {v0, v1}, Ljk0/d;->I0(Llk0/a;)V

    iget-object v0, p0, Lrd1/d$f;->b:Ln73/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln73/b;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, Lrd1/d$f;->b:Ln73/b;

    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Adding whoop strap command callback"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrd1/d$f;->a:Ljk0/d;

    iget-object v1, p0, Lrd1/d$f;->d:Lq92/d;

    invoke-interface {v0, v1}, Ljk0/d;->A0(Llk0/a;)V

    iget-object v0, p0, Lrd1/d$f;->a:Ljk0/d;

    const-class v1, Ldk0/k;

    invoke-interface {v0, v1}, Ljk0/d;->w(Ljava/lang/Class;)Ll73/c;

    move-result-object v0

    iget-object v1, p0, Lrd1/d$f;->e:Lrd1/d;

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/16 v3, 0x18

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lt73/b;

    sget-object v3, Lr73/a;->d:Ljc/a;

    invoke-direct {v1, v2, v3}, Lt73/b;-><init>(Lp73/b;Lp73/b;)V

    invoke-virtual {v0, v1}, Ll73/c;->c(Ll73/d;)V

    iput-object v1, p0, Lrd1/d$f;->b:Ln73/b;

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Tried to call onPrimingFinished() on a BLE strap"

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Tried to call startPrime() on a BLE strap"

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "NordicBleRealTimeStreamStrategy disableRealTimeStream"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-boolean v1, p0, Lrd1/d$f;->c:Z

    iget-object v0, p0, Lrd1/d$f;->d:Lq92/d;

    iget-object v2, p0, Lrd1/d$f;->a:Ljk0/d;

    const-wide/16 v3, 0x0

    invoke-interface {v2, v1, v3, v4}, Ljk0/d;->O0(ZJ)Lnk0/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq92/d;->w(Lnk0/a$a;)V

    return-void
.end method

.method public f()V
    .locals 5

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "NordicBleRealTimeStreamStrategy enableRealTimeStream"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrd1/d$f;->c:Z

    iget-object v1, p0, Lrd1/d$f;->d:Lq92/d;

    iget-object v2, p0, Lrd1/d$f;->a:Ljk0/d;

    const-wide/16 v3, 0x0

    invoke-interface {v2, v0, v3, v4}, Ljk0/d;->O0(ZJ)Lnk0/a$a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lq92/d;->w(Lnk0/a$a;)V

    return-void
.end method

.method public g(Z)V
    .locals 0

    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ldk0/k;

    iget-object v0, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-virtual {p1}, Ldk0/k;->R()Lsj0/a;

    move-result-object p1

    invoke-static {v0, p1}, Lrd1/d;->A(Lrd1/d;Lsj0/a;)V

    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p0, Lrd1/d$f;->e:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Tried to call onPrimingDatReceived() on a BLE strap"

    invoke-interface {p1, v1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
