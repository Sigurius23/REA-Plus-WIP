.class public final Lio/getstream/chat/android/ui/common/disposable/CoilDisposable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/disposable/Disposable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/disposable/CoilDisposable;",
        "Lio/getstream/chat/android/ui/common/disposable/Disposable;",
        "Lfi/c;",
        "disposable",
        "<init>",
        "(Lfi/c;)V",
        "Ll83/a0;",
        "dispose",
        "()V",
        "Lfi/c;",
        "",
        "isDisposed",
        "()Z",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final disposable:Lfi/c;


# direct methods
.method public constructor <init>(Lfi/c;)V
    .locals 1

    const-string v0, "disposable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/disposable/CoilDisposable;->disposable:Lfi/c;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/disposable/CoilDisposable;->disposable:Lfi/c;

    invoke-interface {v0}, Lfi/c;->dispose()V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/disposable/CoilDisposable;->disposable:Lfi/c;

    invoke-interface {v0}, Lfi/c;->isDisposed()Z

    move-result v0

    return v0
.end method
