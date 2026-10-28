.class public final Lsq2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJB\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010!\u001a\u0004\u0008\"\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010!\u001a\u0004\u0008#\u0010\u0010\u00a8\u0006$"
    }
    d2 = {
        "Lsq2/b;",
        "",
        "Li2/x;",
        "color",
        "",
        "fillPercentage",
        "",
        "isPrimary",
        "",
        "statistic",
        "value",
        "<init>",
        "(JFZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "a",
        "(JFZLjava/lang/String;Ljava/lang/String;)Lsq2/b;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "c",
        "()J",
        "b",
        "F",
        "d",
        "()F",
        "Z",
        "g",
        "()Z",
        "Ljava/lang/String;",
        "e",
        "f",
        "user-journey_release"
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
.field private final a:J

.field private final b:F

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method private constructor <init>(JFZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "statistic"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lsq2/b;->a:J

    .line 4
    iput p3, p0, Lsq2/b;->b:F

    .line 5
    iput-boolean p4, p0, Lsq2/b;->c:Z

    .line 6
    iput-object p5, p0, Lsq2/b;->d:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lsq2/b;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JFZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lsq2/b;-><init>(JFZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lsq2/b;JFZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lsq2/b;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lsq2/b;->a:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lsq2/b;->b:F

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-boolean p4, p0, Lsq2/b;->c:Z

    :cond_2
    move v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lsq2/b;->d:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lsq2/b;->e:Ljava/lang/String;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lsq2/b;->a(JFZLjava/lang/String;Ljava/lang/String;)Lsq2/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JFZLjava/lang/String;Ljava/lang/String;)Lsq2/b;
    .locals 9

    const-string v0, "statistic"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsq2/b;

    const/4 v8, 0x0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lsq2/b;-><init>(JFZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lsq2/b;->a:J

    return-wide v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lsq2/b;->b:F

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsq2/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsq2/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsq2/b;

    iget-wide v3, p0, Lsq2/b;->a:J

    iget-wide v5, p1, Lsq2/b;->a:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lsq2/b;->b:F

    iget v3, p1, Lsq2/b;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lsq2/b;->c:Z

    iget-boolean v3, p1, Lsq2/b;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsq2/b;->d:Ljava/lang/String;

    iget-object v3, p1, Lsq2/b;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lsq2/b;->e:Ljava/lang/String;

    iget-object p1, p1, Lsq2/b;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsq2/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lsq2/b;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lsq2/b;->a:J

    sget v2, Li2/x;->o:I

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lsq2/b;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v2, p0, Lsq2/b;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lsq2/b;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lsq2/b;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lsq2/b;->a:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lsq2/b;->b:F

    iget-boolean v2, p0, Lsq2/b;->c:Z

    iget-object v3, p0, Lsq2/b;->d:Ljava/lang/String;

    iget-object v4, p0, Lsq2/b;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DonutStatItem(color="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fillPercentage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", isPrimary="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", statistic="

    const-string v1, ", value="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
