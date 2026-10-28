.class public final Lg1/f6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/t2;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:Lh0/n1;

.field public final synthetic y:Lj0/i;

.field public final synthetic z:F


# direct methods
.method public constructor <init>(ZLg1/n5;Lj0/i;FZLp1/z0;Lp1/z0;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/f6;->w:Z

    iput-object p2, p0, Lg1/f6;->x:Lh0/n1;

    iput-object p3, p0, Lg1/f6;->y:Lj0/i;

    iput p4, p0, Lg1/f6;->z:F

    iput-boolean p5, p0, Lg1/f6;->E:Z

    iput-object p6, p0, Lg1/f6;->F:Lp1/c1;

    iput-object p7, p0, Lg1/f6;->G:Lp1/t2;

    iput-object p8, p0, Lg1/f6;->H:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p3, 0x73f1d65a

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    iget-boolean p3, p0, Lg1/f6;->w:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    const p3, -0x641fbb22

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p3, v1, :cond_0

    invoke-static {p2}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object p3

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v7, p3

    check-cast v7, Lbc3/c0;

    iget p3, p0, Lg1/f6;->z:F

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-boolean v3, p0, Lg1/f6;->E:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-object v5, p0, Lg1/f6;->x:Lh0/n1;

    iget-object v6, p0, Lg1/f6;->y:Lj0/i;

    filled-new-array {v5, v6, v2, v4}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {p2, v3}, Lp1/q;->h(Z)Z

    move-result v2

    invoke-virtual {p2, p3}, Lp1/q;->d(F)Z

    move-result p3

    or-int/2addr p3, v2

    iget-object v2, p0, Lg1/f6;->F:Lp1/c1;

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    iget-object v2, p0, Lg1/f6;->G:Lp1/t2;

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    invoke-virtual {p2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    invoke-virtual {p2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    iget-object v9, p0, Lg1/f6;->H:Lp1/c1;

    invoke-virtual {p2, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lg1/e6;

    iget-boolean v3, p0, Lg1/f6;->E:Z

    iget v4, p0, Lg1/f6;->z:F

    iget-object v5, p0, Lg1/f6;->F:Lp1/c1;

    iget-object v6, p0, Lg1/f6;->G:Lp1/t2;

    iget-object v8, p0, Lg1/f6;->x:Lh0/n1;

    invoke-direct/range {v2 .. v9}, Lg1/e6;-><init>(ZFLp1/c1;Lp1/t2;Lbc3/c0;Lh0/n1;Lp1/c1;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {p1, v10, v2}, Lu2/c0;->d(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_3
    const p3, -0x640f0d9c

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    return-object p1
.end method
