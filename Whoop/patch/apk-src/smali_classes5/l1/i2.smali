.class public final synthetic Ll1/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Li2/a1;

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic I:F

.field public final synthetic J:J

.field public final synthetic K:Lc93/m;

.field public final synthetic L:Lc93/m;

.field public final synthetic M:Ll1/o2;

.field public final synthetic N:Lx1/b;

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll1/w3;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/i2;->w:Lc93/a;

    iput-object p2, p0, Ll1/i2;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Ll1/i2;->y:Ll1/w3;

    iput p4, p0, Ll1/i2;->z:F

    iput-boolean p5, p0, Ll1/i2;->E:Z

    iput-object p6, p0, Ll1/i2;->F:Li2/a1;

    iput-wide p7, p0, Ll1/i2;->G:J

    iput-wide p9, p0, Ll1/i2;->H:J

    iput p11, p0, Ll1/i2;->I:F

    iput-wide p12, p0, Ll1/i2;->J:J

    iput-object p14, p0, Ll1/i2;->K:Lc93/m;

    iput-object p15, p0, Ll1/i2;->L:Lc93/m;

    move-object/from16 p1, p16

    iput-object p1, p0, Ll1/i2;->M:Ll1/o2;

    move-object/from16 p1, p17

    iput-object p1, p0, Ll1/i2;->N:Lx1/b;

    move/from16 p1, p18

    iput p1, p0, Ll1/i2;->O:I

    move/from16 p1, p19

    iput p1, p0, Ll1/i2;->P:I

    move/from16 p1, p20

    iput p1, p0, Ll1/i2;->Q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Ll1/i2;->O:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget v1, v0, Ll1/i2;->P:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget-object v1, v0, Ll1/i2;->w:Lc93/a;

    iget-object v2, v0, Ll1/i2;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Ll1/i2;->y:Ll1/w3;

    iget v4, v0, Ll1/i2;->z:F

    iget-boolean v5, v0, Ll1/i2;->E:Z

    iget-object v6, v0, Ll1/i2;->F:Li2/a1;

    iget-wide v7, v0, Ll1/i2;->G:J

    iget-wide v9, v0, Ll1/i2;->H:J

    iget v11, v0, Ll1/i2;->I:F

    iget-wide v12, v0, Ll1/i2;->J:J

    iget-object v14, v0, Ll1/i2;->K:Lc93/m;

    iget-object v15, v0, Ll1/i2;->L:Lc93/m;

    move-object/from16 v16, v1

    iget-object v1, v0, Ll1/i2;->M:Ll1/o2;

    move-object/from16 v17, v1

    iget-object v1, v0, Ll1/i2;->N:Lx1/b;

    move-object/from16 v21, v1

    iget v1, v0, Ll1/i2;->Q:I

    move-object/from16 v22, v21

    move/from16 v21, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v22

    invoke-static/range {v1 .. v21}, Ll1/n2;->a(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
