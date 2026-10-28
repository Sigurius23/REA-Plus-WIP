.class public final Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltg3/a;",
        "Lpg3/m;",
        "withErrorLogging",
        "(Ltg3/a;)Lpg3/m;",
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
.method public static final withErrorLogging(Ltg3/a;)Lpg3/m;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;-><init>(Ltg3/a;)V

    return-object v0
.end method
