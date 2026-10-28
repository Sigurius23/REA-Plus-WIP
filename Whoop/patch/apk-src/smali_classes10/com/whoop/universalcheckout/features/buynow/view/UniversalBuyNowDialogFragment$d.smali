.class final Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
    c = "com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$onCreateView$1$3$1"
    f = "UniversalBuyNowDialogFragment.kt"
    l = {
        0x9d,
        0x53,
        0xa6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:Z

.field H:I

.field final synthetic I:Lwn2/i;

.field final synthetic J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

.field final synthetic K:Landroid/view/View;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwn2/i;Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwn2/i;",
            "Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;",
            "Landroid/view/View;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->I:Lwn2/i;

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->K:Landroid/view/View;

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

    new-instance p1, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->I:Lwn2/i;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->K:Landroid/view/View;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;-><init>(Lwn2/i;Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->H:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/w1;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/w;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/x;

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/x;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, p0

    goto/16 :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/w1;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/w;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/x;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->w:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/x;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->I:Lwn2/i;

    instance-of p1, p1, Lwn2/i$a;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->K:Landroid/view/View;

    invoke-static {p1, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->J(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;)V

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v7

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->I:Lwn2/i;

    sget-object v8, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    sget-object v9, Lbc3/q0;->a:Lkc3/e;

    sget-object v9, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v9}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v10

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v9

    invoke-virtual {v10, v9}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result v9

    if-nez v9, :cond_5

    invoke-virtual {v7}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v11

    sget-object v12, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v11, v12, :cond_4

    invoke-virtual {v7}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v11

    if-ltz v11, :cond_5

    new-instance v4, Lwn2/e$e;

    move-object v7, v1

    check-cast v7, Lwn2/i$a;

    invoke-virtual {v7}, Lwn2/i$a;->a()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct {v4, v7}, Lwn2/e$e;-><init>(Lcom/whoop/navigation/e;)V

    invoke-static {p1, v4, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->I(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Ljava/lang/Object;Lwn2/i;)V

    goto :goto_0

    :cond_4
    new-instance p1, Landroidx/lifecycle/LifecycleDestroyedException;

    invoke-direct {p1}, Landroidx/lifecycle/LifecycleDestroyedException;-><init>()V

    throw p1

    :cond_5
    new-instance v11, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;

    invoke-direct {v11, p1, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;-><init>(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Lwn2/i;)V

    iput-object v6, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->w:Ljava/lang/Object;

    iput-object v6, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->x:Ljava/lang/Object;

    iput-object v6, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->y:Ljava/lang/Object;

    iput-object v6, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->z:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->E:I

    iput v5, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->F:I

    iput-boolean v9, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->G:Z

    iput v4, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->H:I

    move-object v12, p0

    invoke-static/range {v7 .. v12}, Landroidx/lifecycle/o1;->p(Landroidx/lifecycle/x;Landroidx/lifecycle/w;ZLbc3/w1;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto/16 :goto_2

    :cond_6
    :goto_0
    move-object v12, p0

    :cond_7
    iget-object p1, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->I:Lwn2/i;

    instance-of p1, p1, Lwn2/i$e;

    if-eqz p1, :cond_b

    iget-object p1, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v1, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->K:Landroid/view/View;

    invoke-static {p1, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->J(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Landroid/view/View;)V

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->w:Ljava/lang/Object;

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->x:Ljava/lang/Object;

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->y:Ljava/lang/Object;

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->z:Ljava/lang/Object;

    iput v3, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->H:I

    const-wide/16 v3, 0x3e8

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_2

    :cond_8
    :goto_1
    iget-object p1, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v7

    iget-object p1, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->J:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v1, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->I:Lwn2/i;

    sget-object v8, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v3}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v10

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-virtual {v10, v3}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result v9

    if-nez v9, :cond_a

    invoke-virtual {v7}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v3

    sget-object v4, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v3, v4, :cond_9

    invoke-virtual {v7}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_a

    new-instance v0, Lwn2/e$h;

    move-object v2, v1

    check-cast v2, Lwn2/i$e;

    invoke-virtual {v2}, Lwn2/i$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lwn2/e$h;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->I(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Ljava/lang/Object;Lwn2/i;)V

    goto :goto_3

    :cond_9
    new-instance p1, Landroidx/lifecycle/LifecycleDestroyedException;

    invoke-direct {p1}, Landroidx/lifecycle/LifecycleDestroyedException;-><init>()V

    throw p1

    :cond_a
    new-instance v11, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$b;

    invoke-direct {v11, p1, v1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$b;-><init>(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Lwn2/i;)V

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->w:Ljava/lang/Object;

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->x:Ljava/lang/Object;

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->y:Ljava/lang/Object;

    iput-object v6, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->z:Ljava/lang/Object;

    iput v5, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->E:I

    iput v5, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->F:I

    iput-boolean v9, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->G:Z

    iput v2, v12, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->H:I

    invoke-static/range {v7 .. v12}, Landroidx/lifecycle/o1;->p(Landroidx/lifecycle/x;Landroidx/lifecycle/w;ZLbc3/w1;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_2
    return-object v0

    :cond_b
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
