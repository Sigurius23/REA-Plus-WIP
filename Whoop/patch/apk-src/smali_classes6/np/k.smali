.class public final Lnp/k;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lnp/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ltp/x;

.field public final F:Lnp/d;

.field public final w:I

.field public final x:Lnp/j;

.field public final y:Ltp/z;

.field public final z:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmn/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lmn/b;-><init>(I)V

    sput-object v0, Lnp/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILnp/j;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnp/k;->w:I

    iput-object p2, p0, Lnp/k;->x:Lnp/j;

    const/4 p1, 0x0

    if-nez p3, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    sget p2, Lnp/g;->g:I

    const-string p2, "com.google.android.gms.location.ILocationListener"

    invoke-interface {p3, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ltp/z;

    if-eqz v1, :cond_1

    check-cast v0, Ltp/z;

    goto :goto_0

    :cond_1
    new-instance v0, Ltp/y;

    invoke-direct {v0, p3, p2}, Lnp/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    :goto_0
    iput-object v0, p0, Lnp/k;->y:Ltp/z;

    iput-object p4, p0, Lnp/k;->z:Landroid/app/PendingIntent;

    if-nez p5, :cond_2

    move-object p3, p1

    goto :goto_1

    :cond_2
    sget p2, Lnp/f;->h:I

    const-string p2, "com.google.android.gms.location.ILocationCallback"

    invoke-interface {p5, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p3

    instance-of p4, p3, Ltp/x;

    if-eqz p4, :cond_3

    check-cast p3, Ltp/x;

    goto :goto_1

    :cond_3
    new-instance p3, Ltp/w;

    invoke-direct {p3, p5, p2}, Lnp/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    :goto_1
    iput-object p3, p0, Lnp/k;->E:Ltp/x;

    if-nez p6, :cond_4

    goto :goto_2

    :cond_4
    const-string p1, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    invoke-interface {p6, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p3, p2, Lnp/d;

    if-eqz p3, :cond_5

    move-object p1, p2

    check-cast p1, Lnp/d;

    goto :goto_2

    :cond_5
    new-instance p2, Lnp/c;

    invoke-direct {p2, p6, p1}, Lnp/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    move-object p1, p2

    :goto_2
    iput-object p1, p0, Lnp/k;->F:Lnp/d;

    return-void
.end method

.method public static b(Lnp/j;Landroid/app/PendingIntent;Ltp/s;)Lnp/k;
    .locals 7

    new-instance v0, Lnp/k;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    move-object v2, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lnp/k;-><init>(ILnp/j;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static f(Lnp/f;Ltp/s;)Lnp/k;
    .locals 7

    new-instance v0, Lnp/k;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    move-object v6, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lnp/k;-><init>(ILnp/j;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Lnp/k;->w:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x2

    iget-object v3, p0, Lnp/k;->x:Lnp/j;

    invoke-static {p1, v1, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x0

    iget-object v3, p0, Lnp/k;->y:Ltp/z;

    if-nez v3, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    check-cast v3, Lnp/a;

    iget-object v3, v3, Lnp/a;->f:Landroid/os/IBinder;

    :goto_0
    const/4 v4, 0x3

    invoke-static {p1, v4, v3}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    iget-object v3, p0, Lnp/k;->z:Landroid/app/PendingIntent;

    invoke-static {p1, v2, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    iget-object p2, p0, Lnp/k;->E:Ltp/x;

    if-nez p2, :cond_1

    move-object p2, v1

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_1
    const/4 v2, 0x5

    invoke-static {p1, v2, p2}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    iget-object p2, p0, Lnp/k;->F:Lnp/d;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    :goto_2
    const/4 p2, 0x6

    invoke-static {p1, p2, v1}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
