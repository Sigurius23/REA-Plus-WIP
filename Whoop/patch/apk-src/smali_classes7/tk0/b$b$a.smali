.class public final Ltk0/b$b$a;
.super Ltd3/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltk0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00052\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "tk0/b$b$a",
        "Ltd3/i;",
        "",
        "Ltk0/f;",
        "reports",
        "Ll83/a0;",
        "d",
        "(Ljava/util/List;)V",
        "",
        "callbackType",
        "Ltd3/m;",
        "result",
        "c",
        "(ILtd3/m;)V",
        "results",
        "a",
        "errorCode",
        "b",
        "(I)V",
        "whoop-ble-transport_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Ltk0/b;

.field final synthetic b:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltk0/b;Ldc3/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltk0/b;",
            "Ldc3/u;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ltk0/b$b$a;->a:Ltk0/b;

    iput-object p2, p0, Ltk0/b$b$a;->b:Ldc3/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltk0/f;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ltk0/b$b$a;->b:Ldc3/u;

    check-cast v0, Ldc3/t;

    iget-object v0, v0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ldc3/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltk0/b$b$a;->a:Ltk0/b;

    invoke-static {v0}, Ltk0/b;->b(Ltk0/b;)Ltr2/n;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v1, "Dropped a batch of "

    const-string v2, " scan reports: consumer is behind"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltd3/m;",
            ">;)V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Ltk0/b$b$a;->a:Ltk0/b;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltd3/m;

    invoke-virtual {v0, v2}, Ltk0/b;->d(Ltd3/m;)Ltk0/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, v1}, Ltk0/b$b$a;->d(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Ltk0/b$b$a;->b:Ldc3/u;

    new-instance v1, Lcom/whoop/ble/api/scan/ScanFailure$Rejected;

    invoke-direct {v1, p1}, Lcom/whoop/ble/api/scan/ScanFailure$Rejected;-><init>(I)V

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, v1}, Ldc3/t;->r(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public c(ILtd3/m;)V
    .locals 0

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltk0/b$b$a;->a:Ltk0/b;

    invoke-virtual {p1, p2}, Ltk0/b;->d(Ltd3/m;)Ltk0/f;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Ltk0/b$b$a;->d(Ljava/util/List;)V

    return-void
.end method
