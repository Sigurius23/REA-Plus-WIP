.class public final synthetic Lsx1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lux1/d;

.field public final synthetic y:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lux1/d;Lc93/m;I)V
    .locals 0

    iput p3, p0, Lsx1/i;->w:I

    iput-object p1, p0, Lsx1/i;->x:Lux1/d;

    iput-object p2, p0, Lsx1/i;->y:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsx1/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lsx1/i;->x:Lux1/d;

    iget-object v1, p0, Lsx1/i;->y:Lc93/m;

    invoke-static {v0, v1, p1, p2, p3}, Lsx1/j;->j(Lux1/d;Lc93/m;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lsx1/i;->x:Lux1/d;

    iget-object v1, p0, Lsx1/i;->y:Lc93/m;

    invoke-static {v0, v1, p1, p2, p3}, Lsx1/j;->a(Lux1/d;Lc93/m;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
