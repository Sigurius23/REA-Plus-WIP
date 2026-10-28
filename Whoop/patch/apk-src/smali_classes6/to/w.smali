.class public final Lto/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lto/a;

.field public final b:Lcom/google/android/gms/common/c;


# direct methods
.method public synthetic constructor <init>(Lto/a;Lcom/google/android/gms/common/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/w;->a:Lto/a;

    iput-object p2, p0, Lto/w;->b:Lcom/google/android/gms/common/c;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lto/a;
    .locals 1

    iget-object v0, p0, Lto/w;->a:Lto/a;

    return-object v0
.end method

.method public final synthetic b()Lcom/google/android/gms/common/c;
    .locals 1

    iget-object v0, p0, Lto/w;->b:Lcom/google/android/gms/common/c;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lto/w;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lto/w;

    iget-object v0, p0, Lto/w;->a:Lto/a;

    iget-object v2, p1, Lto/w;->a:Lto/a;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lto/w;->b:Lcom/google/android/gms/common/c;

    iget-object p1, p1, Lto/w;->b:Lcom/google/android/gms/common/c;

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lto/w;->a:Lto/a;

    iget-object v1, p0, Lto/w;->b:Lcom/google/android/gms/common/c;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lpg3/p;

    invoke-direct {v0, p0}, Lpg3/p;-><init>(Ljava/lang/Object;)V

    const-string v1, "key"

    iget-object v2, p0, Lto/w;->a:Lto/a;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "feature"

    iget-object v2, p0, Lto/w;->b:Lcom/google/android/gms/common/c;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpg3/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
