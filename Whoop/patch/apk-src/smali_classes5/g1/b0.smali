.class public final synthetic Lg1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Li2/a1;

.field public final synthetic H:J

.field public final synthetic I:J

.field public final synthetic J:Lc4/a0;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lx1/b;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b0;->w:Lc93/a;

    iput-object p2, p0, Lg1/b0;->x:Lx1/b;

    iput-object p3, p0, Lg1/b0;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lg1/b0;->z:Lc93/m;

    iput-object p5, p0, Lg1/b0;->E:Lc93/m;

    iput-object p6, p0, Lg1/b0;->F:Lc93/m;

    iput-object p7, p0, Lg1/b0;->G:Li2/a1;

    iput-wide p8, p0, Lg1/b0;->H:J

    iput-wide p10, p0, Lg1/b0;->I:J

    iput-object p12, p0, Lg1/b0;->J:Lc4/a0;

    iput p13, p0, Lg1/b0;->K:I

    iput p14, p0, Lg1/b0;->L:I

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

    iget v1, v0, Lg1/b0;->K:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v14

    iget-object v1, v0, Lg1/b0;->w:Lc93/a;

    iget-object v2, v0, Lg1/b0;->x:Lx1/b;

    iget-object v3, v0, Lg1/b0;->y:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Lg1/b0;->z:Lc93/m;

    iget-object v5, v0, Lg1/b0;->E:Lc93/m;

    iget-object v6, v0, Lg1/b0;->F:Lc93/m;

    iget-object v7, v0, Lg1/b0;->G:Li2/a1;

    iget-wide v8, v0, Lg1/b0;->H:J

    iget-wide v10, v0, Lg1/b0;->I:J

    iget-object v12, v0, Lg1/b0;->J:Lc4/a0;

    iget v15, v0, Lg1/b0;->L:I

    invoke-static/range {v1 .. v15}, Ldc/a;->a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
