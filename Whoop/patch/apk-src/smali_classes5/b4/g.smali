.class public final Lb4/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb4/l;La3/n0;Lb4/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb4/g;->w:I

    .line 1
    iput-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb4/g;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb4/g;->y:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lg2/x;Lg2/l;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb4/g;->w:I

    .line 2
    iput-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast p3, Lkotlin/jvm/internal/m;

    iput-object p3, p0, Lb4/g;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lb4/g;->w:I

    iput-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    iput-object p2, p0, Lb4/g;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb4/g;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lb4/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v0, Lmj/b;

    iget-object v1, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v1, Lq0/b;

    iget-object v3, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v3, Lp1/a1;

    const/4 v5, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lmj/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v4, v4, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    const-string v0, "jsContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "globalThis.nudgeActions.determineAction("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/amplitude/quickjs/wrapper/QuickJSObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/amplitude/quickjs/wrapper/QuickJSObject;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->stringify()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->release()V

    :cond_2
    return-object v1

    :pswitch_1
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast p1, Lg/z;

    iget-object v0, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v1, Lh/e;

    invoke-virtual {p1, v0, v1}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    new-instance p1, Lb1/e;

    const/4 v0, 0x5

    invoke-direct {p1, v1, v0}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_2
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast p1, Lz1/p;

    iget-object v0, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v0, Leb/q;

    invoke-virtual {p1, v0}, Lz1/p;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v1, Lgb/q;

    new-instance v2, Lgb/k;

    invoke-direct {v2, v1, v0, p1}, Lgb/k;-><init>(Lgb/q;Leb/q;Lz1/p;)V

    return-object v2

    :pswitch_3
    check-cast p1, Lg2/x;

    iget-object v0, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast v0, Lg2/x;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v0, Lg2/l;

    iget-object v0, v0, Lg2/l;->c:Lg2/x;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/m;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Focus search landed at the root."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    check-cast p1, La3/p2;

    move-object v0, p1

    check-cast v0, Le2/f;

    iget-object v1, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v1, Le2/f;

    invoke-static {v1}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getDragAndDropManager()Le2/c;

    move-result-object v1

    check-cast v1, Le2/a;

    iget-object v1, v1, Le2/a;->b:La0/h;

    invoke-virtual {v1, v0}, La0/h;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v1, Le10/k0;

    invoke-static {v1}, Lio/sentry/config/a;->D(Le10/k0;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Le4/a;->n(Le2/f;J)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, La3/o2;->y:La3/o2;

    goto :goto_2

    :cond_5
    sget-object p1, La3/o2;->w:La3/o2;

    :goto_2
    return-object p1

    :pswitch_5
    check-cast p1, Lc0/q0;

    iget-object v0, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v0, Lc0/c1;

    iget-object v1, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v1, Lc0/e1;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_9

    const/4 v3, 0x1

    if-eq p1, v3, :cond_8

    const/4 v3, 0x2

    if-ne p1, v3, :cond_7

    check-cast v1, Lc0/f1;

    iget-object p1, v1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_6

    iget-wide v0, p1, Lc0/l1;->b:J

    new-instance v2, Li2/e1;

    invoke-direct {v2, v0, v1}, Li2/e1;-><init>(J)V

    goto :goto_3

    :cond_6
    check-cast v0, Lc0/d1;

    iget-object p1, v0, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_b

    iget-wide v0, p1, Lc0/l1;->b:J

    new-instance v2, Li2/e1;

    invoke-direct {v2, v0, v1}, Li2/e1;-><init>(J)V

    goto :goto_3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    iget-object p1, p0, Lb4/g;->x:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Li2/e1;

    goto :goto_3

    :cond_9
    check-cast v0, Lc0/d1;

    iget-object p1, v0, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_a

    iget-wide v0, p1, Lc0/l1;->b:J

    new-instance v2, Li2/e1;

    invoke-direct {v2, v0, v1}, Li2/e1;-><init>(J)V

    goto :goto_3

    :cond_a
    check-cast v1, Lc0/f1;

    iget-object p1, v1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_b

    iget-wide v0, p1, Lc0/l1;->b:J

    new-instance v2, Li2/e1;

    invoke-direct {v2, v0, v1}, Li2/e1;-><init>(J)V

    :cond_b
    :goto_3
    if-eqz v2, :cond_c

    iget-wide v0, v2, Li2/e1;->a:J

    goto :goto_4

    :cond_c
    sget-wide v0, Li2/e1;->b:J

    :goto_4
    new-instance p1, Li2/e1;

    invoke-direct {p1, v0, v1}, Li2/e1;-><init>(J)V

    return-object p1

    :pswitch_6
    check-cast p1, Lk2/e;

    iget-object v0, p0, Lb4/g;->x:Ljava/lang/Object;

    check-cast v0, Lb4/l;

    iget-object v1, p0, Lb4/g;->z:Ljava/lang/Object;

    check-cast v1, La3/n0;

    iget-object v2, p0, Lb4/g;->y:Ljava/lang/Object;

    check-cast v2, Lb4/l;

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object p1

    invoke-virtual {p1}, La3/p;->w()Li2/v;

    move-result-object p1

    invoke-virtual {v0}, Lb4/l;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_f

    const/4 v3, 0x1

    iput-boolean v3, v0, Lb4/l;->a0:Z

    iget-object v1, v1, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    instance-of v3, v1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v3, :cond_d

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_5

    :cond_d
    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_e

    invoke-static {p1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_e
    const/4 p1, 0x0

    iput-boolean p1, v0, Lb4/l;->a0:Z

    :cond_f
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

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
