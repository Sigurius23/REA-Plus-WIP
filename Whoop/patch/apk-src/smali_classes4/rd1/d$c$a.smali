.class Lrd1/d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/d$c;-><init>(Lrd1/d;)V
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

    iput-object p1, p0, Lrd1/d$c$a;->a:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lod1/t$e;
    .locals 2

    iget-object p1, p0, Lrd1/d$c$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "DisablingState EnterAction"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrd1/d$c$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->x(Lrd1/d;)Llh3/b;

    move-result-object p1

    sget-object v0, Lrd1/b;->DISABLED:Lrd1/b;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lrd1/d$c$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->v(Lrd1/d;)Lrd1/e;

    move-result-object p1

    invoke-interface {p1}, Lrd1/e;->e()V

    iget-object p1, p0, Lrd1/d$c$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->w(Lrd1/d;)Lze1/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Llh3/j;->onNext(Ljava/lang/Object;)V

    return-object v0
.end method
