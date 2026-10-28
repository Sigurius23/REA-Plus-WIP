.class public final Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Lnt1/g;",
        "w",
        "Ll83/h;",
        "C",
        "()Lnt1/g;",
        "viewModel",
        "Lss1/a;",
        "x",
        "B",
        "()Lss1/a;",
        "analytics",
        "Lnt1/h;",
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

    new-instance v0, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->G(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lss1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lss1/a;

    return-object v0
.end method

.method private final C()Lnt1/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnt1/g;

    return-object v0
.end method

.method private static final D(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Lmt1/a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->B()Lss1/a;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lmt1/a;-><init>(Leb/a0;Lss1/a;)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lmt1/a;

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->C()Lnt1/g;

    move-result-object v0

    invoke-virtual {v0}, Lnt1/g;->getViewState()Lec3/l;

    move-result-object v0

    sget-object v1, Lnt1/h$b;->a:Lnt1/h$b;

    const/16 v2, 0x30

    invoke-static {v0, v1, v4, v2}, Lvp/c;->z(Lec3/l;Ljava/lang/Object;Lp1/q;I)Lp1/c1;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->E(Lp1/t2;)Lnt1/h;

    move-result-object v1

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2

    if-ne v2, p2, :cond_3

    :cond_2
    new-instance v2, La1/j;

    const/16 v0, 0x19

    invoke-direct {v2, p1, v0}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, La1/j;

    const/16 p1, 0x1a

    invoke-direct {v0, p0, p1}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, v0

    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lot1/g;->e(Lnt1/h;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/t2;)Lnt1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lnt1/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnt1/h;

    return-object p0
.end method

.method private static final F(Lmt1/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lmt1/a;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->C()Lnt1/g;

    move-result-object p0

    sget-object v0, Lnt1/f$a;->a:Lnt1/f$a;

    invoke-virtual {p0, v0}, Lnt1/g;->l(Lnt1/f;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->D(Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lmt1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/fragment/LabradorSubmitEligibilityFragment;->F(Lmt1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lci0/a;

    const/16 p2, 0xd

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x246e8002

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
