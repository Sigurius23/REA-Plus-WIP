.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c2\u0003J1\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0010R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;",
        "",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "reaction",
        "Lio/getstream/chat/android/models/Reaction;",
        "isMine",
        "",
        "reactionDrawable",
        "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
        "<init>",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getReaction",
        "()Lio/getstream/chat/android/models/Reaction;",
        "()Z",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "getDrawable",
        "()Landroid/graphics/drawable/Drawable;",
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
.field private final drawable:Landroid/graphics/drawable/Drawable;

.field private final isMine:Z

.field private final reaction:Lio/getstream/chat/android/models/Reaction;

.field private final reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionDrawable"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    invoke-virtual {p4, p3}, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;->getDrawable(Z)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->drawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private final component4()Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->copy(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/Reaction;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionDrawable"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->drawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getReaction()Lio/getstream/chat/android/models/Reaction;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Reaction;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMine()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->user:Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reaction:Lio/getstream/chat/android/models/Reaction;

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine:Z

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->reactionDrawable:Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "UserReactionItem(user="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reaction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isMine="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", reactionDrawable="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
