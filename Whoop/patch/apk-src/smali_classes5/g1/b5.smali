.class public final synthetic Lg1/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function3;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:I

.field public final synthetic H:Z

.field public final synthetic I:Li2/a1;

.field public final synthetic J:F

.field public final synthetic K:J

.field public final synthetic L:J

.field public final synthetic M:J

.field public final synthetic N:J

.field public final synthetic O:J

.field public final synthetic P:Lx1/b;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lg1/i5;

.field public final synthetic y:Lx1/b;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b5;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/b5;->x:Lg1/i5;

    iput-object p3, p0, Lg1/b5;->y:Lx1/b;

    iput-object p4, p0, Lg1/b5;->z:Lc93/m;

    iput-object p5, p0, Lg1/b5;->E:Lkotlin/jvm/functions/Function3;

    iput-object p6, p0, Lg1/b5;->F:Lc93/m;

    iput p7, p0, Lg1/b5;->G:I

    iput-boolean p8, p0, Lg1/b5;->H:Z

    iput-object p9, p0, Lg1/b5;->I:Li2/a1;

    iput p10, p0, Lg1/b5;->J:F

    iput-wide p11, p0, Lg1/b5;->K:J

    iput-wide p13, p0, Lg1/b5;->L:J

    move-wide p1, p15

    iput-wide p1, p0, Lg1/b5;->M:J

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lg1/b5;->N:J

    move-wide/from16 p1, p19

    iput-wide p1, p0, Lg1/b5;->O:J

    move-object/from16 p1, p21

    iput-object p1, p0, Lg1/b5;->P:Lx1/b;

    move/from16 p1, p22

    iput p1, p0, Lg1/b5;->Q:I

    move/from16 p1, p23

    iput p1, p0, Lg1/b5;->R:I

    move/from16 p1, p24

    iput p1, p0, Lg1/b5;->S:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v22, p1

    check-cast v22, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/b5;->Q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v23

    iget v1, v0, Lg1/b5;->R:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v24

    iget-object v1, v0, Lg1/b5;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lg1/b5;->x:Lg1/i5;

    iget-object v3, v0, Lg1/b5;->y:Lx1/b;

    iget-object v4, v0, Lg1/b5;->z:Lc93/m;

    iget-object v5, v0, Lg1/b5;->E:Lkotlin/jvm/functions/Function3;

    iget-object v6, v0, Lg1/b5;->F:Lc93/m;

    iget v7, v0, Lg1/b5;->G:I

    iget-boolean v8, v0, Lg1/b5;->H:Z

    iget-object v9, v0, Lg1/b5;->I:Li2/a1;

    iget v10, v0, Lg1/b5;->J:F

    iget-wide v11, v0, Lg1/b5;->K:J

    iget-wide v13, v0, Lg1/b5;->L:J

    move-object v15, v1

    move-object/from16 v16, v2

    iget-wide v1, v0, Lg1/b5;->M:J

    move-wide/from16 v17, v1

    iget-wide v1, v0, Lg1/b5;->N:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lg1/b5;->O:J

    move-wide/from16 p1, v1

    iget-object v1, v0, Lg1/b5;->P:Lx1/b;

    iget v2, v0, Lg1/b5;->S:I

    move-object/from16 v21, v1

    move/from16 v25, v2

    move-object v1, v15

    move-object/from16 v2, v16

    move-wide/from16 v15, v17

    move-wide/from16 v17, v19

    move-wide/from16 v19, p1

    invoke-static/range {v1 .. v25}, Lg1/g5;->a(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
