.class final Ltk0/g$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltk0/g;->l()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Ltk0/g$b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$scanSession$1"
    f = "WhoopBleScannerImpl.kt"
    l = {
        0x38,
        0x45
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ltk0/g;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltk0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltk0/g;",
            "Lq83/d<",
            "-",
            "Ltk0/g$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltk0/g$d;->E:Ltk0/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltk0/g$d;

    iget-object v1, p0, Ltk0/g$d;->E:Ltk0/g;

    invoke-direct {v0, v1, p2}, Ltk0/g$d;-><init>(Ltk0/g;Lq83/d;)V

    iput-object p1, v0, Ltk0/g$d;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltk0/g$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltk0/g$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltk0/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltk0/g$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const-string v0, "Starting shared scan on "

    iget-object v1, p0, Ltk0/g$d;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ltk0/g$d;->y:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Ltk0/g$d;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ble/api/scan/ScanFailure;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Ltk0/g$d;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ltk0/g$d;->E:Ltk0/g;

    invoke-static {p1}, Ltk0/g;->e(Ltk0/g;)Ltk0/e;

    move-result-object p1

    invoke-interface {p1}, Ltk0/e;->a()Lcom/whoop/ble/api/scan/ScanFailure;

    move-result-object p1

    if-nez p1, :cond_4

    iget-object p1, p0, Ltk0/g$d;->E:Ltk0/g;

    invoke-static {p1}, Ltk0/g;->c(Ltk0/g;)Ltr2/n;

    move-result-object v3

    invoke-static {}, Ltk0/g;->b()Ltk0/g$a;

    move-result-object v8

    invoke-virtual {v8}, Ltk0/g$a;->a()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " service ids"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v8, v7, [Lqr2/a$a;

    invoke-interface {v3, v0, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Ltk0/g;->d(Ltk0/g;)Ltk0/d;

    move-result-object v0

    invoke-static {}, Ltk0/g;->b()Ltk0/g$a;

    move-result-object v3

    invoke-virtual {v3}, Ltk0/g$a;->a()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v0, v3}, Ltk0/d;->a(Ljava/util/Set;)Lec3/l;

    move-result-object v0

    new-instance v3, Ltk0/g$d$a;

    invoke-direct {v3, v1, p1}, Ltk0/g$d$a;-><init>(Lec3/m;Ltk0/g;)V

    iput-object v1, p0, Ltk0/g$d;->z:Ljava/lang/Object;

    iput-object v6, p0, Ltk0/g$d;->w:Ljava/lang/Object;

    iput v7, p0, Ltk0/g$d;->x:I

    iput v5, p0, Ltk0/g$d;->y:I

    invoke-interface {v0, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    new-instance p1, Lcom/whoop/ble/api/scan/ScanFailure$Unexpected;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Platform scan ended without a failure"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/whoop/ble/api/scan/ScanFailure$Unexpected;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Ltk0/g$d;->E:Ltk0/g;

    invoke-static {v0, p1}, Ltk0/g;->j(Ltk0/g;Ljava/lang/Throwable;)Lcom/whoop/ble/api/scan/ScanFailure;

    move-result-object p1

    :cond_4
    :goto_2
    iget-object v0, p0, Ltk0/g$d;->E:Ltk0/g;

    invoke-static {v0}, Ltk0/g;->c(Ltk0/g;)Ltr2/n;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Shared scan failed: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v5, v7, [Lqr2/a$a;

    invoke-interface {v0, v3, v5}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Ltk0/g$b$a;

    invoke-direct {v0, p1}, Ltk0/g$b$a;-><init>(Lcom/whoop/ble/api/scan/ScanFailure;)V

    iput-object v6, p0, Ltk0/g$d;->z:Ljava/lang/Object;

    iput-object v6, p0, Ltk0/g$d;->w:Ljava/lang/Object;

    iput v4, p0, Ltk0/g$d;->y:I

    invoke-interface {v1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_5
    throw p1
.end method
