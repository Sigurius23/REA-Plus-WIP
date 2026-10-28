.class public final synthetic La80/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, La80/f;->w:I

    iput-object p1, p0, La80/f;->y:Ljava/lang/Object;

    iput-object p2, p0, La80/f;->z:Ljava/lang/Object;

    iput-object p3, p0, La80/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La80/f;->w:I

    iput-object p1, p0, La80/f;->y:Ljava/lang/Object;

    iput-object p2, p0, La80/f;->x:Ljava/lang/Object;

    iput-object p3, p0, La80/f;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, La80/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnk1/d;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lnk1/c;->b(Ljava/lang/String;Lnk1/d;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln0/u;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/t2;

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;->y(Ln0/u;Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;Lp1/t2;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Lm91/u;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lm01/d;->d(Lm91/u;Lkotlin/jvm/functions/Function1;Lp1/c1;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Llq2/l;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lin1/d;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lln1/q;->u(Lin1/d;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/c1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    move-object v5, p2

    check-cast v5, Lh2/b;

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-static/range {v1 .. v6}, Lkh0/e;->e(Lp1/c1;Lp1/c1;Lp1/c1;FLh2/b;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lkh0/e;->d(Lkd1/o;Lc93/a;Ljava/lang/String;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzw2/b;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/whooplabs/feature/navigation/b;

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Ljx2/f;->h(Lcom/whoop/data/repositories/FeatureFlagChecker;Lzw2/b;Lcom/whoop/whooplabs/feature/navigation/b;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljg2/b;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Ljg2/c;->b(Ljg2/b;Lp1/c1;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lim1/d0;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lfm1/a;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfm1/c;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lim1/a1;->a(Lim1/d0;Lfm1/a;Lfm1/c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lim1/d0;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc03/c;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lim1/a1;->l(Lim1/d0;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lim1/d0;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfm1/d;

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lim1/c;->a(Ljava/util/List;Lim1/d0;Lfm1/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lji2/l;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lii2/a;->b(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg22/b$c;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v4, p1

    check-cast v4, Ll0/v;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Li22/c;->n(Lg22/b$c;Lc93/m;Lc93/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgv2/d;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lhv2/i;->d(Lgv2/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ldv2/e$b;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lev2/u;->P(Lm91/u;Lkotlin/jvm/functions/Function1;Ldv2/e$b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcp1/h;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lz1/p;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/a1;

    move-object v4, p1

    check-cast v4, Ll0/s0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lep1/i;->c(Lcp1/h;Lz1/p;Lp1/a1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcj1/i$b;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcj1/i$d;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lej1/m;->c(Lcj1/i$b;Lcj1/i$d;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc42/q;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Ld42/p;->r(Lc42/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Leb/u0;

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lcom/whoop/weightlifting/a;->h(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leb/u0;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/a0;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/t2;

    move-object v4, p1

    check-cast v4, Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lcom/whoop/weightlifting/a;->d(Leb/u0;Leb/a0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/presentation/ProfileViewState;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Lc93/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/ProfileScreenKt;->l(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/ProfileScreenContentKt;->l(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lak1/d$b;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lck1/i;->d(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzf0/c$c;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzf0/c;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lbg0/f;->c(Lzf0/c$c;Lzf0/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lze0/c$e;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lbf0/k;->d(Lze0/c$e;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/c1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbd1/w;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbd1/v;

    move-object v4, p1

    check-cast v4, Ll0/s1;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lbd1/v;->c(Lp1/c1;Lbd1/w;Lbd1/v;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, La80/f;->z:Ljava/lang/Object;

    check-cast v1, Le30/c;

    iget-object v2, p0, La80/f;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Landroid/view/LayoutInflater;

    check-cast p2, Landroid/view/ViewGroup;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const-string v3, "inflater"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "parent"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0d0654

    const/4 v4, 0x0

    invoke-virtual {p1, v3, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    if-eqz p3, :cond_0

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    const p2, 0x7f0a0a10

    invoke-static {p1, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    if-eqz p3, :cond_4

    new-instance p2, Lm20/a;

    check-cast p1, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1, p3}, Lm20/a;-><init>(Landroid/widget/FrameLayout;Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V

    invoke-interface {v2, p3}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ld40/p;->e:Ld40/k;

    invoke-static {v0}, Ld40/r;->o(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Le30/c;->w:Lh20/x1;

    iget-object v1, v1, Lh20/x1;->H:Lh20/h1;

    iget-object v1, v1, Lh20/h1;->E:Lh20/y2;

    iget-object v1, v1, Lh20/y2;->x:Lh20/z2;

    iget-object v1, v1, Lh20/z2;->w:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    iget-object v1, v1, Le30/c;->w:Lh20/x1;

    iget-object v1, v1, Lh20/x1;->H:Lh20/h1;

    iget-object v1, v1, Lh20/h1;->E:Lh20/y2;

    iget-object v1, v1, Lh20/y2;->w:Lh20/z2;

    iget-object v1, v1, Lh20/z2;->w:Ljava/lang/Integer;

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    sget-object v1, Ld40/p;->e:Ld40/k;

    invoke-static {v1, v0}, Ld40/r;->c(Ld40/k;Landroid/content/Context;)I

    move-result v0

    :goto_1
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    const-string v1, "primaryButtonStyle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Ld40/k;->c:Ld40/j;

    iget v4, v3, Ld40/j;->a:F

    invoke-static {v1, v4}, Ld40/r;->b(Landroid/content/Context;F)F

    move-result v1

    iput v1, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->J:F

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v4, v3, Ld40/j;->b:F

    invoke-static {v1, v4}, Ld40/r;->b(Landroid/content/Context;F)F

    move-result v1

    iput v1, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->K:F

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ld40/r;->e(Ld40/k;Landroid/content/Context;)I

    move-result v1

    iput v1, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->L:I

    iget-object v1, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->G:Lm20/b;

    iget-object v1, v1, Lm20/b;->e:Landroid/widget/ImageView;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4}, Ld40/r;->h(Ld40/k;Landroid/content/Context;)I

    move-result v4

    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iput-object v0, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->w:Landroid/content/res/ColorStateList;

    invoke-virtual {p3, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Ld40/r;->n(Ld40/k;Landroid/content/Context;)I

    move-result v0

    iput v0, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->M:I

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Ld40/r;->i(Ld40/k;Landroid/content/Context;)I

    move-result p1

    iput p1, p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->N:I

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v3, Ld40/j;->c:F

    invoke-static {p3, v0}, Ld40/r;->b(Landroid/content/Context;F)F

    move-result p3

    float-to-int p3, p3

    iput p3, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_3
    return-object p2

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string p3, "Missing required view with ID: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_1b
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lys2/e;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lat2/m;->o(Lys2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, La80/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly70/c$c;

    iget-object v0, p0, La80/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly70/c;

    iget-object v0, p0, La80/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, La80/h;->b(Ly70/c$c;Ly70/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

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
