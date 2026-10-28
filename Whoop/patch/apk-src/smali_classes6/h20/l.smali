.class public final Lh20/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzy/c;

.field public final b:Ly00/o4;

.field public final c:Lh20/r4;

.field public final d:Z

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lzy/c;Ly00/o4;Lh20/r4;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/l;->a:Lzy/c;

    iput-object p2, p0, Lh20/l;->b:Ly00/o4;

    iput-object p3, p0, Lh20/l;->c:Lh20/r4;

    iput-boolean p4, p0, Lh20/l;->d:Z

    iput-boolean p5, p0, Lh20/l;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lh20/l;->c:Lh20/r4;

    instance-of v1, v0, Lh20/m4;

    if-eqz v1, :cond_2

    check-cast v0, Lh20/m4;

    iget-object v0, v0, Lh20/m4;->a:Ly00/z3;

    iget-object v1, v0, Ly00/z3;->L:Ljava/lang/String;

    if-eqz v1, :cond_0

    sget-object v2, Ly00/i;->M:Lt9/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, v0, Ly00/z3;->w:Ly00/i;

    :cond_1
    iget-object v0, v1, Ly00/i;->x:Ljava/lang/String;

    return-object v0

    :cond_2
    instance-of v1, v0, Lh20/n4;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Lh20/n4;

    iget-object v0, v0, Lh20/n4;->a:Ly00/s2;

    instance-of v1, v0, Ly00/r2;

    if-eqz v1, :cond_3

    check-cast v0, Ly00/r2;

    goto :goto_0

    :cond_3
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_6

    iget-object v0, v0, Ly00/r2;->E:Ly00/i;

    if-eqz v0, :cond_6

    iget-object v0, v0, Ly00/i;->x:Ljava/lang/String;

    return-object v0

    :cond_4
    instance-of v1, v0, Lh20/p4;

    if-nez v1, :cond_6

    instance-of v1, v0, Lh20/o4;

    if-nez v1, :cond_6

    instance-of v0, v0, Lh20/q4;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    :goto_1
    return-object v2
.end method

.method public final b()Z
    .locals 4

    iget-object v0, p0, Lh20/l;->c:Lh20/r4;

    instance-of v1, v0, Lh20/m4;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lh20/m4;

    iget-object v0, v0, Lh20/m4;->a:Ly00/z3;

    iget-object v0, v0, Ly00/z3;->K:Ly00/x3;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, v0, Ly00/x3;->w:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-boolean v3, p0, Lh20/l;->d:Z

    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    instance-of v1, v0, Lh20/o4;

    if-nez v1, :cond_4

    instance-of v1, v0, Lh20/p4;

    if-nez v1, :cond_4

    instance-of v1, v0, Lh20/n4;

    if-nez v1, :cond_4

    sget-object v1, Lh20/q4;->a:Lh20/q4;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    :goto_1
    return v2
.end method

.method public final c()Lzy/c;
    .locals 5

    iget-object v0, p0, Lh20/l;->c:Lh20/r4;

    instance-of v1, v0, Lh20/m4;

    sget-object v2, Lm83/y;->w:Lm83/y;

    const v3, 0x7f140fd8

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lh20/l;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Lh20/m4;

    iget-object v0, v0, Lh20/m4;->a:Ly00/z3;

    iget-object v0, v0, Ly00/z3;->H:Ljava/lang/String;

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v1, v0, Lh20/o4;

    const v4, 0x7f140fbd

    if-eqz v1, :cond_1

    check-cast v0, Lh20/o4;

    iget-object v0, v0, Lh20/o4;->a:Ly00/e4;

    iget-object v0, v0, Ly00/e4;->E:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v1, v0, Lh20/p4;

    if-eqz v1, :cond_2

    check-cast v0, Lh20/p4;

    iget-object v0, v0, Lh20/p4;->a:Ly00/l4;

    iget-object v0, v0, Ly00/l4;->E:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, v0, Lh20/n4;

    if-eqz v1, :cond_5

    check-cast v0, Lh20/n4;

    iget-object v0, v0, Lh20/n4;->a:Ly00/s2;

    instance-of v1, v0, Ly00/q2;

    if-eqz v1, :cond_3

    check-cast v0, Ly00/q2;

    iget-object v0, v0, Ly00/q2;->x:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v1, v0, Ly00/r2;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lh20/l;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ly00/r2;

    iget-object v0, v0, Ly00/r2;->z:Ljava/lang/String;

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    instance-of v0, v0, Lh20/q4;

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Lzy/d;

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, ""

    invoke-direct {v1, v2, v0}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v1

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final d(Z)Z
    .locals 3

    iget-object v0, p0, Lh20/l;->c:Lh20/r4;

    instance-of v1, v0, Lh20/m4;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    if-nez p1, :cond_1

    check-cast v0, Lh20/m4;

    iget-object p1, v0, Lh20/m4;->a:Ly00/z3;

    iget-object v0, p1, Ly00/z3;->z:Ljava/lang/Integer;

    iget-object p1, p1, Ly00/z3;->E:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lv8/b;->I(II)Z

    move-result p1

    if-nez p1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lh20/l;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    instance-of p1, v0, Lh20/o4;

    if-nez p1, :cond_4

    instance-of p1, v0, Lh20/p4;

    if-nez p1, :cond_4

    instance-of p1, v0, Lh20/n4;

    if-nez p1, :cond_4

    sget-object p1, Lh20/q4;->a:Lh20/q4;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    return v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh20/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/l;

    iget-object v1, p0, Lh20/l;->a:Lzy/c;

    iget-object v3, p1, Lh20/l;->a:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh20/l;->b:Ly00/o4;

    iget-object v3, p1, Lh20/l;->b:Ly00/o4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh20/l;->c:Lh20/r4;

    iget-object v3, p1, Lh20/l;->c:Lh20/r4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lh20/l;->d:Z

    iget-boolean v3, p1, Lh20/l;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lh20/l;->e:Z

    iget-boolean p1, p1, Lh20/l;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lh20/l;->a:Lzy/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh20/l;->b:Ly00/o4;

    invoke-virtual {v2}, Ly00/o4;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/l;->c:Lh20/r4;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lh20/l;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lh20/l;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DisplayableSavedPaymentMethod(displayName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/l;->a:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/l;->b:Ly00/o4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", savedPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/l;->c:Lh20/r4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCbcEligible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/l;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowDefaultBadge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-boolean v2, p0, Lh20/l;->e:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
