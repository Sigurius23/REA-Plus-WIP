.class public final synthetic Ln71/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfz0/d;

.field public final synthetic y:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Lfz0/d;Lp1/a1;I)V
    .locals 0

    iput p3, p0, Ln71/g;->w:I

    iput-object p1, p0, Ln71/g;->x:Lfz0/d;

    iput-object p2, p0, Ln71/g;->y:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ln71/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln71/g;->y:Lp1/a1;

    check-cast p1, Ly3/c;

    iget-object v1, p0, Ln71/g;->x:Lfz0/d;

    invoke-static {v1, v0, p1}, Ln71/h;->a(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ln71/g;->y:Lp1/a1;

    check-cast p1, Ly3/c;

    iget-object v1, p0, Ln71/g;->x:Lfz0/d;

    invoke-static {v1, v0, p1}, Ln71/h;->d(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
