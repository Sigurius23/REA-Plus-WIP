.class public final Lx30/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc93/a;Lc93/a;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/o1;->w:Ljava/lang/String;

    iput-object p2, p0, Lx30/o1;->x:Lc93/a;

    iput-object p3, p0, Lx30/o1;->y:Lc93/a;

    iput-object p4, p0, Lx30/o1;->z:Ljava/lang/String;

    iput-boolean p5, p0, Lx30/o1;->E:Z

    iput-object p6, p0, Lx30/o1;->F:Ljava/lang/String;

    iput-object p7, p0, Lx30/o1;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    sget-object v2, Lb2/t;->w:Lb2/t;

    const-string v3, "simple_dialog"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    check-cast v1, Lp1/q;

    const v2, -0x41e8947d

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lx30/o1;->w:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    :goto_1
    move-object v9, v2

    goto :goto_2

    :cond_2
    new-instance v3, Lb30/b0;

    const/4 v4, 0x7

    invoke-direct {v3, v2, v4}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v2, -0x61bd1a5d

    invoke-static {v2, v1, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    goto :goto_1

    :goto_2
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const v3, -0x41e8a907

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    iget-object v3, v0, Lx30/o1;->x:Lc93/a;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lry2/g;

    const/16 v4, 0x1a

    invoke-direct {v5, v3, v4}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v5

    check-cast v4, Lc93/a;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    new-instance v2, Lb30/j5;

    iget-object v5, v0, Lx30/o1;->z:Ljava/lang/String;

    iget-boolean v7, v0, Lx30/o1;->E:Z

    iget-object v8, v0, Lx30/o1;->y:Lc93/a;

    invoke-direct {v2, v8, v5, v7}, Lb30/j5;-><init>(Lc93/a;Ljava/lang/String;Z)V

    const v5, 0x2c81b6ad

    invoke-static {v5, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    new-instance v2, Lu10/f;

    iget-object v7, v0, Lx30/o1;->F:Ljava/lang/String;

    const/4 v8, 0x5

    invoke-direct {v2, v8, v3, v7}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x3d5b0a95

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    new-instance v2, Lb30/b0;

    iget-object v3, v0, Lx30/o1;->G:Ljava/lang/String;

    const/16 v8, 0x8

    invoke-direct {v2, v3, v8}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v3, -0x72496b36

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v17, 0x6db0

    const/16 v18, 0x3c0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v4 .. v18}, Ldc/a;->a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
