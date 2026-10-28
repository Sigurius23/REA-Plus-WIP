.class public final Lio/getstream/chat/android/ui/common/internal/ColorUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "getColorList",
        "Landroid/content/res/ColorStateList;",
        "normalColor",
        "",
        "selectedColor",
        "disabledColor",
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
.method public static final getColorList(III)Landroid/content/res/ColorStateList;
    .locals 4

    new-instance v0, Landroid/content/res/ColorStateList;

    const v1, -0x10100a1

    const v2, 0x101009e

    filled-new-array {v2, v1}, [I

    move-result-object v1

    const v3, 0x10100a1

    filled-new-array {v2, v3}, [I

    move-result-object v2

    const v3, -0x101009e

    filled-new-array {v3}, [I

    move-result-object v3

    filled-new-array {v1, v2, v3}, [[I

    move-result-object v1

    filled-new-array {p0, p1, p2}, [I

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v0
.end method
