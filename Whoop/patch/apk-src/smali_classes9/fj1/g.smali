.class public final synthetic Lfj1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp3/n;

.field public final synthetic F:Lp3/r;

.field public final synthetic G:Lp3/i;

.field public final synthetic H:J

.field public final synthetic I:Lw3/l;

.field public final synthetic J:Lw3/k;

.field public final synthetic K:J

.field public final synthetic L:I

.field public final synthetic M:Z

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic P:Lkotlin/jvm/functions/Function1;

.field public final synthetic Q:Lb91/a;

.field public final synthetic R:Ljava/lang/Float;

.field public final synthetic S:Ljava/lang/Float;

.field public final synthetic T:I

.field public final synthetic U:I

.field public final synthetic V:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Ljava/lang/Float;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj1/g;->w:Ljava/lang/String;

    iput-object p2, p0, Lfj1/g;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lfj1/g;->y:J

    iput-wide p5, p0, Lfj1/g;->z:J

    iput-object p7, p0, Lfj1/g;->E:Lp3/n;

    iput-object p8, p0, Lfj1/g;->F:Lp3/r;

    iput-object p9, p0, Lfj1/g;->G:Lp3/i;

    iput-wide p10, p0, Lfj1/g;->H:J

    iput-object p12, p0, Lfj1/g;->I:Lw3/l;

    iput-object p13, p0, Lfj1/g;->J:Lw3/k;

    iput-wide p14, p0, Lfj1/g;->K:J

    move/from16 p1, p16

    iput p1, p0, Lfj1/g;->L:I

    move/from16 p1, p17

    iput-boolean p1, p0, Lfj1/g;->M:Z

    move/from16 p1, p18

    iput p1, p0, Lfj1/g;->N:I

    move/from16 p1, p19

    iput p1, p0, Lfj1/g;->O:I

    move-object/from16 p1, p20

    iput-object p1, p0, Lfj1/g;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p21

    iput-object p1, p0, Lfj1/g;->Q:Lb91/a;

    move-object/from16 p1, p22

    iput-object p1, p0, Lfj1/g;->R:Ljava/lang/Float;

    move-object/from16 p1, p23

    iput-object p1, p0, Lfj1/g;->S:Ljava/lang/Float;

    move/from16 p1, p24

    iput p1, p0, Lfj1/g;->T:I

    move/from16 p1, p25

    iput p1, p0, Lfj1/g;->U:I

    move/from16 p1, p26

    iput p1, p0, Lfj1/g;->V:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v27, p1

    check-cast v27, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v28

    iget-object v1, v0, Lfj1/g;->w:Ljava/lang/String;

    iget-object v2, v0, Lfj1/g;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, v0, Lfj1/g;->y:J

    iget-wide v5, v0, Lfj1/g;->z:J

    iget-object v7, v0, Lfj1/g;->E:Lp3/n;

    iget-object v8, v0, Lfj1/g;->F:Lp3/r;

    iget-object v9, v0, Lfj1/g;->G:Lp3/i;

    iget-wide v10, v0, Lfj1/g;->H:J

    iget-object v12, v0, Lfj1/g;->I:Lw3/l;

    iget-object v13, v0, Lfj1/g;->J:Lw3/k;

    iget-wide v14, v0, Lfj1/g;->K:J

    move-object/from16 v16, v1

    iget v1, v0, Lfj1/g;->L:I

    move/from16 v17, v1

    iget-boolean v1, v0, Lfj1/g;->M:Z

    move/from16 v18, v1

    iget v1, v0, Lfj1/g;->N:I

    move/from16 v19, v1

    iget v1, v0, Lfj1/g;->O:I

    move/from16 v20, v1

    iget-object v1, v0, Lfj1/g;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v1

    iget-object v1, v0, Lfj1/g;->Q:Lb91/a;

    move-object/from16 v22, v1

    iget-object v1, v0, Lfj1/g;->R:Ljava/lang/Float;

    move-object/from16 v23, v1

    iget-object v1, v0, Lfj1/g;->S:Ljava/lang/Float;

    move-object/from16 v24, v1

    iget v1, v0, Lfj1/g;->T:I

    move/from16 v25, v1

    iget v1, v0, Lfj1/g;->U:I

    move/from16 v26, v1

    iget v1, v0, Lfj1/g;->V:I

    move/from16 v29, v26

    move/from16 v26, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move/from16 v24, v25

    move/from16 v25, v29

    invoke-static/range {v1 .. v28}, Lfj1/h;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Ljava/lang/Float;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
