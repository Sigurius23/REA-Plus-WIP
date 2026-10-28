.class public final synthetic Lg1/f2;
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

.field public final synthetic w:Lx1/b;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lg1/s0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/s0;ZLi2/a1;FJJJLx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/f2;->w:Lx1/b;

    iput-object p2, p0, Lg1/f2;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/f2;->y:Lg1/s0;

    iput-boolean p4, p0, Lg1/f2;->z:Z

    iput-object p5, p0, Lg1/f2;->E:Li2/a1;

    iput p6, p0, Lg1/f2;->F:F

    iput-wide p7, p0, Lg1/f2;->G:J

    iput-wide p9, p0, Lg1/f2;->H:J

    iput-wide p11, p0, Lg1/f2;->I:J

    iput-object p13, p0, Lg1/f2;->J:Lx1/b;

    iput p14, p0, Lg1/f2;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/f2;->K:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v15

    iget-object v1, v0, Lg1/f2;->w:Lx1/b;

    iget-object v2, v0, Lg1/f2;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lg1/f2;->y:Lg1/s0;

    iget-boolean v4, v0, Lg1/f2;->z:Z

    iget-object v5, v0, Lg1/f2;->E:Li2/a1;

    iget v6, v0, Lg1/f2;->F:F

    iget-wide v7, v0, Lg1/f2;->G:J

    iget-wide v9, v0, Lg1/f2;->H:J

    iget-wide v11, v0, Lg1/f2;->I:J

    iget-object v13, v0, Lg1/f2;->J:Lx1/b;

    invoke-static/range {v1 .. v15}, Lg1/p2;->a(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/s0;ZLi2/a1;FJJJLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
