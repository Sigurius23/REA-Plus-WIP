.class public final synthetic Lbp0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lbp0/q;->w:I

    iput-object p2, p0, Lbp0/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Lbp0/q;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lbp0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lwm1/k;->c(Ljava/util/ArrayList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Lm91/n;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lvn1/p;->f(Lm91/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Lvn1/q;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lvn1/a;

    invoke-static {v0, v1, p1, p2}, Lum1/d;->h(Lld1/c;Lvn1/q;Ljava/lang/String;Lvn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Lb91/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lly0/e;->b(Lcom/whoop/design/util/TextResource;Lb91/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Ly2/r0;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    check-cast p1, Ly2/v1;

    check-cast p2, Ly3/a;

    new-instance v2, Landroidx/compose/foundation/layout/c;

    iget-wide v3, p2, Ly3/a;->a:J

    invoke-direct {v2, p1, v3, v4}, Landroidx/compose/foundation/layout/c;-><init>(Ly2/v1;J)V

    new-instance v3, Lg1/x0;

    invoke-direct {v3, v1, v2}, Lg1/x0;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/c;)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v4, -0x19bf96da

    invoke-direct {v1, v3, v2, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v2, v1}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v1

    iget-wide v2, p2, Ly3/a;->a:J

    invoke-interface {v0, p1, v1, v2, v3}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Lh0/a;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/d0;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    check-cast v0, Lh0/o;

    invoke-virtual {v0, p1, p2}, Lh0/o;->b(FF)V

    iput p1, v1, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbp0/q;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lbp0/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/z0;

    check-cast p1, Lh2/b;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lbp0/s;->i(Lp1/c1;Lp1/z0;Lh2/b;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
