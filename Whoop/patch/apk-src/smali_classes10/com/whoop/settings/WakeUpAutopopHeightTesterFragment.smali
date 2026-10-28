.class public final Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/DrawerPresentation;",
        "preset",
        "Ll83/a0;",
        "F",
        "(Lcom/whoop/navigation/DrawerPresentation;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Ldp0/g;",
        "w",
        "Ll83/h;",
        "B",
        "()Ldp0/g;",
        "globalCoachManager",
        "x",
        "a",
        "app_prodStandardRelease"
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
.field public static final x:Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$a;

.field public static final y:I


# instance fields
.field private final w:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->x:Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Lcom/whoop/navigation/DrawerPresentation;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->E(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Lcom/whoop/navigation/DrawerPresentation;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Ldp0/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp0/g;

    return-object v0
.end method

.method private static final C(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p2, :cond_5

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Ld1/i;

    const/16 p2, 0xf

    invoke-direct {v0, p0, p2}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/a;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, Lck1/c;

    const/16 p2, 0x1d

    invoke-direct {v3, p0, p2}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3, p1, v2}, Lea2/i0;->j(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Lcom/whoop/navigation/DrawerPresentation;)Ll83/a0;
    .locals 1

    const-string v0, "preset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->F(Lcom/whoop/navigation/DrawerPresentation;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final F(Lcom/whoop/navigation/DrawerPresentation;)V
    .locals 5

    invoke-static {p1}, Lea2/i0;->o(Lcom/whoop/navigation/DrawerPresentation;)Lep0/j;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "Reducer returned null \u2014 payload is malformed"

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Auto-pop dispatched: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-direct {p0}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->B()Ldp0/g;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v2

    const-string v3, "android-app://com.whoop/home"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Leb/a0;->q(Landroid/net/Uri;)V

    new-instance v2, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v0, v3}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment$c;-><init>(Ldp0/g;Lep0/j;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v3, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic y(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->D(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;->C(Lcom/whoop/settings/WakeUpAutopopHeightTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lci0/a;

    const/16 p2, 0x1c

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x22a62e88

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
