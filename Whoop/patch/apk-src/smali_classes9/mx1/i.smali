.class public final synthetic Lmx1/i;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lmx1/i;->w:I

    iput-object p1, p0, Lmx1/i;->z:Ljava/lang/Object;

    iput-object p2, p0, Lmx1/i;->x:Ljava/lang/Object;

    iput p3, p0, Lmx1/i;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 1

    .line 2
    const/16 v0, 0x15

    iput v0, p0, Lmx1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx1/i;->x:Ljava/lang/Object;

    iput-object p2, p0, Lmx1/i;->z:Ljava/lang/Object;

    iput p3, p0, Lmx1/i;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Lp0/b0;ILjava/lang/Object;II)V
    .locals 0

    .line 3
    iput p5, p0, Lmx1/i;->w:I

    iput-object p1, p0, Lmx1/i;->z:Ljava/lang/Object;

    iput p2, p0, Lmx1/i;->y:I

    iput-object p3, p0, Lmx1/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lmx1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llf2/g;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lof2/c;->d(Llf2/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llf2/e;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lof2/a;->d(Llf2/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llf2/d;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lof2/a;->c(Llf2/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo90/a;->a(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lj71/b$e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo61/d;->b(Landroidx/compose/ui/Modifier;Lj71/b$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lo52/n;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/g0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo52/e0;->a(Lo52/n;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lj02/u0;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo42/k;->g(Lj02/u0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Ln42/e;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo42/k;->c(Ln42/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v1, p0, Lmx1/i;->z:Ljava/lang/Object;

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lo11/g;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lo0/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v1, p0, Lmx1/i;->y:I

    iget-object v2, p0, Lmx1/i;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, p2}, Lo0/h;->d(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lmw0/d$d;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lnw0/j;->o(Lmw0/d$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lnv1/h;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lnv1/c;->j(Lnv1/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo1/c;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno1/e;->a(Llo1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo1/c$a;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno1/c;->e(Llo1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo0/m0;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/l0;->w(Llo0/m0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo0/b0$b$a;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/z;->e(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo0/y$c;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/w;->i(Llo0/y$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo0/s0;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/w;->u(Llo0/s0;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Llo0/n$c;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/s;->c(Llo0/n$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/i;->b(Lcom/whoop/design/models/modal/BottomSheet;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lnm2/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->D(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lnm1/e;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lnm1/d;->a(Lnm1/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lme2/c$b;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lne2/a;->a(Lme2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lme2/c$a;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lne2/a;->e(Lme2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lme2/c;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lne2/a;->b(Lme2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Ln90/e;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ln90/c;->a(Ln90/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Ln0/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v1, p0, Lmx1/i;->y:I

    iget-object v2, p0, Lmx1/i;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, p2}, Ln0/i;->d(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Lgz0/m0;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Ljx1/x;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmx1/r;->c(Lgz0/m0;Ljx1/x;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Ljx1/f;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmx1/m;->g(Ljx1/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lmx1/i;->z:Ljava/lang/Object;

    check-cast v0, Ljx1/g0;

    iget-object v1, p0, Lmx1/i;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lmx1/i;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmx1/j;->i(Ljx1/g0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
