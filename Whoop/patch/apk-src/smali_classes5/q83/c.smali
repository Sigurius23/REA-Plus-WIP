.class public final Lq83/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/j;
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Lq83/j;

.field public final x:Lq83/h;


# direct methods
.method public constructor <init>(Lq83/h;Lq83/j;)V
    .locals 1

    const-string v0, "left"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq83/c;->w:Lq83/j;

    iput-object p1, p0, Lq83/c;->x:Lq83/h;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    if-eq p0, p1, :cond_7

    instance-of v0, p1, Lq83/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    check-cast p1, Lq83/c;

    const/4 v0, 0x2

    move-object v2, p1

    move v3, v0

    :goto_0
    iget-object v2, v2, Lq83/c;->w:Lq83/j;

    instance-of v4, v2, Lq83/c;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v2, Lq83/c;

    goto :goto_1

    :cond_0
    move-object v2, v5

    :goto_1
    if-nez v2, :cond_5

    move-object v2, p0

    :goto_2
    iget-object v2, v2, Lq83/c;->w:Lq83/j;

    instance-of v4, v2, Lq83/c;

    if-eqz v4, :cond_1

    check-cast v2, Lq83/c;

    goto :goto_3

    :cond_1
    move-object v2, v5

    :goto_3
    if-nez v2, :cond_4

    if-ne v3, v0, :cond_6

    move-object v0, p0

    :goto_4
    iget-object v2, v0, Lq83/c;->x:Lq83/h;

    invoke-interface {v2}, Lq83/h;->getKey()Lq83/i;

    move-result-object v3

    invoke-virtual {p1, v3}, Lq83/c;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    move p1, v1

    goto :goto_5

    :cond_2
    iget-object v0, v0, Lq83/c;->w:Lq83/j;

    instance-of v2, v0, Lq83/c;

    if-eqz v2, :cond_3

    check-cast v0, Lq83/c;

    goto :goto_4

    :cond_3
    const-string v2, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lq83/h;

    invoke-interface {v0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v2

    invoke-virtual {p1, v2}, Lq83/c;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_5
    if-eqz p1, :cond_6

    goto :goto_6

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    return v1

    :cond_7
    :goto_6
    const/4 p1, 0x1

    return p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq83/c;->w:Lq83/j;

    invoke-interface {v0, p1, p2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lq83/c;->x:Lq83/h;

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lq83/c;->x:Lq83/h;

    invoke-interface {v1, p1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Lq83/c;->w:Lq83/j;

    instance-of v1, v0, Lq83/c;

    if-eqz v1, :cond_1

    check-cast v0, Lq83/c;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lq83/c;->w:Lq83/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lq83/c;->x:Lq83/h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq83/c;->x:Lq83/h;

    invoke-interface {v0, p1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    iget-object v2, p0, Lq83/c;->w:Lq83/j;

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v2, p1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    if-ne p1, v2, :cond_1

    return-object p0

    :cond_1
    sget-object v1, Lq83/k;->w:Lq83/k;

    if-ne p1, v1, :cond_2

    return-object v0

    :cond_2
    new-instance v1, Lq83/c;

    invoke-direct {v1, v0, p1}, Lq83/c;-><init>(Lq83/h;Lq83/j;)V

    return-object v1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq83/k;->w:Lq83/k;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lp0/w0;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lp0/w0;-><init>(I)V

    invoke-interface {p1, p0, v0}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq83/j;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Lp0/w0;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lp0/w0;-><init>(I)V

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Lq83/c;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x5d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
