.class public final Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0080\u0002\u00a2\u0006\u0002\u0008\nJ\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "invoke$stream_chat_android_ui_components_release",
        "createAttachmentPickerDialogStyle",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "a",
        "Landroid/content/res/TypedArray;",
        "DEFAULT_MESSAGE_REPLY_BACKGROUND_STROKE_WIDTH",
        "",
        "DEFAULT_TRAILING_BUTTON_SIZE",
        "",
        "DEFAULT_TRAILING_BUTTON_PADDING",
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

.method private final createAttachmentPickerDialogStyle(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;
    .locals 52

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerSaveAttachmentsOnDismiss:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerBackgroundColor:I

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_smoke:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessButtonTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessButtonTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessButtonTextFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessButtonTextFont:I

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessButtonTextStyle:I

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v8

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerSubmitAttachmentsButtonIconDrawable:I

    invoke-static {v1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_next:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAttachmentTabToggleButtonStateList:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-nez v2, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_attachment_tab_button:I

    invoke-static {v0, v2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    :cond_1
    move-object v10, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentsTabEnabled:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v11

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentsTabIconDrawable:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_2

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_permission_media:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v12, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToMediaButtonText:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    const-string v4, "getString(...)"

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    :goto_0
    move-object v13, v2

    goto :goto_1

    :cond_3
    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_gallery_access:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToMediaIconDrawable:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_4

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_permission_media:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move-object v14, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoLengthTextVisible:I

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoLengthTextSize:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v5, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoLengthTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoLengthTextFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoLengthTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoLengthTextStyle:I

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoIconVisible:I

    const/4 v5, 0x1

    invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoIconDrawable:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_5

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_video:I

    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v18, v5

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerVideoIconDrawableTint:I

    invoke-static {v1, v5}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v19

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentNoMediaText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_no_files:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    move-object/from16 v20, v5

    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move-object/from16 v21, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentNoMediaTextSize:I

    move/from16 v22, v3

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentNoMediaTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentNoMediaTextFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentNoMediaTextFont:I

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaAttachmentNoMediaTextStyle:I

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsTabEnabled:I

    const/4 v5, 0x1

    invoke-virtual {v1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsTabIconDrawable:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_7

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_permission_file:I

    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v23, v5

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToFilesButtonText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_8

    :goto_2
    move-object/from16 v24, v5

    goto :goto_3

    :cond_8
    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_files_access:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToFilesIconDrawable:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_9

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_permission_file:I

    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v25, v5

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_a

    :goto_4
    move-object/from16 v26, v5

    goto :goto_5

    :cond_a
    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_files_allow_audio_access:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :goto_5
    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move-object/from16 v27, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioTextSize:I

    move/from16 v28, v3

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioTextFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioTextFont:I

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioTextStyle:I

    const/4 v3, 0x1

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToAudioIconDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_b

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_manager:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_b
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_c

    :goto_6
    move-object/from16 v29, v5

    goto :goto_7

    :cond_c
    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_files_allow_visual_media_access:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToMoreVisualMediaText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_d

    :goto_8
    move-object/from16 v30, v5

    goto :goto_9

    :cond_d
    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_files_allow_more_visual_media:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    :goto_9
    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move-object/from16 v31, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaTextSize:I

    move-object/from16 v32, v3

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaTextFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaTextFont:I

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaTextStyle:I

    const/4 v3, 0x1

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToVisualMediaIconDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_e

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_manager:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_e
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerRecentFilesText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_f

    :goto_a
    move-object/from16 v33, v5

    goto :goto_b

    :cond_f
    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_recent_files:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :goto_b
    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move-object/from16 v34, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerRecentFilesTextSize:I

    move-object/from16 v35, v3

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_spacing_medium:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerRecentFilesTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerRecentFilesTextFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerRecentFilesTextFont:I

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerRecentFilesTextStyle:I

    const/4 v3, 0x1

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileManagerIconDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_10

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_manager:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_10
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsNoFilesText:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_11

    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_no_files:I

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_11
    move-object/from16 v36, v5

    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move-object/from16 v37, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsNoFilesTextSize:I

    move-object/from16 v38, v3

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsNoFilesTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsNoFilesTextFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsNoFilesTextFont:I

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentsNoFilesTextStyle:I

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemNameTextSize:I

    move-object/from16 v39, v2

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v3, v5, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemNameTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_black:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemNameTextFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemNameTextFont:I

    invoke-virtual {v3, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemNameTextStyle:I

    const/4 v5, 0x1

    invoke-virtual {v3, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v3, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemSizeTextSize:I

    move-object/from16 v40, v2

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v3, v5, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemSizeTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v3, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemSizeTextFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemSizeTextFont:I

    invoke-virtual {v3, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemSizeTextStyle:I

    const/4 v5, 0x1

    invoke-virtual {v3, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemCheckboxSelectedDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_12

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_circle_blue:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_12
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemCheckboxDeselectedDrawable:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_13

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_manager:I

    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v41, v5

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerFileAttachmentItemCheckboxTextColor:I

    move-object/from16 v42, v2

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v0, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v5, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerCameraAttachmentsTabEnabled:I

    move/from16 v43, v2

    const/4 v2, 0x1

    invoke-virtual {v1, v5, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerCameraAttachmentsTabIconDrawable:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_14

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_permission_camera:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v44, v2

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerPollAttachmentsTabEnabled:I

    move-object/from16 v45, v3

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerPollAttachmentsTabIconDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_15

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_poll:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v46, v3

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToCameraButtonText:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_16

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_16

    :goto_c
    move-object/from16 v47, v3

    goto :goto_d

    :cond_16
    sget v3, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_camera_access:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_c

    :goto_d
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerAllowAccessToCameraIconDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_17

    sget v3, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_attachment_permission_camera:I

    invoke-static {v0, v3}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v48, v3

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerMediaMode:I

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->PHOTO_AND_VIDEO:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    const/4 v4, -0x1

    invoke-virtual {v1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    if-ltz v0, :cond_18

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;->values()[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;

    move-result-object v3

    aget-object v3, v3, v0

    :cond_18
    move-object/from16 v49, v3

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerSystemPickerEnabled:I

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerSystemPickerVisualMediaAllowMultiple:I

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v50

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsPickerSystemPickerVisualMediaType:I

    sget-object v4, Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;->IMAGE_AND_VIDEO:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    move/from16 v16, v0

    const/4 v0, -0x1

    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    if-ltz v0, :cond_19

    invoke-static {}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;->values()[Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    move-result-object v1

    aget-object v4, v1, v0

    :cond_19
    move-object/from16 v51, v4

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move/from16 v17, v43

    move/from16 v43, v5

    move/from16 v5, v16

    move-object/from16 v16, v21

    move-object/from16 v21, v27

    move-object/from16 v27, v31

    move-object/from16 v31, v34

    move-object/from16 v34, v37

    move-object/from16 v37, v39

    move-object/from16 v39, v42

    move/from16 v42, v17

    move/from16 v17, v22

    move/from16 v22, v28

    move-object/from16 v28, v32

    move-object/from16 v32, v35

    move-object/from16 v35, v38

    move-object/from16 v38, v40

    move-object/from16 v40, v45

    move/from16 v45, v2

    invoke-direct/range {v4 .. v51}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;-><init>(ZZILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZLio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;ZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getAttachmentsPickerStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v4}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    return-object v0
.end method


# virtual methods
.method public final invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;
    .locals 104

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView:[I

    sget v3, Lio/getstream/chat/android/ui/R$attr;->streamUiMessageComposerViewStyle:I

    sget v4, Lio/getstream/chat/android/ui/R$style;->StreamUi_MessageComposerView:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    const-string v3, "obtainStyledAttributes(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x10100d4

    filled-new-array {v4}, [I

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerDividerBackgroundDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_divider:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v8, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "getString(...)"

    if-nez v1, :cond_1

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_instant_commands:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v9, v1

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleTextSize:I

    sget v10, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v10}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v1, v6, v10}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleTextColor:I

    sget v10, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v10}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v1, v6, v10}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleTextFontAssets:I

    sget v10, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleTextFont:I

    invoke-virtual {v1, v6, v10}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleTextStyle:I

    invoke-virtual {v1, v6, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v10

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsTitleIconDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_2

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_command_blue:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemIconDrawableTintColor:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v12

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionsBackgroundColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v2, v1, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v13

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandNameTextSize:I

    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v1, v6, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandNameTextColor:I

    sget v14, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v14}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v14

    invoke-virtual {v1, v6, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandNameTextFontAssets:I

    sget v14, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandNameTextFont:I

    invoke-virtual {v1, v6, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandNameTextStyle:I

    invoke-virtual {v1, v6, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v14

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandDescriptionText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_command_template:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    move-object v15, v1

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandDescriptionTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v6, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandDescriptionTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandDescriptionTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandDescriptionTextFont:I

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandSuggestionItemCommandDescriptionTextStyle:I

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v16

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionsBackgroundColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v1, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v17

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemIconDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_4

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mention:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v18, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemIconDrawableTintColor:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v19

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemUsernameTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemUsernameTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemUsernameTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemUsernameTextFont:I

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemUsernameTextStyle:I

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v20

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemMentionText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_mention_template:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    move-object/from16 v21, v1

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemMentionTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemMentionTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemMentionTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemMentionTextFont:I

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionSuggestionItemMentionTextStyle:I

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v22

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandsHandlingEnabled:I

    const/4 v5, 0x1

    invoke-virtual {v2, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v23

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMentionsHandlingEnabled:I

    invoke-virtual {v2, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v24

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputTextSize:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    move/from16 v26, v7

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_size_input:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {v1, v6, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputTextFont:I

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputTextStyle:I

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputHintText:I

    sget v6, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_hint_normal:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->hint(ILjava/lang/String;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputHintColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_hint:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->hintColor(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputBackgroundDrawable:I

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_6

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_shape_edit_text_round:I

    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_6
    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputCursorDrawable:I

    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v27

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerScrollbarEnabled:I

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v28

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerScrollbarFadingEnabled:I

    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v29

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputMaxLines:I

    const/4 v7, 0x7

    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v30

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputCannotSendHintText:I

    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    sget v6, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_hint_cannot_send_message:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    move-object/from16 v31, v6

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordText:I

    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v43

    new-instance v6, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v6, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordTextSize:I

    move-object/from16 v32, v1

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v6, v7, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordTextColor:I

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_snow:I

    invoke-static {v0, v7}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v6, v1, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordTextFontAssets:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordTextFont:I

    invoke-virtual {v6, v1, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordTextStyle:I

    const/4 v7, 0x1

    invoke-virtual {v6, v1, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v44

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordBackgroundDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_8

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_message_composer_audio_record_hold_background:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v45, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingHoldToRecordBackgroundDrawableTint:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v46

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_slide_to_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    move-object/from16 v47, v1

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelTextSize:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelTextColor:I

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v7}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelTextFontAssets:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelTextFont:I

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelTextStyle:I

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v48

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelStartDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_a

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_arrow_left:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v49, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSlideToCancelStartDrawableTint:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v50

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingButtonIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_b

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mic:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v51, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingButtonIconDrawableTint:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v52

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingButtonBackgroundDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_c

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_message_composer_audio_record_mic_background:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v53, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingButtonBackgroundDrawableTint:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v54

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingLockIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_d

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mic_lock:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v55, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingLockIconDrawableTint:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v56

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingLockedIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_e

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mic_locked:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v57, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingFloatingLockedIconDrawableTint:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v58

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingWaveformColor:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v59

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsButtonVisible:I

    const/4 v7, 0x1

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v60

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsButtonIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_f

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_attach:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v61, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsButtonIconTintList:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorStateListCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v62

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAttachmentsButtonRippleColor:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v63

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandsButtonVisible:I

    const/4 v7, 0x1

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v64

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandsButtonIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_10

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_command:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v65, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandsButtonIconTintList:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorStateListCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v66

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCommandsButtonRippleColor:I

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v67

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxVisible:I

    const/4 v7, 0x1

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v68

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v69

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    :goto_0
    move-object/from16 v70, v1

    goto :goto_1

    :cond_11
    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_send_to_channel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxTextSize:I

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxTextColor:I

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v7}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxTextFontAssets:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxTextFont:I

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAlsoSendToChannelCheckboxTextStyle:I

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v71

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerEditModeText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_12

    :goto_2
    move-object/from16 v72, v1

    goto :goto_3

    :cond_12
    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_mode_edit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerEditModeIconDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_13

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_edit:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v73, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerReplyModeText:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    :goto_4
    move-object/from16 v74, v1

    goto :goto_5

    :cond_14
    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_mode_reply:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :goto_5
    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerReplyModeIconDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_15

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_arrow_curve_left_grey:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v75, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerDismissModeIconDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_16

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_clear:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v76, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerSendMessageButtonEnabled:I

    const/4 v7, 0x1

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v77

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerSendMessageButtonIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_17

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_send_message:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v78, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerSendMessageButtonIconTintList:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorStateListCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v79

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerSendMessageButtonWidth:I

    const/16 v4, 0x20

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v6

    invoke-virtual {v2, v1, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v80

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerSendMessageButtonHeight:I

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v6

    invoke-virtual {v2, v1, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v81

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerSendMessageButtonPadding:I

    const/4 v6, 0x4

    invoke-static {v6}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v7

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v82

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonEnabled:I

    const/4 v7, 0x1

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v84

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonVisible:I

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v83

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonPreferred:I

    const/4 v7, 0x0

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v85

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingSendOnComplete:I

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v86

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonIconDrawable:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_18

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mic:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v87, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonIconTintList:I

    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorStateListCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v88

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonWidth:I

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v7

    invoke-virtual {v2, v1, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v89

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonHeight:I

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v4

    invoke-virtual {v2, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v90

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordingButtonPadding:I

    invoke-static {v6}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v4

    invoke-virtual {v2, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v91

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCooldownTimerTextSize:I

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCooldownTimerTextColor:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v1, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCooldownTimerTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCooldownTimerTextFont:I

    invoke-virtual {v1, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCooldownTimerTextStyle:I

    const/4 v7, 0x1

    invoke-virtual {v1, v4, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v92

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerCooldownTimerBackgroundDrawable:I

    invoke-virtual {v2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_19

    sget v1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_cooldown_badge_background:I

    invoke-static {v0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v93, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_android_inputType:I

    const v4, 0x24001

    invoke-virtual {v2, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerShowMessageReplyView:I

    const/4 v7, 0x1

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v33

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawable:I

    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_1a

    sget v4, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    invoke-static {v0, v4}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v34, v4

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawableTint:I

    invoke-static {v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v35

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconBackgroundColor:I

    invoke-static {v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v36

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoCornerRadius:I

    const/16 v6, 0x14

    invoke-static {v6}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v6

    invoke-virtual {v2, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v37

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconElevation:I

    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v38

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawablePaddingTop:I

    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawablePaddingBottom:I

    invoke-virtual {v2, v7, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    move/from16 v39, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawablePaddingStart:I

    invoke-virtual {v2, v1, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    move/from16 v40, v1

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawablePaddingEnd:I

    invoke-virtual {v2, v1, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageInputVideoAttachmentIconDrawablePadding:I

    invoke-static {v2, v6}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDimensionOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Float;

    move-result-object v6

    const/16 v41, 0x0

    if-eqz v6, :cond_1b

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    float-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_6
    move/from16 v42, v1

    goto :goto_7

    :cond_1b
    move-object/from16 v6, v41

    goto :goto_6

    :goto_7
    sget v1, Lio/getstream/chat/android/ui/common/R$font;->stream_roboto_medium:I

    invoke-static {v0, v1}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-nez v1, :cond_1c

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :cond_1c
    move/from16 v94, v4

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyShowUserAvatar:I

    move-object/from16 v95, v5

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyBackgroundColor:I

    move/from16 v25, v4

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {v0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    new-instance v5, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v5, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move/from16 v96, v4

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextSizeMine:I

    sget-object v97, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;

    invoke-virtual/range {v97 .. v97}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v97, v6

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v6

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v5, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextColorMine:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v6

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v5, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextFontAssetsMine:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextStyleMine:I

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5, v4, v6, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextStyleMine:I

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v4

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyStrokeColorMine:I

    sget v6, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_gainsboro:I

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v2, v5, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyStrokeWidthMine:I

    move-object/from16 v98, v4

    const/high16 v4, 0x40800000    # 4.0f

    invoke-virtual {v2, v6, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    new-instance v4, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v4, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move/from16 v100, v5

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextSizeTheirs:I

    move/from16 v101, v6

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v6

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextColorTheirs:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v6

    invoke-static {v0, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextFontAssetsTheirs:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextStyleTheirs:I

    invoke-virtual {v4, v5, v6, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyTextStyleTheirs:I

    const/4 v6, 0x0

    invoke-virtual {v4, v1, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyStrokeColorTheirs:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_gainsboro:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerMessageReplyStrokeWidthTheirs:I

    const/high16 v6, 0x40800000    # 4.0f

    invoke-virtual {v2, v5, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageComposerView_streamUiMessageComposerAudioRecordPlayerViewStyle:I

    move-object/from16 v99, v1

    sget v1, Lio/getstream/chat/android/ui/R$style;->StreamUi_AudioRecordPlayerView:I

    invoke-virtual {v2, v6, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    sget v6, Lio/getstream/chat/android/ui/R$style;->StreamUi_AudioRecordPlayerView:I

    if-eq v1, v6, :cond_1d

    sget-object v6, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView:[I

    invoke-virtual {v0, v1, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;

    invoke-virtual {v3, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;->invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    move-result-object v41

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1d
    move-object/from16 v103, v41

    if-eqz v97, :cond_1e

    invoke-virtual/range {v97 .. v97}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move/from16 v94, v1

    :cond_1e
    if-eqz v97, :cond_1f

    invoke-virtual/range {v97 .. v97}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_1f
    if-eqz v97, :cond_20

    invoke-virtual/range {v97 .. v97}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move/from16 v41, v1

    goto :goto_8

    :cond_20
    move/from16 v41, v40

    :goto_8
    if-eqz v97, :cond_21

    invoke-virtual/range {v97 .. v97}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move/from16 v42, v1

    :cond_21
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;

    invoke-direct {v1, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;->createAttachmentPickerDialogStyle(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move-result-object v102

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move/from16 v40, v94

    move/from16 v94, v25

    move-object/from16 v25, v32

    move/from16 v32, v39

    move/from16 v39, v40

    move/from16 v40, v7

    move/from16 v7, v26

    move-object/from16 v26, v95

    move/from16 v95, v96

    move-object/from16 v96, v98

    move/from16 v97, v100

    move/from16 v98, v101

    move/from16 v100, v4

    move/from16 v101, v5

    invoke-direct/range {v6 .. v103}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;-><init>(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;ILio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZZLio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZZILjava/lang/String;IZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;FFIIIILjava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;IIIZZZZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;IIILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;ZILio/getstream/chat/android/ui/font/TextStyle;IFLio/getstream/chat/android/ui/font/TextStyle;IFLio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getMessageComposerStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v6}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    return-object v0
.end method
