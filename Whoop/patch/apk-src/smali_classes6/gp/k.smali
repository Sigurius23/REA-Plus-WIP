.class public final Lgp/k;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lgp/b;

.field public final x:Ljava/lang/Boolean;

.field public final y:Lgp/c0;

.field public final z:Lgp/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/k0;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lgp/b;->b(Ljava/lang/String;)Lgp/b;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lgp/k;->w:Lgp/b;

    iput-object p3, p0, Lgp/k;->x:Ljava/lang/Boolean;

    if-nez p2, :cond_1

    move-object p1, v0

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lgp/c0;->b(Ljava/lang/String;)Lgp/c0;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lgp/k;->y:Lgp/c0;

    if-nez p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p4}, Lgp/y;->b(Ljava/lang/String;)Lgp/y;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lgp/k;->z:Lgp/y;
    :try_end_0
    .catch Lcom/google/android/gms/fido/fido2/api/common/Attachment$UnsupportedAttachmentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/fido/fido2/api/common/zzbc; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement$UnsupportedResidentKeyRequirementException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    :goto_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final b()Lgp/y;
    .locals 2

    iget-object v0, p0, Lgp/k;->z:Lgp/y;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iget-object v1, p0, Lgp/k;->x:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lgp/y;->x:Lgp/y;

    :cond_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgp/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgp/k;

    iget-object v0, p0, Lgp/k;->w:Lgp/b;

    iget-object v2, p1, Lgp/k;->w:Lgp/b;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/k;->x:Ljava/lang/Boolean;

    iget-object v2, p1, Lgp/k;->x:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/k;->y:Lgp/c0;

    iget-object v2, p1, Lgp/k;->y:Lgp/c0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lgp/k;->b()Lgp/y;

    move-result-object v0

    invoke-virtual {p1}, Lgp/k;->b()Lgp/y;

    move-result-object p1

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lgp/k;->y:Lgp/c0;

    invoke-virtual {p0}, Lgp/k;->b()Lgp/y;

    move-result-object v1

    iget-object v2, p0, Lgp/k;->w:Lgp/b;

    iget-object v3, p0, Lgp/k;->x:Ljava/lang/Boolean;

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lgp/k;->w:Lgp/b;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgp/k;->y:Lgp/c0;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgp/k;->z:Lgp/y;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AuthenticatorSelectionCriteria{\n attachment="

    const-string v4, ", \n requireResidentKey="

    invoke-static {v3, v0, v4}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", \n requireUserVerification="

    const-string v4, ", \n residentKeyRequirement="

    iget-object v5, p0, Lgp/k;->x:Ljava/lang/Boolean;

    invoke-static {v5, v3, v1, v4, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, "\n }"

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Lgp/k;->w:Lgp/b;

    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lgp/b;->w:Ljava/lang/String;

    :goto_0
    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lgp/k;->x:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x3

    invoke-static {p1, v3, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    iget-object v2, p0, Lgp/k;->y:Lgp/c0;

    if-nez v2, :cond_2

    move-object v2, v0

    goto :goto_2

    :cond_2
    iget-object v2, v2, Lgp/c0;->w:Ljava/lang/String;

    :goto_2
    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-virtual {p0}, Lgp/k;->b()Lgp/y;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    iget-object v0, v1, Lgp/y;->w:Ljava/lang/String;

    :goto_3
    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
