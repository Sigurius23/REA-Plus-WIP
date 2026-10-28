.class public final synthetic Lsc2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsc2/s;


# direct methods
.method public synthetic constructor <init>(Lsc2/s;I)V
    .locals 0

    iput p2, p0, Lsc2/r;->w:I

    iput-object p1, p0, Lsc2/r;->x:Lsc2/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsc2/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/r;->x:Lsc2/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lsc2/s;->E(Lsc2/s;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lsc2/r;->x:Lsc2/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lsc2/s;->D(Lsc2/s;Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lsc2/r;->x:Lsc2/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lsc2/s;->F(Lsc2/s;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
