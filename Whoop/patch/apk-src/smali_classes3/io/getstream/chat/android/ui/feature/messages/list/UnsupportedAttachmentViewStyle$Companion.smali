.class public final Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView:[I

    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiMessageListUnsupportedAttachmentStyle:I

    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_MessageList_UnsupportedAttachment:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentBackgroundColor:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentStrokeColor:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentStrokeWidth:I

    const/4 v1, 0x1

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentCornerRadius:I

    const/16 v1, 0xc

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentTitleTextSize:I

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {p1, v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentTitleTextColor:I

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentTitleFontAssets:I

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentTitleTextFont:I

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->UnsupportedAttachmentView_streamUiUnsupportedAttachmentTitleTextStyle:I

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v7

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;-><init>(IIIILio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getUnsupportedAttachmentStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object p1

    invoke-interface {p1, v2}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;

    return-object p1
.end method
