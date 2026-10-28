.class public final Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0008H\u0017\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c\u00b8\u0006\u0000"
    }
    d2 = {
        "io/getstream/video/android/core/socket/common/parser2/MoshiVideoParserKt$lenientAdapter$1",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lqx/c0;",
        "writer",
        "value",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Ljava/lang/Object;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;",
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


# instance fields
.field public final synthetic a:Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11;->a:Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            ")",
            "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;"
        }
    .end annotation

    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    iget-object v0, p0, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11;->a:Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-virtual {v0, p1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqx/c0;",
            "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;",
            ")V"
        }
    .end annotation

    .annotation runtime Lqx/t0;
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lqx/c0;->F:Z

    iget-object v0, p0, Lio/getstream/video/android/core/socket/common/parser2/MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11;->a:Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;

    invoke-virtual {v0, p1, p2}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void
.end method
