.class public final synthetic Lg1/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/a1;

.field public final synthetic F:F

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic I:J

.field public final synthetic J:Lx1/b;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lx1/b;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lg1/y3;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/y3;ZLi2/a1;FJJJLx1/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/s3;->w:Lx1/b;

    iput-object p2, p0, Lg1/s3;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/s3;->y:Lg1/y3;

    iput-boolean p4, p0, Lg1/s3;->z:Z

    iput-object p5, p0, Lg1/s3;->E:Li2/a1;

    iput p6, p0, Lg1/s3;->F:F

    iput-wide p7, p0, Lg1/s3;->G:J

    iput-wide p9, p0, Lg1/s3;->H:J

    iput-wide p11, p0, Lg1/s3;->I:J

    iput-object p13, p0, Lg1/s3;->J:Lx1/b;

    iput p14, p0, Lg1/s3;->K:I

    iput p15, p0, Lg1/s3;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/s3;->K:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v15

    iget-object v1, v0, Lg1/s3;->w:Lx1/b;

    iget-object v2, v0, Lg1/s3;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lg1/s3;->y:Lg1/y3;

    iget-boolean v4, v0, Lg1/s3;->z:Z

    iget-object v5, v0, Lg1/s3;->E:Li2/a1;

    iget v6, v0, Lg1/s3;->F:F

    iget-wide v7, v0, Lg1/s3;->G:J

    iget-wide v9, v0, Lg1/s3;->H:J

    iget-wide v11, v0, Lg1/s3;->I:J

    iget-object v13, v0, Lg1/s3;->J:Lx1/b;

    move-object/from16 v16, v1

    iget v1, v0, Lg1/s3;->L:I

    move-object/from16 v17, v16

    move/from16 v16, v1

    move-object/from16 v1, v17

    invoke-static/range {v1 .. v16}, Landroidx/compose/material/c;->a(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/y3;ZLi2/a1;FJJJLx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
