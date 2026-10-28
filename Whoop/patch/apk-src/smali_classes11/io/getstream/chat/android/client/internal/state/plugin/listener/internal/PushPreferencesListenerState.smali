.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ.\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J.\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "",
        "cid",
        "Lio/getstream/chat/android/models/PushPreference;",
        "pushPreference",
        "Ll83/a0;",
        "updateChannelPushPreference",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V",
        "Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "level",
        "Ln23/h;",
        "result",
        "onChannelPushPreferenceSet",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Ljava/util/Date;",
        "until",
        "onChannelPushNotificationsSnoozed",
        "(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-void
.end method

.method public static final synthetic access$updateChannelPushPreference(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->updateChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V

    return-void
.end method

.method private final updateChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V
    .locals 2

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V

    return-void
.end method


# virtual methods
.method public final onChannelPushNotificationsSnoozed(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p3, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p3, Ln23/g;

    iget-object p2, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/PushPreference;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->updateChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V

    goto :goto_0

    :cond_0
    instance-of p1, p3, Ln23/f;

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onChannelPushPreferenceSet(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p3, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p3, Ln23/g;

    iget-object p2, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/PushPreference;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;->updateChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V

    goto :goto_0

    :cond_0
    instance-of p1, p3, Ln23/f;

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
