.class public final Lcom/whoop/labrador/fragment/LabradorReadingFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0014\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/labrador/fragment/LabradorReadingFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "onAttach",
        "(Landroid/content/Context;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "",
        "w",
        "Ll83/h;",
        "D",
        "()Ljava/lang/String;",
        "selectedWrist",
        "Lrt1/g;",
        "x",
        "E",
        "()Lrt1/g;",
        "viewModel",
        "Lss1/a;",
        "y",
        "C",
        "()Lss1/a;",
        "analytics",
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

.field private final y:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcu1/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcu1/d;-><init>(Lcom/whoop/labrador/fragment/LabradorReadingFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->w:Ll83/h;

    new-instance v0, Lcu1/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcu1/d;-><init>(Lcom/whoop/labrador/fragment/LabradorReadingFragment;I)V

    new-instance v1, Lcom/whoop/labrador/fragment/LabradorReadingFragment$b;

    invoke-direct {v1, p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/labrador/fragment/LabradorReadingFragment$c;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v1, v0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->x:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/labrador/fragment/LabradorReadingFragment$a;

    invoke-direct {v1, p0, v4, v4}, Lcom/whoop/labrador/fragment/LabradorReadingFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/labrador/fragment/LabradorReadingFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->I(Lcom/whoop/labrador/fragment/LabradorReadingFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/labrador/fragment/LabradorReadingFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->H(Lcom/whoop/labrador/fragment/LabradorReadingFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lss1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lss1/a;

    return-object v0
.end method

.method private final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final E()Lrt1/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrt1/g;

    return-object v0
.end method

.method private static final F(Lcom/whoop/labrador/fragment/LabradorReadingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Leb/a0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_2

    new-instance v0, Ldu1/a;

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->C()Lss1/a;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ldu1/a;-><init>(Leb/a0;Lss1/a;)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Ldu1/a;

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->E()Lrt1/g;

    move-result-object v3

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_3

    if-ne v1, p2, :cond_4

    :cond_3
    new-instance v1, Lcu1/c;

    const/4 p1, 0x1

    invoke-direct {v1, v0, p1}, Lcu1/c;-><init>(Ldu1/a;I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->D()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_5

    const-string p0, "RIGHT"

    :cond_5
    sget-object p1, Lht1/e;->RIGHT:Lht1/e;

    invoke-static {}, Lht1/e;->values()[Lht1/e;

    move-result-object p2

    array-length v0, p2

    :goto_1
    if-ge v2, v0, :cond_7

    aget-object v1, p2, v2

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    const/4 v1, 0x0

    :goto_2
    if-nez v1, :cond_8

    move-object v5, p1

    goto :goto_3

    :cond_8
    move-object v5, v1

    :goto_3
    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lst1/l;->B(Lrt1/g;Lkotlin/jvm/functions/Function1;Lht1/e;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_9
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Ldu1/a;Lrt1/b$e;)Ll83/a0;
    .locals 7

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrt1/b$b;->a:Lrt1/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ldu1/b$e;->a:Ldu1/b$e;

    invoke-virtual {p0, p1}, Ldu1/a;->a(Ldu1/b;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lrt1/b$g;->a:Lrt1/b$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Ldu1/b$d;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Ldu1/b$d;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Ldu1/a;->a(Ldu1/b;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lrt1/b$f;->a:Lrt1/b$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Ldu1/b$c;->a:Ldu1/b$c;

    invoke-virtual {p0, p1}, Ldu1/a;->a(Ldu1/b;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lrt1/b$h;->a:Lrt1/b$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ldu1/b$b;->a:Ldu1/b$b;

    invoke-virtual {p0, p1}, Ldu1/a;->a(Ldu1/b;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final H(Lcom/whoop/labrador/fragment/LabradorReadingFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "selectedWrist"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final I(Lcom/whoop/labrador/fragment/LabradorReadingFragment;)Luf3/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->D()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Ldu1/a;Lrt1/b$e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->G(Ldu1/a;Lrt1/b$e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/labrador/fragment/LabradorReadingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->F(Lcom/whoop/labrador/fragment/LabradorReadingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onAttach(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "LabradorReadingFragment"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    invoke-static {p0, p1}, Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/labrador/fragment/LabradorReadingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0xf4fad8a

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
