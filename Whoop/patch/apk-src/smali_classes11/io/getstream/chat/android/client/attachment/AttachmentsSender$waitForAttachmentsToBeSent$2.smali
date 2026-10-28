.class final Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/attachment/AttachmentsSender;->waitForAttachmentsToBeSent(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.attachment.AttachmentsSender$waitForAttachmentsToBeSent$2"
    f = "AttachmentsSender.kt"
    l = {
        0x8c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

.field final synthetic $messageToBeSent:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic $newMessage:Lio/getstream/chat/android/models/Message;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lkotlin/jvm/internal/g0;",
            "Lkotlin/jvm/internal/b0;",
            "Lio/getstream/chat/android/client/attachment/AttachmentsSender;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$messageToBeSent:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

    iput-object p4, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$messageToBeSent:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

    iget-object v4, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;-><init>(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/client/attachment/AttachmentsSender;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->observeAttachments(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    new-instance v1, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$invokeSuspend$$inlined$filterNot$1;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$invokeSuspend$$inlined$filterNot$1;-><init>(Lec3/l;)V

    new-instance p1, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;

    iget-object v3, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$messageToBeSent:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$newMessage:Lio/getstream/chat/android/models/Message;

    iget-object v5, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->$allAttachmentsUploaded:Lkotlin/jvm/internal/b0;

    iget-object v6, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->this$0:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    invoke-direct {p1, v3, v4, v5, v6}, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2$2;-><init>(Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/client/attachment/AttachmentsSender;)V

    iput v2, p0, Lio/getstream/chat/android/client/attachment/AttachmentsSender$waitForAttachmentsToBeSent$2;->label:I

    invoke-interface {v1, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
