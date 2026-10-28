.class public final Ll9/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/s;


# instance fields
.field public final a:Lo9/s;

.field public final b:Lu8/p0;


# direct methods
.method public constructor <init>(Lo9/s;Lu8/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/j0;->a:Lo9/s;

    iput-object p2, p0, Ll9/j0;->b:Lu8/p0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->a()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->b()V

    return-void
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->c()I

    move-result v0

    return v0
.end method

.method public final d(I)Lu8/p;
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1}, Lo9/s;->e(I)I

    move-result p1

    iget-object v0, p0, Ll9/j0;->b:Lu8/p0;

    iget-object v0, v0, Lu8/p0;->d:[Lu8/p;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e(I)I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1}, Lo9/s;->e(I)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll9/j0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll9/j0;

    iget-object v1, p0, Ll9/j0;->a:Lo9/s;

    iget-object v3, p1, Ll9/j0;->a:Lo9/s;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll9/j0;->b:Lu8/p0;

    iget-object p1, p1, Ll9/j0;->b:Lu8/p0;

    invoke-virtual {v1, p1}, Lu8/p0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final f(F)V
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1}, Lo9/s;->f(F)V

    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->h()V

    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll9/j0;->b:Lu8/p0;

    invoke-virtual {v0}, Lu8/p0;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll9/j0;->a:Lo9/s;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(I)I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1}, Lo9/s;->i(I)I

    move-result p1

    return p1
.end method

.method public final j()Lu8/p0;
    .locals 1

    iget-object v0, p0, Ll9/j0;->b:Lu8/p0;

    return-object v0
.end method

.method public final k(Z)V
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1}, Lo9/s;->k(Z)V

    return-void
.end method

.method public final l(JLjava/util/List;)I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1, p2, p3}, Lo9/s;->l(JLjava/util/List;)I

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->length()I

    move-result v0

    return v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->m()I

    move-result v0

    return v0
.end method

.method public final n()Lu8/p;
    .locals 2

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->m()I

    move-result v0

    iget-object v1, p0, Ll9/j0;->b:Lu8/p0;

    iget-object v1, v1, Lu8/p0;->d:[Lu8/p;

    aget-object v0, v1, v0

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->o()I

    move-result v0

    return v0
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0}, Lo9/s;->p()V

    return-void
.end method

.method public final q(IJ)Z
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1, p2, p3}, Lo9/s;->q(IJ)Z

    move-result p1

    return p1
.end method

.method public final r(JJJLjava/util/List;[Lm9/j;)V
    .locals 9

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-interface/range {v0 .. v8}, Lo9/s;->r(JJJLjava/util/List;[Lm9/j;)V

    return-void
.end method

.method public final s(Lu8/p;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ll9/j0;->b:Lu8/p0;

    iget-object v1, v1, Lu8/p0;->d:[Lu8/p;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    if-ne p1, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    iget-object p1, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {p1, v0}, Lo9/s;->i(I)I

    move-result p1

    return p1
.end method

.method public final t(IJ)Z
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1, p2, p3}, Lo9/s;->t(IJ)Z

    move-result p1

    return p1
.end method

.method public final u(JLm9/d;Ljava/util/List;)Z
    .locals 1

    iget-object v0, p0, Ll9/j0;->a:Lo9/s;

    invoke-interface {v0, p1, p2, p3, p4}, Lo9/s;->u(JLm9/d;Ljava/util/List;)Z

    move-result p1

    return p1
.end method
