.class public final Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/movement/GoogleActivityRecognition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J-\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\u0008\u0000\u0010\u0011*\u0008\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087T\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u0012\u0004\u0008\u001d\u0010\u0003R!\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R(\u0010%\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008%\u0010&\u0012\u0004\u0008*\u0010\u0003\u001a\u0004\u0008\'\u0010\u0019\"\u0004\u0008(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010.\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00100\u001a\u00020\u00138\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00080\u0010\u001cR\u0014\u00101\u001a\u00020\u00138\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00081\u0010\u001cR\u0014\u00102\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00082\u0010/\u00a8\u00063"
    }
    d2 = {
        "Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;",
        "",
        "<init>",
        "()V",
        "Ltp/e;",
        "Lcom/mapbox/common/MovementModeProvider;",
        "provider",
        "Lcom/mapbox/common/MovementInfo;",
        "toMovementInfo",
        "(Ltp/e;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;",
        "Lcom/google/android/gms/location/ActivityRecognitionResult;",
        "(Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;",
        "",
        "activityType",
        "Lcom/mapbox/common/MovementMode;",
        "fromGmsType",
        "(I)Lcom/mapbox/common/MovementMode;",
        "T",
        "Lcom/google/android/gms/tasks/Task;",
        "",
        "name",
        "withLogs",
        "(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;",
        "",
        "isAvailable$common_release",
        "()Z",
        "isAvailable",
        "ACTIVITY_UPDATES_ACTION",
        "Ljava/lang/String;",
        "getACTIVITY_UPDATES_ACTION$annotations",
        "",
        "Ltp/b;",
        "TRANSITION_API_MONITORING_TYPES$delegate",
        "Ll83/h;",
        "getTRANSITION_API_MONITORING_TYPES",
        "()Ljava/util/List;",
        "TRANSITION_API_MONITORING_TYPES",
        "googlePlayActivityRecognitionBundled",
        "Z",
        "getGooglePlayActivityRecognitionBundled$common_release",
        "setGooglePlayActivityRecognitionBundled$common_release",
        "(Z)V",
        "getGooglePlayActivityRecognitionBundled$common_release$annotations",
        "",
        "ACTIVITY_DETECTION_INTERVAL_MILLIS",
        "J",
        "ACTIVITY_UPDATES_CODE",
        "I",
        "GOOGLE_ACTIVITY_RECOGNITION_CLIENT",
        "TAG",
        "TRANSITION_API_CONFIDENCE_SCORE",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->withLogs$lambda$7(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final synthetic access$getTRANSITION_API_MONITORING_TYPES(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->getTRANSITION_API_MONITORING_TYPES()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$withLogs(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->withLogs(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->withLogs$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final fromGmsType(I)Lcom/mapbox/common/MovementMode;
    .locals 1

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p1, Lcom/mapbox/common/MovementMode;->RUNNING:Lcom/mapbox/common/MovementMode;

    return-object p1

    :cond_1
    sget-object p1, Lcom/mapbox/common/MovementMode;->WALKING:Lcom/mapbox/common/MovementMode;

    return-object p1

    :cond_2
    sget-object p1, Lcom/mapbox/common/MovementMode;->STATIONARY:Lcom/mapbox/common/MovementMode;

    return-object p1

    :cond_3
    sget-object p1, Lcom/mapbox/common/MovementMode;->ON_FOOT:Lcom/mapbox/common/MovementMode;

    return-object p1

    :cond_4
    sget-object p1, Lcom/mapbox/common/MovementMode;->CYCLING:Lcom/mapbox/common/MovementMode;

    return-object p1

    :cond_5
    sget-object p1, Lcom/mapbox/common/MovementMode;->IN_VEHICLE:Lcom/mapbox/common/MovementMode;

    return-object p1
.end method

.method public static synthetic getACTIVITY_UPDATES_ACTION$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getGooglePlayActivityRecognitionBundled$common_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getTRANSITION_API_MONITORING_TYPES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltp/b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->access$getTRANSITION_API_MONITORING_TYPES$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final toMovementInfo(Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/location/ActivityRecognitionResult;->w:Ljava/util/ArrayList;

    if-eqz p1, :cond_5

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 4
    check-cast v2, Ltp/f;

    .line 5
    sget-object v3, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    .line 6
    iget v4, v2, Ltp/f;->w:I

    const/16 v5, 0x16

    if-gt v4, v5, :cond_1

    if-gez v4, :cond_2

    :cond_1
    const/4 v4, 0x4

    .line 7
    :cond_2
    invoke-direct {v3, v4}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->fromGmsType(I)Lcom/mapbox/common/MovementMode;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 8
    iget v2, v2, Ltp/f;->x:I

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 10
    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    move-object v4, v0

    :goto_1
    if-eqz v4, :cond_0

    .line 11
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_4
    new-instance p1, Lcom/mapbox/common/MovementInfo;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-direct {p1, v0, p2}, Lcom/mapbox/common/MovementInfo;-><init>(Ljava/util/HashMap;Lcom/mapbox/common/MovementModeProvider;)V

    return-object p1

    :cond_5
    return-object v0
.end method

.method private final toMovementInfo(Ltp/e;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 13
    iget-object p1, p1, Ltp/e;->w:Ljava/util/List;

    if-eqz p1, :cond_4

    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 17
    check-cast v2, Ltp/c;

    .line 18
    iget v3, v2, Ltp/c;->x:I

    if-eqz v3, :cond_2

    :cond_1
    move-object v4, v0

    goto :goto_1

    .line 19
    :cond_2
    sget-object v3, Lcom/mapbox/common/movement/GoogleActivityRecognition;->Companion:Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;

    .line 20
    iget v2, v2, Ltp/c;->w:I

    .line 21
    invoke-direct {v3, v2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->fromGmsType(I)Lcom/mapbox/common/MovementMode;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0x55

    .line 22
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 23
    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    if-eqz v4, :cond_0

    .line 24
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_3
    new-instance p1, Lcom/mapbox/common/MovementInfo;

    new-instance v0, Ljava/util/HashMap;

    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-direct {p1, v0, p2}, Lcom/mapbox/common/MovementInfo;-><init>(Ljava/util/HashMap;Lcom/mapbox/common/MovementModeProvider;)V

    return-object p1

    :cond_4
    return-object v0
.end method

.method public static synthetic toMovementInfo$default(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;ILjava/lang/Object;)Lcom/mapbox/common/MovementInfo;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 3
    sget-object p2, Lcom/mapbox/common/MovementModeProvider;->SYSTEM:Lcom/mapbox/common/MovementModeProvider;

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->toMovementInfo(Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toMovementInfo$default(Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;Ltp/e;Lcom/mapbox/common/MovementModeProvider;ILjava/lang/Object;)Lcom/mapbox/common/MovementInfo;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lcom/mapbox/common/MovementModeProvider;->SYSTEM:Lcom/mapbox/common/MovementModeProvider;

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->toMovementInfo(Ltp/e;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;

    move-result-object p0

    return-object p0
.end method

.method private final withLogs(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion$withLogs$1;

    invoke-direct {v0, p2}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion$withLogs$1;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/common/location/a;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lcom/mapbox/common/movement/a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/mapbox/common/movement/a;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "name: String): Task<T> {\u2026lure: $it\")\n            }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final withLogs$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final withLogs$lambda$7(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "$name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " failure: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ActivityRecognitionObserver"

    invoke-virtual {v0, p1, p0}, Lcom/mapbox/common/MapboxCommonLogger;->logD$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getGooglePlayActivityRecognitionBundled$common_release()Z
    .locals 1

    invoke-static {}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->access$getGooglePlayActivityRecognitionBundled$cp()Z

    move-result v0

    return v0
.end method

.method public final isAvailable$common_release()Z
    .locals 1

    invoke-static {}, Lcom/mapbox/common/location/LocationServiceUtils;->getGooglePlayServicesBundled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->getGooglePlayActivityRecognitionBundled$common_release()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;->Companion:Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;->getAvailable$common_release()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/mapbox/common/location/GoogleDeviceLocationProviderKt;->getGooglePlayServicesHelper()Lcom/mapbox/common/location/GooglePlayServicesHelper;

    move-result-object v0

    invoke-interface {v0}, Lcom/mapbox/common/location/GooglePlayServicesHelper;->isGooglePlayServicesReady()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setGooglePlayActivityRecognitionBundled$common_release(Z)V
    .locals 0

    invoke-static {p1}, Lcom/mapbox/common/movement/GoogleActivityRecognition;->access$setGooglePlayActivityRecognitionBundled$cp(Z)V

    return-void
.end method
