.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J@\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0008J,\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;",
        "",
        "<init>",
        "()V",
        "defaultFactoriesWithoutPermissions",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;",
        "mediaAttachmentsTabEnabled",
        "",
        "visualMediaAllowMultiple",
        "visualMediaType",
        "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;",
        "fileAttachmentsTabEnabled",
        "cameraAttachmentsTabEnabled",
        "pollAttachmentsTabEnabled",
        "defaultFactories",
        "stream-chat-android-ui-components_release"
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic defaultFactoriesWithoutPermissions$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZILjava/lang/Object;)Ljava/util/List;
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const/4 p2, 0x0

    :cond_0
    move v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    sget-object p3, Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;->IMAGE_AND_VIDEO:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    :cond_1
    move-object v0, p0

    move v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactories;->defaultFactoriesWithoutPermissions(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final defaultFactories(ZZZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/AttachmentsPickerMediaTabFactory;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p2, :cond_1

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/AttachmentsPickerFileTabFactory;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-eqz p3, :cond_2

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/AttachmentsPickerCameraTabFactory;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    :cond_2
    move-object p3, v0

    :goto_2
    if-eqz p4, :cond_3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/poll/AttachmentsPickerPollTabFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_3
    const/4 p4, 0x4

    new-array p4, p4, [Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;

    const/4 v1, 0x0

    aput-object p1, p4, v1

    const/4 p1, 0x1

    aput-object p2, p4, p1

    const/4 p1, 0x2

    aput-object p3, p4, p1

    const/4 p1, 0x3

    aput-object v0, p4, p1

    invoke-static {p4}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final defaultFactoriesWithoutPermissions(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;",
            "ZZZ)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;",
            ">;"
        }
    .end annotation

    const-string v0, "visualMediaType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/AttachmentsPickerSystemTabFactory;-><init>(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
