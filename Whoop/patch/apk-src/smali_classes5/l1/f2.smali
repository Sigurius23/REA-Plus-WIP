.class public final synthetic Ll1/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/a1;

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:F

.field public final synthetic I:J

.field public final synthetic J:Lc93/m;

.field public final synthetic K:Lc93/m;

.field public final synthetic L:Ll1/o2;

.field public final synthetic M:Lx1/b;

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll1/w3;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/f2;->w:Lc93/a;

    iput-object p2, p0, Ll1/f2;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Ll1/f2;->y:Ll1/w3;

    iput p4, p0, Ll1/f2;->z:F

    iput-object p5, p0, Ll1/f2;->E:Li2/a1;

    iput-wide p6, p0, Ll1/f2;->F:J

    iput-wide p8, p0, Ll1/f2;->G:J

    iput p10, p0, Ll1/f2;->H:F

    iput-wide p11, p0, Ll1/f2;->I:J

    iput-object p13, p0, Ll1/f2;->J:Lc93/m;

    iput-object p14, p0, Ll1/f2;->K:Lc93/m;

    iput-object p15, p0, Ll1/f2;->L:Ll1/o2;

    move-object/from16 p1, p16

    iput-object p1, p0, Ll1/f2;->M:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x30001

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget-object v1, v0, Ll1/f2;->w:Lc93/a;

    iget-object v2, v0, Ll1/f2;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Ll1/f2;->y:Ll1/w3;

    iget v4, v0, Ll1/f2;->z:F

    iget-object v5, v0, Ll1/f2;->E:Li2/a1;

    iget-wide v6, v0, Ll1/f2;->F:J

    iget-wide v8, v0, Ll1/f2;->G:J

    iget v10, v0, Ll1/f2;->H:F

    iget-wide v11, v0, Ll1/f2;->I:J

    iget-object v13, v0, Ll1/f2;->J:Lc93/m;

    iget-object v14, v0, Ll1/f2;->K:Lc93/m;

    iget-object v15, v0, Ll1/f2;->L:Ll1/o2;

    move-object/from16 v16, v1

    iget-object v1, v0, Ll1/f2;->M:Lx1/b;

    move-object/from16 v19, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Ll1/n2;->b(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
