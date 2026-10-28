.class public final Lu0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lu0/n1;

.field public final synthetic G:Lq3/y;

.field public final synthetic H:Lq3/g0;

.field public final synthetic I:Landroidx/compose/ui/Modifier;

.field public final synthetic J:Landroidx/compose/ui/Modifier;

.field public final synthetic K:Landroidx/compose/ui/Modifier;

.field public final synthetic L:Landroidx/compose/ui/Modifier;

.field public final synthetic M:Lr0/a;

.field public final synthetic N:Lf1/s1;

.field public final synthetic O:Z

.field public final synthetic P:Z

.field public final synthetic Q:Lkotlin/jvm/functions/Function1;

.field public final synthetic R:Lq3/r;

.field public final synthetic S:Ly3/c;

.field public final synthetic w:Lkotlin/jvm/functions/Function3;

.field public final synthetic x:Lu0/s0;

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lu0/s0;Ll3/v0;IILu0/n1;Lq3/y;Lq3/g0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lr0/a;Lf1/s1;ZZLkotlin/jvm/functions/Function1;Lq3/r;Ly3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/z;->w:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lu0/z;->x:Lu0/s0;

    iput-object p3, p0, Lu0/z;->y:Ll3/v0;

    iput p4, p0, Lu0/z;->z:I

    iput p5, p0, Lu0/z;->E:I

    iput-object p6, p0, Lu0/z;->F:Lu0/n1;

    iput-object p7, p0, Lu0/z;->G:Lq3/y;

    iput-object p8, p0, Lu0/z;->H:Lq3/g0;

    iput-object p9, p0, Lu0/z;->I:Landroidx/compose/ui/Modifier;

    iput-object p10, p0, Lu0/z;->J:Landroidx/compose/ui/Modifier;

    iput-object p11, p0, Lu0/z;->K:Landroidx/compose/ui/Modifier;

    iput-object p12, p0, Lu0/z;->L:Landroidx/compose/ui/Modifier;

    iput-object p13, p0, Lu0/z;->M:Lr0/a;

    iput-object p14, p0, Lu0/z;->N:Lf1/s1;

    iput-boolean p15, p0, Lu0/z;->O:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Lu0/z;->P:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lu0/z;->Q:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p18

    iput-object p1, p0, Lu0/z;->R:Lq3/r;

    move-object/from16 p1, p19

    iput-object p1, p0, Lu0/z;->S:Ly3/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v3, Lu0/y;

    iget-object v2, v0, Lu0/z;->R:Lq3/r;

    iget-object v4, v0, Lu0/z;->S:Ly3/c;

    move-object/from16 v21, v4

    iget-object v4, v0, Lu0/z;->x:Lu0/s0;

    iget-object v5, v0, Lu0/z;->y:Ll3/v0;

    iget v6, v0, Lu0/z;->z:I

    iget v7, v0, Lu0/z;->E:I

    iget-object v8, v0, Lu0/z;->F:Lu0/n1;

    iget-object v9, v0, Lu0/z;->G:Lq3/y;

    iget-object v10, v0, Lu0/z;->H:Lq3/g0;

    iget-object v11, v0, Lu0/z;->I:Landroidx/compose/ui/Modifier;

    iget-object v12, v0, Lu0/z;->J:Landroidx/compose/ui/Modifier;

    iget-object v13, v0, Lu0/z;->K:Landroidx/compose/ui/Modifier;

    iget-object v14, v0, Lu0/z;->L:Landroidx/compose/ui/Modifier;

    iget-object v15, v0, Lu0/z;->M:Lr0/a;

    move-object/from16 v20, v2

    iget-object v2, v0, Lu0/z;->N:Lf1/s1;

    move-object/from16 v16, v2

    iget-boolean v2, v0, Lu0/z;->O:Z

    move/from16 v17, v2

    iget-boolean v2, v0, Lu0/z;->P:Z

    move/from16 v18, v2

    iget-object v2, v0, Lu0/z;->Q:Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v2

    invoke-direct/range {v3 .. v21}, Lu0/y;-><init>(Lu0/s0;Ll3/v0;IILu0/n1;Lq3/y;Lq3/g0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lr0/a;Lf1/s1;ZZLkotlin/jvm/functions/Function1;Lq3/r;Ly3/c;)V

    const v2, -0x2a4ac0e

    invoke-static {v2, v1, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v0, Lu0/z;->w:Lkotlin/jvm/functions/Function3;

    invoke-interface {v4, v2, v1, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
