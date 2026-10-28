.class public final Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView:[I

    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiPinnedMessageListStyle:I

    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_PinnedMessageList:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListBackground:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_snow:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListEmptyStateDrawable:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_pinned_messages_empty:I

    invoke-static {p1, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListSenderNameTextSize:I

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {p1, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListSenderNameTextColor:I

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {p1, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListSenderNameTextFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListSenderNameTextFont:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListSenderNameTextStyle:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {p1, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {p1, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTextFont:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTextStyle:I

    invoke-virtual {v3, v5, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v3

    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTimeTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {p1, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v5, p2, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTimeTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {p1, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v5, p2, p1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTimeTextFontAssets:I

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTimeTextFont:I

    invoke-virtual {v5, p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->PinnedMessageListView_streamUiPinnedMessageListMessageTimeTextStyle:I

    invoke-virtual {v5, p1, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-direct {v4, v2, v3, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-direct {p2, v0, v1, v4}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;-><init>(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getPinnedMessageListViewStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    return-object p1
.end method
