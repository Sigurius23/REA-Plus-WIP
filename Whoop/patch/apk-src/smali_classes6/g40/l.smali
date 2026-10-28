.class public final Lg40/l;
.super Lg40/m;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lg40/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg40/i;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg40/i;-><init>(I)V

    sput-object v0, Lg40/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;I)V
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 5
    sget-object p1, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    sget-object p2, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 7
    :cond_1
    sget-object p3, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V
    .locals 1

    const-string v0, "phoneNumberConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 3
    iput-object p2, p0, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 4
    iput-object p3, p0, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

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
    instance-of v1, p1, Lg40/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg40/l;

    iget-object v1, p0, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object p1, p1, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final k()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final s()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NoAutocomplete(phoneNumberConfig="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nameConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", emailConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg40/l;->x:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg40/l;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public final x()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lg40/l;->w:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method
