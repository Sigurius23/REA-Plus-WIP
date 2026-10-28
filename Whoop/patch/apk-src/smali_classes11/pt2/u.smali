.class public final synthetic Lpt2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lot2/m;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lot2/m;I)V
    .locals 0

    iput p3, p0, Lpt2/u;->w:I

    iput-object p1, p0, Lpt2/u;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpt2/u;->y:Lot2/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lpt2/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/u;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/u;->y:Lot2/m;

    invoke-static {v0, v1, p1}, Lpt2/v;->c(Lkotlin/jvm/functions/Function1;Lot2/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpt2/u;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/u;->y:Lot2/m;

    invoke-static {v0, v1, p1}, Lpt2/v;->F(Lkotlin/jvm/functions/Function1;Lot2/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
