.class public final synthetic Ltp/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lto/n;


# instance fields
.field public final synthetic w:I

.field public final x:Landroid/app/PendingIntent;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/PendingIntent;)V
    .locals 0

    iput p1, p0, Ltp/p;->w:I

    iput-object p2, p0, Ltp/p;->x:Landroid/app/PendingIntent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    iget v0, p0, Ltp/p;->w:I

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcq/q;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p2}, Lcq/q;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->c()V

    const-string p2, "PendingIntent must be specified."

    iget-object v1, p0, Ltp/p;->x:Landroid/app/PendingIntent;

    invoke-static {v1, p2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lip/d;

    invoke-direct {p2, v0}, Lip/d;-><init>(Lcq/q;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnp/e;

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, v1}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lnp/l;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p2, 0x45

    invoke-virtual {p1, v0, p2}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    return-void

    :pswitch_0
    new-instance v0, Lcq/q;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p2}, Lcq/q;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->c()V

    new-instance p2, Lip/d;

    invoke-direct {p2, v0}, Lip/d;-><init>(Lcq/q;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnp/e;

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v0

    iget-object v1, p0, Ltp/p;->x:Landroid/app/PendingIntent;

    invoke-static {v0, v1}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lnp/l;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p2, 0x49

    invoke-virtual {p1, v0, p2}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    return-void

    :pswitch_1
    invoke-virtual {p1}, Luo/c;->c()V

    iget-object v0, p0, Ltp/p;->x:Landroid/app/PendingIntent;

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnp/e;

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {v1, v0}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 v0, 0x6

    invoke-virtual {p1, v1, v0}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    new-instance v6, Ltp/s;

    const/4 v0, 0x1

    invoke-direct {v6, v0, p2}, Ltp/s;-><init>(ILcq/i;)V

    iget-object p1, p1, Lnp/i;->A:Lcd3/g;

    iget-object p1, p1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object p2, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Lnp/i;

    invoke-virtual {p2}, Luo/c;->c()V

    invoke-virtual {p1}, Laj/c;->a0()Lnp/e;

    move-result-object p1

    new-instance v0, Lnp/k;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v4, p0, Ltp/p;->x:Landroid/app/PendingIntent;

    invoke-direct/range {v0 .. v6}, Lnp/k;-><init>(ILnp/j;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    invoke-virtual {p1, v0}, Lnp/e;->j0(Lnp/k;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
