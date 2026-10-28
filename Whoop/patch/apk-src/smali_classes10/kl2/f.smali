.class public final synthetic Lkl2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lz1/p;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    iput v0, p0, Lkl2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lkl2/f;->z:Ljava/lang/Object;

    iput p1, p0, Lkl2/f;->y:I

    iput-object p2, p0, Lkl2/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lkl2/f;->w:I

    iput-object p1, p0, Lkl2/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Lkl2/f;->x:Ljava/lang/Object;

    iput p3, p0, Lkl2/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkl2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ljx1/j;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmx1/j;->n(Ljx1/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ljx1/k;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmx1/j;->a(Ljx1/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lj31/d;

    check-cast p2, Lj31/d;

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v2, v1, p1, p2}, Lmn1/c;->e(Lz1/p;ILkotlin/jvm/functions/Function1;Lj31/d;Lj31/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lmk1/e;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmk1/c;->f(Lmk1/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lji2/e;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmi2/c;->e(Lji2/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lji2/c;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmi2/c;->d(Lji2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Ll61/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lm61/b;->a(Landroidx/compose/ui/Modifier;Ll61/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lqt0/b;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/d;->i(Lqt0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lm03/b;->a(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ljz1/c$a;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llz1/b;->b(Ljz1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Llm1/d;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llm1/c;->b(Llm1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ll0/s1;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lgz0/m0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llm1/c;->g(Ll0/s1;Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lld0/f;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llf0/f2;->m(Lld0/f;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ll0/u;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Llf0/x0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llf0/v0;->c(Ll0/u;Llf0/x0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Llf0/h0;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llf0/i0;->d(Llf0/h0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Llf0/u;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llf0/t;->c(Llf0/u;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lld0/b;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Llf0/d;->a(Lld0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ll3/v0;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lkl2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ll1/o4;->a(Ll3/v0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ll1/y;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lm1/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lkl2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ll1/f1;->l(Ll1/y;Lm1/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Ll01/t;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/m;->w(Lkd1/o;Ll01/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lky2/g$f;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lky2/j;->b(Lky2/g$f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ljv2/c$a;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkv2/b;->g(Ljv2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ljv2/c;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkv2/b;->j(Ljv2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Ljv2/c$b;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkv2/b;->n(Ljv2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/r;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkr1/d;->c(Lgr1/r;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/a;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkr1/c;->c(Lgr1/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lim2/c$a;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkm2/b;->a(Lim2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lnl2/c$c;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkl2/k;->m(Lnl2/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lnl2/c$e;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkl2/k;->k(Lnl2/c$e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lkl2/f;->z:Ljava/lang/Object;

    check-cast v0, Lnl2/c$g;

    iget-object v1, p0, Lkl2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lkl2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkl2/k;->t(Lnl2/c$g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
