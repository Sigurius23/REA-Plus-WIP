.class public final Lio/getstream/chat/android/ui/common/utils/PollsConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/PollsConstants;",
        "",
        "<init>",
        "()V",
        "",
        "MIN_NUMBER_OF_MULTIPLE_ANSWERS",
        "I",
        "MAX_NUMBER_OF_MULTIPLE_ANSWERS",
        "Li93/j;",
        "MULTIPLE_ANSWERS_RANGE",
        "Li93/j;",
        "getMULTIPLE_ANSWERS_RANGE",
        "()Li93/j;",
        "MAX_NUMBER_OF_VISIBLE_OPTIONS",
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
.field public static final $stable:I

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/utils/PollsConstants;

.field public static final MAX_NUMBER_OF_MULTIPLE_ANSWERS:I = 0xa

.field public static final MAX_NUMBER_OF_VISIBLE_OPTIONS:I = 0x5

.field public static final MIN_NUMBER_OF_MULTIPLE_ANSWERS:I = 0x2

.field private static final MULTIPLE_ANSWERS_RANGE:Li93/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/PollsConstants;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/PollsConstants;->INSTANCE:Lio/getstream/chat/android/ui/common/utils/PollsConstants;

    new-instance v0, Li93/j;

    const/16 v1, 0xa

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v3, v1, v2}, Li93/h;-><init>(III)V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/PollsConstants;->MULTIPLE_ANSWERS_RANGE:Li93/j;

    const/16 v0, 0x8

    sput v0, Lio/getstream/chat/android/ui/common/utils/PollsConstants;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMULTIPLE_ANSWERS_RANGE()Li93/j;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/PollsConstants;->MULTIPLE_ANSWERS_RANGE:Li93/j;

    return-object v0
.end method
