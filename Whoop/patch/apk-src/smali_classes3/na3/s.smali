.class public abstract Lna3/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls93/j;

.field public static final b:Ls93/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls93/j;

    sget-object v1, Lfa3/x;->p:Lva3/e;

    const-string v2, "ENHANCED_NULLABILITY_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ls93/j;-><init>(Lva3/e;)V

    sput-object v0, Lna3/s;->a:Ls93/j;

    new-instance v0, Ls93/j;

    sget-object v1, Lfa3/x;->q:Lva3/e;

    const-string v2, "ENHANCED_MUTABILITY_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ls93/j;-><init>(Lva3/e;)V

    sput-object v0, Lna3/s;->b:Ls93/j;

    return-void
.end method

.method public static final a(Ljava/util/List;)Ls93/i;
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ls93/j;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ls93/j;-><init>(Ljava/util/List;I)V

    return-object v0

    :cond_0
    invoke-static {p0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls93/i;

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "At least one Annotations object expected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lr93/h;Lna3/d;Lna3/p;)Lr93/e;
    .locals 4

    sget-object v0, Lna3/p;->y:Lna3/p;

    const/4 v1, 0x0

    if-eq p2, v0, :cond_3

    instance-of v0, p0, Lr93/e;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lna3/d;->b:Lna3/e;

    sget-object v2, Lna3/e;->w:Lna3/e;

    if-ne v0, v2, :cond_2

    sget-object v0, Lna3/p;->w:Lna3/p;

    if-ne p2, v0, :cond_2

    move-object v0, p0

    check-cast v0, Lr93/e;

    sget-object v2, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v2

    sget-object v3, Lq93/d;->j:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/e;

    if-eqz p0, :cond_1

    invoke-static {v0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object p1

    invoke-virtual {p1, p0}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Given class "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not a mutable collection"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, p1, Lna3/d;->b:Lna3/e;

    sget-object v0, Lna3/e;->x:Lna3/e;

    if-ne p1, v0, :cond_3

    sget-object p1, Lna3/p;->x:Lna3/p;

    if-ne p2, p1, :cond_3

    check-cast p0, Lr93/e;

    sget-object p1, Lq93/d;->a:Ljava/lang/String;

    invoke-static {p0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object p1

    sget-object p2, Lq93/d;->k:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p0}, Lq93/e;->a(Lr93/e;)Lr93/e;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    return-object v1
.end method

.method public static final synthetic c()Ls93/j;
    .locals 1

    sget-object v0, Lna3/s;->b:Ls93/j;

    return-object v0
.end method

.method public static final d(Lna3/d;Lna3/p;)Ljava/lang/Boolean;
    .locals 2

    sget-object v0, Lna3/p;->y:Lna3/p;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    iget-object p0, p0, Lna3/d;->a:Lna3/g;

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object p1, Lna3/r;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    :goto_0
    const/4 p1, 0x1

    if-eq p0, p1, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    return-object v1

    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static final e()Ls93/j;
    .locals 1

    sget-object v0, Lna3/s;->a:Ls93/j;

    return-object v0
.end method
