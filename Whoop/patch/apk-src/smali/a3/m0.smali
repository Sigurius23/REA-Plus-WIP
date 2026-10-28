.class public final La3/m0;
.super Lkotlin/jvm/internal/m;
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
    iput p1, p0, La3/m0;->w:I

    iput-object p2, p0, La3/m0;->x:Ljava/lang/Object;

    iput-object p3, p0, La3/m0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Leb/q;Leb/t;Lhb/f;Landroidx/fragment/app/m0;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, La3/m0;->w:I

    .line 2
    iput-object p2, p0, La3/m0;->x:Ljava/lang/Object;

    iput-object p4, p0, La3/m0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, La3/m0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrf3/d;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, La3/p;

    iget-object v2, v0, Lrf3/d;->b:Ljava/lang/Object;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lrf3/d;->a(La3/p;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lrf3/d;->b:Ljava/lang/Object;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Lb3/k;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Leb/t;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/m0;

    iget-object v2, v0, Leb/t;->f:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    invoke-static {}, Lhb/f;->n()Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Marking transition complete for entry "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " due to fragment "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " viewmodel being cleared"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "FragmentNavigator"

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-virtual {v0, v3}, Leb/t;->b(Leb/q;)V

    goto :goto_1

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Lf2/c;

    iget-object v0, v0, Lf2/c;->Q:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Lf2/d;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/x;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Lb3/i3;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Lb3/a;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Lb3/g3;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, Luf3/a;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/k1;

    iget-object v2, v0, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0

    :pswitch_6
    iget-object v0, p0, La3/m0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v1, p0, La3/m0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lb2/v;

    iget v2, v2, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_e

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    :goto_2
    if-eqz v0, :cond_e

    iget v2, v0, Lb2/v;->y:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    move-object v3, v0

    move-object v4, v2

    :goto_3
    if-eqz v3, :cond_d

    instance-of v5, v3, La3/j2;

    const/4 v6, 0x1

    if-eqz v5, :cond_6

    check-cast v3, La3/j2;

    invoke-interface {v3}, La3/j2;->p()Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v5, Li3/l;

    invoke-direct {v5}, Li3/l;-><init>()V

    iput-object v5, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-boolean v6, v5, Li3/l;->z:Z

    :cond_4
    invoke-interface {v3}, La3/j2;->H0()Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Li3/l;

    iput-boolean v6, v5, Li3/l;->y:Z

    :cond_5
    iget-object v5, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Li3/z;

    invoke-interface {v3, v5}, La3/j2;->n(Li3/z;)V

    goto :goto_6

    :cond_6
    iget v5, v3, Lb2/v;->y:I

    and-int/lit8 v5, v5, 0x8

    if-eqz v5, :cond_c

    instance-of v5, v3, La3/o;

    if-eqz v5, :cond_c

    move-object v5, v3

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_4
    if-eqz v5, :cond_b

    iget v8, v5, Lb2/v;->y:I

    and-int/lit8 v8, v8, 0x8

    if-eqz v8, :cond_a

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_7

    move-object v3, v5

    goto :goto_5

    :cond_7
    if-nez v4, :cond_8

    new-instance v4, Lr1/c;

    const/16 v8, 0x10

    new-array v8, v8, [Lb2/v;

    invoke-direct {v4, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {v4, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v3, v2

    :cond_9
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_5
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_b
    if-ne v7, v6, :cond_c

    goto :goto_3

    :cond_c
    :goto_6
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v3

    goto :goto_3

    :cond_d
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_2

    :cond_e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
