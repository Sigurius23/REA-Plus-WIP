.class public final Lio/getstream/chat/android/client/logger/StreamLoggerHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb23/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/logger/StreamLoggerHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/client/logger/StreamLoggerHandler;",
        "Lb23/j;",
        "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;",
        "handler",
        "<init>",
        "(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)V",
        "Lb23/g;",
        "priority",
        "",
        "tag",
        "message",
        "",
        "throwable",
        "Ll83/a0;",
        "log",
        "(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;",
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
.field private final handler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/logger/StreamLoggerHandler;->handler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;

    return-void
.end method


# virtual methods
.method public final log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/logger/StreamLoggerHandler;->handler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;

    if-eqz v0, :cond_1

    sget-object v1, Lio/getstream/chat/android/client/logger/StreamLoggerHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    if-nez p4, :cond_0

    invoke-interface {v0, p2, p3}, Lio/getstream/chat/android/client/logger/ChatLoggerHandler;->logE(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p2, p3, p4}, Lio/getstream/chat/android/client/logger/ChatLoggerHandler;->logE(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    invoke-interface {v0, p2, p3}, Lio/getstream/chat/android/client/logger/ChatLoggerHandler;->logW(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_2
    invoke-interface {v0, p2, p3}, Lio/getstream/chat/android/client/logger/ChatLoggerHandler;->logI(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_3
    invoke-interface {v0, p2, p3}, Lio/getstream/chat/android/client/logger/ChatLoggerHandler;->logD(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_4
    invoke-interface {v0, p2, p3}, Lio/getstream/chat/android/client/logger/ChatLoggerHandler;->logV(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
