.class public final synthetic Lbd1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function3;)V
    .locals 0

    iput p1, p0, Lbd1/i;->w:I

    iput-object p2, p0, Lbd1/i;->x:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbd1/i;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbd1/i;->x:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, p1, p2}, Ldk2/j;->i(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbd1/i;->x:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, p1, p2}, Lbd1/p;->a(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbd1/i;->x:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, p1, p2}, Lbd1/k;->b(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
