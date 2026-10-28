.class public final Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0080\u0002\u00a2\u0006\u0002\u0008\nJ\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0080\u0002\u00a2\u0006\u0002\u0008\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "invoke$stream_chat_android_ui_components_release",
        "attributes",
        "Landroid/content/res/TypedArray;",
        "default",
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
.method public final default(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;
    .locals 50

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_height:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_start:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_top:I

    invoke-static {v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_end:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_bottom:I

    invoke-static {v0, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    sget-object v6, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    invoke-virtual {v6, v0}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->audioBackground(Landroid/content/Context;)Lkr/g;

    move-result-object v6

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_progress_container_width:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    sget v8, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_progress_container_height:I

    invoke-static {v0, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v8

    sget v9, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_width:I

    invoke-static {v0, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    sget v10, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_height:I

    invoke-static {v0, v10}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v10

    sget v11, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_elevation:I

    invoke-static {v0, v11}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v11

    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_padding:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    sget v13, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_white_shape_circular:I

    invoke-static {v0, v13}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    sget v14, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    invoke-static {v0, v14}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v16

    sget v14, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_pause:I

    invoke-static {v0, v14}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v18

    sget v14, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_rotating_indeterminate_progress_gradient:I

    invoke-static {v0, v14}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    sget v15, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_progress_bar_width:I

    invoke-static {v0, v15}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v15

    move/from16 v17, v3

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_progress_bar_height:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    move-object/from16 v19, v6

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_view_width:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    move/from16 v20, v11

    sget v11, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_view_height:I

    invoke-static {v0, v11}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v11

    move-object/from16 v21, v13

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_view_margin_start:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    new-instance v22, Lio/getstream/chat/android/ui/font/TextStyle;

    move/from16 v33, v13

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_size:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v26

    sget v13, Lio/getstream/chat/android/ui/R$color;->stream_ui_audio_record_player_duration_text_color:I

    invoke-static {v0, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v27

    const/16 v31, 0xe7

    const/16 v32, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v22 .. v32}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_wave_bar_height:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v23

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_wave_bar_margin_start:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v24

    sget v13, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v0, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v25

    sget v13, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {v0, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v26

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_scrubber_width_default:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v29

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_scrubber_width_pressed:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v30

    sget v13, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    invoke-static {v0, v13}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v27

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_file_icon_container_width:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v32

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    move-object/from16 v28, v14

    sget v14, Lio/getstream/chat/android/ui/R$bool;->stream_ui_audio_record_player_file_icon_container_visible:I

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v31

    sget v13, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_aac:I

    invoke-static {v0, v13}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_button_width:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    move-object/from16 v34, v13

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_button_height:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    move/from16 v35, v13

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_button_elevation:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v38

    sget v13, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_literal_white_shape_16dp_corners:I

    invoke-static {v0, v13}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    new-instance v39, Lio/getstream/chat/android/ui/font/TextStyle;

    move-object/from16 v36, v13

    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_text_size:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v43

    sget v13, Lio/getstream/chat/android/ui/R$color;->stream_ui_audio_record_player_speed_text_color:I

    invoke-static {v0, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v44

    const/16 v48, 0xe7

    const/16 v49, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v39 .. v49}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lio/getstream/chat/android/ui/helper/ViewPadding;

    invoke-direct {v0, v1, v2, v4, v5}, Lio/getstream/chat/android/ui/helper/ViewPadding;-><init>(IIII)V

    new-instance v1, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v1, v7, v8}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    new-instance v8, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v8, v9, v10}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    new-instance v9, Lio/getstream/chat/android/ui/helper/ViewPadding;

    invoke-direct {v9, v12, v12, v12, v12}, Lio/getstream/chat/android/ui/helper/ViewPadding;-><init>(IIII)V

    new-instance v2, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v2, v15, v3}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    new-instance v3, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v3, v6, v11}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    new-instance v4, Lio/getstream/chat/android/ui/helper/ViewSize;

    move/from16 v5, v35

    invoke-direct {v4, v14, v5}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    move-object v15, v2

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move/from16 v10, v20

    move-object/from16 v20, v3

    move/from16 v3, v17

    const/16 v17, 0x0

    move-object/from16 v5, v19

    const/16 v19, 0x0

    move-object/from16 v13, v28

    const/16 v28, 0x0

    move-object/from16 v35, v36

    const/16 v36, 0x0

    move-object v7, v1

    move-object/from16 v37, v4

    move-object/from16 v11, v21

    move/from16 v21, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v39

    move-object v4, v0

    invoke-direct/range {v2 .. v38}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;-><init>(ILio/getstream/chat/android/ui/helper/ViewPadding;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewPadding;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;ILio/getstream/chat/android/ui/font/TextStyle;IIIILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IIZILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;I)V

    return-object v2
.end method

.method public final invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;
    .locals 47

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "attributes"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerHeight:I

    .line 8
    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_height:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    .line 9
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 10
    sget v2, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingStart:I

    .line 11
    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_start:I

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 13
    sget v3, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingTop:I

    .line 14
    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_top:I

    invoke-static {v0, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    .line 15
    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 16
    sget v4, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingEnd:I

    .line 17
    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_end:I

    invoke-static {v0, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    .line 18
    invoke-virtual {v1, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 19
    sget v6, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingBottom:I

    .line 20
    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_padding_bottom:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    .line 21
    invoke-virtual {v1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    .line 22
    sget-object v7, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    invoke-virtual {v7, v0}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->audioBackground(Landroid/content/Context;)Lkr/g;

    move-result-object v7

    .line 23
    sget v8, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackProgressContainerWidth:I

    .line 24
    sget v9, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_progress_container_width:I

    invoke-static {v0, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v9

    .line 25
    invoke-virtual {v1, v8, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    .line 26
    sget v9, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackProgressContainerHeight:I

    .line 27
    sget v10, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_progress_container_height:I

    invoke-static {v0, v10}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v10

    .line 28
    invoke-virtual {v1, v9, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    .line 29
    sget v10, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackButtonWidth:I

    .line 30
    sget v11, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_width:I

    invoke-static {v0, v11}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v11

    .line 31
    invoke-virtual {v1, v10, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v10

    .line 32
    sget v11, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackButtonHeight:I

    .line 33
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_height:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 34
    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    .line 35
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackButtonElevation:I

    .line 36
    sget v13, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_elevation:I

    invoke-static {v0, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    .line 37
    invoke-virtual {v1, v12, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 38
    sget v13, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackButtonPadding:I

    .line 39
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_playback_button_padding:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 40
    invoke-virtual {v1, v13, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v13

    .line 41
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackButtonBackground:I

    .line 42
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    if-nez v14, :cond_0

    .line 43
    sget v14, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_white_shape_circular:I

    .line 44
    invoke-static {v0, v14}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    .line 45
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 46
    :cond_0
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlaybackButtonBackgroundTint:I

    .line 47
    invoke-static {v1, v15}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v15

    move/from16 v16, v5

    .line 48
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlayIconDrawable:I

    .line 49
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_1

    .line 50
    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    .line 51
    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 52
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v18, v5

    .line 53
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPlayIconDrawableTint:I

    .line 54
    invoke-static {v1, v5}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v19

    .line 55
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPauseIconDrawable:I

    .line 56
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_2

    .line 57
    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_pause:I

    .line 58
    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 59
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v20, v5

    .line 60
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerPauseIconDrawableTint:I

    .line 61
    invoke-static {v1, v5}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v21

    .line 62
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerProgressBarDrawable:I

    .line 63
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-nez v5, :cond_3

    .line 64
    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_rotating_indeterminate_progress_gradient:I

    .line 65
    invoke-static {v0, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 66
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v17, v5

    .line 67
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerProgressBarDrawableTint:I

    .line 68
    invoke-static {v1, v5}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v22, v5

    .line 69
    sget v5, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerProgressBarWidth:I

    move-object/from16 v23, v7

    .line 70
    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_progress_bar_width:I

    invoke-static {v0, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    .line 71
    invoke-virtual {v1, v5, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 72
    sget v7, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerProgressBarHeight:I

    move/from16 v24, v12

    .line 73
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_progress_bar_height:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 74
    invoke-virtual {v1, v7, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    .line 75
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextViewWidth:I

    move-object/from16 v25, v14

    .line 76
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_view_width:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 77
    invoke-virtual {v1, v12, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 78
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextViewHeight:I

    move-object/from16 v26, v15

    .line 79
    sget v15, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_view_height:I

    invoke-static {v0, v15}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v15

    .line 80
    invoke-virtual {v1, v14, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v14

    .line 81
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextViewMarginStart:I

    move/from16 v27, v12

    .line 82
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_view_margin_start:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 83
    invoke-virtual {v1, v15, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 84
    new-instance v15, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v15, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    move/from16 v28, v12

    .line 85
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextSize:I

    move/from16 v29, v14

    .line 86
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_duration_text_size:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 87
    invoke-virtual {v15, v12, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 88
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextColor:I

    .line 89
    sget v14, Lio/getstream/chat/android/ui/R$color;->stream_ui_audio_record_player_duration_text_color:I

    .line 90
    invoke-static {v0, v14}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v14

    .line 91
    invoke-virtual {v15, v12, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 92
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextFontAssets:I

    .line 93
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextFont:I

    .line 94
    invoke-virtual {v15, v12, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 95
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextStyle:I

    const/4 v14, 0x0

    .line 96
    invoke-virtual {v15, v12, v14}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 97
    invoke-virtual {v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v12

    .line 98
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerWaveBarHeight:I

    .line 99
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_wave_bar_height:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 100
    invoke-virtual {v1, v15, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v14

    .line 101
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerWaveBarMarginStart:I

    move-object/from16 v31, v12

    .line 102
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_wave_bar_margin_start:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 103
    invoke-virtual {v1, v15, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 104
    sget v15, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    .line 105
    invoke-static {v0, v15}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v15

    move/from16 v32, v12

    .line 106
    sget v12, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    .line 107
    invoke-static {v0, v12}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v12

    move/from16 v33, v12

    .line 108
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerScrubberWidthDefault:I

    move/from16 v34, v14

    .line 109
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_scrubber_width_default:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 110
    invoke-virtual {v1, v12, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 111
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerScrubberWidthPressed:I

    move/from16 v35, v12

    .line 112
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_scrubber_width_pressed:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 113
    invoke-virtual {v1, v14, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 114
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerScrubberDrawable:I

    .line 115
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    if-nez v14, :cond_4

    .line 116
    sget v14, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_share_rectangle:I

    .line 117
    invoke-static {v0, v14}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    .line 118
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move/from16 v36, v12

    .line 119
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerScrubberDrawableTint:I

    .line 120
    invoke-static {v1, v12}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v37, v12

    .line 121
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerFileIconContainerWidth:I

    move-object/from16 v38, v14

    .line 122
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_file_icon_container_width:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 123
    invoke-virtual {v1, v12, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 124
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerFileIconContainerVisible:I

    move/from16 v39, v12

    .line 125
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    move/from16 v40, v15

    sget v15, Lio/getstream/chat/android/ui/R$bool;->stream_ui_audio_record_player_file_icon_container_visible:I

    invoke-virtual {v12, v15}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v12

    .line 126
    invoke-virtual {v1, v14, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    .line 127
    sget v14, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerAudioFileIconDrawable:I

    .line 128
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    if-nez v14, :cond_5

    .line 129
    sget v14, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_aac:I

    .line 130
    invoke-static {v0, v14}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    .line 131
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 132
    :cond_5
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonWidth:I

    move/from16 v41, v12

    .line 133
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_button_width:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 134
    invoke-virtual {v1, v15, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 135
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonHeight:I

    move-object/from16 v42, v14

    .line 136
    sget v14, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_button_height:I

    invoke-static {v0, v14}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v14

    .line 137
    invoke-virtual {v1, v15, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v14

    .line 138
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonElevation:I

    move/from16 v43, v12

    .line 139
    sget v12, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_button_elevation:I

    invoke-static {v0, v12}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v12

    .line 140
    invoke-virtual {v1, v15, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v12

    .line 141
    sget v15, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonBackgroundDrawable:I

    .line 142
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v15

    if-nez v15, :cond_6

    .line 143
    sget v15, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_literal_white_shape_16dp_corners:I

    .line 144
    invoke-static {v0, v15}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v15

    .line 145
    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_6
    move/from16 v44, v12

    .line 146
    sget v12, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonBackgroundDrawableTint:I

    .line 147
    invoke-static {v1, v12}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v45, v12

    .line 148
    new-instance v12, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    .line 149
    sget v1, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonTextSize:I

    move-object/from16 v46, v15

    .line 150
    sget v15, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_audio_record_player_speed_text_size:I

    invoke-static {v0, v15}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v15

    .line 151
    invoke-virtual {v12, v1, v15}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 152
    sget v1, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonTextColor:I

    .line 153
    sget v15, Lio/getstream/chat/android/ui/R$color;->stream_ui_audio_record_player_speed_text_color:I

    .line 154
    invoke-static {v0, v15}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 155
    invoke-virtual {v12, v1, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 156
    sget v0, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonTextFontAssets:I

    .line 157
    sget v1, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonTextFont:I

    .line 158
    invoke-virtual {v12, v0, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 159
    sget v0, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonTextStyle:I

    const/4 v1, 0x0

    .line 160
    invoke-virtual {v12, v0, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    .line 161
    invoke-virtual {v12}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    .line 162
    new-instance v1, Lio/getstream/chat/android/ui/helper/ViewPadding;

    invoke-direct {v1, v2, v3, v4, v6}, Lio/getstream/chat/android/ui/helper/ViewPadding;-><init>(IIII)V

    .line 163
    new-instance v2, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v2, v8, v9}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    .line 164
    new-instance v3, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v3, v10, v11}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    .line 165
    new-instance v11, Lio/getstream/chat/android/ui/helper/ViewPadding;

    invoke-direct {v11, v13, v13, v13, v13}, Lio/getstream/chat/android/ui/helper/ViewPadding;-><init>(IIII)V

    .line 166
    new-instance v4, Lio/getstream/chat/android/ui/helper/ViewSize;

    invoke-direct {v4, v5, v7}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    .line 167
    new-instance v5, Lio/getstream/chat/android/ui/helper/ViewSize;

    move/from16 v6, v27

    move/from16 v7, v29

    invoke-direct {v5, v6, v7}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    .line 168
    new-instance v6, Lio/getstream/chat/android/ui/helper/ViewSize;

    move/from16 v7, v43

    invoke-direct {v6, v7, v14}, Lio/getstream/chat/android/ui/helper/ViewSize;-><init>(II)V

    move-object/from16 v15, v17

    move-object/from16 v17, v4

    .line 169
    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    const/4 v8, 0x0

    move-object/from16 v7, v22

    move-object/from16 v22, v5

    move/from16 v5, v16

    move-object/from16 v16, v7

    move-object v9, v2

    move-object v10, v3

    move-object/from16 v7, v23

    move/from16 v12, v24

    move-object/from16 v13, v25

    move-object/from16 v14, v26

    move/from16 v23, v28

    move-object/from16 v24, v31

    move/from16 v26, v32

    move/from16 v28, v33

    move/from16 v25, v34

    move/from16 v31, v35

    move/from16 v32, v36

    move-object/from16 v30, v37

    move-object/from16 v29, v38

    move/from16 v34, v39

    move/from16 v27, v40

    move/from16 v33, v41

    move-object/from16 v35, v42

    move/from16 v40, v44

    move-object/from16 v38, v45

    move-object/from16 v37, v46

    move-object/from16 v36, v0

    move-object/from16 v39, v6

    move-object v6, v1

    invoke-direct/range {v4 .. v40}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;-><init>(ILio/getstream/chat/android/ui/helper/ViewPadding;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewPadding;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;ILio/getstream/chat/android/ui/font/TextStyle;IIIILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IIZILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;I)V

    return-object v4
.end method

.method public final invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->AudioRecordPlayerView:[I

    .line 2
    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiAudioRecordPlayerViewStyle:I

    .line 3
    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_AudioRecordPlayerView:I

    .line 4
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;->invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    move-result-object p1

    .line 6
    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getAudioRecordPlayerViewStyle()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object p2

    invoke-interface {p2, p1}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    return-object p1
.end method
