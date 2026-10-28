.class public final synthetic Lsx1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lux1/d;


# direct methods
.method public synthetic constructor <init>(Lux1/d;I)V
    .locals 0

    iput p2, p0, Lsx1/h;->w:I

    iput-object p1, p0, Lsx1/h;->x:Lux1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsx1/h;->w:I

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsx1/h;->x:Lux1/d;

    invoke-static {v0, p1, p2, p3}, Lsx1/j;->s(Lux1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsx1/h;->x:Lux1/d;

    invoke-static {v0, p1, p2, p3}, Lsx1/j;->g(Lux1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsx1/h;->x:Lux1/d;

    invoke-static {v0, p1, p2, p3}, Lsx1/j;->n(Lux1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsx1/h;->x:Lux1/d;

    invoke-static {v0, p1, p2, p3}, Lsx1/j;->l(Lux1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
