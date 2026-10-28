.class public final Lcom/whoop/community/presentation/login/InviteCodeActivity;
.super Lhj0/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/presentation/login/InviteCodeActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 F2\u00020\u0001:\u0001GB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0015\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0003J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008#\u0010\u0003J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008-\u0010,J\u000f\u0010.\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008.\u0010\u0003R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u00101\u001a\u0004\u00087\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010E\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010\u001c\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/community/presentation/login/InviteCodeActivity;",
        "Lhj0/s;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "(IILandroid/content/Intent;)V",
        "",
        "p",
        "()Ljava/lang/String;",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onOptionsItemSelected",
        "(Landroid/view/MenuItem;)Z",
        "h0",
        "V",
        "l0",
        "m0",
        "()Z",
        "Z",
        "n0",
        "Loq0/g;",
        "viewState",
        "w0",
        "(Loq0/g;)V",
        "b0",
        "Lcom/whoop/domain/model/Invitation;",
        "invitation",
        "f0",
        "(Lcom/whoop/domain/model/Invitation;)V",
        "d0",
        "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "invite",
        "e0",
        "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V",
        "g0",
        "a0",
        "Loq0/e;",
        "I",
        "Ll83/h;",
        "Y",
        "()Loq0/e;",
        "viewModel",
        "Lyp0/a;",
        "J",
        "X",
        "()Lyp0/a;",
        "communityAccessChecker",
        "Loq0/d;",
        "K",
        "Leb/i;",
        "W",
        "()Loq0/d;",
        "args",
        "Leq0/c;",
        "L",
        "Leq0/c;",
        "inviteCodeBinding",
        "c0",
        "isFromCommunityLanding",
        "M",
        "a",
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
.field public static final M:Lcom/whoop/community/presentation/login/InviteCodeActivity$a;

.field public static final N:I


# instance fields
.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Leb/i;

