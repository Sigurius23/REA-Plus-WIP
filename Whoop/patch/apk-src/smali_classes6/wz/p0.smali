.class public final Lwz/p0;
.super Lwz/q0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwz/p0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ly00/b0;

.field public final x:Ly00/d5;

.field public final y:Ly00/o4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwx/f;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lwx/f;-><init>(I)V

    sput-object v0, Lwz/p0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ly00/b0;Ly00/d5;Ly00/o4;)V
    .locals 1

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwz/p0;->w:Ly00/b0;

    iput-object p2, p0, Lwz/p0;->x:Ly00/d5;

    iput-object p3, p0, Lwz/p0;->y:Ly00/o4;

    return-void
.end method


# virtual methods
.method public final b()Ly00/c0;
    .locals 1

    iget-object v0, p0, Lwz/p0;->w:Ly00/b0;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwz/p0;->w:Ly00/b0;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lwz/p0;->x:Ly00/d5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lwz/p0;->y:Ly00/o4;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
