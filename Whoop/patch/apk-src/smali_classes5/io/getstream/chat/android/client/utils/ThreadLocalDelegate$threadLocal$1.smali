.class public final Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;-><init>(Lc93/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "io/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1",
        "Ljava/lang/ThreadLocal;",
        "initialValue",
        "()Ljava/lang/Object;",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/utils/ThreadLocalDelegate<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/utils/ThreadLocalDelegate<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;->this$0:Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;->this$0:Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;

    invoke-static {v0}, Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;->access$getValue$p(Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;)Lc93/a;

    move-result-object v0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
