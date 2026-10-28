.class public final Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/HMSDataChannel$Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "live/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1",
        "Llive/hms/video/connection/HMSDataChannel$Observer;",
        "",
        "value",
        "Ll83/a0;",
        "onMessage",
        "(Ljava/lang/String;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

.field final synthetic this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iput-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(Ljava/lang/String;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1$onMessage$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, p1, v3, v4}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1$onMessage$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Ljava/lang/String;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
