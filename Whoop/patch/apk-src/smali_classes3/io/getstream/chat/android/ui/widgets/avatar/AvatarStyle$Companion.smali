.class public final Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;
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
        "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->AvatarView:[I

    const/4 v2, 0x0

    move-object/from16 v3, p2

    invoke-virtual {v0, v3, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v3, "obtainStyledAttributes(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarBorderWidth:I

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_avatar_border_width:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarBorderColor:I

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_avatar_initials:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarTextFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarTextFont:I

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarTextStyle:I

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v8

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiGroupAvatarTextSize:I

    sget v9, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_group_avatar_initials:I

    invoke-static {v0, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v3, v4, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiGroupAvatarTextColor:I

    sget v9, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v9}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v3, v4, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiGroupAvatarTextFontAssets:I

    sget v9, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiGroupAvatarTextFont:I

    invoke-virtual {v3, v4, v9}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiGroupAvatarTextStyle:I

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarOnlineIndicatorEnabled:I

    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarOnlineIndicatorPosition:I

    sget-object v3, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->TOP_END:Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    const/4 v4, -0x1

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;->values()[Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;

    move-result-object v3

    aget-object v3, v3, v2

    :cond_0
    move-object v11, v3

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarOnlineIndicatorColor:I

    const v3, -0xff0100

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v12

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarOnlineIndicatorBorderColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v13

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarShape:I

    sget-object v2, Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;->CIRCLE:Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;

    invoke-virtual {v1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;->values()[Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;

    move-result-object v2

    aget-object v2, v2, v0

    :cond_1
    move-object v14, v2

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->AvatarView_streamUiAvatarBorderRadius:I

    const/4 v2, 0x4

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v15, v0

    new-instance v5, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    invoke-direct/range {v5 .. v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;-><init>(IILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;IILio/getstream/chat/android/ui/widgets/avatar/AvatarShape;F)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getAvatarStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v5}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    return-object v0
.end method
