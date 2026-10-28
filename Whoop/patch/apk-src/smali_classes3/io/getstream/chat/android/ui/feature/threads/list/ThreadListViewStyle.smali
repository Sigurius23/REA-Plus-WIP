.class public final Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u0000 T2\u00020\u0001:\u0001TB\u00c1\u0001\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\tH\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\u000eH\u00c6\u0003J\t\u0010@\u001a\u00020\tH\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\tH\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\u00db\u0001\u0010M\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0014\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0015\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0017\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0018\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0019\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u001a\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u001b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010N\u001a\u00020O2\u0008\u0010P\u001a\u0004\u0018\u00010QH\u00d6\u0003J\t\u0010R\u001a\u00020\u0003H\u00d6\u0001J\t\u0010S\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010!R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010%R\u0011\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010%R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010%R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010!R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010%R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010\u001f\u00a8\u0006U"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "backgroundColor",
        "",
        "emptyStateDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "emptyStateText",
        "",
        "emptyStateTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "threadIconDrawable",
        "threadTitleStyle",
        "threadReplyToStyle",
        "latestReplyStyle",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "unreadCountBadgeTextStyle",
        "unreadCountBadgeBackground",
        "bannerTextStyle",
        "bannerIcon",
        "bannerBackground",
        "bannerPaddingLeft",
        "bannerPaddingTop",
        "bannerPaddingRight",
        "bannerPaddingBottom",
        "bannerMarginLeft",
        "bannerMarginTop",
        "bannerMarginRight",
        "bannerMarginBottom",
        "<init>",
        "(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIII)V",
        "getBackgroundColor",
        "()I",
        "getEmptyStateDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "getEmptyStateText",
        "()Ljava/lang/String;",
        "getEmptyStateTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getThreadIconDrawable",
        "getThreadTitleStyle",
        "getThreadReplyToStyle",
        "getLatestReplyStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "getUnreadCountBadgeTextStyle",
        "getUnreadCountBadgeBackground",
        "getBannerTextStyle",
        "getBannerIcon",
        "getBannerBackground",
        "getBannerPaddingLeft",
        "getBannerPaddingTop",
        "getBannerPaddingRight",
        "getBannerPaddingBottom",
        "getBannerMarginLeft",
        "getBannerMarginTop",
        "getBannerMarginRight",
        "getBannerMarginBottom",
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
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;


# instance fields
.field private final backgroundColor:I

.field private final bannerBackground:Landroid/graphics/drawable/Drawable;

.field private final bannerIcon:Landroid/graphics/drawable/Drawable;

.field private final bannerMarginBottom:I

.field private final bannerMarginLeft:I

.field private final bannerMarginRight:I

.field private final bannerMarginTop:I

.field private final bannerPaddingBottom:I

.field private final bannerPaddingLeft:I

.field private final bannerPaddingRight:I

.field private final bannerPaddingTop:I

.field private final bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final emptyStateDrawable:Landroid/graphics/drawable/Drawable;

.field private final emptyStateText:Ljava/lang/String;

.field private final emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

.field private final threadIconDrawable:Landroid/graphics/drawable/Drawable;

.field private final threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

.field private final unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIII)V
    .locals 11

    move-object v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    move-object/from16 v8, p12

    move-object/from16 v9, p13

    const-string v10, "emptyStateDrawable"

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "emptyStateText"

    invoke-static {p3, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "emptyStateTextStyle"

    invoke-static {p4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "threadIconDrawable"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "threadTitleStyle"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "threadReplyToStyle"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "latestReplyStyle"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "unreadCountBadgeTextStyle"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "unreadCountBadgeBackground"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "bannerTextStyle"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "bannerIcon"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "bannerBackground"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    iput-object v5, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v6, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    iput-object v7, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object v8, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    iput-object v9, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    move/from16 p1, p14

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    move/from16 p1, p15

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    move/from16 p1, p16

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    move/from16 p1, p17

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    move/from16 p1, p18

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    move/from16 p1, p19

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    move/from16 p1, p20

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    move/from16 p1, p21

    iput p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIIIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p22, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p22, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p22, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p22, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p22, v16

    if-eqz v16, :cond_14

    move/from16 p6, v1

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    move/from16 p21, p6

    move/from16 p22, v1

    :goto_14
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_15

    :cond_14
    move/from16 p22, p21

    move/from16 p21, v1

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p22}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->copy(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIII)Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    return v0
.end method

.method public final component10()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component11()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component12()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component13()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    return v0
.end method

.method public final component2()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component5()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component8()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-object v0
.end method

.method public final component9()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIII)Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;
    .locals 23

    const-string v0, "emptyStateDrawable"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emptyStateText"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emptyStateTextStyle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadIconDrawable"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadTitleStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadReplyToStyle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestReplyStyle"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unreadCountBadgeTextStyle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unreadCountBadgeBackground"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerTextStyle"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerIcon"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerBackground"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    move/from16 v2, p1

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    invoke-direct/range {v1 .. v22}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;-><init>(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIII)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    iget p1, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    if-eq v1, p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    return v0
.end method

.method public final getBannerBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getBannerIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getBannerMarginBottom()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    return v0
.end method

.method public final getBannerMarginLeft()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    return v0
.end method

.method public final getBannerMarginRight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    return v0
.end method

.method public final getBannerMarginTop()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    return v0
.end method

.method public final getBannerPaddingBottom()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    return v0
.end method

.method public final getBannerPaddingLeft()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    return v0
.end method

.method public final getBannerPaddingRight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    return v0
.end method

.method public final getBannerPaddingTop()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    return v0
.end method

.method public final getBannerTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getEmptyStateDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getEmptyStateText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmptyStateTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getLatestReplyStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-object v0
.end method

.method public final getThreadIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getThreadReplyToStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getThreadTitleStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getUnreadCountBadgeBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getUnreadCountBadgeTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v0, v2, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->backgroundColor:I

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateText:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->emptyStateTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadIconDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadTitleStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->threadReplyToStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v8, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->latestReplyStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v10, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->unreadCountBadgeBackground:Landroid/graphics/drawable/Drawable;

    iget-object v11, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v12, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerIcon:Landroid/graphics/drawable/Drawable;

    iget-object v13, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerBackground:Landroid/graphics/drawable/Drawable;

    iget v14, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingLeft:I

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingTop:I

    move/from16 v16, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingRight:I

    move/from16 v17, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerPaddingBottom:I

    move/from16 v18, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginLeft:I

    move/from16 v19, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginTop:I

    move/from16 v20, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginRight:I

    move/from16 v21, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->bannerMarginBottom:I

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v22, v15

    const-string v15, "ThreadListViewStyle(backgroundColor="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", emptyStateDrawable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", emptyStateText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", emptyStateTextStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadIconDrawable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadTitleStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadReplyToStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latestReplyStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadCountBadgeTextStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadCountBadgeBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerTextStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerPaddingLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bannerPaddingTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerPaddingRight="

    const-string v2, ", bannerPaddingBottom="

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", bannerMarginLeft="

    const-string v2, ", bannerMarginTop="

    move/from16 v3, v18

    move/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", bannerMarginRight="

    const-string v2, ", bannerMarginBottom="

    move/from16 v3, v20

    move/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ")"

    move/from16 v2, v22

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
