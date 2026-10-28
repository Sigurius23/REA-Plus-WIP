.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/l;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/l;->a:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->x(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    return-void
.end method
