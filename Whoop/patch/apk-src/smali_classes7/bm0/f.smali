.class public final synthetic Lbm0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lbm0/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm0/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbm0/f;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbm0/f;->x:Ljava/lang/Object;

    iput-object p4, p0, Lbm0/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lbm0/f;->w:I

    iput-object p1, p0, Lbm0/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbm0/f;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbm0/f;->E:Ljava/lang/Object;

    iput-object p4, p0, Lbm0/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lp1/t2;I)V
    .locals 0

    .line 3
    iput p5, p0, Lbm0/f;->w:I

    iput-object p1, p0, Lbm0/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lbm0/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lbm0/f;->z:Ljava/lang/Object;

    iput-object p4, p0, Lbm0/f;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lbm0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyo0/f;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Ljava/util/List;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lyo0/e;->v(Lyo0/f;Lp1/c1;Lp1/c1;Lc93/a;Lc0/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/a1;

    move-object v5, p1

    check-cast v5, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lrs2/a;->e(Ljava/util/List;Ljava/util/List;Lc93/m;Lp1/a1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lso1/c0;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lso1/b0;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lro1/i;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lyn1/b;

    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Leb/q;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lro1/f;->e(Lso1/c0;Lso1/b0;Lro1/i;Lyn1/b;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Lc0/o;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lqu2/k;->f(Lc93/a;Lp1/c1;Lc93/m;Lp1/c1;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Leb/a0;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/fragment/app/r0;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Leb/q;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lcom/whoop/universalcheckout/features/a;->e(Ljava/lang/String;Leb/a0;Landroidx/fragment/app/r0;Ljava/lang/String;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lz1/p;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhp1/m;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lz1/p;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lz1/p;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Ljp1/u;->i(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/t2;

    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Leb/q;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lcom/whoop/membership/management/navigation/a;->f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/weightlifting/data/domain/FilterOptions;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Set;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    move-object v5, p1

    check-cast v5, Lbm/m;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lev2/u;->G(Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lbm/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ldg2/b;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    move-object v5, p1

    check-cast v5, Lc0/o;

    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Leg2/j;->e(Lkotlin/jvm/functions/Function1;Ldg2/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lbm0/f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, Lbm0/f;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq0/y;

    iget-object v0, p0, Lbm0/f;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbm0/m;

    iget-object v0, p0, Lbm0/f;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Lq0/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v1 .. v8}, Lbm0/l;->d(Lbc3/c0;Lq0/y;Lbm0/m;Lkotlin/jvm/functions/Function1;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
