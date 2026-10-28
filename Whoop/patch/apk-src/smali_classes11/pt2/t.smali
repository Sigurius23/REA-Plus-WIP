.class public final synthetic Lpt2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lot2/m$i;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lot2/m$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lpt2/t;->w:I

    iput-object p1, p0, Lpt2/t;->x:Lot2/m$i;

    iput-object p2, p0, Lpt2/t;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lpt2/t;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpt2/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/t;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/t;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lpt2/t;->x:Lot2/m$i;

    invoke-static {v2, v0, v1}, Lpt2/v;->d(Lot2/m$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpt2/t;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/t;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lpt2/t;->x:Lot2/m$i;

    invoke-static {v2, v0, v1}, Lpt2/v;->N(Lot2/m$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
