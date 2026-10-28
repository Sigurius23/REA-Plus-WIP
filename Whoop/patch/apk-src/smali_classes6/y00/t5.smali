.class public final Ly00/t5;
.super Ly00/u5;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/t5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Ly00/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/r5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ly00/r5;-><init>(I)V

    sput-object v0, Ly00/t5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ly00/o;)V
    .locals 1

    sget-object v0, Ly00/f4;->Y:Ly00/f4;

    invoke-direct {p0, v0}, Ly00/u5;-><init>(Ly00/f4;)V

    iput-object p1, p0, Ly00/t5;->x:Ly00/o;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 4

    new-instance v0, Ll83/k;

    const-string v1, "client"

    const-string v2, "mobile_web"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/t5;->x:Ly00/o;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly00/o;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ll83/k;

    const-string v3, "setup_future_usage"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/t5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/t5;

    iget-object v1, p0, Ly00/t5;->x:Ly00/o;

    iget-object p1, p1, Ly00/t5;->x:Ly00/o;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ly00/t5;->x:Ly00/o;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WeChatPayH5(setupFutureUsage="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/t5;->x:Ly00/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ly00/t5;->x:Ly00/o;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
