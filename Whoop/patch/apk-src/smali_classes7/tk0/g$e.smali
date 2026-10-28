.class final Ltk0/g$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltk0/g;-><init>(Ltk0/d;Ltk0/e;Ltr2/n;Lbc3/c0;)V
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
    c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$shared$1"
    f = "WhoopBleScannerImpl.kt"
    l = {
        0x23,
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ltk0/g;


# direct methods
.method public constructor <init>(Ltk0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltk0/g;",
            "Lq83/d<",
            "-",
            "Ltk0/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltk0/g$e;->z:Ltk0/g;

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

    new-instance v0, Ltk0/g$e;

    iget-object v1, p0, Ltk0/g$e;->z:Ltk0/g;

    invoke-direct {v0, v1, p2}, Ltk0/g$e;-><init>(Ltk0/g;Lq83/d;)V

    iput-object p1, v0, Ltk0/g$e;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltk0/g$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltk0/g$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltk0/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltk0/g$e;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ltk0/g$e;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ltk0/g$e;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v2, p0, Ltk0/g$e;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Ltk0/g$e;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Ltk0/g$e;->z:Ltk0/g;

    invoke-static {p1}, Ltk0/g;->h(Ltk0/g;)Lec3/l;

    move-result-object p1

    new-instance v6, Ltk0/g$e$a;

    invoke-direct {v6, v2, v3}, Ltk0/g$e$a;-><init>(Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object v0, p0, Ltk0/g$e;->y:Ljava/lang/Object;

    iput-object v2, p0, Ltk0/g$e;->w:Ljava/lang/Object;

    iput v5, p0, Ltk0/g$e;->x:I

    invoke-static {v0}, Lec3/v;->y(Lec3/m;)V

    new-instance v7, Lec3/e0;

    const/4 v8, 0x2

    invoke-direct {v7, v8, v0, v6}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v7, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v6, Lr83/a;->w:Lr83/a;

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v6, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v7

    :goto_1
    sget-object v6, Lr83/a;->w:Lr83/a;

    if-ne p1, v6, :cond_5

    move-object v7, p1

    :cond_5
    if-ne v7, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p1, p0, Ltk0/g$e;->z:Ltk0/g;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ble/api/scan/ScanFailure;

    invoke-static {p1, v2}, Ltk0/g;->g(Ltk0/g;Lcom/whoop/ble/api/scan/ScanFailure;)J

    move-result-wide v6

    iput-object v0, p0, Ltk0/g$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Ltk0/g$e;->w:Ljava/lang/Object;

    iput v4, p0, Ltk0/g$e;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    :goto_3
    return-object v1
.end method
