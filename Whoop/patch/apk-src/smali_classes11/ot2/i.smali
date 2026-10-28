.class public final synthetic Lot2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljt2/d;


# direct methods
.method public synthetic constructor <init>(Ljt2/d;I)V
    .locals 0

    iput p2, p0, Lot2/i;->w:I

    iput-object p1, p0, Lot2/i;->x:Ljt2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lot2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lot2/i;->x:Ljt2/d;

    check-cast p1, Lm91/u;

    invoke-static {v0, p1}, Lot2/k;->a(Ljt2/d;Lm91/u;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lot2/i;->x:Ljt2/d;

    check-cast p1, Lm91/u;

    invoke-static {v0, p1}, Lot2/j;->c(Ljt2/d;Lm91/u;)Z

    move-result p1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
