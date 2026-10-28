.class public final Lu0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lu0/n1;

.field public final synthetic F:Lq3/y;

.field public final synthetic G:Lq3/g0;

.field public final synthetic H:Landroidx/compose/ui/Modifier;

.field public final synthetic I:Landroidx/compose/ui/Modifier;

.field public final synthetic J:Landroidx/compose/ui/Modifier;

.field public final synthetic K:Landroidx/compose/ui/Modifier;

.field public final synthetic L:Lr0/a;

.field public final synthetic M:Lf1/s1;

.field public final synthetic N:Z

.field public final synthetic O:Z

.field public final synthetic P:Lkotlin/jvm/functions/Function1;

.field public final synthetic Q:Lq3/r;

.field public final synthetic R:Ly3/c;

.field public final synthetic w:Lu0/s0;

.field public final synthetic x:Ll3/v0;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lu0/s0;Ll3/v0;IILu0/n1;Lq3/y;Lq3/g0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lr0/a;Lf1/s1;ZZLkotlin/jvm/functions/Function1;Lq3/r;Ly3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/y;->w:Lu0/s0;

    iput-object p2, p0, Lu0/y;->x:Ll3/v0;

    iput p3, p0, Lu0/y;->y:I

    iput p4, p0, Lu0/y;->z:I

    iput-object p5, p0, Lu0/y;->E:Lu0/n1;

    iput-object p6, p0, Lu0/y;->F:Lq3/y;

    iput-object p7, p0, Lu0/y;->G:Lq3/g0;

    iput-object p8, p0, Lu0/y;->H:Landroidx/compose/ui/Modifier;

    iput-object p9, p0, Lu0/y;->I:Landroidx/compose/ui/Modifier;

    iput-object p10, p0, Lu0/y;->J:Landroidx/compose/ui/Modifier;

    iput-object p11, p0, Lu0/y;->K:Landroidx/compose/ui/Modifier;

    iput-object p12, p0, Lu0/y;->L:Lr0/a;

    iput-object p13, p0, Lu0/y;->M:Lf1/s1;

    iput-boolean p14, p0, Lu0/y;->N:Z

    iput-boolean p15, p0, Lu0/y;->O:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lu0/y;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p17

    iput-object p1, p0, Lu0/y;->Q:Lq3/r;

    move-object/from16 p1, p18

    iput-object p1, p0, Lu0/y;->R:Ly3/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v3, v5, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/2addr v2, v4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v8, v0, Lu0/y;->w:Lu0/s0;

    iget-object v2, v8, Lu0/s0;->g:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    const/4 v3, 0x0

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v2, v3, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lu0/h0;

    iget v5, v0, Lu0/y;->y:I

    iget v6, v0, Lu0/y;->z:I

    iget-object v7, v0, Lu0/y;->x:Ll3/v0;

    invoke-direct {v3, v5, v6, v7}, Lu0/h0;-><init>(IILl3/v0;)V

    invoke-static {v2, v3}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_2

    :cond_1
    new-instance v5, Lsc0/c;

    const/16 v3, 0xc

    invoke-direct {v5, v8, v3}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v5, Lc93/a;

    iget-object v3, v0, Lu0/y;->E:Lu0/n1;

    iget-object v6, v3, Lu0/n1;->f:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh0/d2;

    iget-object v9, v0, Lu0/y;->F:Lq3/y;

    iget-wide v10, v9, Lq3/y;->b:J

    sget v12, Ll3/u0;->c:I

    const/16 v12, 0x20

    shr-long v13, v10, v12

    long-to-int v13, v13

    iget-wide v14, v3, Lu0/n1;->e:J

    move-object/from16 p2, v5

    shr-long v4, v14, v12

    long-to-int v4, v4

    if-eq v13, v4, :cond_3

    goto :goto_1

    :cond_3
    const-wide v4, 0xffffffffL

    and-long v12, v10, v4

    long-to-int v13, v12

    and-long/2addr v4, v14

    long-to-int v4, v4

    if-eq v13, v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v10, v11}, Ll3/u0;->f(J)I

    move-result v13

    :goto_1
    iget-wide v4, v9, Lq3/y;->b:J

    iput-wide v4, v3, Lu0/n1;->e:J

    iget-object v4, v9, Lq3/y;->a:Ll3/g;

    iget-object v5, v0, Lu0/y;->G:Lq3/g0;

    invoke-static {v5, v4}, Lu0/u1;->a(Lq3/g0;Ll3/g;)Lq3/e0;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_6

    const/4 v6, 0x1

    if-ne v5, v6, :cond_5

    new-instance v5, Lu0/i0;

    move-object/from16 v6, p2

    invoke-direct {v5, v3, v13, v4, v6}, Lu0/i0;-><init>(Lu0/n1;ILq3/e0;Lc93/a;)V

    goto :goto_2

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    move-object/from16 v6, p2

    new-instance v5, Lu0/v1;

    invoke-direct {v5, v3, v13, v4, v6}, Lu0/v1;-><init>(Lu0/n1;ILq3/e0;Lc93/a;)V

    :goto_2
    invoke-static {v2}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lu0/y;->H:Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lu0/y;->I:Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lb30/o4;

    const/16 v4, 0x10

    invoke-direct {v3, v7, v4}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v3}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lu0/y;->J:Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lu0/y;->K:Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lu0/y;->L:Lr0/a;

    invoke-static {v2, v3}, Landroidx/compose/foundation/relocation/a;->a(Landroidx/compose/ui/Modifier;Lr0/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v6, Lu0/x;

    iget-object v14, v0, Lu0/y;->R:Ly3/c;

    iget v15, v0, Lu0/y;->z:I

    iget-object v7, v0, Lu0/y;->M:Lf1/s1;

    iget-boolean v9, v0, Lu0/y;->N:Z

    iget-boolean v10, v0, Lu0/y;->O:Z

    iget-object v11, v0, Lu0/y;->P:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lu0/y;->F:Lq3/y;

    iget-object v13, v0, Lu0/y;->Q:Lq3/r;

    invoke-direct/range {v6 .. v15}, Lu0/x;-><init>(Lf1/s1;Lu0/s0;ZZLkotlin/jvm/functions/Function1;Lq3/y;Lq3/r;Ly3/c;I)V

    const v3, 0x54340ce8

    invoke-static {v3, v1, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v2, v3, v1, v4}, Lf1/y0;->g(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
