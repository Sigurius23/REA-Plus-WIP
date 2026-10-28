.class public abstract Lpg3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lpg3/u0;

.field public final b:Lud3/i;

.field public final c:Lpg3/n;


# direct methods
.method public constructor <init>(Lpg3/u0;Lud3/i;Lpg3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/v;->a:Lpg3/u0;

    iput-object p2, p0, Lpg3/v;->b:Lud3/i;

    iput-object p3, p0, Lpg3/v;->c:Lpg3/n;

    return-void
.end method

.method public static b(Lpg3/y0;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lpg3/v;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    new-instance v7, Lpg3/t0;

    move-object/from16 v1, p1

    invoke-direct {v7, v0, v1, v2}, Lpg3/t0;-><init>(Lpg3/y0;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    iget-object v8, v7, Lpg3/t0;->d:[Ljava/lang/annotation/Annotation;

    array-length v1, v8

    const/4 v9, 0x0

    move v3, v9

    :goto_0
    const-string v10, "HEAD"

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-ge v3, v1, :cond_12

    aget-object v4, v8, v3

    instance-of v5, v4, Lwg3/b;

    if-eqz v5, :cond_0

    check-cast v4, Lwg3/b;

    invoke-interface {v4}, Lwg3/b;->value()Ljava/lang/String;

    move-result-object v4

    const-string v5, "DELETE"

    invoke-virtual {v7, v5, v4, v9}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_0
    instance-of v5, v4, Lwg3/f;

    if-eqz v5, :cond_1

    check-cast v4, Lwg3/f;

    invoke-interface {v4}, Lwg3/f;->value()Ljava/lang/String;

    move-result-object v4

    const-string v5, "GET"

    invoke-virtual {v7, v5, v4, v9}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_1
    instance-of v5, v4, Lwg3/g;

    if-eqz v5, :cond_2

    check-cast v4, Lwg3/g;

    invoke-interface {v4}, Lwg3/g;->value()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v10, v4, v9}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_2
    instance-of v5, v4, Lwg3/n;

    if-eqz v5, :cond_3

    check-cast v4, Lwg3/n;

    invoke-interface {v4}, Lwg3/n;->value()Ljava/lang/String;

    move-result-object v4

    const-string v5, "PATCH"

    invoke-virtual {v7, v5, v4, v11}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_3
    instance-of v5, v4, Lwg3/o;

    if-eqz v5, :cond_4

    check-cast v4, Lwg3/o;

    invoke-interface {v4}, Lwg3/o;->value()Ljava/lang/String;

    move-result-object v4

    const-string v5, "POST"

    invoke-virtual {v7, v5, v4, v11}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_4
    instance-of v5, v4, Lwg3/p;

    if-eqz v5, :cond_5

    check-cast v4, Lwg3/p;

    invoke-interface {v4}, Lwg3/p;->value()Ljava/lang/String;

    move-result-object v4

    const-string v5, "PUT"

    invoke-virtual {v7, v5, v4, v11}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_5
    instance-of v5, v4, Lwg3/m;

    if-eqz v5, :cond_6

    check-cast v4, Lwg3/m;

    invoke-interface {v4}, Lwg3/m;->value()Ljava/lang/String;

    move-result-object v4

    const-string v5, "OPTIONS"

    invoke-virtual {v7, v5, v4, v9}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_6
    instance-of v5, v4, Lwg3/h;

    if-eqz v5, :cond_7

    check-cast v4, Lwg3/h;

    invoke-interface {v4}, Lwg3/h;->method()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Lwg3/h;->path()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4}, Lwg3/h;->hasBody()Z

    move-result v4

    invoke-virtual {v7, v5, v6, v4}, Lpg3/t0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    :cond_7
    instance-of v5, v4, Lwg3/k;

    if-eqz v5, :cond_d

    check-cast v4, Lwg3/k;

    invoke-interface {v4}, Lwg3/k;->value()[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    if-eqz v6, :cond_c

    invoke-interface {v4}, Lwg3/k;->allowUnsafeNonAsciiValues()Z

    move-result v4

    new-instance v6, Lkotlin/jvm/internal/k0;

    const/4 v10, 0x2

    invoke-direct {v6, v10, v9}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    array-length v10, v5

    move v13, v9

    :goto_1
    if-ge v13, v10, :cond_b

    aget-object v14, v5, v13

    const/16 v15, 0x3a

    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    move/from16 p1, v11

    const/4 v11, -0x1

    if-eq v15, v11, :cond_a

    if-eqz v15, :cond_a

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    if-eq v15, v11, :cond_a

    invoke-virtual {v14, v9, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v15, v15, 0x1

    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    const-string v15, "Content-Type"

    invoke-virtual {v15, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_8

    :try_start_0
    sget-object v11, Lud3/h0;->e:Lyb3/p;

    invoke-static {v14}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v11

    iput-object v11, v7, Lpg3/t0;->u:Lud3/h0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Malformed content type: %s"

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v0, v1, v3}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_8
    if-eqz v4, :cond_9

    invoke-virtual {v6, v11, v14}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    invoke-virtual {v6, v11, v14}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v13, v13, 0x1

    move/from16 v11, p1

    goto :goto_1

    :cond_a
    const-string v0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v12, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_b
    invoke-virtual {v6}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v4

    iput-object v4, v7, Lpg3/t0;->t:Lud3/d0;

    goto :goto_3

    :cond_c
    const-string v0, "@Headers annotation is empty."

    new-array v1, v9, [Ljava/lang/Object;

    invoke-static {v2, v12, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_d
    move/from16 p1, v11

    instance-of v5, v4, Lwg3/l;

    const-string v6, "Only one encoding annotation is allowed."

    if-eqz v5, :cond_f

    iget-boolean v4, v7, Lpg3/t0;->q:Z

    if-nez v4, :cond_e

    move/from16 v5, p1

    iput-boolean v5, v7, Lpg3/t0;->r:Z

    goto :goto_3

    :cond_e
    new-array v0, v9, [Ljava/lang/Object;

    invoke-static {v2, v12, v6, v0}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_f
    move/from16 v5, p1

    instance-of v4, v4, Lwg3/e;

    if-eqz v4, :cond_11

    iget-boolean v4, v7, Lpg3/t0;->r:Z

    if-nez v4, :cond_10

    iput-boolean v5, v7, Lpg3/t0;->q:Z

    goto :goto_3

    :cond_10
    new-array v0, v9, [Ljava/lang/Object;

    invoke-static {v2, v12, v6, v0}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_11
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_12
    iget-object v1, v7, Lpg3/t0;->o:Ljava/lang/String;

    if-eqz v1, :cond_80

    iget-boolean v1, v7, Lpg3/t0;->p:Z

    if-nez v1, :cond_15

    iget-boolean v1, v7, Lpg3/t0;->r:Z

    if-nez v1, :cond_14

    iget-boolean v1, v7, Lpg3/t0;->q:Z

    if-nez v1, :cond_13

    goto :goto_4

    :cond_13
    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v1, v9, [Ljava/lang/Object;

    invoke-static {v2, v12, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_14
    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v1, v9, [Ljava/lang/Object;

    invoke-static {v2, v12, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_15
    :goto_4
    iget-object v11, v7, Lpg3/t0;->e:[[Ljava/lang/annotation/Annotation;

    array-length v13, v11

    new-array v1, v13, [Lpg3/e1;

    iput-object v1, v7, Lpg3/t0;->w:[Lpg3/e1;

    add-int/lit8 v14, v13, -0x1

    move v3, v9

    :goto_5
    if-ge v3, v13, :cond_69

    iget-object v1, v7, Lpg3/t0;->w:[Lpg3/e1;

    iget-object v4, v7, Lpg3/t0;->f:[Ljava/lang/reflect/Type;

    aget-object v4, v4, v3

    aget-object v5, v11, v3

    if-ne v3, v14, :cond_16

    const/16 v21, 0x1

    goto :goto_6

    :cond_16
    move/from16 v21, v9

    :goto_6
    if-eqz v5, :cond_66

    array-length v6, v5

    move v15, v9

    move-object/from16 v22, v12

    :goto_7
    if-ge v15, v6, :cond_65

    aget-object v12, v5, v15

    instance-of v9, v12, Lwg3/y;

    move-object/from16 v23, v1

    const-string v1, "@Path parameters may not be used with @Url."

    move/from16 v24, v6

    const-class v6, Ljava/lang/String;

    if-eqz v9, :cond_1f

    invoke-virtual {v7, v3, v4}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v9, v7, Lpg3/t0;->n:Z

    if-nez v9, :cond_1e

    iget-boolean v9, v7, Lpg3/t0;->j:Z

    if-nez v9, :cond_1d

    iget-boolean v1, v7, Lpg3/t0;->k:Z

    if-nez v1, :cond_1c

    iget-boolean v1, v7, Lpg3/t0;->l:Z

    if-nez v1, :cond_1b

    iget-boolean v1, v7, Lpg3/t0;->m:Z

    if-nez v1, :cond_1a

    iget-object v1, v7, Lpg3/t0;->s:Ljava/lang/String;

    if-nez v1, :cond_19

    const/4 v1, 0x1

    iput-boolean v1, v7, Lpg3/t0;->n:Z

    const-class v1, Lud3/e0;

    if-eq v4, v1, :cond_18

    if-eq v4, v6, :cond_18

    const-class v1, Ljava/net/URI;

    if-eq v4, v1, :cond_18

    instance-of v1, v4, Ljava/lang/Class;

    if-eqz v1, :cond_17

    move-object v1, v4

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v6, "android.net.Uri"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_8

    :cond_17
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_18
    :goto_8
    new-instance v1, Lpg3/i0;

    const/4 v6, 0x1

    invoke-direct {v1, v2, v3, v6}, Lpg3/i0;-><init>(Ljava/lang/reflect/Method;II)V

    move-object/from16 v19, v10

    move-object/from16 v17, v11

    move/from16 v16, v13

    move/from16 v18, v14

    move/from16 v25, v15

    move-object v13, v4

    move-object v10, v5

    :goto_9
    move v4, v3

    :goto_a
    move-object v3, v2

    goto/16 :goto_13

    :cond_19
    iget-object v0, v7, Lpg3/t0;->o:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "@Url cannot be used with @%s URL"

    invoke-static {v2, v3, v1, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1a
    const-string v0, "A @Url parameter must not come after a @QueryMap."

    const/4 v4, 0x0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1b
    const/4 v4, 0x0

    const-string v0, "A @Url parameter must not come after a @QueryName."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1c
    const/4 v4, 0x0

    const-string v0, "A @Url parameter must not come after a @Query."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v4, 0x0

    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v1, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1e
    const/4 v4, 0x0

    const-string v0, "Multiple @Url method annotations found."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1f
    instance-of v9, v12, Lwg3/s;

    move/from16 v16, v9

    iget-object v9, v7, Lpg3/t0;->a:Lpg3/y0;

    if-eqz v16, :cond_27

    invoke-virtual {v7, v3, v4}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v6, v7, Lpg3/t0;->k:Z

    if-nez v6, :cond_26

    iget-boolean v6, v7, Lpg3/t0;->l:Z

    if-nez v6, :cond_25

    iget-boolean v6, v7, Lpg3/t0;->m:Z

    if-nez v6, :cond_24

    iget-boolean v6, v7, Lpg3/t0;->n:Z

    if-nez v6, :cond_23

    iget-object v1, v7, Lpg3/t0;->s:Ljava/lang/String;

    if-eqz v1, :cond_22

    const/4 v1, 0x1

    iput-boolean v1, v7, Lpg3/t0;->j:Z

    check-cast v12, Lwg3/s;

    invoke-interface {v12}, Lwg3/s;->value()Ljava/lang/String;

    move-result-object v1

    sget-object v6, Lpg3/t0;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_21

    iget-object v6, v7, Lpg3/t0;->v:Ljava/util/LinkedHashSet;

    invoke-interface {v6, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-virtual {v9, v4, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v19

    move v9, v15

    new-instance v15, Lpg3/k0;

    iget-object v6, v7, Lpg3/t0;->c:Ljava/lang/reflect/Method;

    invoke-interface {v12}, Lwg3/s;->encoded()Z

    move-result v20

    move-object/from16 v18, v1

    move/from16 v17, v3

    move-object/from16 v16, v6

    move/from16 v25, v9

    invoke-direct/range {v15 .. v20}, Lpg3/k0;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Lpg3/n;Z)V

    move-object v3, v2

    move-object/from16 v19, v10

    move/from16 v16, v13

    move/from16 v18, v14

    move-object v1, v15

    move-object v13, v4

    move-object v10, v5

    move/from16 v4, v17

    move-object/from16 v17, v11

    goto/16 :goto_13

    :cond_20
    iget-object v0, v7, Lpg3/t0;->s:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "URL \"%s\" does not contain \"{%s}\"."

    invoke-static {v2, v3, v1, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_21
    sget-object v0, Lpg3/t0;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "@Path parameter name must match %s. Found: %s"

    invoke-static {v2, v3, v1, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_22
    iget-object v0, v7, Lpg3/t0;->o:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "@Path can only be used with relative url on @%s"

    invoke-static {v2, v3, v1, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_23
    const/4 v4, 0x0

    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v1, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_24
    const/4 v4, 0x0

    const-string v0, "A @Path parameter must not come after a @QueryMap."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_25
    const/4 v4, 0x0

    const-string v0, "A @Path parameter must not come after a @QueryName."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_26
    const/4 v4, 0x0

    const-string v0, "A @Path parameter must not come after a @Query."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_27
    move/from16 v25, v15

    instance-of v1, v12, Lwg3/t;

    const-string v15, "<String>)"

    move/from16 v16, v1

    const-string v1, " must include generic type (e.g., "

    move-object/from16 v17, v11

    const-class v11, Ljava/lang/Iterable;

    if-eqz v16, :cond_2b

    invoke-virtual {v7, v3, v4}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    check-cast v12, Lwg3/t;

    invoke-interface {v12}, Lwg3/t;->value()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v12}, Lwg3/t;->encoded()Z

    move-result v12

    move/from16 v16, v13

    invoke-static {v4}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v13

    move/from16 v18, v14

    const/4 v14, 0x1

    iput-boolean v14, v7, Lpg3/t0;->k:Z

    invoke-virtual {v11, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_29

    instance-of v11, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_28

    move-object v1, v4

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    invoke-static {v11, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/g0;

    invoke-direct {v9, v6, v1, v12, v14}, Lpg3/g0;-><init>(Ljava/lang/String;Lpg3/n;ZI)V

    new-instance v1, Lpg3/c0;

    invoke-direct {v1, v9, v11}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    :goto_b
    move-object v13, v4

    :goto_c
    move-object/from16 v19, v10

    move v4, v3

    move-object v10, v5

    goto/16 :goto_a

    :cond_28
    const/4 v11, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_29
    invoke-virtual {v13}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual {v13}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lpg3/t0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/g0;

    const/4 v14, 0x1

    invoke-direct {v9, v6, v1, v12, v14}, Lpg3/g0;-><init>(Ljava/lang/String;Lpg3/n;ZI)V

    new-instance v1, Lpg3/c0;

    invoke-direct {v1, v9, v14}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto :goto_b

    :cond_2a
    const/4 v14, 0x1

    invoke-virtual {v9, v4, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/g0;

    invoke-direct {v9, v6, v1, v12, v14}, Lpg3/g0;-><init>(Ljava/lang/String;Lpg3/n;ZI)V

    :goto_d
    move-object v13, v4

    move-object v1, v9

    goto :goto_c

    :cond_2b
    move/from16 v16, v13

    move/from16 v18, v14

    const/4 v14, 0x1

    instance-of v13, v12, Lwg3/v;

    if-eqz v13, :cond_2f

    invoke-virtual {v7, v3, v4}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    check-cast v12, Lwg3/v;

    invoke-interface {v12}, Lwg3/v;->encoded()Z

    move-result v6

    invoke-static {v4}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v12

    iput-boolean v14, v7, Lpg3/t0;->l:Z

    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_2d

    instance-of v11, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_2c

    move-object v1, v4

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    invoke-static {v11, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/l0;

    invoke-direct {v9, v1, v6}, Lpg3/l0;-><init>(Lpg3/n;Z)V

    new-instance v1, Lpg3/c0;

    invoke-direct {v1, v9, v11}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto/16 :goto_b

    :cond_2c
    const/4 v11, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_2d
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-virtual {v12}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lpg3/t0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/l0;

    invoke-direct {v9, v1, v6}, Lpg3/l0;-><init>(Lpg3/n;Z)V

    new-instance v1, Lpg3/c0;

    const/4 v14, 0x1

    invoke-direct {v1, v9, v14}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto/16 :goto_b

    :cond_2e
    invoke-virtual {v9, v4, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/l0;

    invoke-direct {v9, v1, v6}, Lpg3/l0;-><init>(Lpg3/n;Z)V

    goto/16 :goto_d

    :cond_2f
    instance-of v13, v12, Lwg3/u;

    const-string v14, "Map must include generic types (e.g., Map<String, String>)"

    const-class v2, Ljava/util/Map;

    if-eqz v13, :cond_33

    invoke-virtual {v7, v3, v4}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    invoke-static {v4}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    const/4 v11, 0x1

    iput-boolean v11, v7, Lpg3/t0;->m:Z

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_32

    invoke-static {v4, v1}, Lpg3/e1;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_31

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v13

    if-ne v6, v13, :cond_30

    invoke-static {v11, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    move-object v2, v4

    move-object v4, v1

    new-instance v1, Lpg3/f0;

    check-cast v12, Lwg3/u;

    invoke-interface {v12}, Lwg3/u;->encoded()Z

    move-result v6

    move-object v9, v5

    move v5, v6

    const/4 v6, 0x1

    move-object v11, v9

    move-object v9, v2

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v6}, Lpg3/f0;-><init>(Ljava/lang/reflect/Method;ILpg3/n;ZI)V

    move v4, v3

    move-object v13, v9

    move-object/from16 v19, v10

    move-object v10, v11

    goto/16 :goto_a

    :cond_30
    move v4, v3

    move-object/from16 v3, p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@QueryMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_31
    move v4, v3

    const/4 v11, 0x0

    move-object/from16 v3, p2

    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v14, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_32
    move v4, v3

    const/4 v11, 0x0

    move-object/from16 v3, p2

    const-string v0, "@QueryMap parameter type must be Map."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_33
    move-object v13, v4

    move-object/from16 v19, v10

    move v4, v3

    move-object/from16 v3, p2

    instance-of v10, v12, Lwg3/i;

    if-eqz v10, :cond_37

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    check-cast v12, Lwg3/i;

    invoke-interface {v12}, Lwg3/i;->value()Ljava/lang/String;

    move-result-object v2

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_35

    instance-of v10, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_34

    move-object v1, v13

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    invoke-static {v10, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v6, Lpg3/g0;

    invoke-interface {v12}, Lwg3/i;->allowUnsafeNonAsciiValues()Z

    move-result v9

    invoke-direct {v6, v2, v1, v9, v10}, Lpg3/g0;-><init>(Ljava/lang/String;Lpg3/n;ZI)V

    new-instance v1, Lpg3/c0;

    invoke-direct {v1, v6, v10}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    :goto_e
    move-object v10, v5

    goto/16 :goto_13

    :cond_34
    const/4 v10, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v10, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_35
    const/4 v10, 0x0

    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lpg3/t0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v6, Lpg3/g0;

    invoke-interface {v12}, Lwg3/i;->allowUnsafeNonAsciiValues()Z

    move-result v9

    invoke-direct {v6, v2, v1, v9, v10}, Lpg3/g0;-><init>(Ljava/lang/String;Lpg3/n;ZI)V

    new-instance v1, Lpg3/c0;

    const/4 v14, 0x1

    invoke-direct {v1, v6, v14}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto :goto_e

    :cond_36
    invoke-virtual {v9, v13, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v6, Lpg3/g0;

    invoke-interface {v12}, Lwg3/i;->allowUnsafeNonAsciiValues()Z

    move-result v9

    invoke-direct {v6, v2, v1, v9, v10}, Lpg3/g0;-><init>(Ljava/lang/String;Lpg3/n;ZI)V

    move-object v10, v5

    move-object v1, v6

    goto/16 :goto_13

    :cond_37
    instance-of v10, v12, Lwg3/j;

    if-eqz v10, :cond_3c

    const-class v1, Lud3/d0;

    if-ne v13, v1, :cond_38

    new-instance v1, Lpg3/i0;

    const/4 v11, 0x0

    invoke-direct {v1, v3, v4, v11}, Lpg3/i0;-><init>(Ljava/lang/reflect/Method;II)V

    goto :goto_e

    :cond_38
    const/4 v11, 0x0

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_3b

    invoke-static {v13, v1}, Lpg3/e1;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_3a

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v11, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v2

    if-ne v6, v2, :cond_39

    const/4 v14, 0x1

    invoke-static {v14, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v2, Lpg3/h0;

    check-cast v12, Lwg3/j;

    invoke-interface {v12}, Lwg3/j;->allowUnsafeNonAsciiValues()Z

    move-result v6

    invoke-direct {v2, v3, v4, v1, v6}, Lpg3/h0;-><init>(Ljava/lang/reflect/Method;ILpg3/n;Z)V

    move-object v1, v2

    goto/16 :goto_e

    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@HeaderMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3a
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v14, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3b
    const-string v0, "@HeaderMap parameter type must be Map or Headers."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3c
    instance-of v10, v12, Lwg3/c;

    if-eqz v10, :cond_41

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v2, v7, Lpg3/t0;->q:Z

    if-eqz v2, :cond_40

    check-cast v12, Lwg3/c;

    invoke-interface {v12}, Lwg3/c;->value()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v12}, Lwg3/c;->encoded()Z

    move-result v6

    const/4 v14, 0x1

    iput-boolean v14, v7, Lpg3/t0;->g:Z

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_3e

    instance-of v11, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_3d

    move-object v1, v13

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    invoke-static {v11, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/e0;

    invoke-direct {v9, v2, v1, v6}, Lpg3/e0;-><init>(Ljava/lang/String;Lpg3/n;Z)V

    new-instance v1, Lpg3/c0;

    invoke-direct {v1, v9, v11}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto/16 :goto_e

    :cond_3d
    const/4 v11, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3e
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_3f

    invoke-virtual {v10}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lpg3/t0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/e0;

    invoke-direct {v9, v2, v1, v6}, Lpg3/e0;-><init>(Ljava/lang/String;Lpg3/n;Z)V

    new-instance v1, Lpg3/c0;

    const/4 v14, 0x1

    invoke-direct {v1, v9, v14}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto/16 :goto_e

    :cond_3f
    invoke-virtual {v9, v13, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v9, Lpg3/e0;

    invoke-direct {v9, v2, v1, v6}, Lpg3/e0;-><init>(Ljava/lang/String;Lpg3/n;Z)V

    move-object v10, v5

    :goto_f
    move-object v1, v9

    goto/16 :goto_13

    :cond_40
    const-string v0, "@Field parameters can only be used with form encoding."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_41
    instance-of v10, v12, Lwg3/d;

    if-eqz v10, :cond_46

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v1, v7, Lpg3/t0;->q:Z

    if-eqz v1, :cond_45

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_44

    invoke-static {v13, v1}, Lpg3/e1;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_43

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    invoke-static {v11, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v2

    if-ne v6, v2, :cond_42

    const/4 v14, 0x1

    invoke-static {v14, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v9, v1, v5}, Lpg3/y0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    iput-boolean v14, v7, Lpg3/t0;->g:Z

    move v3, v4

    move-object v4, v1

    new-instance v1, Lpg3/f0;

    check-cast v12, Lwg3/d;

    invoke-interface {v12}, Lwg3/d;->encoded()Z

    move-result v2

    const/4 v6, 0x0

    move-object v10, v5

    move v5, v2

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v6}, Lpg3/f0;-><init>(Ljava/lang/reflect/Method;ILpg3/n;ZI)V

    goto/16 :goto_9

    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@FieldMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_43
    const/4 v11, 0x0

    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v14, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_44
    const/4 v11, 0x0

    const-string v0, "@FieldMap parameter type must be Map."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_45
    const/4 v11, 0x0

    const-string v0, "@FieldMap parameters can only be used with form encoding."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_46
    move-object v10, v5

    instance-of v5, v12, Lwg3/q;

    move/from16 v20, v5

    const-class v5, Lud3/i0;

    if-eqz v20, :cond_55

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v2, v7, Lpg3/t0;->r:Z

    if-eqz v2, :cond_54

    check-cast v12, Lwg3/q;

    const/4 v14, 0x1

    iput-boolean v14, v7, Lpg3/t0;->h:Z

    invoke-interface {v12}, Lwg3/q;->value()Ljava/lang/String;

    move-result-object v2

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_4d

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    sget-object v9, Lpg3/m0;->c:Lpg3/m0;

    const-string v11, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    if-eqz v2, :cond_49

    instance-of v2, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_48

    move-object v1, v13

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_47

    new-instance v1, Lpg3/c0;

    invoke-direct {v1, v9, v2}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto/16 :goto_13

    :cond_47
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v11, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_49
    const/4 v2, 0x0

    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_4b

    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4a

    new-instance v1, Lpg3/c0;

    const/4 v14, 0x1

    invoke-direct {v1, v9, v14}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto/16 :goto_13

    :cond_4a
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v11, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_4b
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4c

    goto/16 :goto_f

    :cond_4c
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v11, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_4d
    const-string v14, "form-data; name=\""

    move-object/from16 v20, v12

    const-string v12, "\""

    invoke-static {v14, v2, v12}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v12, "Content-Transfer-Encoding"

    invoke-interface/range {v20 .. v20}, Lwg3/q;->encoding()Ljava/lang/String;

    move-result-object v14

    const-string v0, "Content-Disposition"

    filled-new-array {v0, v2, v12, v14}, [Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lud3/d0;->x:Lud3/d0;

    invoke-static {v0}, Lwb3/f;->R([Ljava/lang/String;)Lud3/d0;

    move-result-object v0

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    const-string v11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    if-eqz v2, :cond_50

    instance-of v2, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_4f

    move-object v1, v13

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_4e

    invoke-virtual {v9, v1, v10, v8}, Lpg3/y0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v5, Lpg3/j0;

    invoke-direct {v5, v3, v4, v0, v1}, Lpg3/j0;-><init>(Ljava/lang/reflect/Method;ILud3/d0;Lpg3/n;)V

    new-instance v0, Lpg3/c0;

    invoke-direct {v0, v5, v2}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    :goto_10
    move-object v1, v0

    goto/16 :goto_13

    :cond_4e
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v11, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_4f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_50
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_52

    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lpg3/t0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_51

    invoke-virtual {v9, v1, v10, v8}, Lpg3/y0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v2, Lpg3/j0;

    invoke-direct {v2, v3, v4, v0, v1}, Lpg3/j0;-><init>(Ljava/lang/reflect/Method;ILud3/d0;Lpg3/n;)V

    new-instance v0, Lpg3/c0;

    const/4 v14, 0x1

    invoke-direct {v0, v2, v14}, Lpg3/c0;-><init>(Lpg3/e1;I)V

    goto :goto_10

    :cond_51
    const/4 v2, 0x0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v11, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_52
    const/4 v2, 0x0

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_53

    invoke-virtual {v9, v13, v10, v8}, Lpg3/y0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v1

    new-instance v5, Lpg3/j0;

    invoke-direct {v5, v3, v4, v0, v1}, Lpg3/j0;-><init>(Ljava/lang/reflect/Method;ILud3/d0;Lpg3/n;)V

    move-object v1, v5

    goto/16 :goto_13

    :cond_53
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v11, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_54
    const/4 v2, 0x0

    const-string v0, "@Part parameters can only be used with multipart encoding."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_55
    instance-of v0, v12, Lwg3/r;

    if-eqz v0, :cond_5b

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v0, v7, Lpg3/t0;->r:Z

    if-eqz v0, :cond_5a

    const/4 v1, 0x1

    iput-boolean v1, v7, Lpg3/t0;->h:Z

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_59

    invoke-static {v13, v0}, Lpg3/e1;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_58

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    const/4 v11, 0x0

    invoke-static {v11, v0}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v2

    if-ne v6, v2, :cond_57

    invoke-static {v1, v0}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_56

    invoke-virtual {v9, v0, v10, v8}, Lpg3/y0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v0

    check-cast v12, Lwg3/r;

    new-instance v1, Lpg3/j0;

    invoke-interface {v12}, Lwg3/r;->encoding()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v4, v0, v2}, Lpg3/j0;-><init>(Ljava/lang/reflect/Method;ILpg3/n;Ljava/lang/String;)V

    goto/16 :goto_13

    :cond_56
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_57
    const/4 v11, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@PartMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_58
    const/4 v11, 0x0

    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v14, v0}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_59
    const/4 v11, 0x0

    const-string v0, "@PartMap parameter type must be Map."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5a
    const/4 v11, 0x0

    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5b
    instance-of v0, v12, Lwg3/a;

    if-eqz v0, :cond_5e

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    iget-boolean v0, v7, Lpg3/t0;->q:Z

    if-nez v0, :cond_5d

    iget-boolean v0, v7, Lpg3/t0;->r:Z

    if-nez v0, :cond_5d

    iget-boolean v0, v7, Lpg3/t0;->i:Z

    if-nez v0, :cond_5c

    :try_start_1
    invoke-virtual {v9, v13, v10, v8}, Lpg3/y0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v14, 0x1

    iput-boolean v14, v7, Lpg3/t0;->i:Z

    new-instance v1, Lpg3/d0;

    invoke-direct {v1, v3, v4, v0}, Lpg3/d0;-><init>(Ljava/lang/reflect/Method;ILpg3/n;)V

    goto :goto_13

    :catch_1
    move-exception v0

    const-string v1, "Unable to create @Body converter for %s"

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v0, v4, v1, v2}, Lpg3/e1;->o(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5c
    const-string v0, "Multiple @Body method annotations found."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5d
    const/4 v11, 0x0

    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5e
    instance-of v0, v12, Lwg3/x;

    if-eqz v0, :cond_62

    invoke-virtual {v7, v4, v13}, Lpg3/t0;->c(ILjava/lang/reflect/Type;)V

    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    add-int/lit8 v1, v4, -0x1

    :goto_11
    if-ltz v1, :cond_61

    iget-object v2, v7, Lpg3/t0;->w:[Lpg3/e1;

    aget-object v2, v2, v1

    instance-of v5, v2, Lpg3/n0;

    if-eqz v5, :cond_60

    check-cast v2, Lpg3/n0;

    iget-object v2, v2, Lpg3/n0;->c:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5f

    goto :goto_12

    :cond_5f
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "@Tag type "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " is duplicate of "

    invoke-static {v0, v2, v5}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    sget-object v0, Lpg3/o0;->b:Lpg3/b;

    invoke-virtual {v0, v3, v1}, Lpg3/b;->c(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and would always overwrite its value."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_60
    :goto_12
    add-int/lit8 v1, v1, -0x1

    goto :goto_11

    :cond_61
    new-instance v1, Lpg3/n0;

    invoke-direct {v1, v0}, Lpg3/n0;-><init>(Ljava/lang/Class;)V

    goto :goto_13

    :cond_62
    const/4 v1, 0x0

    :goto_13
    if-nez v1, :cond_63

    goto :goto_14

    :cond_63
    if-nez v22, :cond_64

    move-object/from16 v22, v1

    :goto_14
    add-int/lit8 v15, v25, 0x1

    move-object/from16 v0, p0

    move-object v2, v3

    move v3, v4

    move-object v5, v10

    move-object v4, v13

    move/from16 v13, v16

    move-object/from16 v11, v17

    move/from16 v14, v18

    move-object/from16 v10, v19

    move-object/from16 v1, v23

    move/from16 v6, v24

    const/4 v9, 0x0

    const/4 v12, 0x0

    goto/16 :goto_7

    :cond_64
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_65
    :goto_15
    move-object/from16 v23, v1

    move-object/from16 v19, v10

    move-object/from16 v17, v11

    move/from16 v16, v13

    move/from16 v18, v14

    move-object v13, v4

    move v4, v3

    move-object v3, v2

    goto :goto_16

    :cond_66
    const/16 v22, 0x0

    goto :goto_15

    :goto_16
    if-nez v22, :cond_68

    if-eqz v21, :cond_67

    :try_start_2
    invoke-static {v13}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lq83/d;

    if-ne v0, v1, :cond_67

    const/4 v14, 0x1

    iput-boolean v14, v7, Lpg3/t0;->x:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v22, 0x0

    goto :goto_17

    :catch_2
    :cond_67
    const-string v0, "No Retrofit annotation found."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v4, v0, v1}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_68
    :goto_17
    aput-object v22, v23, v4

    add-int/lit8 v0, v4, 0x1

    move-object v2, v3

    move/from16 v13, v16

    move-object/from16 v11, v17

    move/from16 v14, v18

    move-object/from16 v10, v19

    const/4 v9, 0x0

    const/4 v12, 0x0

    move v3, v0

    move-object/from16 v0, p0

    goto/16 :goto_5

    :cond_69
    move-object v3, v2

    move-object/from16 v19, v10

    iget-object v0, v7, Lpg3/t0;->s:Ljava/lang/String;

    if-nez v0, :cond_6b

    iget-boolean v0, v7, Lpg3/t0;->n:Z

    if-eqz v0, :cond_6a

    goto :goto_18

    :cond_6a
    iget-object v0, v7, Lpg3/t0;->o:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Missing either @%s URL or @Url parameter."

    const/4 v2, 0x0

    invoke-static {v3, v2, v1, v0}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_6b
    :goto_18
    iget-boolean v0, v7, Lpg3/t0;->q:Z

    if-nez v0, :cond_6c

    iget-boolean v1, v7, Lpg3/t0;->r:Z

    if-nez v1, :cond_6c

    iget-boolean v1, v7, Lpg3/t0;->p:Z

    if-nez v1, :cond_6c

    iget-boolean v1, v7, Lpg3/t0;->i:Z

    if-nez v1, :cond_6d

    :cond_6c
    const/4 v2, 0x0

    const/4 v11, 0x0

    goto :goto_19

    :cond_6d
    const-string v0, "Non-body HTTP method cannot contain @Body."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :goto_19
    if-eqz v0, :cond_6f

    iget-boolean v0, v7, Lpg3/t0;->g:Z

    if-eqz v0, :cond_6e

    goto :goto_1a

    :cond_6e
    const-string v0, "Form-encoded method must contain at least one @Field."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_6f
    :goto_1a
    iget-boolean v0, v7, Lpg3/t0;->r:Z

    if-eqz v0, :cond_71

    iget-boolean v0, v7, Lpg3/t0;->h:Z

    if-eqz v0, :cond_70

    goto :goto_1b

    :cond_70
    const-string v0, "Multipart method must contain at least one @Part."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_71
    :goto_1b
    new-instance v2, Lpg3/u0;

    invoke-direct {v2, v7}, Lpg3/u0;-><init>(Lpg3/t0;)V

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lpg3/e1;->k(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_7f

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v0, v1, :cond_7e

    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    const-class v1, Ll83/a0;

    const-class v4, Lpg3/v0;

    iget-boolean v5, v2, Lpg3/u0;->l:Z

    if-eqz v5, :cond_77

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v6

    array-length v7, v6

    const/4 v14, 0x1

    sub-int/2addr v7, v14

    aget-object v6, v6, v7

    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v11, 0x0

    aget-object v6, v6, v11

    instance-of v7, v6, Ljava/lang/reflect/WildcardType;

    if-eqz v7, :cond_72

    check-cast v6, Ljava/lang/reflect/WildcardType;

    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v6

    aget-object v6, v6, v11

    :cond_72
    invoke-static {v6}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    const-class v8, Lpg3/e;

    if-ne v7, v4, :cond_73

    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_73

    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v11, v6}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v6

    move-object v7, v6

    const/4 v6, 0x1

    const/4 v9, 0x0

    goto :goto_1d

    :cond_73
    invoke-static {v6}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    if-eq v7, v8, :cond_76

    sget-boolean v7, Lpg3/e1;->b:Z

    if-eqz v7, :cond_74

    if-ne v6, v1, :cond_74

    const/4 v7, 0x1

    goto :goto_1c

    :cond_74
    const/4 v7, 0x0

    :goto_1c
    move v9, v7

    move-object v7, v6

    const/4 v6, 0x0

    :goto_1d
    new-instance v10, Lpg3/c1;

    const/4 v14, 0x1

    new-array v11, v14, [Ljava/lang/reflect/Type;

    const/4 v12, 0x0

    aput-object v7, v11, v12

    const/4 v7, 0x0

    invoke-direct {v10, v7, v8, v11}, Lpg3/c1;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    const-class v7, Lpg3/z0;

    invoke-static {v0, v7}, Lpg3/e1;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_75

    goto :goto_1e

    :cond_75
    array-length v7, v0

    add-int/2addr v7, v14

    new-array v7, v7, [Ljava/lang/annotation/Annotation;

    sget-object v8, Lpg3/a1;->a:Lpg3/a1;

    aput-object v8, v7, v12

    array-length v8, v0

    invoke-static {v0, v12, v7, v14, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v7

    :goto_1e
    move-object/from16 v7, p0

    goto :goto_1f

    :cond_76
    const/4 v12, 0x0

    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v12, v6}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    const/4 v2, 0x0

    invoke-static {v3, v2, v1, v0}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_77
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v10

    const/4 v6, 0x0

    const/4 v9, 0x0

    goto :goto_1e

    :goto_1f
    :try_start_3
    invoke-virtual {v7, v10, v0}, Lpg3/y0;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/g;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    invoke-interface {v0}, Lpg3/g;->responseType()Ljava/lang/reflect/Type;

    move-result-object v8

    const-class v10, Lud3/x0;

    if-eq v8, v10, :cond_7d

    if-eq v8, v4, :cond_7c

    iget-object v4, v2, Lpg3/u0;->d:Ljava/lang/String;

    move-object/from16 v10, v19

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_79

    const-class v4, Ljava/lang/Void;

    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_79

    sget-boolean v4, Lpg3/e1;->b:Z

    if-eqz v4, :cond_78

    if-ne v8, v1, :cond_78

    goto :goto_20

    :cond_78
    const-string v0, "HEAD method must use Void or Unit as response type."

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_79
    :goto_20
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    :try_start_4
    invoke-virtual {v7, v8, v1}, Lpg3/y0;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    iget-object v3, v7, Lpg3/y0;->b:Lud3/i;

    if-nez v5, :cond_7a

    new-instance v1, Lpg3/s;

    invoke-direct {v1, v2, v3, v4, v0}, Lpg3/s;-><init>(Lpg3/u0;Lud3/i;Lpg3/n;Lpg3/g;)V

    return-object v1

    :cond_7a
    if-eqz v6, :cond_7b

    new-instance v1, Lpg3/u;

    invoke-direct {v1, v2, v3, v4, v0}, Lpg3/u;-><init>(Lpg3/u0;Lud3/i;Lpg3/n;Lpg3/g;)V

    return-object v1

    :cond_7b
    new-instance v1, Lpg3/t;

    move-object v5, v0

    move v6, v9

    invoke-direct/range {v1 .. v6}, Lpg3/t;-><init>(Lpg3/u0;Lud3/i;Lpg3/n;Lpg3/g;Z)V

    return-object v1

    :catch_3
    move-exception v0

    const-string v1, "Unable to create converter for %s"

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v0, v1, v2}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7c
    const-string v0, "Response must include generic type (e.g., Response<String>)"

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v1, v11, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :catch_4
    move-exception v0

    const-string v1, "Unable to create call adapter for %s"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v0, v1, v2}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7e
    const/4 v2, 0x0

    const/4 v11, 0x0

    const-string v0, "Service methods cannot return void."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7f
    const/4 v2, 0x0

    const-string v1, "Method return type must not include a type variable or wildcard: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v2, v1, v0}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_80
    move-object v3, v2

    move v11, v9

    move-object v2, v12

    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v3, v2, v0, v1}, Lpg3/e1;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public abstract a(Lpg3/b0;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
