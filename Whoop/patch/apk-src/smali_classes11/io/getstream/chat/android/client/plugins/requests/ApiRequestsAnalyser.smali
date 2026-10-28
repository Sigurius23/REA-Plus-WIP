.class public interface abstract Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0018\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;",
        "",
        "",
        "requestName",
        "",
        "data",
        "Ll83/a0;",
        "registerRequest",
        "(Ljava/lang/String;Ljava/util/Map;)V",
        "dumpRequestByName",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "dumpAll",
        "()Ljava/lang/String;",
        "clearAll",
        "()V",
        "queryText",
        "clearRequestContaining",
        "(Ljava/lang/String;)V",
        "",
        "countRequestContaining",
        "(Ljava/lang/String;)I",
        "countAllRequests",
        "()I",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;

    sput-object v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;->Companion:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;

    return-void
.end method


# virtual methods
.method public abstract clearAll()V
.end method

.method public abstract clearRequestContaining(Ljava/lang/String;)V
.end method

.method public abstract countAllRequests()I
.end method

.method public abstract countRequestContaining(Ljava/lang/String;)I
.end method

.method public abstract dumpAll()Ljava/lang/String;
.end method

.method public abstract dumpRequestByName(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract registerRequest(Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
