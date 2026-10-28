.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "NULL_DURATION",
        "",
        "progressToDecimal",
        "",
        "progress",
        "totalDuration",
        "(ILjava/lang/Float;)I",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final NULL_DURATION:F


# direct methods
.method public static final synthetic access$progressToDecimal(ILjava/lang/Float;)I
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/AudioRecordAttachmentPreviewFactoryKt;->progressToDecimal(ILjava/lang/Float;)I

    move-result p0

    return p0
.end method

.method private static final progressToDecimal(ILjava/lang/Float;)I
    .locals 0

    int-to-float p0, p0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    mul-float/2addr p0, p1

    const/16 p1, 0x64

    int-to-float p1, p1

    div-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method
