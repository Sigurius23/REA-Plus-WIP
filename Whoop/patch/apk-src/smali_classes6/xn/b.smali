.class public final Lxn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final R:Lxn/b;

.field public static final S:Lux/f0;


# instance fields
.field public final E:F

.field public final F:I

.field public final G:I

.field public final H:F

.field public final I:I

.field public final J:F

.field public final K:F

.field public final L:Z

.field public final M:I

.field public final N:I

.field public final O:F

.field public final P:I

.field public final Q:F

.field public final w:Ljava/lang/CharSequence;

.field public final x:Landroid/text/Layout$Alignment;

.field public final y:Landroid/text/Layout$Alignment;

.field public final z:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lxn/b;

    const-string v1, ""

    const/4 v2, 0x0

    const v5, -0x800001

    const/high16 v6, -0x80000000

    const/4 v14, 0x0

    const/high16 v15, -0x1000000

    const/16 v17, 0x0

    move-object v3, v2

    move-object v4, v2

    move v7, v6

    move v8, v5

    move v9, v6

    move v10, v6

    move v11, v5

    move v12, v5

    move v13, v5

    move/from16 v16, v6

    invoke-direct/range {v0 .. v17}, Lxn/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    sput-object v0, Lxn/b;->R:Lxn/b;

    new-instance v0, Lux/f0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lux/f0;-><init>(I)V

    sput-object v0, Lxn/b;->S:Lux/f0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_0
    if-nez p4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    :goto_1
    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    move-result-object p1

    iput-object p1, p0, Lxn/b;->w:Ljava/lang/CharSequence;

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxn/b;->w:Ljava/lang/CharSequence;

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    iput-object p1, p0, Lxn/b;->w:Ljava/lang/CharSequence;

    :goto_2
    iput-object p2, p0, Lxn/b;->x:Landroid/text/Layout$Alignment;

    iput-object p3, p0, Lxn/b;->y:Landroid/text/Layout$Alignment;

    iput-object p4, p0, Lxn/b;->z:Landroid/graphics/Bitmap;

    iput p5, p0, Lxn/b;->E:F

    iput p6, p0, Lxn/b;->F:I

    iput p7, p0, Lxn/b;->G:I

    iput p8, p0, Lxn/b;->H:F

    iput p9, p0, Lxn/b;->I:I

    iput p12, p0, Lxn/b;->J:F

    iput p13, p0, Lxn/b;->K:F

    iput-boolean p14, p0, Lxn/b;->L:Z

    move/from16 p1, p15

    iput p1, p0, Lxn/b;->M:I

    iput p10, p0, Lxn/b;->N:I

    iput p11, p0, Lxn/b;->O:F

    move/from16 p1, p16

    iput p1, p0, Lxn/b;->P:I

    move/from16 p1, p17

    iput p1, p0, Lxn/b;->Q:F

    return-void
.end method


