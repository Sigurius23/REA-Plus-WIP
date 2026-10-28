.class public final Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;
.super Landroidx/fragment/app/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006%\u00b2\u0006\u000c\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;",
        "Landroidx/fragment/app/y;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onStart",
        "",
        "w",
        "Ll83/h;",
        "F",
        "()Ljava/lang/String;",
        "key",
        "Lg02/a;",
        "x",
        "H",
        "()Lg02/a;",
        "viewModel",
        "Ld02/a;",
        "y",
        "G",
        "()Ld02/a;",
        "navRouter",
        "z",
        "a",
        "Le02/g;",
        "viewState",
        "native-store_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final E:I

.field public static final z:Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$a;


# instance fields
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->z:Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Lf02/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lf02/a;-><init>(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->w:Ll83/h;

    new-instance v1, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$d;

    invoke-direct {v1, p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    new-instance v2, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v1, v3}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->x:Ll83/h;

    new-instance v0, Lf02/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lf02/a;-><init>(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$c;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->I(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->K(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->J(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->F()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Lg02/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->H()Lg02/a;

    move-result-object p0

    return-object p0
.end method

.method private final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final G()Ld02/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld02/a;

    return-object v0
.end method

.method private final H()Lg02/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg02/a;

    return-object v0
.end method

.method private static final I(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "key"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final J(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

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

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->H()Lg02/a;

    move-result-object p1

    invoke-virtual {p1}, Lg02/a;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Le02/g;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Le02/g;-><init>(ZZLe02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$b;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment$b;-><init>(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Lq83/d;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v4, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->L(Lp1/t2;)Le02/g;

    move-result-object v1

    move-object p1, v2

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->F()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_3

    if-ne v3, p1, :cond_4

    :cond_3
    new-instance v3, Leg/j;

    const/4 p1, 0x4

    invoke-direct {v3, p0, p1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/16 v7, 0x8

    move-object v5, v4

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lf02/b;->i(Le02/g;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    return-object p2

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final L(Lp1/t2;)Le02/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Le02/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le02/g;

    return-object p0
.end method

.method private static final M(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le02/f;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->H()Lg02/a;

    move-result-object p0

    check-cast p1, Le02/f;

    invoke-virtual {p0, p1}, Lg02/a;->n(Le02/f;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Le02/d;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->G()Ld02/a;

    move-result-object p0

    check-cast p1, Le02/d;

    invoke-virtual {p0, p1}, Ld02/a;->a(Le02/d;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->M(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    sget v0, Lmz1/c;->a:I

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/y;->setStyle(II)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-direct {p0}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->F()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lej1/h;

    const/16 p2, 0xa

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x543f891

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/y;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    const/16 v1, 0x200

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    :cond_0
    return-void
.end method
