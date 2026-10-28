.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PollResponsesQuery"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "pollId",
        "",
        "onlyOwnResponses",
        "",
        "fromIndex",
        "",
        "numResponses",
        "version",
        "<init>",
        "(Ljava/lang/String;ZIILjava/lang/String;)V",
        "getPollId",
        "()Ljava/lang/String;",
        "getOnlyOwnResponses",
        "()Z",
        "getFromIndex",
        "()I",
        "getNumResponses",
        "getVersion",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
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
.field private final fromIndex:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "index"
    .end annotation
.end field

.field private final numResponses:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "count"
    .end annotation
.end field

.field private final onlyOwnResponses:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "self"
    .end annotation
.end field

.field private final pollId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll_id"
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZIILjava/lang/String;)V
    .locals 1

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    .line 5
    iput-boolean p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    .line 6
    iput p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    .line 7
    iput p4, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    .line 8
    iput-object p5, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    const-string p5, "1.0"

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;-><init>(Ljava/lang/String;ZIILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Ljava/lang/String;ZIILjava/lang/String;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->copy(Ljava/lang/String;ZIILjava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZIILjava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;
    .locals 7

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;-><init>(Ljava/lang/String;ZIILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    iget-boolean v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    iget v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    iget v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFromIndex()I
    .locals 1

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    return v0
.end method

.method public final getNumResponses()I
    .locals 1

    iget v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    return v0
.end method

.method public final getOnlyOwnResponses()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    return v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PollResponsesQuery(pollId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->pollId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", onlyOwnResponses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->onlyOwnResponses:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", fromIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->fromIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", numResponses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->numResponses:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;->version:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
