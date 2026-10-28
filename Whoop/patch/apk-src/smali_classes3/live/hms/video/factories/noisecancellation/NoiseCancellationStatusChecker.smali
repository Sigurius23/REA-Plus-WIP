.class public final Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0013\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0014R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000b\u00a8\u0006\u001d"
    }
    d2 = {
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/Function0;",
        "",
        "isFlagEnabled",
        "isEnabledFromTemplate",
        "<init>",
        "(Landroid/content/Context;Lc93/a;Lc93/a;)V",
        "enabledFromDashboardInternal",
        "()Z",
        "enabledFromDashboard",
        "Ljava/io/InputStream;",
        "getModelStream",
        "(Landroid/content/Context;)Ljava/io/InputStream;",
        "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;",
        "isNoiseCancellationAvailable",
        "()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;",
        "enableWebrtcNoiseSuppression",
        "Lc93/a;",
        "",
        "modelPath",
        "Ljava/lang/String;",
        "modelName",
        "libraryPresent$delegate",
        "Ll83/h;",
        "getLibraryPresent",
        "libraryPresent",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final isEnabledFromTemplate:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final isFlagEnabled:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final libraryPresent$delegate:Ll83/h;

.field private final modelName:Ljava/lang/String;

.field private final modelPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isFlagEnabled"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isEnabledFromTemplate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->isFlagEnabled:Lc93/a;

    iput-object p3, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->isEnabledFromTemplate:Lc93/a;

    const-string p2, "hms/"

    iput-object p2, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->modelPath:Ljava/lang/String;

    const-string p2, "100ms_noise_cancellation_model"

    iput-object p2, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->modelName:Ljava/lang/String;

    new-instance p2, Ll01/q;

    const/16 p3, 0x12

    invoke-direct {p2, p3, p1, p0}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->libraryPresent$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)Z
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->libraryPresent_delegate$lambda$0(Landroid/content/Context;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)Z

    move-result p0

    return p0
.end method

.method private final enabledFromDashboardInternal()Z
    .locals 2

    iget-object v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->isFlagEnabled:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->isEnabledFromTemplate:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static final libraryPresent_delegate$lambda$0(Landroid/content/Context;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)Z
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    iget-object v0, p1, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->modelPath:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    iget-object p1, p1, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->modelName:Ljava/lang/String;

    invoke-static {p0, p1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    return p1

    :cond_0
    return v0
.end method


# virtual methods
.method public final enableWebrtcNoiseSuppression()Z
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->isNoiseCancellationAvailable()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;

    move-result-object v0

    sget-object v1, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;->INSTANCE:Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final enabledFromDashboard()Z
    .locals 2

    invoke-direct {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->enabledFromDashboardInternal()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getLibraryPresent()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->libraryPresent$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getModelStream(Landroid/content/Context;)Ljava/io/InputStream;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->modelPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->modelName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    const-string v0, "open(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final isNoiseCancellationAvailable()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->getLibraryPresent()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;

    const-string v1, "Add the import for live.100ms:hms-noise-cancellation-android:$version to enable noise cancellation."

    invoke-direct {v0, v1}, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-direct {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->enabledFromDashboardInternal()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;->INSTANCE:Llive/hms/video/factories/noisecancellation/AvailabilityStatus$Available;

    return-object v0

    :cond_1
    if-nez v0, :cond_2

    new-instance v0, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;

    const-string v1, "Noise Cancellation is disabled in the 100ms dashboard. Enable it there to turn it on."

    invoke-direct {v0, v1}, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
