.class public final Ljx0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJL\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010 \u001a\u0004\u0008\u001f\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010 \u001a\u0004\u0008!\u0010\u0012\u00a8\u0006\""
    }
    d2 = {
        "Ljx0/a;",
        "",
        "",
        "workerId",
        "triggerSource",
        "",
        "triggerTimestamp",
        "resultTimestamp",
        "",
        "totalPackUpload",
        "uploadRetryCount",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;JJII)V",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;JJII)Ljx0/a;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "h",
        "b",
        "e",
        "c",
        "J",
        "f",
        "()J",
        "d",
        "I",
        "g",
        "data-sync-service_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:J

.field private final e:I

.field private final f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJII)V
    .locals 1

    const-string v0, "workerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "triggerSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljx0/a;->a:Ljava/lang/String;

    iput-object p2, p0, Ljx0/a;->b:Ljava/lang/String;

    iput-wide p3, p0, Ljx0/a;->c:J

    iput-wide p5, p0, Ljx0/a;->d:J

    iput p7, p0, Ljx0/a;->e:I

    iput p8, p0, Ljx0/a;->f:I

    return-void
.end method

.method public static synthetic b(Ljx0/a;Ljava/lang/String;Ljava/lang/String;JJIIILjava/lang/Object;)Ljx0/a;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Ljx0/a;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Ljx0/a;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-wide p3, p0, Ljx0/a;->c:J

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p5, p0, Ljx0/a;->d:J

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p7, p0, Ljx0/a;->e:I

    :cond_4
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_5

    iget p8, p0, Ljx0/a;->f:I

    :cond_5
    move p9, p7

    move p10, p8

    move-wide p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Ljx0/a;->a(Ljava/lang/String;Ljava/lang/String;JJII)Ljx0/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;JJII)Ljx0/a;
    .locals 10

    const-string v0, "workerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "triggerSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljx0/a;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Ljx0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJII)V

    return-object v1
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Ljx0/a;->d:J

    return-wide v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ljx0/a;->e:I

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx0/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljx0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljx0/a;

    iget-object v1, p0, Ljx0/a;->a:Ljava/lang/String;

    iget-object v3, p1, Ljx0/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljx0/a;->b:Ljava/lang/String;

    iget-object v3, p1, Ljx0/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Ljx0/a;->c:J

    iget-wide v5, p1, Ljx0/a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Ljx0/a;->d:J

    iget-wide v5, p1, Ljx0/a;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Ljx0/a;->e:I

    iget v3, p1, Ljx0/a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Ljx0/a;->f:I

    iget p1, p1, Ljx0/a;->f:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Ljx0/a;->c:J

    return-wide v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ljx0/a;->f:I

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx0/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ljx0/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx0/a;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Ljx0/a;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ljx0/a;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Ljx0/a;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Ljx0/a;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Ljx0/a;->a:Ljava/lang/String;

    iget-object v1, p0, Ljx0/a;->b:Ljava/lang/String;

    iget-wide v2, p0, Ljx0/a;->c:J

    iget-wide v4, p0, Ljx0/a;->d:J

    iget v6, p0, Ljx0/a;->e:I

    iget v7, p0, Ljx0/a;->f:I

    const-string v8, ", triggerSource="

    const-string v9, ", triggerTimestamp="

    const-string v10, "DataSyncWork(workerId="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", resultTimestamp="

    const-string v2, ", totalPackUpload="

    invoke-static {v0, v1, v4, v5, v2}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v1, ", uploadRetryCount="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
