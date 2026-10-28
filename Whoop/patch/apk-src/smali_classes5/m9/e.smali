.class public final Lm9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z0;


# instance fields
.field public final synthetic E:Lm9/g;

.field public final w:Lm9/g;

.field public final x:Ll9/y0;

.field public final y:I

.field public z:Z


# direct methods
.method public constructor <init>(Lm9/g;Lm9/g;Ll9/y0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/e;->E:Lm9/g;

    iput-object p2, p0, Lm9/e;->w:Lm9/g;

    iput-object p3, p0, Lm9/e;->x:Ll9/y0;

    iput p4, p0, Lm9/e;->y:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-boolean v0, p0, Lm9/e;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lm9/e;->E:Lm9/g;

    iget-object v1, v0, Lm9/g;->G:Lg9/d;

    iget-object v2, v0, Lm9/g;->x:[I

    iget v3, p0, Lm9/e;->y:I

    aget v2, v2, v3

    iget-object v4, v0, Lm9/g;->y:[Lu8/p;

    aget-object v3, v4, v3

    const/4 v5, 0x0

    iget-wide v6, v0, Lm9/g;->T:J

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v7}, Lg9/d;->b(ILu8/p;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm9/e;->z:Z

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lm9/e;->E:Lm9/g;

    invoke-virtual {v0}, Lm9/g;->z()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lm9/e;->x:Ll9/y0;

    iget-boolean v0, v0, Lm9/g;->Y:Z

    invoke-virtual {v1, v0}, Ll9/y0;->o(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final j(J)I
    .locals 3

    iget-object v0, p0, Lm9/e;->E:Lm9/g;

    invoke-virtual {v0}, Lm9/g;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v1, v0, Lm9/g;->Y:Z

    iget-object v2, p0, Lm9/e;->x:Ll9/y0;

    invoke-virtual {v2, p1, p2, v1}, Ll9/y0;->n(JZ)I

    move-result p1

    iget-object p2, v0, Lm9/g;->V:Lm9/a;

    if-eqz p2, :cond_1

    iget v0, p0, Lm9/e;->y:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lm9/a;->a(I)I

    move-result p2

    invoke-virtual {v2}, Ll9/y0;->l()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    invoke-virtual {v2, p1}, Ll9/y0;->v(I)V

    if-lez p1, :cond_2

    invoke-virtual {p0}, Lm9/e;->a()V

    :cond_2
    return p1
.end method

.method public final l(Lqg3/d;La9/e;I)I
    .locals 4

    iget-object v0, p0, Lm9/e;->E:Lm9/g;

    invoke-virtual {v0}, Lm9/g;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lm9/g;->V:Lm9/a;

    iget-object v2, p0, Lm9/e;->x:Ll9/y0;

    if-eqz v1, :cond_1

    iget v3, p0, Lm9/e;->y:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Lm9/a;->a(I)I

    move-result v1

    invoke-virtual {v2}, Ll9/y0;->l()I

    move-result v3

    if-gt v1, v3, :cond_1

    :goto_0
    const/4 p1, -0x3

    return p1

    :cond_1
    invoke-virtual {p0}, Lm9/e;->a()V

    iget-boolean v0, v0, Lm9/g;->Y:Z

    invoke-virtual {v2, p1, p2, p3, v0}, Ll9/y0;->r(Lqg3/d;La9/e;IZ)I

    move-result p1

    return p1
.end method
