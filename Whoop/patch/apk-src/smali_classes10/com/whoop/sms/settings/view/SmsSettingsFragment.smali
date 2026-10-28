.class public final Lcom/whoop/sms/settings/view/SmsSettingsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sms/settings/view/SmsSettingsFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/sms/settings/view/SmsSettingsFragment;",
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
        "Lqi0/d;",
        "w",
        "Ll83/h;",
        "B",
        "()Lqi0/d;",
        "navRouter",
        "x",
        "a",
        "sms_release"
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
.field private static final x:Lcom/whoop/sms/settings/view/SmsSettingsFragment$a;

.field public static final y:I


# instance fields
.field private final w:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sms/settings/view/SmsSettingsFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sms/settings/view/SmsSettingsFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->x:Lcom/whoop/sms/settings/view/SmsSettingsFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, La1/j;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, La1/j;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/sms/settings/view/SmsSettingsFragment$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/sms/settings/view/SmsSettingsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->E(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lqi0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi0/d;

    return-object v0
.end method

.method private static final C(Lcom/whoop/sms/settings/view/SmsSettingsFragment;)Luf3/a;
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

.method private static final D(Lcom/whoop/sms/settings/view/SmsSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/whoop/analytics/ScreenAnalyticEventModel;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/analytics/ScreenAnalyticEventModel;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lag2/a;

    const/4 v0, 0x0

    invoke-direct {v2, v1, v0}, Lag2/a;-><init>(Lcom/whoop/analytics/ScreenAnalyticEventModel;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/a;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v3, Lqi0/a;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lqi0/a;

    invoke-direct {p0}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->B()Lqi0/d;

    move-result-object v2

    new-instance v4, Lcom/whoop/navigation/models/ApiRequest;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-string v5, "messaging-service/v1/sms/settings/bff"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/navigation/CachePolicyModel;

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/CachePolicyModel;-><init>(ZLjava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p0, 0x30c00

    sget v0, Lqi0/d;->d:I

    or-int/2addr p0, v0

    sget v0, Lqi0/a;->d:I

    shl-int/lit8 v0, v0, 0x3

    or-int/2addr p0, v0

    sget v0, Lcom/whoop/navigation/models/ApiRequest;->$stable:I

    shl-int/lit8 v0, v0, 0x6

    or-int/2addr p0, v0

    sget v0, Lcom/whoop/navigation/CachePolicyModel;->$stable:I

    shl-int/lit8 v0, v0, 0x12

    or-int v13, p0, v0

    const/16 v14, 0x380

    move-object v8, v5

    const-string v5, "sms_settings"

    const-string v7, "sms_settings_request"

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v6, v1

    invoke-static/range {v2 .. v14}, Lui0/n;->n(Lqi0/d;Lqi0/a;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Ljava/lang/String;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/sms/settings/view/SmsSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->D(Lcom/whoop/sms/settings/view/SmsSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/sms/settings/view/SmsSettingsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->C(Lcom/whoop/sms/settings/view/SmsSettingsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, La80/c;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, La80/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x6546d2c2

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
