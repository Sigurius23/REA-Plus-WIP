.class final Liq0/m$m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m;->P0(Ljava/lang/String;)V
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel$reportMessage$1"
    f = "CommunityChatViewModel.kt"
    l = {
        0x141
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Liq0/m;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Liq0/m;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq0/m;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Liq0/m$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$m;->E:Liq0/m;

    iput-object p2, p0, Liq0/m$m;->F:Ljava/lang/String;

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

    new-instance p1, Liq0/m$m;

    iget-object v0, p0, Liq0/m$m;->E:Liq0/m;

    iget-object v1, p0, Liq0/m$m;->F:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Liq0/m$m;-><init>(Liq0/m;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Liq0/m$m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/m$m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/m$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/m$m;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liq0/m$m;->z:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Liq0/m$m;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v0, p0, Liq0/m$m;->w:Ljava/lang/Object;

    check-cast v0, Liq0/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Liq0/m$m;->E:Liq0/m;

    invoke-virtual {p1}, Liq0/m;->x0()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Liq0/m$m;->E:Liq0/m;

    iget-object v9, p0, Liq0/m$m;->F:Ljava/lang/String;

    invoke-static {v1}, Liq0/m;->I(Liq0/m;)Lcq0/a;

    move-result-object v10

    new-instance v4, Lcom/whoop/community/data/network/ReportMessage;

    invoke-virtual {v1}, Liq0/m;->C0()I

    move-result v5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v4 .. v9}, Lcom/whoop/community/data/network/ReportMessage;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Liq0/m$m;->w:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Liq0/m$m;->x:Ljava/lang/Object;

    iput v2, p0, Liq0/m$m;->y:I

    iput v3, p0, Liq0/m$m;->z:I

    invoke-virtual {v10, v4, p0}, Lcq0/a;->h(Lcom/whoop/community/data/network/ReportMessage;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v1

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0}, Liq0/m;->v0()Landroidx/lifecycle/u0;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    if-nez p1, :cond_3

    invoke-static {v0}, Liq0/m;->M(Liq0/m;)Ltr2/n;

    move-result-object p1

    const-string v0, "Message reporting failed"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
