.class public final synthetic Lg40/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg40/r0;


# direct methods
.method public synthetic constructor <init>(Lg40/r0;I)V
    .locals 0

    iput p2, p0, Lg40/q0;->w:I

    iput-object p1, p0, Lg40/q0;->x:Lg40/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg40/q0;->w:I

    check-cast p1, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lg40/q0;->x:Lg40/r0;

    iget-object v0, v0, Lg40/r0;->a:Lg40/p0;

    invoke-interface {v0}, Lg40/p0;->w()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lg40/q0;->x:Lg40/r0;

    iget-object v0, v0, Lg40/r0;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_2

    :cond_1
    const-string p1, ""

    :cond_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
