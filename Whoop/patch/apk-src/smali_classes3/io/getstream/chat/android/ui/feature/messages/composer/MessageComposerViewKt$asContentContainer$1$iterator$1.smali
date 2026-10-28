.class public final Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        ">;",
        "Ld93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "index",
        "",
        "hasNext",
        "",
        "next",
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
.field private index:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->index:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;

    invoke-static {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->access$getChildCount$p(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->index:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->index:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->access$getChildAt(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;I)Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->next()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
