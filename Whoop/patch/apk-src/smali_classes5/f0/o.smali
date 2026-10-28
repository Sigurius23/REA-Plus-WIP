.class public final Lf0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Li2/g;

.field public b:Li2/c;

.field public c:Lk2/b;

.field public d:Li2/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf0/o;->a:Li2/g;

    iput-object v0, p0, Lf0/o;->b:Li2/c;

    iput-object v0, p0, Lf0/o;->c:Lk2/b;

    iput-object v0, p0, Lf0/o;->d:Li2/j;

    return-void
.end method

.method public static final synthetic a(Lf0/o;)Li2/v;
    .locals 0

    iget-object p0, p0, Lf0/o;->b:Li2/c;

    return-object p0
.end method

.method public static final synthetic b(Lf0/o;)Lk2/b;
    .locals 0

    iget-object p0, p0, Lf0/o;->c:Lk2/b;

    return-object p0
.end method

.method public static final synthetic c(Lf0/o;)Li2/g;
    .locals 0

    iget-object p0, p0, Lf0/o;->a:Li2/g;

    return-object p0
.end method

.method public static final synthetic d(Lf0/o;Li2/c;)V
    .locals 0

    iput-object p1, p0, Lf0/o;->b:Li2/c;

    return-void
.end method

.method public static final synthetic e(Lf0/o;Lk2/b;)V
    .locals 0

    iput-object p1, p0, Lf0/o;->c:Lk2/b;

    return-void
.end method

.method public static final synthetic f(Lf0/o;Li2/g;)V
    .locals 0

    iput-object p1, p0, Lf0/o;->a:Li2/g;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lf0/o;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lf0/o;

    iget-object v0, p0, Lf0/o;->a:Li2/g;

    iget-object v1, p1, Lf0/o;->a:Li2/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lf0/o;->b:Li2/c;

    iget-object v1, p1, Lf0/o;->b:Li2/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lf0/o;->c:Lk2/b;

    iget-object v1, p1, Lf0/o;->c:Lk2/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lf0/o;->d:Li2/j;

    iget-object p1, p1, Lf0/o;->d:Li2/j;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final g()Li2/s0;
    .locals 1

    iget-object v0, p0, Lf0/o;->d:Li2/j;

    if-nez v0, :cond_0

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    iput-object v0, p0, Lf0/o;->d:Li2/j;

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lf0/o;->a:Li2/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lf0/o;->b:Li2/c;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lf0/o;->c:Lk2/b;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lf0/o;->d:Li2/j;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BorderCache(imageBitmap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf0/o;->a:Li2/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvas="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf0/o;->b:Li2/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvasDrawScope="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf0/o;->c:Lk2/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf0/o;->d:Li2/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
