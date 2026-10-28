.class public final Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0086\u0002J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "it",
        "Landroid/content/res/TypedArray;",
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
.method public final invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    .line 7
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentOptionTextSize:I

    .line 8
    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    .line 9
    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 10
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentOptionTextColor:I

    .line 11
    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    .line 12
    invoke-static {v0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    .line 13
    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 14
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentOptionTextFontAssets:I

    .line 15
    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentOptionTextFont:I

    .line 16
    sget v5, Lio/getstream/chat/android/ui/common/R$font;->stream_roboto_medium:I

    invoke-static {v0, v5}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v5

    if-nez v5, :cond_0

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {v2, v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 18
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentOptionTextStyle:I

    const/4 v4, 0x0

    .line 19
    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 20
    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v6

    .line 21
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentOptionsBackgroundColor:I

    .line 22
    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_snow:I

    .line 23
    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    .line 25
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiAttachmentReplyEnabled:I

    const/4 v3, 0x1

    .line 26
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 27
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiReplyIcon:I

    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    .line 29
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_arrow_curve_left_grey:I

    .line 30
    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v9, v2

    .line 32
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiShowInChatEnabled:I

    .line 33
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    .line 34
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiShowInChatIcon:I

    .line 35
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_2

    .line 36
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_show_in_chat:I

    .line 37
    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v2

    .line 39
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiSaveMediaEnabled:I

    .line 40
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    .line 41
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiSaveMediaIcon:I

    .line 42
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_3

    .line 43
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_download:I

    .line 44
    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 45
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    move-object v13, v2

    .line 46
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiDeleteEnabled:I

    .line 47
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    .line 48
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiDeleteIcon:I

    .line 49
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_4

    .line 50
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_delete:I

    .line 51
    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 52
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move-object v15, v2

    .line 53
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView_streamUiDeleteTextTint:I

    .line 54
    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_red:I

    .line 55
    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 56
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v16

    .line 57
    new-instance v5, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    invoke-direct/range {v5 .. v16}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;IZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;I)V

    .line 58
    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getAttachmentGalleryOptionsStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v5}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    return-object v0
.end method

.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->AttachmentOptionsView:[I

    .line 2
    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiAttachmentGalleryOptionsStyle:I

    .line 3
    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_AttachmentGallery_Options:I

    .line 4
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    move-result-object p1

    return-object p1
.end method
