.class public final Ly2/b0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/Modifier;)V
    .locals 0

    iput p1, p0, Ly2/b0;->w:I

    iput-object p2, p0, Ly2/b0;->x:Landroidx/compose/ui/Modifier;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ly2/b0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/d2;

    iget-object p1, p1, Lp1/d2;->a:Landroidx/compose/runtime/Composer;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    invoke-static {p2}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->hashCode(I)I

    move-result p3

    sget-object v0, Lb2/t;->w:Lb2/t;

    iget-object v1, p0, Ly2/b0;->x:Landroidx/compose/ui/Modifier;

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;

    move-object v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-direct {v0, v2}, Landroidx/compose/ui/CompositionLocalMapInjectionElement;-><init>(Lp1/p1;)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_0
    check-cast p1, Lp1/q;

    const p2, 0x1e65194f

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    sget-object p2, La3/l;->a:La3/k;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v0, p1, Lp1/q;->S:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-static {p3, p1, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lp1/d2;

    iget-object p1, p1, Lp1/d2;->a:Landroidx/compose/runtime/Composer;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-object p3, p2

    check-cast p3, Lp1/q;

    iget-wide v0, p3, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p3

    iget-object v0, p0, Ly2/b0;->x:Landroidx/compose/ui/Modifier;

    invoke-static {p2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    check-cast p1, Lp1/q;

    const v0, 0x1e65194f

    invoke-virtual {p1, v0}, Lp1/q;->f0(I)V

    sget-object v0, La3/l;->a:La3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v0, p1, Lp1/q;->S:Z

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    invoke-static {p3, p1, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
