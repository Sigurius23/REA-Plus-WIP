.class public final Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;
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
        "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;",
        "La3/h1;",
        "Le1/h;",
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
.field public final E:I

.field public final F:Z

.field public final G:I

.field public final H:I

.field public final I:Ljava/util/List;

.field public final J:Lkotlin/jvm/functions/Function1;

.field public final K:Le1/j;

.field public final L:Lu0/z0;

.field private final color:Li2/a0;

.field public final w:Ll3/g;

.field public final x:Ll3/v0;

.field public final y:Lp3/h;

.field public final z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->w:Ll3/g;

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->x:Ll3/v0;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->y:Lp3/h;

    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->E:I

    iput-boolean p6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->F:Z

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->G:I

    iput p8, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->H:I

    iput-object p9, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->I:Ljava/util/List;

    iput-object p10, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->K:Le1/j;

    iput-object p12, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Li2/a0;

    iput-object p13, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->L:Lu0/z0;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 14

    new-instance v0, Le1/h;

    iget-object v12, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Li2/a0;

    iget-object v13, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->L:Lu0/z0;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->w:Ll3/g;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->x:Ll3/v0;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->y:Lp3/h;

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->E:I

    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->F:Z

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->G:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->H:I

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->I:Ljava/util/List;

    iget-object v10, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    iget-object v11, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->K:Le1/j;

    invoke-direct/range {v0 .. v13}, Le1/h;-><init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Li2/a0;

    check-cast p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Li2/a0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->w:Ll3/g;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->w:Ll3/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->x:Ll3/v0;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->x:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->I:Ljava/util/List;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->I:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->y:Lp3/h;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->y:Lp3/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->L:Lu0/z0;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->L:Lu0/z0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->E:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->E:I

    if-ne v1, v3, :cond_e

    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->F:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->F:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->G:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->G:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->H:I

    iget v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->H:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->K:Le1/j;

    iget-object p1, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->K:Le1/j;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0

    :cond_e
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->w:Ll3/g;

    invoke-virtual {v0}, Ll3/g;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->x:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->y:Lp3/h;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->E:I

    invoke-static {v3, v2, v1}, Ld;->b(III)I

    move-result v2

    iget-boolean v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->F:Z

    invoke-static {v2, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v2

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->G:I

    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->H:I

    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->I:Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->K:Le1/j;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v0

    :goto_3
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->L:Lu0/z0;

    if-eqz v3, :cond_4

    check-cast v3, Lu0/e;

    invoke-virtual {v3}, Lu0/e;->hashCode()I

    move-result v3

    goto :goto_4

    :cond_4
    move v3, v0

    :goto_4
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Li2/a0;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_5
    add-int/2addr v2, v0

    return v2
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 12

    check-cast p1, Le1/h;

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Li2/a0;

    iget-object v1, p1, Le1/h;->R:Le1/p;

    iget-object v2, v1, Le1/p;->Z:Li2/a0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iput-object v0, v1, Le1/p;->Z:Li2/a0;

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->x:Ll3/v0;

    if-eqz v2, :cond_1

    iget-object v0, v1, Le1/p;->P:Ll3/v0;

    if-eq v4, v0, :cond_0

    iget-object v2, v4, Ll3/v0;->a:Ll3/m0;

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    invoke-virtual {v2, v0}, Ll3/m0;->c(Ll3/m0;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->w:Ll3/g;

    invoke-virtual {v1, v2}, Le1/p;->c1(Ll3/g;)Z

    move-result v2

    iget-object v3, p1, Le1/h;->R:Le1/p;

    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->I:Ljava/util/List;

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->H:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->G:I

    iget-boolean v8, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->F:Z

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->y:Lp3/h;

    iget v10, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->E:I

    iget-object v11, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->L:Lu0/z0;

    invoke-virtual/range {v3 .. v11}, Le1/p;->b1(Ll3/v0;Ljava/util/List;IIZLp3/h;ILu0/z0;)Z

    move-result v3

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->K:Le1/j;

    invoke-virtual {v1, v5, v6, v7, v4}, Le1/p;->a1(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Le1/j;Lkotlin/jvm/functions/Function1;)Z

    move-result v4

    invoke-virtual {v1, v0, v2, v3, v4}, Le1/p;->X0(ZZZZ)V

    iput-object v7, p1, Le1/h;->Q:Le1/j;

    invoke-static {p1}, La3/g;->i(La3/c0;)V

    return-void
.end method
