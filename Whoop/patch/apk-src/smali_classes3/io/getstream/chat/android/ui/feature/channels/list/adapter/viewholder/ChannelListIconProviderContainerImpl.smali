.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR+\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u000e\u0010\t\"\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;",
        "getMoreOptionsIcon",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;",
        "getDeleteOptionIcon",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V",
        "<set-?>",
        "getGetMoreOptionsIcon",
        "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;",
        "setGetMoreOptionsIcon",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V",
        "getMoreOptionsIcon$delegate",
        "Lio/getstream/chat/android/ui/utils/ListenerDelegate;",
        "getGetDeleteOptionIcon",
        "setGetDeleteOptionIcon",
        "getDeleteOptionIcon$delegate",
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
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final getDeleteOptionIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final getMoreOptionsIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;

    const-string v2, "getMoreOptionsIcon"

    const-string v3, "getGetMoreOptionsIcon()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "getDeleteOptionIcon"

    const-string v5, "getGetDeleteOptionIcon()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->$$delegatedProperties:[Lj93/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V
    .locals 3

    const-string v0, "getMoreOptionsIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDeleteOptionIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    new-instance v1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getMoreOptionsIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 4
    new-instance p1, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    invoke-direct {p1, p2, v0}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getDeleteOptionIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 5
    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    sget-object p2, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V

    return-void
.end method

.method public static synthetic a(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getMoreOptionsIcon_delegate$lambda$1$lambda$0(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getDeleteOptionIcon_delegate$lambda$3$lambda$2(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getMoreOptionsIcon_delegate$lambda$1(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getDeleteOptionIcon_delegate$lambda$3(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;

    return-object p0
.end method

.method private static final getDeleteOptionIcon_delegate$lambda$3(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;
    .locals 2

    const-string v0, "realPredicate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;-><init>(Lc93/a;I)V

    return-object v0
.end method

.method private static final getDeleteOptionIcon_delegate$lambda$3$lambda$2(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->invoke(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static final getMoreOptionsIcon_delegate$lambda$1(Lc93/a;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;
    .locals 2

    const-string v0, "realPredicate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/a;-><init>(Lc93/a;I)V

    return-object v0
.end method

.method private static final getMoreOptionsIcon_delegate$lambda$1$lambda$0(Lc93/a;Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->invoke(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getGetDeleteOptionIcon()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getDeleteOptionIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    return-object v0
.end method

.method public final getGetMoreOptionsIcon()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getMoreOptionsIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    return-object v0
.end method

.method public final setGetDeleteOptionIcon(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getDeleteOptionIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setGetMoreOptionsIcon(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->getMoreOptionsIcon$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
