.class public final Luz/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luz/e;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luz/a;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    invoke-static {p0}, Ls4/i;->g(Luz/e;)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    invoke-static {p0}, Ls4/i;->k(Luz/e;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Luz/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Luz/a;

    iget-object v1, p0, Luz/a;->a:Ljava/lang/Throwable;

    iget-object p1, p1, Luz/a;->a:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Luz/a;->a:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Failure(error="

    const-string v1, ")"

    iget-object v2, p0, Luz/a;->a:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lvl/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
