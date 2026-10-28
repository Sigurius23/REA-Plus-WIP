.class public final Lcom/whoop/bot/view/AiConversationFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008%\u0010&R\u001b\u0010,\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001b\u00100\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010)\u001a\u0004\u0008.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010)\u001a\u0004\u00083\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010)\u001a\u0004\u00088\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010)\u001a\u0004\u0008=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u0010)\u001a\u0004\u0008B\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010)\u001a\u0004\u0008G\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008K\u0010)\u001a\u0004\u0008L\u0010MR!\u0010T\u001a\u0008\u0012\u0004\u0012\u00020P0O8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Q\u0010)\u001a\u0004\u0008R\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008V\u0010)\u001a\u0004\u0008W\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008_\u0010)\u001a\u0004\u0008`\u0010a\u00a8\u0006f\u00b2\u0006\u000c\u0010d\u001a\u00020c8\nX\u008a\u0084\u0002\u00b2\u0006\u0010\u0010e\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/bot/view/AiConversationFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "",
        "F0",
        "(Lq83/d;)Ljava/lang/Object;",
        "shouldRequestPermissions",
        "c0",
        "(ZLq83/d;)Ljava/lang/Object;",
        "Lsl0/n0;",
        "g0",
        "(Landroid/os/Bundle;)Lsl0/n0;",
        "",
        "argsString",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "E0",
        "(Ljava/lang/String;)Ljava/util/Map;",
        "message",
        "i0",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lml0/c;",
        "w",
        "Ll83/h;",
        "e0",
        "()Lml0/c;",
        "aiConversationNavigationRouter",
        "x",
        "f0",
        "()Lsl0/n0;",
        "aiConversationScreenArgs",
        "Lnl0/e;",
        "y",
        "p0",
        "()Lnl0/e;",
        "viewModel",
        "Lxk0/a;",
        "z",
        "getAnalyticsHelper",
        "()Lxk0/a;",
        "analyticsHelper",
        "Lm32/a;",
        "E",
        "n0",
        "()Lm32/a;",
        "permissionChecker",
        "Lm32/c;",
        "F",
        "m0",
        "()Lm32/c;",
        "locationPermissionHelper",
        "Lz92/a;",
        "G",
        "o0",
        "()Lz92/a;",
        "userInfoAccessor",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "H",
        "l0",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "La6/g;",
        "Lf6/f;",
        "I",
        "j0",
        "()La6/g;",
        "dataStore",
        "Lzr2/a;",
        "J",
        "k0",
        "()Lzr2/a;",
        "dateAndTimeProvider",
        "Ltr2/n;",
        "K",
        "Ltr2/n;",
        "logger",
        "Lxk0/b;",
        "L",
        "h0",
        "()Lxk0/b;",
        "analyticsTracker",
        "Lnl0/f;",
        "viewState",
        "showPermissionsDisclaimerModal",
        "bot_release"
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

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Ltr2/n;

.field private final L:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lsl0/f0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/bot/view/AiConversationFragment$h;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/bot/view/AiConversationFragment$h;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v2, Lsl0/f0;

    const/4 v4, 0x2

    invoke-direct {v2, p0, v4}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/bot/view/AiConversationFragment;->x:Ll83/h;

    new-instance v2, Lsl0/f0;

    const/4 v4, 0x3

    invoke-direct {v2, p0, v4}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    new-instance v4, Lcom/whoop/bot/view/AiConversationFragment$p;

    invoke-direct {v4, p0}, Lcom/whoop/bot/view/AiConversationFragment$p;-><init>(Landroid/content/ComponentCallbacks;)V

    new-instance v5, Lcom/whoop/bot/view/AiConversationFragment$q;

    invoke-direct {v5, p0, v3, v4, v2}, Lcom/whoop/bot/view/AiConversationFragment$q;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v0, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->y:Ll83/h;

    new-instance v0, Lsl0/f0;

    const/4 v2, 0x4

    invoke-direct {v0, p0, v2}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    new-instance v2, Lcom/whoop/bot/view/AiConversationFragment$i;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/bot/view/AiConversationFragment$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->z:Ll83/h;

    new-instance v0, Lcom/whoop/bot/view/AiConversationFragment$j;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/bot/view/AiConversationFragment$j;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->E:Ll83/h;

    new-instance v0, Lvf3/c;

    const-string v2, "location-permission-helper"

    invoke-direct {v0, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v2, Lsl0/f0;

    const/4 v4, 0x5

    invoke-direct {v2, p0, v4}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    new-instance v4, Lcom/whoop/bot/view/AiConversationFragment$k;

    invoke-direct {v4, p0, v0, v2}, Lcom/whoop/bot/view/AiConversationFragment$k;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->F:Ll83/h;

    new-instance v0, Lcom/whoop/bot/view/AiConversationFragment$l;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/bot/view/AiConversationFragment$l;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->G:Ll83/h;

    new-instance v0, Lcom/whoop/bot/view/AiConversationFragment$m;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/bot/view/AiConversationFragment$m;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->H:Ll83/h;

    new-instance v0, Lcom/whoop/bot/view/AiConversationFragment$n;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/bot/view/AiConversationFragment$n;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->I:Ll83/h;

    new-instance v0, Lcom/whoop/bot/view/AiConversationFragment$o;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/bot/view/AiConversationFragment$o;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->J:Ll83/h;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AiConversationFragment"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->K:Ltr2/n;

    new-instance v0, Lsl0/f0;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->L:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/bot/view/AiConversationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment;->r0(Lcom/whoop/bot/view/AiConversationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final A0(Lcom/whoop/bot/view/AiConversationFragment;Lnl0/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->p0()Lnl0/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Lnl0/e;->o(Lnl0/d;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/bot/view/AiConversationFragment;Lml0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->B0(Lcom/whoop/bot/view/AiConversationFragment;Lml0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final B0(Lcom/whoop/bot/view/AiConversationFragment;Lml0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->e0()Lml0/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lml0/c;->c(Lml0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/bot/view/AiConversationFragment;)Lxk0/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->b0(Lcom/whoop/bot/view/AiConversationFragment;)Lxk0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final C0(Lcom/whoop/bot/view/AiConversationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/bot/view/AiConversationFragment;Lbc3/c0;Lp1/t2;Ljava/util/List;Lsl0/q2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/bot/view/AiConversationFragment;->z0(Lcom/whoop/bot/view/AiConversationFragment;Lbc3/c0;Lp1/t2;Ljava/util/List;Lsl0/q2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 4

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v0

    invoke-virtual {v0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v2

    invoke-virtual {v2}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v3

    invoke-virtual {v3}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object p0

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->u0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final E0(Ljava/lang/String;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/z;->w:Lm83/z;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v1, "UTF-8"

    invoke-static {p1, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v4, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v4}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-virtual {v1, v2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static synthetic F(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->a0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final F0(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/bot/view/AiConversationFragment$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/bot/view/AiConversationFragment$g;

    iget v1, v0, Lcom/whoop/bot/view/AiConversationFragment$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/bot/view/AiConversationFragment$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/bot/view/AiConversationFragment$g;

    invoke-direct {v0, p0, p1}, Lcom/whoop/bot/view/AiConversationFragment$g;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/bot/view/AiConversationFragment$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/bot/view/AiConversationFragment$g;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->n0()Lm32/a;

    move-result-object p1

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-interface {p1, v2}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->j0()La6/g;

    move-result-object v2

    invoke-static {}, Lsl0/l0;->a()Lf6/d;

    move-result-object v4

    iput-boolean p1, v0, Lcom/whoop/bot/view/AiConversationFragment$g;->w:Z

    iput v3, v0, Lcom/whoop/bot/view/AiConversationFragment$g;->z:I

    invoke-static {v2, v4, v0}, Lkh2/a;->a(La6/g;Lf6/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->l0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v0, "whoop-coach-weather-gps-android"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic G(Lcom/whoop/bot/view/AiConversationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->C0(Lcom/whoop/bot/view/AiConversationFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final G0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object p0

    new-instance v0, Lor2/m;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->v0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lxk0/a$a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/bot/view/AiConversationFragment;->t0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lxk0/a$a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->G0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->Y(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/bot/view/AiConversationFragment;Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->A0(Lcom/whoop/bot/view/AiConversationFragment;Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->w0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->Z(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(Lcom/whoop/bot/view/AiConversationFragment;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment;->c0(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Q(Lcom/whoop/bot/view/AiConversationFragment;)Lxk0/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->getAnalyticsHelper()Lxk0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic R(Lcom/whoop/bot/view/AiConversationFragment;)La6/g;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->j0()La6/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S(Lcom/whoop/bot/view/AiConversationFragment;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->l0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/whoop/bot/view/AiConversationFragment;)Lnl0/e;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->p0()Lnl0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U(Lp1/t2;)Lnl0/f;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->s0(Lp1/t2;)Lnl0/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->x0(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->y0(Lp1/c1;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static final synthetic X(Lcom/whoop/bot/view/AiConversationFragment;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->F0(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final Y(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final Z(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whoop/bot/view/AiConversationFragment;->g0(Landroid/os/Bundle;)Lsl0/n0;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 4

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v0

    invoke-virtual {v0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v2

    invoke-virtual {v2}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v3

    invoke-virtual {v3}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object p0

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lcom/whoop/bot/view/AiConversationFragment;)Lxk0/b;
    .locals 7

    new-instance v0, Lxk0/b;

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->p0()Lnl0/e;

    move-result-object v1

    invoke-virtual {v1}, Lnl0/e;->getViewState()Lec3/l;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->getAnalyticsHelper()Lxk0/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->k0()Lzr2/a;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lxk0/b;-><init>(Lec3/l;Lxk0/a;Lzr2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final c0(ZLq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/whoop/bot/view/AiConversationFragment$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/bot/view/AiConversationFragment$a;

    iget v3, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->z:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/bot/view/AiConversationFragment$a;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lcom/whoop/bot/view/AiConversationFragment$a;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->z:I

    const-string v6, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->w:Z

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez v0, :cond_4

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->n0()Lm32/a;

    move-result-object v0

    invoke-interface {v0, v6}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result v8

    :goto_1
    move v15, v8

    goto :goto_5

    :cond_4
    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->o0()Lz92/a;

    move-result-object v1

    iput-boolean v0, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->w:Z

    iput v8, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->z:I

    invoke-interface {v1, v2}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast v1, Lcom/whoop/domain/model/User;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v5, "KR"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v8, :cond_6

    const/4 v8, 0x0

    goto :goto_1

    :cond_6
    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->n0()Lm32/a;

    move-result-object v1

    invoke-interface {v1, v6}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->m0()Lm32/c;

    move-result-object v1

    iput-boolean v0, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->w:Z

    iput v7, v2, Lcom/whoop/bot/view/AiConversationFragment$a;->z:I

    invoke-interface {v1, v8, v2}, Lm32/c;->x(ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_8

    :goto_3
    return-object v4

    :cond_8
    :goto_4
    check-cast v1, Lm32/e;

    invoke-virtual {v1}, Lm32/e;->werePermissionsGranted()Z

    move-result v8

    goto :goto_1

    :goto_5
    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->p0()Lnl0/e;

    move-result-object v0

    new-instance v9, Lnl0/d$h;

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->b()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->c()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->h()Z

    move-result v14

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v16

    invoke-direct {v3}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->a()Ljava/util/Map;

    move-result-object v17

    invoke-direct/range {v9 .. v17}, Lnl0/d$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v0, v9}, Lnl0/e;->o(Lnl0/d;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic d0(Lcom/whoop/bot/view/AiConversationFragment;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment;->c0(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e0()Lml0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lml0/c;

    return-object v0
.end method

.method private final f0()Lsl0/n0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsl0/n0;

    return-object v0
.end method

.method private final g0(Landroid/os/Bundle;)Lsl0/n0;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    new-instance v1, Lsl0/n0;

    const v20, 0x3ffff

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v21}, Lsl0/n0;-><init>(Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance v2, Lsl0/n0;

    sget-object v3, Lo01/e;->Companion:Lo01/e$a;

    const-string v4, "suggestion"

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo01/e$a;->a(Ljava/lang/String;)Lo01/e;

    move-result-object v3

    const-string v4, "hint"

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    if-nez v4, :cond_1

    move-object v4, v5

    :cond_1
    const-string v6, "contextualMessage"

    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    move-object v6, v5

    :cond_2
    invoke-direct {v0, v6}, Lcom/whoop/bot/view/AiConversationFragment;->i0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "conversationIdSeed"

    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    move-object v7, v5

    :cond_3
    const-string v8, "sourcePillar"

    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_4

    move-object v8, v5

    :cond_4
    const-string v9, "sourceType"

    invoke-virtual {v1, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_5

    move-object v9, v5

    :cond_5
    const-string v10, "presetQuestion"

    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "includeInitialMessage"

    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v12

    const-string v11, "sourceId"

    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_6

    move-object v13, v5

    goto :goto_0

    :cond_6
    move-object v13, v11

    :goto_0
    const-string v11, "args"

    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v11}, Lcom/whoop/bot/view/AiConversationFragment;->E0(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const-string v11, "source"

    invoke-virtual {v1, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    move-object v15, v5

    goto :goto_1

    :cond_7
    move-object v15, v1

    :goto_1
    const v21, 0x3e110

    const/16 v22, 0x0

    move-object v5, v6

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v22}, Lsl0/n0;-><init>(Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private final getAnalyticsHelper()Lxk0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk0/a;

    return-object v0
.end method

.method private final h0()Lxk0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->L:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk0/b;

    return-object v0
.end method

.method private final i0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method private final j0()La6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La6/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    return-object v0
.end method

.method private final k0()Lzr2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    return-object v0
.end method

.method private final l0()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final m0()Lm32/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm32/c;

    return-object v0
.end method

.method private final n0()Lm32/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm32/a;

    return-object v0
.end method

.method private final o0()Lz92/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz92/a;

    return-object v0
.end method

.method private final p0()Lnl0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnl0/e;

    return-object v0
.end method

.method private static final q0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    invoke-virtual {p0}, Lg/l;->getActivityResultRegistry()Lj/j;

    move-result-object p0

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "aiConversationFragment"

    filled-new-array {p0, v0, v1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lcom/whoop/bot/view/AiConversationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 38

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_18

    invoke-direct {v0}, Lcom/whoop/bot/view/AiConversationFragment;->p0()Lnl0/e;

    move-result-object v1

    invoke-virtual {v1}, Lnl0/e;->getViewState()Lec3/l;

    move-result-object v5

    new-instance v6, Lnl0/f;

    const v30, 0xfffff

    const/16 v31, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v31}, Lnl0/f;-><init>(ILy81/e;ZZLnl0/a;Lnl0/m;Lcom/whoop/design/util/TextResource;Lnl0/i;Lfl0/k;ZLnl0/k;Lnl0/j;ZZLjava/lang/Boolean;Ljava/util/List;ZZLiz0/m;Lzk0/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x0

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v3, v6, :cond_1

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_2

    invoke-static {v8}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v7

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v7, Lbc3/c0;

    invoke-static {v3}, Lcom/whoop/bot/view/AiConversationFragment;->x0(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_3

    if-ne v11, v6, :cond_4

    :cond_3
    new-instance v11, Lcom/whoop/bot/view/AiConversationFragment$b;

    invoke-direct {v11, v0, v3, v5}, Lcom/whoop/bot/view/AiConversationFragment$b;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v11, Lc93/m;

    invoke-static {v8, v11, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_5

    if-ne v10, v6, :cond_6

    :cond_5
    new-instance v10, Lcom/whoop/bot/view/AiConversationFragment$d;

    invoke-direct {v10, v0, v3, v5}, Lcom/whoop/bot/view/AiConversationFragment$d;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v10, Lc93/m;

    invoke-static {v8, v10, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/bot/view/AiConversationFragment;->s0(Lp1/t2;)Lnl0/f;

    move-result-object v5

    invoke-direct {v0}, Lcom/whoop/bot/view/AiConversationFragment;->f0()Lsl0/n0;

    move-result-object v9

    invoke-virtual {v9}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_7

    if-ne v11, v6, :cond_8

    :cond_7
    new-instance v11, Lsl0/j0;

    const/4 v10, 0x0

    invoke-direct {v11, v0, v7, v1, v10}, Lsl0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v11, Lc93/m;

    invoke-static {v11, v8, v4}, Lsl0/p2;->h(Lc93/m;Landroidx/compose/runtime/Composer;I)Lsl0/n2;

    move-result-object v7

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_9

    if-ne v11, v6, :cond_a

    :cond_9
    new-instance v11, Lsl0/g0;

    const/4 v10, 0x1

    invoke-direct {v11, v0, v10}, Lsl0/g0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_b

    if-ne v12, v6, :cond_c

    :cond_b
    new-instance v12, Lsl0/g0;

    const/4 v10, 0x0

    invoke-direct {v12, v0, v10}, Lsl0/g0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_d

    if-ne v13, v6, :cond_e

    :cond_d
    new-instance v13, Lsl0/f0;

    const/4 v10, 0x1

    invoke-direct {v13, v0, v10}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v10, v13

    check-cast v10, Lc93/a;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_f

    if-ne v14, v6, :cond_10

    :cond_f
    new-instance v14, Lsl0/h0;

    invoke-direct {v14, v0, v1}, Lsl0/h0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)V

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v14, Lc93/m;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_11

    if-ne v15, v6, :cond_12

    :cond_11
    new-instance v15, Lsl0/a0;

    const/4 v13, 0x5

    invoke-direct {v15, v13, v0, v1}, Lsl0/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v15, Lc93/a;

    const/16 v18, 0x0

    const/16 v19, 0x580

    move-object/from16 v16, v8

    move-object v8, v7

    move-object v7, v9

    move-object v9, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v1, v6

    move-object v6, v11

    move-object v11, v14

    move-object v14, v15

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lsl0/u0;->q0(Lnl0/f;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;ZLkotlin/jvm/functions/Function3;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v16

    invoke-static {v3}, Lcom/whoop/bot/view/AiConversationFragment;->x0(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17

    const v5, -0x1a0f9d35

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget v5, Lwk0/b;->r:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v5, Lwk0/b;->o:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget v5, Lwk0/b;->p:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v9, Lwk0/b;->q:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v14

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_13

    if-ne v10, v1, :cond_14

    :cond_13
    new-instance v10, Lsl0/i0;

    const/4 v9, 0x0

    invoke-direct {v10, v0, v3, v9}, Lsl0/i0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v27, v10

    check-cast v27, Lc93/a;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_15

    if-ne v10, v1, :cond_16

    :cond_15
    new-instance v10, Lsl0/i0;

    const/4 v1, 0x1

    invoke-direct {v10, v0, v3, v1}, Lsl0/i0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v29, v10

    check-cast v29, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v1, v0, 0x3

    or-int/lit16 v1, v1, 0x6000

    shl-int/lit8 v3, v0, 0x6

    or-int/2addr v1, v3

    shl-int/lit8 v3, v0, 0x9

    or-int/2addr v1, v3

    shl-int/lit8 v0, v0, 0x1b

    or-int v34, v1, v0

    const/16 v36, 0x0

    const v37, 0xebffde1

    move-object/from16 v16, v8

    move-object v8, v5

    const/4 v5, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    invoke-static/range {v5 .. v37}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v33

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    return-object v2

    :cond_17
    const v0, -0x19ff4625

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    return-object v2

    :cond_18
    invoke-virtual {v8}, Lp1/q;->X()V

    return-object v2
.end method

.method private static final s0(Lp1/t2;)Lnl0/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lnl0/f;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnl0/f;

    return-object p0
.end method

.method private static final t0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lxk0/a$a;Z)Ll83/a0;
    .locals 1

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->getAnalyticsHelper()Lxk0/a;

    move-result-object p0

    invoke-static {p1}, Lcom/whoop/bot/view/AiConversationFragment;->s0(Lp1/t2;)Lnl0/f;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lxk0/a;->j(Ljava/lang/String;Lxk0/a$a;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->getAnalyticsHelper()Lxk0/a;

    move-result-object p0

    invoke-static {p1}, Lcom/whoop/bot/view/AiConversationFragment;->s0(Lp1/t2;)Lnl0/f;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxk0/a;->f(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/bot/view/AiConversationFragment$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/bot/view/AiConversationFragment$f;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w0(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/bot/view/AiConversationFragment$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/bot/view/AiConversationFragment$c;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x0(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->D0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/view/AiConversationFragment;->q0(Lcom/whoop/bot/view/AiConversationFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final z0(Lcom/whoop/bot/view/AiConversationFragment;Lbc3/c0;Lp1/t2;Ljava/util/List;Lsl0/q2;)Ll83/a0;
    .locals 2

    if-eqz p3, :cond_0

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->p0()Lnl0/e;

    move-result-object v0

    new-instance v1, Lnl0/d$r;

    invoke-direct {v1, p3}, Lnl0/d$r;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lnl0/e;->o(Lnl0/d;)V

    new-instance p3, Lcom/whoop/bot/view/AiConversationFragment$e;

    const/4 v0, 0x0

    invoke-direct {p3, p4, p0, p2, v0}, Lcom/whoop/bot/view/AiConversationFragment$e;-><init>(Lsl0/q2;Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {p1, v0, v0, p3, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance v0, Lhj0/r;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "AiConversationFragment"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    invoke-direct {v0, v1}, Lhj0/r;-><init>(Ltr2/n;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->m0()Lm32/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/bot/view/AiConversationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lsl0/g;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lsl0/g;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x5344dbf9

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->h0()Lxk0/b;

    move-result-object v0

    invoke-virtual {v0}, Lxk0/b;->h()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    new-instance p1, Lsl0/f0;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, Lsl0/f0;-><init>(Lcom/whoop/bot/view/AiConversationFragment;I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p2

    const-class v0, Lxk0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxk0/a;

    invoke-virtual {p1}, Lxk0/a;->p()V

    invoke-direct {p0}, Lcom/whoop/bot/view/AiConversationFragment;->h0()Lxk0/b;

    move-result-object p1

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxk0/b;->i(Lbc3/c0;)V

    return-void
.end method
