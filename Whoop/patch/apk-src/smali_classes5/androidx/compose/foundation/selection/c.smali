.class public final Landroidx/compose/foundation/selection/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic w:Lf0/v0;

.field public final synthetic x:Lk3/a;

.field public final synthetic y:Z

.field public final synthetic z:Li3/i;


# direct methods
.method public constructor <init>(Lf0/v0;Lk3/a;ZLi3/i;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/selection/c;->w:Lf0/v0;

    iput-object p2, p0, Landroidx/compose/foundation/selection/c;->x:Lk3/a;

    iput-boolean p3, p0, Landroidx/compose/foundation/selection/c;->y:Z

    iput-object p4, p0, Landroidx/compose/foundation/selection/c;->z:Li3/i;

    iput-object p5, p0, Landroidx/compose/foundation/selection/c;->E:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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

    iget-object p3, p0, Landroidx/compose/foundation/selection/c;->w:Lf0/v0;

    invoke-static {p1, v2, p3}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    new-instance v0, Landroidx/compose/foundation/selection/TriStateToggleableElement;

    iget-object v5, p0, Landroidx/compose/foundation/selection/c;->z:Li3/i;

    iget-object v6, p0, Landroidx/compose/foundation/selection/c;->E:Lc93/a;

    iget-object v1, p0, Landroidx/compose/foundation/selection/c;->x:Lk3/a;

    const/4 v3, 0x0

    iget-boolean v4, p0, Landroidx/compose/foundation/selection/c;->y:Z

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/selection/TriStateToggleableElement;-><init>(Lk3/a;Lj0/i;Landroidx/compose/material/d;ZLi3/i;Lc93/a;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method
