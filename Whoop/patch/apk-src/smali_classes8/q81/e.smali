.class public final synthetic Lq81/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lm91/u;II)V
    .locals 0

    .line 1
    iput p4, p0, Lq81/e;->w:I

    iput-object p1, p0, Lq81/e;->z:Ljava/lang/Object;

    iput-object p2, p0, Lq81/e;->y:Ljava/lang/Object;

    iput p3, p0, Lq81/e;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lq81/e;->w:I

    iput-object p1, p0, Lq81/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lq81/e;->z:Ljava/lang/Object;

    iput p3, p0, Lq81/e;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lq81/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpo2/c;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lso2/e;->d(Lpo2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpo2/c$b;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lso2/c;->f(Lpo2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lnl0/f;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lsl0/o0;->e(Lnl0/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lnl0/m;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lsl0/i;->c(Lnl0/m;Lp1/c1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lw41/w;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lsg2/p;->f(Lw41/w;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/educationModels/PodcastPlayer;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lse1/a;->d(Lcom/whoop/educationModels/PodcastPlayer;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lqb2/e$b;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lsb2/c;->b(Lqb2/e$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Ls90/h;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Ls90/g;->n(Ls90/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Ls32/a;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Ls32/c;->f(Ls32/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Ly81/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Ls21/g;->a(Lcom/whoop/design/util/TextResource;Ly81/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v1, Ls01/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Ls01/f;->i(Landroidx/compose/ui/Modifier;Ls01/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lty2/a$a;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lry2/f;->d(Lty2/a$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/model/EducationVideoType;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lre1/j;->b(Ljava/lang/String;Lcom/whoop/design/model/EducationVideoType;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/model/FeatureEducationCtaButton;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lre1/j;->s(Lcom/whoop/design/model/FeatureEducationCtaButton;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lr80/f;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lr80/d;->d(Lr80/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lqx0/i;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqx0/g;->e(Lqx0/i;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lqv1/g;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqv1/a;->b(Lqv1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Ll0/y;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lq81/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqu2/h;->j(Ll0/y;Lq81/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpu2/a;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqu2/h;->E(Lpu2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpu2/h$e;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqu2/h;->b(Lpu2/h$e;Lg1/y3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpu2/l;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqu2/h;->v(Lpu2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpu2/m;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqu2/h;->P(Lpu2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v1, Lqt2/c0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqt2/d0;->b(Landroidx/compose/ui/Modifier;Lqt2/c0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v1, Lqt2/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqt2/i;->a(Landroidx/compose/ui/Modifier;Lqt2/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lql2/c;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lql2/a;->i(Lql2/c;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lnj2/u;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqj2/a;->e(Lnj2/u;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Log0/c;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqg0/c;->b(Log0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Log0/c$c;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqg0/b;->b(Log0/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lpd2/d$b;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lqd2/a;->a(Lpd2/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lq81/e;->y:Ljava/lang/Object;

    check-cast v0, Lq81/c;

    iget-object v1, p0, Lq81/e;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lq81/e;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lq81/g;->j(Lq81/c;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
