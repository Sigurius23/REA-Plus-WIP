.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0086\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiMessageListMediaAttachmentStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_MessageList_MediaAttachment:I

    move-object/from16 v4, p2

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentProgressIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_rotating_indeterminate_progress_gradient:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v4, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMediaPreviewBackgroundColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_message_list_image_attachment_background:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMoreCountOverlayColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_overlay:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMoreCountTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_image_attachment_more_count_text_size:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMoreCountTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMoreCountFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMoreCountTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentMoreCountTextStyle:I

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlaceHolderIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_picture_placeholder:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlaceHolderIconTint:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v6

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIcon:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_2

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :cond_2
    move-object v10, v3

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconTint:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v11

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconBackgroundColor:I

    sget v12, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v0, v12}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v12

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconCornerRadius:I

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v18

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconElevation:I

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v13

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconPaddingTop:I

    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconPaddingBottom:I

    invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconPaddingStart:I

    invoke-virtual {v1, v14, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v14

    sget v15, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconPaddingEnd:I

    invoke-virtual {v1, v15, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    sget v15, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconPadding:I

    invoke-static {v1, v15}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDimensionOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_5
    move v15, v3

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :cond_6
    move/from16 v16, v14

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_7
    move/from16 v17, v5

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    move v14, v0

    move-object v5, v2

    invoke-direct/range {v3 .. v18}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getMediaAttachmentStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v3}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    return-object v0
.end method
