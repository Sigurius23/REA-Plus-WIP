.class public final synthetic Lj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Lgz0/m0;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x1c

    iput v0, p0, Lj;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lj;->z:Ljava/lang/Object;

    iput-object p3, p0, Lj;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj;->E:Ljava/lang/Object;

    iput p1, p0, Lj;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lp1/t1;Lx1/b;I)V
    .locals 1

    .line 2
    const/4 v0, 0x4

    iput v0, p0, Lj;->w:I

    sget-object v0, Lz0/h;->a:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj;->z:Ljava/lang/Object;

    iput-object p3, p0, Lj;->E:Ljava/lang/Object;

    iput p4, p0, Lj;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILp1/c1;)V
    .locals 1

    .line 3
    const/16 v0, 0x16

    iput v0, p0, Lj;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj;->z:Ljava/lang/Object;

    iput p3, p0, Lj;->x:I

    iput-object p4, p0, Lj;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 4
    iput p5, p0, Lj;->w:I

    iput-object p1, p0, Lj;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj;->z:Ljava/lang/Object;

    iput-object p3, p0, Lj;->E:Ljava/lang/Object;

    iput p4, p0, Lj;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lc93/a;Ljava/lang/Object;II)V
    .locals 0

    .line 5
    iput p5, p0, Lj;->w:I

    iput-object p1, p0, Lj;->z:Ljava/lang/Object;

    iput-object p2, p0, Lj;->E:Ljava/lang/Object;

    iput-object p3, p0, Lj;->y:Ljava/lang/Object;

    iput p4, p0, Lj;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ln0/u;ILjava/lang/String;Lc93/a;I)V
    .locals 0

    .line 6
    const/4 p5, 0x0

    iput p5, p0, Lj;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj;->y:Ljava/lang/Object;

    iput p2, p0, Lj;->x:I

    iput-object p3, p0, Lj;->z:Ljava/lang/Object;

    iput-object p4, p0, Lj;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 7
    const/16 v0, 0xb

    iput v0, p0, Lj;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj;->E:Ljava/lang/Object;

    iput-object p3, p0, Lj;->z:Ljava/lang/Object;

    iput p4, p0, Lj;->x:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lj;->w:I

    iget v1, p0, Lj;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    iget-object v4, p0, Lj;->E:Ljava/lang/Object;

    iget-object v5, p0, Lj;->z:Ljava/lang/Object;

    iget-object v6, p0, Lj;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    move-object v7, v6

    check-cast v7, Ljava/util/List;

    move-object v8, v5

    check-cast v8, Lkotlin/jvm/functions/Function3;

    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function3;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget v10, p0, Lj;->x:I

    invoke-static/range {v7 .. v12}, Lcp0/p;->n(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v0, v5

    check-cast v0, Ljava/lang/String;

    move-object v1, v6

    check-cast v1, Lgz0/m0;

    move-object v2, v4

    check-cast v2, Lc93/a;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->d(Ljava/lang/String;Lgz0/m0;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v0, v5

    check-cast v0, Ljava/lang/String;

    move-object v1, v4

    check-cast v1, Lc93/a;

    move-object v2, v6

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->d(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v0, v6

    check-cast v0, Lak1/d$b;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lck1/i;->e(Lak1/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v0, v6

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v1, v5

    check-cast v1, Lai0/c$c;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lci0/d;->c(Lkotlin/jvm/functions/Function1;Lai0/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    move-object v0, v6

    check-cast v0, Lc51/s;

    move-object v1, v5

    check-cast v1, Li2/s0;

    move-object v2, v4

    check-cast v2, Li2/t;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lc51/k;->p(Lc51/s;Li2/s0;Li2/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    move-object v0, v6

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v1, v5

    check-cast v1, Lc41/i1;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lc41/b1;->h(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    move-object v0, v6

    check-cast v0, Lcom/whoop/design/util/TextResource;

    move-object v1, v5

    check-cast v1, Lcom/whoop/design/util/TextResource;

    move-object v3, v4

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v2, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lc41/b;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lm91/p;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lc11/h;->a(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lm91/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    move-object v0, v6

    check-cast v0, Lyx1/f;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lby1/g;->b(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    move-object v0, v6

    check-cast v0, Lds1/c;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lc93/a;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbs1/c0;->n(Lds1/c;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    move-object v1, v5

    check-cast v1, Lg2/i;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbs1/c0;->q0(Ljava/util/List;Lg2/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    move-object v0, v6

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v1, v5

    check-cast v1, Lds1/k;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbs1/c0;->O(Landroidx/compose/ui/Modifier;Lds1/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    move-object v0, v6

    check-cast v0, Lcom/whoop/design/util/TextResource;

    move-object v1, v5

    check-cast v1, Lkd1/o;

    move-object v2, v4

    check-cast v2, Lb91/a;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbr2/h;->b(Lcom/whoop/design/util/TextResource;Lkd1/o;Lb91/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    move-object v0, v6

    check-cast v0, Lbm2/u0;

    move-object v1, v5

    check-cast v1, Lul2/b;

    move-object v2, v4

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbm2/k1;->h(Lbm2/u0;Lul2/b;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    move-object v0, v6

    check-cast v0, Lhv1/f;

    move-object v1, v5

    check-cast v1, Ljava/util/List;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbm2/z0;->k(Lhv1/f;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    move-object v0, v6

    check-cast v0, Lzf0/c$e;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lzf0/c$d;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbg0/g;->g(Lzf0/c$e;Lkotlin/jvm/functions/Function1;Lzf0/c$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    move-object v0, v6

    check-cast v0, Ll0/u;

    move-object v1, v5

    check-cast v1, Lzf0/c$b;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbg0/d;->a(Ll0/u;Lzf0/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    move-object v0, v6

    check-cast v0, Lze0/c$e$c;

    move-object v1, v4

    check-cast v1, Lc93/a;

    move-object v2, v5

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbf0/b;->e(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    move-object v0, v6

    check-cast v0, Lzd1/d$a;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbe1/g;->y(Lzd1/d$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    move-object v0, v6

    check-cast v0, Lzd1/d$e;

    move-object v1, v5

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lbe1/g;->o(Lzd1/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    move-object v0, v6

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v1, v5

    check-cast v1, Lb41/f;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, Lb41/d;->c(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast v6, Lkotlin/jvm/functions/Function3;

    check-cast v5, Landroidx/compose/ui/Modifier;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lb4/n;->a(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    :pswitch_16
    check-cast v6, Lb30/q0;

    check-cast v5, Lr20/n;

    check-cast v4, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lb30/o5;->g(Lb30/q0;Lr20/n;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    :pswitch_17
    check-cast v5, Ljava/lang/String;

    check-cast v4, Lc93/a;

    check-cast v6, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v5, v4, v6, p1, p2}, Lb30/a5;->a(Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    :pswitch_18
    check-cast v6, Landroidx/compose/ui/Modifier;

    check-cast v5, Lp1/t1;

    sget-object v0, Lz0/h;->a:Lx1/b;

    check-cast v4, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lup/d;->g(Landroidx/compose/ui/Modifier;Lp1/t1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    :pswitch_19
    move-object v7, v6

    check-cast v7, Lbm2/i0;

    move-object v8, v5

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget v10, p0, Lj;->x:I

    invoke-static/range {v7 .. v12}, Lam2/o0;->k(Lbm2/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    move-object v0, v6

    check-cast v0, Ly70/a$k;

    move-object v1, v5

    check-cast v1, Lx70/c;

    move-object v2, v4

    check-cast v2, Lx70/a;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, La80/m;->c(Ly70/a$k;Lx70/c;Lx70/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    move-object v0, v6

    check-cast v0, Ll0/u;

    move-object v1, v5

    check-cast v1, Ly70/c$b;

    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v3, p0, Lj;->x:I

    invoke-static/range {v0 .. v5}, La80/e;->a(Ll0/u;Ly70/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v6, Ln0/u;

    check-cast v5, Ljava/lang/String;

    check-cast v4, Lc93/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lp1/x;->L(I)I

    move-result v8

    move-object v3, v6

    move-object v6, v4

    iget v4, p0, Lj;->x:I

    invoke-static/range {v3 .. v8}, Lx;->f(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object v2

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
