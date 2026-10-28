.class public final Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;
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
        "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;",
        "La3/h1;",
        "Le1/p;",
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

.field public final K:Lu0/z0;

.field public final L:Lkotlin/jvm/functions/Function1;

.field private final color:Li2/a0;

.field public final w:Ll3/g;

.field public final x:Ll3/v0;

.field public final y:Lp3/h;

.field public final z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Li2/a0;Lu0/z0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->w:Ll3/g;

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->y:Lp3/h;

    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->E:I

    iput-boolean p6, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->F:Z

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->G:I

    iput p8, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->H:I

    iput-object p9, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->I:Ljava/util/List;

    iput-object p10, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->color:Li2/a0;

    iput-object p12, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->K:Lu0/z0;

    iput-object p13, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->L:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 15

    new-instance v0, Le1/p;

    iget-object v12, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->color:Li2/a0;

    iget-object v13, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->K:Lu0/z0;

    iget-object v14, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->L:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->w:Ll3/g;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->y:Lp3/h;

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->E:I

    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->F:Z

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->G:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->H:I

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->I:Ljava/util/List;

    iget-object v10, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v14}, Le1/p;-><init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->color:Li2/a0;

    check-cast p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->color:Li2/a0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->w:Ll3/g;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->w:Ll3/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->I:Ljava/util/List;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->I:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->y:Lp3/h;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->y:Lp3/h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    if-eq v0, v1, :cond_7

    goto :goto_1

    :cond_7
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->L:Lkotlin/jvm/functions/Function1;

    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->L:Lkotlin/jvm/functions/Function1;

    if-eq v0, v1, :cond_8

    goto :goto_1

    :cond_8
    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->E:I

    iget v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->E:I

    if-ne v0, v1, :cond_d

    iget-boolean v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->F:Z

    iget-boolean v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->F:Z

    if-eq v0, v1, :cond_9

    goto :goto_1

    :cond_9
    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->G:I

    iget v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->G:I

    if-eq v0, v1, :cond_a

    goto :goto_1

    :cond_a
    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->H:I

    iget v1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->H:I

    if-eq v0, v1, :cond_b

    goto :goto_1

    :cond_b
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    if-eq v0, p1, :cond_c

    goto :goto_1

    :cond_c
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_d
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->w:Ll3/g;

    invoke-virtual {v0}, Ll3/g;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->y:Lp3/h;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->E:I

    invoke-static {v3, v2, v1}, Ld;->b(III)I

    move-result v2

    iget-boolean v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->F:Z

    invoke-static {v2, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v2

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->G:I

    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->H:I

    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->I:Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    add-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x3c1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->color:Li2/a0;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v0

    :goto_3
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->L:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_4
    add-int/2addr v2, v0

    return v2
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 10

    move-object v0, p1

    check-cast v0, Le1/p;

    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->color:Li2/a0;

    iget-object v1, v0, Le1/p;->Z:Li2/a0;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iput-object p1, v0, Le1/p;->Z:Li2/a0;

    if-eqz v1, :cond_1

    iget-object p1, v0, Le1/p;->P:Ll3/v0;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    if-eq v1, p1, :cond_0

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object p1, p1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual {v1, p1}, Ll3/m0;->c(Ll3/m0;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->w:Ll3/g;

    invoke-virtual {v0, v1}, Le1/p;->c1(Ll3/g;)Z

    move-result v9

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->E:I

    iget-object v8, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->K:Lu0/z0;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->x:Ll3/v0;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->I:Ljava/util/List;

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->H:I

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->G:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->F:Z

    iget-object v6, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->y:Lp3/h;

    invoke-virtual/range {v0 .. v8}, Le1/p;->b1(Ll3/v0;Ljava/util/List;IIZLp3/h;ILu0/z0;)Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->L:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;->J:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v4, v5, v2, v3}, Le1/p;->a1(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Le1/j;Lkotlin/jvm/functions/Function1;)Z

    move-result v2

    invoke-virtual {v0, p1, v9, v1, v2}, Le1/p;->X0(ZZZZ)V

    return-void
.end method
