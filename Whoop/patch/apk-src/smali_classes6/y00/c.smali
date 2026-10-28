.class public final Ly00/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;
.implements Ly00/e8;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwx/f;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lwx/f;-><init>(I)V

    sput-object v0, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/c;->w:Ljava/lang/String;

    iput-object p2, p0, Ly00/c;->x:Ljava/lang/String;

    iput-object p3, p0, Ly00/c;->y:Ljava/lang/String;

    iput-object p4, p0, Ly00/c;->z:Ljava/lang/String;

    iput-object p5, p0, Ly00/c;->E:Ljava/lang/String;

    iput-object p6, p0, Ly00/c;->F:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final c0()Ljava/util/Map;
    .locals 8

    const-string v0, ""

    iget-object v1, p0, Ly00/c;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move-object v1, v0

    :cond_0
    new-instance v2, Ll83/k;

    const-string v3, "city"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/c;->x:Ljava/lang/String;

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_1
    new-instance v3, Ll83/k;

    const-string v4, "country"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/c;->y:Ljava/lang/String;

    if-nez v1, :cond_2

    move-object v1, v0

    :cond_2
    new-instance v4, Ll83/k;

    const-string v5, "line1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/c;->z:Ljava/lang/String;

    if-nez v1, :cond_3

    move-object v1, v0

    :cond_3
    new-instance v5, Ll83/k;

    const-string v6, "line2"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/c;->E:Ljava/lang/String;

    if-nez v1, :cond_4

    move-object v1, v0

    :cond_4
    new-instance v6, Ll83/k;

    const-string v7, "postal_code"

    invoke-direct {v6, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/c;->F:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    move-object v0, v1

    :goto_0
    new-instance v7, Ll83/k;

    const-string v1, "state"

    invoke-direct {v7, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v2 .. v7}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    return-object v1
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
    instance-of v1, p1, Ly00/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/c;

    iget-object v1, p0, Ly00/c;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/c;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/c;->x:Ljava/lang/String;

    iget-object v3, p1, Ly00/c;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/c;->y:Ljava/lang/String;

    iget-object v3, p1, Ly00/c;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/c;->z:Ljava/lang/String;

    iget-object v3, p1, Ly00/c;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/c;->E:Ljava/lang/String;

    iget-object v3, p1, Ly00/c;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/c;->F:Ljava/lang/String;

    iget-object p1, p1, Ly00/c;->F:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/c;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/c;->x:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/c;->y:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/c;->z:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/c;->E:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/c;->F:Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", country="

    const-string v1, ", line1="

    const-string v2, "Address(city="

    iget-object v3, p0, Ly00/c;->w:Ljava/lang/String;

    iget-object v4, p0, Ly00/c;->x:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", line2="

    const-string v2, ", postalCode="

    iget-object v3, p0, Ly00/c;->y:Ljava/lang/String;

    iget-object v4, p0, Ly00/c;->z:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", state="

    const-string v2, ")"

    iget-object v3, p0, Ly00/c;->E:Ljava/lang/String;

    iget-object v4, p0, Ly00/c;->F:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ly00/c;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/c;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/c;->y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/c;->z:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/c;->E:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/c;->F:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
