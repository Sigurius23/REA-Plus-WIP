.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000c\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\u0008\u0008\u0001\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c2\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0008\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;",
        "",
        "array",
        "Landroid/content/res/TypedArray;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/res/TypedArray;Landroid/content/Context;)V",
        "bubbleColorMine",
        "",
        "bubbleColorTheirs",
        "reactionsColumn",
        "bubbleColorMineResId",
        "bubbleColorTheirsResId",
        "reactionsColumns",
        "columnsResId",
        "build",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "component1",
        "component2",
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
.field private final array:Landroid/content/res/TypedArray;

.field private bubbleColorMine:I

.field private bubbleColorTheirs:I

.field private final context:Landroid/content/Context;

.field private reactionsColumn:I


# direct methods
.method public constructor <init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V
    .locals 1

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget p1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorMine:I

    sget p1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorTheirs:I

    const/4 p1, 0x5

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->reactionsColumn:I

    return-void
.end method

.method private final component1()Landroid/content/res/TypedArray;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    return-object v0
.end method

.method private final component2()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;Landroid/content/res/TypedArray;Landroid/content/Context;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->copy(Landroid/content/res/TypedArray;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bubbleColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorMine:I

    return-object p0
.end method

.method public final bubbleColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorTheirs:I

    return-object p0
.end method

.method public final build()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_horizontal_padding:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_item_size:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_bubble_height:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v8

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_bubble_radius:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_large_tail_bubble_cy_offset:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v10

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_large_tail_bubble_radius:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v11

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_large_tail_bubble_offset:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_small_tail_bubble_cy_offset:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_small_tail_bubble_radius:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_small_tail_bubble_offset:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v15

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_edit_reactions_vertical_padding:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v17

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    iget v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorMine:I

    iget v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorTheirs:I

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->reactionsColumn:I

    move/from16 v16, v1

    invoke-direct/range {v3 .. v17}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;-><init>(IIIIIIIIIIIIII)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getEditReactionsStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v1

    invoke-interface {v1, v3}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    return-object v1
.end method

.method public final copy(Landroid/content/res/TypedArray;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;
    .locals 1

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;-><init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final reactionsColumns(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    const/4 v1, 0x5

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->reactionsColumn:I

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->array:Landroid/content/res/TypedArray;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->context:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Builder(array="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", context="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
