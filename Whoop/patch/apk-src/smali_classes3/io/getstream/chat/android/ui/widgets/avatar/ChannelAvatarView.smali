.class public final Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$Companion;,
        Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001A\u0018\u0000 K2\u00020\u0001:\u0001KB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000c2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010\u001f\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J#\u0010&\u001a\u00020\u000c*\u00020#2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020\u000c2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010,\u001a\u00020\u000c2\u0006\u0010)\u001a\u00020(H\u0014\u00a2\u0006\u0004\u0008,\u0010+J#\u0010.\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00102\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u00082\u00103J7\u00109\u001a\u00020\u000c2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u00089\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010J\u00a8\u0006L"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;",
        "Landroid/view/ViewGroup;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "init",
        "",
        "isUserAvatar",
        "()Z",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "showChannelAvatar",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "showUserAvatar",
        "(Lio/getstream/chat/android/models/User;)V",
        "",
        "showGroupAvatar",
        "(Ljava/util/List;)V",
        "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;",
        "createUserView",
        "()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;",
        "count",
        "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;",
        "createImageViews",
        "(I)Ljava/util/List;",
        "Landroid/view/View;",
        "width",
        "height",
        "measureExactly",
        "(Landroid/view/View;II)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "drawBorder",
        "(Landroid/graphics/Canvas;)V",
        "dispatchDraw",
        "currentUser",
        "setChannel",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onLayout",
        "(ZIIII)V",
        "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;",
        "avatarStyle",
        "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;",
        "Landroid/graphics/Paint;",
        "borderPaint",
        "Landroid/graphics/Paint;",
        "io/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1",
        "avatarViewProvider",
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;",
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;",
        "avatarRenderer",
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;",
        "getAvatarRenderer",
        "()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;",
        "setAvatarRenderer",
        "(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;)V",
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
.field public static final AVATAR_SIZE_EXTRA:I = 0x1

.field public static final Companion:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$Companion;


# instance fields
.field private avatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

.field private avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

.field private final avatarViewProvider:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;

