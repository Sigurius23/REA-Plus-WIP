.class public final Lpg3/h0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/reflect/Method;

.field public final d:I

.field public final e:Lpg3/n;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILpg3/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/h0;->c:Ljava/lang/reflect/Method;

    iput p2, p0, Lpg3/h0;->d:I

    iput-object p3, p0, Lpg3/h0;->e:Lpg3/n;

    iput-boolean p4, p0, Lpg3/h0;->f:Z

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 6

    check-cast p2, Ljava/util/Map;

    const/4 v0, 0x0

    iget v1, p0, Lpg3/h0;->d:I

    iget-object v2, p0, Lpg3/h0;->c:Ljava/lang/reflect/Method;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v5, p0, Lpg3/h0;->e:Lpg3/n;

    invoke-interface {v5, v3}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-boolean v5, p0, Lpg3/h0;->f:Z

    invoke-virtual {p1, v4, v3, v5}, Lpg3/s0;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    const-string p1, "Header map contained null value for key \'"

    const-string p2, "\'."

    invoke-static {p1, v4, p2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "Header map contained null key."

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_2
    return-void

    :cond_3
    const-string p1, "Header map was null."

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method
