.class public final Lg40/j;
.super Lg40/m;
.source "SourceFile"

# interfaces
.implements Le40/c;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lg40/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final F:Lc93/a;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/util/Set;

.field public final y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg40/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg40/i;-><init>(I)V

    sput-object v0, Lg40/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lc93/a;)V
    .locals 1

    const-string v0, "phoneNumberConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigation"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/j;->w:Ljava/lang/String;

    iput-object p2, p0, Lg40/j;->x:Ljava/util/Set;

    iput-object p3, p0, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p4, p0, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p5, p0, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p6, p0, Lg40/j;->F:Lc93/a;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg40/j;->w:Ljava/lang/String;

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
    instance-of v1, p1, Lg40/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg40/j;

    iget-object v1, p0, Lg40/j;->w:Ljava/lang/String;

    iget-object v3, p1, Lg40/j;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg40/j;->x:Ljava/util/Set;

    iget-object v3, p1, Lg40/j;->x:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v3, p1, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lg40/j;->F:Lc93/a;

    iget-object p1, p1, Lg40/j;->F:Lc93/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f(Ljava/lang/String;Z)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/jvm/internal/j;->Q(Le40/c;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final h()Lc93/a;
    .locals 1

    iget-object v0, p0, Lg40/j;->F:Lc93/a;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lg40/j;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lg40/j;->x:Ljava/util/Set;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg40/j;->F:Lc93/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lg40/j;->x:Ljava/util/Set;

    return-object v0
.end method

.method public final k()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final s()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AutocompleteCondensed(googleApiKey="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg40/j;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", autocompleteCountries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/j;->x:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", phoneNumberConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nameConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", emailConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onNavigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/j;->F:Lc93/a;

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

    iget-object p2, p0, Lg40/j;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg40/j;->x:Ljava/util/Set;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, p0, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg40/j;->z:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg40/j;->E:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg40/j;->F:Lc93/a;

    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method

.method public final x()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    iget-object v0, p0, Lg40/j;->y:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method
