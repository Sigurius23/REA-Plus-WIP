.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 D2\u00020\u0001:\u0001DB\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u000fH\u00c6\u0003J\u00aa\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0003\u0010\r\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\u0008\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0006H\u00d6\u0001J\t\u0010B\u001a\u00020CH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0018R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008#\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010&\u00a8\u0006E"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "progressIcon",
        "Landroid/graphics/drawable/Drawable;",
        "placeholderIcon",
        "placeholderIconTint",
        "",
        "mediaPreviewBackgroundColor",
        "moreCountOverlayColor",
        "moreCountTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "playVideoIcon",
        "playVideoIconTint",
        "playVideoIconBackgroundColor",
        "playVideoIconElevation",
        "",
        "playVideoIconPaddingTop",
        "playVideoIconPaddingBottom",
        "playVideoIconPaddingStart",
        "playVideoIconPaddingEnd",
        "playVideoIconCornerRadius",
        "<init>",
        "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)V",
        "getProgressIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "getPlaceholderIcon",
        "getPlaceholderIconTint",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMediaPreviewBackgroundColor",
        "()I",
        "getMoreCountOverlayColor",
        "getMoreCountTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getPlayVideoIcon",
        "getPlayVideoIconTint",
        "getPlayVideoIconBackgroundColor",
        "getPlayVideoIconElevation",
        "()F",
        "getPlayVideoIconPaddingTop",
        "getPlayVideoIconPaddingBottom",
        "getPlayVideoIconPaddingStart",
        "getPlayVideoIconPaddingEnd",
        "getPlayVideoIconCornerRadius",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "copy",
        "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;


# instance fields
.field private final mediaPreviewBackgroundColor:I

.field private final moreCountOverlayColor:I

.field private final moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final placeholderIcon:Landroid/graphics/drawable/Drawable;

.field private final placeholderIconTint:Ljava/lang/Integer;

.field private final playVideoIcon:Landroid/graphics/drawable/Drawable;

.field private final playVideoIconBackgroundColor:I

.field private final playVideoIconCornerRadius:F

.field private final playVideoIconElevation:F

.field private final playVideoIconPaddingBottom:I

.field private final playVideoIconPaddingEnd:I

.field private final playVideoIconPaddingStart:I

.field private final playVideoIconPaddingTop:I

.field private final playVideoIconTint:Ljava/lang/Integer;

.field private final progressIcon:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)V
    .locals 1

    const-string v0, "progressIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholderIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moreCountTextStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    iput p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    iput-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    iput p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    iput p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    iput p11, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    iput p12, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    iput p13, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    iput p14, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    move/from16 p1, p15

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIFILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    move/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->copy(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    return v0
.end method

.method public final component15()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    return v0
.end method

.method public final component2()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    return v0
.end method

.method public final component6()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component7()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    return v0
.end method

.method public final copy(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;
    .locals 17

    const-string v0, "progressIcon"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholderIcon"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moreCountTextStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    iget p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getMediaPreviewBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    return v0
.end method

.method public final getMoreCountOverlayColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    return v0
.end method

.method public final getMoreCountTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPlaceholderIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getPlaceholderIconTint()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPlayVideoIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getPlayVideoIconBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    return v0
.end method

.method public final getPlayVideoIconCornerRadius()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    return v0
.end method

.method public final getPlayVideoIconElevation()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    return v0
.end method

.method public final getPlayVideoIconPaddingBottom()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    return v0
.end method

.method public final getPlayVideoIconPaddingEnd()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    return v0
.end method

.method public final getPlayVideoIconPaddingStart()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    return v0
.end method

.method public final getPlayVideoIconPaddingTop()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    return v0
.end method

.method public final getPlayVideoIconTint()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getProgressIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->placeholderIconTint:Ljava/lang/Integer;

    iget v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->mediaPreviewBackgroundColor:I

    iget v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountOverlayColor:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->moreCountTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIcon:Landroid/graphics/drawable/Drawable;

    iget-object v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconTint:Ljava/lang/Integer;

    iget v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconBackgroundColor:I

    iget v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconElevation:F

    iget v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingTop:I

    iget v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingBottom:I

    iget v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingStart:I

    iget v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconPaddingEnd:I

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->playVideoIconCornerRadius:F

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v16, v15

    const-string v15, "MediaAttachmentViewStyle(progressIcon="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderIconTint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mediaPreviewBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", moreCountOverlayColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", moreCountTextStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", playVideoIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", playVideoIconTint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", playVideoIconBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", playVideoIconElevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", playVideoIconPaddingTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", playVideoIconPaddingBottom="

    const-string v2, ", playVideoIconPaddingStart="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", playVideoIconPaddingEnd="

    const-string v2, ", playVideoIconCornerRadius="

    invoke-static {v0, v13, v1, v14, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ")"

    move/from16 v2, v16

    invoke-static {v2, v1, v0}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
