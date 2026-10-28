.class public interface abstract Lcom/mapbox/common/movement/ActivityRecognitionClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008a\u0018\u00002\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0008\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/mapbox/common/movement/ActivityRecognitionClient;",
        "",
        "",
        "isPlatformActivityRecognitionAvailable",
        "()Z",
        "Ll83/a0;",
        "start",
        "()V",
        "stop",
        "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;",
        "observer",
        "addObserver",
        "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V",
        "removeObserver",
        "Observer",
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


# virtual methods
.method public abstract addObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V
.end method

.method public abstract isPlatformActivityRecognitionAvailable()Z
.end method

.method public abstract removeObserver(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
