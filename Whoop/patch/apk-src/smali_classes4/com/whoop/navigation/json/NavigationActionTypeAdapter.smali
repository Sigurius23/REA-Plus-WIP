.class public final Lcom/whoop/navigation/json/NavigationActionTypeAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/JsonSerializer;
.implements Lcom/google/gson/JsonDeserializer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/gson/JsonSerializer<",
        "Lcom/whoop/navigation/e;",
        ">;",
        "Lcom/google/gson/JsonDeserializer<",
        "Lcom/whoop/navigation/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 !2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB/\u0012\u001c\u0008\u0002\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00060\u0004\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ)\u0010\u0013\u001a\u00020\u00122\u0008\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R(\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/navigation/json/NavigationActionTypeAdapter;",
        "Lcom/google/gson/JsonSerializer;",
        "Lcom/whoop/navigation/e;",
        "Lcom/google/gson/JsonDeserializer;",
        "",
        "Lcom/whoop/navigation/FeatureSpecificAppScreen;",
        "Lj93/d;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "screenModelMap",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Ljava/util/Map;Liy1/c;)V",
        "src",
        "Ljava/lang/reflect/Type;",
        "typeOfSrc",
        "Lcom/google/gson/JsonSerializationContext;",
        "context",
        "Lcom/google/gson/JsonElement;",
        "e",
        "(Lcom/whoop/navigation/e;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;",
        "json",
        "typeOfT",
        "Lcom/google/gson/JsonDeserializationContext;",
        "c",
        "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/e;",
        "a",
        "Ljava/util/Map;",
        "b",
        "Liy1/c;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "d",
        "navigation_release"
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
.field public static final d:Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;

.field public static final e:I

.field private static final f:Lad3/c;

