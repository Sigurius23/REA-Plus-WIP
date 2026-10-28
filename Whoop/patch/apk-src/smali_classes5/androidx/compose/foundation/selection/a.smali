.class public final Landroidx/compose/foundation/selection/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Li3/i;

.field public final synthetic F:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Lf0/v0;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lf0/v0;ZZLi3/i;Ll83/e;I)V
    .locals 0

    iput p6, p0, Landroidx/compose/foundation/selection/a;->w:I

    iput-object p1, p0, Landroidx/compose/foundation/selection/a;->x:Lf0/v0;

    iput-boolean p2, p0, Landroidx/compose/foundation/selection/a;->y:Z

    iput-boolean p3, p0, Landroidx/compose/foundation/selection/a;->z:Z

    iput-object p4, p0, Landroidx/compose/foundation/selection/a;->E:Li3/i;

    iput-object p5, p0, Landroidx/compose/foundation/selection/a;->F:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Landroidx/compose/foundation/selection/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p1, -0x5af0b3b9

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p1, p3, :cond_0

    invoke-static {p2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object p1

    :cond_0
    move-object v2, p1

    check-cast v2, Lj0/i;

    sget-object p1, Lb2/t;->w:Lb2/t;

    iget-object p3, p0, Landroidx/compose/foundation/selection/a;->x:Lf0/v0;

    invoke-static {p1, v2, p3}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    new-instance v0, Landroidx/compose/foundation/selection/ToggleableElement;

    iget-object p3, p0, Landroidx/compose/foundation/selection/a;->F:Ll83/e;

    move-object v7, p3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/a;->y:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-boolean v5, p0, Landroidx/compose/foundation/selection/a;->z:Z

    iget-object v6, p0, Landroidx/compose/foundation/selection/a;->E:Li3/i;

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/ToggleableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p1, -0x5af0b3b9

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p1, p3, :cond_1

    invoke-static {p2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object p1

    :cond_1
    move-object v2, p1

    check-cast v2, Lj0/i;

    sget-object p1, Lb2/t;->w:Lb2/t;

    iget-object p3, p0, Landroidx/compose/foundation/selection/a;->x:Lf0/v0;

    invoke-static {p1, v2, p3}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    new-instance v0, Landroidx/compose/foundation/selection/SelectableElement;

    iget-object p3, p0, Landroidx/compose/foundation/selection/a;->F:Ll83/e;

    move-object v7, p3

    check-cast v7, Lc93/a;

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/a;->y:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-boolean v5, p0, Landroidx/compose/foundation/selection/a;->z:Z

    iget-object v6, p0, Landroidx/compose/foundation/selection/a;->E:Li3/i;

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lc93/a;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
