.class public final synthetic Lb01/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb01/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lb10/z0;)V
    .locals 0

    .line 2
    const/16 p1, 0xd

    iput p1, p0, Lb01/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lb01/f;->w:I

    const-string v1, "$this$semantics"

    const-string v2, "it"

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lb72/b;->d(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, Lb70/d;->j(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1}, Lb70/d;->d(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lec/a;

    return-object v3

    :pswitch_3
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lb31/b;->d(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lb31/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lb30/c6;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lb30/c6;->b:Lb30/d6;

    return-object p1

    :pswitch_6
    check-cast p1, Lh20/t0;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lh20/r0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh20/r0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lh20/r0;->c:Ly00/o4;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ly00/o4;->w:Ljava/lang/String;

    :cond_1
    invoke-virtual {p1}, Lh20/t0;->a()Lh20/s0;

    move-result-object p1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "-"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    return-object p1

    :pswitch_8
    check-cast p1, Lc0/q;

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lb30/c4;->a:Lc0/l0;

    return-object p1

    :pswitch_9
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->o:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v3

    :pswitch_a
    check-cast p1, Lb30/a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    :pswitch_b
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p1, v0}, Li3/w;->f(Li3/z;I)V

    return-object v3

    :pswitch_c
    check-cast p1, Lr20/s;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lr20/o;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    :pswitch_e
    check-cast p1, Lb11/j$a;

    invoke-static {p1}, Lb11/a;->a(Lb11/j$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ll83/n;

    return-object v3

    :pswitch_10
    check-cast p1, Ll83/n;

    return-object v3

    :pswitch_11
    invoke-static {p1}, Lb03/d;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lb02/f;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;

    invoke-static {p1}, Lb02/b;->f(Lcom/whoop/nativestore/pdp/domain/model/ProductImageGalleryModel;)Lh02/c0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/items/TagSelectorModel;

    invoke-static {p1}, Lb02/b;->g(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/design/models/items/ItemsCardModel;

    invoke-static {p1}, Lb02/b;->b(Lcom/whoop/design/models/items/ItemsCardModel;)Lv71/i;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lb02/b;->d(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lb02/b;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lb02/b;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lb02/b;->e(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lb01/p;->n(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lb01/p;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lb01/h;->c(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

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
