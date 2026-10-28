.class public final synthetic Lsc2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lsc2/q;->w:I

    iput-object p1, p0, Lsc2/q;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsc2/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/q;->x:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lsc2/t;

    invoke-static {v0, p1}, Lsc2/s;->K(Lsc2/t;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lsc2/q;->x:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lsc2/t;

    invoke-static {v0, p1}, Lsc2/s;->z(Lsc2/t;Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lsc2/q;->x:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lsc2/t;

    invoke-static {v0, p1}, Lsc2/s;->w(Lsc2/t;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
