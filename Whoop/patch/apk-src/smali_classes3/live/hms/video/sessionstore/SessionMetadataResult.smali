.class public final Llive/hms/video/sessionstore/SessionMetadataResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JI\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "Llive/hms/video/sessionstore/SessionMetadataResult;",
        "",
        "changeVersion",
        "",
        "updatedByPeerId",
        "",
        "data",
        "Lcom/google/gson/JsonElement;",
        "version",
        "key",
        "updatedAt",
        "<init>",
        "(JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;J)V",
        "getChangeVersion",
        "()J",
        "getUpdatedByPeerId",
        "()Ljava/lang/String;",
        "getData",
        "()Lcom/google/gson/JsonElement;",
        "getVersion",
        "getKey",
        "getUpdatedAt",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final changeVersion:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "change_version"
    .end annotation
.end field

.field private final data:Lcom/google/gson/JsonElement;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "data"
    .end annotation
.end field

.field private final key:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "key"
    .end annotation
.end field

.field private final updatedAt:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final updatedByPeerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_by"
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    const-string v0, "version"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    iput-object p3, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    iput-object p5, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    iput-object p6, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    iput-wide p7, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sessionstore/SessionMetadataResult;JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Llive/hms/video/sessionstore/SessionMetadataResult;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    :cond_4
    move-object v6, p6

    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    iget-wide p1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    move-wide v7, p1

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_5
    move-wide/from16 v7, p7

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v8}, Llive/hms/video/sessionstore/SessionMetadataResult;->copy(JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;J)Llive/hms/video/sessionstore/SessionMetadataResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/google/gson/JsonElement;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    return-wide v0
.end method

.method public final copy(JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;J)Llive/hms/video/sessionstore/SessionMetadataResult;
    .locals 10

    const-string v0, "version"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sessionstore/SessionMetadataResult;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Llive/hms/video/sessionstore/SessionMetadataResult;-><init>(JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sessionstore/SessionMetadataResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sessionstore/SessionMetadataResult;

    iget-wide v3, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    iget-wide v5, p1, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    iget-object v3, p1, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    iget-wide v5, p1, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getChangeVersion()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    return-wide v0
.end method

.method public final getData()Lcom/google/gson/JsonElement;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    return-wide v0
.end method

.method public final getUpdatedByPeerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SessionMetadataResult(changeVersion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->changeVersion:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", updatedByPeerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedByPeerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sessionstore/SessionMetadataResult;->updatedAt:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
