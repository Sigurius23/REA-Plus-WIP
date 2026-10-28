.class public final Lm93/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/Map;

.field public final c:Ll83/p;

.field public final d:Ll83/p;

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/util/Map;Ll83/p;Ll83/p;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm93/d;->a:Ljava/lang/Class;

    iput-object p2, p0, Lm93/d;->b:Ljava/util/Map;

    iput-object p3, p0, Lm93/d;->c:Ll83/p;

    iput-object p4, p0, Lm93/d;->d:Ll83/p;

    iput-object p5, p0, Lm93/d;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lm93/d;->a:Ljava/lang/Class;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x69e9ad94

    if-eq v1, v2, :cond_4

    const v2, 0x8cdac1b

    if-eq v1, v2, :cond_2

    const v2, 0x5620bf09

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "annotationType"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const-string v1, "hashCode"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lm93/d;->d:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v1, "toString"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lm93/d;->c:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_6
    :goto_0
    const-string v1, "equals"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lm93/d;->b:Ljava/util/Map;

    const/4 v3, 0x0

    if-eqz v1, :cond_16

    if-eqz p3, :cond_16

    array-length v1, p3

    const/4 v4, 0x1

    if-ne v1, v4, :cond_16

    invoke-static {p3}, Lm83/n;->M0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/annotation/Annotation;

    const/4 p3, 0x0

    if-eqz p2, :cond_7

    move-object p2, p1

    check-cast p2, Ljava/lang/annotation/Annotation;

    goto :goto_1

    :cond_7
    move-object p2, p3

    :goto_1
    if-eqz p2, :cond_8

    invoke-static {p2}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object p2

    invoke-static {p2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p2

    goto :goto_2

    :cond_8
    move-object p2, p3

    :goto_2
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_15

    iget-object p2, p0, Lm93/d;->e:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_a

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    move p1, v4

    goto/16 :goto_4

    :cond_a
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v1, [Z

    if-eqz v5, :cond_c

    check-cast v1, [Z

    const-string v5, "null cannot be cast to non-null type kotlin.BooleanArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Z

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result v0

    goto/16 :goto_3

    :cond_c
    instance-of v5, v1, [C

    if-eqz v5, :cond_d

    check-cast v1, [C

    const-string v5, "null cannot be cast to non-null type kotlin.CharArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [C

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v0

    goto/16 :goto_3

    :cond_d
    instance-of v5, v1, [B

    if-eqz v5, :cond_e

    check-cast v1, [B

    const-string v5, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [B

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    goto/16 :goto_3

    :cond_e
    instance-of v5, v1, [S

    if-eqz v5, :cond_f

    check-cast v1, [S

    const-string v5, "null cannot be cast to non-null type kotlin.ShortArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [S

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([S[S)Z

    move-result v0

    goto :goto_3

    :cond_f
    instance-of v5, v1, [I

    if-eqz v5, :cond_10

    check-cast v1, [I

    const-string v5, "null cannot be cast to non-null type kotlin.IntArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [I

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v0

    goto :goto_3

    :cond_10
    instance-of v5, v1, [F

    if-eqz v5, :cond_11

    check-cast v1, [F

    const-string v5, "null cannot be cast to non-null type kotlin.FloatArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [F

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v0

    goto :goto_3

    :cond_11
    instance-of v5, v1, [J

    if-eqz v5, :cond_12

    check-cast v1, [J

    const-string v5, "null cannot be cast to non-null type kotlin.LongArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [J

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v0

    goto :goto_3

    :cond_12
    instance-of v5, v1, [D

    if-eqz v5, :cond_13

    check-cast v1, [D

    const-string v5, "null cannot be cast to non-null type kotlin.DoubleArray"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [D

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([D[D)Z

    move-result v0

    goto :goto_3

    :cond_13
    instance-of v5, v1, [Ljava/lang/Object;

    if-eqz v5, :cond_14

    check-cast v1, [Ljava/lang/Object;

    const-string v5, "null cannot be cast to non-null type kotlin.Array<*>"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_14
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_3
    if-nez v0, :cond_b

    move p1, v3

    :goto_4
    if-eqz p1, :cond_15

    move v3, v4

    :cond_15
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_16
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_17
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method is not supported: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " (args: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_18

    new-array p3, v3, [Ljava/lang/Object;

    :cond_18
    invoke-static {p3}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method
