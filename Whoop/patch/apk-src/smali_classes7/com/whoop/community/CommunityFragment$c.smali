.class final Lcom/whoop/community/CommunityFragment$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityFragment;->g0()V
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
    c = "com.whoop.community.CommunityFragment$doLeaveTeam$1"
    f = "CommunityFragment.kt"
    l = {
        0x143
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/community/CommunityFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/community/CommunityFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/CommunityFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/CommunityFragment$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lcom/whoop/community/CommunityFragment$c;

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/community/CommunityFragment$c;-><init>(Lcom/whoop/community/CommunityFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityFragment$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/CommunityFragment$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/community/CommunityFragment$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityFragment$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/community/CommunityFragment$c;->w:I

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

    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityFragment;->X(Lcom/whoop/community/CommunityFragment;)Lrq0/h1;

    move-result-object p1

    iput v2, p0, Lcom/whoop/community/CommunityFragment$c;->w:I

    invoke-virtual {p1, p0}, Lrq0/h1;->l0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lxp0/d0;->l1:I

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-static {v2}, Lcom/whoop/community/CommunityFragment;->X(Lcom/whoop/community/CommunityFragment;)Lrq0/h1;

    move-result-object v2

    invoke-virtual {v2}, Lrq0/h1;->c0()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_3
    const-string v2, ""

    :cond_4
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lin2/i;->d(Landroid/content/Context;Ljava/lang/CharSequence;)V

    :cond_5
    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-static {p1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$c;->x:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    if-eqz p1, :cond_7

    sget v0, Lxp0/d0;->m1:I

    invoke-static {p1, v0}, Lin2/i;->c(Landroid/content/Context;I)V

    :cond_7
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
