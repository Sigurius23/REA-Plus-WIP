.class public final synthetic Lj1/h;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Lj1/h;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lj1/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lx1/b;

    invoke-virtual {v0, p1, p2}, Lx1/b;->a(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Lq83/d;

    iget-object p2, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast p2, Lj1/l;

    invoke-virtual {p2}, Lj1/l;->b()Z

    move-result v0

    iget-object v1, p2, Lj1/l;->f:Lp1/g1;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p2}, Lj1/l;->a()F

    move-result v0

    iget-object v3, p2, Lj1/l;->g:Lp1/g1;

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_1

    iget-object v0, p2, Lj1/l;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    iget-object v0, p2, Lj1/l;->a:Lbc3/c0;

    new-instance v3, Lg1/l;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v3, p2, v2, v5, v4}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    const/4 p2, 0x3

    invoke-static {v0, v5, v5, v3, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result p2

    cmpg-float p2, p2, v2

    if-nez p2, :cond_2

    :goto_0
    move p1, v2

    goto :goto_1

    :cond_2
    cmpg-float p2, p1, v2

    if-gez p2, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {v1, v2}, Lp1/g1;->y(F)V

    move v2, p1

    :goto_2
    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, v2}, Ljava/lang/Float;-><init>(F)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
