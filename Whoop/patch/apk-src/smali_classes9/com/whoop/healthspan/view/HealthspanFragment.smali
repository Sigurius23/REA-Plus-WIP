.class public final Lcom/whoop/healthspan/view/HealthspanFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0016\u001a\u0004\u0008\u001e\u0010\u0006R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0016\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0016\u001a\u0004\u0008\'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u0016\u001a\u0004\u0008+\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/healthspan/view/HealthspanFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "I",
        "()Ljava/lang/String;",
        "K",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lzr2/a;",
        "w",
        "Ll83/h;",
        "H",
        "()Lzr2/a;",
        "dateAndTimeProvider",
        "x",
        "G",
        "date",
        "y",
        "J",
        "source",
        "Lik1/g;",
        "z",
        "L",
        "()Lik1/g;",
        "viewModel",
        "Lj02/o0;",
        "E",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Ldk1/b;",
        "F",
        "()Ldk1/b;",
        "analyticsHelper",
        "healthspan_release"
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/healthspan/view/HealthspanFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/healthspan/view/HealthspanFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->w:Ll83/h;

    new-instance v1, Lkk1/a;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lkk1/a;-><init>(Lcom/whoop/healthspan/view/HealthspanFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->x:Ll83/h;

    new-instance v1, Lkk1/a;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Lkk1/a;-><init>(Lcom/whoop/healthspan/view/HealthspanFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/healthspan/view/HealthspanFragment$d;

    invoke-direct {v1, p0}, Lcom/whoop/healthspan/view/HealthspanFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v4, Lcom/whoop/healthspan/view/HealthspanFragment$e;

    invoke-direct {v4, p0, v2, v1, v2}, Lcom/whoop/healthspan/view/HealthspanFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->z:Ll83/h;

    new-instance v1, Lkk1/a;

    const/4 v3, 0x2

    invoke-direct {v1, p0, v3}, Lkk1/a;-><init>(Lcom/whoop/healthspan/view/HealthspanFragment;I)V

    new-instance v3, Lcom/whoop/healthspan/view/HealthspanFragment$b;

    invoke-direct {v3, p0, v2, v1}, Lcom/whoop/healthspan/view/HealthspanFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->E:Ll83/h;

    new-instance v1, Lcom/whoop/healthspan/view/HealthspanFragment$c;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/healthspan/view/HealthspanFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->F:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->E(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/healthspan/view/HealthspanFragment;Ldk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/healthspan/view/HealthspanFragment;->P(Lcom/whoop/healthspan/view/HealthspanFragment;Ldk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/healthspan/view/HealthspanFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->M(Lcom/whoop/healthspan/view/HealthspanFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/healthspan/view/HealthspanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/healthspan/view/HealthspanFragment;->N(Lcom/whoop/healthspan/view/HealthspanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->I()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final F()Ldk1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldk1/b;

    return-object v0
.end method

.method private final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final H()Lzr2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    return-object v0
.end method

.method private final I()Ljava/lang/String;
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
    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->H()Lzr2/a;

    move-result-object v0

    invoke-interface {v0}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-virtual {v0, v1}, Lorg/joda/time/LocalDate;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final K()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "source"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const-string v0, "healthspan"

    return-object v0
.end method

.method private final L()Lik1/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lik1/g;

    return-object v0
.end method

.method private static final M(Lcom/whoop/healthspan/view/HealthspanFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final N(Lcom/whoop/healthspan/view/HealthspanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

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

    new-instance v5, Lhk1/c;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v6

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->getNavigator()Lj02/o0;

    move-result-object v7

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->F()Ldk1/b;

    move-result-object v9

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->J()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v12}, Lhk1/c;-><init>(Leb/a0;Lj02/o0;Lj02/i0;Ldk1/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p1, v5

    :cond_1
    check-cast p1, Lhk1/c;

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->L()Lik1/g;

    move-result-object v1

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2

    if-ne v2, p2, :cond_3

    :cond_2
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v0, 0xe

    invoke-direct {v2, p1, v0}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 p1, 0xf

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkk1/d;->y(Lik1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lhk1/c;Lhk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lhk1/c;->b(Lhk1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/healthspan/view/HealthspanFragment;Ldk1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->F()Ldk1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Ldk1/b;->l(Ldk1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->K()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/view/HealthspanFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lhk1/c;Lhk1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/healthspan/view/HealthspanFragment;->O(Lhk1/c;Lhk1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->Q(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->L()Lik1/g;

    move-result-object p1

    new-instance v0, Lik1/f$d;

    invoke-direct {p0}, Lcom/whoop/healthspan/view/HealthspanFragment;->G()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lik1/f$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lik1/g;->n(Lik1/f;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/healthspan/view/HealthspanFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lkk1/b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0xe9b679e

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
