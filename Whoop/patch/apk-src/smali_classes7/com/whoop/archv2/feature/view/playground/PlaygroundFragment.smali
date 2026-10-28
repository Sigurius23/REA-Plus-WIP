.class public final Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "endpointPath",
        "",
        "isCacheEnabled",
        "Ll83/a0;",
        "D",
        "(Ljava/lang/String;Z)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lj02/o0;",
        "w",
        "Ll83/h;",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lwi0/c;",
        "x",
        "C",
        "()Lwi0/c;",
        "playgroundPreferences",
        "arch-v2_release"
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

    new-instance v0, Lwi0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwi0/b;-><init>(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$d;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->G(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->F(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lwi0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi0/c;

    return-object v0
.end method

.method private final D(Ljava/lang/String;Z)V
    .locals 13

    new-instance v0, Lcom/whoop/navigation/models/ApiRequest;

    sget-object v2, Lcom/whoop/navigation/models/GenericHttpMethod;->GET:Lcom/whoop/navigation/models/GenericHttpMethod;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/whoop/navigation/GenericCachePolicy;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    move v2, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/GenericCachePolicy;-><init>(ZLjava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    new-instance v0, Lj02/m0$m1;

    const/16 v11, 0x3fc

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v1

    move-object v1, p1

    invoke-direct/range {v0 .. v12}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->getNavigator()Lj02/o0;

    move-result-object p1

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method private static final E(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->C()Lwi0/c;

    move-result-object p1

    invoke-virtual {p1}, Lwi0/c;->c()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    move-object v1, p1

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_2

    if-ne p2, v0, :cond_3

    :cond_2
    new-instance p2, Lwi0/a;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lwi0/a;-><init>(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;I)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v4, p2

    check-cast v4, Lc93/m;

    invoke-direct {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->C()Lwi0/c;

    move-result-object p1

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_4

    if-ne v2, v0, :cond_5

    :cond_4
    new-instance v2, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$a;

    invoke-direct {v2, p1}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lj93/g;

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->C()Lwi0/c;

    move-result-object p1

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_6

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$b;

    invoke-direct {v2, p1}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lj93/g;

    move-object v6, v2

    check-cast v6, Lc93/a;

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_8

    if-ne p2, v0, :cond_9

    :cond_8
    new-instance p2, Lwi0/b;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lwi0/b;-><init>(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;I)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v7, p2

    check-cast v7, Lc93/a;

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v10}, Lwi0/e;->p(Ljava/lang/String;ZLjava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;Ljava/lang/String;Z)Ll83/a0;
    .locals 1

    const-string v0, "endpointPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->C()Lwi0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lwi0/c;->e(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->D(Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->E(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->H(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lwi0/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lwi0/a;-><init>(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x2fd195d

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
