.class public abstract Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
        ">",
        "Landroidx/recyclerview/widget/o2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
        "T",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "item",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V",
        "bindInternal$stream_chat_android_ui_components_release",
        "bindInternal",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    const-string p1, "Chat:BaseThreadListItemViewHolder"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public abstract bind(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final bindInternal$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V

    return-void
.end method
