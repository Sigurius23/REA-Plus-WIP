.class public final Lev0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0080\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lev0/a;",
        "",
        "",
        "countOfDisconnects",
        "",
        "durationStrapDisconnectedMillis",
        "lastDisconnectMillis",
        "Ltd1/e;",
        "lastStrapState",
        "<init>",
        "(IJJLtd1/e;)V",
        "a",
        "(IJJLtd1/e;)Lev0/a;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "c",
        "b",
        "J",
        "d",
        "()J",
        "e",
        "Ltd1/e;",
        "f",
        "()Ltd1/e;",
        "connectivity-analytics_release"
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
.field private final a:I

.field private final b:J

.field private final c:J

.field private final d:Ltd1/e;


# direct methods
.method public constructor <init>(IJJLtd1/e;)V
    .locals 1

    const-string v0, "lastStrapState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lev0/a;->a:I

    .line 3
    iput-wide p2, p0, Lev0/a;->b:J

    .line 4
    iput-wide p4, p0, Lev0/a;->c:J

    .line 5
    iput-object p6, p0, Lev0/a;->d:Ltd1/e;

    return-void
.end method

.method public synthetic constructor <init>(IJJLtd1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const-wide/16 v0, 0x0

    if-eqz p8, :cond_1

    move-wide p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    .line 6
    sget-object p6, Ltd1/e;->NONE:Ltd1/e;

    :cond_3
    move-object p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    .line 7
    invoke-direct/range {p2 .. p8}, Lev0/a;-><init>(IJJLtd1/e;)V

    return-void
.end method

.method public static synthetic b(Lev0/a;IJJLtd1/e;ILjava/lang/Object;)Lev0/a;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lev0/a;->a:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lev0/a;->b:J

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p4, p0, Lev0/a;->c:J

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    iget-object p6, p0, Lev0/a;->d:Ltd1/e;

    :cond_3
    move-object p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p8}, Lev0/a;->a(IJJLtd1/e;)Lev0/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IJJLtd1/e;)Lev0/a;
    .locals 8

    const-string v0, "lastStrapState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lev0/a;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lev0/a;-><init>(IJJLtd1/e;)V

    return-object v1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lev0/a;->a:I

    return v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lev0/a;->b:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lev0/a;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lev0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lev0/a;

    iget v1, p0, Lev0/a;->a:I

    iget v3, p1, Lev0/a;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lev0/a;->b:J

    iget-wide v5, p1, Lev0/a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lev0/a;->c:J

    iget-wide v5, p1, Lev0/a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lev0/a;->d:Ltd1/e;

    iget-object p1, p1, Lev0/a;->d:Ltd1/e;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Ltd1/e;
    .locals 1

    iget-object v0, p0, Lev0/a;->d:Ltd1/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lev0/a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lev0/a;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lev0/a;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lev0/a;->d:Ltd1/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lev0/a;->a:I

    iget-wide v1, p0, Lev0/a;->b:J

    iget-wide v3, p0, Lev0/a;->c:J

    iget-object v5, p0, Lev0/a;->d:Ltd1/e;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "StrapDisconnectCountAndTime(countOfDisconnects="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", durationStrapDisconnectedMillis="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", lastDisconnectMillis="

    const-string v1, ", lastStrapState="

    invoke-static {v6, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
