.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ThreeViews"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;",
        "viewOne",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;",
        "viewTwo",
        "viewThree",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V",
        "getViewOne",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;",
        "getViewTwo",
        "getViewThree",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

.field private final viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

.field private final viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V
    .locals 1

    const-string v0, "viewOne"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewTwo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewThree"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->copy(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;
    .locals 1

    const-string v0, "viewOne"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewTwo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewThree"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getViewOne()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-object v0
.end method

.method public final getViewThree()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-object v0
.end method

.method public final getViewTwo()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewOne:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewTwo:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->viewThree:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ThreeViews(viewOne="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewTwo="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewThree="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
