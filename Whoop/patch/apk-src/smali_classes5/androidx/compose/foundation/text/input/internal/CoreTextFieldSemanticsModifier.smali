.class public final Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;",
        "La3/h1;",
        "Ld1/e;",
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

.field public final F:Z

.field public final G:Lq3/r;

.field public final H:Lf1/s1;

.field public final I:Lq3/l;

.field public final J:Lg2/s;

.field public final w:Lq3/e0;

.field public final x:Lq3/y;

.field public final y:Lu0/s0;

.field public final z:Z


# direct methods
.method public constructor <init>(Lq3/e0;Lq3/y;Lu0/s0;ZZZLq3/r;Lf1/s1;Lq3/l;Lg2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    iput-object p3, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    iput-boolean p4, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    iput-boolean p6, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    iput-object p7, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    iput-object p8, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    iput-object p9, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    iput-object p10, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 4

    new-instance v0, Ld1/e;

    invoke-direct {v0}, La3/o;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    iput-object v1, v0, Ld1/e;->Q:Lq3/e0;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    iput-object v1, v0, Ld1/e;->R:Lq3/y;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    iput-object v1, v0, Ld1/e;->S:Lu0/s0;

    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    iput-boolean v1, v0, Ld1/e;->T:Z

    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    iput-boolean v1, v0, Ld1/e;->U:Z

    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    iput-boolean v1, v0, Ld1/e;->V:Z

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    iput-object v1, v0, Ld1/e;->W:Lq3/r;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    iput-object v1, v0, Ld1/e;->X:Lf1/s1;

    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    iput-object v2, v0, Ld1/e;->Y:Lq3/l;

    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    iput-object v2, v0, Ld1/e;->Z:Lg2/s;

    new-instance v2, Ld1/c;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Ld1/c;-><init>(Ld1/e;I)V

    iput-object v2, v1, Lf1/s1;->g:Lc93/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    iget-object v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    iget-object v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    iget-object v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    iget-object v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    iget-object v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    iget-object v3, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    iget-object p1, p1, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    invoke-virtual {v0}, Lq3/e0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    invoke-virtual {v2}, Lq3/y;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    invoke-virtual {v2}, Lq3/l;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CoreTextFieldSemanticsModifier(transformedText="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", readOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isPassword="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", offsetMapping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", manager="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imeOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", focusRequester="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Lb2/v;)V
    .locals 11

    check-cast p1, Ld1/e;

    iget-boolean v0, p1, Ld1/e;->U:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v3, p1, Ld1/e;->T:Z

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-boolean v4, p1, Ld1/e;->V:Z

    iget-object v5, p1, Ld1/e;->Y:Lq3/l;

    iget-object v6, p1, Ld1/e;->X:Lf1/s1;

    iget-boolean v7, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->z:Z

    iget-boolean v8, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->E:Z

    if-eqz v8, :cond_1

    if-nez v7, :cond_1

    move v1, v2

    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->w:Lq3/e0;

    iput-object v2, p1, Ld1/e;->Q:Lq3/e0;

    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->x:Lq3/y;

    iput-object v2, p1, Ld1/e;->R:Lq3/y;

    iget-object v9, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->y:Lu0/s0;

    iput-object v9, p1, Ld1/e;->S:Lu0/s0;

    iput-boolean v7, p1, Ld1/e;->T:Z

    iput-boolean v8, p1, Ld1/e;->U:Z

    iget-object v7, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->G:Lq3/r;

    iput-object v7, p1, Ld1/e;->W:Lq3/r;

    iget-object v7, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->H:Lf1/s1;

    iput-object v7, p1, Ld1/e;->X:Lf1/s1;

    iget-object v9, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->I:Lq3/l;

    iput-object v9, p1, Ld1/e;->Y:Lq3/l;

    iget-object v10, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->J:Lg2/s;

    iput-object v10, p1, Ld1/e;->Z:Lg2/s;

    if-ne v8, v0, :cond_2

    if-ne v1, v3, :cond_2

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;->F:Z

    if-ne v0, v4, :cond_2

    iget-wide v0, v2, Lq3/y;->b:J

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p1}, La3/g;->j(La3/j2;)V

    :cond_3
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Ld1/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ld1/c;-><init>(Ld1/e;I)V

    iput-object v0, v7, Lf1/s1;->g:Lc93/a;

    :cond_4
    return-void
.end method
