.class public final enum Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;",
        "",
        "queryParameterName",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getQueryParameterName",
        "()Ljava/lang/String;",
        "TOP",
        "BOTTOM",
        "RIGHT",
        "LEFT",
        "CENTER",
        "stream-chat-android-core"
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

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

.field public static final enum BOTTOM:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

.field public static final enum CENTER:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

.field public static final enum LEFT:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

.field public static final enum RIGHT:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

.field public static final enum TOP:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;


# instance fields
.field private final queryParameterName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;
    .locals 5

    sget-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->TOP:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    sget-object v1, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->BOTTOM:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    sget-object v2, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->RIGHT:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    sget-object v3, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->LEFT:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    sget-object v4, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->CENTER:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    filled-new-array {v0, v1, v2, v3, v4}, [Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    const/4 v1, 0x0

    const-string v2, "top"

    const-string v3, "TOP"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->TOP:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    new-instance v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    const/4 v1, 0x1

    const-string v2, "bottom"

    const-string v3, "BOTTOM"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->BOTTOM:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    new-instance v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    const/4 v1, 0x2

    const-string v2, "right"

    const-string v3, "RIGHT"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->RIGHT:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    new-instance v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    const/4 v1, 0x3

    const-string v2, "left"

    const-string v3, "LEFT"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->LEFT:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    new-instance v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    const/4 v1, 0x4

    const-string v2, "center"

    const-string v3, "CENTER"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->CENTER:Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    invoke-static {}, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->$values()[Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->$VALUES:[Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->queryParameterName:Ljava/lang/String;

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

    sget-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;
    .locals 1

    const-class v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->$VALUES:[Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    return-object v0
.end method


# virtual methods
.method public final getQueryParameterName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;->queryParameterName:Ljava/lang/String;

    return-object v0
.end method
