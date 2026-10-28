.class final Liq0/m$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m;->y0(Z)V
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel$getStreamChatToken$1"
    f = "CommunityChatViewModel.kt"
    l = {
        0x12d,
        0x131
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Liq0/m;

.field final synthetic F:Z

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Liq0/m;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq0/m;",
            "Z",
            "Lq83/d<",
            "-",
            "Liq0/m$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$g;->E:Liq0/m;

    iput-boolean p2, p0, Liq0/m$g;->F:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Liq0/m$g;

    iget-object v0, p0, Liq0/m$g;->E:Liq0/m;

    iget-boolean v1, p0, Liq0/m$g;->F:Z

    invoke-direct {p1, v0, v1, p2}, Liq0/m$g;-><init>(Liq0/m;ZLq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Liq0/m$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/m$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/m$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liq0/m$g;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Liq0/m$g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Liq0/m$g;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

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

    iget-object p1, p0, Liq0/m$g;->E:Liq0/m;

    invoke-static {p1}, Liq0/m;->O(Liq0/m;)Lcq0/g;

    move-result-object p1

    iput v3, p0, Liq0/m$g;->z:I

    invoke-virtual {p1, p0}, Lcq0/g;->v(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbq0/a;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lbq0/a;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v1, p0, Liq0/m$g;->E:Liq0/m;

    iget-boolean v4, p0, Liq0/m$g;->F:Z

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_4

    const/4 v5, 0x0

    iput-object v5, p0, Liq0/m$g;->w:Ljava/lang/Object;

    iput-object v5, p0, Liq0/m$g;->x:Ljava/lang/Object;

    iput v3, p0, Liq0/m$g;->y:I

    iput v2, p0, Liq0/m$g;->z:I

    invoke-static {v1, p1, v4, p0}, Liq0/m;->G(Liq0/m;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_4
    invoke-virtual {v1}, Liq0/m;->z0()Landroidx/lifecycle/u0;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, p1, v0}, Liq0/m;->W(Liq0/m;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    invoke-static {v1}, Liq0/m;->M(Liq0/m;)Ltr2/n;

    move-result-object p1

    const-string v0, "Get stream chat token api returned empty string"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_5
    iget-object p1, p0, Liq0/m$g;->E:Liq0/m;

    invoke-virtual {p1}, Liq0/m;->z0()Landroidx/lifecycle/u0;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1}, Liq0/m;->W(Liq0/m;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    iget-object p1, p0, Liq0/m$g;->E:Liq0/m;

    invoke-static {p1}, Liq0/m;->M(Liq0/m;)Ltr2/n;

    move-result-object p1

    const-string v0, "Get stream chat token api call failed"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
