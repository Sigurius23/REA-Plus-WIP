.class public final Lcom/whoop/community/CommunityAddMemberFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0003J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008&\u0010\u0003J\u000f\u0010\'\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0003J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008,\u0010\u0003J3\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u000e0-2\u0014\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u000e0-H\u0002\u00a2\u0006\u0004\u00080\u00101R\u001a\u00106\u001a\u00020\u001b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER\u001a\u0010J\u001a\u00020(8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008G\u0010:\u001a\u0004\u0008H\u0010IR+\u0010S\u001a\u00020K2\u0006\u0010L\u001a\u00020K8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010R\u00a8\u0006T"
    }
    d2 = {
        "Lcom/whoop/community/CommunityAddMemberFragment;",
        "Lhj0/m;",
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
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onStart",
        "onDestroy",
        "a0",
        "l0",
        "",
        "vis",
        "r0",
        "(I)V",
        "q0",
        "p0",
        "",
        "message",
        "u0",
        "(Ljava/lang/String;)V",
        "x0",
        "subject",
        "body",
        "w0",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "text",
        "y0",
        "U",
        "t0",
        "",
        "focusVisible",
        "s0",
        "(Z)V",
        "n0",
        "Lkotlin/Function1;",
        "Landroid/text/Editable;",
        "f",
        "V",
        "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;",
        "w",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lrq0/k;",
        "x",
        "Ll83/h;",
        "Z",
        "()Lrq0/k;",
        "viewModel",
        "Lrq0/i;",
        "y",
        "Lrq0/i;",
        "listAdapter",
        "Lxp0/d;",
        "z",
        "Leb/i;",
        "X",
        "()Lxp0/d;",
        "args",
        "E",
        "getShowBottomNavigationBar",
        "()Z",
        "showBottomNavigationBar",
        "Leq0/l1;",
        "<set-?>",
        "F",
        "Lcom/whoop/ui/b;",
        "Y",
        "()Leq0/l1;",
        "o0",
        "(Leq0/l1;)V",
        "binding",
        "community_release"
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
.field static final synthetic G:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final H:I


# instance fields
.field private final E:Z

.field private final F:Lcom/whoop/ui/b;

.field private final w:Ljava/lang/String;

.field private final x:Ll83/h;

.field private y:Lrq0/i;

.field private final z:Leb/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/community/CommunityAddMemberFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/community/databinding/FragmentTeamAddmembersBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/community/CommunityAddMemberFragment;->G:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/CommunityAddMemberFragment;->H:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "CommunityAddMemberFragment"

    iput-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->w:Ljava/lang/String;

    new-instance v0, Lxp0/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lxp0/b;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    new-instance v1, Lcom/whoop/community/CommunityAddMemberFragment$f;

    invoke-direct {v1, p0}, Lcom/whoop/community/CommunityAddMemberFragment$f;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/community/CommunityAddMemberFragment$g;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v1, v0}, Lcom/whoop/community/CommunityAddMemberFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->x:Ll83/h;

    new-instance v0, Leb/i;

    const-class v1, Lxp0/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/community/CommunityAddMemberFragment$e;

    invoke-direct {v2, p0}, Lcom/whoop/community/CommunityAddMemberFragment$e;-><init>(Landroidx/fragment/app/m0;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->z:Leb/i;

    const/4 v0, 0x1

    invoke-static {p0, v4, v0, v4}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->F:Lcom/whoop/ui/b;

    return-void
.end method

.method private static final A0(Lcom/whoop/community/CommunityAddMemberFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/community/CommunityAddMemberFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->h0(Lcom/whoop/community/CommunityAddMemberFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->b0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic G(Lcom/whoop/community/CommunityAddMemberFragment;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->g0(Lcom/whoop/community/CommunityAddMemberFragment;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->j0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->d0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/community/CommunityAddMemberFragment;Lrq0/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->m0(Lcom/whoop/community/CommunityAddMemberFragment;Lrq0/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->i0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/text/Editable;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->c0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/text/Editable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lcom/whoop/community/CommunityAddMemberFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->A0(Lcom/whoop/community/CommunityAddMemberFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->k0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->f0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->e0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->v0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic R(Lcom/whoop/community/CommunityAddMemberFragment;Lib/n;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->z0(Lcom/whoop/community/CommunityAddMemberFragment;Lib/n;)V

    return-void
.end method

.method public static synthetic S(Lkotlin/jvm/internal/g0;Lcom/whoop/community/CommunityAddMemberFragment;Lkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/community/CommunityAddMemberFragment;->W(Lkotlin/jvm/internal/g0;Lcom/whoop/community/CommunityAddMemberFragment;Lkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/whoop/community/CommunityAddMemberFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->n0()V

    return-void
.end method

.method private final U()V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/whoop/community/CommunityAddMemberFragment;->y0(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v1

    iget-object v1, v1, Leq0/l1;->n:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v0, v0, Leq0/l1;->n:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    return-void
.end method

.method private final V(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lwc/e1;

    const/16 v2, 0x9

    invoke-direct {v1, v0, p0, p1, v2}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v1
.end method

.method private static final W(Lkotlin/jvm/internal/g0;Lcom/whoop/community/CommunityAddMemberFragment;Lkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lbc3/k1;->isCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-static {p1}, Landroidx/lifecycle/o1;->i(Landroidx/lifecycle/x;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v0, Lcom/whoop/community/CommunityAddMemberFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lcom/whoop/community/CommunityAddMemberFragment$a;-><init>(Lkotlin/jvm/functions/Function1;Landroid/text/Editable;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v1, v1, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final X()Lxp0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->z:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxp0/d;

    return-object v0
.end method

.method private final Y()Leq0/l1;
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->F:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/community/CommunityAddMemberFragment;->G:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leq0/l1;

    return-object v0
.end method

.method private final Z()Lrq0/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/k;

    return-object v0
.end method

.method private final a0()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v1, v0, Leq0/l1;->n:Landroid/widget/EditText;

    new-instance v2, Lrq0/e0;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lrq0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance v1, Lxp0/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-direct {p0, v1}, Lcom/whoop/community/CommunityAddMemberFragment;->V(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, v0, Leq0/l1;->n:Landroid/widget/EditText;

    new-instance v3, Lcom/whoop/community/CommunityAddMemberFragment$b;

    invoke-direct {v3, v1}, Lcom/whoop/community/CommunityAddMemberFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, v0, Leq0/l1;->h:Landroid/widget/ImageView;

    const-string v2, "searchClearIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lxp0/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Leq0/l1;->u:Landroid/widget/ImageView;

    const-string v2, "shareHelp"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lxp0/c;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Leq0/l1;->d:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v2, "inviteButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lxp0/c;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Leq0/l1;->s:Landroid/widget/FrameLayout;

    const-string v2, "shareCodeLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lxp0/c;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Leq0/l1;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lkn2/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lkn2/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v0, v0, Leq0/l1;->b:Lcom/whoop/ui/WhoopNewToolbar;

    new-instance v1, Lxp0/c;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-virtual {v0, v1}, Lcom/whoop/ui/WhoopNewToolbar;->n(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final b0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Z)V
    .locals 0

    xor-int/lit8 p1, p2, 0x1

    invoke-direct {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->s0(Z)V

    return-void
.end method

.method private static final c0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/text/Editable;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->y0(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->U()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->t0()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object p1

    new-instance v0, Lw20/q;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lxp0/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lxp0/b;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    invoke-virtual {p1, v0, v1}, Lrq0/k;->d0(Lc93/m;Lc93/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g0(Lcom/whoop/community/CommunityAddMemberFragment;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "subj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->w0(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h0(Lcom/whoop/community/CommunityAddMemberFragment;)Ll83/a0;
    .locals 2

    sget v0, Lxp0/d0;->r0:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/community/CommunityAddMemberFragment;->u0(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->x0()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string p2, "input_method"

    invoke-virtual {p0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of p2, p0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p2, :cond_0

    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 p2, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    return p2
.end method

.method private static final k0(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->n0()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final l0()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/k;->R()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lxp0/c;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lxp0/c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V

    new-instance v2, Lcom/whoop/community/CommunityAddMemberFragment$d;

    invoke-direct {v2, v1}, Lcom/whoop/community/CommunityAddMemberFragment$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final m0(Lcom/whoop/community/CommunityAddMemberFragment;Lrq0/l;)Ll83/a0;
    .locals 7

    invoke-virtual {p1}, Lrq0/l;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-virtual {p1}, Lrq0/l;->g()I

    move-result v1

    if-ge v1, v2, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v4

    iget-object v4, v4, Leq0/l1;->e:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    move v5, v2

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    invoke-static {v4, v5}, Lse/h;->T(Landroid/view/View;Z)V

    const/16 v4, 0x8

    if-eqz v0, :cond_3

    move v5, v3

    goto :goto_3

    :cond_3
    move v5, v4

    :goto_3
    invoke-direct {p0, v5}, Lcom/whoop/community/CommunityAddMemberFragment;->p0(I)V

    invoke-direct {p0, v0}, Lcom/whoop/community/CommunityAddMemberFragment;->s0(Z)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v5

    iget-object v5, v5, Leq0/l1;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lrq0/l;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v0, :cond_4

    if-eqz v1, :cond_4

    move v5, v3

    goto :goto_4

    :cond_4
    move v5, v4

    :goto_4
    invoke-direct {p0, v5}, Lcom/whoop/community/CommunityAddMemberFragment;->q0(I)V

    if-nez v0, :cond_5

    if-eqz v1, :cond_6

    :cond_5
    move v4, v3

    :cond_6
    invoke-direct {p0, v4}, Lcom/whoop/community/CommunityAddMemberFragment;->r0(I)V

    invoke-virtual {p1}, Lrq0/l;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p0, v0}, Lin2/i;->b(Landroidx/fragment/app/m0;Ljava/lang/CharSequence;)Ll83/a0;

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/k;->N()V

    :cond_7
    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v0, v0, Leq0/l1;->s:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lrq0/l;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v3, v1, 0x1

    :cond_8
    invoke-static {v0, v3}, Lse/h;->T(Landroid/view/View;Z)V

    invoke-virtual {p1}, Lrq0/l;->i()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object p0

    iget-object p0, p0, Leq0/l1;->r:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final n0()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/k;->R()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lrq0/l;->j()Lcom/whoop/domain/model/teams/Team;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "DAILY"

    invoke-static {v2, v3}, Lcom/whoop/community/a;->a(ILjava/lang/String;)Lcom/whoop/community/a$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whoop/community/a$a;->k(Lcom/whoop/domain/model/teams/Team;)Lcom/whoop/community/a$a;

    move-result-object v0

    const-string v2, "setTeam(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Leb/a0;->v(Leb/p0;)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0}, Leb/a0;->z()Z

    return-void
.end method

.method private final o0(Leq0/l1;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->F:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/community/CommunityAddMemberFragment;->G:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final p0(I)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v1, v0, Leq0/l1;->i:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Leq0/l1;->l:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Leq0/l1;->k:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Leq0/l1;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private final q0(I)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v1, v0, Leq0/l1;->q:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Leq0/l1;->o:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Leq0/l1;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private final r0(I)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v1, v0, Leq0/l1;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Leq0/l1;->g:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Leq0/l1;->c:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Leq0/l1;->d:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final s0(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v0, v0, Leq0/l1;->m:Landroid/widget/ImageView;

    invoke-static {v0, p1}, Lse/h;->T(Landroid/view/View;Z)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v0

    iget-object v0, v0, Leq0/l1;->h:Landroid/widget/ImageView;

    xor-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Lse/h;->T(Landroid/view/View;Z)V

    return-void
.end method

.method private final t0()V
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lxp0/b0;->C0:I

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.ui.views.TooltipView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/ui/views/TooltipView;

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object v1

    iget-object v1, v1, Leq0/l1;->u:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0xc8

    invoke-static {v2, v3}, Lcn2/a;->a(Landroid/content/Context;I)I

    move-result v2

    const-wide/16 v3, 0x190

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/whoop/ui/views/TooltipView;->g(Landroid/view/View;IJ)V

    return-void
.end method

.method private final u0(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lm/i;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/i;->b:I

    invoke-direct {v0, v1, v2}, Lm/i;-><init>(Landroid/content/Context;I)V

    iget-object v1, v0, Lm/i;->a:Lm/e;

    iput-object p1, v1, Lm/e;->f:Ljava/lang/CharSequence;

    sget p1, Lxp0/d0;->V:I

    new-instance v1, Lio/getstream/chat/android/ui/utils/c;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/utils/c;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->create()Lm/j;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private static final v0(Landroid/content/DialogInterface;I)V
    .locals 0

    return-void
.end method

.method private final w0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "mailto:"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "android.intent.extra.TEXT"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lxp0/d0;->H0:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final x0()V
    .locals 7

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lxp0/d0;->I0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lxp0/d0;->G0:I

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v4

    invoke-virtual {v4}, Lrq0/k;->R()Landroidx/lifecycle/p0;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrq0/l;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lrq0/l;->j()Lcom/whoop/domain/model/teams/Team;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v6

    invoke-virtual {v6}, Lrq0/k;->R()Landroidx/lifecycle/p0;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lrq0/l;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lrq0/l;->i()Ljava/lang/String;

    move-result-object v5

    :cond_1
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v2}, Lcom/whoop/community/CommunityAddMemberFragment;->w0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final y0(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/k;->R()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lrq0/l;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/k;->O()Landroidx/lifecycle/p0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroidx/lifecycle/p0;->removeObservers(Landroidx/lifecycle/g0;)V

    :cond_1
    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrq0/k;->h0(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/k;->O()Landroidx/lifecycle/p0;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_2
    return-void
.end method

.method private static final z0(Lcom/whoop/community/CommunityAddMemberFragment;Lib/n;)V
    .locals 0

    iget-object p0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->y:Lrq0/i;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lib/p;->c(Lib/n;)V

    return-void

    :cond_0
    const-string p0, "listAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getShowBottomNavigationBar()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/community/CommunityAddMemberFragment;->E:Z

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Leq0/l1;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/l1;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p2

    invoke-virtual {p2}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p3

    const-string v0, "getViewLifecycleOwner(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/community/CommunityAddMemberFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/community/CommunityAddMemberFragment$c;-><init>(Lcom/whoop/community/CommunityAddMemberFragment;)V

    invoke-virtual {p2, p3, v0}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->o0(Leq0/l1;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lhj0/m;->onDestroy()V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/k;->b0()V

    return-void
.end method

.method public onStart()V
    .locals 0

    invoke-super {p0}, Lhj0/m;->onStart()V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->l0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->X()Lxp0/d;

    move-result-object p2

    invoke-virtual {p2}, Lxp0/d;->a()Lcom/whoop/domain/model/teams/Team;

    move-result-object p2

    const-string v0, "getTeam(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrq0/k;->Y(Lcom/whoop/domain/model/teams/Team;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->a0()V

    new-instance p1, Lrq0/i;

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Z()Lrq0/k;

    move-result-object p2

    invoke-direct {p1, p2}, Lrq0/i;-><init>(Lrq0/k;)V

    iput-object p1, p0, Lcom/whoop/community/CommunityAddMemberFragment;->y:Lrq0/i;

    invoke-direct {p0}, Lcom/whoop/community/CommunityAddMemberFragment;->Y()Leq0/l1;

    move-result-object p1

    iget-object p1, p1, Leq0/l1;->e:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Lcom/whoop/community/CommunityAddMemberFragment;->y:Lrq0/i;

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    const-string p1, ""

    invoke-direct {p0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->y0(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "listAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
