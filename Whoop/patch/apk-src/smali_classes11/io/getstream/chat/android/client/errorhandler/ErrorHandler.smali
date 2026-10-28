.class public interface abstract Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/errorhandler/ErrorHandler$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
        "Ljava/lang/Comparable<",
        "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        ">;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008g\u0018\u0000 \u000c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u000cJ\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
        "",
        "priority",
        "",
        "getPriority",
        "()I",
        "compareTo",
        "other",
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
.field public static final Companion:Lio/getstream/chat/android/client/errorhandler/ErrorHandler$Companion;

.field public static final DEFAULT_PRIORITY:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/errorhandler/ErrorHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/errorhandler/ErrorHandler$Companion;

    sput-object v0, Lio/getstream/chat/android/client/errorhandler/ErrorHandler;->Companion:Lio/getstream/chat/android/client/errorhandler/ErrorHandler$Companion;

    return-void
.end method


# virtual methods
.method public compareTo(Lio/getstream/chat/android/client/errorhandler/ErrorHandler;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 2
    invoke-static {p1, p1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/client/errorhandler/ErrorHandler;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/client/errorhandler/ErrorHandler;->compareTo(Lio/getstream/chat/android/client/errorhandler/ErrorHandler;)I

    move-result p1

    return p1
.end method

.method public abstract getPriority()I
.end method
