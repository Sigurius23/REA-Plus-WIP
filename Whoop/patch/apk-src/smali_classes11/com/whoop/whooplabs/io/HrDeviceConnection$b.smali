.class final Lcom/whoop/whooplabs/io/HrDeviceConnection$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection;->p()V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.io.HrDeviceConnection$cancelAndRescheduleHrNotBroadcastingJob$1"
    f = "HrDeviceConnection.kt"
    l = {
        0xca,
        0xcb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/whooplabs/io/HrDeviceConnection;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->y:Lcom/whoop/whooplabs/io/HrDeviceConnection;

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

    new-instance v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;

    iget-object v1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->y:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-direct {v0, v1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->w:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->x:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->w:I

    const-wide/16 v5, 0xbb8

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->y:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-static {p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->j(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lec3/p1;

    move-result-object p1

    sget-object v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$a;->NOT_BROADCASTING:Lcom/whoop/whooplabs/io/HrDeviceConnection$a;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;->w:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    return-object v3
.end method
