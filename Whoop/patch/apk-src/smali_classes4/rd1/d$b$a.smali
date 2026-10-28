.class Lrd1/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/d$b;-><init>(Lrd1/d;)V
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

    iput-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lod1/t$e;
    .locals 3

    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Lqr2/a$a;

    const-string v2, "DisabledState EnterAction"

    invoke-interface {p1, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->x(Lrd1/d;)Llh3/b;

    move-result-object p1

    sget-object v1, Lrd1/b;->DISABLED:Lrd1/b;

    invoke-virtual {p1, v1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1, v0}, Lrd1/d;->E(Lrd1/d;Z)V

    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->z(Lrd1/d;)Lxg3/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->z(Lrd1/d;)Lxg3/t;

    move-result-object p1

    invoke-interface {p1}, Lxg3/t;->b()V

    :cond_0
    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->t(Lrd1/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lrd1/d$b$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->F(Lrd1/d;)V

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
