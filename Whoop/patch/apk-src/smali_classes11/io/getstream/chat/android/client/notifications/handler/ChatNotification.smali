.class public abstract Lio/getstream/chat/android/client/notifications/handler/ChatNotification;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;,
        Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;,
        Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;,
        Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;,
        Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00082\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "",
        "<init>",
        "()V",
        "MessageNew",
        "MessageUpdated",
        "ReactionNew",
        "NotificationReminderDue",
        "Companion",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;",
        "stream-chat-android-client_release"
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
.field public static final Companion:Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;

.field public static final TYPE_MESSAGE_NEW:Ljava/lang/String; = "message.new"

.field public static final TYPE_MESSAGE_UPDATED:Ljava/lang/String; = "message.updated"

.field public static final TYPE_NOTIFICATION_REMINDER_DUE:Ljava/lang/String; = "notification.reminder_due"

.field public static final TYPE_REACTION_NEW:Ljava/lang/String; = "reaction.new"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotification;->Companion:Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
