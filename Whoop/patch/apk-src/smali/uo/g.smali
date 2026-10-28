.class public final Luo/g;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final O:[Lcom/google/android/gms/common/api/Scope;

.field public static final P:[Lcom/google/android/gms/common/c;


# instance fields
.field public E:Landroid/os/IBinder;

.field public F:[Lcom/google/android/gms/common/api/Scope;

.field public G:Landroid/os/Bundle;

.field public H:Landroid/accounts/Account;

.field public I:[Lcom/google/android/gms/common/c;

.field public J:[Lcom/google/android/gms/common/c;

.field public final K:Z

.field public final L:I

.field public M:Z

.field public final N:Ljava/lang/String;

.field public final w:I

.field public final x:I

.field public final y:I

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/q1;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Landroidx/fragment/app/q1;-><init>(I)V

    sput-object v0, Luo/g;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Luo/g;->O:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Lcom/google/android/gms/common/c;

    sput-object v0, Luo/g;->P:[Lcom/google/android/gms/common/c;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/c;[Lcom/google/android/gms/common/c;ZIZLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Luo/g;->O:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    sget-object v0, Luo/g;->P:[Lcom/google/android/gms/common/c;

    if-nez p9, :cond_2

    move-object p9, v0

    :cond_2
    if-nez p10, :cond_3

    move-object p10, v0

    :cond_3
    iput p1, p0, Luo/g;->w:I

    iput p2, p0, Luo/g;->x:I

    iput p3, p0, Luo/g;->y:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Luo/g;->z:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, Luo/g;->z:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, Luo/a;->X(Landroid/os/IBinder;)Luo/i;

    move-result-object p1

    invoke-static {p1}, Luo/a;->c0(Luo/i;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Luo/g;->H:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, Luo/g;->E:Landroid/os/IBinder;

    iput-object p8, p0, Luo/g;->H:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Luo/g;->F:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Luo/g;->G:Landroid/os/Bundle;

    iput-object p9, p0, Luo/g;->I:[Lcom/google/android/gms/common/c;

    iput-object p10, p0, Luo/g;->J:[Lcom/google/android/gms/common/c;

    iput-boolean p11, p0, Luo/g;->K:Z

    iput p12, p0, Luo/g;->L:I

    iput-boolean p13, p0, Luo/g;->M:Z

    iput-object p14, p0, Luo/g;->N:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/fragment/app/q1;->a(Luo/g;Landroid/os/Parcel;I)V

    return-void
.end method
