.class public final synthetic Lar2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZII)V
    .locals 0

    .line 1
    iput p5, p0, Lar2/f;->w:I

    iput-object p1, p0, Lar2/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Lar2/f;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lar2/f;->x:Z

    iput p4, p0, Lar2/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Lar2/f;->w:I

    iput-object p1, p0, Lar2/f;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lar2/f;->x:Z

    iput-object p3, p0, Lar2/f;->E:Ljava/lang/Object;

    iput p4, p0, Lar2/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p5, p0, Lar2/f;->w:I

    iput-boolean p1, p0, Lar2/f;->x:Z

    iput-object p2, p0, Lar2/f;->z:Ljava/lang/Object;

    iput-object p3, p0, Lar2/f;->E:Ljava/lang/Object;

    iput p4, p0, Lar2/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 1

    .line 4
    const/4 v0, 0x5

    iput v0, p0, Lar2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lar2/f;->x:Z

    iput-object p2, p0, Lar2/f;->E:Ljava/lang/Object;

    iput-object p3, p0, Lar2/f;->z:Ljava/lang/Object;

    iput p4, p0, Lar2/f;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lar2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lr80/e;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lr80/d;->b(Lr80/e;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lqu2/k;->b(ZLc93/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lp21/e;->g(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lar2/f;->E:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lar2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lar2/f;->x:Z

    invoke-static {v2, v0, v1, p1, p2}, Lp00/h;->g(ZLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt11/h;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lno0/i0;->c(Lt11/h;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llf0/a2;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Llf0/z1;->j(Llf0/a2;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lcom/whoop/startactivity/goals/a;->f(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly01/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Liw0/x;->z(ZLjava/util/List;Ly01/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lio2/s;->i(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leh2/a;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lih2/b;->o(Leh2/a;ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhd2/d$b;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lid2/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lid2/t;->f(Lhd2/d$b;ZLid2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhd2/d$b;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lid2/j;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lid2/t;->h(Lhd2/d$b;ZLid2/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh21/e;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lh21/c;->g(Lh21/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lgh0/e;->k(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lar2/f;->E:Ljava/lang/Object;

    check-cast v1, Lg40/d0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lar2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lar2/f;->x:Z

    invoke-static {v0, v1, v2, p1, p2}, Lx43/j;->d(Landroidx/compose/ui/Modifier;Lg40/d0;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfs2/e;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhs2/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v3, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lfs2/e;->d(Lfs2/e;Lhs2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    check-cast v0, Lw3/j;

    iget-object v1, p0, Lar2/f;->E:Ljava/lang/Object;

    check-cast v1, Lf1/s1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lar2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lar2/f;->x:Z

    invoke-static {v2, v0, v1, p1, p2}, Lf1/y0;->h(ZLw3/j;Lf1/s1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lar2/f;->E:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lar2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lar2/f;->x:Z

    invoke-static {v0, v1, v2, p1, p2}, Lf1/y0;->f(Landroidx/compose/ui/Modifier;Lc93/a;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgz0/m0;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v3, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lf01/o1;->i(Lgz0/m0;Lc93/a;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/data/onboarding/FeatureEducationType;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lea2/n;->b(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbe2/a;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lce2/c;->d(Lbe2/a;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lny0/p0;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lc41/f3;->b(Lny0/p0;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc11/i;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lc11/h;->c(Lc11/i;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lav2/e;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lbv2/c;->e(ZLav2/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lbs1/c0;->u(ZLkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbm0/d;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lbm0/r;->a(Lbm0/d;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    check-cast v0, Lb30/y0;

    iget-object v1, p0, Lar2/f;->E:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lar2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lar2/f;->x:Z

    invoke-static {v0, v2, v1, p1, p2}, Luf/c0;->j(Lb30/y0;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    check-cast v0, Lb30/g4;

    iget-object v1, p0, Lar2/f;->E:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lar2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lar2/f;->x:Z

    invoke-static {v0, v2, v1, p1, p2}, Lb30/c4;->c(Lb30/g4;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lb01/j;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lb01/p;->c(Lb01/j;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lar2/f;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lar2/c;

    iget-object v0, p0, Lar2/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lar2/f;->x:Z

    iget v4, p0, Lar2/f;->y:I

    invoke-static/range {v1 .. v6}, Lar2/g;->a(Lar2/c;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
