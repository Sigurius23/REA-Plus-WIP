.class public final Ly00/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/e8;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/w2;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Ly00/w2;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly00/u2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly00/u2;-><init>(I)V

    sput-object v0, Ly00/w2;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Ly00/w2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1}, Ly00/w2;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, Ly00/w2;->z:Ly00/w2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/w2;->w:Ljava/lang/String;

    iput-object p2, p0, Ly00/w2;->x:Ljava/lang/String;

    iput-boolean p3, p0, Ly00/w2;->y:Z

    return-void
.end method


# virtual methods
.method public final c0()Ljava/util/Map;
    .locals 4

    iget-boolean v0, p0, Ly00/w2;->y:Z

    if-eqz v0, :cond_0

    const-string v0, "infer_from_client"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    iget-object v1, p0, Ly00/w2;->w:Ljava/lang/String;

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_1
    new-instance v2, Ll83/k;

    const-string v3, "ip_address"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ly00/w2;->x:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    new-instance v1, Ll83/k;

    const-string v3, "user_agent"

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

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
    instance-of v1, p1, Ly00/w2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/w2;

    iget-object v1, p0, Ly00/w2;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/w2;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/w2;->x:Ljava/lang/String;

    iget-object v3, p1, Ly00/w2;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ly00/w2;->y:Z

    iget-boolean p1, p1, Ly00/w2;->y:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/w2;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w2;->x:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Ly00/w2;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", userAgent="

    const-string v1, ", inferFromClient="

    const-string v2, "Online(ipAddress="

    iget-object v3, p0, Ly00/w2;->w:Ljava/lang/String;

    iget-object v4, p0, Ly00/w2;->x:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    iget-boolean v2, p0, Ly00/w2;->y:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ly00/w2;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/w2;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Ly00/w2;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
