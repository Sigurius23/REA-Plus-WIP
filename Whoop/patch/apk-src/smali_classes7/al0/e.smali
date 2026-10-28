.class public final synthetic Lal0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsl0/n0;


# direct methods
.method public synthetic constructor <init>(Lsl0/n0;I)V
    .locals 0

    iput p2, p0, Lal0/e;->w:I

    iput-object p1, p0, Lal0/e;->x:Lsl0/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lal0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->Q(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->X(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->G0(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->U0(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->e(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->n(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lal0/e;->x:Lsl0/n0;

    invoke-static {v0}, Lal0/j;->N0(Lsl0/n0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
