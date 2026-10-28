.class public final La3/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# instance fields
.field public w:Z

.field public x:J

.field public y:J

.field public final synthetic z:La3/w0;


# direct methods
.method public constructor <init>(La3/w0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/t0;->z:La3/w0;

    const-wide v0, 0x7fffffff7fffffffL

    iput-wide v0, p0, La3/t0;->x:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La3/t0;->y:J

    return-void
.end method


# virtual methods
.method public final a(Ly2/o;F)V
    .locals 6

    iget-object v0, p0, La3/t0;->z:La3/w0;

    iget-object v1, v0, La3/w0;->M:La3/i2;

    if-nez v1, :cond_0

    new-instance v1, La3/i2;

    invoke-direct {v1}, La3/i2;-><init>()V

    iput-object v1, v0, La3/w0;->M:La3/i2;

    :cond_0
    iget-object v0, v1, La3/i2;->b:Ljava/lang/Object;

    check-cast v0, [Ly2/o;

    invoke-static {v0, p1}, Lm83/n;->z0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, 0x1

    if-gez v0, :cond_2

    iget v0, v1, La3/i2;->a:I

    iget-object v3, v1, La3/i2;->b:Ljava/lang/Object;

    check-cast v3, [Ly2/o;

    array-length v4, v3

    if-ne v0, v4, :cond_1

    mul-int/lit8 v4, v0, 0x2

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v5, "copyOf(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, [Ly2/o;

    iput-object v3, v1, La3/i2;->b:Ljava/lang/Object;

    iget-object v3, v1, La3/i2;->c:Ljava/lang/Object;

    check-cast v3, [F

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v1, La3/i2;->c:Ljava/lang/Object;

    iget-object v3, v1, La3/i2;->d:Ljava/io/Serializable;

    check-cast v3, [B

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v1, La3/i2;->d:Ljava/io/Serializable;

    :cond_1
    iget-object v3, v1, La3/i2;->b:Ljava/lang/Object;

    check-cast v3, [Ly2/o;

    aput-object p1, v3, v0

    iget-object p1, v1, La3/i2;->d:Ljava/io/Serializable;

    check-cast p1, [B

    const/4 v3, 0x3

    aput-byte v3, p1, v0

    iget-object p1, v1, La3/i2;->c:Ljava/lang/Object;

    check-cast p1, [F

    aput p2, p1, v0

    iget p1, v1, La3/i2;->a:I

    add-int/2addr p1, v2

    iput p1, v1, La3/i2;->a:I

    return-void

    :cond_2
    iget-object p1, v1, La3/i2;->c:Ljava/lang/Object;

    check-cast p1, [F

    aget v3, p1, v0

    cmpg-float v3, v3, p2

    if-nez v3, :cond_4

    iget-object p1, v1, La3/i2;->d:Ljava/io/Serializable;

    check-cast p1, [B

    aget-byte p2, p1, v0

    const/4 v1, 0x2

    if-ne p2, v1, :cond_3

    const/4 p2, 0x0

    aput-byte p2, p1, v0

    :cond_3
    return-void

    :cond_4
    aput p2, p1, v0

    iget-object p1, v1, La3/i2;->d:Ljava/io/Serializable;

    check-cast p1, [B

    aput-byte v2, p1, v0

    return-void
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, La3/t0;->z:La3/w0;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, La3/t0;->z:La3/w0;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method
