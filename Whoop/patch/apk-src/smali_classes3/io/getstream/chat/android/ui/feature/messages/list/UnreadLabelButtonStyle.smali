.class public final Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "unreadLabelButtonEnabled",
        "",
        "unreadLabelButtonColor",
        "",
        "unreadLabelButtonRippleColor",
        "unreadLabelButtonTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "<init>",
        "(ZIILio/getstream/chat/android/ui/font/TextStyle;)V",
        "getUnreadLabelButtonEnabled",
        "()Z",
        "getUnreadLabelButtonColor",
        "()I",
        "getUnreadLabelButtonRippleColor",
        "getUnreadLabelButtonTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Builder",
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
.field private final unreadLabelButtonColor:I

.field private final unreadLabelButtonEnabled:Z

.field private final unreadLabelButtonRippleColor:I

.field private final unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method public constructor <init>(ZIILio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 1

    const-string v0, "unreadLabelButtonTextStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;ZIILio/getstream/chat/android/ui/font/TextStyle;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->copy(ZIILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    return v0
.end method

.method public final component4()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(ZIILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;
    .locals 1

    const-string v0, "unreadLabelButtonTextStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;-><init>(ZIILio/getstream/chat/android/ui/font/TextStyle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getUnreadLabelButtonColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    return v0
.end method

.method public final getUnreadLabelButtonEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    return v0
.end method

.method public final getUnreadLabelButtonRippleColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    return v0
.end method

.method public final getUnreadLabelButtonTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonEnabled:Z

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonColor:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonRippleColor:I

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;->unreadLabelButtonTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "UnreadLabelButtonStyle(unreadLabelButtonEnabled="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", unreadLabelButtonColor="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", unreadLabelButtonRippleColor="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", unreadLabelButtonTextStyle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
