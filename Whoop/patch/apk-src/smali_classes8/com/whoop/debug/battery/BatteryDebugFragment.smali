.class public final Lcom/whoop/debug/battery/BatteryDebugFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/debug/battery/BatteryDebugFragment;",
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
        "Lox0/e;",
        "w",
        "Ll83/h;",
        "A",
        "()Lox0/e;",
        "viewModel",
        "debug-tools_release"
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


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/debug/battery/BatteryDebugFragment$a;

    invoke-direct {v0, p0}, Lcom/whoop/debug/battery/BatteryDebugFragment$a;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/debug/battery/BatteryDebugFragment$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/debug/battery/BatteryDebugFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/debug/battery/BatteryDebugFragment;->w:Ll83/h;

    return-void
.end method

.method private final A()Lox0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/debug/battery/BatteryDebugFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lox0/e;

    return-object v0
.end method

.method private static final B(Lcom/whoop/debug/battery/BatteryDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

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

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lcom/whoop/debug/battery/BatteryDebugFragment;->A()Lox0/e;

    move-result-object p2

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lnr0/e;

    const/16 v0, 0x13

    invoke-direct {v1, p0, v0}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/a;

    invoke-static {p2, v1, p1, v2}, Lox0/c;->g(Lox0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lcom/whoop/debug/battery/BatteryDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/debug/battery/BatteryDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/debug/battery/BatteryDebugFragment;->B(Lcom/whoop/debug/battery/BatteryDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/debug/battery/BatteryDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/debug/battery/BatteryDebugFragment;->C(Lcom/whoop/debug/battery/BatteryDebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/debug/battery/BatteryDebugFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Loe2/c;

    const/16 p2, 0xa

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x6434a939

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
