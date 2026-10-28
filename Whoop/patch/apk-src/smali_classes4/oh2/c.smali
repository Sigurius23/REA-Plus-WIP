.class public final Loh2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loh2/c$a;,
        Loh2/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u0000 \t2\u00020\u0001:\u0002\u0016\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0016\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Loh2/c;",
        "",
        "",
        "hardwareFamily",
        "pcbaRevision",
        "opticalRevision",
        "<init>",
        "(JJJ)V",
        "",
        "d",
        "()Ljava/lang/String;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "J",
        "()J",
        "b",
        "c",
        "strap-metadata_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Loh2/c$b;

.field private static final e:Ltr2/n;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loh2/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loh2/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Loh2/c;->d:Loh2/c$b;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "HardwareVersion"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Loh2/c;->e:Ltr2/n;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Loh2/c;->a:J

    iput-wide p3, p0, Loh2/c;->b:J

    iput-wide p5, p0, Loh2/c;->c:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Loh2/c;->a:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Loh2/c;->c:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Loh2/c;->b:J

    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Loh2/c;->a:J

    iget-wide v2, p0, Loh2/c;->b:J

    iget-wide v4, p0, Loh2/c;->c:J

    const/4 v6, 0x3

    new-array v6, v6, [J

    const/4 v7, 0x0

    aput-wide v0, v6, v7

    const/4 v0, 0x1

    aput-wide v2, v6, v0

    const/4 v0, 0x2

    aput-wide v4, v6, v0

    invoke-static {v6}, Luk0/c;->b([J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Loh2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Loh2/c;

    iget-wide v3, p0, Loh2/c;->a:J

    iget-wide v5, p1, Loh2/c;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Loh2/c;->b:J

    iget-wide v5, p1, Loh2/c;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Loh2/c;->c:J

    iget-wide v5, p1, Loh2/c;->c:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Loh2/c;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Loh2/c;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Loh2/c;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Loh2/c;->a:J

    iget-wide v2, p0, Loh2/c;->b:J

    iget-wide v4, p0, Loh2/c;->c:J

    const-string v6, "HardwareVersion(hardwareFamily="

    const-string v7, ", pcbaRevision="

    invoke-static {v0, v1, v6, v7}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opticalRevision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
