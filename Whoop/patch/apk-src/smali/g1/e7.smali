.class public final synthetic Lg1/e7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lg1/e7;->w:I

    iput-object p1, p0, Lg1/e7;->x:Ljava/lang/Object;

    iput-object p2, p0, Lg1/e7;->y:Ljava/lang/Object;

    iput-object p3, p0, Lg1/e7;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lg1/e7;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/e7;->x:Ljava/lang/Object;

    check-cast v0, Lp31/c;

    iget-object v1, p0, Lg1/e7;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lg1/e7;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lp31/f;->l(Lp31/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/e7;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/e7;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lg1/e7;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Ljs1/g;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg1/e7;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lg1/e7;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget-object v2, p0, Lg1/e7;->z:Ljava/lang/Object;

    check-cast v2, Ly3/c;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-static {p1, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/g9;

    invoke-interface {p1, v3, v4, v2}, Lg1/g9;->a(FFLy3/c;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
