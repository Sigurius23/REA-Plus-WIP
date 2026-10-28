.class public final synthetic Lpf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzt/q;


# direct methods
.method public synthetic constructor <init>(Lzt/q;I)V
    .locals 0

    iput p2, p0, Lpf/j;->w:I

    iput-object p1, p0, Lpf/j;->x:Lzt/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpf/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpf/j;->x:Lzt/q;

    iget-object v0, v0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/i;

    new-instance v1, Lp6/h1;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lp6/h1;-><init>(I)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpf/a;

    invoke-static {v0}, Lds/q;->C(Lpf/a;)Lpf/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpf/j;->x:Lzt/q;

    iget-object v0, v0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/i;

    new-instance v1, Lp6/h1;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lp6/h1;-><init>(I)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpf/a;

    invoke-static {v0}, Lds/q;->C(Lpf/a;)Lpf/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
