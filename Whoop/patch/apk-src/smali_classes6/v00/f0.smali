.class public final Lv00/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/i0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv00/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lv00/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/f0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv00/f0;->w:Lv00/f0;

    new-instance v0, Lux/g;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lux/g;-><init>(I)V

    sput-object v0, Lv00/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final L(ZLq20/h;)Ly00/r3;
    .locals 0

    invoke-static {p0, p1, p2}, Ls7/a;->a(Lv00/i0;ZLq20/h;)Ly00/r3;

    move-result-object p1

    return-object p1
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
    instance-of p1, p1, Lv00/f0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x584ceeda

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Enabled"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
