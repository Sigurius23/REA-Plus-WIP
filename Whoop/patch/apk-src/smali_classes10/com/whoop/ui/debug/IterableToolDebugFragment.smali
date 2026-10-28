.class public final Lcom/whoop/ui/debug/IterableToolDebugFragment;
.super Lcom/whoop/settings/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/ui/debug/IterableToolDebugFragment;",
        "Lcom/whoop/settings/i;",
        "<init>",
        "()V",
        "",
        "action",
        "",
        "delay",
        "Ll83/a0;",
        "N",
        "(Ljava/lang/String;Z)V",
        "M",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "x",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Ln92/b;",
        "y",
        "Ll83/h;",
        "L",
        "()Ln92/b;",
        "handler",
        "Lbc3/c0;",
        "z",
        "K",
        "()Lbc3/c0;",
        "applicationScope",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final x:Ljava/lang/String;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/settings/i;-><init>()V

    const-string v0, "DebugIterableToolFragment"

    iput-object v0, p0, Lcom/whoop/ui/debug/IterableToolDebugFragment;->x:Ljava/lang/String;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/ui/debug/IterableToolDebugFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/IterableToolDebugFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/IterableToolDebugFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/IterableToolDebugFragment$c;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/IterableToolDebugFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/debug/IterableToolDebugFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic G(Lcom/whoop/ui/debug/IterableToolDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->O(Lcom/whoop/ui/debug/IterableToolDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/ui/debug/IterableToolDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->P(Lcom/whoop/ui/debug/IterableToolDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/ui/debug/IterableToolDebugFragment;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->Q(Lcom/whoop/ui/debug/IterableToolDebugFragment;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/ui/debug/IterableToolDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->R(Lcom/whoop/ui/debug/IterableToolDebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final K()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/IterableToolDebugFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    return-object v0
.end method

.method private final L()Ln92/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/IterableToolDebugFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln92/b;

    return-object v0
.end method

.method private final M()V
    .locals 1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0}, Leb/a0;->z()Z

    return-void
.end method

.method private final N(Ljava/lang/String;Z)V
    .locals 8

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->K()Lbc3/c0;

    move-result-object p2

    new-instance v0, Lcom/whoop/ui/debug/IterableToolDebugFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/whoop/ui/debug/IterableToolDebugFragment$a;-><init>(Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->L()Ln92/b;

    move-result-object v2

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Ln92/b;->u(Ln92/b;Ljava/lang/String;ZLj02/o0;ILjava/lang/Object;)Ln92/a;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final O(Lcom/whoop/ui/debug/IterableToolDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lmm2/b;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lmm2/b;-><init>(Lcom/whoop/ui/debug/IterableToolDebugFragment;I)V

    const p0, -0x52df2e48

    invoke-static {p0, v6, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6000

    const/16 v8, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v8}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/ui/debug/IterableToolDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lmm2/b;

    const/4 p2, 0x2

    invoke-direct {v0, p0, p2}, Lmm2/b;-><init>(Lcom/whoop/ui/debug/IterableToolDebugFragment;I)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/m;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, Llive/hms/video/connection/degredation/a;

    const/16 p2, 0x9

    invoke-direct {v3, p0, p2}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lc93/a;

    invoke-static {v0, v3, p1, v2}, Lor1/a;->e(Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/ui/debug/IterableToolDebugFragment;Ljava/lang/String;Z)Ll83/a0;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->N(Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lcom/whoop/ui/debug/IterableToolDebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/debug/IterableToolDebugFragment;->M()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/IterableToolDebugFragment;->x:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "requireContext(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    const/4 v0, 0x6

    invoke-direct {p1, p2, p3, v0}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p2, Lb3/h2;->x:Lb3/h2;

    invoke-virtual {p1, p2}, Lb3/a;->setViewCompositionStrategy(Lb3/h3;)V

    new-instance p2, Lmm2/b;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lmm2/b;-><init>(Lcom/whoop/ui/debug/IterableToolDebugFragment;I)V

    new-instance p3, Lx1/b;

    const/4 v0, 0x1

    const v1, -0x68e0e283

    invoke-direct {p3, p2, v0, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p1, p3}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    return-object p1
.end method
