.class public final Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#\u00b2\u0006\u000c\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lhn1/d;",
        "event",
        "Ll83/a0;",
        "D",
        "(Lhn1/d;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Ljn1/c;",
        "w",
        "Ll83/h;",
        "F",
        "()Ljn1/c;",
        "viewModel",
        "Lbn1/a;",
        "x",
        "E",
        "()Lbn1/a;",
        "analyticsHelper",
        "Ljn1/d;",
        "viewState",
        "home-customization_release"
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lg1/z3;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->I(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lg1/z3;)Z

    move-result p0

    return p0
.end method

.method public static synthetic B(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Ljn1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->K(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Ljn1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lhn1/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->L(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lhn1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final D(Lhn1/d;)V
    .locals 1

    sget-object v0, Lhn1/d$a;->a:Lhn1/d$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_0
    return-void
.end method

.method private final E()Lbn1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn1/a;

    return-object v0
.end method

.method private final F()Ljn1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljn1/c;

    return-object v0
.end method

.method private static final G(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 24

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {v0}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->F()Ljn1/c;

    move-result-object v1

    invoke-virtual {v1}, Ljn1/c;->getViewState()Lec3/l;

    move-result-object v5

    sget-object v6, Ljn1/d$b;->a:Ljn1/d$b;

    const/16 v9, 0x30

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    sget-object v5, Lg1/z3;->x:Lg1/z3;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lmn1/f;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2}, Lmn1/f;-><init>(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0xc06

    const/4 v11, 0x2

    const/4 v6, 0x0

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v9, v20

    invoke-static/range {v5 .. v11}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v2

    move-object v8, v9

    const/4 v3, 0x3

    invoke-static {v4, v4, v8, v3}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v4

    new-instance v6, Lv41/g;

    const/16 v17, 0x7f

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v18}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lv41/f$a;

    invoke-direct {v7, v2}, Lv41/f$a;-><init>(Lg1/y3;)V

    new-instance v2, La80/f;

    const/16 v5, 0x1c

    invoke-direct {v2, v4, v0, v1, v5}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x7db663b7    # -1.4811999E-37f

    invoke-static {v0, v8, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    sget-object v0, Lmn1/a;->a:Lmn1/a;

    invoke-virtual {v0}, Lmn1/a;->b()Lc93/m;

    move-result-object v19

    sget v0, Lv41/g;->h:I

    shl-int/2addr v0, v3

    const/high16 v1, 0xc00000

    or-int/2addr v0, v1

    sget v1, Lv41/f$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int v21, v0, v1

    const/16 v22, 0x6000

    const/16 v23, 0x3f79

    const/4 v5, 0x0

    move-object/from16 v20, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v23}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_3
    move-object/from16 v20, v8

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lp1/t2;)Ljn1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljn1/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljn1/d;

    return-object p0
.end method

.method private static final I(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lg1/z3;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg1/z3;->w:Lg1/z3;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->E()Lbn1/a;

    move-result-object p1

    invoke-virtual {p1}, Lbn1/a;->c()V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final J(Ln0/u;Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lp1/t2;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$BottomSheet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    and-int/2addr p5, v1

    move-object v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {p2}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->H(Lp1/t2;)Ljn1/d;

    move-result-object v0

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_1

    if-ne p3, p4, :cond_2

    :cond_1
    new-instance p3, Lmn1/f;

    const/4 p2, 0x1

    invoke-direct {p3, p1, p2}, Lmn1/f;-><init>(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;I)V

    invoke-virtual {v4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_3

    if-ne p3, p4, :cond_4

    :cond_3
    new-instance p3, Lmn1/f;

    const/4 p2, 0x2

    invoke-direct {p3, p1, p2}, Lmn1/f;-><init>(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;I)V

    invoke-virtual {v4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lmn1/h;->n(Ljn1/d;Ln0/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Ljn1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->F()Ljn1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljn1/c;->n(Ljn1/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lhn1/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->D(Lhn1/d;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Ln0/u;Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lp1/t2;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->J(Ln0/u;Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lp1/t2;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->G(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmn1/e;

    invoke-direct {p1, p0}, Lmn1/e;-><init>(Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x5ffdc2e5

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "showOnboarding"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->F()Ljn1/c;

    move-result-object p2

    new-instance v0, Ljn1/b$b;

    invoke-direct {v0, p1}, Ljn1/b$b;-><init>(Z)V

    invoke-virtual {p2, v0}, Ljn1/c;->n(Ljn1/b;)V

    return-void
.end method
