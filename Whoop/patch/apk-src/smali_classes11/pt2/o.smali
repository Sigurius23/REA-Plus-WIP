.class public final synthetic Lpt2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lot2/m$i;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lot2/m$i;Lp1/c1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lpt2/o;->w:I

    iput-object p1, p0, Lpt2/o;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpt2/o;->x:Lot2/m$i;

    iput-object p3, p0, Lpt2/o;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lot2/m$i;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    .line 2
    iput p4, p0, Lpt2/o;->w:I

    iput-object p1, p0, Lpt2/o;->x:Lot2/m$i;

    iput-object p2, p0, Lpt2/o;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lpt2/o;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpt2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/o;->x:Lot2/m$i;

    iget-object v1, p0, Lpt2/o;->z:Lp1/c1;

    iget-object v2, p0, Lpt2/o;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lpt2/v;->m(Lkotlin/jvm/functions/Function1;Lot2/m$i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpt2/o;->x:Lot2/m$i;

    iget-object v1, p0, Lpt2/o;->z:Lp1/c1;

    iget-object v2, p0, Lpt2/o;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lpt2/v;->s(Lkotlin/jvm/functions/Function1;Lot2/m$i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpt2/o;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/o;->z:Lp1/c1;

    iget-object v2, p0, Lpt2/o;->x:Lot2/m$i;

    invoke-static {v0, v2, v1}, Lpt2/v;->z(Lkotlin/jvm/functions/Function1;Lot2/m$i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpt2/o;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/o;->z:Lp1/c1;

    iget-object v2, p0, Lpt2/o;->x:Lot2/m$i;

    invoke-static {v0, v2, v1}, Lpt2/v;->f(Lkotlin/jvm/functions/Function1;Lot2/m$i;Lp1/c1;)Ll83/a0;

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
