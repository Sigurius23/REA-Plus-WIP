.class public final Lx1/g;
.super Lu1/c;
.source "SourceFile"

# interfaces
.implements Lp1/p1;


# static fields
.field public static final z:Lx1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx1/g;

    sget-object v1, Lu1/o;->e:Lu1/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu1/c;-><init>(Lu1/o;I)V

    sput-object v0, Lx1/g;->z:Lx1/g;

    return-void
.end method


# virtual methods
.method public final a()Lu1/e;
    .locals 1

    new-instance v0, Lx1/f;

    invoke-direct {v0, p0}, Lu1/e;-><init>(Lu1/c;)V

    iput-object p0, v0, Lx1/f;->G:Lx1/g;

    return-object v0
.end method

.method public final builder()Ls1/c;
    .locals 1

    new-instance v0, Lx1/f;

    invoke-direct {v0, p0}, Lu1/e;-><init>(Lu1/c;)V

    iput-object p0, v0, Lx1/f;->G:Lx1/g;

    return-object v0
.end method

.method public final c(Lp1/t1;Lp1/w2;)Lx1/g;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Lu1/c;->w:Lu1/o;

    invoke-virtual {v2, p1, v0, p2, v1}, Lu1/o;->u(Ljava/lang/Object;ILjava/lang/Object;I)Lbd3/v;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p2, Lx1/g;

    iget-object v0, p1, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Lu1/o;

    iget v1, p0, Lu1/c;->x:I

    iget p1, p1, Lbd3/v;->x:I

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, Lu1/c;-><init>(Lu1/o;I)V

    return-object p2
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lp1/t1;

    invoke-super {p0, p1}, Lu1/c;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lp1/w2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lp1/w2;

    invoke-super {p0, p1}, Lm83/f;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lp1/t1;

    invoke-super {p0, p1}, Lu1/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/w2;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lp1/t1;

    check-cast p2, Lp1/w2;

    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/w2;

    return-object p1
.end method
