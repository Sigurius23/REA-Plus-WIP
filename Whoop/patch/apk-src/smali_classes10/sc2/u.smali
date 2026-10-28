.class public final synthetic Lsc2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp73/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lsc2/u;->w:I

    iput-object p1, p0, Lsc2/u;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsc2/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/u;->x:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lsc2/t;

    invoke-static {v0, p1}, Lsc2/s;->I(Lsc2/t;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lsc2/u;->x:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lsc2/t;

    invoke-static {v0, p1}, Lsc2/s;->B(Lsc2/t;Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lsc2/u;->x:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lsc2/t;

    invoke-static {v0, p1}, Lsc2/s$e;->f(Lsc2/t;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
