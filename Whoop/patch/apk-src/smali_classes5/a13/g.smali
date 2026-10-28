.class public final synthetic La13/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La13/g;->w:I

    iput-object p1, p0, La13/g;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, La13/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La13/g;->x:Ljava/lang/Object;

    check-cast v0, Lm32/d;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lm32/d;->a(Lm32/d;Ljava/util/Map;)V

    return-void

    :pswitch_0
    iget-object v0, p0, La13/g;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, La13/g;->x:Ljava/lang/Object;

    check-cast v0, La13/i;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    sget-object p1, La13/e;->x:La13/e;

    invoke-virtual {v0, p1}, La13/i;->a(La13/e;)V

    goto :goto_0

    :cond_0
    sget-object p1, La13/e;->y:La13/e;

    invoke-virtual {v0, p1}, La13/i;->a(La13/e;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
