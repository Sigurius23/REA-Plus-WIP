.class public final Lwp/n;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwp/n;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lwp/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lwp/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwp/b;

    invoke-static {p1}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lwp/b;-><init>(Lcp/a;)V

    iput-object v0, p0, Lwp/n;->w:Lwp/b;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget-object v0, p0, Lwp/n;->w:Lwp/b;

    iget-object v0, v0, Lwp/b;->a:Lcp/a;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
