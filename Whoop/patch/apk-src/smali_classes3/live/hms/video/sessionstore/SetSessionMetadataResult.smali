.class public final Llive/hms/video/sessionstore/SetSessionMetadataResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0008H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
        "",
        "changeVersion",
        "",
        "data",
        "Lcom/google/gson/JsonElement;",
        "updatedAt",
        "version",
        "",
        "<init>",
        "(JLcom/google/gson/JsonElement;JLjava/lang/String;)V",
        "getChangeVersion",
        "()J",
        "getData",
        "()Lcom/google/gson/JsonElement;",
        "getUpdatedAt",
        "getVersion",
        "()Ljava/lang/String;",
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

.field private final updatedAt:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLcom/google/gson/JsonElement;JLjava/lang/String;)V
    .locals 1

    const-string v0, "version"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    iput-object p3, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    iput-wide p4, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    iput-object p6, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sessionstore/SetSessionMetadataResult;JLcom/google/gson/JsonElement;JLjava/lang/String;ILjava/lang/Object;)Llive/hms/video/sessionstore/SetSessionMetadataResult;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    :cond_2
    move-wide v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p6, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    :cond_3
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Llive/hms/video/sessionstore/SetSessionMetadataResult;->copy(JLcom/google/gson/JsonElement;JLjava/lang/String;)Llive/hms/video/sessionstore/SetSessionMetadataResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    return-wide v0
.end method

.method public final component2()Lcom/google/gson/JsonElement;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLcom/google/gson/JsonElement;JLjava/lang/String;)Llive/hms/video/sessionstore/SetSessionMetadataResult;
    .locals 8

    const-string v0, "version"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sessionstore/SetSessionMetadataResult;

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Llive/hms/video/sessionstore/SetSessionMetadataResult;-><init>(JLcom/google/gson/JsonElement;JLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;

    iget-wide v3, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    iget-wide v5, p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    iget-object v3, p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    iget-wide v5, p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getChangeVersion()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    return-wide v0
.end method

.method public final getData()Lcom/google/gson/JsonElement;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    return-object v0
.end method

.method public final getUpdatedAt()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    return-wide v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SetSessionMetadataResult(changeVersion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->changeVersion:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->data:Lcom/google/gson/JsonElement;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->updatedAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sessionstore/SetSessionMetadataResult;->version:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
