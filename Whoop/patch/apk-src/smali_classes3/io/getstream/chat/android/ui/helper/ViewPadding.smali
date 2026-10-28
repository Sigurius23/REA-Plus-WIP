.class public final Lio/getstream/chat/android/ui/helper/ViewPadding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/ViewPadding;",
        "",
        "start",
        "",
        "top",
        "end",
        "bottom",
        "<init>",
        "(IIII)V",
        "getStart",
        "()I",
        "getTop",
        "getEnd",
        "getBottom",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final bottom:I

.field private final end:I

.field private final start:I

.field private final top:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    iput p2, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    iput p3, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    iput p4, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/helper/ViewPadding;IIIIILjava/lang/Object;)Lio/getstream/chat/android/ui/helper/ViewPadding;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/helper/ViewPadding;

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/helper/ViewPadding;-><init>(IIII)V

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    return v0
.end method

.method public final copy(IIII)Lio/getstream/chat/android/ui/helper/ViewPadding;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/helper/ViewPadding;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/helper/ViewPadding;-><init>(IIII)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/helper/ViewPadding;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/helper/ViewPadding;

    iget v1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    iget v3, p1, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    iget v3, p1, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    iget v3, p1, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    iget p1, p1, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottom()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    return v0
.end method

.method public final getEnd()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    return v0
.end method

.method public final getStart()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    return v0
.end method

.method public final getTop()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->start:I

    iget v1, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->top:I

    iget v2, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->end:I

    iget v3, p0, Lio/getstream/chat/android/ui/helper/ViewPadding;->bottom:I

    const-string v4, ", top="

    const-string v5, ", end="

    const-string v6, "ViewPadding(start="

    invoke-static {v0, v1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottom="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
