.class public final Lcom/whoop/labrador/LabradorResultsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0016\u001a\u0004\u0008&\u0010\'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010*\u00a8\u0006.\u00b2\u0006\u000c\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/labrador/LabradorResultsFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "onAttach",
        "(Landroid/content/Context;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Lzt1/e;",
        "w",
        "Ll83/h;",
        "G",
        "()Lzt1/e;",
        "viewModel",
        "Lj02/o0;",
        "x",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lss1/a;",
        "y",
        "E",
        "()Lss1/a;",
        "analytics",
        "Lyt1/b;",
        "z",
        "F",
        "()Lyt1/b;",
        "labradorResultsNavigator",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "Lzt1/c;",
        "state",
        "labrador_release"
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
.field private final E:Ltr2/n;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/labrador/LabradorResultsFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/labrador/LabradorResultsFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/labrador/LabradorResultsFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/labrador/LabradorResultsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->w:Ll83/h;

    new-instance v0, Lrs1/b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lrs1/b;-><init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V

    sget-object v2, Ll83/i;->w:Ll83/i;

    new-instance v4, Lcom/whoop/labrador/LabradorResultsFragment$a;

    invoke-direct {v4, p0, v3, v0}, Lcom/whoop/labrador/LabradorResultsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/labrador/LabradorResultsFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/labrador/LabradorResultsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v2, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->y:Ll83/h;

    new-instance v0, Lrs1/b;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lrs1/b;-><init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->z:Ll83/h;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "LabradorResultsFragment"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->E:Ltr2/n;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/labrador/LabradorResultsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->L(Lcom/whoop/labrador/LabradorResultsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/labrador/LabradorResultsFragment;Lyt1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/labrador/LabradorResultsFragment;->N(Lcom/whoop/labrador/LabradorResultsFragment;Lyt1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/labrador/LabradorResultsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/labrador/LabradorResultsFragment;->J(Lcom/whoop/labrador/LabradorResultsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/labrador/LabradorResultsFragment;)Lyt1/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->H(Lcom/whoop/labrador/LabradorResultsFragment;)Lyt1/b;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lss1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lss1/a;

    return-object v0
.end method

.method private final F()Lyt1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyt1/b;

    return-object v0
.end method

.method private final G()Lzt1/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzt1/e;

    return-object v0
.end method

.method private static final H(Lcom/whoop/labrador/LabradorResultsFragment;)Lyt1/b;
    .locals 2

    new-instance v0, Lyt1/b;

    invoke-direct {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->getNavigator()Lj02/o0;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->E()Lss1/a;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lyt1/b;-><init>(Lj02/o0;Lss1/a;)V

    return-object v0
.end method

.method private static final I(Lcom/whoop/labrador/LabradorResultsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J(Lcom/whoop/labrador/LabradorResultsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

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

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->G()Lzt1/e;

    move-result-object p1

    invoke-virtual {p1}, Lzt1/e;->getViewState()Lec3/l;

    move-result-object v4

    sget-object v5, Lzt1/c$b;->a:Lzt1/c$b;

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Lb2/e;->E:Lb2/m;

    invoke-static {v0, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v1, v7, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v7, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v7, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v7, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v1, v7, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/labrador/LabradorResultsFragment;->K(Lp1/t2;)Lzt1/c;

    move-result-object v4

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_4

    if-ne p2, v0, :cond_5

    :cond_4
    new-instance p2, Lrs1/b;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lrs1/b;-><init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, p2

    check-cast v5, Lc93/a;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_6

    if-ne p2, v0, :cond_7

    :cond_6
    new-instance p2, Lrs1/c;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lrs1/c;-><init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_8

    if-ne p2, v0, :cond_9

    :cond_8
    new-instance p2, Lrs1/c;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lrs1/c;-><init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p2, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v7

    move-object v7, p2

    invoke-static/range {v4 .. v10}, Lau1/q;->F(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/t2;)Lzt1/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lzt1/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzt1/c;

    return-object p0
.end method

.method private static final L(Lcom/whoop/labrador/LabradorResultsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/labrador/LabradorResultsFragment;Lzt1/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->G()Lzt1/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Lzt1/e;->l(Lzt1/d;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/labrador/LabradorResultsFragment;Lyt1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->F()Lyt1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyt1/b;->a(Lyt1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/LabradorResultsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/labrador/LabradorResultsFragment;Lzt1/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/labrador/LabradorResultsFragment;->M(Lcom/whoop/labrador/LabradorResultsFragment;Lzt1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/labrador/LabradorResultsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/LabradorResultsFragment;->I(Lcom/whoop/labrador/LabradorResultsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onAttach(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/whoop/labrador/LabradorResultsFragment;->E:Ltr2/n;

    invoke-static {p0, p1}, Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lr12/a;

    const/16 p2, 0xa

    invoke-direct {p1, p0, p2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x1700e65c

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
