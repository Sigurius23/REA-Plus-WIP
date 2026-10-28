.class public final synthetic Lg1/m3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    iput p7, p0, Lg1/m3;->w:I

    iput-object p1, p0, Lg1/m3;->z:Ljava/lang/Object;

    iput-object p2, p0, Lg1/m3;->E:Ljava/lang/Object;

    iput-object p3, p0, Lg1/m3;->F:Ljava/lang/Object;

    iput-object p4, p0, Lg1/m3;->G:Ljava/lang/Object;

    iput p5, p0, Lg1/m3;->x:I

    iput p6, p0, Lg1/m3;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lg1/m3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/q0;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkr2/f;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lkr2/b;->d(Ld0/q0;Lkr2/f;Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/q0;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkr2/g;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lkr2/b;->i(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkd1/o;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lkm1/b;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkd1/o;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ly81/f;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lkk1/g;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ly81/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lkk1/g;->B(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd0/c$b;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lkf0/f;->t(Lkd0/c$b;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfs2/l;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhs2/e$d;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfs2/m;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Ljs2/f;->d(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhp1/h;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Ljp1/o;->b(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhp1/d;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcp1/d;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Ljp1/g;->j(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Ljh0/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/navigation/e;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Liw0/x;->d0(Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liw0/h0;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Liw0/x;->m(Liw0/h0;Ljava/util/Map;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lis0/y0;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lis0/s0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lis0/x0;->k(Landroidx/compose/ui/Modifier;Lis0/y0;Lkotlin/jvm/functions/Function1;Lis0/s0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lf0/r1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lis0/z;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lim1/f0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lff0/c;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lif0/c;->j(Ljava/lang/String;Lff0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly3/f;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly3/f;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lid2/j;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lid2/n;->b(Ly3/f;Ly3/f;Lid2/j;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li51/s;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Li51/r;->b(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln2/a;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li2/t;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Li31/c;->a(Ln2/a;Ljava/lang/String;Li2/t;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lge1/d;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lhe1/a;->j(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lge1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhb1/n;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Liy1/c;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lhb1/m;->o(Landroidx/compose/ui/Modifier;Lhb1/n;Lkotlin/jvm/functions/Function1;Liy1/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh11/h;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lh11/d;->a(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lb02/a;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lao2/b;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lh02/j;->f(Lb02/a;Lao2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ls2/e;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll0/i;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/m3;->x:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v7, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v7}, Lkotlin/jvm/internal/j;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ls2/e;Ll0/i;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lgz2/g;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lgz2/d;->a(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lef1/c;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lgf1/i;->b(Landroidx/compose/ui/Modifier;Lef1/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li71/h;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg71/a;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lh2/c;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lg71/c;->a(Ljava/util/List;Li71/h;Lg71/a;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg32/l;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v5, p0, Lg1/m3;->x:I

    iget v6, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v8}, Lg32/k;->l(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lg1/m3;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg1/c1;

    iget-object v0, p0, Lg1/m3;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg1/h9;

    iget-object v0, p0, Lg1/m3;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/l5;

    iget-object v0, p0, Lg1/m3;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lx1/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/m3;->x:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v7, p0, Lg1/m3;->y:I

    invoke-static/range {v1 .. v7}, Lio/sentry/config/a;->g(Lg1/c1;Lg1/h9;Lg1/l5;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
