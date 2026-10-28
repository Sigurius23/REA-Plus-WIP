.class public final synthetic Lj22/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p2, p0, Lj22/a;->w:I

    iput-object p1, p0, Lj22/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lj22/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj22/a;->w:I

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj22/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj22/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lj22/e;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lj22/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj22/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2, p3}, Lj22/e;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
