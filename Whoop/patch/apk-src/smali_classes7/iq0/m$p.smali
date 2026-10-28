.class final Liq0/m$p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m;->T0(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel$sendMessageStatus$1"
    f = "CommunityChatViewModel.kt"
    l = {
        0x14d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Liq0/m;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lio/getstream/chat/android/models/Message;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Liq0/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Liq0/m;",
            "Lq83/d<",
            "-",
            "Liq0/m$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$p;->y:Lio/getstream/chat/android/models/Message;

    iput-object p2, p0, Liq0/m$p;->z:Ljava/lang/String;

    iput-object p3, p0, Liq0/m$p;->E:Liq0/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Liq0/m$p;

    iget-object v0, p0, Liq0/m$p;->y:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Liq0/m$p;->z:Ljava/lang/String;

    iget-object v2, p0, Liq0/m$p;->E:Liq0/m;

    invoke-direct {p1, v0, v1, v2, p2}, Liq0/m$p;-><init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Liq0/m;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Liq0/m$p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/m$p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/m$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/m$p;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liq0/m$p;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Liq0/m$p;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/data/network/MessageStatus;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/community/data/network/MessageStatus;

    iget-object v1, p0, Liq0/m$p;->y:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Liq0/m$p;->z:Ljava/lang/String;

    iget-object v4, p0, Liq0/m$p;->y:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p1, v1, v3, v4}, Lcom/whoop/community/data/network/MessageStatus;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Liq0/m$p;->E:Liq0/m;

    invoke-static {v1}, Liq0/m;->I(Liq0/m;)Lcq0/a;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Liq0/m$p;->w:Ljava/lang/Object;

    iput v2, p0, Liq0/m$p;->x:I

    invoke-virtual {v1, p1, p0}, Lcq0/a;->i(Lcom/whoop/community/data/network/MessageStatus;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Liq0/m$p;->E:Liq0/m;

    invoke-static {p1}, Liq0/m;->M(Liq0/m;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Send message status failed"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
