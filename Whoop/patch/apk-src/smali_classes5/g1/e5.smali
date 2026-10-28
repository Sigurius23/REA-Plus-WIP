.class public final Lg1/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lx1/b;

.field public final synthetic G:Lx1/b;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Lc93/m;

.field public final synthetic J:Lkotlin/jvm/functions/Function3;

.field public final synthetic K:Lg1/i5;

.field public final synthetic w:Lg1/a4;

.field public final synthetic x:Ll0/i0;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Lg1/a4;Ll0/i0;JJILx1/b;Lx1/b;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lg1/i5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/e5;->w:Lg1/a4;

    iput-object p2, p0, Lg1/e5;->x:Ll0/i0;

    iput-wide p3, p0, Lg1/e5;->y:J

    iput-wide p5, p0, Lg1/e5;->z:J

    iput p7, p0, Lg1/e5;->E:I

    iput-object p8, p0, Lg1/e5;->F:Lx1/b;

    iput-object p9, p0, Lg1/e5;->G:Lx1/b;

    iput-object p10, p0, Lg1/e5;->H:Lc93/m;

    iput-object p11, p0, Lg1/e5;->I:Lc93/m;

    iput-object p12, p0, Lg1/e5;->J:Lkotlin/jvm/functions/Function3;

    iput-object p13, p0, Lg1/e5;->K:Lg1/i5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    if-eq v4, v5, :cond_2

    move v4, v6

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    and-int/2addr v3, v6

    move-object v14, v2

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lg1/e5;->w:Lg1/a4;

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lg1/e5;->x:Ll0/i0;

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, Lfd3/a;

    const/16 v3, 0xb

    invoke-direct {v5, v3, v2, v4}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lb30/o4;

    const/4 v3, 0x7

    invoke-direct {v2, v5, v3}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v15, Lb30/w;

    iget-object v1, v0, Lg1/e5;->J:Lkotlin/jvm/functions/Function3;

    iget-object v2, v0, Lg1/e5;->K:Lg1/i5;

    iget v3, v0, Lg1/e5;->E:I

    iget-object v4, v0, Lg1/e5;->F:Lx1/b;

    iget-object v6, v0, Lg1/e5;->G:Lx1/b;

    iget-object v7, v0, Lg1/e5;->H:Lc93/m;

    iget-object v8, v0, Lg1/e5;->w:Lg1/a4;

    iget-object v9, v0, Lg1/e5;->I:Lc93/m;

    move-object/from16 v22, v1

    move-object/from16 v23, v2

    move/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    invoke-direct/range {v15 .. v23}, Lb30/w;-><init>(ILx1/b;Lx1/b;Lc93/m;Lg1/a4;Lc93/m;Lkotlin/jvm/functions/Function3;Lg1/i5;)V

    const v1, -0x68f9b348

    invoke-static {v1, v14, v15}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0x180000

    const/16 v16, 0x32

    const/4 v6, 0x0

    iget-wide v7, v0, Lg1/e5;->y:J

    iget-wide v9, v0, Lg1/e5;->z:J

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_5
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
