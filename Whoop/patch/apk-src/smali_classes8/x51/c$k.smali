.class public final Lx51/c$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx51/c;->g(Landroidx/compose/ui/Modifier;Lx51/d;Ld0/z1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;

.field final synthetic F:Lp1/t2;

.field final synthetic G:Lp1/t2;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Ld0/z1;

.field final synthetic y:Lkotlin/jvm/functions/Function1;

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ld0/z1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;Lp1/t2;)V
    .locals 0

    iput-object p1, p0, Lx51/c$k;->w:Ljava/util/List;

    iput-object p2, p0, Lx51/c$k;->x:Ld0/z1;

    iput-object p3, p0, Lx51/c$k;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lx51/c$k;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lx51/c$k;->E:Lp1/t2;

    iput-object p6, p0, Lx51/c$k;->F:Lp1/t2;

    iput-object p7, p0, Lx51/c$k;->G:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v2, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, v0, Lx51/c$k;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lx51/a;

    const v1, -0x7dcad39e

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    instance-of v1, v8, Lx51/a$a;

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/16 v4, 0x8

    const-wide/high16 v9, 0x3ff4000000000000L    # 1.25

    if-eqz v1, :cond_9

    const v1, -0x7dca598f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lx51/a$a;

    const/4 v5, 0x0

    invoke-direct {v1, v7, v6, v5}, Lx51/a$a;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lx51/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v11, v0, Lx51/c$k;->x:Ld0/z1;

    iget-object v11, v11, Ld0/z1;->a:Lal/a;

    invoke-virtual {v11}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_5

    new-instance v6, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/a;->m()I

    move-result v11

    invoke-direct {v6, v11, v5, v3, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_5
    new-instance v3, Lx51/a$a;

    invoke-direct {v3, v7, v6, v5}, Lx51/a$a;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lx51/a;->b()Ly71/g;

    move-result-object v6

    :goto_4
    iget-object v3, v0, Lx51/c$k;->x:Ld0/z1;

    iget-object v3, v3, Ld0/z1;->a:Lal/a;

    invoke-virtual {v3}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v5, 0x6

    if-eqz v3, :cond_6

    const v3, -0x77ab8ae9

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3, v12, v5, v7}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v13

    goto :goto_5

    :cond_6
    const v3, -0x77ab86a9

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3, v12, v5, v7}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v13

    :goto_5
    iget-object v3, v0, Lx51/c$k;->E:Lp1/t2;

    invoke-static {v3}, Lx51/c;->r(Lp1/t2;)J

    move-result-wide v15

    move-wide/from16 v17, v13

    invoke-virtual {v8}, Lx51/a;->f()Z

    move-result v14

    move-wide v8, v9

    move-wide v10, v15

    iget-object v15, v0, Lx51/c$k;->x:Ld0/z1;

    iget-object v3, v0, Lx51/c$k;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_8

    :cond_7
    new-instance v5, Lx51/c$h;

    iget-object v3, v0, Lx51/c$k;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v5, v3}, Lx51/c$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v16, v5

    check-cast v16, Lkotlin/jvm/functions/Function1;

    move-wide/from16 v20, v17

    move-object/from16 v17, v12

    move-wide/from16 v12, v20

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v20, v8

    move-object v9, v6

    move-wide/from16 v5, v20

    move-object v8, v1

    invoke-static/range {v8 .. v19}, Lvy0/x;->s(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    double-to-float v1, v5

    int-to-float v3, v4

    invoke-static {v1, v3, v2, v12, v7}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto/16 :goto_8

    :cond_9
    move-wide v5, v9

    instance-of v1, v8, Lx51/a$h;

    if-eqz v1, :cond_b

    const v1, -0x7dbf27ff

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lx51/c$k;->x:Ld0/z1;

    iget-object v1, v1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    const v1, -0x7dbe7315

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lx51/c$k;->F:Lp1/t2;

    invoke-static {v1}, Lx51/c;->s(Lp1/t2;)F

    move-result v9

    iget-object v1, v0, Lx51/c$k;->G:Lp1/t2;

    invoke-static {v1}, Lx51/c;->q(Lp1/t2;)F

    move-result v10

    iget-object v11, v0, Lx51/c$k;->z:Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lx51/c;->t(Lx51/a;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    const v1, -0x7dbce52b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_6
    double-to-float v1, v5

    int-to-float v3, v4

    invoke-static {v1, v3, v2, v12, v7}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_8

    :cond_b
    const v1, -0x7dbb159f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    double-to-float v1, v5

    int-to-float v3, v4

    invoke-static {v1, v3, v2, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    iget-object v1, v0, Lx51/c$k;->x:Ld0/z1;

    iget-object v1, v1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    const v1, -0x7db95555

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lx51/c$k;->F:Lp1/t2;

    invoke-static {v1}, Lx51/c;->s(Lp1/t2;)F

    move-result v9

    iget-object v1, v0, Lx51/c$k;->G:Lp1/t2;

    invoke-static {v1}, Lx51/c;->q(Lp1/t2;)F

    move-result v10

    iget-object v11, v0, Lx51/c$k;->z:Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lx51/c;->t(Lx51/a;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    const v1, -0x7db7c76b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lx51/c$k;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
