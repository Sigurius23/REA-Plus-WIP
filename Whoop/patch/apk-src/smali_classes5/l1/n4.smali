.class public final synthetic Ll1/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lp3/r;

.field public final synthetic G:J

.field public final synthetic H:Lw3/k;

.field public final synthetic I:J

.field public final synthetic J:I

.field public final synthetic K:Z

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:Ll3/v0;

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;IIII)V
    .locals 1

    move/from16 v0, p21

    iput v0, p0, Ll1/n4;->w:I

    iput-object p1, p0, Ll1/n4;->x:Ljava/lang/String;

    iput-object p2, p0, Ll1/n4;->y:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Ll1/n4;->z:J

    iput-wide p5, p0, Ll1/n4;->E:J

    iput-object p7, p0, Ll1/n4;->F:Lp3/r;

    iput-wide p8, p0, Ll1/n4;->G:J

    iput-object p10, p0, Ll1/n4;->H:Lw3/k;

    iput-wide p11, p0, Ll1/n4;->I:J

    iput p13, p0, Ll1/n4;->J:I

    iput-boolean p14, p0, Ll1/n4;->K:Z

    move/from16 p1, p15

    iput p1, p0, Ll1/n4;->L:I

    move/from16 p1, p16

    iput p1, p0, Ll1/n4;->M:I

    move-object/from16 p1, p17

    iput-object p1, p0, Ll1/n4;->N:Ll3/v0;

    move/from16 p1, p18

    iput p1, p0, Ll1/n4;->O:I

    move/from16 p1, p19

    iput p1, p0, Ll1/n4;->P:I

    move/from16 p1, p20

    iput p1, p0, Ll1/n4;->Q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Ll1/n4;->w:I

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Ll1/n4;->O:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget v1, v0, Ll1/n4;->P:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v21

    iget-object v2, v0, Ll1/n4;->x:Ljava/lang/String;

    iget-object v3, v0, Ll1/n4;->y:Landroidx/compose/ui/Modifier;

    iget-wide v4, v0, Ll1/n4;->z:J

    iget-wide v6, v0, Ll1/n4;->E:J

    iget-object v8, v0, Ll1/n4;->F:Lp3/r;

    iget-wide v9, v0, Ll1/n4;->G:J

    iget-object v11, v0, Ll1/n4;->H:Lw3/k;

    iget-wide v12, v0, Ll1/n4;->I:J

    iget v14, v0, Ll1/n4;->J:I

    iget-boolean v15, v0, Ll1/n4;->K:Z

    iget v1, v0, Ll1/n4;->L:I

    move/from16 v16, v1

    iget v1, v0, Ll1/n4;->M:I

    move/from16 v17, v1

    iget-object v1, v0, Ll1/n4;->N:Ll3/v0;

    move-object/from16 v18, v1

    iget v1, v0, Ll1/n4;->Q:I

    move/from16 v22, v1

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Ll1/n4;->O:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget v1, v0, Ll1/n4;->P:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v21

    iget-object v2, v0, Ll1/n4;->x:Ljava/lang/String;

    iget-object v3, v0, Ll1/n4;->y:Landroidx/compose/ui/Modifier;

    iget-wide v4, v0, Ll1/n4;->z:J

    iget-wide v6, v0, Ll1/n4;->E:J

    iget-object v8, v0, Ll1/n4;->F:Lp3/r;

    iget-wide v9, v0, Ll1/n4;->G:J

    iget-object v11, v0, Ll1/n4;->H:Lw3/k;

    iget-wide v12, v0, Ll1/n4;->I:J

    iget v14, v0, Ll1/n4;->J:I

    iget-boolean v15, v0, Ll1/n4;->K:Z

    iget v1, v0, Ll1/n4;->L:I

    move/from16 v16, v1

    iget v1, v0, Ll1/n4;->M:I

    move/from16 v17, v1

    iget-object v1, v0, Ll1/n4;->N:Ll3/v0;

    move-object/from16 v18, v1

    iget v1, v0, Ll1/n4;->Q:I

    move/from16 v22, v1

    invoke-static/range {v2 .. v22}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
