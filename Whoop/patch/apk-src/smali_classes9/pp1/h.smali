.class public final synthetic Lpp1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lnp1/j;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lnp1/j;I)V
    .locals 0

    iput p3, p0, Lpp1/h;->w:I

    iput-object p1, p0, Lpp1/h;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpp1/h;->y:Lnp1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lpp1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp1/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpp1/h;->y:Lnp1/j;

    invoke-static {v0, v1}, Lpp1/i;->u(Lkotlin/jvm/functions/Function1;Lnp1/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpp1/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpp1/h;->y:Lnp1/j;

    invoke-static {v0, v1}, Lpp1/i;->g(Lkotlin/jvm/functions/Function1;Lnp1/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpp1/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpp1/h;->y:Lnp1/j;

    invoke-static {v0, v1}, Lpp1/i;->O(Lkotlin/jvm/functions/Function1;Lnp1/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
