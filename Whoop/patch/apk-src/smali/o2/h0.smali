.class public final Lo2/h0;
.super Lo2/g0;
.source "SourceFile"


# instance fields
.field public final E:F

.field public final F:Li2/t;

.field public final G:F

.field public final H:F

.field public final I:I

.field public final J:I

.field public final K:F

.field public final L:F

.field public final M:F

.field public final N:F

.field public final w:Ljava/lang/String;

.field public final x:Ljava/util/List;

.field public final y:I

.field public final z:Li2/t;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ILi2/t;FLi2/t;FFIIFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/h0;->w:Ljava/lang/String;

    iput-object p2, p0, Lo2/h0;->x:Ljava/util/List;

    iput p3, p0, Lo2/h0;->y:I

    iput-object p4, p0, Lo2/h0;->z:Li2/t;

    iput p5, p0, Lo2/h0;->E:F

    iput-object p6, p0, Lo2/h0;->F:Li2/t;

    iput p7, p0, Lo2/h0;->G:F

    iput p8, p0, Lo2/h0;->H:F

    iput p9, p0, Lo2/h0;->I:I

    iput p10, p0, Lo2/h0;->J:I

    iput p11, p0, Lo2/h0;->K:F

    iput p12, p0, Lo2/h0;->L:F

    iput p13, p0, Lo2/h0;->M:F

    iput p14, p0, Lo2/h0;->N:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    const-class v2, Lo2/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lo2/h0;

    iget-object v2, p0, Lo2/h0;->w:Ljava/lang/String;

    iget-object v3, p1, Lo2/h0;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lo2/h0;->z:Li2/t;

    iget-object v3, p1, Lo2/h0;->z:Li2/t;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget v2, p0, Lo2/h0;->E:F

    iget v3, p1, Lo2/h0;->E:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget-object v2, p0, Lo2/h0;->F:Li2/t;

    iget-object v3, p1, Lo2/h0;->F:Li2/t;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget v2, p0, Lo2/h0;->G:F

    iget v3, p1, Lo2/h0;->G:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget v2, p0, Lo2/h0;->H:F

    iget v3, p1, Lo2/h0;->H:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget v2, p0, Lo2/h0;->I:I

    iget v3, p1, Lo2/h0;->I:I

    if-ne v2, v3, :cond_6

    iget v2, p0, Lo2/h0;->J:I

    iget v3, p1, Lo2/h0;->J:I

    if-ne v2, v3, :cond_6

    iget v2, p0, Lo2/h0;->K:F

    iget v3, p1, Lo2/h0;->K:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget v2, p0, Lo2/h0;->L:F

    iget v3, p1, Lo2/h0;->L:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget v2, p0, Lo2/h0;->M:F

    iget v3, p1, Lo2/h0;->M:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget v2, p0, Lo2/h0;->N:F

    iget v3, p1, Lo2/h0;->N:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_6

    iget v2, p0, Lo2/h0;->y:I

    iget v3, p1, Lo2/h0;->y:I

    if-ne v2, v3, :cond_6

    iget-object v2, p0, Lo2/h0;->x:Ljava/util/List;

    iget-object p1, p1, Lo2/h0;->x:Ljava/util/List;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lo2/h0;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lo2/h0;->x:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lo2/h0;->z:Li2/t;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Lo2/h0;->E:F

    invoke-static {v3, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lo2/h0;->F:Li2/t;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lo2/h0;->G:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/h0;->H:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/h0;->I:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lo2/h0;->J:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lo2/h0;->K:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/h0;->L:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/h0;->M:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lo2/h0;->N:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lo2/h0;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
