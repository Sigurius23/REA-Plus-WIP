.class public final Lio/getstream/chat/android/ui/utils/extensions/IntKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\u000c\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0007\u001a\u0008\u0010\u0004\u001a\u00020\u0005H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "dpToPx",
        "",
        "dpToPxPrecise",
        "",
        "displayMetrics",
        "Landroid/util/DisplayMetrics;",
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


# direct methods
.method public static final displayMetrics()Landroid/util/DisplayMetrics;
    .locals 2

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const-string v1, "getDisplayMetrics(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final dpToPx(I)I
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result p0

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p0

    return p0
.end method

.method public static final dpToPxPrecise(I)F
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    int-to-float p0, p0

    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p0, v0

    return p0
.end method