.field private static final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/navigation/AppScreen;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/navigation/FeatureSpecificAppScreen;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Liy1/c;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 207

    new-instance v0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->d:Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->e:I

    new-instance v2, Lkg2/e;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lkg2/e;-><init>(I)V

    sget-object v4, Lad3/c;->d:Lad3/b;

    invoke-static {v4, v2}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v2

    sput-object v2, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->f:Lad3/c;

    sget-object v2, Lcom/whoop/navigation/AppScreen$c;->w:Lcom/whoop/navigation/AppScreen$c;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v5, Lcom/whoop/navigation/AchievementsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$a;->w:Lcom/whoop/navigation/AppScreen$a;

    const-class v5, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$h4;->w:Lcom/whoop/navigation/AppScreen$h4;

    const-class v5, Lcom/whoop/navigation/OmronAuthScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v8, Ll83/k;

    invoke-direct {v8, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$b;->w:Lcom/whoop/navigation/AppScreen$b;

    const-class v5, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v9, Ll83/k;

    invoke-direct {v9, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$w1;->w:Lcom/whoop/navigation/AppScreen$w1;

    const-class v5, Lcom/whoop/navigation/DayZeroSplashScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$d;->w:Lcom/whoop/navigation/AppScreen$d;

    const-class v5, Lcom/whoop/navigation/ActivationAccountActivationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v11, Ll83/k;

    invoke-direct {v11, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$e;->w:Lcom/whoop/navigation/AppScreen$e;

    const-class v5, Lcom/whoop/navigation/ActivationAccountCreationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v12, Ll83/k;

    invoke-direct {v12, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$f;->w:Lcom/whoop/navigation/AppScreen$f;

    const-class v5, Lcom/whoop/navigation/ActivationAccountTransitionLegacyAfterActivationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v13, Ll83/k;

    invoke-direct {v13, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$g;->w:Lcom/whoop/navigation/AppScreen$g;

    const-class v5, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v14, Ll83/k;

    invoke-direct {v14, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$h;->w:Lcom/whoop/navigation/AppScreen$h;

    const-class v5, Lcom/whoop/navigation/ActivationAlAfterActivationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v15, Ll83/k;

    invoke-direct {v15, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$i;->w:Lcom/whoop/navigation/AppScreen$i;

    const-class v5, Lcom/whoop/navigation/ActivationAlPermissionsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move/from16 v16, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$j;->w:Lcom/whoop/navigation/AppScreen$j;

    const-class v5, Lcom/whoop/navigation/ActivationAlProfileScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move/from16 v17, v3

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$k;->w:Lcom/whoop/navigation/AppScreen$k;

    const-class v5, Lcom/whoop/navigation/ActivationDeviceEducationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$l;->w:Lcom/whoop/navigation/AppScreen$l;

    const-class v5, Lcom/whoop/navigation/ActivationEnterYourEmailScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v19, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$m;->w:Lcom/whoop/navigation/AppScreen$m;

    const-class v5, Lcom/whoop/navigation/ActivationEnterYourPasswordScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v20, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$n;->w:Lcom/whoop/navigation/AppScreen$n;

    const-class v5, Lcom/whoop/navigation/ActivationHwOnlyAfterActivationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v21, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$o;->w:Lcom/whoop/navigation/AppScreen$o;

    const-class v5, Lcom/whoop/navigation/ActivationHwOnlyPermissionsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v22, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$p;->w:Lcom/whoop/navigation/AppScreen$p;

    const-class v5, Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v23, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$q;->w:Lcom/whoop/navigation/AppScreen$q;

    const-class v5, Lcom/whoop/navigation/ActivationInAppJoinFlowScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v24, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$r;->w:Lcom/whoop/navigation/AppScreen$r;

    const-class v5, Lcom/whoop/navigation/ActivationMedicareAfterActivationScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v25, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$s;->w:Lcom/whoop/navigation/AppScreen$s;

    const-class v5, Lcom/whoop/navigation/ActivationMedicarePermissionsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v26, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$t;->w:Lcom/whoop/navigation/AppScreen$t;

    const-class v5, Lcom/whoop/navigation/ActivationMembershipServicesScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v27, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$u;->w:Lcom/whoop/navigation/AppScreen$u;

    const-class v5, Lcom/whoop/navigation/ActivationMfaChallengeScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v28, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$v;->w:Lcom/whoop/navigation/AppScreen$v;

    const-class v5, Lcom/whoop/navigation/ActivationPairingScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v29, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$w;->w:Lcom/whoop/navigation/AppScreen$w;

    const-class v5, Lcom/whoop/navigation/ActivationPostPairingScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v30, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$x;->w:Lcom/whoop/navigation/AppScreen$x;

    const-class v5, Lcom/whoop/navigation/ActivationStartScreenScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v31, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$y;->w:Lcom/whoop/navigation/AppScreen$y;

    const-class v5, Lcom/whoop/navigation/ActivityEditModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v32, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$z;->w:Lcom/whoop/navigation/AppScreen$z;

    const-class v5, Lcom/whoop/navigation/AddActivityModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v33, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$a0;->w:Lcom/whoop/navigation/AppScreen$a0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v34, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$b0;->w:Lcom/whoop/navigation/AppScreen$b0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsActionPlanScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v35, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$e0;->w:Lcom/whoop/navigation/AppScreen$e0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsHormonalContextScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v36, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$f0;->w:Lcom/whoop/navigation/AppScreen$f0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v37, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$g0;->w:Lcom/whoop/navigation/AppScreen$g0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v38, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$h0;->w:Lcom/whoop/navigation/AppScreen$h0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v39, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$i0;->w:Lcom/whoop/navigation/AppScreen$i0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v40, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$l0;->w:Lcom/whoop/navigation/AppScreen$l0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsPrimerScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v41, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$c0;->w:Lcom/whoop/navigation/AppScreen$c0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v42, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$d0;->w:Lcom/whoop/navigation/AppScreen$d0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsEditTestDetailsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v43, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$n0;->w:Lcom/whoop/navigation/AppScreen$n0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v44, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$o0;->w:Lcom/whoop/navigation/AppScreen$o0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v45, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$k0;->w:Lcom/whoop/navigation/AppScreen$k0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsNativeSchedulingScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v46, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$p0;->w:Lcom/whoop/navigation/AppScreen$p0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsTestHistoryScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v47, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$q0;->w:Lcom/whoop/navigation/AppScreen$q0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v48, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$r0;->w:Lcom/whoop/navigation/AppScreen$r0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v49, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$t0;->w:Lcom/whoop/navigation/AppScreen$t0;

    const-class v5, Lcom/whoop/navigation/AdvancedLabsUploadTestScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v50, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$u0;->w:Lcom/whoop/navigation/AppScreen$u0;

    const-class v5, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v51, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$v0;->w:Lcom/whoop/navigation/AppScreen$v0;

    const-class v5, Lcom/whoop/navigation/AiInsightsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v52, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$w0;->w:Lcom/whoop/navigation/AppScreen$w0;

    const-class v5, Lcom/whoop/navigation/AllBiomarkerRecordingsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v53, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$x0;->w:Lcom/whoop/navigation/AppScreen$x0;

    const-class v5, Lcom/whoop/navigation/AnnualUpsellSwitchModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v54, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$y0;->w:Lcom/whoop/navigation/AppScreen$y0;

    const-class v5, Lcom/whoop/navigation/AuthenticatedWebViewModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v55, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$z0;->w:Lcom/whoop/navigation/AppScreen$z0;

    const-class v5, Lcom/whoop/navigation/BehaviorDetailsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v56, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$a1;->w:Lcom/whoop/navigation/AppScreen$a1;

    const-class v5, Lcom/whoop/navigation/BehaviorImpactsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v57, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$b1;->w:Lcom/whoop/navigation/AppScreen$b1;

    const-class v5, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v58, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$c1;->w:Lcom/whoop/navigation/AppScreen$c1;

    const-class v5, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v59, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$j0;->w:Lcom/whoop/navigation/AppScreen$j0;

    const-class v5, Lcom/whoop/navigation/MultiConsentScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v60, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$d1;->w:Lcom/whoop/navigation/AppScreen$d1;

    const-class v5, Lcom/whoop/navigation/CardioDetailsScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v61, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$f1;->w:Lcom/whoop/navigation/AppScreen$f1;

    const-class v5, Lcom/whoop/navigation/ChallengesScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v62, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$e1;->w:Lcom/whoop/navigation/AppScreen$e1;

    const-class v5, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    move-object/from16 v63, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/navigation/AppScreen$g1;->w:Lcom/whoop/navigation/AppScreen$g1;

    const-class v5, Lcom/whoop/navigation/CheckoutScreenModel;

    move-object/from16 v64, v0

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    move-object/from16 v65, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$j1;->w:Lcom/whoop/navigation/AppScreen$j1;

    const-class v2, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v66, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$i1;->w:Lcom/whoop/navigation/AppScreen$i1;

    const-class v2, Lcom/whoop/navigation/ClinicianSchedulingConfirmationScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v67, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    const-class v2, Lcom/whoop/navigation/CoachScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v68, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$l1;->w:Lcom/whoop/navigation/AppScreen$l1;

    const-class v2, Lcom/whoop/navigation/CoachSettingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v69, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m1;->w:Lcom/whoop/navigation/AppScreen$m1;

    const-class v2, Lcom/whoop/navigation/CommunityScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v70, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$v1;->w:Lcom/whoop/navigation/AppScreen$v1;

    const-class v2, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v71, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$x1;->w:Lcom/whoop/navigation/AppScreen$x1;

    const-class v2, Lcom/whoop/navigation/DeepDiveScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v72, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$a2;->w:Lcom/whoop/navigation/AppScreen$a2;

    const-class v2, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v73, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$b2;->w:Lcom/whoop/navigation/AppScreen$b2;

    const-class v2, Lcom/whoop/navigation/EditCustomExerciseModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v74, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$d2;->w:Lcom/whoop/navigation/AppScreen$d2;

    const-class v2, Lcom/whoop/navigation/ExerciseDetailsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v75, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$y1;->w:Lcom/whoop/navigation/AppScreen$y1;

    const-class v2, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v76, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$z1;->w:Lcom/whoop/navigation/AppScreen$z1;

    const-class v2, Lcom/whoop/navigation/DownloadedFileExportScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v77, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s1;->w:Lcom/whoop/navigation/AppScreen$s1;

    const-class v2, Lcom/whoop/navigation/CustomizeJournalScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v78, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$t1;->w:Lcom/whoop/navigation/AppScreen$t1;

    const-class v2, Lcom/whoop/navigation/CustomizeOverviewModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v79, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u1;->w:Lcom/whoop/navigation/AppScreen$u1;

    const-class v2, Lcom/whoop/navigation/CyclePatternHistoryScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v80, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$i2;->w:Lcom/whoop/navigation/AppScreen$i2;

    const-class v2, Lcom/whoop/navigation/FeatureEducationModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v81, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$j2;->w:Lcom/whoop/navigation/AppScreen$j2;

    const-class v2, Lcom/whoop/navigation/FeedbackSurveyScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v82, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$k2;->w:Lcom/whoop/navigation/AppScreen$k2;

    const-class v2, Lcom/whoop/navigation/GenericScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v83, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$l2;->w:Lcom/whoop/navigation/AppScreen$l2;

    const-class v2, Lcom/whoop/navigation/GiftHubScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v84, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m2;->w:Lcom/whoop/navigation/AppScreen$m2;

    const-class v2, Lcom/whoop/navigation/GiftedScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v85, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$n2;->w:Lcom/whoop/navigation/AppScreen$n2;

    const-class v2, Lcom/whoop/navigation/GiftingScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v86, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$o2;->w:Lcom/whoop/navigation/AppScreen$o2;

    const-class v2, Lcom/whoop/navigation/HealthMonitorScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v87, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$p2;->w:Lcom/whoop/navigation/AppScreen$p2;

    const-class v2, Lcom/whoop/navigation/HealthReportScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v88, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$r2;->w:Lcom/whoop/navigation/AppScreen$r2;

    const-class v2, Lcom/whoop/navigation/HealthspanScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v89, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$q2;->w:Lcom/whoop/navigation/AppScreen$q2;

    const-class v2, Lcom/whoop/navigation/HealthTabScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v90, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s2;->w:Lcom/whoop/navigation/AppScreen$s2;

    const-class v2, Lcom/whoop/navigation/HeartScreenerModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v91, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$t2;->w:Lcom/whoop/navigation/AppScreen$t2;

    const-class v2, Lcom/whoop/navigation/HiddenMetricsModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v92, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    const-class v2, Lcom/whoop/navigation/HomeScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v93, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$v2;->w:Lcom/whoop/navigation/AppScreen$v2;

    const-class v2, Lcom/whoop/navigation/HormonalInsightsOnboardingModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v94, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$x2;->w:Lcom/whoop/navigation/AppScreen$x2;

    const-class v2, Lcom/whoop/navigation/HrSettingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v95, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$y2;->w:Lcom/whoop/navigation/AppScreen$y2;

    const-class v2, Lcom/whoop/navigation/InAppBrowserScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v96, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$z2;->w:Lcom/whoop/navigation/AppScreen$z2;

    const-class v2, Lcom/whoop/navigation/IntegrationsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v97, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$a3;->w:Lcom/whoop/navigation/AppScreen$a3;

    const-class v2, Lcom/whoop/navigation/IntegrationsDisclaimerScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v98, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$r1;->w:Lcom/whoop/navigation/AppScreen$r1;

    const-class v2, Lcom/whoop/navigation/CustomizeBottomSheetScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v99, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$e2;->w:Lcom/whoop/navigation/AppScreen$e2;

    const-class v2, Lcom/whoop/navigation/ExtensionsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v100, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$f2;->w:Lcom/whoop/navigation/AppScreen$f2;

    const-class v2, Lcom/whoop/navigation/FamilyPlanScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v101, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$g2;->w:Lcom/whoop/navigation/AppScreen$g2;

    const-class v2, Lcom/whoop/navigation/FamilyPlanHubScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v102, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$h2;->w:Lcom/whoop/navigation/AppScreen$h2;

    const-class v2, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v103, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$w2;->w:Lcom/whoop/navigation/AppScreen$w2;

    const-class v2, Lcom/whoop/navigation/HormonalInsightsSettingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v104, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$b3;->w:Lcom/whoop/navigation/AppScreen$b3;

    const-class v2, Lcom/whoop/navigation/JournalScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v105, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$d3;->w:Lcom/whoop/navigation/AppScreen$d3;

    const-class v2, Lcom/whoop/navigation/InterdayJournalScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v106, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$e3;->w:Lcom/whoop/navigation/AppScreen$e3;

    const-class v2, Lcom/whoop/navigation/LabradorAboutScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v107, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$f3;->w:Lcom/whoop/navigation/AppScreen$f3;

    const-class v2, Lcom/whoop/navigation/LabradorDetailsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v108, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$g3;->w:Lcom/whoop/navigation/AppScreen$g3;

    const-class v2, Lcom/whoop/navigation/LabradorDeviceLocationModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v109, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$h3;->w:Lcom/whoop/navigation/AppScreen$h3;

    const-class v2, Lcom/whoop/navigation/LabradorOnboardingModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v110, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    const-class v2, Lcom/whoop/navigation/LabradorReadingModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v111, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$j3;->w:Lcom/whoop/navigation/AppScreen$j3;

    const-class v2, Lcom/whoop/navigation/LabradorRegistrationModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v112, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$k3;->w:Lcom/whoop/navigation/AppScreen$k3;

    const-class v2, Lcom/whoop/navigation/LabradorResultsModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v113, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$l3;->w:Lcom/whoop/navigation/AppScreen$l3;

    const-class v2, Lcom/whoop/navigation/LanguageSettingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v114, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m3;->w:Lcom/whoop/navigation/AppScreen$m3;

    const-class v2, Lcom/whoop/navigation/LegacyProCheckoutScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v115, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$n3;->w:Lcom/whoop/navigation/AppScreen$n3;

    const-class v2, Lcom/whoop/navigation/LevelsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v116, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$o3;->w:Lcom/whoop/navigation/AppScreen$o3;

    const-class v2, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v117, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$p3;->w:Lcom/whoop/navigation/AppScreen$p3;

    const-class v2, Lcom/whoop/navigation/LinkWorkoutScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v118, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$q3;->w:Lcom/whoop/navigation/AppScreen$q3;

    const-class v2, Lcom/whoop/navigation/LogSymptomsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v119, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$r3;->w:Lcom/whoop/navigation/AppScreen$r3;

    const-class v2, Lcom/whoop/navigation/LoginScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v120, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s3;->w:Lcom/whoop/navigation/AppScreen$s3;

    const-class v2, Lcom/whoop/navigation/MarketingConsentScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v121, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$t3;->w:Lcom/whoop/navigation/AppScreen$t3;

    const-class v2, Lcom/whoop/navigation/MciLogCalendarScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v122, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u3;->w:Lcom/whoop/navigation/AppScreen$u3;

    const-class v2, Lcom/whoop/navigation/MciOverviewScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v123, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$v3;->w:Lcom/whoop/navigation/AppScreen$v3;

    const-class v2, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v124, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$w3;->w:Lcom/whoop/navigation/AppScreen$w3;

    const-class v2, Lcom/whoop/navigation/MediaFocusModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v125, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$x3;->w:Lcom/whoop/navigation/AppScreen$x3;

    const-class v2, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v126, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$y3;->w:Lcom/whoop/navigation/AppScreen$y3;

    const-class v2, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v127, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$z3;->w:Lcom/whoop/navigation/AppScreen$z3;

    const-class v2, Lcom/whoop/navigation/MembershipAndBillingScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v128, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$a4;->w:Lcom/whoop/navigation/AppScreen$a4;

    const-class v2, Lcom/whoop/navigation/MembershipManagementScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v129, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$b4;->w:Lcom/whoop/navigation/AppScreen$b4;

    const-class v2, Lcom/whoop/navigation/MenuScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v130, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$c4;->w:Lcom/whoop/navigation/AppScreen$c4;

    const-class v2, Lcom/whoop/navigation/MfaSetupScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v131, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$d4;->w:Lcom/whoop/navigation/AppScreen$d4;

    const-class v2, Lcom/whoop/navigation/MyAccountScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v132, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$e4;->w:Lcom/whoop/navigation/AppScreen$e4;

    const-class v2, Lcom/whoop/navigation/NativePlanSwitchModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v133, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    const-class v2, Lcom/whoop/navigation/NativeStoreScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v134, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$f4;->w:Lcom/whoop/navigation/AppScreen$f4;

    const-class v2, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v135, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$r4;->w:Lcom/whoop/navigation/AppScreen$r4;

    const-class v2, Lcom/whoop/navigation/ProductSizeGuideScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v136, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$i4;->w:Lcom/whoop/navigation/AppScreen$i4;

    const-class v2, Lcom/whoop/navigation/OnboardingStoryScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v137, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$j4;->w:Lcom/whoop/navigation/AppScreen$j4;

    const-class v2, Lcom/whoop/navigation/OrderConfirmationScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v138, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$k4;->w:Lcom/whoop/navigation/AppScreen$k4;

    const-class v2, Lcom/whoop/navigation/PairDeviceScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v139, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$l4;->w:Lcom/whoop/navigation/AppScreen$l4;

    const-class v2, Lcom/whoop/navigation/PasswordResetScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v140, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m4;->w:Lcom/whoop/navigation/AppScreen$m4;

    const-class v2, Lcom/whoop/navigation/PaymentMethodManagementScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v141, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$n4;->w:Lcom/whoop/navigation/AppScreen$n4;

    const-class v2, Lcom/whoop/navigation/PregnancyInsightsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v142, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$o4;->w:Lcom/whoop/navigation/AppScreen$o4;

    const-class v2, Lcom/whoop/navigation/PregnancySettingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v143, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$p4;->w:Lcom/whoop/navigation/AppScreen$p4;

    const-class v2, Lcom/whoop/navigation/PreviousPregnancyScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v144, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$q4;->w:Lcom/whoop/navigation/AppScreen$q4;

    const-class v2, Lcom/whoop/navigation/PrivacyScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v145, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$c2;->w:Lcom/whoop/navigation/AppScreen$c2;

    const-class v2, Lcom/whoop/navigation/EnterpriseProgramSettingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v146, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u4;->w:Lcom/whoop/navigation/AppScreen$u4;

    const-class v2, Lcom/whoop/navigation/RecoveryDetailsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v147, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$v4;->w:Lcom/whoop/navigation/AppScreen$v4;

    const-class v2, Lcom/whoop/navigation/ReferAFriendScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v148, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$w4;->w:Lcom/whoop/navigation/AppScreen$w4;

    const-class v2, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v149, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$x4;->w:Lcom/whoop/navigation/AppScreen$x4;

    const-class v2, Lcom/whoop/navigation/ReferAFriendReceiverScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v150, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$z4;->w:Lcom/whoop/navigation/AppScreen$z4;

    const-class v2, Lcom/whoop/navigation/ReturnsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v151, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$a5;->w:Lcom/whoop/navigation/AppScreen$a5;

    const-class v2, Lcom/whoop/navigation/SageScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v152, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$b5;->w:Lcom/whoop/navigation/AppScreen$b5;

    const-class v2, Lcom/whoop/navigation/SageManualEntryScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v153, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$c5;->w:Lcom/whoop/navigation/AppScreen$c5;

    const-class v2, Lcom/whoop/navigation/SageOnboardingScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v154, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$d5;->w:Lcom/whoop/navigation/AppScreen$d5;

    const-class v2, Lcom/whoop/navigation/SanguineWaitlistScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v155, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$e5;->w:Lcom/whoop/navigation/AppScreen$e5;

    const-class v2, Lcom/whoop/navigation/SanguineWaitlistBiomarkersScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v156, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$f5;->w:Lcom/whoop/navigation/AppScreen$f5;

    const-class v2, Lcom/whoop/navigation/SeeAllRecordingsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v157, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$g5;->w:Lcom/whoop/navigation/AppScreen$g5;

    const-class v2, Lcom/whoop/navigation/ShepherdAboutModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v158, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$h5;->w:Lcom/whoop/navigation/AppScreen$h5;

    const-class v2, Lcom/whoop/navigation/ShepherdDetailsModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v159, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$i5;->w:Lcom/whoop/navigation/AppScreen$i5;

    const-class v2, Lcom/whoop/navigation/ShepherdHistoryModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v160, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$j5;->w:Lcom/whoop/navigation/AppScreen$j5;

    const-class v2, Lcom/whoop/navigation/ShepherdOnboardingModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v161, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$k5;->w:Lcom/whoop/navigation/AppScreen$k5;

    const-class v2, Lcom/whoop/navigation/ShepherdRegistrationModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v162, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$l5;->w:Lcom/whoop/navigation/AppScreen$l5;

    const-class v2, Lcom/whoop/navigation/ShepherdSettingsModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v163, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m5;->w:Lcom/whoop/navigation/AppScreen$m5;

    const-class v2, Lcom/whoop/navigation/SleepDetailsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v164, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$n5;->w:Lcom/whoop/navigation/AppScreen$n5;

    const-class v2, Lcom/whoop/navigation/SleepPlannerScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v165, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$o5;->w:Lcom/whoop/navigation/AppScreen$o5;

    const-class v2, Lcom/whoop/navigation/SmsSetupScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v166, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$p5;->w:Lcom/whoop/navigation/AppScreen$p5;

    const-class v2, Lcom/whoop/navigation/StartActivityScreenModel;

    move-object/from16 v167, v1

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v168, v3

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$t5;->w:Lcom/whoop/navigation/AppScreen$t5;

    const-class v1, Lcom/whoop/navigation/StreakCelebrationScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v169, v3

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$r5;->w:Lcom/whoop/navigation/AppScreen$r5;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s5;->w:Lcom/whoop/navigation/AppScreen$s5;

    const-class v1, Lcom/whoop/navigation/StartActivitySportModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v170, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u5;->w:Lcom/whoop/navigation/AppScreen$u5;

    const-class v1, Lcom/whoop/navigation/StreaksExplainerModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v171, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$v5;->w:Lcom/whoop/navigation/AppScreen$v5;

    const-class v1, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v172, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$w5;->w:Lcom/whoop/navigation/AppScreen$w5;

    const-class v1, Lcom/whoop/navigation/StressInterventionModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v173, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$x5;->w:Lcom/whoop/navigation/AppScreen$x5;

    const-class v1, Lcom/whoop/navigation/StressMonitorScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v174, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$y5;->w:Lcom/whoop/navigation/AppScreen$y5;

    const-class v1, Lcom/whoop/navigation/SymptomPatternsScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v175, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$z5;->w:Lcom/whoop/navigation/AppScreen$z5;

    const-class v1, Lcom/whoop/navigation/TiltModeScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v176, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$n1;->w:Lcom/whoop/navigation/AppScreen$n1;

    const-class v1, Lcom/whoop/navigation/CommunityFollowersScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v177, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$o1;->w:Lcom/whoop/navigation/AppScreen$o1;

    const-class v1, Lcom/whoop/navigation/CommunityTeamScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v178, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$p1;->w:Lcom/whoop/navigation/AppScreen$p1;

    const-class v1, Lcom/whoop/navigation/CommunityTeamsHubScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v179, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$a6;->w:Lcom/whoop/navigation/AppScreen$a6;

    const-class v1, Lcom/whoop/navigation/TrendsScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v180, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$d6;->w:Lcom/whoop/navigation/AppScreen$d6;

    const-class v1, Lcom/whoop/navigation/UniversalCheckoutScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v181, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$h1;->w:Lcom/whoop/navigation/AppScreen$h1;

    const-class v1, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v182, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$e6;->w:Lcom/whoop/navigation/AppScreen$e6;

    const-class v1, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v183, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$f6;->w:Lcom/whoop/navigation/AppScreen$f6;

    const-class v1, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v184, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$c6;->w:Lcom/whoop/navigation/AppScreen$c6;

    const-class v1, Lcom/whoop/navigation/UniversalCartScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v185, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$b6;->w:Lcom/whoop/navigation/AppScreen$b6;

    const-class v1, Lcom/whoop/navigation/UniversalBuyNowScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v186, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lcom/whoop/navigation/AppScreen$URLScreen;

    const/4 v1, 0x1

    move-object/from16 v187, v2

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/whoop/navigation/AppScreen$URLScreen;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class v2, Lcom/whoop/navigation/URLScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move/from16 v18, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$h6;->w:Lcom/whoop/navigation/AppScreen$h6;

    const-class v2, Lcom/whoop/navigation/UpcycleLandingScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v188, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$i6;->w:Lcom/whoop/navigation/AppScreen$i6;

    const-class v2, Lcom/whoop/navigation/VideoCallScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v189, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s4;->w:Lcom/whoop/navigation/AppScreen$s4;

    const-class v2, Lcom/whoop/navigation/ProfileScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v190, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m0;->w:Lcom/whoop/navigation/AppScreen$m0;

    const-class v2, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v191, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$t4;->w:Lcom/whoop/navigation/AppScreen$t4;

    const-class v2, Lcom/whoop/navigation/ReactivationUpsellScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v192, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s0;->w:Lcom/whoop/navigation/AppScreen$s0;

    const-class v2, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v193, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$y4;->w:Lcom/whoop/navigation/AppScreen$y4;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$j6;->w:Lcom/whoop/navigation/AppScreen$j6;

    const-class v2, Lcom/whoop/navigation/WeekInReviewScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v194, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$k6;->w:Lcom/whoop/navigation/AppScreen$k6;

    const-class v2, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v195, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$n6;->w:Lcom/whoop/navigation/AppScreen$n6;

    const-class v2, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v196, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$o6;->w:Lcom/whoop/navigation/AppScreen$o6;

    const-class v2, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v197, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$p6;->w:Lcom/whoop/navigation/AppScreen$p6;

    const-class v2, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v198, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$m6;->w:Lcom/whoop/navigation/AppScreen$m6;

    const-class v2, Lcom/whoop/navigation/WeeklyPlanPresetLandingScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v199, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$l6;->w:Lcom/whoop/navigation/AppScreen$l6;

    const-class v2, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v200, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$q6;->w:Lcom/whoop/navigation/AppScreen$q6;

    const-class v2, Lcom/whoop/navigation/WhatToExpectScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v201, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$r6;->w:Lcom/whoop/navigation/AppScreen$r6;

    const-class v2, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    move-object/from16 v202, v1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$s6;->w:Lcom/whoop/navigation/AppScreen$s6;

    const-class v2, Lcom/whoop/navigation/WhoopLabsScreenModel;

    move-object/from16 v203, v1

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v204, v3

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$t6;->w:Lcom/whoop/navigation/AppScreen$t6;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$u6;->w:Lcom/whoop/navigation/AppScreen$u6;

    const-class v1, Lcom/whoop/navigation/WhoopLiveScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v205, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$v6;->w:Lcom/whoop/navigation/AppScreen$v6;

    const-class v1, Lcom/whoop/navigation/WhoopShareScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object/from16 v206, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/AppScreen$w6;->w:Lcom/whoop/navigation/AppScreen$w6;

    const-class v1, Lcom/whoop/navigation/YearInReviewScreenModel;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0xca

    new-array v0, v0, [Ll83/k;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    aput-object v7, v0, v18

    const/4 v1, 0x2

    aput-object v8, v0, v1

    const/4 v1, 0x3

    aput-object v9, v0, v1

    const/4 v1, 0x4

    aput-object v10, v0, v1

    aput-object v11, v0, v17

    const/4 v1, 0x6

    aput-object v12, v0, v1

    const/4 v1, 0x7

    aput-object v13, v0, v1

    aput-object v14, v0, v16

    const/16 v1, 0x9

    aput-object v15, v0, v1

    const/16 v1, 0xa

    aput-object v19, v0, v1

    const/16 v1, 0xb

    aput-object v168, v0, v1

    const/16 v1, 0xc

    aput-object v65, v0, v1

    const/16 v1, 0xd

    aput-object v20, v0, v1

    const/16 v1, 0xe

    aput-object v21, v0, v1

    const/16 v1, 0xf

    aput-object v22, v0, v1

    const/16 v1, 0x10

    aput-object v23, v0, v1

    const/16 v1, 0x11

    aput-object v24, v0, v1

    const/16 v1, 0x12

    aput-object v25, v0, v1

    const/16 v1, 0x13

    aput-object v26, v0, v1

    const/16 v1, 0x14

    aput-object v27, v0, v1

    const/16 v1, 0x15

    aput-object v28, v0, v1

    const/16 v1, 0x16

    aput-object v29, v0, v1

    const/16 v1, 0x17

    aput-object v30, v0, v1

    const/16 v1, 0x18

    aput-object v31, v0, v1

    const/16 v1, 0x19

    aput-object v32, v0, v1

    const/16 v1, 0x1a

    aput-object v33, v0, v1

    const/16 v1, 0x1b

    aput-object v34, v0, v1

    const/16 v1, 0x1c

    aput-object v35, v0, v1

    const/16 v1, 0x1d

    aput-object v36, v0, v1

    const/16 v1, 0x1e

    aput-object v37, v0, v1

    const/16 v1, 0x1f

    aput-object v38, v0, v1

    const/16 v1, 0x20

    aput-object v39, v0, v1

    const/16 v1, 0x21

    aput-object v40, v0, v1

    const/16 v1, 0x22

    aput-object v41, v0, v1

    const/16 v1, 0x23

    aput-object v42, v0, v1

    const/16 v1, 0x24

    aput-object v43, v0, v1

    const/16 v1, 0x25

    aput-object v44, v0, v1

    const/16 v1, 0x26

    aput-object v45, v0, v1

    const/16 v1, 0x27

    aput-object v46, v0, v1

    const/16 v1, 0x28

    aput-object v47, v0, v1

    const/16 v1, 0x29

    aput-object v48, v0, v1

    const/16 v1, 0x2a

    aput-object v49, v0, v1

    const/16 v1, 0x2b

    aput-object v50, v0, v1

    const/16 v1, 0x2c

    aput-object v51, v0, v1

    const/16 v1, 0x2d

    aput-object v52, v0, v1

    const/16 v1, 0x2e

    aput-object v53, v0, v1

    const/16 v1, 0x2f

    aput-object v54, v0, v1

    const/16 v1, 0x30

    aput-object v55, v0, v1

    const/16 v1, 0x31

    aput-object v56, v0, v1

    const/16 v1, 0x32

    aput-object v57, v0, v1

    const/16 v1, 0x33

    aput-object v58, v0, v1

    const/16 v1, 0x34

    aput-object v59, v0, v1

    const/16 v1, 0x35

    aput-object v60, v0, v1

    const/16 v1, 0x36

    aput-object v61, v0, v1

    const/16 v1, 0x37

    aput-object v62, v0, v1

    const/16 v1, 0x38

    aput-object v63, v0, v1

    const/16 v1, 0x39

    aput-object v64, v0, v1

    const/16 v1, 0x3a

    aput-object v66, v0, v1

    const/16 v1, 0x3b

    aput-object v67, v0, v1

    const/16 v1, 0x3c

    aput-object v68, v0, v1

    const/16 v1, 0x3d

    aput-object v69, v0, v1

    const/16 v1, 0x3e

    aput-object v70, v0, v1

    const/16 v1, 0x3f

    aput-object v71, v0, v1

    const/16 v1, 0x40

    aput-object v72, v0, v1

    const/16 v1, 0x41

    aput-object v73, v0, v1

    const/16 v1, 0x42

    aput-object v74, v0, v1

    const/16 v1, 0x43

    aput-object v75, v0, v1

    const/16 v1, 0x44

    aput-object v76, v0, v1

    const/16 v1, 0x45

    aput-object v77, v0, v1

    const/16 v1, 0x46

    aput-object v78, v0, v1

    const/16 v1, 0x47

    aput-object v79, v0, v1

    const/16 v1, 0x48

    aput-object v80, v0, v1

    const/16 v1, 0x49

    aput-object v81, v0, v1

    const/16 v1, 0x4a

    aput-object v82, v0, v1

    const/16 v1, 0x4b

    aput-object v83, v0, v1

    const/16 v1, 0x4c

    aput-object v84, v0, v1

    const/16 v1, 0x4d

    aput-object v85, v0, v1

    const/16 v1, 0x4e

    aput-object v86, v0, v1

    const/16 v1, 0x4f

    aput-object v87, v0, v1

    const/16 v1, 0x50

    aput-object v88, v0, v1

    const/16 v1, 0x51

    aput-object v89, v0, v1

    const/16 v1, 0x52

    aput-object v90, v0, v1

    const/16 v1, 0x53

    aput-object v91, v0, v1

    const/16 v1, 0x54

    aput-object v92, v0, v1

    const/16 v1, 0x55

    aput-object v93, v0, v1

    const/16 v1, 0x56

    aput-object v94, v0, v1

    const/16 v1, 0x57

    aput-object v95, v0, v1

    const/16 v1, 0x58

    aput-object v96, v0, v1

    const/16 v1, 0x59

    aput-object v97, v0, v1

    const/16 v1, 0x5a

    aput-object v98, v0, v1

    const/16 v1, 0x5b

    aput-object v99, v0, v1

    const/16 v1, 0x5c

    aput-object v100, v0, v1

    const/16 v1, 0x5d

    aput-object v101, v0, v1

    const/16 v1, 0x5e

    aput-object v102, v0, v1

    const/16 v1, 0x5f

    aput-object v103, v0, v1

    const/16 v1, 0x60

    aput-object v104, v0, v1

    const/16 v1, 0x61

    aput-object v105, v0, v1

    const/16 v1, 0x62

    aput-object v106, v0, v1

    const/16 v1, 0x63

    aput-object v107, v0, v1

    const/16 v1, 0x64

    aput-object v108, v0, v1

    const/16 v1, 0x65

    aput-object v109, v0, v1

    const/16 v1, 0x66

    aput-object v110, v0, v1

    const/16 v1, 0x67

    aput-object v111, v0, v1

    const/16 v1, 0x68

    aput-object v112, v0, v1

    const/16 v1, 0x69

    aput-object v113, v0, v1

    const/16 v1, 0x6a

    aput-object v114, v0, v1

    const/16 v1, 0x6b

    aput-object v115, v0, v1

    const/16 v1, 0x6c

    aput-object v116, v0, v1

    const/16 v1, 0x6d

    aput-object v117, v0, v1

    const/16 v1, 0x6e

    aput-object v118, v0, v1

    const/16 v1, 0x6f

    aput-object v119, v0, v1

    const/16 v1, 0x70

    aput-object v120, v0, v1

    const/16 v1, 0x71

    aput-object v121, v0, v1

    const/16 v1, 0x72

    aput-object v122, v0, v1

    const/16 v1, 0x73

    aput-object v123, v0, v1

    const/16 v1, 0x74

    aput-object v124, v0, v1

    const/16 v1, 0x75

    aput-object v125, v0, v1

    const/16 v1, 0x76

    aput-object v126, v0, v1

    const/16 v1, 0x77

    aput-object v127, v0, v1

    const/16 v1, 0x78

    aput-object v128, v0, v1

    const/16 v1, 0x79

    aput-object v129, v0, v1

    const/16 v1, 0x7a

    aput-object v130, v0, v1

    const/16 v1, 0x7b

    aput-object v131, v0, v1

    const/16 v1, 0x7c

    aput-object v132, v0, v1

    const/16 v1, 0x7d

    aput-object v133, v0, v1

    const/16 v1, 0x7e

    aput-object v134, v0, v1

    const/16 v1, 0x7f

    aput-object v135, v0, v1

    const/16 v1, 0x80

    aput-object v136, v0, v1

    const/16 v1, 0x81

    aput-object v137, v0, v1

    const/16 v1, 0x82

    aput-object v138, v0, v1

    const/16 v1, 0x83

    aput-object v139, v0, v1

    const/16 v1, 0x84

    aput-object v140, v0, v1

    const/16 v1, 0x85

    aput-object v141, v0, v1

    const/16 v1, 0x86

    aput-object v142, v0, v1

    const/16 v1, 0x87

    aput-object v143, v0, v1

    const/16 v1, 0x88

    aput-object v144, v0, v1

    const/16 v1, 0x89

    aput-object v145, v0, v1

    const/16 v1, 0x8a

    aput-object v146, v0, v1

    const/16 v1, 0x8b

    aput-object v147, v0, v1

    const/16 v1, 0x8c

    aput-object v148, v0, v1

    const/16 v1, 0x8d

    aput-object v149, v0, v1

    const/16 v1, 0x8e

    aput-object v150, v0, v1

    const/16 v1, 0x8f

    aput-object v151, v0, v1

    const/16 v1, 0x90

    aput-object v152, v0, v1

    const/16 v1, 0x91

    aput-object v153, v0, v1

    const/16 v1, 0x92

    aput-object v154, v0, v1

    const/16 v1, 0x93

    aput-object v155, v0, v1

    const/16 v1, 0x94

    aput-object v156, v0, v1

    const/16 v1, 0x95

    aput-object v157, v0, v1

    const/16 v1, 0x96

    aput-object v158, v0, v1

    const/16 v1, 0x97

    aput-object v159, v0, v1

    const/16 v1, 0x98

    aput-object v160, v0, v1

    const/16 v1, 0x99

    aput-object v161, v0, v1

    const/16 v1, 0x9a

    aput-object v162, v0, v1

    const/16 v1, 0x9b

    aput-object v163, v0, v1

    const/16 v1, 0x9c

    aput-object v164, v0, v1

    const/16 v1, 0x9d

    aput-object v165, v0, v1

    const/16 v1, 0x9e

    aput-object v166, v0, v1

    const/16 v1, 0x9f

    aput-object v167, v0, v1

    const/16 v1, 0xa0

    aput-object v169, v0, v1

    const/16 v1, 0xa1

    aput-object v204, v0, v1

    const/16 v1, 0xa2

    aput-object v170, v0, v1

    const/16 v1, 0xa3

    aput-object v171, v0, v1

    const/16 v1, 0xa4

    aput-object v172, v0, v1

    const/16 v1, 0xa5

    aput-object v173, v0, v1

    const/16 v1, 0xa6

    aput-object v174, v0, v1

    const/16 v1, 0xa7

    aput-object v175, v0, v1

    const/16 v1, 0xa8

    aput-object v176, v0, v1

    const/16 v1, 0xa9

    aput-object v177, v0, v1

    const/16 v1, 0xaa

    aput-object v178, v0, v1

    const/16 v1, 0xab

    aput-object v179, v0, v1

    const/16 v1, 0xac

    aput-object v180, v0, v1

    const/16 v1, 0xad

    aput-object v181, v0, v1

    const/16 v1, 0xae

    aput-object v182, v0, v1

    const/16 v1, 0xaf

    aput-object v183, v0, v1

    const/16 v1, 0xb0

    aput-object v184, v0, v1

    const/16 v1, 0xb1

    aput-object v185, v0, v1

    const/16 v1, 0xb2

    aput-object v186, v0, v1

    const/16 v1, 0xb3

    aput-object v187, v0, v1

    const/16 v1, 0xb4

    aput-object v188, v0, v1

    const/16 v1, 0xb5

    aput-object v189, v0, v1

    const/16 v1, 0xb6

    aput-object v190, v0, v1

    const/16 v1, 0xb7

    aput-object v191, v0, v1

    const/16 v1, 0xb8

    aput-object v192, v0, v1

    const/16 v1, 0xb9

    aput-object v193, v0, v1

    const/16 v1, 0xba

    aput-object v194, v0, v1

    const/16 v1, 0xbb

    aput-object v5, v0, v1

    const/16 v1, 0xbc

    aput-object v195, v0, v1

    const/16 v1, 0xbd

    aput-object v196, v0, v1

    const/16 v1, 0xbe

    aput-object v197, v0, v1

    const/16 v1, 0xbf

    aput-object v198, v0, v1

    const/16 v1, 0xc0

    aput-object v199, v0, v1

    const/16 v1, 0xc1

    aput-object v200, v0, v1

    const/16 v1, 0xc2

    aput-object v201, v0, v1

    const/16 v1, 0xc3

    aput-object v202, v0, v1

    const/16 v1, 0xc4

    aput-object v203, v0, v1

    const/16 v1, 0xc5

    aput-object v3, v0, v1

    const/16 v1, 0xc6

    aput-object v205, v0, v1

    const/16 v1, 0xc7

    aput-object v206, v0, v1

    const/16 v1, 0xc8

    aput-object v2, v0, v1

    const/16 v1, 0xc9

    aput-object v4, v0, v1

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->g:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Liy1/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/whoop/navigation/FeatureSpecificAppScreen;",
            "+",
            "Lj93/d;",
            ">;",
            "Liy1/c;",
            ")V"
        }
    .end annotation

    const-string v0, "screenModelMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->a:Ljava/util/Map;

    .line 4
    iput-object p2, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->b:Liy1/c;

    .line 5
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "NavigationActionTypeAdapter"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 6
    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 7
    sget-object p2, Liy1/f;->a:Liy1/f;

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;-><init>(Ljava/util/Map;Liy1/c;)V

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->d(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->g:Ljava/util/Map;

    return-object v0
.end method

.method private static final d(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    iput-boolean v0, p0, Lad3/g;->g:Z

    iput-boolean v0, p0, Lad3/g;->l:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public c(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/e;
    .locals 10

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeOfT"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p2

    const-string v0, "screen"

    invoke-virtual {p2, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    if-eqz p2, :cond_d

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_d

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    const-string v1, "parameters"

    invoke-virtual {v0, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    if-eqz v0, :cond_c

    sget-object v1, Lcom/whoop/navigation/AppScreen;->Companion:Lcom/whoop/navigation/AppScreen$q1;

    iget-object v2, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    invoke-virtual {v4}, Lcom/whoop/navigation/FeatureSpecificAppScreen;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p2, v3}, Lcom/whoop/navigation/AppScreen$q1;->a(Ljava/lang/String;Ljava/util/Collection;)Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1

    const-string v2, "tab"

    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    instance-of v2, p1, Lcom/google/gson/JsonObject;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Lcom/google/gson/JsonObject;

    goto :goto_1

    :cond_1
    move-object p1, v3

    :goto_1
    if-eqz p1, :cond_3

    const-string v2, "id"

    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move-object p1, v3

    :goto_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v2, Lj02/v0;

    invoke-direct {v2, p1}, Lj02/v0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    move-object v2, v3

    :goto_3
    sget-object p1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "toString(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lad3/c;->d:Lad3/b;

    invoke-virtual {p3, p1}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    sget-object p3, Lcom/whoop/navigation/exception/NavigationDeserializationException;->Companion:Lcom/whoop/navigation/exception/NavigationDeserializationException$a;

    iget-object v0, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->c:Ltr2/n;

    iget-object v1, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->b:Liy1/c;

    invoke-virtual {p3, p2, p1, v0, v1}, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;->c(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ltr2/n;Liy1/c;)Lcom/whoop/navigation/exception/NavigationDeserializationException;

    new-instance v2, Lcom/whoop/navigation/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    instance-of p1, v1, Lcom/whoop/navigation/FeatureSpecificAppScreen;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->a:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj93/d;

    if-nez p1, :cond_6

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_5
    sget-object p1, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->g:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj93/d;

    if-nez p1, :cond_6

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_6
    sget-object p2, Lcom/whoop/navigation/AppScreen$o0;->w:Lcom/whoop/navigation/AppScreen$o0;

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    new-instance p1, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    const-string p2, "step"

    invoke-virtual {v0, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_8

    :cond_7
    const-string p2, ""

    :cond_8
    const-string p3, "test_type"

    invoke-virtual {v0, p3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p3

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v3

    :cond_9
    invoke-direct {p1, p2, v3}, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    invoke-interface {p1}, Lj93/d;->getObjectInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/navigation/NavigationScreenModel;

    if-nez p2, :cond_b

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p3, v0, p1}, Lcom/google/gson/JsonDeserializationContext;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "deserialize(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/navigation/NavigationScreenModel;

    goto :goto_4

    :cond_b
    move-object p1, p2

    :goto_4
    new-instance p2, Lcom/whoop/navigation/e;

    invoke-direct {p2, v1, p1, v2}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;)V

    return-object p2

    :cond_c
    new-instance p1, Lcom/google/gson/JsonParseException;

    const-string p2, "NavigationAction is missing parameters"

    invoke-direct {p1, p2}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Lcom/google/gson/JsonParseException;

    const-string p2, "NavigationAction is missing screen_name"

    invoke-direct {p1, p2}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->c(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/e;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/whoop/navigation/e;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
    .locals 3

    const-string v0, "typeOfSrc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;

    const-string p2, "INSTANCE"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p2, Lcom/google/gson/JsonObject;

    invoke-direct {p2}, Lcom/google/gson/JsonObject;-><init>()V

    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    const-string v1, "screen"

    invoke-virtual {p2, v1, v0}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    if-eqz v1, :cond_1

    new-instance p3, Lcom/google/gson/JsonObject;

    invoke-direct {p3}, Lcom/google/gson/JsonObject;-><init>()V

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    check-cast v0, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;->getStepType()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    const-string v2, "step"

    invoke-virtual {p3, v2, v1}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    invoke-virtual {v0}, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;->getTestType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v1, v0}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    const-string v0, "test_type"

    invoke-virtual {p3, v0, v1}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/whoop/navigation/EditCustomExerciseModel;

    if-eqz v1, :cond_2

    sget-object p3, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->f:Lad3/c;

    sget-object v1, Lcom/whoop/navigation/EditCustomExerciseModel;->Companion:Lcom/whoop/navigation/EditCustomExerciseModel$a;

    invoke-virtual {v1}, Lcom/whoop/navigation/EditCustomExerciseModel$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {p3, v1, v0}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p3

    const-string v0, "getAsJsonObject(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {p3, v0}, Lcom/google/gson/JsonSerializationContext;->serialize(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object p3

    const-string v0, "serialize(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    :goto_0
    const-string v0, "parameters"

    invoke-virtual {p2, v0, p3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->e()Lj02/v0;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p3, Lcom/google/gson/JsonObject;

    invoke-direct {p3}, Lcom/google/gson/JsonObject;-><init>()V

    new-instance v0, Lcom/google/gson/JsonPrimitive;

    invoke-virtual {p1}, Lj02/v0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    const-string p1, "id"

    invoke-virtual {p3, p1, v0}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string p1, "tab"

    invoke-virtual {p2, p1, p3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    :cond_4
    return-object p2
.end method

.method public bridge synthetic serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
    .locals 0

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->e(Lcom/whoop/navigation/e;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;

    move-result-object p1

    return-object p1
.end method
