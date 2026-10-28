.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0006R\u001d\u0010 \u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0017\u001a\u0004\u0008\u001f\u0010\u0006R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0017\u001a\u0004\u0008#\u0010$\u00a8\u0006(\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "G",
        "()Ljava/lang/String;",
        "I",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lzr2/a;",
        "w",
        "Ll83/h;",
        "F",
        "()Lzr2/a;",
        "dateAndTimeProvider",
        "x",
        "E",
        "date",
        "y",
        "H",
        "source",
        "Lso1/o;",
        "z",
        "J",
        "()Lso1/o;",
        "viewModel",
        "Lso1/p;",
        "viewState",
        "hormonal-insights_release"
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

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->w:Ll83/h;

    new-instance v0, Lvo1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvo1/b;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->x:Ll83/h;

    new-instance v0, Lvo1/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lvo1/b;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment$c;

    invoke-direct {v3, p0, v2, v0, v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Lto1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->M(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Lto1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->O(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->N(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->G()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final F()Lzr2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    return-object v0
.end method

.method private final G()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "date"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->F()Lzr2/a;

    move-result-object v0

    invoke-interface {v0}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-virtual {v0, v1}, Lorg/joda/time/LocalDate;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final I()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "source"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    return-object v0

    :cond_0
    return-object v1
.end method

.method private final J()Lso1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lso1/o;

    return-object v0
.end method

.method private static final K(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->J()Lso1/o;

    move-result-object p1

    invoke-virtual {p1}, Lso1/o;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lso1/p$b;->b:Lso1/p$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-static {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->L(Lp1/t2;)Lso1/p;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Luo1/b;

    const/16 p1, 0xb

    invoke-direct {p2, p0, p1}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lvo1/b;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lvo1/b;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p2

    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lvo1/d;->u(Lso1/p;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lp1/t2;)Lso1/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lso1/p;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lso1/p;

    return-object p0
.end method

.method private static final M(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Lto1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->J()Lso1/o;

    move-result-object p0

    invoke-virtual {p0, p1}, Lso1/o;->n(Lto1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->I()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->D(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->K(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltx0/a;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x307ad68d

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-static {p0}, Lhj0/p;->a(Landroidx/fragment/app/m0;)Lsm2/a;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->J()Lso1/o;

    move-result-object p1

    new-instance p2, Lto1/a$a;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->E()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->H()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lto1/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lso1/o;->n(Lto1/a;)V

    return-void
.end method
