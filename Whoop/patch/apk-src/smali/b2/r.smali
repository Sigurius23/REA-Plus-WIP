.class public final Lb2/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb2/r;->w:I

    iput-object p1, p0, Lb2/r;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Lb2/r;->w:I

    iput-object p1, p0, Lb2/r;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lb2/r;->w:I

    const-string v1, "Content-Length"

    const/4 v2, 0x0

    const-string v3, "values"

    const-string v4, "key"

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, p0, Lb2/r;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "value"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Li63/r;->a:Ljava/util/List;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast v7, Lud3/n0;

    invoke-virtual {v7, p1, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v6

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    move-object/from16 v0, p2

    check-cast v0, Ljava/util/List;

    check-cast v7, Lb2/r;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Li63/r;->a:Ljava/util/List;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "Content-Type"

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Ly53/h;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, p1, v1}, Lb2/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move-object v8, v0

    check-cast v8, Ljava/lang/Iterable;

    const/4 v12, 0x0

    const/16 v13, 0x3e

    const-string v9, ","

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, p1, v0}, Lb2/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    return-object v6

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    move-object/from16 v0, p2

    check-cast v0, Ljava/util/List;

    const-string v1, "name"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lal/a;

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v7, p1, v0}, Lal/a;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    return-object v6

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    move-object/from16 v0, p2

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Li63/z;

    iget-object v1, v7, Li63/z;->i:Li63/x;

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v1, p1, v0}, Lal/a;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    return-object v6

    :pswitch_3
    check-cast p1, Lxf3/c;

    move-object/from16 v0, p2

    check-cast v0, Luf3/a;

    const-string v1, "$this$single"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/content/Context;

    return-object v7

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    check-cast v7, Lgb/q;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result v0

    invoke-static {v7, p1, v0}, Landroidx/room/c1;->a(Lgb/q;Landroidx/compose/runtime/Composer;I)V

    return-object v6

    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    move-object/from16 v0, p2

    check-cast v0, Li3/p;

    check-cast v7, Ld2/d;

    invoke-virtual {v7, p1, v0}, Ld2/d;->l(ILi3/p;)V

    return-object v6

    :pswitch_6
    check-cast p1, Lc0/q0;

    move-object/from16 v0, p2

    check-cast v0, Lc0/q0;

    sget-object v1, Lc0/q0;->y:Lc0/q0;

    if-ne p1, v1, :cond_5

    if-ne v0, v1, :cond_5

    check-cast v7, Lc0/e1;

    check-cast v7, Lc0/f1;

    iget-object p1, v7, Lc0/f1;->c:Lc0/u1;

    iget-boolean p1, p1, Lc0/u1;->e:Z

    if-nez p1, :cond_5

    move v2, v5

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    check-cast v7, Landroidx/compose/ui/platform/ComposeView;

    invoke-static {v5}, Lp1/x;->L(I)I

    move-result v0

    invoke-virtual {v7, p1, v0}, Landroidx/compose/ui/platform/ComposeView;->a(Landroidx/compose/runtime/Composer;I)V

    return-object v6

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/lit8 v1, v0, 0x3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_6

    move v1, v5

    goto :goto_3

    :cond_6
    move v1, v2

    :goto_3
    and-int/2addr v0, v5

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    check-cast v7, Lb3/a;

    invoke-virtual {v7, p1, v2}, Lb3/a;->a(Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    return-object v6

    :pswitch_9
    check-cast p1, Landroidx/compose/ui/Modifier;

    move-object/from16 v0, p2

    check-cast v0, Lb2/u;

    check-cast v7, Landroidx/compose/runtime/Composer;

    instance-of v1, v0, Lb2/p;

    if-eqz v1, :cond_8

    check-cast v0, Lb2/p;

    iget-object v0, v0, Lb2/p;->x:Lkotlin/jvm/functions/Function3;

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v7, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v7, v0}, Lwb3/f;->M(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_8
    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
