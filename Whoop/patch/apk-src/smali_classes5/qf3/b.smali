.class public final Lqf3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvf3/a;

.field public final b:Lj93/d;

.field public final c:Lvf3/a;

.field public final d:Lc93/m;

.field public final e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V
    .locals 1

    const-string v0, "scopeQualifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p5, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqf3/b;->a:Lvf3/a;

    iput-object p2, p0, Lqf3/b;->b:Lj93/d;

    iput-object p3, p0, Lqf3/b;->c:Lvf3/a;

    iput-object p4, p0, Lqf3/b;->d:Lc93/m;

    iput p5, p0, Lqf3/b;->e:I

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lqf3/b;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lj93/d;
    .locals 1

    iget-object v0, p0, Lqf3/b;->b:Lj93/d;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_4

    check-cast p1, Lqf3/b;

    iget-object v1, p0, Lqf3/b;->b:Lj93/d;

    iget-object v2, p1, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lqf3/b;->c:Lvf3/a;

    iget-object v3, p1, Lqf3/b;->c:Lvf3/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lqf3/b;->a:Lvf3/a;

    iget-object p1, p1, Lqf3/b;->a:Lvf3/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lqf3/b;->c:Lvf3/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    check-cast v0, Lvf3/c;

    iget-object v0, v0, Lvf3/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqf3/b;->b:Lj93/d;

    invoke-interface {v1}, Lj93/d;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lqf3/b;->a:Lvf3/a;

    check-cast v0, Lvf3/c;

    iget-object v0, v0, Lvf3/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    const/4 v0, 0x1

    iget v1, p0, Lqf3/b;->e:I

    if-eq v1, v0, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const-string v0, "Scoped"

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    throw v0

    :cond_1
    const-string v0, "Factory"

    goto :goto_0

    :cond_2
    const-string v0, "Singleton"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lqf3/b;->b:Lj93/d;

    invoke-static {v2}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    iget-object v3, p0, Lqf3/b;->c:Lvf3/a;

    if-nez v3, :cond_3

    :goto_1
    move-object v3, v2

    goto :goto_2

    :cond_3
    const-string v4, ",qualifier:"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    sget-object v4, Lwf3/a;->e:Lvf3/c;

    iget-object v5, p0, Lqf3/b;->a:Lvf3/a;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v4, v2

    goto :goto_3

    :cond_5
    const-string v4, ",scope:"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_3
    iget-object v5, p0, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    iget-object v2, p0, Lqf3/b;->f:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    sget-object v9, Lqf3/a;->w:Lqf3/a;

    const/16 v10, 0x1e

    const-string v6, ","

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    const-string v5, ",binds:"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "["

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
