.class public interface abstract Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ChatEventSuspendListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<EventT:",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00e0\u0080\u0001\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u00a6@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0008\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "EventT",
        "",
        "event",
        "Ll83/a0;",
        "onEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;",
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


# virtual methods
.method public abstract onEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TEventT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
