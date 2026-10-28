.class public final Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PushProviderAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;",
        "<init>",
        "()V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;",
        "Lqx/c0;",
        "writer",
        "value",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;)V",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;
    .locals 1
    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    sget-object v0, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;->Companion:Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$Companion;->fromString(Ljava/lang/String;)Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;)V
    .locals 1
    .annotation runtime Lqx/t0;
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;->getValue()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lqx/c0;->F0(Ljava/lang/String;)Lqx/c0;

    return-void
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;

    invoke-virtual {p0, p1, p2}, Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider$PushProviderAdapter;->toJson(Lqx/c0;Lio/getstream/android/video/generated/models/CreateDeviceRequest$PushProvider;)V

    return-void
.end method
