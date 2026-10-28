.class public final Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;
    .locals 36

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiChannelListViewStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_ChannelListView:I

    move-object/from16 v4, p2

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelOptionsIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_more:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v4, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelDeleteIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_delete:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v5, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelOptionsEnabled:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelDeleteEnabled:I

    const/4 v7, 0x1

    invoke-virtual {v1, v2, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    sget v8, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiSwipeEnabled:I

    invoke-virtual {v1, v8, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    sget v9, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiReadCountEnabled:I

    invoke-virtual {v1, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v29

    sget v9, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelListBackgroundColor:I

    sget v10, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v10}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v1, v9, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    sget v10, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiBackgroundLayoutColor:I

    sget v11, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_smoke:I

    invoke-static {v0, v11}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v1, v10, v11}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    new-instance v11, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v11, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelTitleTextSize:I

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_title:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v11, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelTitleTextColor:I

    sget v13, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v11, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelTitleFontAssets:I

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelTitleTextFont:I

    invoke-virtual {v11, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelTitleTextStyle:I

    invoke-virtual {v11, v12, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v11

    new-instance v12, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextSize:I

    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_message:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v12, v13, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextColor:I

    sget v14, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v14}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v12, v13, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageFontAssets:I

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextFont:I

    invoke-virtual {v12, v13, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextStyle:I

    invoke-virtual {v12, v13, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v12}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v13

    new-instance v12, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextSize:I

    sget v15, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_message:I

    invoke-static {v0, v15}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v15

    invoke-virtual {v12, v14, v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiDraftMessageLabelTextColor:I

    sget v15, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v15}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v15

    invoke-virtual {v12, v14, v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageFontAssets:I

    sget v15, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextFont:I

    invoke-virtual {v12, v14, v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageTextStyle:I

    invoke-virtual {v12, v14, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v12}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v12

    new-instance v14, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v14, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v15, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageDateTextSize:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_message_date:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v14, v15, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageDateTextColor:I

    sget v15, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v15}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v15

    invoke-virtual {v14, v7, v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageDateFontAssets:I

    sget v15, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageDateTextFont:I

    invoke-virtual {v14, v7, v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLastMessageDateTextStyle:I

    invoke-virtual {v14, v7, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v14

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiShowChannelDeliveryStatusIndicator:I

    const/4 v15, 0x1

    invoke-virtual {v1, v7, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v28

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiIndicatorSentIcon:I

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-nez v7, :cond_2

    sget v7, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_check_single:I

    invoke-static {v0, v7}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v15, v7

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiIndicatorDeliveredIcon:I

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-nez v7, :cond_3

    sget v7, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_check_double_grey:I

    invoke-static {v0, v7}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v16, v7

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiIndicatorReadIcon:I

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-nez v7, :cond_4

    sget v7, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_check_double:I

    invoke-static {v0, v7}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v17, v7

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiIndicatorPendingSyncIcon:I

    invoke-static {v1, v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-nez v7, :cond_5

    sget v7, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_clock:I

    invoke-static {v0, v7}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v18, v7

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiForegroundLayoutColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_snow:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v7, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v19

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiUnreadMessageCounterTextSize:I

    move/from16 v20, v2

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v3, v7, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiUnreadMessageCounterTextColor:I

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v0, v7}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v2, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiUnreadMessageCounterFontAssets:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiUnreadMessageCounterTextFont:I

    invoke-virtual {v3, v2, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiUnreadMessageCounterTextStyle:I

    const/4 v7, 0x0

    invoke-virtual {v3, v2, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiUnreadMessageCounterBackgroundColor:I

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_red:I

    invoke-static {v0, v7}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v21

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiMutedChannelIcon:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_6

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mute_black:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v22, v3

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelsItemSeparatorDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_7

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_divider:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v23, v3

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLoadingView:I

    sget v7, Lio/getstream/chat/android/ui/R$layout;->stream_ui_default_loading_view:I

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v24

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiEmptyStateView:I

    sget v7, Lio/getstream/chat/android/ui/R$layout;->stream_ui_channel_list_empty_state_view:I

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v25

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiLoadingMoreView:I

    sget v7, Lio/getstream/chat/android/ui/R$layout;->stream_ui_channel_list_loading_more_view:I

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v26

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiEdgeEffectColor:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v27

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelHeight:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_height:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v30

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelMarginStart:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_margin_start:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v31

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelMarginEnd:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_margin_end:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v32

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelTitleMarginStart:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_title_margin_start:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v33

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelVerticalSpacerHeight:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_vertical_spacer_height:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v3, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v34

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelVerticalSpacerPosition:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_list_item_vertical_spacer_position:I

    invoke-static {v0, v7}, Lu4/k;->a(Landroid/content/res/Resources;I)F

    move-result v0

    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v35

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    move/from16 v7, v20

    move-object/from16 v20, v2

    invoke-direct/range {v3 .. v35}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZZZIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/font/TextStyle;ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILjava/lang/Integer;ZZIIIIIF)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getChannelListStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v3}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;

    return-object v0
.end method
