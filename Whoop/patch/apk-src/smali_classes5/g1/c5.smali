.class public final synthetic Lg1/c5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lkotlin/jvm/functions/Function3;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:I

.field public final synthetic I:Z

.field public final synthetic J:Li2/a1;

.field public final synthetic K:F

.field public final synthetic L:J

.field public final synthetic M:J

.field public final synthetic N:J

.field public final synthetic O:J

.field public final synthetic P:J

.field public final synthetic Q:Lx1/b;

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Ll0/i0;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lg1/i5;

.field public final synthetic z:Lx1/b;


# direct methods
.method public synthetic constructor <init>(Ll0/i0;Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/c5;->w:Ll0/i0;

    iput-object p2, p0, Lg1/c5;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/c5;->y:Lg1/i5;

    iput-object p4, p0, Lg1/c5;->z:Lx1/b;

    iput-object p5, p0, Lg1/c5;->E:Lc93/m;

    iput-object p6, p0, Lg1/c5;->F:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Lg1/c5;->G:Lc93/m;

    iput p8, p0, Lg1/c5;->H:I

    iput-boolean p9, p0, Lg1/c5;->I:Z

    iput-object p10, p0, Lg1/c5;->J:Li2/a1;

    iput p11, p0, Lg1/c5;->K:F

    iput-wide p12, p0, Lg1/c5;->L:J

    iput-wide p14, p0, Lg1/c5;->M:J

    move-wide/from16 p1, p16

    iput-wide p1, p0, Lg1/c5;->N:J

    move-wide/from16 p1, p18

    iput-wide p1, p0, Lg1/c5;->O:J

    move-wide/from16 p1, p20

    iput-wide p1, p0, Lg1/c5;->P:J

    move-object/from16 p1, p22

    iput-object p1, p0, Lg1/c5;->Q:Lx1/b;

    move/from16 p1, p23

    iput p1, p0, Lg1/c5;->R:I

    move/from16 p1, p24

    iput p1, p0, Lg1/c5;->S:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v23, p1

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/c5;->R:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v24

    iget v1, v0, Lg1/c5;->S:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v25

    iget-object v1, v0, Lg1/c5;->w:Ll0/i0;

    iget-object v2, v0, Lg1/c5;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lg1/c5;->y:Lg1/i5;

    iget-object v4, v0, Lg1/c5;->z:Lx1/b;

    iget-object v5, v0, Lg1/c5;->E:Lc93/m;

    iget-object v6, v0, Lg1/c5;->F:Lkotlin/jvm/functions/Function3;

    iget-object v7, v0, Lg1/c5;->G:Lc93/m;

    iget v8, v0, Lg1/c5;->H:I

    iget-boolean v9, v0, Lg1/c5;->I:Z

    iget-object v10, v0, Lg1/c5;->J:Li2/a1;

    iget v11, v0, Lg1/c5;->K:F

    iget-wide v12, v0, Lg1/c5;->L:J

    iget-wide v14, v0, Lg1/c5;->M:J

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lg1/c5;->N:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lg1/c5;->O:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lg1/c5;->P:J

    move-wide/from16 p1, v1

    iget-object v1, v0, Lg1/c5;->Q:Lx1/b;

    move-object/from16 v22, v1

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-wide/from16 v16, v18

    move-wide/from16 v18, v20

    move-wide/from16 v20, p1

    invoke-static/range {v1 .. v25}, Lg1/g5;->b(Ll0/i0;Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
