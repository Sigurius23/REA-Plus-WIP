.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;
.super Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Locked"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;",
        "durationInMs",
        "",
        "waveform",
        "",
        "",
        "<init>",
        "(ILjava/util/List;)V",
        "getDurationInMs",
        "()I",
        "getWaveform",
        "()Ljava/util/List;",
        "toString",
        "",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final durationInMs:I

.field private final waveform:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    const-string v0, "waveform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;ILjava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->copy(ILjava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/util/List;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;"
        }
    .end annotation

    const-string v0, "waveform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDurationInMs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    return v0
.end method

.method public final getWaveform()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->waveform:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->durationInMs:I

    const-string v2, ", duration="

    const-string v3, "ms)"

    const-string v4, "Recording.Locked(waveform="

    invoke-static {v0, v1, v4, v2, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
