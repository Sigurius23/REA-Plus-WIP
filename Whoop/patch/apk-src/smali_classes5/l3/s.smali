.class public abstract Ll3/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll3/q;

.field public static final b:Lp0/n0;

.field public static final c:Lp0/n0;

.field public static final d:Lp0/n0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Ll3/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll3/s;->a:Ll3/q;

    new-instance v0, Lkf0/l;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lkf0/l;-><init>(I)V

    new-instance v1, Lkx1/b;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lkx1/b;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Ll3/s;->b:Lp0/n0;

    new-instance v0, Lkf0/l;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lkf0/l;-><init>(I)V

    new-instance v1, Lkx1/b;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lkx1/b;-><init>(I)V

    new-instance v2, Lp0/n0;

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Ll3/s;->c:Lp0/n0;

    new-instance v0, Lkf0/l;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lkf0/l;-><init>(I)V

    new-instance v1, Lkx1/b;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lkx1/b;-><init>(I)V

    new-instance v2, Lp0/n0;

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Ll3/s;->d:Lp0/n0;

    return-void
.end method

.method public static final a(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(ILjava/util/List;)I
    .locals 7

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget v0, v0, Ll3/y;->c:I

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/y;

    iget v1, v1, Ll3/y;->c:I

    if-gt p0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " should be less or equal than last line\'s end "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-gt v3, v0, :cond_4

    add-int v4, v3, v0

    ushr-int/2addr v4, v1

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/y;

    iget v6, v5, Ll3/y;->b:I

    if-le v6, p0, :cond_1

    move v5, v1

    goto :goto_2

    :cond_1
    iget v5, v5, Ll3/y;->c:I

    if-gt v5, p0, :cond_2

    const/4 v5, -0x1

    goto :goto_2

    :cond_2
    move v5, v2

    :goto_2
    if-gez v5, :cond_3

    add-int/lit8 v3, v4, 0x1

    goto :goto_1

    :cond_3
    if-lez v5, :cond_5

    add-int/lit8 v0, v4, -0x1

    goto :goto_1

    :cond_4
    add-int/2addr v3, v1

    neg-int v4, v3

    :cond_5
    if-ltz v4, :cond_6

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ge v4, v0, :cond_6

    return v4

    :cond_6
    const-string v0, "Found paragraph index "

    const-string v1, " should be in range [0, "

    invoke-static {v4, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ").\nDebug info: index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", paragraphs=["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p0, Lkx1/b;

    const/16 v1, 0x15

    invoke-direct {p0, v1}, Lkx1/b;-><init>(I)V

    const/16 v1, 0x1f

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, p0}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lr3/a;->a(Ljava/lang/String;)V

    return v4
.end method

.method public static final d(ILjava/util/List;)I
    .locals 7

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-gt v3, v0, :cond_4

    add-int v4, v3, v0

    ushr-int/2addr v4, v1

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/y;

    iget v6, v5, Ll3/y;->d:I

    if-le v6, p0, :cond_0

    move v5, v1

    goto :goto_1

    :cond_0
    iget v5, v5, Ll3/y;->e:I

    if-gt v5, p0, :cond_1

    const/4 v5, -0x1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-gez v5, :cond_2

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_2
    if-lez v5, :cond_3

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_3
    return v4

    :cond_4
    add-int/2addr v3, v1

    neg-int p0, v3

    return p0
.end method

.method public static final e(Ljava/util/ArrayList;F)I
    .locals 7

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget v0, v0, Ll3/y;->g:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    invoke-static {p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    move v3, v1

    :goto_0
    if-gt v3, v0, :cond_6

    add-int v4, v3, v0

    ushr-int/2addr v4, v2

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/y;

    iget v6, v5, Ll3/y;->f:F

    cmpl-float v6, v6, p1

    if-lez v6, :cond_2

    move v5, v2

    goto :goto_1

    :cond_2
    iget v5, v5, Ll3/y;->g:F

    cmpg-float v5, v5, p1

    if-gtz v5, :cond_3

    const/4 v5, -0x1

    goto :goto_1

    :cond_3
    move v5, v1

    :goto_1
    if-gez v5, :cond_4

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_4
    if-lez v5, :cond_5

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_5
    return v4

    :cond_6
    add-int/2addr v3, v2

    neg-int p0, v3

    return p0
.end method

.method public static final f(Ljava/util/ArrayList;JLkotlin/jvm/functions/Function1;)V
    .locals 5

    invoke-static {p1, p2}, Ll3/u0;->f(J)I

    move-result v0

    invoke-static {v0, p0}, Ll3/s;->c(ILjava/util/List;)I

    move-result v0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/y;

    iget v3, v2, Ll3/y;->b:I

    invoke-static {p1, p2}, Ll3/u0;->e(J)I

    move-result v4

    if-ge v3, v4, :cond_1

    iget v3, v2, Ll3/y;->b:I

    iget v4, v2, Ll3/y;->c:I

    if-eq v3, v4, :cond_0

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final g(Landroidx/compose/runtime/Composer;)Ll3/t0;
    .locals 5

    sget-object v0, Lb3/v1;->k:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp3/h;

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    sget-object v2, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {p0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/m;

    invoke-virtual {p0, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {p0, v4}, Lp1/q;->e(I)Z

    move-result v4

    or-int/2addr v3, v4

    const/16 v4, 0x8

    invoke-virtual {p0, v4}, Lp1/q;->e(I)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_1

    :cond_0
    new-instance v4, Ll3/t0;

    invoke-direct {v4, v0, v1, v2}, Ll3/t0;-><init>(Lp3/h;Ly3/c;Ly3/m;)V

    invoke-virtual {p0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Ll3/t0;

    return-object v4
.end method

.method public static final h(Ll3/e;)Ll3/e;
    .locals 4

    new-instance v0, Ll3/e;

    iget-object v1, p0, Ll3/e;->a:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll3/o0;

    iget-object v1, v1, Ll3/o0;->a:Ljava/lang/String;

    iget v2, p0, Ll3/e;->b:I

    iget v3, p0, Ll3/e;->c:I

    iget-object p0, p0, Ll3/e;->d:Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1, p0}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
