.class public final Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u00c6\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\u0007H\u00c6\u0003JI\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;",
        "",
        "state",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;",
        "paginationState",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;",
        "typingEvents",
        "",
        "",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "draftMessages",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "<init>",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)V",
        "getState",
        "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;",
        "getPaginationState",
        "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;",
        "getTypingEvents",
        "()Ljava/util/Map;",
        "getDraftMessages",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final draftMessages:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

.field private final state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

.field private final typingEvents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/TypingEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/TypingEvent;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginationState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingEvents"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draftMessages"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    sget-object p6, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, v0, p6}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;-><init>(ZLjava/util/List;)V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    const/4 p6, 0x3

    const/4 v1, 0x0

    invoke-direct {p2, v0, v0, p6, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 9
    sget-object v0, Lm83/z;->w:Lm83/z;

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->copy(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/TypingEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;",
            "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/TypingEvent;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)",
            "Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginationState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingEvents"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draftMessages"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDraftMessages()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    return-object v0
.end method

.method public final getPaginationState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    return-object v0
.end method

.method public final getState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    return-object v0
.end method

.method public final getTypingEvents()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/TypingEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    invoke-static {v0, v2, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->state:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->paginationState:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->typingEvents:Ljava/util/Map;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->draftMessages:Ljava/util/Map;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ChannelListBindingData(state="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paginationState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", typingEvents="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", draftMessages="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
