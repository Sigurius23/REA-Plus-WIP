.class public final Ls61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Ls61/d;",
        "",
        "Lk61/c;",
        "strokeState",
        "Li71/h;",
        "scrollPosition",
        "Li71/g;",
        "dataScroller",
        "Ly3/c;",
        "density",
        "<init>",
        "(Lk61/c;Li71/h;Li71/g;Ly3/c;)V",
        "Lu61/a;",
        "segment",
        "Lh2/e;",
        "size",
        "",
        "Lh2/b;",
        "c",
        "(Lu61/a;J)Ljava/util/List;",
        "a",
        "Lk61/c;",
        "b",
        "Li71/h;",
        "Li71/g;",
        "Lk2/i;",
        "d",
        "Lk2/i;",
        "()Lk2/i;",
        "stroke",
        "design_release"
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
.field private final a:Lk61/c;

.field private final b:Li71/h;

.field private final c:Li71/g;

.field private final d:Lk2/i;


# direct methods
.method public constructor <init>(Lk61/c;Li71/h;Li71/g;Ly3/c;)V
    .locals 7

    const-string v0, "strokeState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollPosition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataScroller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls61/d;->a:Lk61/c;

    .line 3
    iput-object p2, p0, Ls61/d;->b:Li71/h;

    .line 4
    iput-object p3, p0, Ls61/d;->c:Li71/g;

    .line 5
    invoke-virtual {p1}, Lk61/c;->h()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    new-array p2, p2, [F

    fill-array-data p2, :array_0

    .line 6
    new-instance p3, Li2/k;

    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {p3, v0}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    :goto_0
    move-object v5, p3

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_0

    .line 7
    :goto_1
    new-instance v0, Lk2/i;

    .line 8
    invoke-virtual {p1}, Lk61/c;->g()F

    move-result p2

    invoke-interface {p4, p2}, Ly3/c;->q0(F)F

    move-result v1

    .line 9
    invoke-virtual {p1}, Lk61/c;->d()I

    move-result v3

    .line 10
    invoke-virtual {p1}, Lk61/c;->e()I

    move-result v4

    const/4 v6, 0x2

    const/4 v2, 0x0

    .line 11
    invoke-direct/range {v0 .. v6}, Lk2/i;-><init>(FFIILi2/t0;I)V

    .line 12
    iput-object v0, p0, Ls61/d;->d:Lk2/i;

    return-void

    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x41400000    # 12.0f
    .end array-data
.end method

.method public synthetic constructor <init>(Lk61/c;Li71/h;Li71/g;Ly3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 13
    new-instance v1, Lk61/c;

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    .line 14
    new-instance v1, Li71/h;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Li71/h;-><init>(JJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v1

    :cond_1
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    .line 15
    new-instance p3, Li71/i;

    invoke-direct {p3}, Li71/i;-><init>()V

    .line 16
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Ls61/d;-><init>(Lk61/c;Li71/h;Li71/g;Ly3/c;)V

    return-void
.end method


# virtual methods
.method public final a(Lu61/a;J)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu61/a;",
            "J)",
            "Ljava/util/List<",
            "Lh2/b;",
            ">;"
        }
    .end annotation

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Ls61/d;->c(Lu61/a;J)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr p2, v2

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, p3, v0, v1, v3}, Lh2/b;->a(FFJI)J

    move-result-wide v0

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lh2/b;

    iget-wide v4, p3, Lh2/b;->a:J

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-static {v2, p2, v4, v5, v3}, Lh2/b;->a(FFJI)J

    move-result-wide p2

    check-cast p1, Ljava/util/Collection;

    new-instance v2, Lh2/b;

    invoke-direct {v2, v0, v1}, Lh2/b;-><init>(J)V

    invoke-static {v2, p1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v0, Lh2/b;

    invoke-direct {v0, p2, p3}, Lh2/b;-><init>(J)V

    invoke-static {v0, p1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final b()Lk2/i;
    .locals 1

    iget-object v0, p0, Ls61/d;->d:Lk2/i;

    return-object v0
.end method

.method public final c(Lu61/a;J)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu61/a;",
            "J)",
            "Ljava/util/List<",
            "Lh2/b;",
            ">;"
        }
    .end annotation

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls61/d;->c:Li71/g;

    invoke-virtual {p1}, Lu61/a;->d()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Ls61/d;->b:Li71/h;

    invoke-virtual {p1}, Lu61/a;->e()Li71/d;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Li71/g;->a(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu61/e;

    invoke-virtual {v1}, Lu61/e;->a()F

    move-result v2

    const/16 v3, 0x20

    shr-long v4, p2, v3

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    mul-float/2addr v4, v2

    const-wide v5, 0xffffffffL

    and-long v7, p2, v5

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-virtual {v1}, Lu61/e;->h()F

    move-result v1

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    mul-float/2addr v2, v1

    sub-float/2addr v7, v2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v7, v4

    shl-long/2addr v1, v3

    and-long v3, v7, v5

    or-long/2addr v1, v3

    new-instance v3, Lh2/b;

    invoke-direct {v3, v1, v2}, Lh2/b;-><init>(J)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
