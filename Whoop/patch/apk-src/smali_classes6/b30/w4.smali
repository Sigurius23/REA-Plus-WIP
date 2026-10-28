.class public final Lb30/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lb30/w4;->w:I

    iput-boolean p1, p0, Lb30/w4;->x:Z

    iput-boolean p2, p0, Lb30/w4;->y:Z

    iput-object p3, p0, Lb30/w4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/w4;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb30/w4;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    const p1, 0x114e1e09

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    sget-object p1, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {p2, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lf0/v0;

    instance-of p1, v3, Lf0/v0;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    const p1, -0x2e648202

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    const p1, -0x2e627bf8

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object p1

    :cond_1
    check-cast p1, Lj0/i;

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lb30/w4;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Li3/i;

    iget-object p1, p0, Lb30/w4;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v0, Lb2/t;->w:Lb2/t;

    iget-boolean v1, p0, Lb30/w4;->x:Z

    iget-boolean v4, p0, Lb30/w4;->y:Z

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/d;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/u;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string p3, "$this$BadgedBox"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p2, 0x11

    const/16 p2, 0x10

    if-ne p1, p2, :cond_3

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p1, p0, Lb30/w4;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lc93/a;

    iget-object p1, p0, Lb30/w4;->E:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x0

    iget-boolean v0, p0, Lb30/w4;->x:Z

    iget-boolean v1, p0, Lb30/w4;->y:Z

    invoke-static/range {v0 .. v5}, Lb30/a5;->b(ZZLc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
