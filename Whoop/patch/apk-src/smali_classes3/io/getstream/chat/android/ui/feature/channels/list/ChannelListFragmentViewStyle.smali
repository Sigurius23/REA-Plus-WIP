.class public final Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "searchInputMarginStart",
        "",
        "searchInputMarginTop",
        "searchInputMarginEnd",
        "searchInputMarginBottom",
        "<init>",
        "(IIII)V",
        "getSearchInputMarginStart",
        "()I",
        "getSearchInputMarginTop",
        "getSearchInputMarginEnd",
        "getSearchInputMarginBottom",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;


# instance fields
.field private final searchInputMarginBottom:I

.field private final searchInputMarginEnd:I

.field private final searchInputMarginStart:I

.field private final searchInputMarginTop:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    iput p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    iput p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    iput p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;IIIIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;-><init>(IIII)V

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    return v0
.end method

.method public final copy(IIII)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;-><init>(IIII)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    iget p1, p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getSearchInputMarginBottom()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    return v0
.end method

.method public final getSearchInputMarginEnd()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    return v0
.end method

.method public final getSearchInputMarginStart()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    return v0
.end method

.method public final getSearchInputMarginTop()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginStart:I

    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginTop:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginEnd:I

    iget v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->searchInputMarginBottom:I

    const-string v4, ", searchInputMarginTop="

    const-string v5, ", searchInputMarginEnd="

    const-string v6, "ChannelListFragmentViewStyle(searchInputMarginStart="

    invoke-static {v0, v1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchInputMarginBottom="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
