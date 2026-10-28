.class public final synthetic Lpj2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnj2/p;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lnj2/p;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lpj2/h;->w:I

    iput-object p1, p0, Lpj2/h;->x:Lnj2/p;

    iput-object p2, p0, Lpj2/h;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lpj2/h;->w:I

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/h;->x:Lnj2/p;

    iget-object v1, p0, Lpj2/h;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lpj2/i;->R(Lnj2/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpj2/h;->x:Lnj2/p;

    iget-object v1, p0, Lpj2/h;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lpj2/i;->s(Lnj2/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lpj2/h;->x:Lnj2/p;

    iget-object v1, p0, Lpj2/h;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lpj2/i;->p(Lnj2/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
