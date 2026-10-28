.class public final Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;",
        "",
        "<init>",
        "()V",
        "",
        "cid",
        "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;",
        "Landroidx/lifecycle/a2;",
        "build",
        "()Landroidx/lifecycle/a2;",
        "Ljava/lang/String;",
        "stream-chat-android-ui-components_release"
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
.field private cid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Landroidx/lifecycle/a2;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;->cid:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Channel cid should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final cid(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModelFactory$Builder;->cid:Ljava/lang/String;

    return-object p0
.end method
