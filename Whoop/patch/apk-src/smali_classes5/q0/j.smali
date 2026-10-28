.class public final synthetic Lq0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:F

.field public final synthetic G:Lb2/g;

.field public final synthetic H:Lh0/p3;

.field public final synthetic I:Z

.field public final synthetic J:Lt2/a;

.field public final synthetic K:Li0/n;

.field public final synthetic L:Lf0/k;

.field public final synthetic M:Lx1/b;

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic w:Lq0/y;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll0/k1;

.field public final synthetic z:Lq0/e;


# direct methods
.method public synthetic constructor <init>(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/j;->w:Lq0/y;

    iput-object p2, p0, Lq0/j;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lq0/j;->y:Ll0/k1;

    iput-object p4, p0, Lq0/j;->z:Lq0/e;

    iput p5, p0, Lq0/j;->E:I

    iput p6, p0, Lq0/j;->F:F

    iput-object p7, p0, Lq0/j;->G:Lb2/g;

    iput-object p8, p0, Lq0/j;->H:Lh0/p3;

    iput-boolean p9, p0, Lq0/j;->I:Z

    iput-object p10, p0, Lq0/j;->J:Lt2/a;

    iput-object p11, p0, Lq0/j;->K:Li0/n;

    iput-object p12, p0, Lq0/j;->L:Lf0/k;

    iput-object p13, p0, Lq0/j;->M:Lx1/b;

    iput p14, p0, Lq0/j;->N:I

    iput p15, p0, Lq0/j;->O:I

    move/from16 p1, p16

    iput p1, p0, Lq0/j;->P:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lq0/j;->N:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v15

    iget v1, v0, Lq0/j;->O:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v16

    iget-object v1, v0, Lq0/j;->w:Lq0/y;

    iget-object v2, v0, Lq0/j;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Lq0/j;->y:Ll0/k1;

    iget-object v4, v0, Lq0/j;->z:Lq0/e;

    iget v5, v0, Lq0/j;->E:I

    iget v6, v0, Lq0/j;->F:F

    iget-object v7, v0, Lq0/j;->G:Lb2/g;

    iget-object v8, v0, Lq0/j;->H:Lh0/p3;

    iget-boolean v9, v0, Lq0/j;->I:Z

    iget-object v10, v0, Lq0/j;->J:Lt2/a;

    iget-object v11, v0, Lq0/j;->K:Li0/n;

    iget-object v12, v0, Lq0/j;->L:Lf0/k;

    iget-object v13, v0, Lq0/j;->M:Lx1/b;

    move-object/from16 v17, v1

    iget v1, v0, Lq0/j;->P:I

    move-object/from16 v18, v17

    move/from16 v17, v1

    move-object/from16 v1, v18

    invoke-static/range {v1 .. v17}, Ldp/d;->d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
