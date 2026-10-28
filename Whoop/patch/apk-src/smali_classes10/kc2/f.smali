.class public final Lkc2/f;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lkc2/f;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
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
        "onResume",
        "Lmc2/f;",
        "w",
        "Ll83/h;",
        "C",
        "()Lmc2/f;",
        "viewModel",
        "Lza2/n;",
        "x",
        "B",
        "()Lza2/n;",
        "navigator",
        "Lmc2/m;",
        "viewState",
        "settings_release"
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

    new-instance v0, Lkc2/f$b;

    invoke-direct {v0, p0}, Lkc2/f$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lkc2/f$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lkc2/f$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lkc2/f;->w:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lkc2/f$a;

    invoke-direct {v2, p0, v3, v0}, Lkc2/f$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lkc2/f;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lkc2/f;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lkc2/f;->D(Lkc2/f;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lkc2/f;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lkc2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lkc2/f;->C()Lmc2/f;

    move-result-object p1

    invoke-virtual {p1}, Lmc2/f;->n()Lec3/t1;

    move-result-object v4

    new-instance v5, Lmc2/m;

    const/4 p1, 0x0

    const/4 p2, 0x3

    invoke-direct {v5, p1, p1, p2, p1}, Lmc2/m;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lkc2/f;->F(Lp1/t2;)Lmc2/m;

    move-result-object p1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_2

    :cond_1
    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 p2, 0xd

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v7, v3, v3}, Lmc2/l;->m(Lmc2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/t2;)Lmc2/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lmc2/m;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmc2/m;

    return-object p0
.end method

.method private static final G(Lkc2/f;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkc2/f;->B()Lza2/n;

    move-result-object p0

    new-instance v0, Lza2/m$a;

    invoke-direct {v0, p1}, Lza2/m$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {p0, v0}, Lza2/n;->a(Lza2/m;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lkc2/f;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkc2/f;->G(Lkc2/f;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lkc2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkc2/f;->E(Lkc2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B()Lza2/n;
    .locals 1

    iget-object v0, p0, Lkc2/f;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lza2/n;

    return-object v0
.end method

.method public final C()Lmc2/f;
    .locals 1

    iget-object v0, p0, Lkc2/f;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmc2/f;

    return-object v0
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lkc2/f;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lhb2/f;

    const/16 p2, 0x1c

    invoke-direct {p1, p0, p2}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x6b4b2189

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Lkc2/f;->C()Lmc2/f;

    move-result-object v0

    sget-object v1, Lmc2/e$a;->a:Lmc2/e$a;

    invoke-virtual {v0, v1}, Lmc2/f;->p(Lmc2/e;)V

    return-void
.end method
