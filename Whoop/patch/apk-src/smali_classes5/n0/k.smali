.class public final Ln0/k;
.super La2/a;
.source "SourceFile"


# instance fields
.field public final E:J

.field public final synthetic F:Z

.field public final synthetic G:Lp0/d0;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:Lb2/f;

.field public final synthetic K:Lb2/g;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:J

.field public final synthetic O:Ln0/u;

.field public final y:Ln0/i;

.field public final z:Lp0/d0;


# direct methods
.method public constructor <init>(JZLn0/i;Lp0/d0;IILb2/f;Lb2/g;IIJLn0/u;)V
    .locals 0

    iput-boolean p3, p0, Ln0/k;->F:Z

    iput-object p5, p0, Ln0/k;->G:Lp0/d0;

    iput p6, p0, Ln0/k;->H:I

    iput p7, p0, Ln0/k;->I:I

    iput-object p8, p0, Ln0/k;->J:Lb2/f;

    iput-object p9, p0, Ln0/k;->K:Lb2/g;

    iput p10, p0, Ln0/k;->L:I

    iput p11, p0, Ln0/k;->M:I

    iput-wide p12, p0, Ln0/k;->N:J

    iput-object p14, p0, Ln0/k;->O:Ln0/u;

    const/4 p6, 0x4

    invoke-direct {p0, p6}, La2/a;-><init>(I)V

    iput-object p4, p0, Ln0/k;->y:Ln0/i;

    iput-object p5, p0, Ln0/k;->z:Lp0/d0;

    const p4, 0x7fffffff

    if-eqz p3, :cond_0

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result p5

    goto :goto_0

    :cond_0
    move p5, p4

    :goto_0
    if-nez p3, :cond_1

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result p4

    :cond_1
    const/4 p1, 0x5

    invoke-static {p5, p4, p1}, Ly3/b;->b(III)J

    move-result-wide p1

    iput-wide p1, p0, Ln0/k;->E:J

    return-void
.end method


# virtual methods
.method public final Q(IJ)Ln0/o;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v2, p1

    iget-object v1, v0, Ln0/k;->y:Ln0/i;

    invoke-virtual {v1, v2}, Ln0/i;->c(I)Ljava/lang/Object;

    move-result-object v13

    iget-object v1, v1, Ln0/i;->b:Ln0/f;

    invoke-virtual {v1, v2}, Lp0/y;->l(I)Ljava/lang/Object;

    move-result-object v14

    iget-object v1, v0, Ln0/k;->z:Lp0/d0;

    move-wide/from16 v3, p2

    invoke-virtual {v0, v1, v2, v3, v4}, La2/a;->y(Lp0/d0;IJ)Ljava/util/List;

    move-result-object v1

    iget v5, v0, Ln0/k;->H:I

    add-int/lit8 v5, v5, -0x1

    if-ne v2, v5, :cond_0

    const/4 v5, 0x0

    :goto_0
    move-object v3, v1

    move v10, v5

    goto :goto_1

    :cond_0
    iget v5, v0, Ln0/k;->I:I

    goto :goto_0

    :goto_1
    new-instance v1, Ln0/o;

    iget-object v4, v0, Ln0/k;->G:Lp0/d0;

    iget-object v4, v4, Lp0/d0;->x:Ly2/v1;

    invoke-interface {v4}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v7

    iget-object v4, v0, Ln0/k;->O:Ln0/u;

    iget-object v15, v4, Ln0/u;->n:Landroidx/compose/foundation/lazy/layout/b;

    iget-boolean v4, v0, Ln0/k;->F:Z

    iget-object v5, v0, Ln0/k;->J:Lb2/f;

    iget-object v6, v0, Ln0/k;->K:Lb2/g;

    iget v8, v0, Ln0/k;->L:I

    iget v9, v0, Ln0/k;->M:I

    iget-wide v11, v0, Ln0/k;->N:J

    move-wide/from16 v16, p2

    invoke-direct/range {v1 .. v17}, Ln0/o;-><init>(ILjava/util/List;ZLb2/f;Lb2/g;Ly3/m;IIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/b;J)V

    return-object v1
.end method

.method public final w(IIJI)Lp0/e0;
    .locals 0

    invoke-virtual {p0, p1, p3, p4}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object p1

    return-object p1
.end method
