.class public Lcom/google/android/gms/auth/api/signin/SignInAccount;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/auth/api/signin/SignInAccount;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

.field public final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/j0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lq30/j0;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->x:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const-string p2, "8.3 and 8.4 SDKs require non-null email"

    invoke-static {p1, p2}, Luo/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->w:Ljava/lang/String;

    const-string p1, "8.3 and 8.4 SDKs require non-null userId"

    invoke-static {p3, p1}, Luo/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->x:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 p2, 0x8

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->y:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
