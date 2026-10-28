.class public final Lo93/i;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lo93/j;


# direct methods
.method public synthetic constructor <init>(Lo93/j;I)V
    .locals 0

    iput p2, p0, Lo93/i;->w:I

    iput-object p1, p0, Lo93/i;->x:Lo93/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo93/i;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lo93/n;->k:Lva3/e;

    iget-object v1, p0, Lo93/i;->x:Lo93/j;

    iget-object v1, v1, Lo93/j;->x:Lva3/h;

    invoke-virtual {v0, v1}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lo93/n;->k:Lva3/e;

    iget-object v1, p0, Lo93/i;->x:Lo93/j;

    iget-object v1, v1, Lo93/j;->w:Lva3/h;

    invoke-virtual {v0, v1}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
