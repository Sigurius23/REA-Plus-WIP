.class public final synthetic Lqu2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lqu2/a;->w:I

    iput-object p1, p0, Lqu2/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqu2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqu2/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lqu2/h;->J(Landroid/view/View;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqu2/a;->x:Ljava/lang/Object;

    check-cast v0, Lpu2/l;

    check-cast p1, Lc0/q;

    invoke-static {v0, p1}, Lqu2/h;->a(Lpu2/l;Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
