.class public final Lgp/q;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lgp/g;

.field public final F:Lgp/i;

.field public final G:Lgp/e;

.field public final H:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Lmp/t0;

.field public final z:Lgp/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/k0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BLgp/h;Lgp/g;Lgp/i;Lgp/e;Ljava/lang/String;)V
    .locals 4

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    array-length v0, p3

    invoke-static {v0, p3}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object p3

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p4, :cond_2

    if-nez p5, :cond_2

    if-eqz p6, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move v2, v1

    goto :goto_3

    :cond_2
    :goto_2
    if-nez p4, :cond_3

    if-eqz p5, :cond_3

    if-eqz p6, :cond_1

    :cond_3
    if-nez p4, :cond_4

    if-nez p5, :cond_4

    if-eqz p6, :cond_4

    goto :goto_1

    :cond_4
    move v2, v0

    :goto_3
    const-string v3, "Must provide a response object."

    invoke-static {v2, v3}, Luo/w;->b(ZLjava/lang/String;)V

    if-nez p6, :cond_5

    if-eqz p1, :cond_6

    if-eqz p3, :cond_6

    :cond_5
    move v0, v1

    :cond_6
    const-string v1, "Must provide id and rawId if not an error response."

    invoke-static {v0, v1}, Luo/w;->b(ZLjava/lang/String;)V

    iput-object p1, p0, Lgp/q;->w:Ljava/lang/String;

    iput-object p2, p0, Lgp/q;->x:Ljava/lang/String;

    iput-object p3, p0, Lgp/q;->y:Lmp/t0;

    iput-object p4, p0, Lgp/q;->z:Lgp/h;

    iput-object p5, p0, Lgp/q;->E:Lgp/g;

    iput-object p6, p0, Lgp/q;->F:Lgp/i;

    iput-object p7, p0, Lgp/q;->G:Lgp/e;

    iput-object p8, p0, Lgp/q;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lgp/q;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lgp/q;

    iget-object v0, p0, Lgp/q;->w:Ljava/lang/String;

    iget-object v1, p1, Lgp/q;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->x:Ljava/lang/String;

    iget-object v1, p1, Lgp/q;->x:Ljava/lang/String;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->y:Lmp/t0;

    iget-object v1, p1, Lgp/q;->y:Lmp/t0;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->z:Lgp/h;

    iget-object v1, p1, Lgp/q;->z:Lgp/h;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->E:Lgp/g;

    iget-object v1, p1, Lgp/q;->E:Lgp/g;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->F:Lgp/i;

    iget-object v1, p1, Lgp/q;->F:Lgp/i;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->G:Lgp/e;

    iget-object v1, p1, Lgp/q;->G:Lgp/e;

    invoke-static {v0, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/q;->H:Ljava/lang/String;

    iget-object p1, p1, Lgp/q;->H:Ljava/lang/String;

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 8

    iget-object v6, p0, Lgp/q;->G:Lgp/e;

    iget-object v7, p0, Lgp/q;->H:Ljava/lang/String;

    iget-object v0, p0, Lgp/q;->w:Ljava/lang/String;

    iget-object v1, p0, Lgp/q;->x:Ljava/lang/String;

    iget-object v2, p0, Lgp/q;->y:Lmp/t0;

    iget-object v3, p0, Lgp/q;->E:Lgp/g;

    iget-object v4, p0, Lgp/q;->z:Lgp/h;

    iget-object v5, p0, Lgp/q;->F:Lgp/i;

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lgp/q;->y:Lmp/t0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lmp/t0;->m()[B

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgp/q;->z:Lgp/h;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lgp/q;->E:Lgp/g;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lgp/q;->F:Lgp/i;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lgp/q;->G:Lgp/e;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\', \n type=\'"

    const-string v6, "\', \n rawId="

    const-string v7, "PublicKeyCredential{\n id=\'"

    iget-object v8, p0, Lgp/q;->w:Ljava/lang/String;

    iget-object v9, p0, Lgp/q;->x:Ljava/lang/String;

    invoke-static {v7, v8, v5, v9, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ", \n registerResponse="

    const-string v7, ", \n signResponse="

    invoke-static {v5, v0, v6, v1, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", \n errorResponse="

    const-string v1, ", \n extensionsClientOutputs="

    invoke-static {v5, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", \n authenticatorAttachment=\'"

    const-string v1, "\'}"

    iget-object v2, p0, Lgp/q;->H:Ljava/lang/String;

    invoke-static {v5, v4, v0, v2, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    sget-object p1, Lmp/h1;->b:Lmp/h1;

    iget-object p1, p1, Lmp/h1;->a:Lmp/g;

    iget-object p1, p1, Lmp/g;->w:Ljava/lang/Object;

    check-cast p1, Lmp/i1;

    sget-object p1, Lmp/j1;->a:Lf93/a;

    invoke-virtual {p1}, Lf93/a;->f()Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1
.end method
