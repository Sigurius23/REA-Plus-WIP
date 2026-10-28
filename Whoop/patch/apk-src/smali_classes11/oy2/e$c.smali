.class final Loy2/e$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->g0(Ljava/lang/String;)Lec3/l;
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
        "Loy2/l;",
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$btHrClicked$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x219,
        0x21c,
        0x21f,
        0x222
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:Z

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Loy2/e;


# direct methods
.method public constructor <init>(Loy2/e;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loy2/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$c;->z:Loy2/e;

    iput-object p2, p0, Loy2/e$c;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Loy2/e$c;

    iget-object v1, p0, Loy2/e$c;->z:Loy2/e;

    iget-object v2, p0, Loy2/e$c;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Loy2/e$c;-><init>(Loy2/e;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Loy2/e$c;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Loy2/e$c;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loy2/e$c;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loy2/e$c;->z:Loy2/e;

    invoke-static {p1}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object p1

    const-string v2, "Connecting to btHr device"

    invoke-virtual {p1, v2}, Loy2/f;->A(Ljava/lang/String;)V

    new-instance p1, Loy2/l$d;

    iget-object v2, p0, Loy2/e$c;->E:Ljava/lang/String;

    invoke-direct {p1, v2}, Loy2/l$d;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Loy2/e$c;->y:Ljava/lang/Object;

    iput v6, p0, Loy2/e$c;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget-object p1, p0, Loy2/e$c;->z:Loy2/e;

    invoke-static {p1}, Loy2/e;->I(Loy2/e;)Lmz2/d;

    move-result-object p1

    invoke-virtual {p1}, Lmz2/d;->p()V

    iget-object p1, p0, Loy2/e$c;->z:Loy2/e;

    invoke-static {p1}, Loy2/e;->J(Loy2/e;)Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object p1

    const-string v2, "service"

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->m()V

    iget-object p1, p0, Loy2/e$c;->z:Loy2/e;

    invoke-static {p1}, Loy2/e;->J(Loy2/e;)Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object v2, p0, Loy2/e$c;->E:Ljava/lang/String;

    iput-object v0, p0, Loy2/e$c;->y:Ljava/lang/Object;

    iput v5, p0, Loy2/e$c;->x:I

    invoke-virtual {p1, v2, p0}, Lcom/whoop/whooplabs/WhoopLabsService;->t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object v2, p0, Loy2/e$c;->z:Loy2/e;

    invoke-static {v2}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v2

    const-string v3, "BtHr device connected successfully"

    invoke-virtual {v2, v3}, Loy2/f;->A(Ljava/lang/String;)V

    new-instance v2, Loy2/l$f;

    iget-object v3, p0, Loy2/e$c;->E:Ljava/lang/String;

    invoke-direct {v2, v3}, Loy2/l$f;-><init>(Ljava/lang/String;)V

    iput-object v7, p0, Loy2/e$c;->y:Ljava/lang/Object;

    iput-boolean p1, p0, Loy2/e$c;->w:Z

    iput v4, p0, Loy2/e$c;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_7
    iget-object v2, p0, Loy2/e$c;->z:Loy2/e;

    invoke-static {v2}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v2

    const-string v4, "Error connecting to btHr device"

    invoke-virtual {v2, v4}, Loy2/f;->y(Ljava/lang/String;)V

    new-instance v2, Loy2/l$j;

    iget-object v4, p0, Loy2/e$c;->E:Ljava/lang/String;

    invoke-direct {v2, v4}, Loy2/l$j;-><init>(Ljava/lang/String;)V

    iput-object v7, p0, Loy2/e$c;->y:Ljava/lang/Object;

    iput-boolean p1, p0, Loy2/e$c;->w:Z

    iput v3, p0, Loy2/e$c;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7
.end method
