.class public final Ltp/l;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltp/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lcom/google/android/gms/common/api/Status;

.field public final x:Ltp/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltp/a0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ltp/a0;-><init>(I)V

    sput-object v0, Ltp/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Ltp/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/l;->w:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Ltp/l;->x:Ltp/m;

    return-void
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Ltp/l;->w:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Ltp/l;->w:Lcom/google/android/gms/common/api/Status;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x2

    iget-object v2, p0, Ltp/l;->x:Ltp/m;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
