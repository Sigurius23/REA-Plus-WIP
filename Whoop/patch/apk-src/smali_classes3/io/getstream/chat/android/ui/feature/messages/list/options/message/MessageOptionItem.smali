.class public final Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0012\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
        "",
        "optionText",
        "",
        "optionIcon",
        "Landroid/graphics/drawable/Drawable;",
        "messageAction",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "isWarningItem",
        "",
        "<init>",
        "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)V",
        "getOptionText",
        "()Ljava/lang/String;",
        "getOptionIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "getMessageAction",
        "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final isWarningItem:Z

.field private final messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

.field private final optionIcon:Landroid/graphics/drawable/Drawable;

.field private final optionText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)V
    .locals 1

    const-string v0, "optionText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageAction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    .line 5
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->copy(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;
    .locals 1

    const-string v0, "optionText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageAction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMessageAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    return-object v0
.end method

.method public final getOptionIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getOptionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isWarningItem()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionText:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->optionIcon:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->messageAction:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;->isWarningItem:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MessageOptionItem(optionText="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", optionIcon="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageAction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isWarningItem="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
