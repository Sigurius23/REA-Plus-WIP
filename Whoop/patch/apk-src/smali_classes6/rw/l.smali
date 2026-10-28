.class public abstract Lrw/l;
.super Low/z;
.source "SourceFile"


# instance fields
.field public final a:Lrw/n;


# direct methods
.method public constructor <init>(Lrw/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrw/l;->a:Lrw/n;

    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lrw/l;->d()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lrw/l;->a:Lrw/n;

    iget-object v1, v1, Lrw/n;->a:Ljava/util/Map;

    :try_start_0
    invoke-virtual {p1}, Lww/a;->beginObject()V

    :goto_0
    invoke-virtual {p1}, Lww/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lww/a;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrw/k;

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lww/a;->skipValue()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v0, p1, v2}, Lrw/l;->f(Ljava/lang/Object;Lww/a;Lrw/k;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lww/a;->endObject()V

    invoke-virtual {p0, v0}, Lrw/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_1
    sget-object v0, Ltw/c;->a:Ls30/b;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    return-void

    :cond_0
    invoke-virtual {p1}, Lww/b;->beginObject()V

    :try_start_0
    iget-object v0, p0, Lrw/l;->a:Lrw/n;

    iget-object v0, v0, Lrw/n;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrw/k;

    invoke-virtual {v1, p1, p2}, Lrw/k;->a(Lww/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lww/b;->endObject()V

    return-void

    :goto_1
    sget-object p2, Ltw/c;->a:Ls30/b;

    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract d()Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract f(Ljava/lang/Object;Lww/a;Lrw/k;)V
.end method
