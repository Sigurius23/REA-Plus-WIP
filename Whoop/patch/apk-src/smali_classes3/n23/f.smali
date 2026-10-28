.class public final Ln23/f;
.super Ln23/h;
.source "SourceFile"


# instance fields
.field public final a:Ln23/e;


# direct methods
.method public constructor <init>(Ln23/e;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln23/f;->a:Ln23/e;

    return-void
.end method


# virtual methods
.method public final e()Ln23/e;
    .locals 1

    iget-object v0, p0, Ln23/f;->a:Ln23/e;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln23/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln23/f;

    iget-object v1, p0, Ln23/f;->a:Ln23/e;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ln23/f;->a:Ln23/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Failure(value="

    const-string v1, ")"

    iget-object v2, p0, Ln23/f;->a:Ln23/e;

    invoke-static {v0, v2, v1}, Lhc3/i;->e(Ljava/lang/String;Ln23/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
