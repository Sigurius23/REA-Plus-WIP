.class public abstract Ljf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg1/a7;

.field public static final b:Lg1/a7;

.field public static final c:Lg1/a7;

.field public static final d:Lg1/a7;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljf/b;->w:Ljf/b;

    new-instance v1, Lg1/a7;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lg1/a7;-><init>(Lkotlin/jvm/functions/Function1;I)V

    sput-object v1, Ljf/e;->a:Lg1/a7;

    sget-object v0, Ljf/c;->w:Ljf/c;

    new-instance v1, Lg1/a7;

    invoke-direct {v1, v0, v2}, Lg1/a7;-><init>(Lkotlin/jvm/functions/Function1;I)V

    sput-object v1, Ljf/e;->b:Lg1/a7;

    sget-object v0, Ljf/d;->w:Ljf/d;

    new-instance v1, Lg1/a7;

    invoke-direct {v1, v0, v2}, Lg1/a7;-><init>(Lkotlin/jvm/functions/Function1;I)V

    sput-object v1, Ljf/e;->c:Lg1/a7;

    new-instance v0, Lim1/p0;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    new-instance v1, Lg1/a7;

    invoke-direct {v1, v0, v2}, Lg1/a7;-><init>(Lkotlin/jvm/functions/Function1;I)V

    sput-object v1, Ljf/e;->d:Lg1/a7;

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Lyb3/p;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "^"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "literal"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "quote(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "(?i)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x24

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lyb3/p;

    invoke-direct {p1, p0}, Lyb3/p;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static final b(Ljf/a;Lvg/l;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljf/a;->b:Ljava/lang/String;

    check-cast p1, Lvg/r;

    const-string v1, "key"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljf/a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_2

    iget-object p1, p0, Ljf/a;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    :goto_0
    iget-object p0, p0, Ljf/a;->d:Ljava/lang/Object;

    return-object p0
.end method

.method public static final c(Ljf/f;Lvg/n;)Ljava/lang/Object;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljf/f;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "key"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Ljf/f;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Lvg/r;

    invoke-virtual {v3, v1}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    :cond_3
    move-object v2, v1

    :cond_4
    if-eqz v2, :cond_6

    invoke-virtual {p0}, Ljf/f;->c()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    return-object p1

    :cond_6
    :goto_1
    invoke-virtual {p0}, Ljf/f;->a()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/util/Map;Lyb3/p;)Ljava/lang/String;
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v1, v0

    :cond_1
    if-eqz v1, :cond_0

    :cond_2
    return-object v1
.end method

.method public static e(Ljf/a;Ljava/util/List;)Ljf/f;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljf/f;

    iget-object v1, p0, Ljf/a;->a:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ljf/a;->b:Ljava/lang/String;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v2, p0, Ljf/a;->c:Ljava/lang/String;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object p0, p0, Ljf/a;->d:Ljava/lang/Object;

    invoke-direct {v0, v1, p1, v2, p0}, Ljf/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V

    return-object v0
.end method