.field private final borderPaint:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->Companion:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    .line 4
    invoke-direct {p0, v0, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 6
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iput-object p3, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->borderPaint:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;

    invoke-direct {p3, p0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;-><init>(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarViewProvider:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;

    .line 9
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$createImageViews(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;I)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->createImageViews(I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createUserView(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;)Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->createUserView()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    move-result-object p0

    return-object p0
.end method

.method private final createImageViews(I)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    new-instance v5, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;-><init>(Landroid/content/Context;)V

    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v4, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    const-string v6, "avatarStyle"

    if-eqz v4, :cond_18

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarShape()Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;

    move-result-object v4

    sget-object v7, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v7, v4

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v4, v10, :cond_13

    if-ne v4, v9, :cond_12

    if-eq v1, v10, :cond_10

    if-eq v1, v9, :cond_b

    if-eq v1, v8, :cond_6

    if-eq v1, v7, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/i;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v12, Lkr/i;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    new-instance v13, Lkr/a;

    invoke-direct {v13, v11}, Lkr/a;-><init>(F)V

    new-instance v14, Lkr/a;

    invoke-direct {v14, v11}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/a;

    invoke-direct {v15, v11}, Lkr/a;-><init>(F)V

    const/16 v16, 0x0

    new-instance v5, Lkr/e;

    const/4 v8, 0x0

    invoke-direct {v5, v8}, Lkr/e;-><init>(I)V

    new-instance v8, Lkr/e;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lkr/e;-><init>(I)V

    new-instance v9, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v11, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/a;

    move-object/from16 v17, v6

    iget-object v6, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v6

    invoke-direct {v10, v6}, Lkr/a;-><init>(F)V

    new-instance v6, Lkr/k;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v3, v6, Lkr/k;->a:Lse/a;

    iput-object v4, v6, Lkr/k;->b:Lse/a;

    iput-object v7, v6, Lkr/k;->c:Lse/a;

    iput-object v12, v6, Lkr/k;->d:Lse/a;

    iput-object v10, v6, Lkr/k;->e:Lkr/c;

    iput-object v13, v6, Lkr/k;->f:Lkr/c;

    iput-object v14, v6, Lkr/k;->g:Lkr/c;

    iput-object v15, v6, Lkr/k;->h:Lkr/c;

    iput-object v5, v6, Lkr/k;->i:Lkr/e;

    iput-object v8, v6, Lkr/k;->j:Lkr/e;

    iput-object v9, v6, Lkr/k;->k:Lkr/e;

    iput-object v11, v6, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v6}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_4

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v14, v15, Lkr/k;->f:Lkr/c;

    iput-object v9, v15, Lkr/k;->g:Lkr/c;

    iput-object v10, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v9, v15, Lkr/k;->f:Lkr/c;

    iput-object v10, v15, Lkr/k;->g:Lkr/c;

    iput-object v14, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x3

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_2

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v9, v15, Lkr/k;->f:Lkr/c;

    iput-object v14, v15, Lkr/k;->g:Lkr/c;

    iput-object v10, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_2
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_3
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_4
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_5
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_6
    move-object/from16 v17, v6

    const/16 v16, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_a

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v14, v15, Lkr/k;->e:Lkr/c;

    iput-object v7, v15, Lkr/k;->f:Lkr/c;

    iput-object v9, v15, Lkr/k;->g:Lkr/c;

    iput-object v10, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v8, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/a;

    iget-object v14, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v14, :cond_9

    invoke-virtual {v14}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v14

    invoke-direct {v13, v14}, Lkr/a;-><init>(F)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_8

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v13, v15, Lkr/k;->f:Lkr/c;

    iput-object v14, v15, Lkr/k;->g:Lkr/c;

    iput-object v9, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v10, v15, Lkr/k;->j:Lkr/e;

    iput-object v11, v15, Lkr/k;->k:Lkr/e;

    iput-object v12, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_7

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v9, v15, Lkr/k;->f:Lkr/c;

    iput-object v10, v15, Lkr/k;->g:Lkr/c;

    iput-object v14, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_7
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_8
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_9
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_a
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_b
    move-object/from16 v17, v6

    const/16 v16, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v8, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/a;

    iget-object v14, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v14, :cond_f

    invoke-virtual {v14}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v14

    invoke-direct {v13, v14}, Lkr/a;-><init>(F)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_e

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v13, v15, Lkr/k;->e:Lkr/c;

    iput-object v7, v15, Lkr/k;->f:Lkr/c;

    iput-object v9, v15, Lkr/k;->g:Lkr/c;

    iput-object v14, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v10, v15, Lkr/k;->j:Lkr/e;

    iput-object v11, v15, Lkr/k;->k:Lkr/e;

    iput-object v12, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v8, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/a;

    iget-object v14, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v14

    invoke-direct {v13, v14}, Lkr/a;-><init>(F)V

    new-instance v14, Lkr/a;

    iget-object v15, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v15, :cond_c

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v15

    invoke-direct {v14, v15}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v13, v15, Lkr/k;->f:Lkr/c;

    iput-object v14, v15, Lkr/k;->g:Lkr/c;

    iput-object v9, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v10, v15, Lkr/k;->j:Lkr/e;

    iput-object v11, v15, Lkr/k;->k:Lkr/e;

    iput-object v12, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_c
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_d
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_e
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_f
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_10
    move-object/from16 v17, v6

    const/16 v16, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/e;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/e;-><init>(I)V

    new-instance v8, Lkr/e;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lkr/e;-><init>(I)V

    new-instance v9, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/a;

    iget-object v12, v0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v12, :cond_11

    invoke-virtual {v12}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v12

    invoke-direct {v11, v12}, Lkr/a;-><init>(F)V

    new-instance v12, Lkr/k;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iput-object v3, v12, Lkr/k;->a:Lse/a;

    iput-object v4, v12, Lkr/k;->b:Lse/a;

    iput-object v5, v12, Lkr/k;->c:Lse/a;

    iput-object v6, v12, Lkr/k;->d:Lse/a;

    iput-object v11, v12, Lkr/k;->e:Lkr/c;

    iput-object v11, v12, Lkr/k;->f:Lkr/c;

    iput-object v11, v12, Lkr/k;->g:Lkr/c;

    iput-object v11, v12, Lkr/k;->h:Lkr/c;

    iput-object v7, v12, Lkr/k;->i:Lkr/e;

    iput-object v8, v12, Lkr/k;->j:Lkr/e;

    iput-object v9, v12, Lkr/k;->k:Lkr/e;

    iput-object v10, v12, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v12}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_11
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_13
    move v4, v10

    if-eq v1, v4, :cond_17

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x2

    if-eq v1, v5, :cond_16

    const/4 v5, 0x3

    if-eq v1, v5, :cond_15

    if-eq v1, v7, :cond_14

    :goto_1
    return-object v2

    :cond_14
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/i;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lkr/a;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v9}, Lkr/a;-><init>(F)V

    new-instance v11, Lkr/a;

    invoke-direct {v11, v9}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v9, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/e;

    const/4 v15, 0x0

    invoke-direct {v14, v15}, Lkr/e;-><init>(I)V

    new-instance v15, Lkr/h;

    invoke-direct {v15, v4}, Lkr/h;-><init>(F)V

    new-instance v4, Lkr/k;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v3, v4, Lkr/k;->a:Lse/a;

    iput-object v5, v4, Lkr/k;->b:Lse/a;

    iput-object v6, v4, Lkr/k;->c:Lse/a;

    iput-object v7, v4, Lkr/k;->d:Lse/a;

    iput-object v15, v4, Lkr/k;->e:Lkr/c;

    iput-object v8, v4, Lkr/k;->f:Lkr/c;

    iput-object v10, v4, Lkr/k;->g:Lkr/c;

    iput-object v11, v4, Lkr/k;->h:Lkr/c;

    iput-object v9, v4, Lkr/k;->i:Lkr/e;

    iput-object v12, v4, Lkr/k;->j:Lkr/e;

    iput-object v13, v4, Lkr/k;->k:Lkr/e;

    iput-object v14, v4, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v4}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v14, v15, Lkr/k;->f:Lkr/c;

    iput-object v9, v15, Lkr/k;->g:Lkr/c;

    iput-object v10, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v9, v15, Lkr/k;->f:Lkr/c;

    iput-object v10, v15, Lkr/k;->g:Lkr/c;

    iput-object v14, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x3

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v9, v15, Lkr/k;->f:Lkr/c;

    iput-object v14, v15, Lkr/k;->g:Lkr/c;

    iput-object v10, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_15
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v14, v15, Lkr/k;->e:Lkr/c;

    iput-object v7, v15, Lkr/k;->f:Lkr/c;

    iput-object v9, v15, Lkr/k;->g:Lkr/c;

    iput-object v10, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v8, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v13, v15}, Lkr/h;-><init>(F)V

    new-instance v14, Lkr/h;

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v13, v15, Lkr/k;->f:Lkr/c;

    iput-object v14, v15, Lkr/k;->g:Lkr/c;

    iput-object v9, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v10, v15, Lkr/k;->j:Lkr/e;

    iput-object v11, v15, Lkr/k;->k:Lkr/e;

    iput-object v12, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v8, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    const/4 v14, 0x0

    invoke-direct {v13, v14}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v9, v15, Lkr/k;->f:Lkr/c;

    iput-object v10, v15, Lkr/k;->g:Lkr/c;

    iput-object v14, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v11, v15, Lkr/k;->j:Lkr/e;

    iput-object v12, v15, Lkr/k;->k:Lkr/e;

    iput-object v13, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_16
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v8, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v13, v15}, Lkr/h;-><init>(F)V

    new-instance v14, Lkr/h;

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v13, v15, Lkr/k;->e:Lkr/c;

    iput-object v7, v15, Lkr/k;->f:Lkr/c;

    iput-object v9, v15, Lkr/k;->g:Lkr/c;

    iput-object v14, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v10, v15, Lkr/k;->j:Lkr/e;

    iput-object v11, v15, Lkr/k;->k:Lkr/e;

    iput-object v12, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v8, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/h;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v13, v15}, Lkr/h;-><init>(F)V

    new-instance v14, Lkr/h;

    invoke-direct {v14, v15}, Lkr/h;-><init>(F)V

    new-instance v15, Lkr/k;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v3, v15, Lkr/k;->a:Lse/a;

    iput-object v4, v15, Lkr/k;->b:Lse/a;

    iput-object v5, v15, Lkr/k;->c:Lse/a;

    iput-object v6, v15, Lkr/k;->d:Lse/a;

    iput-object v7, v15, Lkr/k;->e:Lkr/c;

    iput-object v13, v15, Lkr/k;->f:Lkr/c;

    iput-object v14, v15, Lkr/k;->g:Lkr/c;

    iput-object v9, v15, Lkr/k;->h:Lkr/c;

    iput-object v8, v15, Lkr/k;->i:Lkr/e;

    iput-object v10, v15, Lkr/k;->j:Lkr/e;

    iput-object v11, v15, Lkr/k;->k:Lkr/e;

    iput-object v12, v15, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v15}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_17
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/i;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/e;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/e;-><init>(I)V

    new-instance v8, Lkr/e;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lkr/e;-><init>(I)V

    new-instance v9, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/h;

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-direct {v11, v12}, Lkr/h;-><init>(F)V

    new-instance v12, Lkr/k;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iput-object v3, v12, Lkr/k;->a:Lse/a;

    iput-object v4, v12, Lkr/k;->b:Lse/a;

    iput-object v5, v12, Lkr/k;->c:Lse/a;

    iput-object v6, v12, Lkr/k;->d:Lse/a;

    iput-object v11, v12, Lkr/k;->e:Lkr/c;

    iput-object v11, v12, Lkr/k;->f:Lkr/c;

    iput-object v11, v12, Lkr/k;->g:Lkr/c;

    iput-object v11, v12, Lkr/k;->h:Lkr/c;

    iput-object v7, v12, Lkr/k;->i:Lkr/e;

    iput-object v8, v12, Lkr/k;->j:Lkr/e;

    iput-object v9, v12, Lkr/k;->k:Lkr/e;

    iput-object v10, v12, Lkr/k;->l:Lkr/e;

    invoke-virtual {v1, v12}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-object v2

    :cond_18
    move-object/from16 v17, v6

    const/16 v16, 0x0

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v16
.end method

