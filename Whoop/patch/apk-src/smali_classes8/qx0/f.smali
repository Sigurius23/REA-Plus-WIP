.class public final synthetic Lqx0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lqx0/i;


# direct methods
.method public synthetic constructor <init>(Lqx0/i;I)V
    .locals 0

    iput p2, p0, Lqx0/f;->w:I

    iput-object p1, p0, Lqx0/f;->x:Lqx0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqx0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqx0/f;->x:Lqx0/i;

    invoke-static {v0}, Lqx0/g;->a(Lqx0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lqx0/f;->x:Lqx0/i;

    invoke-static {v0}, Lqx0/g;->i(Lqx0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lqx0/f;->x:Lqx0/i;

    invoke-static {v0}, Lqx0/g;->b(Lqx0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lqx0/f;->x:Lqx0/i;

    invoke-static {v0}, Lqx0/g;->c(Lqx0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
