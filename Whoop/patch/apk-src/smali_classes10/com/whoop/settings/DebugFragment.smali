.class public final Lcom/whoop/settings/DebugFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J-\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008&\u0010\u0003J\u000f\u0010\'\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00080\u0010\u0003J\u000f\u00101\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00081\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00082\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00083\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00084\u0010\u0003J\u000f\u00105\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00085\u0010\u0003R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u001a\u0010K\u001a\u0008\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010J\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/settings/DebugFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Q3",
        "f4",
        "Lyh2/c;",
        "api",
        "Ljk0/d;",
        "strap",
        "Lyh2/a;",
        "type",
        "Lec3/l;",
        "",
        "S3",
        "(Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;",
        "epochMs",
        "",
        "O3",
        "(J)Ljava/lang/String;",
        "E1",
        "P3",
        "R3",
        "T3",
        "N3",
        "U3",
        "Lj02/x0;",
        "autoTrigger",
        "Y3",
        "(Lj02/x0;)V",
        "W3",
        "I3",
        "H3",
        "M3",
        "a4",
        "K3",
        "L3",
        "J3",
        "e4",
        "Lu92/d;",
        "w",
        "Lu92/d;",
        "sharedPrefs",
        "La6/g;",
        "Lf6/f;",
        "x",
        "La6/g;",
        "prefsDataStore",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "y",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljava/time/format/DateTimeFormatter;",
        "z",
        "Ljava/time/format/DateTimeFormatter;",
        "localHpsWatermarkTimeFormat",
        "",
        "Lcom/whoop/settings/b;",
        "E",
        "Ljava/util/List;",
        "categorizedItems",
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


# instance fields
.field private final E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/settings/b;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Lu92/d;

.field private final x:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final y:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final z:Ljava/time/format/DateTimeFormatter;


