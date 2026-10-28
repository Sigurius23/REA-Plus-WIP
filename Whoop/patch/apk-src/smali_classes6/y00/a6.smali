.class public final Ly00/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/e8;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/a6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ly00/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/r5;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ly00/r5;-><init>(I)V

    sput-object v0, Ly00/a6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ly00/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/a6;->w:Ljava/lang/String;

    iput-object p2, p0, Ly00/a6;->x:Ly00/d;

    return-void
.end method


# virtual methods
.method public final c0()Ljava/util/Map;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/a6;->w:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "hcaptcha_token"

    invoke-static {v2, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    sget-object v2, Lm83/z;->w:Lm83/z;

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    iget-object v3, p0, Ly00/a6;->x:Ly00/d;

    if-eqz v3, :cond_2

    const-string v0, "android_verification_object"

    invoke-virtual {v3}, Ly00/d;->c0()Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v3}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v0

    :goto_1
    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method

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
    instance-of v1, p1, Ly00/a6;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/a6;

    iget-object v1, p0, Ly00/a6;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/a6;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/a6;->x:Ly00/d;

    iget-object p1, p1, Ly00/a6;->x:Ly00/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/a6;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/a6;->x:Ly00/d;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ly00/d;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RadarOptions(hCaptchaToken="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/a6;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", androidVerificationObject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/a6;->x:Ly00/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/a6;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/a6;->x:Ly00/d;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Ly00/d;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
