.class public final Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewShowUserAvatars:I

    const/4 v3, 0x1

    .line 8
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 9
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoButtonIcon:I

    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    .line 11
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    .line 12
    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_0
    move-object v6, v2

    .line 13
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconTint:I

    .line 14
    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v7

    .line 15
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconBackgroundColor:I

    .line 16
    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    .line 17
    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    .line 19
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconCornerRadius:I

    const/4 v3, 0x0

    .line 20
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v9

    .line 21
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconElevation:I

    .line 22
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v10

    .line 23
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconPaddingTop:I

    const/4 v3, 0x0

    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 25
    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconPaddingBottom:I

    .line 26
    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 27
    sget v11, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconPaddingStart:I

    .line 28
    invoke-virtual {v1, v11, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    .line 29
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconPaddingEnd:I

    .line 30
    invoke-virtual {v1, v12, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 31
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewPlayVideoIconPadding:I

    .line 32
    invoke-static {v1, v12}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDimensionOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Float;

    move-result-object v12

    if-eqz v12, :cond_1

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    float-to-int v12, v12

    .line 33
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    .line 34
    :goto_0
    sget v13, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView_streamUiMediaAttachmentGridViewImagePlaceholder:I

    .line 35
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_2

    .line 36
    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_picture_placeholder:I

    .line 37
    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_2
    move-object v15, v1

    move v0, v4

    .line 38
    new-instance v4, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    if-eqz v12, :cond_3

    .line 39
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_3
    if-eqz v12, :cond_4

    .line 40
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_4
    if-eqz v12, :cond_5

    .line 41
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v11

    :cond_5
    move v13, v11

    if-eqz v12, :cond_6

    .line 42
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_6
    move v12, v0

    move v11, v2

    move v14, v3

    .line 43
    invoke-direct/range {v4 .. v15}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;-><init>(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)V

    .line 44
    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getMediaAttachmentGridViewStyle()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v4}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    return-object v0
.end method

.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->MediaAttachmentGridView:[I

    .line 2
    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiMediaAttachmentGridViewStyle:I

    .line 3
    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_MediaAttachmentGridView:I

    .line 4
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 5
    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    move-result-object p1

    .line 6
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-object p1
.end method
