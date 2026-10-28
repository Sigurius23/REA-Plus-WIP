.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PollListQuery"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000e\u00a8\u0006\u001d"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "count",
        "",
        "start",
        "",
        "state",
        "Llive/hms/video/polls/models/HmsPollState;",
        "version",
        "<init>",
        "(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)V",
        "getCount",
        "()I",
        "getStart",
        "()Ljava/lang/String;",
        "getState",
        "()Llive/hms/video/polls/models/HmsPollState;",
        "getVersion",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final count:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "count"
    .end annotation
.end field

.field private final start:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start"
    .end annotation
.end field

.field private final state:Llive/hms/video/polls/models/HmsPollState;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "state"
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
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

    invoke-direct/range {v0 .. v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;-><init>(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    .line 7
    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    .line 9
    iput-object p4, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/16 p1, 0xa

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 2
    sget-object p3, Llive/hms/video/polls/models/HmsPollState;->STARTED:Llive/hms/video/polls/models/HmsPollState;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 3
    const-string p4, "1.0"

    .line 4
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;-><init>(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->copy(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Llive/hms/video/polls/models/HmsPollState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;
    .locals 1

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;-><init>(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    iget v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCount()I
    .locals 1

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    return v0
.end method

.method public final getStart()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Llive/hms/video/polls/models/HmsPollState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PollListQuery(count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->start:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->state:Llive/hms/video/polls/models/HmsPollState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;->version:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
