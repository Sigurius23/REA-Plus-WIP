.class public final Lcz/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lq20/y;

.field public final c:Lcz/a;

.field public final d:Lcz/b;

.field public final e:Z

.field public final f:Lw30/c;

.field public final g:Z

.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Lq20/y;Lcz/a;Lcz/b;)V
    .locals 2

    const-string v0, "configuration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz/e0;->a:Ljava/util/List;

    iput-object p2, p0, Lcz/e0;->b:Lq20/y;

    iput-object p3, p0, Lcz/e0;->c:Lcz/a;

    iput-object p4, p0, Lcz/e0;->d:Lcz/b;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    if-eq p2, p3, :cond_0

    sget-object p2, Lmy/b;->x:Lmy/b;

    :cond_0
    const/4 p2, 0x0

    iput-boolean p2, p0, Lcz/e0;->e:Z

    sget-object p4, Lw30/b;->w:Lw30/b;

    iput-object p4, p0, Lcz/e0;->f:Lw30/c;

    check-cast p1, Ljava/lang/Iterable;

    instance-of p4, p1, Ljava/util/Collection;

    if-eqz p4, :cond_1

    move-object p4, p1

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly00/o4;

    iget-object v0, p0, Lcz/e0;->f:Lw30/c;

    const-string v1, "paymentMethod"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p4, Ly00/o4;->H:Ly00/z3;

    const-string v1, "cbcEligibility"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_3

    iget-object p4, p4, Ly00/z3;->K:Ly00/x3;

    if-eqz p4, :cond_3

    iget-object p4, p4, Ly00/x3;->w:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->size()I

    move-result p4

    if-le p4, p3, :cond_3

    move p4, p3

    goto :goto_0

    :cond_3
    move p4, p2

    :goto_0
    instance-of v0, v0, Lw30/a;

    if-eqz v0, :cond_2

    if-eqz p4, :cond_2

    move p2, p3

    :cond_4
    :goto_1
    iput-boolean p2, p0, Lcz/e0;->g:Z

    iget-object p1, p0, Lcz/e0;->a:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, p3

    iput-boolean p1, p0, Lcz/e0;->h:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcz/e0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcz/e0;

    iget-object v0, p0, Lcz/e0;->a:Ljava/util/List;

    iget-object v1, p1, Lcz/e0;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcz/e0;->b:Lq20/y;

    iget-object v1, p1, Lcz/e0;->b:Lq20/y;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcz/e0;->c:Lcz/a;

    iget-object v1, p1, Lcz/e0;->c:Lcz/a;

    invoke-virtual {v0, v1}, Lcz/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcz/e0;->d:Lcz/b;

    iget-object p1, p1, Lcz/e0;->d:Lcz/b;

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

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcz/e0;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcz/e0;->b:Lq20/y;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v1, p0, Lcz/e0;->c:Lcz/a;

    invoke-virtual {v1}, Lcz/a;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcz/e0;->d:Lcz/b;

    invoke-virtual {v0}, Lcz/b;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CustomerState(paymentMethods="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcz/e0;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcz/e0;->b:Lq20/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata=null, permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcz/e0;->c:Lcz/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", configuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcz/e0;->d:Lcz/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
