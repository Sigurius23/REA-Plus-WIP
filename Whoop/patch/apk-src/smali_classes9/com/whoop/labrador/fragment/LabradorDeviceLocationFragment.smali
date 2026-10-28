.class public final Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\"\u00b2\u0006\u000c\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lit1/b;",
        "w",
        "Ll83/h;",
        "C",
        "()Lit1/b;",
        "viewModel",
        "Lss1/a;",
        "x",
        "B",
        "()Lss1/a;",
        "analytics",
        "Lit1/c;",
        "viewState",
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->D(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lss1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lss1/a;

    return-object v0
.end method

.method private final C()Lit1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lit1/b;

    return-object v0
.end method

.method private static final D(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

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

    if-eqz p1, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Leb/a0;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_2

    new-instance v0, Ldu1/a;

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->B()Lss1/a;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ldu1/a;-><init>(Leb/a0;Lss1/a;)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Ldu1/a;

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->C()Lit1/b;

    move-result-object p1

    invoke-virtual {p1}, Lit1/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object p1, Lit1/c$a;->h:Lit1/c$a$a;

    invoke-virtual {p1}, Lit1/c$a$a;->a()Lit1/c$a;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->E(Lp1/t2;)Lit1/c;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_3

    if-ne v2, p2, :cond_4

    :cond_3
    new-instance v2, Lck1/c;

    const/16 p1, 0xb

    invoke-direct {v2, p0, p1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_5

    if-ne p1, p2, :cond_6

    :cond_5
    new-instance p1, Lcu1/c;

    const/4 p0, 0x0

    invoke-direct {p1, v0, p0}, Lcu1/c;-><init>(Ldu1/a;I)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Ljt1/c;->C(Lit1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/t2;)Lit1/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lit1/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lit1/c;

    return-object p0
.end method

.method private static final F(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Lit1/a$f;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->C()Lit1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lit1/b;->p(Lit1/a$f;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Ldu1/a;Lit1/a$d;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lit1/a$a;->a:Lit1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ldu1/b$a;->a:Ldu1/b$a;

    invoke-virtual {p0, p1}, Ldu1/a;->a(Ldu1/b;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lit1/a$c;

    if-eqz v0, :cond_1

    new-instance v0, Ldu1/b$f;

    check-cast p1, Lit1/a$c;

    invoke-virtual {p1}, Lit1/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ldu1/b$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ldu1/a;->a(Ldu1/b;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic y(Ldu1/a;Lit1/a$d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->G(Ldu1/a;Lit1/a$d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Lit1/a$f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->F(Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;Lit1/a$f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/16 p2, 0x9

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x3eb1de58

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStart()V

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorDeviceLocationFragment;->C()Lit1/b;

    move-result-object v0

    sget-object v1, Lit1/a$b;->a:Lit1/a$b;

    invoke-virtual {v0, v1}, Lit1/b;->p(Lit1/a$f;)Lbc3/k1;

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
