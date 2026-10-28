.class public final synthetic Lty1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsy1/a;


# direct methods
.method public synthetic constructor <init>(Lsy1/a;I)V
    .locals 0

    iput p2, p0, Lty1/h;->w:I

    iput-object p1, p0, Lty1/h;->x:Lsy1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lty1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lty1/h;->x:Lsy1/a;

    check-cast p1, Lty1/j;

    invoke-static {v0, p1}, Lty1/i;->n(Lsy1/a;Lty1/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lty1/h;->x:Lsy1/a;

    check-cast p1, Lty1/j;

    invoke-static {v0, p1}, Lty1/i;->q(Lsy1/a;Lty1/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
