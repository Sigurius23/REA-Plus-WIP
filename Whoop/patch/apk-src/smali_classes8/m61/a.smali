.class public final Lm61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lm61/a;",
        "",
        "Lk61/c;",
        "strokeState",
        "Ly3/c;",
        "density",
        "<init>",
        "(Lk61/c;Ly3/c;)V",
        "Ll61/d;",
        "segment",
        "Lh2/e;",
        "size",
        "",
        "Ll83/k;",
        "Lh2/b;",
        "b",
        "(Ll61/d;J)Ljava/util/List;",
        "a",
        "Lk61/c;",
        "Lk2/i;",
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

.field private final b:Lk2/i;


# direct methods
.method public constructor <init>(Lk61/c;Ly3/c;)V
    .locals 8

    const-string v0, "density"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm61/a;->a:Lk61/c;

    if-eqz p1, :cond_0

    new-instance v1, Lk2/i;

    invoke-virtual {p1}, Lk61/c;->g()F

    move-result v0

    invoke-interface {p2, v0}, Ly3/c;->q0(F)F

    move-result v2

    invoke-virtual {p1}, Lk61/c;->d()I

    move-result v4

    invoke-virtual {p1}, Lk61/c;->e()I

    move-result v5

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Lk2/i;-><init>(FFIILi2/t0;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lm61/a;->b:Lk2/i;

    return-void
.end method


# virtual methods
.method public final a()Lk2/i;
    .locals 1

    iget-object v0, p0, Lm61/a;->b:Lk2/i;

    return-object v0
.end method

.method public final b(Ll61/d;J)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll61/d;",
            "J)",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll61/d;->b()Ljava/util/List;

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

    check-cast v1, Ll61/c;

    invoke-virtual {v1}, Ll61/c;->b()F

    move-result v2

    const/16 v3, 0x20

    shr-long v4, p2, v3

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    mul-float/2addr v5, v2

    const-wide v6, 0xffffffffL

    and-long v8, p2, v6

    long-to-int v2, v8

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    invoke-virtual {v1}, Ll61/c;->d()F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    mul-float/2addr v10, v9

    sub-float/2addr v8, v10

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v9, v5

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v11, v5

    shl-long v8, v9, v3

    and-long v10, v11, v6

    or-long/2addr v8, v10

    new-instance v5, Lh2/b;

    invoke-direct {v5, v8, v9}, Lh2/b;-><init>(J)V

    invoke-virtual {v1}, Ll61/c;->b()F

    move-result v8

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    mul-float/2addr v4, v8

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    invoke-virtual {v1}, Ll61/c;->c()F

    move-result v1

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    mul-float/2addr v2, v1

    sub-float/2addr v8, v2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v8, v4

    shl-long/2addr v1, v3

    and-long v3, v8, v6

    or-long/2addr v1, v3

    new-instance v3, Lh2/b;

    invoke-direct {v3, v1, v2}, Lh2/b;-><init>(J)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
