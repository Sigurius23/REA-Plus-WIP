.class public final Lio/getstream/chat/android/client/channel/ChannelClientExtensionsKt$subscribeFor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/ChatEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/channel/ChannelClientExtensionsKt;->subscribeFor(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<EventT:",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        ">",
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/ChatEventListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0xb0
.end annotation


# instance fields
.field final synthetic $listener:Lio/getstream/chat/android/client/ChatEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatEventListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/channel/ChannelClientExtensionsKt$subscribeFor$1;->$listener:Lio/getstream/chat/android/client/ChatEventListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method
