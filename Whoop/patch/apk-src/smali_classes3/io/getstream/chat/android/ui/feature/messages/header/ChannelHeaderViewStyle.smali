.class public final Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 <2\u00020\u0001:\u0001<Bu\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\u000cH\u00c6\u0003J\t\u0010/\u001a\u00020\nH\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\u0012H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u008d\u0001\u00105\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\u0013\u00106\u001a\u00020\n2\u0008\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010 \u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "background",
        "",
        "titleTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "offlineTextStyle",
        "searchingForNetworkTextStyle",
        "onlineTextStyle",
        "showUserAvatar",
        "",
        "backButtonIcon",
        "Landroid/graphics/drawable/Drawable;",
        "showBackButton",
        "showBackButtonBadge",
        "backButtonBadgeBackgroundColor",
        "showSearchingForNetworkProgressBar",
        "searchingForNetworkProgressBarTint",
        "Landroid/content/res/ColorStateList;",
        "separatorBackgroundDrawable",
        "<init>",
        "(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)V",
        "getBackground",
        "()I",
        "getTitleTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getOfflineTextStyle",
        "getSearchingForNetworkTextStyle",
        "getOnlineTextStyle",
        "getShowUserAvatar",
        "()Z",
        "getBackButtonIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "getShowBackButton",
        "getShowBackButtonBadge",
        "getBackButtonBadgeBackgroundColor",
        "getShowSearchingForNetworkProgressBar",
        "getSearchingForNetworkProgressBarTint",
        "()Landroid/content/res/ColorStateList;",
        "getSeparatorBackgroundDrawable",
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
        "copy",
        "equals",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;


# instance fields
.field private final backButtonBadgeBackgroundColor:I

.field private final backButtonIcon:Landroid/graphics/drawable/Drawable;

.field private final background:I

.field private final offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

.field private final searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

.field private final showBackButton:Z

.field private final showBackButtonBadge:Z

.field private final showSearchingForNetworkProgressBar:Z

.field private final showUserAvatar:Z

.field private final titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "titleTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offlineTextStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchingForNetworkTextStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlineTextStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backButtonIcon"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchingForNetworkProgressBarTint"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    iput-boolean p8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    iput-boolean p9, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    iput p10, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    iput-boolean p11, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    iput-object p12, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    iput-object p13, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    goto :goto_4

    :cond_5
    move/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    goto :goto_6

    :cond_7
    move/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    goto :goto_7

    :cond_8
    move/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget v9, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    goto :goto_8

    :cond_9
    move/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-boolean v10, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    goto :goto_9

    :cond_a
    move/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move/from16 p8, v5

    move-object/from16 p9, v6

    move/from16 p10, v7

    move/from16 p11, v8

    move/from16 p12, v9

    move/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->copy(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    return v0
.end method

.method public final component12()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final component13()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    return v0
.end method

.method public final component7()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    return v0
.end method

.method public final copy(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;
    .locals 15

    const-string v0, "titleTextStyle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offlineTextStyle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchingForNetworkTextStyle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onlineTextStyle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backButtonIcon"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchingForNetworkProgressBarTint"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    move/from16 v2, p1

    move/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;-><init>(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getBackButtonBadgeBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    return v0
.end method

.method public final getBackButtonIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getBackground()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    return v0
.end method

.method public final getOfflineTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getOnlineTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getSearchingForNetworkProgressBarTint()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getSearchingForNetworkTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getSeparatorBackgroundDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getShowBackButton()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    return v0
.end method

.method public final getShowBackButtonBadge()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    return v0
.end method

.method public final getShowSearchingForNetworkProgressBar()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    return v0
.end method

.method public final getShowUserAvatar()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    return v0
.end method

.method public final getTitleTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->background:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->titleTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->offlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->onlineTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showUserAvatar:Z

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonIcon:Landroid/graphics/drawable/Drawable;

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButton:Z

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showBackButtonBadge:Z

    iget v9, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->backButtonBadgeBackgroundColor:I

    iget-boolean v10, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->showSearchingForNetworkProgressBar:Z

    iget-object v11, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->searchingForNetworkProgressBarTint:Landroid/content/res/ColorStateList;

    iget-object v12, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->separatorBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "ChannelHeaderViewStyle(background="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", titleTextStyle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offlineTextStyle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", searchingForNetworkTextStyle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onlineTextStyle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showUserAvatar="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", backButtonIcon="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showBackButton="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", showBackButtonBadge="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", backButtonBadgeBackgroundColor="

    const-string v1, ", showSearchingForNetworkProgressBar="

    invoke-static {v9, v0, v1, v13, v8}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", searchingForNetworkProgressBarTint="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", separatorBackgroundDrawable="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
