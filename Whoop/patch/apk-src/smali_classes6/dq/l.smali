.class public final Ldq/l;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:Ljava/lang/String;

.field public F:Landroid/os/Bundle;

.field public G:Ljava/lang/String;

.field public H:Landroid/os/Bundle;

.field public w:Ljava/lang/String;

.field public x:Ldq/b;

.field public y:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field public z:Ldq/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lay/b;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lay/b;-><init>(I)V

    sput-object v0, Ldq/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Ldq/l;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Ldq/l;->x:Ldq/b;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Ldq/l;->y:Lcom/google/android/gms/identity/intents/model/UserAddress;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x4

    iget-object v2, p0, Ldq/l;->z:Ldq/n;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x5

    iget-object v1, p0, Ldq/l;->E:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 p2, 0x6

    iget-object v1, p0, Ldq/l;->F:Landroid/os/Bundle;

    invoke-static {p1, p2, v1}, Lvo/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    const/4 p2, 0x7

    iget-object v1, p0, Ldq/l;->G:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 p2, 0x8

    iget-object v1, p0, Ldq/l;->H:Landroid/os/Bundle;

    invoke-static {p1, p2, v1}, Lvo/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
