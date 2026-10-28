.class public final Lg40/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg2/s;

.field public final synthetic F:Ll3/v0;

.field public final synthetic G:Z

.field public final synthetic H:Lg40/p1;

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Lp1/a1;

.field public final synthetic w:Lg40/o1;

.field public final synthetic x:I

.field public final synthetic y:Z

.field public final synthetic z:Lg2/i;


# direct methods
.method public constructor <init>(Lg40/o1;IZLg2/i;Lg2/s;Ll3/v0;ZLg40/p1;Ljava/lang/String;Lp1/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/t1;->w:Lg40/o1;

    iput p2, p0, Lg40/t1;->x:I

    iput-boolean p3, p0, Lg40/t1;->y:Z

    iput-object p4, p0, Lg40/t1;->z:Lg2/i;

    iput-object p5, p0, Lg40/t1;->E:Lg2/s;

    iput-object p6, p0, Lg40/t1;->F:Ll3/v0;

    iput-boolean p7, p0, Lg40/t1;->G:Z

    iput-object p8, p0, Lg40/t1;->H:Lg40/p1;

    iput-object p9, p0, Lg40/t1;->I:Ljava/lang/String;

    iput-object p10, p0, Lg40/t1;->J:Lp1/a1;

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    iget-object v2, v0, Lg40/t1;->w:Lg40/o1;

    iget-object v3, v2, Lg40/o1;->b:Lg40/m1;

    iget-object v3, v3, Lg40/m1;->b:Ljava/util/ArrayList;

    iget v4, v0, Lg40/t1;->x:I

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lec3/f2;

    const/4 v5, 0x0

    invoke-static {v3, v1, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    const/16 v6, 0x38

    int-to-float v6, v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    check-cast v1, Lp1/q;

    const v7, 0x1ab8f9bb

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v4}, Lp1/q;->e(I)Z

    move-result v7

    iget-boolean v8, v0, Lg40/t1;->y:Z

    invoke-virtual {v1, v8}, Lp1/q;->h(Z)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_2

    if-ne v9, v10, :cond_3

    :cond_2
    new-instance v9, Lg40/r1;

    iget-object v7, v0, Lg40/t1;->J:Lp1/a1;

    invoke-direct {v9, v4, v7, v8}, Lg40/r1;-><init>(ILp1/a1;Z)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-static {v6, v9}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, 0x1ab9256c

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v4}, Lp1/q;->e(I)Z

    move-result v7

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    iget-object v8, v0, Lg40/t1;->z:Lg2/i;

    invoke-virtual {v1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_4

    if-ne v9, v10, :cond_5

    :cond_4
    new-instance v9, Lg40/s1;

    invoke-direct {v9, v4, v8, v2, v3}, Lg40/s1;-><init>(ILg2/i;Lg40/o1;Lp1/c1;)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-static {v6, v9}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "OTP-"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, 0x1ab97fb0

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v10, :cond_6

    new-instance v7, Lg1/u4;

    const/16 v8, 0x19

    invoke-direct {v7, v8}, Lg1/u4;-><init>(I)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-static {v6, v5, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, 0x1ab98712

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    if-nez v4, :cond_9

    iget-object v4, v0, Lg40/t1;->E:Lg2/s;

    invoke-static {v6, v4}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lc2/n;->j0:Lc2/n;

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iget-object v13, v2, Lg40/o1;->b:Lg40/m1;

    const v2, 0x1ab9a7f4

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_7

    if-ne v7, v10, :cond_8

    :cond_7
    new-instance v11, La1/e;

    const/16 v17, 0x0

    const/16 v18, 0x1b

    const/4 v12, 0x1

    const-class v14, Lg40/m1;

    const-string v15, "onAutofillDigit"

    const-string v16, "onAutofillDigit(Ljava/lang/String;)V"

    invoke-direct/range {v11 .. v18}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v11

    :cond_8
    check-cast v7, Lj93/g;

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x30

    invoke-static {v4, v6, v7, v1, v2}, Lug/m;->n(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    :cond_9
    move-object v13, v6

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    iget-object v2, v0, Lg40/t1;->I:Ljava/lang/String;

    const/16 v18, 0x0

    iget-boolean v8, v0, Lg40/t1;->y:Z

    iget-object v9, v0, Lg40/t1;->F:Ll3/v0;

    iget-object v10, v0, Lg40/t1;->w:Lg40/o1;

    iget v11, v0, Lg40/t1;->x:I

    iget-object v12, v0, Lg40/t1;->z:Lg2/i;

    iget-boolean v14, v0, Lg40/t1;->G:Z

    iget-object v15, v0, Lg40/t1;->H:Lg40/p1;

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    invoke-static/range {v7 .. v18}, Ldc/a;->h(Ljava/lang/String;ZLl3/v0;Lg40/o1;ILg2/i;Landroidx/compose/ui/Modifier;ZLg40/p1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
