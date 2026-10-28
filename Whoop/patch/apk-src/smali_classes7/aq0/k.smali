.class public final synthetic Laq0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

.field public final synthetic b:Lio/getstream/chat/android/models/Message;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq0/k;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iput-object p2, p0, Laq0/k;->b:Lio/getstream/chat/android/models/Message;

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V
    .locals 2

    iget-object v0, p0, Laq0/k;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iget-object v1, p0, Laq0/k;->b:Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1, p1}, Laq0/q;->y0(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    return-void
.end method
