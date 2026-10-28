.class public final Lq20/j;
.super Lq20/y;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq20/j;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Lq20/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq20/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq20/j;->x:Lq20/j;

    new-instance v0, Lpn/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lq20/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    const/4 v0, 0x0

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
    instance-of p1, p1, Lq20/j;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final f(Ljava/lang/String;Z)Lzy/c;
    .locals 0

    const-string p2, "merchantName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x3ab3ed2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "GooglePay"

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
