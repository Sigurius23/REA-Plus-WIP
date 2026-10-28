.class public final Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0010\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\r*\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;",
        "Landroidx/lifecycle/a2;",
        "",
        "cid",
        "",
        "attachmentTypes",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "",
        "localFilter",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V",
        "Landroidx/lifecycle/w1;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)Landroidx/lifecycle/w1;",
        "Ljava/lang/String;",
        "Ljava/util/List;",
        "Lkotlin/jvm/functions/Function1;",
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


# instance fields
.field private final attachmentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final cid:Ljava/lang/String;

.field private final localFilter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->cid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->attachmentTypes:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->localFilter:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    new-instance p3, Lp;

    const/4 p4, 0x3

    invoke-direct {p3, p4}, Lp;-><init>(I)V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->_init_$lambda$0(Lio/getstream/chat/android/models/Attachment;)Z

    return-void
.end method


# virtual methods
.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Lj93/d;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-class v0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->attachmentTypes:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->localFilter:Lkotlin/jvm/functions/Function1;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ChannelAttachmentsViewModelFactory can only create instances of ChannelAttachmentsViewModel"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
