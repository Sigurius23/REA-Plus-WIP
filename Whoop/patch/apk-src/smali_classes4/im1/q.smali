.class public final synthetic Lim1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;I)V
    .locals 0

    iput p2, p0, Lim1/q;->w:I

    iput-object p1, p0, Lim1/q;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lim1/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/q;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->S(Lcom/whoop/home/view/HomeFragment;Lj/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lim1/q;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->R(Lcom/whoop/home/view/HomeFragment;Lj/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
