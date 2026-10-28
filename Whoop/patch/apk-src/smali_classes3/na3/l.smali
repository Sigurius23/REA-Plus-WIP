.class public abstract Lna3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna3/d;

.field public static final b:Lna3/d;

.field public static final c:Lna3/d;

.field public static final d:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lna3/d;

    sget-object v1, Lna3/g;->x:Lna3/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lna3/d;-><init>(Lna3/g;Z)V

    sput-object v0, Lna3/l;->a:Lna3/d;

    new-instance v0, Lna3/d;

    sget-object v1, Lna3/g;->y:Lna3/g;

    invoke-direct {v0, v1, v2}, Lna3/d;-><init>(Lna3/g;Z)V

    sput-object v0, Lna3/l;->b:Lna3/d;

    new-instance v0, Lna3/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lna3/d;-><init>(Lna3/g;Z)V

    sput-object v0, Lna3/l;->c:Lna3/d;

    const-string v0, "java/lang/"

    const-string v1, "Object"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "java/util/function/"

    const-string v3, "Predicate"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Function"

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Consumer"

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "BiFunction"

    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "BiConsumer"

    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "UnaryOperator"

    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "java/util/"

    const-string v10, "stream/Stream"

    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "Optional"

    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lbi/p;

    const/4 v13, 0x2

    invoke-direct {v12, v13}, Lbi/p;-><init>(I)V

    const-string v13, "Iterator"

    invoke-virtual {v9, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v14, v12, v13}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v13, Lna3/i;

    const/4 v15, 0x0

    invoke-direct {v13, v5, v15}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v15, "forEachRemaining"

    move-object/from16 v16, v2

    const/4 v2, 0x0

    invoke-virtual {v14, v15, v2, v13}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v13, "Iterable"

    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v14, v12, v13}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v13, Lna3/n;

    const/4 v15, 0x4

    invoke-direct {v13, v15}, Lna3/n;-><init>(I)V

    const-string v15, "spliterator"

    invoke-virtual {v14, v15, v2, v13}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v13, "Collection"

    invoke-virtual {v9, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v14, v12, v13}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v13, Lna3/i;

    const/16 v15, 0x11

    invoke-direct {v13, v3, v15}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v15, "removeIf"

    invoke-virtual {v14, v15, v2, v13}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v13, Lna3/i;

    const/16 v15, 0x1a

    invoke-direct {v13, v10, v15}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v15, "stream"

    invoke-virtual {v14, v15, v2, v13}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v13, Lna3/k;

    const/4 v15, 0x1

    invoke-direct {v13, v10, v15}, Lna3/k;-><init>(Ljava/lang/String;I)V

    const-string v10, "parallelStream"

    invoke-virtual {v14, v10, v2, v13}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v10, "List"

    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v13, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v13, v12, v10}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v10, Lna3/k;

    const/4 v14, 0x2

    invoke-direct {v10, v8, v14}, Lna3/k;-><init>(Ljava/lang/String;I)V

    const-string v8, "replaceAll"

    invoke-virtual {v13, v8, v2, v10}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v10, Lna3/k;

    const/4 v14, 0x3

    invoke-direct {v10, v1, v14}, Lna3/k;-><init>(Ljava/lang/String;I)V

    const-string v14, "addFirst"

    const-string v15, "2.1"

    invoke-virtual {v13, v14, v15, v10}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v10, Lna3/k;

    const/4 v2, 0x4

    invoke-direct {v10, v1, v2}, Lna3/k;-><init>(Ljava/lang/String;I)V

    const-string v2, "addLast"

    invoke-virtual {v13, v2, v15, v10}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v10, Lna3/k;

    move-object/from16 v17, v3

    const/4 v3, 0x5

    invoke-direct {v10, v1, v3}, Lna3/k;-><init>(Ljava/lang/String;I)V

    const-string v3, "removeFirst"

    invoke-virtual {v13, v3, v15, v10}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v10, Lna3/k;

    move-object/from16 v18, v0

    const/4 v0, 0x6

    invoke-direct {v10, v1, v0}, Lna3/k;-><init>(Ljava/lang/String;I)V

    const-string v0, "removeLast"

    invoke-virtual {v13, v0, v15, v10}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v10, "LinkedList"

    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v13, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v13, v12, v10}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v10, Lna3/i;

    move-object/from16 v19, v5

    const/4 v5, 0x1

    invoke-direct {v10, v1, v5}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v14, v15, v10}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Lna3/i;

    const/4 v10, 0x2

    invoke-direct {v5, v1, v10}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v2, v15, v5}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Lna3/i;

    const/4 v10, 0x3

    invoke-direct {v5, v1, v10}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v3, v15, v5}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Lna3/i;

    const/4 v10, 0x4

    invoke-direct {v5, v1, v10}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v0, v15, v5}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v5, "LinkedHashSet"

    invoke-virtual {v9, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v10, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v10, v12, v5}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v5, Lna3/i;

    const/4 v13, 0x5

    invoke-direct {v5, v1, v13}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v13, "2.2"

    invoke-virtual {v10, v14, v13, v5}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Lna3/i;

    const/4 v14, 0x6

    invoke-direct {v5, v1, v14}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v10, v2, v13, v5}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lna3/i;

    const/4 v5, 0x7

    invoke-direct {v2, v1, v5}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v10, v3, v13, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lna3/i;

    const/16 v3, 0x8

    invoke-direct {v2, v1, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v10, v0, v13, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v2, "getFirst"

    invoke-virtual {v10, v2, v13, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v2, "getLast"

    invoke-virtual {v10, v2, v13, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "Map"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v12, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v0, Lna3/i;

    const/16 v3, 0xb

    invoke-direct {v0, v7, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "forEach"

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v3, 0xc

    invoke-direct {v0, v1, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "putIfAbsent"

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v3, 0xd

    invoke-direct {v0, v1, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "replace"

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v10, 0xe

    invoke-direct {v0, v1, v10}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v3, 0xf

    invoke-direct {v0, v6, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v8, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/j;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v6, v3}, Lna3/j;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "compute"

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/j;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v4, v3}, Lna3/j;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "computeIfAbsent"

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/j;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v6, v3}, Lna3/j;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "computeIfPresent"

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/j;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v6, v3}, Lna3/j;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "merge"

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "LinkedHashMap"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v12, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v0, Lna3/i;

    const/16 v3, 0x10

    invoke-direct {v0, v1, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "putFirst"

    invoke-virtual {v2, v3, v13, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lna3/i;

    const/16 v3, 0x12

    invoke-direct {v0, v1, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "putLast"

    invoke-virtual {v2, v3, v13, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, v12, v11}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v2, Lna3/i;

    const/16 v3, 0x13

    invoke-direct {v2, v11, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "empty"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lna3/j;

    const/4 v3, 0x4

    invoke-direct {v2, v1, v11, v3}, Lna3/j;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "of"

    invoke-virtual {v0, v3, v5, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lna3/j;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v11, v3}, Lna3/j;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v3, "ofNullable"

    invoke-virtual {v0, v3, v5, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lna3/i;

    const/16 v3, 0x14

    invoke-direct {v2, v1, v3}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v3, "get"

    invoke-virtual {v0, v3, v5, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lna3/i;

    const/16 v8, 0x15

    move-object/from16 v9, v19

    invoke-direct {v2, v9, v8}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v8, "ifPresent"

    invoke-virtual {v0, v8, v5, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "ref/Reference"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v12, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v0, Lna3/i;

    const/16 v8, 0x16

    invoke-direct {v0, v1, v8}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    move-object/from16 v2, v17

    invoke-direct {v0, v12, v2}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v2, Lna3/i;

    const/16 v8, 0x17

    invoke-direct {v2, v1, v8}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v8, "test"

    invoke-virtual {v0, v8, v5, v2}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "BiPredicate"

    move-object/from16 v2, v16

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v10, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v10, v12, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v0, Lna3/i;

    const/16 v11, 0x18

    invoke-direct {v0, v1, v11}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v10, v8, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, v12, v9}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v8, Lna3/i;

    const/16 v9, 0x19

    invoke-direct {v8, v1, v9}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v9, "accept"

    invoke-virtual {v0, v9, v5, v8}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, v12, v7}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v7, Lna3/i;

    const/16 v8, 0x1b

    invoke-direct {v7, v1, v8}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v9, v5, v7}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, v12, v4}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v4, Lna3/i;

    const/16 v7, 0x1c

    invoke-direct {v4, v1, v7}, Lna3/i;-><init>(Ljava/lang/String;I)V

    const-string v7, "apply"

    invoke-virtual {v0, v7, v5, v4}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, v12, v6}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v4, Lna3/i;

    const/16 v6, 0x1d

    invoke-direct {v4, v1, v6}, Lna3/i;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v7, v5, v4}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "Supplier"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v12, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lbi/p;Ljava/lang/String;)V

    new-instance v0, Lna3/k;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4}, Lna3/k;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3, v5, v0}, Lio/sentry/internal/debugmeta/c;->q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v12, Lbi/p;->a:Ljava/util/LinkedHashMap;

    sput-object v0, Lna3/l;->d:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final a()Ljava/util/LinkedHashMap;
    .locals 1

    sget-object v0, Lna3/l;->d:Ljava/util/LinkedHashMap;

    return-object v0
.end method
