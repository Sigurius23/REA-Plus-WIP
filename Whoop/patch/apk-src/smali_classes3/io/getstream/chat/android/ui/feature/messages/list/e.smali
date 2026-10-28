.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;


# instance fields
.field public final synthetic a:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/e;->a:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/e;->a:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->R(Lc93/a;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    return-void
.end method
