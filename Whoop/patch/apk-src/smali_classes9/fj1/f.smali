.class public final synthetic Lfj1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:Z

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:J

.field public final synthetic K:J

.field public final synthetic L:Lp3/n;

.field public final synthetic M:Lp3/r;

.field public final synthetic N:Lp3/i;

.field public final synthetic O:J

.field public final synthetic P:Lw3/l;

.field public final synthetic Q:Lw3/k;

.field public final synthetic R:J

.field public final synthetic S:Lb91/a;

.field public final synthetic w:Lu0/z0;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Ll3/v0;


# direct methods
.method public synthetic constructor <init>(Lu0/z0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIIJJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JLb91/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj1/f;->w:Lu0/z0;

    iput-object p2, p0, Lfj1/f;->x:Ljava/lang/String;

    iput-object p3, p0, Lfj1/f;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lfj1/f;->z:Ll3/v0;

    iput-object p5, p0, Lfj1/f;->E:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lfj1/f;->F:I

    iput-boolean p7, p0, Lfj1/f;->G:Z

    iput p8, p0, Lfj1/f;->H:I

    iput p9, p0, Lfj1/f;->I:I

    iput-wide p10, p0, Lfj1/f;->J:J

    iput-wide p12, p0, Lfj1/f;->K:J

    iput-object p14, p0, Lfj1/f;->L:Lp3/n;

    iput-object p15, p0, Lfj1/f;->M:Lp3/r;

    move-object/from16 p1, p16

    iput-object p1, p0, Lfj1/f;->N:Lp3/i;

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lfj1/f;->O:J

    move-object/from16 p1, p19

    iput-object p1, p0, Lfj1/f;->P:Lw3/l;

    move-object/from16 p1, p20

    iput-object p1, p0, Lfj1/f;->Q:Lw3/k;

    move-wide/from16 p1, p21

    iput-wide p1, p0, Lfj1/f;->R:J

    move-object/from16 p1, p23

    iput-object p1, p0, Lfj1/f;->S:Lb91/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v24, p1

    check-cast v24, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v25

    iget-object v1, v0, Lfj1/f;->w:Lu0/z0;

    iget-object v2, v0, Lfj1/f;->x:Ljava/lang/String;

    iget-object v3, v0, Lfj1/f;->y:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Lfj1/f;->z:Ll3/v0;

    iget-object v5, v0, Lfj1/f;->E:Lkotlin/jvm/functions/Function1;

    iget v6, v0, Lfj1/f;->F:I

    iget-boolean v7, v0, Lfj1/f;->G:Z

    iget v8, v0, Lfj1/f;->H:I

    iget v9, v0, Lfj1/f;->I:I

    iget-wide v10, v0, Lfj1/f;->J:J

    iget-wide v12, v0, Lfj1/f;->K:J

    iget-object v14, v0, Lfj1/f;->L:Lp3/n;

    iget-object v15, v0, Lfj1/f;->M:Lp3/r;

    move-object/from16 v16, v1

    iget-object v1, v0, Lfj1/f;->N:Lp3/i;

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lfj1/f;->O:J

    move-wide/from16 v19, v1

    iget-object v1, v0, Lfj1/f;->P:Lw3/l;

    iget-object v2, v0, Lfj1/f;->Q:Lw3/k;

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    iget-wide v1, v0, Lfj1/f;->R:J

    move-wide/from16 p1, v1

    iget-object v1, v0, Lfj1/f;->S:Lb91/a;

    move-object/from16 v23, v1

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v16, v18

    move-wide/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move-wide/from16 v21, p1

    invoke-static/range {v1 .. v25}, Lfj1/h;->b(Lu0/z0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIIJJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JLb91/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
