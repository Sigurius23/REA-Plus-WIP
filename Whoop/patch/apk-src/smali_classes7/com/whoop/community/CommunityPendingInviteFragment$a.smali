.class final Lcom/whoop/community/CommunityPendingInviteFragment$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityPendingInviteFragment;->U()V
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
    c = "com.whoop.community.CommunityPendingInviteFragment$loadPendingInvites$1"
    f = "CommunityPendingInviteFragment.kt"
    l = {
        0xb5
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/community/CommunityPendingInviteFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/community/CommunityPendingInviteFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/CommunityPendingInviteFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/CommunityPendingInviteFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/community/CommunityPendingInviteFragment;Lcom/whoop/data/remote/commons/Resource;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment$a;->h(Lcom/whoop/community/CommunityPendingInviteFragment;Lcom/whoop/data/remote/commons/Resource;)V

    return-void
.end method

.method private static final h(Lcom/whoop/community/CommunityPendingInviteFragment;Lcom/whoop/data/remote/commons/Resource;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->L(Lcom/whoop/community/CommunityPendingInviteFragment;Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/community/CommunityPendingInviteFragment$a;

    iget-object v0, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/community/CommunityPendingInviteFragment$a;-><init>(Lcom/whoop/community/CommunityPendingInviteFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityPendingInviteFragment$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/CommunityPendingInviteFragment$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/community/CommunityPendingInviteFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityPendingInviteFragment$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->M(Lcom/whoop/community/CommunityPendingInviteFragment;)Lnq0/i;

    move-result-object p1

    iput v2, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->w:I

    invoke-virtual {p1, p0}, Lnq0/i;->w0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Landroidx/lifecycle/p0;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/community/CommunityPendingInviteFragment$a;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    new-instance v2, Lcom/whoop/community/h;

    invoke-direct {v2, v1}, Lcom/whoop/community/h;-><init>(Lcom/whoop/community/CommunityPendingInviteFragment;)V

    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
