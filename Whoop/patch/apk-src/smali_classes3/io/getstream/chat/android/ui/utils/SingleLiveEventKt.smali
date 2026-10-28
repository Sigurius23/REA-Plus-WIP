.class public final Lio/getstream/chat/android/ui/utils/SingleLiveEventKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "Lec3/l;",
        "Lq83/j;",
        "context",
        "Lio/getstream/chat/android/ui/utils/SingleLiveEvent;",
        "asSingleLiveEvent",
        "(Lec3/l;Lq83/j;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;",
        "stream-chat-android-ui-components_release"
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
.method public static final asSingleLiveEvent(Lec3/l;Lq83/j;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/l;",
            "Lq83/j;",
            ")",
            "Lio/getstream/chat/android/ui/utils/SingleLiveEvent<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;-><init>()V

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v1, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$asSingleLiveEvent$1$1;-><init>(Lec3/l;Lio/getstream/chat/android/ui/utils/SingleLiveEvent;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {p1, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v0
.end method

.method public static synthetic asSingleLiveEvent$default(Lec3/l;Lq83/j;ILjava/lang/Object;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt;->asSingleLiveEvent(Lec3/l;Lq83/j;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;

    move-result-object p0

    return-object p0
.end method
