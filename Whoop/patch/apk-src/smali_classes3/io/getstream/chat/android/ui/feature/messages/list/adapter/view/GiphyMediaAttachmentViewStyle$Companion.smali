.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0080\u0002\u00a2\u0006\u0002\u0008\nR\u000e\u0010\u000b\u001a\u00020\u000cX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000cX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "invoke$stream_chat_android_ui_components_release",
        "NO_GIVEN_DIMENSION_RATIO",
        "",
        "NO_GIVEN_HEIGHT",
        "",
        "SQUARE_DIMENSION_RATIO",
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
.method public final invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;
    .locals 12

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView:[I

    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiMessageListGiphyAttachmentStyle:I

    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_MessageList_GiphyMediaAttachment:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentProgressIcon:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_rotating_indeterminate_progress_gradient:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v2, v0

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentGiphyIcon:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_giphy_label:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v3, v0

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentImageBackgroundColor:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentPlaceHolderIcon:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_2

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_picture_placeholder:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v4, v0

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentGiphyType:I

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;->FIXED_HEIGHT:Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;

    const/4 v1, -0x1

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-ltz p1, :cond_3

    invoke-static {}, Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;->values()[Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;

    move-result-object v0

    aget-object v0, v0, p1

    :cond_3
    move-object v6, v0

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentScaleType:I

    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-ltz p1, :cond_4

    invoke-static {}, Landroid/widget/ImageView$ScaleType;->values()[Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    aget-object v0, v0, p1

    :cond_4
    move-object v7, v0

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentSizingMode:I

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;->ADAPTIVE:Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-ltz p1, :cond_5

    invoke-static {}, Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;->values()[Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    move-result-object v0

    aget-object v0, v0, p1

    :cond_5
    move-object v8, v0

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentWidth:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v9

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentHeight:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v10

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentDimensionRatio:I

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v11

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/common/utils/GiphyInfoType;Landroid/widget/ImageView$ScaleType;Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;IIF)V

    return-object v1
.end method
