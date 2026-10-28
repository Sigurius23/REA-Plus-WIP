.class public final synthetic Lmi2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lmi2/o;->w:I

    iput-object p2, p0, Lmi2/o;->x:Ljava/lang/Object;

    iput-object p3, p0, Lmi2/o;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lmi2/o;->w:I

    iput-object p1, p0, Lmi2/o;->y:Ljava/lang/Object;

    iput-object p2, p0, Lmi2/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lmi2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lov2/a;

    invoke-static {v0, v1}, Lov2/d;->d(Lkotlin/jvm/functions/Function1;Lov2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lhq1/f;

    invoke-static {v0, v1}, Loq1/d;->n(Lkotlin/jvm/functions/Function1;Lhq1/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Llf2/j;

    invoke-static {v0, v1}, Lof2/e;->a(Lkotlin/jvm/functions/Function1;Llf2/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Llf2/a;

    invoke-static {v0, v1}, Lof2/e;->c(Lkotlin/jvm/functions/Function1;Llf2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Llf2/e;

    invoke-static {v0, v1}, Lof2/a;->a(Lkotlin/jvm/functions/Function1;Llf2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v0, Lm72/c;

    iget-object v1, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lo72/b;->d(Lm72/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lj42/a;

    invoke-static {v0, v1}, Lo42/k;->y(Lkotlin/jvm/functions/Function1;Lj42/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Ln42/b;

    invoke-static {v0, v1}, Lo42/c;->a(Lkotlin/jvm/functions/Function1;Ln42/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->d(Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;Landroid/content/Context;)Lth/h;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lo11/m$d$b;

    invoke-static {v0, v1}, Lo11/m$d$b;->C(Lkotlin/jvm/functions/Function1;Lo11/m$d$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lo11/m$c$c;

    invoke-static {v0, v1}, Lo11/m$c$c;->G(Lkotlin/jvm/functions/Function1;Lo11/m$c$c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lo11/m$c$b;

    invoke-static {v0, v1}, Lo11/m$c$b;->G(Lkotlin/jvm/functions/Function1;Lo11/m$c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lo11/m$c$a;

    invoke-static {v0, v1}, Lo11/m$c$a;->H(Lkotlin/jvm/functions/Function1;Lo11/m$c$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lo01/c;

    invoke-static {v0, v1}, Lo01/a;->a(Lkotlin/jvm/functions/Function1;Lo01/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lp1/f0;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lo0/y;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/g;

    new-instance v2, Lab/h0;

    iget-object v3, v1, Lo0/y;->d:Lc33/c;

    iget-object v3, v3, Lc33/c;->e:Ljava/lang/Object;

    check-cast v3, Lp0/f0;

    invoke-virtual {v3}, Lp0/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li93/j;

    invoke-direct {v2, v3, v0}, Lab/h0;-><init>(Li93/j;Lp0/y;)V

    new-instance v3, Lo0/h;

    invoke-direct {v3, v1, v0, v2}, Lo0/h;-><init>(Lo0/y;Lo0/g;Lab/h0;)V

    return-object v3

    :pswitch_e
    iget-object v0, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v0, Lny0/p0;

    iget-object v1, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lny0/i0;->c(Lny0/p0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lny0/l;

    invoke-static {v0, v1}, Lny0/j;->b(Lkotlin/jvm/functions/Function1;Lny0/l;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/membership/management/navigation/b;

    invoke-static {v0, v1}, Lnx1/b;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lmw0/i$b;

    invoke-static {v0, v1}, Lnw0/o;->f(Lkotlin/jvm/functions/Function1;Lmw0/i$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkc2/i;

    invoke-static {v0, v1}, Lnr2/a;->b(Lkotlin/jvm/functions/Function1;Lkc2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lnm1/e;

    invoke-static {v0, v1}, Lnm1/d;->b(Lkotlin/jvm/functions/Function1;Lnm1/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Ln81/f;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Ln81/c;->c(Ln81/f;Lp1/c1;)Lm91/u;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Ljx1/v;

    invoke-static {v0, v1}, Lmx1/p;->c(Lkotlin/jvm/functions/Function1;Ljx1/v;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Ljx1/j;

    invoke-static {v0, v1}, Lmx1/j;->e(Lkotlin/jvm/functions/Function1;Ljx1/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Ljx1/k;

    invoke-static {v0, v1}, Lmx1/j;->o(Lkotlin/jvm/functions/Function1;Ljx1/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Ljx1/i;

    invoke-static {v0, v1}, Lmx1/b;->b(Lkotlin/jvm/functions/Function1;Ljx1/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    invoke-static {v0, v1}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->z(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Leb/u0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lmm1/f;

    invoke-static {v0, v1}, Lmm1/e;->c(Lkotlin/jvm/functions/Function1;Lmm1/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lmm1/c;

    invoke-static {v0, v1}, Lmm1/b;->c(Lkotlin/jvm/functions/Function1;Lmm1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lmi2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmi2/o;->y:Ljava/lang/Object;

    check-cast v1, Lji2/g;

    invoke-static {v0, v1}, Lmi2/p;->d(Lkotlin/jvm/functions/Function1;Lji2/g;)Ll83/a0;

    move-result-object v0

    return-object v0

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
