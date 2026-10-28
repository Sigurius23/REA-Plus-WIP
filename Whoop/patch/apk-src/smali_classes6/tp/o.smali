.class public final synthetic Ltp/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lto/n;


# static fields
.field public static final x:Ltp/o;

.field public static final y:Ltp/o;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ltp/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltp/o;-><init>(I)V

    sput-object v0, Ltp/o;->x:Ltp/o;

    new-instance v0, Ltp/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ltp/o;-><init>(I)V

    sput-object v0, Ltp/o;->y:Ltp/o;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ltp/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Ltp/o;->w:I

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ltp/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ltp/s;-><init>(ILcq/i;)V

    iget-object p1, p1, Lnp/i;->A:Lcd3/g;

    iget-object p1, p1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object p2, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Lnp/i;

    invoke-virtual {p2}, Luo/c;->c()V

    invoke-virtual {p1}, Laj/c;->a0()Lnp/e;

    move-result-object p1

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {p2, v0}, Lnp/l;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v0, 0x43

    invoke-virtual {p1, p2, v0}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    return-void

    :pswitch_0
    iget-object p1, p1, Lnp/i;->A:Lcd3/g;

    iget-object v0, p1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v1, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lnp/i;

    invoke-virtual {v1}, Luo/c;->c()V

    invoke-virtual {v0}, Laj/c;->a0()Lnp/e;

    move-result-object v0

    iget-object p1, p1, Lcd3/g;->F:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x22

    invoke-virtual {v0, v1, p1}, Lnp/a;->X(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/location/LocationAvailability;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/LocationAvailability;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2, v0}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
