.class public final Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Content"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;",
        "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;",
        "items",
        "",
        "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;",
        "canLoadMore",
        "",
        "isLoadingMore",
        "<init>",
        "(Ljava/util/List;ZZ)V",
        "getItems",
        "()Ljava/util/List;",
        "getCanLoadMore",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Item",
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
.field private final canLoadMore:Z

.field private final isLoadingMore:Z

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;-><init>(Ljava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    .line 5
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;-><init>(Ljava/util/List;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;Ljava/util/List;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->copy(Ljava/util/List;ZZ)Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    return v0
.end method

.method public final copy(Ljava/util/List;ZZ)Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;",
            ">;ZZ)",
            "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;-><init>(Ljava/util/List;ZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCanLoadMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isLoadingMore()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->items:Ljava/util/List;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->canLoadMore:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;->isLoadingMore:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Content(items="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canLoadMore="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoadingMore="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
