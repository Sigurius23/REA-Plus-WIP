.class public final Ll0/e0;
.super Lb3/m2;
.source "SourceFile"

# interfaces
.implements Ly2/c0;
.implements Lz2/c;


# static fields
.field public static final synthetic z:I


# instance fields
.field public final x:Ll0/b2;

.field public final y:Lp1/k1;


# direct methods
.method public constructor <init>(Ll0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/e0;->x:Ll0/b2;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ll0/e0;->y:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 8

    iget-object v0, p0, Ll0/e0;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    invoke-interface {v0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result v5

    sget-object v0, Lm83/z;->w:Lm83/z;

    if-nez v5, :cond_0

    new-instance p2, Lkx1/b;

    const/4 p3, 0x6

    invoke-direct {p2, p3}, Lkx1/b;-><init>(I)V

    const/4 p3, 0x0

    invoke-interface {p1, p3, p3, v0, p2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v4, 0x0

    const/4 v7, 0x3

    const/4 v3, 0x0

    move v6, v5

    move-wide v1, p3

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    new-instance p4, Lch/m;

    const/4 v1, 0x4

    invoke-direct {p4, p2, v1}, Lch/m;-><init>(Ly2/j1;I)V

    invoke-interface {p1, p3, v5, v0, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/e0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll0/e0;

    iget-object p1, p1, Ll0/e0;->x:Ll0/b2;

    iget-object v1, p0, Ll0/e0;->x:Ll0/b2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h(Lz2/g;)V
    .locals 2

    sget-object v0, Ll0/f;->d:Lz2/h;

    invoke-interface {p1, v0}, Lz2/g;->a(Lz2/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/b2;

    new-instance v0, Ll0/g0;

    iget-object v1, p0, Ll0/e0;->x:Ll0/b2;

    invoke-direct {v0, v1, p1}, Ll0/g0;-><init>(Ll0/b2;Ll0/b2;)V

    iget-object p1, p0, Ll0/e0;->y:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll0/e0;->x:Ll0/b2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    sget-object v1, Ll0/g2;->a:Lkf0/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
