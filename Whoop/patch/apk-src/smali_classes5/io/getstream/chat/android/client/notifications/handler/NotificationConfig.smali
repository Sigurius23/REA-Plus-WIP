.class public final Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bo\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJv\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008*\u0010\u0014R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u0008,\u0010\u0016R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010-\u001a\u0004\u0008.\u0010\u0018R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010-\u001a\u0004\u0008/\u0010\u0018R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\'\u001a\u0004\u00080\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00101\u001a\u0004\u00082\u0010\u001c\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "",
        "",
        "pushNotificationsEnabled",
        "Lkotlin/Function1;",
        "",
        "ignorePushMessageWhenUserOnline",
        "",
        "pushDeviceGenerators",
        "Lkotlin/Function0;",
        "shouldShowNotificationOnPush",
        "requestPermissionOnAppLaunch",
        "autoTranslationEnabled",
        "Lio/getstream/chat/android/client/token/TokenProvider;",
        "tokenProvider",
        "<init>",
        "(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)V",
        "component1",
        "()Z",
        "component2",
        "()Lkotlin/jvm/functions/Function1;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lc93/a;",
        "component5",
        "component6",
        "component7",
        "()Lio/getstream/chat/android/client/token/TokenProvider;",
        "copy",
        "(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getPushNotificationsEnabled",
        "Lkotlin/jvm/functions/Function1;",
        "getIgnorePushMessageWhenUserOnline",
        "Ljava/util/List;",
        "getPushDeviceGenerators",
        "Lc93/a;",
        "getShouldShowNotificationOnPush",
        "getRequestPermissionOnAppLaunch",
        "getAutoTranslationEnabled",
        "Lio/getstream/chat/android/client/token/TokenProvider;",
        "getTokenProvider",
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


# instance fields
.field private final autoTranslationEnabled:Z

.field private final ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final pushDeviceGenerators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final pushNotificationsEnabled:Z

.field private final requestPermissionOnAppLaunch:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final shouldShowNotificationOnPush:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 10

    .line 2
    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlin/jvm/functions/Function1;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 3
    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 4
    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushDeviceGenerators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    .line 5
    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushDeviceGenerators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shouldShowNotificationOnPush"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x70

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    .line 6
    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushDeviceGenerators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shouldShowNotificationOnPush"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionOnAppLaunch"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            "Lc93/a;",
            "Z)V"
        }
    .end annotation

    .line 7
    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushDeviceGenerators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shouldShowNotificationOnPush"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionOnAppLaunch"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            "Lc93/a;",
            "Z",
            "Lio/getstream/chat/android/client/token/TokenProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushDeviceGenerators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shouldShowNotificationOnPush"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionOnAppLaunch"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean p1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    .line 10
    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    .line 11
    iput-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    .line 12
    iput-object p4, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    .line 13
    iput-object p5, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    .line 14
    iput-boolean p6, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    .line 15
    iput-object p7, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x1

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 16
    new-instance p2, Lim1/p0;

    const/16 p9, 0xd

    invoke-direct {p2, p9}, Lim1/p0;-><init>(I)V

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 17
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    .line 18
    new-instance p4, La13/f;

    const/4 p9, 0x7

    invoke-direct {p4, p9}, La13/f;-><init>(I)V

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 19
    new-instance p5, La13/f;

    const/4 p9, 0x7

    invoke-direct {p5, p9}, La13/f;-><init>(I)V

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/4 p7, 0x0

    :cond_6
    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 20
    invoke-direct/range {p1 .. p8}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "notification.reminder_due"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    return p0

    :sswitch_1
    const-string v0, "message.new"

    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_2
    const-string v0, "message.updated"

    goto :goto_0

    :sswitch_3
    const-string v0, "reaction.new"

    goto :goto_0

    :goto_1
    const/4 p0, 0x1

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x6659cfa5 -> :sswitch_3
        -0x37b9062c -> :sswitch_2
        -0x341bc8c7 -> :sswitch_1
        -0x29d05b36 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final _init_$lambda$1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final _init_$lambda$2()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static synthetic a(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->_init_$lambda$0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    :cond_6
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->copy(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    return v0
.end method

.method public final component2()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    return-object v0
.end method

.method public final component5()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    return v0
.end method

.method public final component7()Lio/getstream/chat/android/client/token/TokenProvider;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    return-object v0
.end method

.method public final copy(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            "Lc93/a;",
            "Z",
            "Lio/getstream/chat/android/client/token/TokenProvider;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;"
        }
    .end annotation

    const-string v0, "ignorePushMessageWhenUserOnline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushDeviceGenerators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shouldShowNotificationOnPush"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionOnAppLaunch"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    iget-object v3, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    iget-object v3, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    iget-object p1, p1, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAutoTranslationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    return v0
.end method

.method public final getIgnorePushMessageWhenUserOnline()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getPushDeviceGenerators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    return-object v0
.end method

.method public final getPushNotificationsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    return v0
.end method

.method public final getRequestPermissionOnAppLaunch()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    return-object v0
.end method

.method public final getShouldShowNotificationOnPush()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    return-object v0
.end method

.method public final getTokenProvider()Lio/getstream/chat/android/client/token/TokenProvider;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    invoke-static {v0, v1, v2}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    invoke-static {v0, v1, v2}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushNotificationsEnabled:Z

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->ignorePushMessageWhenUserOnline:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->pushDeviceGenerators:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->shouldShowNotificationOnPush:Lc93/a;

    iget-object v4, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->requestPermissionOnAppLaunch:Lc93/a;

    iget-boolean v5, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->autoTranslationEnabled:Z

    iget-object v6, p0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "NotificationConfig(pushNotificationsEnabled="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", ignorePushMessageWhenUserOnline="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pushDeviceGenerators="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowNotificationOnPush="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requestPermissionOnAppLaunch="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", autoTranslationEnabled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", tokenProvider="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
