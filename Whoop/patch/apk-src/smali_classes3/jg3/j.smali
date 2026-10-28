.class public final Ljg3/j;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Lng3/j;
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic H:I


# instance fields
.field public final F:Ljg3/f;

.field public final G:Ljg3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljg3/f;->J:Ljg3/f;

    sget-object v1, Ljg3/p;->H:Ljg3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljg3/j;

    invoke-direct {v2, v0, v1}, Ljg3/j;-><init>(Ljg3/f;Ljg3/p;)V

    sget-object v0, Ljg3/f;->K:Ljg3/f;

    sget-object v1, Ljg3/p;->G:Ljg3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljg3/j;

    invoke-direct {v2, v0, v1}, Ljg3/j;-><init>(Ljg3/f;Ljg3/p;)V

    return-void
.end method

.method public constructor <init>(Ljg3/f;Ljg3/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "time"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljg3/j;->F:Ljg3/f;

    const-string p1, "offset"

    invoke-static {p2, p1}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ljg3/j;->G:Ljg3/p;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Deserialization via serialization delegate"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/16 v1, 0x42

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Lng3/a;->g()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final b(JLng3/m;)Lng3/j;
    .locals 2

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    iget-object v1, p0, Ljg3/j;->F:Ljg3/f;

    if-ne p3, v0, :cond_0

    check-cast p3, Lng3/a;

    iget-object v0, p3, Lng3/a;->x:Lng3/s;

    invoke-virtual {v0, p1, p2, p3}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    invoke-static {p1}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Ljg3/j;->p0(Ljg3/f;Ljg3/p;)Ljg3/j;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Ljg3/f;->E0(JLng3/m;)Ljg3/f;

    move-result-object p1

    iget-object p2, p0, Ljg3/j;->G:Ljg3/p;

    invoke-virtual {p0, p1, p2}, Ljg3/j;->p0(Ljg3/f;Ljg3/p;)Ljg3/j;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/j;

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/j;->o0(JLng3/r;)Ljg3/j;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 12

    check-cast p1, Ljg3/j;

    iget-object v0, p1, Ljg3/j;->G:Ljg3/p;

    iget-object v1, p1, Ljg3/j;->F:Ljg3/f;

    iget-object v2, p0, Ljg3/j;->G:Ljg3/p;

    invoke-virtual {v2, v0}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Ljg3/j;->F:Ljg3/f;

    if-eqz v0, :cond_0

    invoke-virtual {v3, v1}, Ljg3/f;->o0(Ljg3/f;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v3}, Ljg3/f;->C0()J

    move-result-wide v4

    iget v0, v2, Ljg3/p;->x:I

    int-to-long v6, v0

    const-wide/32 v8, 0x3b9aca00

    mul-long/2addr v6, v8

    sub-long/2addr v4, v6

    invoke-virtual {v1}, Ljg3/f;->C0()J

    move-result-wide v6

    iget-object p1, p1, Ljg3/j;->G:Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    int-to-long v10, p1

    mul-long/2addr v10, v8

    sub-long/2addr v6, v10

    invoke-static {v4, v5, v6, v7}, Lcom/squareup/wire/n;->q(JJ)I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v3, v1}, Ljg3/f;->o0(Ljg3/f;)I

    move-result p1

    :cond_1
    return p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_0

    check-cast p1, Lng3/a;

    iget-object p1, p1, Lng3/a;->x:Lng3/s;

    return-object p1

    :cond_0
    iget-object v0, p0, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->z:Lng3/a;

    iget-object v1, p0, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->C0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    iget-object v1, p0, Ljg3/j;->G:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/j;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/j;

    iget-object v1, p0, Ljg3/j;->F:Ljg3/f;

    iget-object v3, p1, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v1, v3}, Ljg3/f;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ljg3/j;->G:Ljg3/p;

    iget-object p1, p1, Ljg3/j;->G:Ljg3/p;

    invoke-virtual {v1, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_0

    sget-object p1, Lng3/b;->x:Lng3/b;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->e:Lng3/n;

    if-eq p1, v0, :cond_5

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Ljg3/j;->F:Ljg3/f;

    return-object p1

    :cond_2
    sget-object v0, Lng3/p;->b:Lg73/d;

    if-eq p1, v0, :cond_4

    sget-object v0, Lng3/p;->f:Lng3/o;

    if-eq p1, v0, :cond_4

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_5
    :goto_1
    iget-object p1, p0, Ljg3/j;->G:Ljg3/p;

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ljg3/j;->G:Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    int-to-long v0, p1

    return-wide v0

    :cond_0
    iget-object v0, p0, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v0}, Ljg3/f;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljg3/j;->G:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/j;->o0(JLng3/r;)Ljg3/j;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/j;->o0(JLng3/r;)Ljg3/j;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/j;->o0(JLng3/r;)Ljg3/j;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 0

    invoke-virtual {p1, p0}, Ljg3/d;->e(Lng3/j;)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/j;

    return-object p1
.end method

.method public final o0(JLng3/r;)Ljg3/j;
    .locals 1

    instance-of v0, p3, Lng3/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v0, p1, p2, p3}, Ljg3/f;->w0(JLng3/r;)Ljg3/f;

    move-result-object p1

    iget-object p2, p0, Ljg3/j;->G:Ljg3/p;

    invoke-virtual {p0, p1, p2}, Ljg3/j;->p0(Ljg3/f;Ljg3/p;)Ljg3/j;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/j;

    return-object p1
.end method

.method public final p0(Ljg3/f;Ljg3/p;)Ljg3/j;
    .locals 1

    iget-object v0, p0, Ljg3/j;->F:Ljg3/f;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ljg3/j;->G:Ljg3/p;

    invoke-virtual {v0, p2}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljg3/j;

    invoke-direct {v0, p1, p2}, Ljg3/j;-><init>(Ljg3/f;Ljg3/p;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljg3/j;->G:Ljg3/p;

    iget-object v1, v1, Ljg3/p;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
