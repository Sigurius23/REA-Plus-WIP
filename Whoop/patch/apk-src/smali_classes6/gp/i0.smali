.class public final Lgp/i0;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/i0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lmp/t0;

.field public final x:Lmp/t0;

.field public final y:Lmp/t0;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lgp/i0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lmp/t0;Lmp/t0;Lmp/t0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/i0;->w:Lmp/t0;

    iput-object p2, p0, Lgp/i0;->x:Lmp/t0;

    iput-object p3, p0, Lgp/i0;->y:Lmp/t0;

    iput p4, p0, Lgp/i0;->z:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgp/i0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgp/i0;

    iget-object v0, p0, Lgp/i0;->w:Lmp/t0;

    iget-object v2, p1, Lgp/i0;->w:Lmp/t0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/i0;->x:Lmp/t0;

    iget-object v2, p1, Lgp/i0;->x:Lmp/t0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/i0;->y:Lmp/t0;

    iget-object v2, p1, Lgp/i0;->y:Lmp/t0;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lgp/i0;->z:I

    iget p1, p1, Lgp/i0;->z:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Lgp/i0;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lgp/i0;->w:Lmp/t0;

    iget-object v2, p0, Lgp/i0;->x:Lmp/t0;

    iget-object v3, p0, Lgp/i0;->y:Lmp/t0;

    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    iget-object v1, p0, Lgp/i0;->w:Lmp/t0;

    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lmp/t0;->m()[B

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgp/i0;->x:Lmp/t0;

    if-nez v2, :cond_1

    move-object v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lmp/t0;->m()[B

    move-result-object v2

    :goto_1
    invoke-static {v2}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lgp/i0;->y:Lmp/t0;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lmp/t0;->m()[B

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v0

    const-string v3, ", saltEnc="

    const-string v4, ", saltAuth="

    const-string v5, "HmacSecretExtension{coseKeyAgreement="

    invoke-static {v5, v1, v3, v2, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", getPinUvAuthProtocol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lgp/i0;->z:I

    const-string v2, "}"

    invoke-static {v1, v0, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Lgp/i0;->w:Lmp/t0;

    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lmp/t0;->m()[B

    move-result-object v1

    :goto_0
    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lvo/c;->f(Landroid/os/Parcel;I[B)V

    iget-object v1, p0, Lgp/i0;->x:Lmp/t0;

    if-nez v1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lmp/t0;->m()[B

    move-result-object v1

    :goto_1
    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Lvo/c;->f(Landroid/os/Parcel;I[B)V

    iget-object v1, p0, Lgp/i0;->y:Lmp/t0;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lmp/t0;->m()[B

    move-result-object v0

    :goto_2
    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lvo/c;->f(Landroid/os/Parcel;I[B)V

    const/4 v0, 0x4

    invoke-static {p1, v0, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Lgp/i0;->z:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