.method private final createUserView()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;
    .locals 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v0, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v2, :cond_0

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;-><init>(Landroid/content/Context;Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0

    :cond_0
    const-string v0, "avatarStyle"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final drawBorder(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    const/4 v1, 0x0

    const-string v2, "avatarStyle"

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarBorderWidth()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarBorderWidth()I

    move-result v0

    const/4 v3, 0x2

    div-int/2addr v0, v3

    int-to-float v5, v0

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarShape()Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;

    move-result-object v0

    sget-object v4, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    if-ne v0, v3, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v7, v0, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float v8, v0, v5

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v9

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getBorderRadius()F

    move-result v10

    iget-object v11, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->borderPaint:Landroid/graphics/Paint;

    move v6, v5

    move-object v4, p1

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object v4, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v0

    sub-float/2addr v2, v5

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->borderPaint:Landroid/graphics/Paint;

    invoke-virtual {v4, p1, v1, v2, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->Companion:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    const/4 p2, 0x0

    const-string v0, "avatarStyle"

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarBorderWidth()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    move p1, v1

    :cond_0
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->borderPaint:Landroid/graphics/Paint;

    iget-object v2, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarBorderColor()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->borderPaint:Landroid/graphics/Paint;

    iget-object v2, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarBorderWidth()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getChannelAvatarRenderer()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    return-void

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p2

    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p2
.end method

.method private final isUserAvatar()Z
    .locals 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method private final measureExactly(Landroid/view/View;II)V
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-static {p3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public static synthetic setChannel$default(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object p2

    invoke-interface {p2}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->setChannel(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method private final showChannelAvatar(Lio/getstream/chat/android/models/Channel;)V
    .locals 5

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->createImageViews(I)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getImage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getInitials(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getAvatarInitialsTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v4

    invoke-direct {v2, v3, p1, v4}, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;-><init>(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;->setAvatar(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "avatarStyle"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final showGroupAvatar(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->createImageViews(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-le v1, v2, :cond_1

    move v1, v2

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/User;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/User;

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/utils/extensions/UserKt;->getInitials(Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;->getGroupAvatarInitialsTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v8

    invoke-direct {v5, v6, v7, v8}, Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;-><init>(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-virtual {v3, v4, v5}, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;->setAvatar(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string p1, "avatarStyle"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_3
    return-void
.end method

.method private final showUserAvatar(Lio/getstream/chat/android/models/User;)V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->createUserView()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->isUserAvatar()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->drawBorder(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public final getAvatarRenderer()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    return-object v0
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    const/4 p2, 0x2

    div-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    div-int/2addr p3, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p4

    const/4 p5, 0x0

    const/4 v0, 0x1

    if-eq p4, v0, :cond_3

    if-eq p4, p2, :cond_2

    const/4 v1, 0x3

    if-eq p4, v1, :cond_1

    const/4 v2, 0x4

    if-eq p4, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p4, p5, p5, p1, p3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p4, v0, p5, v2, p3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    invoke-virtual {p2, p5, p3, p1, p4}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    invoke-virtual {p2, p1, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_1
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p4, p5, p5, p1, p3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p4, p1, p5, v0, v1}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    invoke-virtual {p2, p5, p3, p1, p4}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_2
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    invoke-virtual {p2, p5, p5, p1, p3}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr p3, p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    invoke-virtual {p2, p3, p5, p1, p4}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_3
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    invoke-virtual {p1, p5, p5, p2, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 9

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    div-int/lit8 v0, p1, 0x2

    div-int/lit8 v1, p2, 0x2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    const-string v4, "getChildAt(...)"

    const/4 v5, 0x1

    if-eq v2, v5, :cond_3

    const/4 v6, 0x2

    if-eq v2, v6, :cond_2

    const/4 v7, 0x3

    if-eq v2, v7, :cond_1

    const/4 v8, 0x4

    if-eq v2, v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, v0, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, v0, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->measureExactly(Landroid/view/View;II)V

    :goto_0
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setAvatarRenderer(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    return-void
.end method

.method public final setChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 2

    .line 1
    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->setChannel$default(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)V

    return-void
.end method

.method public final setChannel(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)V
    .locals 5

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 4
    iget-object v2, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-eqz v2, :cond_1

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarStyle:Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->avatarViewProvider:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;

    invoke-interface {v2, v0, p1, p2, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;->render(Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarViewProvider;)V

    return-void

    :cond_0
    const-string p1, "avatarStyle"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_1
    return-void

    .line 6
    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getImage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_3

    .line 7
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->showChannelAvatar(Lio/getstream/chat/android/models/Channel;)V

    return-void

    :cond_3
    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Member;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->showUserAvatar(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_4
    const/4 p1, 0x2

    if-ne v1, p1, :cond_b

    .line 10
    move-object p1, v0

    check-cast p1, Ljava/lang/Iterable;

    .line 11
    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_5

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    .line 12
    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Member;

    .line 13
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_7
    move-object v4, v3

    :goto_0
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Member;

    .line 15
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_9
    move-object v2, v3

    :goto_1
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    .line 16
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->showUserAvatar(Lio/getstream/chat/android/models/User;)V

    return-void

    .line 17
    :cond_a
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Collection contains no element matching the predicate."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_b
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Member;

    .line 21
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_d

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_d
    move-object v4, v3

    :goto_4
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 22
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 23
    :cond_e
    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 25
    check-cast v0, Lio/getstream/chat/android/models/Member;

    .line 26
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    .line 27
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 28
    :cond_f
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->showGroupAvatar(Ljava/util/List;)V

    return-void
.end method
