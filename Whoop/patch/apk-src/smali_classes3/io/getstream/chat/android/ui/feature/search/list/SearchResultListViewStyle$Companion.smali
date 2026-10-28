.class public final Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiSearchResultListViewStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_SearchResultListView:I

    move-object/from16 v4, p2

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListBackground:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSearchInfoBarBackground:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_bg_gradient:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v6, v2

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSearchInfoBarTextSize:I

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSearchInfoBarTextColor:I

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSearchInfoBarTextFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSearchInfoBarTextFont:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSearchInfoBarTextStyle:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v7

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListEmptyStateIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_search_empty:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v8, v2

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListEmptyStateTextSize:I

    sget v9, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v2, v3, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListEmptyStateTextColor:I

    sget v9, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v9}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v2, v3, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListEmptyStateTextFontAssets:I

    sget v9, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListEmptyStateTextFont:I

    invoke-virtual {v2, v3, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListEmptyStateTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListProgressBarIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_2

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_rotating_indeterminate_progress_gradient:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v2

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSenderNameTextSize:I

    sget v11, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_title:I

    invoke-static {v0, v11}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v2, v3, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSenderNameTextColor:I

    sget v11, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v11}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v2, v3, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSenderNameTextFontAssets:I

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSenderNameTextFont:I

    invoke-virtual {v2, v3, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListSenderNameTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTextSize:I

    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_message:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v3, v11, v12}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTextColor:I

    sget v12, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v12}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v3, v11, v12}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTextFontAssets:I

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTextFont:I

    invoke-virtual {v3, v11, v12}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTextStyle:I

    invoke-virtual {v3, v11, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v3

    new-instance v11, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v11, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTimeTextSize:I

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_channel_item_message:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v11, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTimeTextColor:I

    sget v13, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v11, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTimeTextFontAssets:I

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTimeTextFont:I

    invoke-virtual {v11, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResultListMessageTimeTextStyle:I

    invoke-virtual {v11, v12, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v4

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemHeight:I

    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_result_list_item_height:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemMarginStart:I

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_result_item_margin_start:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v1, v11, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v13

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemMarginEnd:I

    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_result_item_margin_end:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v1, v11, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v14

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemTitleMarginStart:I

    sget v15, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_result_item_title_margin_start:I

    invoke-static {v0, v15}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v15

    invoke-virtual {v1, v11, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v15

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemVerticalSpacerHeight:I

    move/from16 p2, v5

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_result_item_vertical_spacer_height:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v11, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v16

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemVerticalSpacerPosition:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    move-object/from16 v17, v6

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_result_item_vertical_spacer_position:I

    invoke-static {v11, v6}, Lu4/k;->a(Landroid/content/res/Resources;I)F

    move-result v6

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->SearchResultListView_streamUiSearchResulListItemSeparatorDrawable:I

    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_3

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_divider:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v18, v1

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

    new-instance v11, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-direct {v11, v2, v3, v4}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    move-object v4, v0

    move-object/from16 v6, v17

    move/from16 v17, v5

    move/from16 v5, p2

    invoke-direct/range {v4 .. v18}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;-><init>(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;IIIIIFLandroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getSearchResultListViewStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v4}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

    return-object v0
.end method
