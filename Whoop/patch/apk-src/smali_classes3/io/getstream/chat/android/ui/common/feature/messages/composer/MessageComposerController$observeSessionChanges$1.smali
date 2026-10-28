.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->observeSessionChanges()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a8\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00070\t2\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Ljava/util/LinkedHashMap;",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lkotlin/collections/LinkedHashMap;",
        "selected",
        "Lio/getstream/chat/android/models/Message;",
        "editMessage",
        "",
        "editAttachments",
        "Ll83/q;",
        "<anonymous>",
        "(Ljava/util/LinkedHashMap;Lio/getstream/chat/android/models/Message;Ljava/util/List;)Ll83/q;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$observeSessionChanges$1"
    f = "MessageComposerController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/LinkedHashMap;

    check-cast p2, Lio/getstream/chat/android/models/Message;

    check-cast p3, Ljava/util/List;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->invoke(Ljava/util/LinkedHashMap;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/LinkedHashMap;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;

    const/4 v1, 0x4

    .line 2
    invoke-direct {v0, v1, p4}, Ls83/i;-><init>(ILq83/d;)V

    .line 3
    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->L$2:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$observeSessionChanges$1;->label:I

    if-nez v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ll83/q;

    invoke-direct {p1, v0, v1, v2}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
