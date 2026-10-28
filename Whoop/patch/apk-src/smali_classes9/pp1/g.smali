.class public final synthetic Lpp1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lg1/y3;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lnp1/j$g;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lg1/y3;I)V
    .locals 0

    iput p5, p0, Lpp1/g;->w:I

    iput-object p1, p0, Lpp1/g;->x:Lbc3/c0;

    iput-object p2, p0, Lpp1/g;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lpp1/g;->z:Lnp1/j$g;

    iput-object p4, p0, Lpp1/g;->E:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lpp1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp1/g;->z:Lnp1/j$g;

    iget-object v1, p0, Lpp1/g;->E:Lg1/y3;

    iget-object v2, p0, Lpp1/g;->x:Lbc3/c0;

    iget-object v3, p0, Lpp1/g;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1}, Lpp1/i;->M(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpp1/g;->z:Lnp1/j$g;

    iget-object v1, p0, Lpp1/g;->E:Lg1/y3;

    iget-object v2, p0, Lpp1/g;->x:Lbc3/c0;

    iget-object v3, p0, Lpp1/g;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1}, Lpp1/i;->s(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpp1/g;->z:Lnp1/j$g;

    iget-object v1, p0, Lpp1/g;->E:Lg1/y3;

    iget-object v2, p0, Lpp1/g;->x:Lbc3/c0;

    iget-object v3, p0, Lpp1/g;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1}, Lpp1/i;->h(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpp1/g;->z:Lnp1/j$g;

    iget-object v1, p0, Lpp1/g;->E:Lg1/y3;

    iget-object v2, p0, Lpp1/g;->x:Lbc3/c0;

    iget-object v3, p0, Lpp1/g;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1}, Lpp1/i;->x(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lg1/y3;)Ll83/a0;

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
