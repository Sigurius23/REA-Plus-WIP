.class public final Lo0/l;
.super La2/a;
.source "SourceFile"


# instance fields
.field public final E:I

.field public final synthetic F:Lp0/d0;

.field public final synthetic G:Lo0/y;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:J

.field public final y:Lo0/h;

.field public final z:Lp0/d0;


# direct methods
.method public constructor <init>(Lo0/h;Lp0/d0;ILo0/y;IIJ)V
    .locals 0

    iput-object p2, p0, Lo0/l;->F:Lp0/d0;

    iput-object p4, p0, Lo0/l;->G:Lo0/y;

    iput p5, p0, Lo0/l;->H:I

    iput p6, p0, Lo0/l;->I:I

    iput-wide p7, p0, Lo0/l;->J:J

    const/4 p4, 0x4

    invoke-direct {p0, p4}, La2/a;-><init>(I)V

    iput-object p1, p0, Lo0/l;->y:Lo0/h;

    iput-object p2, p0, Lo0/l;->z:Lp0/d0;

    iput p3, p0, Lo0/l;->E:I

    return-void
.end method


# virtual methods
.method public final Q(IIIJI)Lo0/p;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v2, p1

    iget-object v1, v0, Lo0/l;->y:Lo0/h;

    invoke-virtual {v1, v2}, Lo0/h;->c(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v1, v1, Lo0/h;->b:Lo0/g;

    invoke-virtual {v1, v2}, Lp0/y;->l(I)Ljava/lang/Object;

    move-result-object v12

    iget-object v1, v0, Lo0/l;->z:Lp0/d0;

    move-wide/from16 v14, p4

    invoke-virtual {v0, v1, v2, v14, v15}, La2/a;->y(Lp0/d0;IJ)Ljava/util/List;

    move-result-object v9

    invoke-static {v14, v15}, Ly3/a;->g(J)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v14, v15}, Ly3/a;->k(J)I

    move-result v1

    :goto_0
    move v4, v1

    goto :goto_1

    :cond_0
    invoke-static {v14, v15}, Ly3/a;->f(J)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "does not have fixed height"

    invoke-static {v1}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_1
    invoke-static {v14, v15}, Ly3/a;->j(J)I

    move-result v1

    goto :goto_0

    :goto_1
    iget-object v1, v0, Lo0/l;->F:Lp0/d0;

    iget-object v1, v1, Lp0/d0;->x:Ly2/v1;

    invoke-interface {v1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v6

    iget-object v1, v0, Lo0/l;->G:Lo0/y;

    iget-object v13, v1, Lo0/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    new-instance v1, Lo0/p;

    iget v8, v0, Lo0/l;->I:I

    iget-wide v10, v0, Lo0/l;->J:J

    iget v7, v0, Lo0/l;->H:I

    move/from16 v16, p2

    move/from16 v17, p3

    move/from16 v5, p6

    invoke-direct/range {v1 .. v17}, Lo0/p;-><init>(ILjava/lang/Object;IILy3/m;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/b;JII)V

    return-object v1
.end method

.method public final w(IIJI)Lp0/e0;
    .locals 7

    iget v6, p0, Lo0/l;->E:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v4, p3

    move v3, p5

    invoke-virtual/range {v0 .. v6}, Lo0/l;->Q(IIIJI)Lo0/p;

    move-result-object p1

    return-object p1
.end method
