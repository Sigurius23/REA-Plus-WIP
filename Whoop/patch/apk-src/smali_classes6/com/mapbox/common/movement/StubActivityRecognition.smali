.class public final Lcom/mapbox/common/movement/StubActivityRecognition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/movement/ActivityRecognitionClient;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/mapbox/common/movement/StubActivityRecognition;",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient;",
        "<init>",
        "()V",
        "",
        "isPlatformActivityRecognitionAvailable",
        "()Z",
        "Ll83/a0;",
        "start",
        "stop",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;",
        "observer",
        "addObserver",
        "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V",
        "removeObserver",
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


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/movement/StubActivityRecognition;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/movement/StubActivityRecognition;

    invoke-direct {v0}, Lcom/mapbox/common/movement/StubActivityRecognition;-><init>()V

    sput-object v0, Lcom/mapbox/common/movement/StubActivityRecognition;->INSTANCE:Lcom/mapbox/common/movement/StubActivityRecognition;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public isPlatformActivityRecognitionAvailable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public removeObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
