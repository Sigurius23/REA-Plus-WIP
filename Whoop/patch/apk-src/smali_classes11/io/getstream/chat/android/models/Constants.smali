.class public final Lio/getstream/chat/android/models/Constants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Constants;",
        "",
        "<init>",
        "()V",
        "MB_IN_BYTES",
        "",
        "MAX_REQUEST_BODY_LENGTH",
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
.field public static final INSTANCE:Lio/getstream/chat/android/models/Constants;

.field public static final MAX_REQUEST_BODY_LENGTH:J = 0x100000L

.field public static final MB_IN_BYTES:J = 0x100000L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/Constants;

    invoke-direct {v0}, Lio/getstream/chat/android/models/Constants;-><init>()V

    sput-object v0, Lio/getstream/chat/android/models/Constants;->INSTANCE:Lio/getstream/chat/android/models/Constants;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
