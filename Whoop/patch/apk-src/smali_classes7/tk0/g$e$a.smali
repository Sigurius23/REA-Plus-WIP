.class final Ltk0/g$e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltk0/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ltk0/g$b;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Ltk0/g$b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$shared$1$1"
    f = "WhoopBleScannerImpl.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lq83/d<",
            "-",
            "Ltk0/g$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltk0/g$e$a;->y:Lkotlin/jvm/internal/g0;

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

    new-instance v0, Ltk0/g$e$a;

    iget-object v1, p0, Ltk0/g$e$a;->y:Lkotlin/jvm/internal/g0;

    invoke-direct {v0, v1, p2}, Ltk0/g$e$a;-><init>(Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object p1, v0, Ltk0/g$e$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ltk0/g$b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltk0/g$b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ltk0/g$e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltk0/g$e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltk0/g$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltk0/g$b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltk0/g$e$a;->f(Ltk0/g$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltk0/g$e$a;->x:Ljava/lang/Object;

    check-cast v0, Ltk0/g$b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ltk0/g$e$a;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Ltk0/g$b$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltk0/g$e$a;->y:Lkotlin/jvm/internal/g0;

    check-cast v0, Ltk0/g$b$a;

    invoke-virtual {v0}, Ltk0/g$b$a;->a()Lcom/whoop/ble/api/scan/ScanFailure;

    move-result-object v0

    iput-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
