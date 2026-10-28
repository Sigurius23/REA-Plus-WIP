.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 22\u00020\u0001:\u00012Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003Jw\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0012R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0012\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "pollTitleTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "pollSubtitleTextStyle",
        "pollOptionCheckDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "pollOptionTextStyle",
        "pollOptionVotesTextStyle",
        "pollCloseTextStyle",
        "pollResultsTextStyle",
        "pollShowAllOptionsTextStyle",
        "pollSuggestOptionTextStyle",
        "pollAddCommentTextStyle",
        "pollViewCommentsTextStyle",
        "<init>",
        "(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V",
        "getPollTitleTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getPollSubtitleTextStyle",
        "getPollOptionCheckDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "getPollOptionTextStyle",
        "getPollOptionVotesTextStyle",
        "getPollCloseTextStyle",
        "getPollResultsTextStyle",
        "getPollShowAllOptionsTextStyle",
        "getPollSuggestOptionTextStyle",
        "getPollAddCommentTextStyle",
        "getPollViewCommentsTextStyle",
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
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;


# instance fields
.field private final pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

.field private final pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 1

    const-string v0, "pollTitleTextStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSubtitleTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollOptionCheckDrawable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollOptionTextStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollOptionVotesTextStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollCloseTextStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollResultsTextStyle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollShowAllOptionsTextStyle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSuggestOptionTextStyle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAddCommentTextStyle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollViewCommentsTextStyle"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 24

    move/from16 v0, p12

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    .line 13
    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle;

    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v2

    goto :goto_0

    :cond_0
    move-object/from16 v12, p9

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    .line 14
    new-instance v13, Lio/getstream/chat/android/ui/font/TextStyle;

    const/16 v22, 0xff

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v13, p10

    :goto_1
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_2

    .line 15
    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v1

    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    goto :goto_3

    :cond_2
    move-object/from16 v14, p11

    goto :goto_2

    .line 16
    :goto_3
    invoke-direct/range {v3 .. v14}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->copy(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component11()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component3()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component8()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component9()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;
    .locals 13

    const-string v0, "pollTitleTextStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSubtitleTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollOptionCheckDrawable"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollOptionTextStyle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollOptionVotesTextStyle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollCloseTextStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollResultsTextStyle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollShowAllOptionsTextStyle"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollSuggestOptionTextStyle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAddCommentTextStyle"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollViewCommentsTextStyle"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;-><init>(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getPollAddCommentTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollCloseTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollOptionCheckDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getPollOptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollOptionVotesTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollResultsTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollShowAllOptionsTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollSubtitleTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollSuggestOptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollTitleTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getPollViewCommentsTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollTitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSubtitleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionCheckDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollOptionVotesTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollCloseTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollResultsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollShowAllOptionsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollSuggestOptionTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollAddCommentTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v10, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->pollViewCommentsTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "PollViewStyle(pollTitleTextStyle="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollSubtitleTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollOptionCheckDrawable="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollOptionTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollOptionVotesTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollCloseTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollResultsTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollShowAllOptionsTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollSuggestOptionTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollAddCommentTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pollViewCommentsTextStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
