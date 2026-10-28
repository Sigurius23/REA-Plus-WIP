.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;


# instance fields
.field public final synthetic w:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;->w:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onAttachmentDownloadClick(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;->w:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->K(Lc93/a;Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    return p1
.end method
