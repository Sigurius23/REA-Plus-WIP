.class public final Lq30/r;
.super Lq30/t;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq30/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lr30/b;

.field public final x:Lr30/e;

.field public final y:Lq30/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq20/p;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lq20/p;-><init>(I)V

    sput-object v0, Lq30/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lr30/b;Lr30/e;Lq30/n;)V
    .locals 1

    const-string v0, "creqData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cresData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/r;->w:Lr30/b;

    iput-object p2, p0, Lq30/r;->x:Lr30/e;

    iput-object p3, p0, Lq30/r;->y:Lq30/n;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lq30/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq30/r;

    iget-object v1, p0, Lq30/r;->w:Lr30/b;

    iget-object v3, p1, Lq30/r;->w:Lr30/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lq30/r;->x:Lr30/e;

    iget-object v3, p1, Lq30/r;->x:Lr30/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lq30/r;->y:Lq30/n;

    iget-object p1, p1, Lq30/r;->y:Lq30/n;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lq30/r;->w:Lr30/b;

    invoke-virtual {v0}, Lr30/b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lq30/r;->x:Lr30/e;

    invoke-virtual {v1}, Lr30/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lq30/r;->y:Lq30/n;

    invoke-virtual {v0}, Lq30/n;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Success(creqData="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq30/r;->w:Lr30/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cresData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq30/r;->x:Lr30/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqExecutorConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq30/r;->y:Lq30/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq30/r;->w:Lr30/b;

    invoke-virtual {v0, p1, p2}, Lr30/b;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lq30/r;->x:Lr30/e;

    invoke-virtual {v0, p1, p2}, Lr30/e;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lq30/r;->y:Lq30/n;

    invoke-virtual {v0, p1, p2}, Lq30/n;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
