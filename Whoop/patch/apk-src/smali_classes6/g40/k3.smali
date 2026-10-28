.class public final Lg40/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lzy/b;

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lg40/g3;


# direct methods
.method public constructor <init>(Lzy/b;JLjava/util/List;Lg40/g3;JLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/k3;->w:Lzy/b;

    iput-wide p2, p0, Lg40/k3;->x:J

    iput-object p4, p0, Lg40/k3;->y:Ljava/lang/Object;

    iput-object p5, p0, Lg40/k3;->z:Lg40/g3;

    iput-wide p6, p0, Lg40/k3;->E:J

    iput-object p8, p0, Lg40/k3;->F:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$DropdownMenu"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-object v1, v0, Lg40/k3;->w:Lzy/b;

    invoke-static {v1, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x5

    int-to-float v3, v3

    const/16 v4, 0xd

    int-to-float v4, v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v4, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v25, 0x0

    const v26, 0x1fff8

    iget-wide v4, v0, Lg40/k3;->x:J

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v2

    move-object v2, v1

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v23

    iget-object v2, v0, Lg40/k3;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/g3;

    invoke-interface {v3}, Lg40/g3;->getLabel()Lzy/c;

    move-result-object v4

    invoke-static {v4, v1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Lg40/g3;->getIcon()Ljava/lang/Integer;

    move-result-object v6

    iget-object v4, v0, Lg40/k3;->z:Lg40/g3;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v3}, Lg40/g3;->a()Z

    move-result v10

    move-object v12, v1

    check-cast v12, Lp1/q;

    const v4, -0x7ad18f79

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lg40/k3;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v9, v8, :cond_3

    :cond_2
    new-instance v9, Lf1/w1;

    const/16 v8, 0xc

    invoke-direct {v9, v8, v4, v3}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v11, v9

    check-cast v11, Lc93/a;

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    iget-wide v8, v0, Lg40/k3;->E:J

    invoke-static/range {v5 .. v13}, Lse/b;->c(Ljava/lang/String;Ljava/lang/Integer;ZJZLc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_4
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
