.class public final Lb30/j5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lb30/j5;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/j5;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/j5;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/j5;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lb30/j5;->w:I

    iput-object p1, p0, Lb30/j5;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/j5;->x:Z

    iput-object p3, p0, Lb30/j5;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZLg40/e;Lcom/stripe/android/uicore/elements/IdentifierSpec;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb30/j5;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/j5;->x:Z

    iput-object p2, p0, Lb30/j5;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb30/j5;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lb30/j5;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lb30/j5;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    and-int/lit8 p2, p2, 0x3

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p2, Lb2/t;->w:Lb2/t;

    const-string v1, "simple_dialog_confirm_button"

    invoke-static {p2, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v10, p1

    check-cast v10, Lp1/q;

    const p1, -0x6b85ea98

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_2

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_3

    :cond_2
    new-instance p2, Lry2/g;

    const/16 p1, 0x1b

    invoke-direct {p2, v0, p1}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v10, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p2

    check-cast v2, Lc93/a;

    const/4 p1, 0x0

    invoke-virtual {v10, p1}, Lp1/q;->q(Z)V

    new-instance p1, Lh00/q0;

    iget-object p2, p0, Lb30/j5;->z:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-boolean v0, p0, Lb30/j5;->x:Z

    const/4 v1, 0x2

    invoke-direct {p1, p2, v0, v1}, Lh00/q0;-><init>(Ljava/lang/String;ZI)V

    const p2, 0x76f81510

    invoke-static {p2, v10, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const v11, 0x30000030

    const/16 v12, 0x1fc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_5

    move-object p1, v10

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_2
    iget-object p1, p0, Lb30/j5;->y:Ljava/lang/Object;

    check-cast p1, Lx30/k;

    iget-object p2, p1, Lx30/k;->c:Lg40/c3;

    iget-object v0, p2, Lg40/c3;->c:Lg40/m3;

    iget-object p2, p0, Lb30/j5;->z:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object p1, p1, Lx30/k;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x7

    :goto_3
    move v2, p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x6

    goto :goto_3

    :goto_4
    const/4 v11, 0x0

    const/16 v12, 0x3f8

    iget-boolean v1, p0, Lb30/j5;->x:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v12}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_8

    move-object p1, v10

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_9

    :cond_8
    :goto_6
    iget-object p1, p0, Lb30/j5;->y:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lg40/m3;

    iget-object p1, p0, Lb30/j5;->z:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    sget-object p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x7

    :goto_7
    move v2, p1

    goto :goto_8

    :cond_9
    const/4 p1, 0x6

    goto :goto_7

    :goto_8
    const/4 v11, 0x0

    const/16 v12, 0x3f8

    iget-boolean v1, p0, Lb30/j5;->x:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v12}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_b

    move-object p1, v5

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_b

    :cond_b
    :goto_a
    iget-object p1, p0, Lb30/j5;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lg40/e;

    iget-object p1, p0, Lb30/j5;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    sget p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 p1, p1, 0x9

    const/16 p2, 0x1c0

    or-int v6, p2, p1

    const/16 v7, 0x10

    iget-boolean v0, p0, Lb30/j5;->x:Z

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lv8/b;->b(ZLg40/e;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_d

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_d

    :cond_d
    :goto_c
    iget-object p2, p0, Lb30/j5;->y:Ljava/lang/Object;

    check-cast p2, Lx1/b;

    iget-boolean v0, p0, Lb30/j5;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lb30/j5;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v0, v1, p1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_d
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_f

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_f

    :cond_f
    :goto_e
    iget-object p2, p0, Lb30/j5;->y:Ljava/lang/Object;

    check-cast p2, Lg40/r3;

    iget-object v0, p0, Lb30/j5;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lb30/j5;->x:Z

    invoke-static {p2, v2, v0, p1, v1}, Lg40/j4;->b(Lg40/r3;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_11

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_10

    :cond_10
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_12

    :cond_11
    :goto_10
    iget-object p2, p0, Lb30/j5;->y:Ljava/lang/Object;

    check-cast p2, Lx30/f0;

    iget-object v0, p2, Lx30/f0;->c:Lx30/e0;

    iget-boolean v1, p0, Lb30/j5;->x:Z

    xor-int/lit8 v1, v1, 0x1

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, p0, Lb30/j5;->z:Ljava/lang/Object;

    check-cast v3, Lg2/s;

    invoke-static {v2, v3}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v2, v2, 0x9

    const v4, 0x46c40

    or-int/2addr v2, v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "modifier"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, p1

    check-cast v10, Lp1/q;

    const p1, -0x1a4f70e9

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-interface {p2}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    const/4 p1, 0x7

    goto :goto_11

    :cond_12
    const/4 p1, 0x6

    :goto_11
    shr-int/lit8 p2, v2, 0xf

    and-int/lit8 p2, p2, 0xe

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v4, v2, 0x70

    or-int/2addr p2, v4

    and-int/lit16 v2, v2, 0x1c00

    or-int v11, p2, v2

    const/16 v12, 0x3f0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v2, p1

    invoke-static/range {v0 .. v12}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x0

    invoke-virtual {v10, p1}, Lp1/q;->q(Z)V

    :goto_12
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
