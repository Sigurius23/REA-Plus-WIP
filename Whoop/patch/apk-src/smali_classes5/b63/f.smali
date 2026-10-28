.class public final Lb63/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lb63/c;

.field public static final d:Lo63/a;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb63/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb63/f;->c:Lb63/c;

    new-instance v0, Lo63/a;

    const-string v1, "ContentNegotiation"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb63/f;->d:Lo63/a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Set;)V
    .locals 1

    const-string v0, "registrations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoredTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb63/f;->a:Ljava/util/List;

    iput-object p2, p0, Lb63/f;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Le63/d;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lb63/d;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lb63/d;

    iget v5, v4, Lb63/d;->H:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lb63/d;->H:I

    goto :goto_0

    :cond_0
    new-instance v4, Lb63/d;

    invoke-direct {v4, v0, v3}, Lb63/d;-><init>(Lb63/f;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lb63/d;->F:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lb63/d;->H:I

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v1, v4, Lb63/d;->E:Ljava/util/Iterator;

    iget-object v2, v4, Lb63/d;->z:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object v6, v4, Lb63/d;->y:Li63/d;

    iget-object v9, v4, Lb63/d;->x:Ljava/lang/Object;

    iget-object v10, v4, Lb63/d;->w:Le63/d;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move-object v12, v6

    move-object v4, v1

    move-object v1, v10

    move-object v10, v2

    move-object v2, v9

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lb63/f;->a:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb63/a;

    iget-object v9, v9, Lb63/a;->b:Li63/d;

    const-string v10, "<this>"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v1, Le63/d;->c:Li63/n;

    sget-object v11, Li63/r;->a:Ljava/util/List;

    const-string v11, "Accept"

    invoke-virtual {v9}, Li63/j;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v11, v9}, Lal/a;->s0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    instance-of v6, v2, Lj63/d;

    if-nez v6, :cond_14

    iget-object v6, v0, Lb63/f;->b:Ljava/util/Set;

    check-cast v6, Ljava/lang/Iterable;

    instance-of v9, v6, Ljava/util/Collection;

    if-eqz v9, :cond_4

    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj93/d;

    invoke-interface {v9, v2}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_5

    :cond_6
    :goto_2
    invoke-static {v1}, Lts/o;->i(Le63/d;)Li63/d;

    move-result-object v6

    iget-object v9, v1, Le63/d;->c:Li63/n;

    if-nez v6, :cond_7

    goto :goto_5

    :cond_7
    instance-of v10, v2, Ll83/a0;

    const-string v11, "Content-Type"

    if-eqz v10, :cond_8

    sget-object v1, Li63/r;->a:Ljava/util/List;

    iget-object v1, v9, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v11}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lg63/c;->a:Lg63/c;

    return-object v1

    :cond_8
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lb63/a;

    iget-object v13, v13, Lb63/a;->c:Li63/e;

    invoke-interface {v13, v6}, Li63/e;->a(Li63/d;)Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_4

    :cond_b
    move-object v10, v8

    :goto_4
    if-nez v10, :cond_c

    goto :goto_5

    :cond_c
    iget-object v3, v1, Le63/d;->f:Lo63/f;

    sget-object v12, Le63/h;->a:Lo63/a;

    invoke-virtual {v3, v12}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls63/a;

    if-nez v3, :cond_d

    :goto_5
    return-object v8

    :cond_d
    sget-object v3, Li63/r;->a:Ljava/util/List;

    iget-object v3, v9, Lal/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3, v11}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v12, v6

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb63/a;

    iget-object v11, v6, Lb63/a;->a:Lk63/b;

    invoke-static {v12}, Lpf/c;->m(Li63/d;)Ljava/nio/charset/Charset;

    move-result-object v6

    if-nez v6, :cond_e

    sget-object v6, Lyb3/a;->a:Ljava/nio/charset/Charset;

    :cond_e
    move-object v13, v6

    iget-object v6, v1, Le63/d;->f:Lo63/f;

    sget-object v9, Le63/h;->a:Lo63/a;

    invoke-virtual {v6, v9}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Ls63/a;

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v6, Lj63/a;->a:Lj63/a;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    move-object v15, v2

    goto :goto_7

    :cond_f
    move-object v15, v8

    :goto_7
    iput-object v1, v4, Lb63/d;->w:Le63/d;

    iput-object v2, v4, Lb63/d;->x:Ljava/lang/Object;

    iput-object v12, v4, Lb63/d;->y:Li63/d;

    move-object v6, v10

    check-cast v6, Ljava/util/List;

    iput-object v6, v4, Lb63/d;->z:Ljava/util/List;

    iput-object v3, v4, Lb63/d;->E:Ljava/util/Iterator;

    iput v7, v4, Lb63/d;->H:I

    move-object/from16 v16, v4

    invoke-interface/range {v11 .. v16}, Lk63/b;->a(Li63/d;Ljava/nio/charset/Charset;Ls63/a;Ljava/lang/Object;Lb63/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_10

    return-object v5

    :cond_10
    move-object/from16 v17, v4

    move-object v4, v3

    move-object/from16 v3, v17

    :goto_8
    check-cast v3, Lj63/d;

    if-eqz v3, :cond_11

    move-object v8, v3

    goto :goto_9

    :cond_11
    move-object v3, v4

    move-object/from16 v4, v16

    goto :goto_6

    :cond_12
    :goto_9
    if-eqz v8, :cond_13

    return-object v8

    :cond_13
    new-instance v1, Lio/ktor/client/plugins/contentnegotiation/ContentConverterException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t convert "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with contentType "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " using converters "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v10

    check-cast v4, Ljava/lang/Iterable;

    sget-object v8, Lb63/e;->w:Lb63/e;

    const/16 v9, 0x1f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lio/ktor/client/plugins/contentnegotiation/ContentConverterException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    return-object v8
.end method
