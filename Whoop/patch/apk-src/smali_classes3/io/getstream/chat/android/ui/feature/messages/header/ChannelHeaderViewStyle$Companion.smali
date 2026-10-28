.class public final Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiChannelHeaderStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_ChannelHeader:I

    move-object/from16 v4, p2

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderBackground:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderShowUserAvatar:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderBackButtonIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_arrow_left:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v11, v2

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderTitleTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v2, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderTitleTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v2, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderTitleFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderTitleTextFont:I

    invoke-virtual {v2, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderTitleTextStyle:I

    invoke-virtual {v2, v4, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v6

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderShowBackButton:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderShowBackButtonBadge:I

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v13

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderBackButtonBadgeBackgroundColor:I

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_red:I

    invoke-static {v0, v7}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v2, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v14

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextSize:I

    sget v8, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v2, v7, v8}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextColor:I

    sget v8, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v8}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v2, v7, v8}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderOfflineLabelFontAssets:I

    sget v8, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextFont:I

    invoke-virtual {v2, v7, v8}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextStyle:I

    invoke-virtual {v2, v7, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v7

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v8, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSearchingForNetworkLabelTextSize:I

    sget v9, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v2, v8, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v8, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSearchingForNetworkLabelColor:I

    sget v9, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v9}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v2, v8, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v8, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSearchingForNetworkLabelFontAssets:I

    sget v9, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSearchingForNetworkLabelTextFont:I

    invoke-virtual {v2, v8, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v8, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSearchingForNetworkLabelTextStyle:I

    invoke-virtual {v2, v8, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v8

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderShowSearchingForNetworkProgressBar:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSearchingForNetworkProgressBarTint:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v16, v2

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextSize:I

    sget v9, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v2, v3, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextColor:I

    sget v9, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v9}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v2, v3, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderDefaultLabelFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextFont:I

    invoke-virtual {v2, v0, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextStyle:I

    invoke-virtual {v2, v0, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->ChannelHeaderView_streamUiChannelHeaderSeparatorBackgroundDrawable:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v17

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    invoke-direct/range {v4 .. v17}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;-><init>(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getChannelHeaderStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v4}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    return-object v0
.end method
