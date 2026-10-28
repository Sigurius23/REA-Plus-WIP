.class public final synthetic Lal0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsl0/n0;

.field public final synthetic y:Lvg0/i0;


# direct methods
.method public synthetic constructor <init>(Lsl0/n0;Lvg0/i0;I)V
    .locals 0

    iput p3, p0, Lal0/a;->w:I

    iput-object p1, p0, Lal0/a;->x:Lsl0/n0;

    iput-object p2, p0, Lal0/a;->y:Lvg0/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lal0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lal0/a;->x:Lsl0/n0;

    iget-object v1, p0, Lal0/a;->y:Lvg0/i0;

    invoke-static {v0, v1}, Lal0/j;->u(Lsl0/n0;Lvg0/i0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lal0/a;->x:Lsl0/n0;

    iget-object v1, p0, Lal0/a;->y:Lvg0/i0;

    invoke-static {v0, v1}, Lal0/j;->D0(Lsl0/n0;Lvg0/i0;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
