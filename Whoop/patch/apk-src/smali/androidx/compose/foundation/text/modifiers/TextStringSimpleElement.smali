.class public final Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;",
        "La3/h1;",
        "Le1/s;",
        "Li2/a0;",
        "color",
        "Li2/a0;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Z

.field public final F:I

.field public final G:I

.field private final color:Li2/a0;

.field public final w:Ljava/lang/String;

.field public final x:Ll3/v0;

.field public final y:Lp3/h;

.field public final z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll3/v0;Lp3/h;IZIILi2/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->x:Ll3/v0;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->y:Lp3/h;

    iput p4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->z:I

    iput-boolean p5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->E:Z

    iput p6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->F:I

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->G:I

    iput-object p8, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->color:Li2/a0;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Le1/s;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->color:Li2/a0;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:Ljava/lang/String;

    iput-object v2, v0, Le1/s;->O:Ljava/lang/String;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->x:Ll3/v0;

    iput-object v2, v0, Le1/s;->P:Ll3/v0;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->y:Lp3/h;

    iput-object v2, v0, Le1/s;->Q:Lp3/h;

    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->z:I

    iput v2, v0, Le1/s;->R:I

    iget-boolean v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->E:Z

    iput-boolean v2, v0, Le1/s;->S:Z

    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->F:I

    iput v2, v0, Le1/s;->T:I

    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->G:I

    iput v2, v0, Le1/s;->U:I

    iput-object v1, v0, Le1/s;->V:Li2/a0;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->color:Li2/a0;

    check-cast p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->color:Li2/a0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->x:Ll3/v0;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->x:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->y:Lp3/h;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->y:Lp3/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->z:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->z:I

    if-ne v1, v3, :cond_9

    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->E:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->F:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->F:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->G:I

    iget p1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->G:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0

    :cond_9
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->x:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->y:Lp3/h;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->z:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->F:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->G:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->color:Li2/a0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 11

    check-cast p1, Le1/s;

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->color:Li2/a0;

    iget-object v1, p1, Le1/s;->V:Li2/a0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iput-object v0, p1, Le1/s;->V:Li2/a0;

    const/4 v0, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->x:Ll3/v0;

    if-eqz v1, :cond_1

    iget-object v1, p1, Le1/s;->P:Ll3/v0;

    if-eq v3, v1, :cond_0

    iget-object v4, v3, Ll3/v0;->a:Ll3/m0;

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual {v4, v1}, Ll3/m0;->c(Ll3/m0;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iget-object v4, p1, Le1/s;->O:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    iput-object v5, p1, Le1/s;->O:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p1, Le1/s;->Z:Le1/r;

    move v0, v2

    :goto_2
    iget-object v4, p1, Le1/s;->P:Ll3/v0;

    invoke-virtual {v4, v3}, Ll3/v0;->d(Ll3/v0;)Z

    move-result v4

    xor-int/2addr v4, v2

    iput-object v3, p1, Le1/s;->P:Ll3/v0;

    iget v3, p1, Le1/s;->U:I

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->G:I

    if-eq v3, v5, :cond_3

    iput v5, p1, Le1/s;->U:I

    move v4, v2

    :cond_3
    iget v3, p1, Le1/s;->T:I

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->F:I

    if-eq v3, v5, :cond_4

    iput v5, p1, Le1/s;->T:I

    move v4, v2

    :cond_4
    iget-boolean v3, p1, Le1/s;->S:Z

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->E:Z

    if-eq v3, v5, :cond_5

    iput-boolean v5, p1, Le1/s;->S:Z

    move v4, v2

    :cond_5
    iget-object v3, p1, Le1/s;->Q:Lp3/h;

    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->y:Lp3/h;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    iput-object v5, p1, Le1/s;->Q:Lp3/h;

    move v4, v2

    :cond_6
    iget v3, p1, Le1/s;->R:I

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->z:I

    if-ne v3, v5, :cond_7

    move v2, v4

    goto :goto_3

    :cond_7
    iput v5, p1, Le1/s;->R:I

    :goto_3
    if-nez v0, :cond_8

    if-eqz v2, :cond_9

    :cond_8
    invoke-virtual {p1}, Le1/s;->X0()Le1/g;

    move-result-object v3

    iget-object v4, p1, Le1/s;->O:Ljava/lang/String;

    iget-object v5, p1, Le1/s;->P:Ll3/v0;

    iget-object v6, p1, Le1/s;->Q:Lp3/h;

    iget v7, p1, Le1/s;->R:I

    iget-boolean v8, p1, Le1/s;->S:Z

    iget v9, p1, Le1/s;->T:I

    iget v10, p1, Le1/s;->U:I

    iput-object v4, v3, Le1/g;->a:Ljava/lang/String;

    iput-object v5, v3, Le1/g;->b:Ll3/v0;

    iput-object v6, v3, Le1/g;->c:Lp3/h;

    iput v7, v3, Le1/g;->d:I

    iput-boolean v8, v3, Le1/g;->e:Z

    iput v9, v3, Le1/g;->f:I

    iput v10, v3, Le1/g;->g:I

    iget-wide v4, v3, Le1/g;->s:J

    const/4 v6, 0x2

    shl-long/2addr v4, v6

    const-wide/16 v6, 0x2

    or-long/2addr v4, v6

    iput-wide v4, v3, Le1/g;->s:J

    invoke-virtual {v3}, Le1/g;->c()V

    :cond_9
    iget-boolean v3, p1, Lb2/v;->N:Z

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    if-nez v0, :cond_b

    if-eqz v1, :cond_c

    iget-object v3, p1, Le1/s;->Y:Le1/q;

    if-eqz v3, :cond_c

    :cond_b
    invoke-static {p1}, La3/g;->j(La3/j2;)V

    :cond_c
    if-nez v0, :cond_d

    if-eqz v2, :cond_e

    :cond_d
    invoke-static {p1}, La3/g;->i(La3/c0;)V

    invoke-static {p1}, La3/g;->h(La3/r;)V

    :cond_e
    if-eqz v1, :cond_f

    invoke-static {p1}, La3/g;->h(La3/r;)V

    :cond_f
    :goto_4
    return-void
.end method
