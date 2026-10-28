.class public final Lhb3/r;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lhb3/x;

.field public final y:Lqa3/k0;

.field public final z:Ljb3/s;


# direct methods
.method public synthetic constructor <init>(Lhb3/x;Lqa3/k0;Ljb3/s;I)V
    .locals 0

    iput p4, p0, Lhb3/r;->w:I

    iput-object p1, p0, Lhb3/r;->x:Lhb3/x;

    iput-object p2, p0, Lhb3/r;->y:Lqa3/k0;

    iput-object p3, p0, Lhb3/r;->z:Ljb3/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lhb3/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhb3/r;->x:Lhb3/x;

    iget-object v1, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->a:Lkb3/k;

    new-instance v2, Lhb3/w;

    const/4 v3, 0x1

    iget-object v4, p0, Lhb3/r;->y:Lqa3/k0;

    iget-object v5, p0, Lhb3/r;->z:Ljb3/s;

    invoke-direct {v2, v0, v4, v5, v3}, Lhb3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lkb3/h;

    invoke-direct {v0, v1, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhb3/r;->x:Lhb3/x;

    iget-object v1, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->a:Lkb3/k;

    new-instance v2, Lhb3/w;

    const/4 v3, 0x0

    iget-object v4, p0, Lhb3/r;->y:Lqa3/k0;

    iget-object v5, p0, Lhb3/r;->z:Ljb3/s;

    invoke-direct {v2, v0, v4, v5, v3}, Lhb3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lkb3/h;

    invoke-direct {v0, v1, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
