.class public final synthetic Lg1/v6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:Lf0/t;

.field public final synthetic H:F

.field public final synthetic I:Lj0/i;

.field public final synthetic J:Lx1/b;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:Li2/a1;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JJLf0/t;FLj0/i;Lx1/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/v6;->w:Lc93/a;

    iput-object p2, p0, Lg1/v6;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Lg1/v6;->y:Z

    iput-object p4, p0, Lg1/v6;->z:Li2/a1;

    iput-wide p5, p0, Lg1/v6;->E:J

    iput-wide p7, p0, Lg1/v6;->F:J

    iput-object p9, p0, Lg1/v6;->G:Lf0/t;

    iput p10, p0, Lg1/v6;->H:F

    iput-object p11, p0, Lg1/v6;->I:Lj0/i;

    iput-object p12, p0, Lg1/v6;->J:Lx1/b;

    iput p13, p0, Lg1/v6;->K:I

    iput p14, p0, Lg1/v6;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    check-cast v13, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/v6;->K:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v14

    iget-object v1, v0, Lg1/v6;->w:Lc93/a;

    iget-object v2, v0, Lg1/v6;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v3, v0, Lg1/v6;->y:Z

    iget-object v4, v0, Lg1/v6;->z:Li2/a1;

    iget-wide v5, v0, Lg1/v6;->E:J

    iget-wide v7, v0, Lg1/v6;->F:J

    iget-object v9, v0, Lg1/v6;->G:Lf0/t;

    iget v10, v0, Lg1/v6;->H:F

    iget-object v11, v0, Lg1/v6;->I:Lj0/i;

    iget-object v12, v0, Lg1/v6;->J:Lx1/b;

    iget v15, v0, Lg1/v6;->L:I

    invoke-static/range {v1 .. v15}, Lhg3/i;->l(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JJLf0/t;FLj0/i;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
