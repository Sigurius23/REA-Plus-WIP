.class final Lcom/whoop/community/CommunityFragment$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityFragment;->p0(Lcom/whoop/domain/model/teams/Team;)V
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
    c = "com.whoop.community.CommunityFragment$initTeamMenu$1"
    f = "CommunityFragment.kt"
    l = {
        0xf9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/domain/model/teams/Team;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lcom/whoop/community/CommunityFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/CommunityFragment;",
            "Lcom/whoop/domain/model/teams/Team;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/CommunityFragment$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    iput-object p2, p0, Lcom/whoop/community/CommunityFragment$d;->E:Lcom/whoop/domain/model/teams/Team;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/CommunityFragment$d;->h(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;I)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lcom/whoop/community/CommunityFragment;->M(Lcom/whoop/community/CommunityFragment;)V

    invoke-static {p0}, Lcom/whoop/community/CommunityFragment;->U(Lcom/whoop/community/CommunityFragment;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    aget-object p2, v0, p2

    invoke-static {p0, p2}, Lcom/whoop/community/CommunityFragment;->R(Lcom/whoop/community/CommunityFragment;Ljava/lang/String;)Lnq0/k;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lcom/whoop/community/CommunityFragment;->Z(Lcom/whoop/community/CommunityFragment;Lnq0/k;Lcom/whoop/domain/model/teams/Team;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const-string p0, "teamSpinnerValues"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
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

    new-instance p1, Lcom/whoop/community/CommunityFragment$d;

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$d;->E:Lcom/whoop/domain/model/teams/Team;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/community/CommunityFragment$d;-><init>(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityFragment$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/CommunityFragment$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/community/CommunityFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityFragment$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/community/CommunityFragment$d;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lcom/whoop/community/CommunityFragment$d;->x:I

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$d;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/community/CommunityFragment;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$d;->E:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getAdminId()I

    move-result p1

    iget-object v3, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    invoke-static {v3}, Lcom/whoop/community/CommunityFragment;->X(Lcom/whoop/community/CommunityFragment;)Lrq0/h1;

    move-result-object v3

    iput-object v1, p0, Lcom/whoop/community/CommunityFragment$d;->w:Ljava/lang/Object;

    iput p1, p0, Lcom/whoop/community/CommunityFragment$d;->x:I

    iput v2, p0, Lcom/whoop/community/CommunityFragment$d;->y:I

    invoke-virtual {v3, p0}, Lrq0/h1;->F0(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    return-object v0

    :cond_2
    move v0, p1

    move-object p1, v3

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x3

    const-string v6, "getString(...)"

    if-ne v0, p1, :cond_3

    new-array p1, v5, [Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    sget v5, Lxp0/d0;->Y0:I

    invoke-virtual {v0, v5}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, p1, v4

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    sget v4, Lxp0/d0;->K1:I

    invoke-virtual {v0, v4}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, p1, v2

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    sget v2, Lxp0/d0;->f2:I

    invoke-virtual {v0, v2}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, p1, v3

    goto :goto_1

    :cond_3
    new-array p1, v5, [Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    sget v5, Lxp0/d0;->Y0:I

    invoke-virtual {v0, v5}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, p1, v4

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    sget v4, Lxp0/d0;->K1:I

    invoke-virtual {v0, v4}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, p1, v2

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    sget v2, Lxp0/d0;->Z0:I

    invoke-virtual {v0, v2}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, p1, v3

    :goto_1
    invoke-static {v1, p1}, Lcom/whoop/community/CommunityFragment;->b0(Lcom/whoop/community/CommunityFragment;[Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    new-instance v0, Lcom/whoop/ui/k;

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lxp0/b0;->t0:I

    sget v4, Lxp0/b0;->u0:I

    sget v5, Lxp0/a0;->b7:I

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    invoke-static {v2}, Lcom/whoop/community/CommunityFragment;->U(Lcom/whoop/community/CommunityFragment;)[Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    if-eqz v6, :cond_5

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    iget-object v7, p0, Lcom/whoop/community/CommunityFragment$d;->E:Lcom/whoop/domain/model/teams/Team;

    move-object v9, v7

    new-instance v7, Lcom/whoop/community/b;

    invoke-direct {v7, v2, v9}, Lcom/whoop/community/b;-><init>(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;)V

    const v2, 0x1090008

    invoke-direct/range {v0 .. v7}, Lcom/whoop/ui/k;-><init>(Landroid/content/Context;IIII[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v0}, Lcom/whoop/community/CommunityFragment;->a0(Lcom/whoop/community/CommunityFragment;Landroid/widget/ArrayAdapter;)V

    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityFragment;->N(Lcom/whoop/community/CommunityFragment;)Leq0/p0;

    move-result-object p1

    iget-object p1, p1, Leq0/p0;->g:Landroid/widget/Spinner;

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$d;->z:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->T(Lcom/whoop/community/CommunityFragment;)Landroid/widget/ArrayAdapter;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    const-string p1, "teamSpinnerAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_5
    const-string p1, "teamSpinnerValues"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8
.end method
