.class public final Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aK\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\"\u0010\u0005\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "T",
        "R",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "",
        "initializer",
        "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;",
        "parameterizedLazy",
        "(Lc93/m;)Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;",
        "stream-chat-android-core"
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
.method public static final parameterizedLazy(Lc93/m;)Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy<",
            "TT;TR;>;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;-><init>(Lc93/m;)V

    return-object v0
.end method