# virtual methods
.method public final a()Lxn/a;
    .locals 2

    new-instance v0, Lxn/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lxn/b;->w:Ljava/lang/CharSequence;

    iput-object v1, v0, Lxn/a;->a:Ljava/lang/CharSequence;

    iget-object v1, p0, Lxn/b;->z:Landroid/graphics/Bitmap;

    iput-object v1, v0, Lxn/a;->b:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lxn/b;->x:Landroid/text/Layout$Alignment;

    iput-object v1, v0, Lxn/a;->c:Landroid/text/Layout$Alignment;

    iget-object v1, p0, Lxn/b;->y:Landroid/text/Layout$Alignment;

    iput-object v1, v0, Lxn/a;->d:Landroid/text/Layout$Alignment;

    iget v1, p0, Lxn/b;->E:F

    iput v1, v0, Lxn/a;->e:F

    iget v1, p0, Lxn/b;->F:I

    iput v1, v0, Lxn/a;->f:I

    iget v1, p0, Lxn/b;->G:I

    iput v1, v0, Lxn/a;->g:I

    iget v1, p0, Lxn/b;->H:F

    iput v1, v0, Lxn/a;->h:F

    iget v1, p0, Lxn/b;->I:I

    iput v1, v0, Lxn/a;->i:I

    iget v1, p0, Lxn/b;->N:I

    iput v1, v0, Lxn/a;->j:I

    iget v1, p0, Lxn/b;->O:F

    iput v1, v0, Lxn/a;->k:F

    iget v1, p0, Lxn/b;->J:F

    iput v1, v0, Lxn/a;->l:F

    iget v1, p0, Lxn/b;->K:F

    iput v1, v0, Lxn/a;->m:F

    iget-boolean v1, p0, Lxn/b;->L:Z

    iput-boolean v1, v0, Lxn/a;->n:Z

    iget v1, p0, Lxn/b;->M:I

    iput v1, v0, Lxn/a;->o:I

    iget v1, p0, Lxn/b;->P:I

    iput v1, v0, Lxn/a;->p:I

    iget v1, p0, Lxn/b;->Q:F

    iput v1, v0, Lxn/a;->q:F

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lxn/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lxn/b;

    iget-object v2, p1, Lxn/b;->z:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lxn/b;->w:Ljava/lang/CharSequence;

    iget-object v4, p1, Lxn/b;->w:Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lxn/b;->x:Landroid/text/Layout$Alignment;

    iget-object v4, p1, Lxn/b;->x:Landroid/text/Layout$Alignment;

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lxn/b;->y:Landroid/text/Layout$Alignment;

    iget-object v4, p1, Lxn/b;->y:Landroid/text/Layout$Alignment;

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lxn/b;->z:Landroid/graphics/Bitmap;

    if-nez v3, :cond_2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, Landroid/graphics/Bitmap;->sameAs(Landroid/graphics/Bitmap;)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_0
    iget v2, p0, Lxn/b;->E:F

    iget v3, p1, Lxn/b;->E:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lxn/b;->F:I

    iget v3, p1, Lxn/b;->F:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->G:I

    iget v3, p1, Lxn/b;->G:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->H:F

    iget v3, p1, Lxn/b;->H:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lxn/b;->I:I

    iget v3, p1, Lxn/b;->I:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->J:F

    iget v3, p1, Lxn/b;->J:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lxn/b;->K:F

    iget v3, p1, Lxn/b;->K:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lxn/b;->L:Z

    iget-boolean v3, p1, Lxn/b;->L:Z

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->M:I

    iget v3, p1, Lxn/b;->M:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->N:I

    iget v3, p1, Lxn/b;->N:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->O:F

    iget v3, p1, Lxn/b;->O:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lxn/b;->P:I

    iget v3, p1, Lxn/b;->P:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lxn/b;->Q:F

    iget p1, p1, Lxn/b;->Q:F

    cmpl-float p1, v2, p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lxn/b;->E:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    iget v1, v0, Lxn/b;->F:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v1, v0, Lxn/b;->G:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v1, v0, Lxn/b;->H:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    iget v1, v0, Lxn/b;->I:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget v1, v0, Lxn/b;->J:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    iget v1, v0, Lxn/b;->K:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    iget-boolean v1, v0, Lxn/b;->L:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iget v1, v0, Lxn/b;->M:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget v1, v0, Lxn/b;->N:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iget v1, v0, Lxn/b;->O:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    iget v1, v0, Lxn/b;->P:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    iget v1, v0, Lxn/b;->Q:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    iget-object v2, v0, Lxn/b;->w:Ljava/lang/CharSequence;

    iget-object v3, v0, Lxn/b;->x:Landroid/text/Layout$Alignment;

    iget-object v4, v0, Lxn/b;->y:Landroid/text/Layout$Alignment;

    iget-object v5, v0, Lxn/b;->z:Landroid/graphics/Bitmap;

    filled-new-array/range {v2 .. v18}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    return v1
.end method
