.class public final Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView:[I

    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiMessageListFileAttachmentStyle:I

    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_MessageList_FileAttachment:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentProgressBarDrawable:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_rotating_indeterminate_progress_gradient:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v6, v0

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentBackgroundColor:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentActionButton:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_icon_download:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v7, v0

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentTitleTextSize:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {p1, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentTitleTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {p1, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentTitleFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentTitleTextFont:I

    invoke-virtual {v0, v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentTitleTextStyle:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentFileSizeTextSize:I

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {p1, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentFileSizeTextColor:I

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {p1, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentFileSizeFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentFileSizeTextFont:I

    invoke-virtual {v0, v1, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentFileSizeTextStyle:I

    invoke-virtual {v0, v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v10

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentFailedAttachmentIcon:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_2

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_warning:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v8, v0

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentStrokeColor:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentStrokeWidth:I

    const/4 v0, 0x1

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->FileAttachmentView_streamUiFileAttachmentCornerRadius:I

    const/16 v0, 0xc

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;-><init>(IIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getFileAttachmentStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object p1

    invoke-interface {p1, v1}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    return-object p1
.end method
