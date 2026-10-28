.class public final enum Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "PHOTO",
        "VIDEO",
        "PHOTO_AND_VIDEO",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

.field public static final enum PHOTO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

.field public static final enum PHOTO_AND_VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

.field public static final enum VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->PHOTO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->PHOTO_AND_VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    filled-new-array {v0, v1, v2}, [Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    const/4 v1, 0x0

    const-string v2, "photo"

    const-string v3, "PHOTO"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->PHOTO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    const/4 v1, 0x1

    const-string v2, "video"

    const-string v3, "VIDEO"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    const/4 v1, 0x2

    const-string v2, "photo_and_video"

    const-string v3, "PHOTO_AND_VIDEO"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->PHOTO_AND_VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->$values()[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->$VALUES:[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;
    .locals 1

    const-class v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->$VALUES:[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->value:Ljava/lang/String;

    return-object v0
.end method
