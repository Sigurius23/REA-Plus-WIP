.class public final Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;
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
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
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
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView:[I

    const/4 v2, 0x0

    move-object/from16 v3, p2

    invoke-virtual {v0, v3, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v3, "obtainStyledAttributes(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelListView_streamUiChannelActionsDialogStyle:I

    sget v5, Lio/getstream/chat/android/ui/R$style;->StreamUi_ChannelList_ActionsDialog:I

    invoke-virtual {v1, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    sget-object v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog:[I

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberNamesTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberNamesTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberNamesTextFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberNamesTextFont:I

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberNamesTextStyle:I

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v7

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberInfoTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberInfoTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberInfoTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberInfoTextFont:I

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsMemberInfoTextStyle:I

    invoke-virtual {v3, v4, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v8

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsItemTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsItemTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsItemTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsItemTextFont:I

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsItemTextStyle:I

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsWarningItemTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsWarningItemTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_red:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsWarningItemTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsWarningItemTextFont:I

    invoke-virtual {v3, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsWarningItemTextStyle:I

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v10

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsViewInfoIcon:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_0

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_single_user:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v11, v3

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsViewInfoEnabled:I

    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsLeaveGroupIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_leave_group:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsLeaveGroupEnabled:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsDeleteConversationIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_2

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_delete:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v15, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsDeleteConversationEnabled:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v16

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsCancelIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_3

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_clear:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v17, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsCancelEnabled:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v18

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->ChannelActionsDialog_streamUiChannelActionsBackground:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_4

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_round_bottom_sheet:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v19, v1

    new-instance v6, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    invoke-direct/range {v6 .. v19}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getChannelActionsDialogStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v6}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;

    return-object v0
.end method
