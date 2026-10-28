.class public final Ldk0/k;
.super Llt0/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u000e\u001a\u0004\u0008\u0019\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u000eR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Ldk0/k;",
        "Llt0/c;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lsj0/a;",
        "R",
        "()Lsj0/a;",
        "",
        "c",
        "S",
        "getRevision",
        "()S",
        "revision",
        "Lfk2/a;",
        "d",
        "Lfk2/a;",
        "Q",
        "()Lfk2/a;",
        "timeStamp",
        "e",
        "getHeartRate",
        "heartRate",
        "",
        "f",
        "Z",
        "isOffWrist",
        "g",
        "deviceLocationShort",
        "Ljk0/c;",
        "h",
        "Ljk0/c;",
        "garmentDeviceLocation",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:S

.field private final d:Lfk2/a;

.field private final e:S

.field private final f:Z

.field private final g:S

.field private final h:Ljk0/c;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 6

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    iput-short v1, p0, Ldk0/k;->c:S

    new-instance v1, Lfk2/a;

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    invoke-static {v2}, Luk0/b;->d(I)J

    move-result-wide v2

    sget-object v4, Luk0/b;->a:Luk0/b;

    const/4 v5, 0x6

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v5

    invoke-virtual {v4, v5}, Luk0/b;->e(S)I

    move-result v4

    int-to-long v4, v4

    invoke-direct {v1, v2, v3, v4, v5}, Lfk2/a;-><init>(JJ)V

    iput-object v1, p0, Ldk0/k;->d:Lfk2/a;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    iput-short v1, p0, Ldk0/k;->e:S

    const/16 v1, 0x12

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ldk0/k;->f:Z

    const/16 v0, 0x13

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Luk0/b;->b(B)S

    move-result p1

    iput-short p1, p0, Ldk0/k;->g:S

    sget-object v0, Ljk0/c;->Companion:Ljk0/c$a;

    invoke-virtual {v0, p1}, Ljk0/c$a;->a(I)Ljk0/c;

    move-result-object p1

    iput-object p1, p0, Ldk0/k;->h:Ljk0/c;

    return-void
.end method


# virtual methods
.method public final Q()Lfk2/a;
    .locals 1

    iget-object v0, p0, Ldk0/k;->d:Lfk2/a;

    return-object v0
.end method

.method public final R()Lsj0/a;
    .locals 5

    new-instance v0, Lsj0/a;

    iget-short v1, p0, Ldk0/k;->e:S

    iget-boolean v2, p0, Ldk0/k;->f:Z

    iget-object v3, p0, Ldk0/k;->d:Lfk2/a;

    iget-object v4, p0, Ldk0/k;->h:Ljk0/c;

    invoke-direct {v0, v1, v2, v3, v4}, Lsj0/a;-><init>(IZLfk2/a;Ljk0/c;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-short v0, p0, Ldk0/k;->c:S

    const/4 v1, 0x2

    const-string v2, ", timestamp: "

    const-string v3, ", Heart Rate: "

    const-string v4, " Revision: "

    if-ne v0, v1, :cond_0

    invoke-super {p0}, Llt0/c;->toString()Ljava/lang/String;

    move-result-object v0

    iget-short v1, p0, Ldk0/k;->c:S

    iget-short v5, p0, Ldk0/k;->e:S

    iget-object v6, p0, Ldk0/k;->d:Lfk2/a;

    iget-boolean v7, p0, Ldk0/k;->f:Z

    iget-object v8, p0, Ldk0/k;->h:Ljk0/c;

    iget-short v9, p0, Ldk0/k;->g:S

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isOffWrist: "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", Body Location: "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Llt0/c;->toString()Ljava/lang/String;

    move-result-object v0

    iget-short v1, p0, Ldk0/k;->c:S

    iget-short v5, p0, Ldk0/k;->e:S

    iget-object v6, p0, Ldk0/k;->d:Lfk2/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
