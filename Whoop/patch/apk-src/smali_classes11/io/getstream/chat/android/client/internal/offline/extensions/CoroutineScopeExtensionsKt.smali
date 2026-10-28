.class public final Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a:\u0010\t\u001a\u00020\u0008*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lbc3/c0;",
        "Lmc3/a;",
        "mutex",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "block",
        "Lbc3/k1;",
        "launchWithMutex",
        "(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lmc3/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lbc3/k1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt$launchWithMutex$2;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt$launchWithMutex$2;-><init>(Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v0, v0, p3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    return-object p0
.end method
