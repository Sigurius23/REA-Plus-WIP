.class public final Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;
    .locals 22

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiSearchInputViewStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_SearchInputView:I

    move-object/from16 v4, p2

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewSearchIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_search:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v6, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewClearInputIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_clear:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v7, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewBackground:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_2

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_shape_search_view_background:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v8, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewBackgroundOutlineColor:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewBackgroundOutlineWidth:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDimensionOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_3
    move-object v3, v4

    :goto_0
    if-eqz v2, :cond_4

    if-eqz v3, :cond_4

    new-instance v4, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v4, v3, v2}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;-><init>(II)V

    :cond_4
    move-object v9, v4

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewContainerBackground:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewHintColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewHintText:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object v11, v2

    goto :goto_3

    :cond_6
    :goto_2
    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_search_input_hint:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :goto_3
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewTextSize:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewTextMarginStart:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_text_margin_start:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v13

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewTextMarginEnd:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_text_margin_end:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v14

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewHeight:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_height:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v15

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewIconSearchWidth:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_icon_search_width:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v16

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewIconSearchHeight:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_icon_search_height:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v17

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewIconSearchMarginStart:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_icon_search_margin_start:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v18

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewIconClearWidth:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_icon_clear_width:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v19

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewIconClearHeight:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_icon_clear_height:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v20

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->SearchInputView_streamUiSearchInputViewIconClearMarginEnd:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_search_input_icon_clear_margin_end:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v21

    new-instance v3, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    invoke-direct/range {v3 .. v21}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;-><init>(IILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;ILjava/lang/String;IIIIIIIIII)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getSearchInputViewStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v3}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    return-object v0
.end method
