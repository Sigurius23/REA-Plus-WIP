.class final Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/tiltgraph/view/TiltGraphFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.tiltgraph.view.TiltGraphFragment$observePortraitRotationExit$1$1"
    f = "TiltGraphFragment.kt"
    l = {
        0x6e,
        0x70
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/tiltgraph/view/TiltGraphFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/tiltgraph/view/TiltGraphFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->h(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
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

    new-instance p1, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;

    iget-object v0, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;-><init>(Lcom/whoop/tiltgraph/view/TiltGraphFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lfn2/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lfn2/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    new-instance v1, Lcom/whoop/tiltgraph/view/a;

    invoke-direct {v1, p1}, Lcom/whoop/tiltgraph/view/a;-><init>(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)V

    invoke-static {p1}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v6, Lfn2/d;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p1, v1, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lfn2/d;

    iput-object v1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->x:I

    invoke-interface {v1, p0}, Lfn2/d;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    iput-object v2, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->x:I

    invoke-interface {v1, p0}, Lfn2/d;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result p1

    if-nez p1, :cond_6

    :goto_3
    return-object v5

    :cond_6
    iget-object p1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-static {p1}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->G(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Luj2/b;

    move-result-object p1

    new-instance v0, Luj2/a$e;

    sget-object v1, Luj2/c;->TILT:Luj2/c;

    invoke-direct {v0, v1}, Luj2/a$e;-><init>(Luj2/c;)V

    invoke-virtual {p1, v0}, Luj2/b;->j(Luj2/a;)V

    iget-object p1, p0, Lcom/whoop/tiltgraph/view/TiltGraphFragment$a$a;->y:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-static {p1}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->F(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Lak2/b;

    move-result-object p1

    sget-object v0, Lak2/a$a;->a:Lak2/a$a;

    invoke-virtual {p1, v0}, Lak2/b;->a(Lak2/a;)V

    return-object v5
.end method
