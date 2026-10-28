.class public final Ly00/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/q3;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/p3;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Ly00/p3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/p3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly00/p3;->w:Ly00/p3;

    new-instance v0, Ly00/u2;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ly00/u2;-><init>(I)V

    sput-object v0, Ly00/p3;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final I()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Ly00/p3;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x1a096d3c

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Refresh"

    return-object v0
.end method

.method public final u()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