# direct methods
.method public constructor <init>()V
    .locals 35

    move-object/from16 v0, p0

    invoke-direct {v0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v1, Lvf3/c;

    const-string v2, "mainPrefs"

    invoke-direct {v1, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lu92/d;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu92/d;

    iput-object v1, v0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    invoke-static {v0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const-class v2, La6/g;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v5, v2, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La6/g;

    iput-object v1, v0, Lcom/whoop/settings/DebugFragment;->x:La6/g;

    invoke-static {v0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v5, v2, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object v1, v0, Lcom/whoop/settings/DebugFragment;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "yyyy-MM-dd HH:mm:ss.SSS zzz"

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    const-string v3, "withZone(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/whoop/settings/DebugFragment;->z:Ljava/time/format/DateTimeFormatter;

    new-instance v6, Lcom/whoop/settings/b;

    new-instance v2, Lea2/b;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "design showcase"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/16 v4, 0xd

    invoke-direct {v2, v0, v4}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v7, "JSON Playground"

    invoke-direct {v4, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/16 v7, 0x19

    invoke-direct {v2, v0, v7}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v7, Ll83/k;

    const-string v8, "lottie tester"

    invoke-direct {v7, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ldx2/a;

    const/16 v8, 0x1d

    invoke-direct {v2, v8}, Ldx2/a;-><init>(I)V

    new-instance v8, Ll83/k;

    const-string v9, "toggle design viewstate names debug mode"

    invoke-direct {v8, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v7, v8}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "\ud83c\udfa8 Design"

    invoke-direct {v6, v3, v2}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v7, Lcom/whoop/settings/b;

    new-instance v2, Lea2/d;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v8, Ll83/k;

    const-string v3, "feature flag settings"

    invoke-direct {v8, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v9, Ll83/k;

    const-string v3, "local service overrides \ud83d\udd27"

    invoke-direct {v9, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/e;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v10, Ll83/k;

    const-string v3, "iterable"

    invoke-direct {v10, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/e;

    const/16 v3, 0x19

    invoke-direct {v2, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v11, Ll83/k;

    const-string v3, "iterable tool"

    invoke-direct {v11, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/f;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v12, Ll83/k;

    const-string v3, "main console"

    invoke-direct {v12, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v13, Ll83/k;

    const-string v3, "Experiments \ud83e\uddea"

    invoke-direct {v13, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/e;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v14, Ll83/k;

    const-string v3, "Set fake battery level \ud83d\udd0b"

    invoke-direct {v14, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/e;

    const/16 v3, 0xc

    invoke-direct {v2, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v15, Ll83/k;

    const-string v3, "prune workmanager jobs"

    invoke-direct {v15, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/e;

    const/16 v3, 0x17

    invoke-direct {v2, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "crash immediately"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v16, v3

    filled-new-array/range {v8 .. v16}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "\ud83d\udee0\ufe0f Tools"

    invoke-direct {v7, v3, v2}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lea2/f;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "Arch V2 Playground"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/f;

    const/16 v4, 0xf

    invoke-direct {v2, v0, v4}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v8, "Dismissal Playground \ud83d\udeaa"

    invoke-direct {v4, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/16 v8, 0x8

    invoke-direct {v2, v0, v8}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v8, Ll83/k;

    const-string v9, "Targets Demo Screen \ud83c\udfaf"

    invoke-direct {v8, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "track-activity-targets"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v5, v8

    :cond_0
    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v8, Lcom/whoop/settings/b;

    const-string v2, "\ud83c\udfd7\ufe0f Arch-V2"

    invoke-direct {v8, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v9, Lcom/whoop/settings/b;

    new-instance v1, Lea2/b;

    const/16 v2, 0x9

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "Video call"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v3, 0xa

    invoke-direct {v1, v0, v3}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "Clinician In The Loop Scheduling"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v4, 0xb

    invoke-direct {v1, v0, v4}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "Health Intake"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\ud83e\ude7a CITL"

    invoke-direct {v9, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v10, Lcom/whoop/settings/b;

    new-instance v1, Lea2/b;

    const/16 v2, 0xc

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v11, Ll83/k;

    const-string v2, "Whoop BLE Pipeline V2"

    invoke-direct {v11, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0xe

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v12, Ll83/k;

    const-string v2, "whoop strap test"

    invoke-direct {v12, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0xf

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v13, Ll83/k;

    const-string v2, "lock strap \ud83d\udd12"

    invoke-direct {v13, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x10

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v14, Ll83/k;

    const-string v2, "strap sync (process now)"

    invoke-direct {v14, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x11

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v15, Ll83/k;

    const-string v2, "strap sync (standard)"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "local HPS watermarks"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v3, 0x14

    invoke-direct {v1, v0, v3}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "INIT BATTERY PACK SYNC"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v4, 0x15

    invoke-direct {v1, v0, v4}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "ABORT BATTERY PACK SYNC"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v5, 0x16

    invoke-direct {v1, v0, v5}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "INIT BATTERY UPLOAD"

    invoke-direct {v5, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x17

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "INIT STRAP SYNC"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v20, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    filled-new-array/range {v11 .. v20}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\ud83d\udce1 Connectivity"

    invoke-direct {v10, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v11, Lcom/whoop/settings/b;

    new-instance v1, Lea2/b;

    const/16 v2, 0x18

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v12, Ll83/k;

    const-string v2, "ACTIVATION"

    invoke-direct {v12, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x1a

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v13, Ll83/k;

    const-string v2, "UPCYCLE"

    invoke-direct {v13, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x1b

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v14, Ll83/k;

    const-string v2, "NATIVE FAMILY PLAN"

    invoke-direct {v14, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/b;

    const/16 v2, 0x1c

    invoke-direct {v1, v0, v2}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v15, Ll83/k;

    const-string v2, "REACTIVATION UPSELL"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "GIFT MEMBERSHIP"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "Gifted"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v4, 0x2

    invoke-direct {v1, v0, v4}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "Gifting AL"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v5, 0x3

    invoke-direct {v1, v0, v5}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "Universal Checkout"

    invoke-direct {v5, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "Universal Checkout - Shipping Info Testing"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v3, 0x5

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v20, v2

    const-string v2, "Order Confirmation"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "LimitedTimeOffer"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/4 v3, 0x7

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v22, v2

    const-string v2, "RAF Receiver \ud83e\udd1d"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v23, v3

    const-string v3, "Advanced Labs Join"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v3, 0xa

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v24, v2

    const-string v2, "Advanced Labs Management"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0xb

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v25, v3

    const-string v3, "Marketing Consent"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v3, 0xc

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v26, v2

    const-string v2, "whoopshare"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0xd

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v27, v3

    const-string v3, "Payment V2"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v3, 0xe

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v28, v2

    const-string v2, "Native Shop"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0xf

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v29, v3

    const-string v3, "Buy Now"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v3, 0x10

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v30, v2

    const-string v2, "Universal Checkout - Auto-open Shipping Address"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0x11

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v31, v3

    const-string v3, "Universal Checkout - Auto-open Payment Method"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v32, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    filled-new-array/range {v12 .. v32}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\ud83d\udcc8 Growth"

    invoke-direct {v11, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v12, Lcom/whoop/settings/b;

    new-instance v1, Lea2/d;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "AI Insights"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v3, 0x15

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "AI Chat Talk/Text Card"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v4, 0x16

    invoke-direct {v1, v0, v4}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "AI Chat Q&A Form Widget"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v5, 0x17

    invoke-direct {v1, v0, v5}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    const-string v13, "AI Chat Journal-Entry Widget"

    invoke-direct {v5, v13, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v13, 0x18

    invoke-direct {v1, v0, v13}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v13, Ll83/k;

    const-string v14, "Coach Auto-Pop drawer_presentation tester"

    invoke-direct {v13, v14, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5, v13}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\ud83e\udd16 AI"

    invoke-direct {v12, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v13, Lcom/whoop/settings/b;

    new-instance v1, Lea2/d;

    const/16 v2, 0x19

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v14, Ll83/k;

    const-string v2, "Motion Tracking Sandbox"

    invoke-direct {v14, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0x1a

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v15, Ll83/k;

    const-string v2, "hub and spoke"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v2, 0x1b

    invoke-direct {v1, v0, v2}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "Challenge Details"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v3, 0x1c

    invoke-direct {v1, v0, v3}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "Achievements"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/d;

    const/16 v4, 0x1d

    invoke-direct {v1, v0, v4}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "clear journal settings"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/4 v5, 0x2

    invoke-direct {v1, v0, v5}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "Year in Review 2025"

    invoke-direct {v5, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "Action Plan"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/4 v3, 0x4

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v20, v2

    const-string v2, "SMS Setup"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "SMS Settings"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v22, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    filled-new-array/range {v14 .. v22}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\u26a1 Core"

    invoke-direct {v13, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v14, Lcom/whoop/settings/b;

    new-instance v1, Lea2/e;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v15, Ll83/k;

    const-string v2, "Day-0 Personalization Chat \ud83d\udcac"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/4 v2, 0x7

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "Onboarding Stories Tester \ud83d\udcda"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0x8

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "Feature Education Tester \ud83c\udf93"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v4, 0x9

    invoke-direct {v1, v0, v4}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "Onboarding Status Debug \ud83d\udcc1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v5, 0xa

    invoke-direct {v1, v0, v5}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "sage onboarding"

    invoke-direct {v5, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v2, 0xb

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "Password Reset Screen \ud83d\udd10"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0xe

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v20, v2

    const-string v2, "clear new home onboarding settings"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v2, 0xf

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "clear fab onboarding settings"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0x10

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v22, v2

    const-string v2, "reset transition overlay"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v2, 0x11

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v23, v3

    const-string v3, "reset All Day Zero Tasks"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0x12

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v24, v2

    const-string v2, "reset All Day Zero Animations"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v25, v3

    const-string v3, "Reset IS_FIRST_APP_LAUNCH local flag"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v26, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    filled-new-array/range {v15 .. v26}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\ud83d\udcda Onboarding"

    invoke-direct {v14, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v15, Lcom/whoop/settings/b;

    new-instance v1, Lea2/e;

    const/16 v2, 0x14

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    const-string v3, "Reconfirm Labs"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0x15

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "amoeba"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v4, 0x16

    invoke-direct {v1, v0, v4}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "sage"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v5, 0x18

    invoke-direct {v1, v0, v5}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "stress monitor"

    invoke-direct {v5, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v2, 0x1a

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "healthspan"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0x1b

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v20, v2

    const-string v2, "Log Symptoms"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v2, 0x1c

    invoke-direct {v1, v0, v2}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "Sanguine"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/e;

    const/16 v3, 0x1d

    invoke-direct {v1, v0, v3}, Lea2/e;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v22, v2

    const-string v2, "Composable Health Monitor"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v23, v3

    const-string v3, "Scheduling Form"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v24, v2

    const-string v2, "Scheduling Step (Overview)"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v25, v3

    const-string v3, "Schedule Primer"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/4 v3, 0x3

    invoke-direct {v1, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v26, v2

    const-string v2, "Advanced Labs"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v27, v3

    const-string v3, "Biomarker Summary"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/4 v3, 0x6

    invoke-direct {v1, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v28, v2

    const-string v2, "Biomarker Details"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v29, v3

    const-string v3, "All Recordings"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/16 v3, 0x9

    invoke-direct {v1, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v30, v2

    const-string v2, "Test Results"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/16 v2, 0xa

    invoke-direct {v1, v0, v2}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v31, v3

    const-string v3, "Test History"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/16 v3, 0xb

    invoke-direct {v1, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v32, v2

    const-string v2, "Hormonal Context"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lea2/f;

    const/16 v2, 0xc

    invoke-direct {v1, v0, v2}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v2, Ll83/k;

    move-object/from16 v33, v3

    const-string v3, "Omron Auth"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v34, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    filled-new-array/range {v16 .. v34}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "\u2764\ufe0f Health"

    invoke-direct {v15, v2, v1}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v1, Lcom/whoop/settings/b;

    new-instance v2, Lea2/f;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    const-string v4, "MFA Setup"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/f;

    const/16 v4, 0xe

    invoke-direct {v2, v0, v4}, Lea2/f;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "Multi Consent (External Upload)"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/4 v5, 0x0

    invoke-direct {v2, v0, v5}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v5, Ll83/k;

    move-object/from16 v16, v3

    const-string v3, "Multi Consent (Galleri Scheduling)"

    invoke-direct {v5, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v17, v4

    const-string v4, "video"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/4 v4, 0x2

    invoke-direct {v2, v0, v4}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    move-object/from16 v19, v3

    const-string v3, "Template Fragment"

    invoke-direct {v4, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/b;

    const/16 v3, 0x1d

    invoke-direct {v2, v0, v3}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v3, Ll83/k;

    move-object/from16 v20, v4

    const-string v4, "Profile Template"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lea2/d;

    const/16 v4, 0x9

    invoke-direct {v2, v0, v4}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "Invoke app update telemetry"

    invoke-direct {v4, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v22, v4

    move-object/from16 v18, v5

    filled-new-array/range {v16 .. v22}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "\ud83d\udd27 Platform"

    invoke-direct {v1, v3, v2}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lcom/whoop/settings/b;

    new-instance v3, Lea2/d;

    const/16 v4, 0x14

    invoke-direct {v3, v0, v4}, Lea2/d;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance v4, Ll83/k;

    const-string v5, "push notifications"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "\ud83d\udd14 Notifications"

    invoke-direct {v2, v4, v3}, Lcom/whoop/settings/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    filled-new-array/range {v6 .. v17}, [Lcom/whoop/settings/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/whoop/settings/DebugFragment;->E:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->D3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->z3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->O1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final A2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/paymentMethodManagement"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final A3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/testHistoryFragment"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->I2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->p3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->J2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final B2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/nativeStore?source=debug"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/hormonalContext?testId=841dc044-abec-4578-8e54-857b674078bc"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->K1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->f2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Y2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final C2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->U3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/omronAuthFragment?source=debug"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->w2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->d4(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->K2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    sget-object v0, Lj02/x0;->SHIPPING_ADDRESS:Lj02/x0;

    invoke-direct {p0, v0}, Lcom/whoop/settings/DebugFragment;->Y3(Lj02/x0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/mfasetupfragment?source="

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->p2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/settings/DebugFragment;->i2()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private final E1()V
    .locals 5

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ly42/j;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly42/j;

    invoke-virtual {v0}, Ly42/j;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly42/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "No connected puffin found"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    const-class v4, Lbc3/c0;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    new-instance v2, Lcom/whoop/settings/DebugFragment$a;

    invoke-direct {v2, v0, v3}, Lcom/whoop/settings/DebugFragment$a;-><init>(Ly42/a;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v3, v3, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final E2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/debug/localServiceOverrides"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/multiConsentFragment?consentAction=EXTERNAL_UPLOAD"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->o2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->N2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F1(Lcom/whoop/settings/DebugFragment;J)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/settings/DebugFragment;->O3(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final F2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    sget-object v0, Lj02/x0;->PAYMENT_METHOD:Lj02/x0;

    invoke-direct {p0, v0}, Lcom/whoop/settings/DebugFragment;->Y3(Lj02/x0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/multiConsentFragment?consentAction=GALLERI_SCHEDULING"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->m2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->I1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G1(Lcom/whoop/settings/DebugFragment;)La6/g;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/DebugFragment;->x:La6/g;

    return-object p0
.end method

.method private static final G2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/aiInsights?sourceId=2a8ecc57-d6ee-4661-91f3-373d9c6badc1&sourceContextType=ACTIVITY_RECOMMENDATION"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->a4()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->R1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Z1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H1(Lcom/whoop/settings/DebugFragment;Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/settings/DebugFragment;->S3(Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private static final H2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->b()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToAiTalkTextCardDebug(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final H3()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "CHARGE_BATTERY_ONBOARDING_ANIMATED"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "PLAN_MY_SLEEP_ANIMATED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "START_ACTIVITY_ANIMATED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "WHOOP_COACH_ONBOARDING_ANIMATED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "ARRHYTHMIA_FEATURE_ANIMATED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic I(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->r2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->P2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final I1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->e()Lcom/whoop/settings/c$a;

    move-result-object v0

    const-string v1, "actionDebugToDesignShowcase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->l()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToQnaFormDebug(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final I3()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "CHARGE_BATTERY_ONBOARDING_COMPLETED"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "PLAN_MY_SLEEP_COMPLETED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "START_ACTIVITY_COMPLETED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "WHOOP_COACH_ONBOARDING_COMPLETED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "ARRHYTHMIA_FEATURE_COMPLETED"

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/DebugFragment$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/settings/DebugFragment$c;-><init>(Lcom/whoop/settings/DebugFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic J(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->w3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->d2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final J1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/jsonplayground"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->a()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToAiChatJournalEntryWidgetDebug(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final J3()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "HasSeenFabOnboarding"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic K(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->n3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->l3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final K1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/batteryDebug"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->m()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToWakeUpAutopopHeightTester(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final K3()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "HasJournalBeenSeenForToday"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lu92/d;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public static synthetic L(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->W1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->U1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final L1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Adding fragment to settings_graph_redesign"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/motionTrackingSandbox"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final L3()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "HasSeenNewHomeOnboarding"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic M(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->s3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->T2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final M1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/ProfileFoundation"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/hubAndSpoke?locked=false&planName=CUSTOM&analyticsSource="

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final M3()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment;->w:Lu92/d;

    const-string v1, "HasSeenTransitionOverlay"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/DebugFragment$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/settings/DebugFragment$d;-><init>(Lcom/whoop/settings/DebugFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic N(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->r3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->a3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final N1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/DebugFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/settings/DebugFragment$b;-><init>(Lcom/whoop/settings/DebugFragment;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/challengeDetails?name=GLOBAL_STRAIN_CHALLENGE_2024"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final N3()V
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "test exception!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic O(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->e3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->t3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final O1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->k()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToPushes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/Achievements"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final O3(J)Ljava/lang/String;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-string p1, "0"

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/settings/DebugFragment;->z:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p2, p1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic P(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->j2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->f3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final P1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 4

    new-instance v0, Lvf3/c;

    const-string v1, "workManagerInstance"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v1, Lic/p0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lic/p0;

    check-cast p0, Ljc/v;

    iget-object v0, p0, Ljc/v;->b:Lic/b;

    iget-object v0, v0, Lic/b;->m:Lic/y;

    iget-object v1, p0, Ljc/v;->d:Lsc/a;

    check-cast v1, Lsc/b;

    iget-object v1, v1, Lsc/b;->a:Landroidx/room/u1;

    const-string v2, "getSerialTaskExecutor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lq80/h;

    const/16 v3, 0xc

    invoke-direct {v2, p0, v3}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    const-string p0, "CancelAllWork"

    invoke-static {v0, p0, v1, v2}, Lwb3/f;->I(Lic/y;Ljava/lang/String;Landroidx/room/u1;Lc93/a;)Lic/f0;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->h()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToIterable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final P3()V
    .locals 5

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ly42/j;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly42/j;

    invoke-virtual {v0}, Ly42/j;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly42/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "No connected puffin found"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    const-class v4, Lbc3/c0;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    new-instance v2, Lcom/whoop/settings/DebugFragment$e;

    invoke-direct {v2, v0, v3}, Lcom/whoop/settings/DebugFragment$e;-><init>(Ly42/a;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v3, v3, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic Q(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/DebugFragment;->b4(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->N1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final Q1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->N3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->K3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final Q3()V
    .locals 5

    sget-object v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;->z:Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;

    new-instance v1, Lvf3/c;

    const-string v2, "workManagerInstance"

    invoke-direct {v1, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    const-class v3, Lic/p0;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lic/p0;

    invoke-virtual {v0, v1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->a(Lic/p0;)V

    return-void
.end method

.method public static synthetic R(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->F2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->c3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final R1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/archv2playground"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/userJourneyFragment?year=2025"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final R3()V
    .locals 6

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lci2/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "No strap connected"

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v4

    const-class v5, Lyh2/c;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v4, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh2/c;

    sget-object v3, Lsj2/a$b;->a:Lsj2/a$b;

    invoke-interface {v1, v0, v3}, Lyh2/c;->a(Ljk0/d;Lsj2/a;)Lec3/f2;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Sensor HPS triggered"

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static synthetic S(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->l2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->C2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final S1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 3

    sget-object v0, Lpx0/b;->a:Lpx0/b;

    invoke-virtual {v0}, Lpx0/b;->e()V

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    sget-object v0, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;->x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$a;->b(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/actionPlanFragment?testId=821b7680-97ff-45ab-8e27-cf90593945b0"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final S3(Lyh2/c;Ljk0/d;Lyh2/a;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh2/c;",
            "Ljk0/d;",
            "Lyh2/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-interface {p1, p2, p3}, Lyh2/c;->b(Ljk0/d;Lyh2/a;)Lec3/f2;

    move-result-object p1

    new-instance p2, Lcom/whoop/settings/DebugFragment$f;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lcom/whoop/settings/DebugFragment$f;-><init>(Lec3/f2;Lq83/d;)V

    invoke-static {p2}, Lec3/v;->l(Lc93/m;)Lec3/h;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic T(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Y1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->i3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final T1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->W3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/sms_setup?source=debug"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final T3()V
    .locals 4

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v1, Lci2/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v1

    invoke-virtual {v1}, Lst0/v;->isMaverickOrGoose()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v3, Lcom/whoop/settings/DebugFragment$g;

    invoke-direct {v3, p0, v0, v2}, Lcom/whoop/settings/DebugFragment$g;-><init>(Lcom/whoop/settings/DebugFragment;Ljk0/d;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v2, v2, v3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "No Maverick/Goose strap connected"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static synthetic U(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->g2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U0(Lcom/whoop/settings/DebugFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->V3(Lcom/whoop/settings/DebugFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final U1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/videoCallFragment?call_id=cool"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/sms_settings?source=debug"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final U3()V
    .locals 13

    new-instance v0, Lea2/b;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const-class v2, Lj02/o0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    new-instance v1, Lj02/m0$i5;

    const/16 v11, 0xfe

    const/4 v12, 0x0

    const-string v2, "810114361597"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "shop"

    invoke-direct/range {v1 .. v12}, Lj02/m0$i5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method public static synthetic V(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->S2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->M1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final V1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/clinicianVideoSchedulingIntake?appointmentType=SCHEDULED_AHEAD"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/day-zero-personalization?fingerprint=CHAT_WITH_AGENTday-zero-onboarding-agent_36939096&sourceId=day-zero-onboarding-agent&sourceType=CHAT_WITH_AGENT&source=day_0_personalization&conversationSeedId=&dismissible=true"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V3(Lcom/whoop/settings/DebugFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->G2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->z2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final W1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/clinicianVideoSchedulingIntake?intakeType=HEALTH"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->d()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToDebugOnboardingStories(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final W3()V
    .locals 14

    new-instance v0, Lea2/b;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const-class v2, Lj02/o0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    new-instance v1, Lj02/m0$m1;

    new-instance v2, Lcom/whoop/navigation/models/ApiRequest;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "core-details-bff/v1/live-activity-targets/bff/demo"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method public static synthetic X(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->o3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->G3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final X1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/lottieTester"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->f()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToFeatureEducationDebug(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X3(Lcom/whoop/settings/DebugFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->t2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->q2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final Y1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/whoopBleDebug"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Y2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->j()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToOnboardingStatusDebug(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final Y3(Lj02/x0;)V
    .locals 7

    new-instance v0, Lea2/b;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const-class v2, Lj02/o0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    new-instance v1, Lj02/m0$k5;

    const-string v4, "debug"

    const/4 v5, 0x0

    const-string v2, "/commerce-service/v2/mobile/carts"

    const-string v3, "{\"cart_items\":[{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}"

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lj02/m0$k5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method public static synthetic Z(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->m3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->k3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final Z1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->n()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToWhoopStrapTest(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Z2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/sage/onboarding"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Z3(Lcom/whoop/settings/DebugFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Q2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->V2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final a2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->T3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final a3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->i()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToIterableTool(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final a4()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    const-class v2, Lcom/whoop/video/VideoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "videoUrl"

    const-string v2, "https://s3.us-west-2.amazonaws.com/videos.qa.whoop.com/outputs/Horizontal/Whoop_HorizontalTest.m3u8"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic b0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->q3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->O2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v0, Ldt0/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldt0/d;

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->SLEEP_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-interface {p0, v0}, Ldt0/d;->c(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final b3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/resetPassword?resetToken=test-token"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final b4(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lea2/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lea2/a;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    const p0, 0x6ac14a49

    invoke-static {p0, v6, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6000

    const/16 v8, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v8}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic c0(Lbc3/c2;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/DebugFragment;->g4(Lbc3/k1;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic c1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->A2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v0, Ldt0/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldt0/d;

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->IMPLICIT_UPLOAD:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-interface {p0, v0}, Ldt0/d;->c(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->L3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final c4(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    iget-object p2, p0, Lcom/whoop/settings/DebugFragment;->E:Ljava/util/List;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lea2/b;

    const/4 v0, 0x7

    invoke-direct {v1, p0, v0}, Lea2/b;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/a;

    invoke-static {p2, v1, p1, v2}, Lcom/whoop/settings/h;->w(Ljava/util/List;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic d0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->j3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->x3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->f4()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->J3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d4(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic e0(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/DebugFragment;->c4(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->L2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->P3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->M3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final e4()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Local flag reset!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/DebugFragment$h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/settings/DebugFragment$h;-><init>(Lcom/whoop/settings/DebugFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic f0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->W2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->e2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->E1()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->I3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final f4()V
    .locals 10

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lci2/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljk0/d;

    if-nez v8, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "No strap connected"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    invoke-interface {v8}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Device serial number is not available"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_2
    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v6, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v0, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v0, "Loading\u2026"

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Lm/i;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lm/i;-><init>(Landroid/content/Context;)V

    const-string v2, "Local HPS watermarks"

    invoke-virtual {v0, v2}, Lm/i;->setTitle(Ljava/lang/CharSequence;)Lm/i;

    move-result-object v0

    invoke-virtual {v0, v6}, Lm/i;->setView(Landroid/view/View;)Lm/i;

    move-result-object v0

    const v2, 0x104000a

    invoke-virtual {v0, v2, v3}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    invoke-virtual {v0}, Lm/i;->create()Lm/j;

    move-result-object v0

    const-string v2, "create(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    const-class v4, Lyh2/c;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lyh2/c;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v4, Lcom/whoop/settings/DebugFragment$i;

    const/4 v9, 0x0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/settings/DebugFragment$i;-><init>(Lcom/whoop/settings/DebugFragment;Landroid/widget/TextView;Lyh2/c;Ljk0/d;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v1, v3, v3, v4, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    new-instance v2, Lea2/c;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lea2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static synthetic g0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->B3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->H2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->Q3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->H3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g4(Lbc3/k1;Landroid/content/DialogInterface;)V
    .locals 0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static synthetic h0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->F3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->P1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->R3()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/DebugFragment;->e4()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic i0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->E2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->V1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i2()Ll83/a0;
    .locals 1

    invoke-static {}, Lm91/l;->B()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lm91/l;->D(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/reconfirmLabsFragment?source=debug&nextScreen=CHOLESTEROL"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic j0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->T1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->b3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/activation"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/amoeba"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic k0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->E3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->U2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/upcycle_landing"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/sage?date="

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic l0(Lcom/whoop/settings/DebugFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Z3(Lcom/whoop/settings/DebugFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->D2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/familyPlan?startDestination=FAMILY_PLAN_HUB"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->c()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToConsole(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic m0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->d3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->B2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/extensions?promoCode=null&isOnTrial=false&isReactivationUpsell=true"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/stress-monitor/HomeScreen"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic n0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->v2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->X2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/gifting?giftType=membership&selected_tier=PEAK"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/healthspan"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic o0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->C3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->J1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/gifted?source=debug&giftCode=MADDIEALGIFT"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/log_symptoms?source=debug&requestDate=2024-11-06"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic p0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->A3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->x2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/gifting?giftType=advanced-labs-gift&test_count=2"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/SanguineFragment"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic q0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->M2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->R2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final q2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/UniversalCheckout?path=/commerce-service/v2/mobile/carts&payload={\"cart_items\":[{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}&source=debug&cartId="

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/composableHealthMonitor"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic r0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->h3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->k2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final r2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/UniversalCheckoutDataFetch"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/schedulingFormFragment"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic s0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->L1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s1(Lcom/whoop/settings/DebugFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->X3(Lcom/whoop/settings/DebugFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final s2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/OrderConfirmation?source=debug"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/schedulingStepFragment?step=OVERVIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic t0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Q1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->Z2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final t2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {}, Lcom/whoop/settings/c;->g()Leb/p0;

    move-result-object v0

    const-string v1, "actionDebugToFeatureFlagSettings(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lor2/s;->f(Leb/p0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/schedulePrimerFragment?source=debug"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic u0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->y2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->a2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final u2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/LimitedTimeOffer"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/AdvancedLabsFragment"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic v0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->h2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->c2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final v2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/rafReceiverFragment?code=C84E81"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/biomarkerSummaryFragment"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic w0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->S1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->X1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final w2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/advanced_labs_join?source=debug&test_count=2&initially_selected_segment_id=one_time_test"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/experimentsDebug"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic x0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->u2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->u3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final x2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/advancedLabsManagement"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/biomarkerDetailsFragment?biomarkerId=ldl_cholesterol"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->b2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->n2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->y3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final y2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/MarketingConsent?source=debug"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/allRecordingsFragment?biomarkerId=ldl_cholesterol"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->g3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->s2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z1(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/DebugFragment;->v3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final z2(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/shareDebug"

    invoke-virtual {p0, v0}, Lor2/s;->h(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z3(Lcom/whoop/settings/DebugFragment;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    const-string v0, "android-app://com.whoop/testResultsFragment?testId=id"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lea2/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lea2/a;-><init>(Lcom/whoop/settings/DebugFragment;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x684fb09c

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