.field private L:Leq0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/community/presentation/login/InviteCodeActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/presentation/login/InviteCodeActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->M:Lcom/whoop/community/presentation/login/InviteCodeActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->N:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/s;-><init>()V

    new-instance v0, Lcom/whoop/community/presentation/login/InviteCodeActivity$f;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity$f;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/community/presentation/login/InviteCodeActivity$g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/community/presentation/login/InviteCodeActivity$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->I:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/community/presentation/login/InviteCodeActivity$d;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/community/presentation/login/InviteCodeActivity$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->J:Ll83/h;

    new-instance v0, Leb/i;

    const-class v1, Loq0/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/community/presentation/login/InviteCodeActivity$e;

    invoke-direct {v2, p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity$e;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->K:Leb/i;

    return-void
.end method

.method public static synthetic H(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->r0(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->v0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/net/Uri;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->q0(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->j0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->s0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->i0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->p0(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->t0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->u0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/whoop/community/presentation/login/InviteCodeActivity;Leq0/c;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->k0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Leq0/c;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic R(Lcom/whoop/community/presentation/login/InviteCodeActivity;Loq0/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->o0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Loq0/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S(Lcom/whoop/community/presentation/login/InviteCodeActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->V()V

    return-void
.end method

.method public static final synthetic T(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Loq0/e;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U(Lcom/whoop/community/presentation/login/InviteCodeActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Z()V

    return-void
.end method

.method private final V()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, Leq0/c;->j:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->m0()Z

    move-result v1

    iget-object v2, v0, Leq0/c;->k:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, v0, Leq0/c;->k:Lcom/whoop/ui/pills/StrokedPillButton;

    if-eqz v1, :cond_0

    sget v1, Lvu1/a;->s:I

    goto :goto_0

    :cond_0
    sget v1, Lvu1/a;->R:I

    :goto_0
    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_1
    const-string v0, "inviteCodeBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final W()Loq0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->K:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loq0/d;

    return-object v0
.end method

.method private final X()Lyp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyp0/a;

    return-object v0
.end method

.method private final Y()Loq0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loq0/e;

    return-object v0
.end method

.method private final Z()V
    .locals 1

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->M()V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method private final a0()V
    .locals 3

    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v1, :cond_0

    iget-object v1, v1, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void

    :cond_0
    const-string v0, "inviteCodeBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final b0()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v0, :cond_0

    iget-object v1, v0, Leq0/c;->h:Leq0/f2;

    invoke-virtual {v1}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v1

    const-string v2, "backArrow"

    invoke-virtual {v1, v2}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    const-string v1, "navigationBar"

    invoke-virtual {p0, v1}, Lhj0/t;->F(Ljava/lang/String;)V

    iget-object v0, v0, Leq0/c;->h:Leq0/f2;

    invoke-virtual {v0}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    return-void

    :cond_0
    const-string v0, "inviteCodeBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final c0()Z
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "fromCommunityLanding"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private final d0()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {}, Lyp0/b;->a()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.whoop.ui.home.redesign.view.MainActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x10008000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final e0(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.whoop.ui.home.redesign.view.MainActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x10008000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "invitePojo"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final f0(Lcom/whoop/domain/model/Invitation;)V
    .locals 7

    new-instance v0, Landroid/transition/Slide;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/transition/Slide;-><init>(I)V

    iget-object v1, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    const/4 v2, 0x0

    const-string v3, "inviteCodeBinding"

    if-eqz v1, :cond_1

    iget-object v1, v1, Leq0/c;->b:Landroid/widget/ImageView;

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    const/16 v1, 0x3e8

    int-to-long v5, v1

    invoke-virtual {v0, v5, v6}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    const v5, 0x102002f

    invoke-virtual {v0, v5, v4}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    const v5, 0x1020030

    invoke-virtual {v0, v5, v4}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/view/Window;->setExitTransition(Landroid/transition/Transition;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAllowEnterTransitionOverlap(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAllowReturnTransitionOverlap(Z)V

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->Q(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;)Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;->s(I)Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;->r(Landroid/app/Activity;)Lcom/whoop/community/presentation/login/JoinTeamActivity$b;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Leq0/c;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$b;->c(Landroid/view/View;)Lcom/whoop/community/presentation/login/JoinTeamActivity$b;

    move-result-object p1

    invoke-virtual {p0}, Lhj0/t;->E()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$b;->d(Landroid/view/View;)Lcom/whoop/community/presentation/login/JoinTeamActivity$b;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/t$c;->a()Lhj0/t$b;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    const/16 v0, 0x144

    invoke-virtual {p1, p0, v0}, Lhj0/q;->n(Landroid/app/Activity;I)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final g0(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "invitePojo"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/16 p1, 0x383

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_0
    sget-object v0, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->R:Lcom/whoop/ui/teams/TeamsShowInviteActivity$a;

    invoke-virtual {v0, p0, p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity$a;->a(Landroid/content/Context;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Lhj0/q;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->e()Lhj0/q;

    move-result-object p1

    const/16 v0, 0x144

    invoke-virtual {p1, p0, v0}, Lhj0/q;->n(Landroid/app/Activity;I)V

    return-void
.end method

.method private final h0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, Leq0/c;->h:Leq0/f2;

    invoke-virtual {v1}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Loq0/a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Leq0/c;->k:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v2, "inviteCodeNextButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Loq0/a;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    new-instance v2, Loq0/b;

    invoke-direct {v2, p0, v0}, Loq0/b;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;Leq0/c;)V

    invoke-virtual {v1, v2}, Lcom/whoop/ui/WhoopEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    iget-object v0, v0, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/community/presentation/login/InviteCodeActivity$c;

    invoke-direct {v1, p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity$c;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-void

    :cond_1
    const-string v0, "inviteCodeBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final i0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg/l;->onBackPressed()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object p0

    invoke-virtual {p0}, Loq0/e;->P()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Leq0/c;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p2, 0x6

    if-eq p3, p2, :cond_1

    invoke-virtual {p4}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p2

    const/16 p3, 0x42

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->a0()V

    iget-object p0, p1, Leq0/c;->k:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    const/4 p0, 0x1

    return p0
.end method

.method private final l0()V
    .locals 2

    sget v0, Lxp0/a0;->t7:I

    invoke-virtual {p0, v0}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Lm/m;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v0

    if-eqz v0, :cond_0

    sget v1, Lxp0/d0;->t0:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/b;->w(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lm/b;->o(Z)V

    sget v1, Lnf1/c;->c:I

    invoke-virtual {v0, v1}, Lm/b;->r(I)V

    :cond_0
    return-void
.end method

.method private final m0()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v0}, Lcom/whoop/ui/WhoopEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    xor-int/2addr v0, v1

    return v0

    :cond_2
    const-string v0, "inviteCodeBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final n0()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->G()Le50/c;

    move-result-object v0

    new-instance v1, Loq0/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Le50/c;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->y()Lor2/r0;

    move-result-object v0

    new-instance v1, Loq0/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Loq0/c;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/r0;->c(Landroidx/lifecycle/g0;Lc93/a;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->w()Lor2/r0;

    move-result-object v0

    new-instance v1, Loq0/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Loq0/c;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/r0;->c(Landroidx/lifecycle/g0;Lc93/a;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->D()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/a;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->B()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/a;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->A()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/a;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->C()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/a;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-virtual {v0}, Loq0/e;->z()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Loq0/a;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final o0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Loq0/g;)Ll83/a0;
    .locals 1

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->w0(Loq0/g;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p0(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->a0()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q0(Lcom/whoop/community/presentation/login/InviteCodeActivity;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r0(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lin2/i;->f(Landroid/content/Context;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;
    .locals 1

    const-string v0, "invite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->f0(Lcom/whoop/domain/model/Invitation;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;
    .locals 1

    const-string v0, "invite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->e0(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;
    .locals 1

    const-string v0, "invite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->g0(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v0(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/net/Uri;)Ll83/a0;
    .locals 2

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    sget p1, Lxp0/d0;->W:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final w0(Loq0/g;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Loq0/g;->e()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, Leq0/c;->j:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Leq0/c;->j:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v1, v0, Leq0/c;->j:Landroid/widget/TextView;

    invoke-virtual {p1}, Loq0/g;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Loq0/g;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Loq0/g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p1}, Loq0/g;->g()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, Leq0/c;->g:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_2
    invoke-virtual {p1}, Loq0/g;->c()I

    move-result p1

    iget-object v0, v0, Leq0/c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_3
    const-string p1, "inviteCodeBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const/16 v0, 0x144

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->supportFinishAfterTransition()V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lhj0/f;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lhj0/s;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->X()Lyp0/a;

    move-result-object p1

    invoke-interface {p1}, Lyp0/a;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->d0()V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Leq0/c;->c(Landroid/view/LayoutInflater;)Leq0/c;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L:Leq0/c;

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->l0()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->h0()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->V()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->n0()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Loq0/e;->N(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->b0()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->W()Loq0/d;

    move-result-object p1

    invoke-virtual {p1}, Loq0/d;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Loq0/e;->U(Z)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object v0

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Loq0/e;->O(Ljava/lang/CharSequence;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->Y()Loq0/e;

    move-result-object p1

    invoke-virtual {p1}, Loq0/e;->P()V

    :cond_1
    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance v0, Lcom/whoop/community/presentation/login/InviteCodeActivity$b;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/login/InviteCodeActivity$b;-><init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;)V

    invoke-virtual {p1, p0, v0}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lg/l;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lhj0/f;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public p()Ljava/lang/String;
    .locals 1

    const-string v0, "Validate Invite Code - Join Team"

    return-object v0
.end method
