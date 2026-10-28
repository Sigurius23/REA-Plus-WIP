.class public final synthetic Lal0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu82/i;


# direct methods
.method public synthetic constructor <init>(Lu82/i;I)V
    .locals 0

    iput p2, p0, Lal0/b;->w:I

    iput-object p1, p0, Lal0/b;->x:Lu82/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lal0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lal0/b;->x:Lu82/i;

    invoke-static {v0}, Lui1/a;->e(Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lal0/b;->x:Lu82/i;

    invoke-static {v0}, Lem2/a;->b(Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lal0/b;->x:Lu82/i;

    invoke-static {v0}, Lal0/j;->m(Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lal0/b;->x:Lu82/i;

    invoke-static {v0}, Lal0/j;->h0(Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lal0/b;->x:Lu82/i;

    invoke-static {v0}, Lal0/j;->B0(Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
