.class public final Loh2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loh2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Loh2/b$b;",
        "Loh2/b;",
        "",
        "major",
        "minor",
        "build",
        "unreleased",
        "<init>",
        "(JJJJ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "J",
        "c",
        "()J",
        "d",
        "e",
        "h",
        "raw",
        "connectivity-data-packets-model_release"
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
.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method public constructor <init>(JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Loh2/b$b;->b:J

    iput-wide p3, p0, Loh2/b$b;->c:J

    iput-wide p5, p0, Loh2/b$b;->d:J

    iput-wide p7, p0, Loh2/b$b;->e:J

    return-void
.end method


# virtual methods
.method public bridge a()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Loh2/b$b;->d:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Loh2/b$b;->b:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Loh2/b$b;->c:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Loh2/b$b;->e:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Loh2/b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Loh2/b$b;

    iget-wide v3, p0, Loh2/b$b;->b:J

    iget-wide v5, p1, Loh2/b$b;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Loh2/b$b;->c:J

    iget-wide v5, p1, Loh2/b$b;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Loh2/b$b;->d:J

    iget-wide v5, p1, Loh2/b$b;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Loh2/b$b;->e:J

    iget-wide v5, p1, Loh2/b$b;->e:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Loh2/b$b;->b:J

    iget-wide v2, p0, Loh2/b$b;->c:J

    iget-wide v4, p0, Loh2/b$b;->d:J

    iget-wide v6, p0, Loh2/b$b;->e:J

    const/4 v8, 0x4

    new-array v8, v8, [J

    const/4 v9, 0x0

    aput-wide v0, v8, v9

    const/4 v0, 0x1

    aput-wide v2, v8, v0

    const/4 v0, 0x2

    aput-wide v4, v8, v0

    const/4 v0, 0x3

    aput-wide v6, v8, v0

    invoke-static {v8}, Luk0/c;->b([J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Loh2/b$b;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Loh2/b$b;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Loh2/b$b;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Loh2/b$b;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Loh2/b$b;->b:J

    iget-wide v2, p0, Loh2/b$b;->c:J

    iget-wide v4, p0, Loh2/b$b;->d:J

    iget-wide v6, p0, Loh2/b$b;->e:J

    const-string v8, "FirmwareVersion(major="

    const-string v9, ", minor="

    invoke-static {v0, v1, v8, v9}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", build="

    const-string v2, ", unreleased="

    invoke-static {v0, v1, v4, v5, v2}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v7, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
