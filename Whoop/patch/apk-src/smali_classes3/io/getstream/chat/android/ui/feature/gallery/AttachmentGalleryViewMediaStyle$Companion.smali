.class public final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;
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
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoButtonIcon:I

    .line 8
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    .line 9
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    .line 10
    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_0
    move-object v4, v2

    .line 11
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconTint:I

    .line 12
    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v5

    .line 13
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconBackgroundColor:I

    .line 14
    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    .line 15
    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 16
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    .line 17
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconCornerRadius:I

    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    .line 19
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconElevation:I

    .line 20
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    .line 21
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconPaddingTop:I

    const/4 v3, 0x0

    .line 22
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 23
    sget v9, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconPaddingBottom:I

    .line 24
    invoke-virtual {v1, v9, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    .line 25
    sget v10, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconPaddingStart:I

    .line 26
    invoke-virtual {v1, v10, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v10

    .line 27
    sget v11, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconPaddingEnd:I

    .line 28
    invoke-virtual {v1, v11, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 29
    sget v11, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayVideoIconPadding:I

    .line 30
    invoke-static {v1, v11}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDimensionOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Float;

    move-result-object v11

    if-eqz v11, :cond_1

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    float-to-int v11, v11

    .line 31
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_0

    :cond_1
    const/4 v11, 0x0

    .line 32
    :goto_0
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayIconWidth:I

    const/4 v13, -0x2

    .line 33
    invoke-virtual {v1, v12, v13}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v12

    .line 34
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaPlayIconHeight:I

    .line 35
    invoke-virtual {v1, v14, v13}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v14

    .line 36
    sget v13, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments_streamUiAttachmentGalleryViewMediaImagePlaceholder:I

    .line 37
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_2

    .line 38
    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_picture_placeholder:I

    .line 39
    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_2
    move-object v15, v1

    move v0, v3

    .line 40
    new-instance v3, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    if-eqz v11, :cond_3

    .line 41
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_3
    if-eqz v11, :cond_4

    .line 42
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :cond_4
    if-eqz v11, :cond_5

    .line 43
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :cond_5
    if-eqz v11, :cond_6

    .line 44
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_6
    move v11, v10

    move v13, v12

    move v12, v0

    move v10, v9

    move v9, v2

    .line 45
    invoke-direct/range {v3 .. v15}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIIIILandroid/graphics/drawable/Drawable;)V

    .line 46
    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getAttachmentGalleryViewMediaStyle()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v3}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    return-object v0
.end method

.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->AttachmentGalleryVideoAttachments:[I

    .line 2
    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiAttachmentGalleryVideoAttachmentsStyle:I

    .line 3
    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_AttachmentGallery_VideoAttachments:I

    .line 4
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 5
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;->invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;

    move-result-object p1

    .line 6
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-object p1
.end method
