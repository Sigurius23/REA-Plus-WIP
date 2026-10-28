.class public final Lio/getstream/chat/android/client/scope/user/UserJobKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lbc3/k1;",
        "parent",
        "Lkotlin/Function0;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "getUserId",
        "Lio/getstream/chat/android/client/scope/user/UserJob;",
        "UserJob",
        "(Lbc3/k1;Lc93/a;)Lio/getstream/chat/android/client/scope/user/UserJob;",
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
.method public static final UserJob(Lbc3/k1;Lc93/a;)Lio/getstream/chat/android/client/scope/user/UserJob;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/k1;",
            "Lc93/a;",
            ")",
            "Lio/getstream/chat/android/client/scope/user/UserJob;"
        }
    .end annotation

    const-string v0, "getUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/scope/user/UserJobImpl;

    new-instance v1, Lbc3/e2;

    invoke-direct {v1, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/client/scope/user/UserJobImpl;-><init>(Lbc3/u;Lc93/a;)V

    return-object v0
.end method

.method public static synthetic UserJob$default(Lbc3/k1;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/client/scope/user/UserJob;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/client/scope/user/UserJobKt;->UserJob(Lbc3/k1;Lc93/a;)Lio/getstream/chat/android/client/scope/user/UserJob;

    move-result-object p0

    return-object p0
.end method
