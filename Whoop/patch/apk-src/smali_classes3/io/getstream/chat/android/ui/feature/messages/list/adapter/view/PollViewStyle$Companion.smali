.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0080\u0002\u00a2\u0006\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "invoke$stream_chat_android_ui_components_release",
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
.method public final invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->PollView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiMessageListPollStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_MessageList_Poll:I

    move-object/from16 v4, p2

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "obtainStyledAttributes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollTitleTextSize:I

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollTitleTextColor:I

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v4}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollTitleFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollTitleTextFont:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollTitleTextStyle:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v6

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollOptionCheckDrawable:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_poll_option_selector:I

    invoke-static {v0, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    move-object v8, v2

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSubtitleTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSubtitleTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSubtitleFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSubtitleTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSubtitleTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v7

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollOptionTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollOptionTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollOptionFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollOptionTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollOptionTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v9

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollVotesTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollVotesTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollVotesFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollVotesTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollVotesTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v10

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollCloseTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollCloseTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollCloseFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollCloseTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollCloseTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v11

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollResultsTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollResultsTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollResultsFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollResultsTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollResultsTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v12

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollShowAllOptionsTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollShowAllOptionsTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollShowAllOptionsFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollShowAllOptionsTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollShowAllOptionsTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v13

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSuggestOptionTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSuggestOptionTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSuggestOptionFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSuggestOptionTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollSuggestOptionTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v14

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollAddCommentTextSize:I

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollAddCommentTextColor:I

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollAddCommentFontAssets:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollAddCommentTextFont:I

    invoke-virtual {v2, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollAddCommentTextStyle:I

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v15

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollViewCommentsTextSize:I

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollViewCommentsTextColor:I

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v2, v1, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollViewCommentsFontAssets:I

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollViewCommentsTextFont:I

    invoke-virtual {v2, v0, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->PollView_streamUiPollViewCommentsTextStyle:I

    invoke-virtual {v2, v0, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v16

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-direct/range {v5 .. v16}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getPollViewStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v5}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    return-object v0
.end method
