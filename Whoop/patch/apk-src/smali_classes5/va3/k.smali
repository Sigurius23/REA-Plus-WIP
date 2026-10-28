.class public final Lva3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lva3/c;

.field public static final a:Lva3/e;

.field public static final b:Lva3/e;

.field public static final c:Lva3/e;

.field public static final d:Lva3/e;

.field public static final e:Lva3/e;

.field public static final f:Lva3/e;

.field public static final g:Lva3/e;

.field public static final h:Lva3/e;

.field public static final i:Lva3/c;

.field public static final j:Lva3/c;

.field public static final k:Lva3/c;

.field public static final l:Lva3/c;

.field public static final m:Lva3/c;

.field public static final n:Lva3/c;

.field public static final o:Lva3/c;

.field public static final p:Lva3/c;

.field public static final q:Lva3/c;

.field public static final r:Lva3/c;

.field public static final s:Lva3/c;

.field public static final t:Lva3/c;

.field public static final u:Lva3/c;

.field public static final v:Ljava/util/Set;

.field public static final w:Ljava/util/Set;

.field public static final x:Lva3/c;

.field public static final y:Lva3/c;

.field public static final z:Lva3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lva3/e;

    const-string v1, "kotlin"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lva3/k;->a:Lva3/e;

    const-string v1, "reflect"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v4

    sput-object v4, Lva3/k;->b:Lva3/e;

    const-string v1, "experimental"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v1, "collections"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v1

    sput-object v1, Lva3/k;->c:Lva3/e;

    const-string v2, "sequences"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v2, "ranges"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v2

    sput-object v2, Lva3/k;->d:Lva3/e;

    const-string v3, "jvm"

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    invoke-virtual {v0, v5}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v5

    const-string v6, "js"

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v0, v6}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v6, "annotations"

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v0, v6}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v6

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v3

    invoke-virtual {v6, v3}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v3, "internal"

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v5, v6}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v6, "functions"

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v5, v6}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v5, "annotation"

    invoke-static {v5}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    invoke-virtual {v0, v5}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v5

    sput-object v5, Lva3/k;->e:Lva3/e;

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v3

    invoke-virtual {v0, v3}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v3

    const-string v6, "ir"

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v3, v6}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v6, "coroutines"

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v0, v6}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v6

    sput-object v6, Lva3/k;->f:Lva3/e;

    const-string v7, "intrinsics"

    invoke-static {v7}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v7

    invoke-virtual {v6, v7}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v7, "enums"

    invoke-static {v7}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v7

    invoke-virtual {v0, v7}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v7

    sput-object v7, Lva3/k;->g:Lva3/e;

    const-string v7, "contracts"

    invoke-static {v7}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v7

    invoke-virtual {v0, v7}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v7, "concurrent"

    invoke-static {v7}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v7

    invoke-virtual {v0, v7}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v7

    const-string v8, "atomics"

    invoke-static {v8}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    invoke-virtual {v7, v8}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v7

    sput-object v7, Lva3/k;->h:Lva3/e;

    const-string v8, "test"

    invoke-static {v8}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    invoke-virtual {v0, v8}, Lva3/e;->a(Lva3/h;)Lva3/e;

    const-string v8, "text"

    invoke-static {v8}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    invoke-virtual {v0, v8}, Lva3/e;->a(Lva3/h;)Lva3/e;

    filled-new-array {v0, v1, v2, v5}, [Lva3/e;

    move-result-object v8

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-object v9, v5

    move-object v5, v3

    move-object v3, v9

    filled-new-array/range {v0 .. v7}, [Lva3/e;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    const-string v0, "Nothing"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "Unit"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->i:Lva3/c;

    const-string v0, "Any"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->j:Lva3/c;

    const-string v0, "Enum"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->k:Lva3/c;

    const-string v0, "Annotation"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "Array"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->l:Lva3/c;

    const-string v0, "Boolean"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v1

    sput-object v1, Lva3/k;->m:Lva3/c;

    const-string v0, "Char"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v2

    const-string v0, "Byte"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v3

    const-string v0, "Short"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v4

    const-string v0, "Int"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v5

    sput-object v5, Lva3/k;->n:Lva3/c;

    const-string v0, "Long"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v6

    sput-object v6, Lva3/k;->o:Lva3/c;

    const-string v0, "Float"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v7

    const-string v0, "Double"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v8

    invoke-static {v3}, Lva3/l;->g(Lva3/c;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->p:Lva3/c;

    invoke-static {v4}, Lva3/l;->g(Lva3/c;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->q:Lva3/c;

    invoke-static {v5}, Lva3/l;->g(Lva3/c;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->r:Lva3/c;

    invoke-static {v6}, Lva3/l;->g(Lva3/c;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->s:Lva3/c;

    const-string v0, "CharSequence"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "String"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->t:Lva3/c;

    const-string v0, "Throwable"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "Cloneable"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "KProperty"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KMutableProperty"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KProperty0"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KMutableProperty0"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KProperty1"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KMutableProperty1"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KProperty2"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KMutableProperty2"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KFunction"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    move-result-object v0

    sput-object v0, Lva3/k;->u:Lva3/c;

    const-string v0, "KClass"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KCallable"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "KType"

    invoke-static {v0}, Lva3/l;->f(Ljava/lang/String;)Lva3/c;

    const-string v0, "Comparable"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "Number"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    const-string v0, "Function"

    invoke-static {v0}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    filled-new-array/range {v1 .. v8}, [Lva3/c;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lva3/k;->v:Ljava/util/Set;

    filled-new-array {v3, v4, v5, v6}, [Lva3/c;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    const/16 v4, 0x10

    if-ge v3, v4, :cond_0

    move v3, v4

    :cond_0
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lva3/c;

    invoke-virtual {v5}, Lva3/c;->f()Lva3/h;

    move-result-object v5

    invoke-static {v5}, Lva3/l;->e(Lva3/h;)Lva3/c;

    move-result-object v5

    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lva3/l;->d(Ljava/util/LinkedHashMap;)V

    sget-object v0, Lva3/k;->p:Lva3/c;

    sget-object v1, Lva3/k;->q:Lva3/c;

    sget-object v3, Lva3/k;->r:Lva3/c;

    sget-object v5, Lva3/k;->s:Lva3/c;

    filled-new-array {v0, v1, v3, v5}, [Lva3/c;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lva3/k;->w:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    if-ge v2, v4, :cond_2

    goto :goto_1

    :cond_2
    move v4, v2

    :goto_1
    invoke-direct {v1, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lva3/c;

    invoke-virtual {v3}, Lva3/c;->f()Lva3/h;

    move-result-object v3

    invoke-static {v3}, Lva3/l;->e(Lva3/h;)Lva3/c;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lva3/l;->d(Ljava/util/LinkedHashMap;)V

    sget-object v0, Lva3/k;->v:Ljava/util/Set;

    sget-object v1, Lva3/k;->w:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v2

    sget-object v3, Lva3/k;->t:Lva3/c;

    invoke-static {v3, v2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    sget-object v2, Lva3/k;->f:Lva3/e;

    const-string v4, "Continuation"

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    const-string v5, "packageFqName"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lva3/e;->c:Lva3/e;

    invoke-static {v4}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v2

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->c()Z

    const-string v2, "Iterator"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v2, "Iterable"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v2, "Collection"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v2, "List"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v2, "ListIterator"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v2, "Set"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v2, "Map"

    invoke-static {v2}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    move-result-object v2

    const-string v4, "AbstractMap"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v4, "MutableIterator"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v4, "CharIterator"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v4, "MutableIterable"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v4, "MutableCollection"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v4, "MutableList"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    move-result-object v4

    sput-object v4, Lva3/k;->x:Lva3/c;

    const-string v4, "MutableListIterator"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    const-string v4, "MutableSet"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    move-result-object v4

    sput-object v4, Lva3/k;->y:Lva3/c;

    const-string v4, "MutableMap"

    invoke-static {v4}, Lva3/l;->c(Ljava/lang/String;)Lva3/c;

    move-result-object v4

    sput-object v4, Lva3/k;->z:Lva3/c;

    const-string v6, "Entry"

    invoke-static {v6}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    invoke-virtual {v2, v6}, Lva3/c;->d(Lva3/h;)Lva3/c;

    const-string v2, "MutableEntry"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-virtual {v4, v2}, Lva3/c;->d(Lva3/h;)Lva3/c;

    const-string v2, "Result"

    invoke-static {v2}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    sget-object v2, Lva3/k;->d:Lva3/e;

    const-string v4, "IntRange"

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v4

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    invoke-virtual {v4}, Lva3/f;->c()Z

    const-string v4, "LongRange"

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v4

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    invoke-virtual {v4}, Lva3/f;->c()Z

    const-string v4, "CharRange"

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v2

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->c()Z

    sget-object v2, Lva3/k;->e:Lva3/e;

    const-string v4, "AnnotationRetention"

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v4

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    invoke-virtual {v4}, Lva3/f;->c()Z

    const-string v4, "AnnotationTarget"

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v2

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->c()Z

    const-string v2, "DeprecationLevel"

    invoke-static {v2}, Lva3/l;->b(Ljava/lang/String;)Lva3/c;

    new-instance v2, Lva3/c;

    sget-object v4, Lva3/k;->g:Lva3/e;

    const-string v5, "EnumEntries"

    invoke-static {v5}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sput-object v2, Lva3/k;->A:Lva3/c;

    const-string v2, "AtomicBoolean"

    invoke-static {v2}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    move-result-object v2

    const-string v4, "AtomicInt"

    invoke-static {v4}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    move-result-object v4

    const-string v5, "AtomicLong"

    invoke-static {v5}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    move-result-object v5

    const-string v6, "AtomicReference"

    invoke-static {v6}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    sget-object v6, Lva3/k;->m:Lva3/c;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lva3/k;->n:Lva3/c;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v4, Lva3/k;->o:Lva3/c;

    new-instance v8, Ll83/k;

    invoke-direct {v8, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v6, v8}, [Ll83/k;

    move-result-object v5

    invoke-static {v5}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    const-string v5, "AtomicArray"

    invoke-static {v5}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    const-string v5, "AtomicIntArray"

    invoke-static {v5}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    move-result-object v5

    const-string v6, "AtomicLongArray"

    invoke-static {v6}, Lva3/l;->a(Ljava/lang/String;)Lva3/c;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v4, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v2}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-static {v3, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    sget-object v1, Lva3/k;->i:Lva3/c;

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    sget-object v1, Lva3/k;->j:Lva3/c;

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    sget-object v1, Lva3/k;->k:Lva3/c;

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    return-void
.end method
