.class public final synthetic Lat2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Loj2/d;Lp1/c1;)V
    .locals 1

    .line 1
    const/16 v0, 0x11

    iput v0, p0, Lat2/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat2/r;->z:Ljava/lang/Object;

    iput-object p2, p0, Lat2/r;->y:Ljava/lang/Object;

    iput-object p4, p0, Lat2/r;->x:Ljava/lang/Object;

    iput-object p3, p0, Lat2/r;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lhv1/e;Lkotlin/jvm/functions/Function1;Lg1/y3;Lbc3/c0;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lat2/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat2/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lat2/r;->x:Ljava/lang/Object;

    iput-object p3, p0, Lat2/r;->E:Ljava/lang/Object;

    iput-object p4, p0, Lat2/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p5, p0, Lat2/r;->w:I

    iput-object p1, p0, Lat2/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lat2/r;->z:Ljava/lang/Object;

    iput-object p3, p0, Lat2/r;->x:Ljava/lang/Object;

    iput-object p4, p0, Lat2/r;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 4
    iput p5, p0, Lat2/r;->w:I

    iput-object p1, p0, Lat2/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lat2/r;->z:Ljava/lang/Object;

    iput-object p3, p0, Lat2/r;->E:Ljava/lang/Object;

    iput-object p4, p0, Lat2/r;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 5
    iput p5, p0, Lat2/r;->w:I

    iput-object p1, p0, Lat2/r;->y:Ljava/lang/Object;

    iput-object p2, p0, Lat2/r;->x:Ljava/lang/Object;

    iput-object p3, p0, Lat2/r;->z:Ljava/lang/Object;

    iput-object p4, p0, Lat2/r;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lmw0/l;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 6
    const/16 v0, 0xd

    iput v0, p0, Lat2/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat2/r;->x:Ljava/lang/Object;

    iput-object p2, p0, Lat2/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lat2/r;->z:Ljava/lang/Object;

    iput-object p4, p0, Lat2/r;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lat2/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvh0/c;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lqh0/b;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lxh0/c;->c(Lvh0/c;Lqh0/b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/j;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lvp1/h;->e(Ltp1/j;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/c;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lvp1/h;->s(Ltp1/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/c;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lvp1/h;->x(Ltp1/c;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lv01/a;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lv01/c;->h(Lv01/a;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luu2/b0;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Luu2/l;->h(Luu2/b0;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Ltp0/e;->b(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsp0/d;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzr2/a;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Ltp0/b;->d(Lsp0/d;Lzr2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lty2/a;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lry2/e;->i(Lty2/a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lmm1/k;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lrm1/a;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Lc0/i0;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lrm1/m;->g(Landroidx/compose/ui/Modifier;Lmm1/k;Lrm1/a;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lot2/a;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/f$a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lpt2/i;->k(Lot2/a;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/a0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Leb/u0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/fragment/app/r0;

    move-object v5, p1

    check-cast v5, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/a;->a(Ljava/lang/String;Leb/a0;Leb/u0;Landroidx/fragment/app/r0;Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg1/y3;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Loj2/d;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lpj2/i;->O(Lbc3/c0;Lg1/y3;Lp1/c1;Loj2/d;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Loj2/d;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lpj2/i;->F(Lm91/u;Lbc3/c0;Lg1/y3;Loj2/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lpx2/f$a;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lox2/h;->a(Lpx2/f$a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnt1/d;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lot1/c;->h(Lnt1/d;Lbc3/c0;Lg1/y3;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lmw0/l;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Lsz0/q;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lnw0/g;->h(Lkotlin/jvm/functions/Function1;Lmw0/l;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lsz0/q;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Double;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function3;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/Double;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    move-object v5, p1

    check-cast v5, Ll0/v;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Ll81/d;->a(Ljava/lang/Double;Lkotlin/jvm/functions/Function3;Ljava/lang/Double;Lkotlin/jvm/functions/Function3;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll1/w3;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lkf0/h;->b(Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lbc3/c0;Ll1/w3;Lc93/a;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lge2/f;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lhe2/h;->o(Lge2/f;Lbc3/c0;Lg1/y3;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lm91/p;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Lc0/i0;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lf51/d;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Lm91/p;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Leu2/p;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Leu2/o;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Leu2/p;Landroidx/compose/ui/Modifier;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbw1/c$b;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lg1/y3;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Ldw1/f;->b(Lbw1/c$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbw1/c$a;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lg1/y3;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Ldw1/d;->i(Lbw1/c$a;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh91/b;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Lc0/i0;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Ldk2/j;->a(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leb/u0;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/a0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfi0/a;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/t2;

    move-object v5, p1

    check-cast v5, Leb/q;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lcom/whoop/weightlifting/a;->o(Leb/u0;Leb/a0;Lfi0/a;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leb/u0;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/a0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lj02/o0;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/t2;

    move-object v5, p1

    check-cast v5, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lcom/whoop/weightlifting/a;->a(Leb/u0;Leb/a0;Lj02/o0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhv1/e;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/y3;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lbm2/z0;->t(Lhv1/e;Lkotlin/jvm/functions/Function1;Lg1/y3;Lbc3/c0;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leb/a0;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v5, p1

    check-cast v5, Leb/q;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Laz1/n;->m(Leb/a0;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lat2/r;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lys2/e$i;

    iget-object v0, p0, Lat2/r;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lat2/r;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lat2/r;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/f$a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v1 .. v7}, Lat2/w;->j(Lys2/e$i;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lv41/f$a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
