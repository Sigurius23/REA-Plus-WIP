.class public final Lwp/e;
.super Lwp/d;
.source "SourceFile"


# instance fields
.field public final E:F

.field public final z:Lwp/b;


# direct methods
.method public constructor <init>(Lwp/b;F)V
    .locals 2

    const-string v0, "bitmapDescriptor must not be null"

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-lez v0, :cond_0

    const/4 v0, 0x3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lwp/d;-><init>(ILwp/b;Ljava/lang/Float;)V

    iput-object p1, p0, Lwp/e;->z:Lwp/b;

    iput p2, p0, Lwp/e;->E:F

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "refWidth must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lwp/e;->z:Lwp/b;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "[CustomCap: bitmapDescriptor="

    const-string v2, " refWidth="

    invoke-static {v1, v0, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lwp/e;->E:F

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
