.class public final synthetic Laq0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

.field public final synthetic b:Lio/getstream/chat/android/models/Message;

.field public final synthetic c:Lio/getstream/chat/android/models/Attachment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq0/n;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iput-object p2, p0, Laq0/n;->b:Lio/getstream/chat/android/models/Message;

    iput-object p3, p0, Laq0/n;->c:Lio/getstream/chat/android/models/Attachment;

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V
    .locals 3

    iget-object v0, p0, Laq0/n;->b:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Laq0/n;->c:Lio/getstream/chat/android/models/Attachment;

    iget-object v2, p0, Laq0/n;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v2, v0, v1, p1}, Laq0/q;->J(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    return-void
.end method
