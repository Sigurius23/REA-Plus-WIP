.class public final Lfw/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# instance fields
.field public final w:Lio/getstream/chat/android/client/di/ChatModule$baseClientBuilder$1$1;

.field public final x:Le10/k0;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/di/ChatModule$baseClientBuilder$1$1;)V
    .locals 2

    new-instance v0, Lfw/h;

    invoke-direct {v0}, Lfw/h;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfw/i;->w:Lio/getstream/chat/android/client/di/ChatModule$baseClientBuilder$1$1;

    new-instance p1, Le10/k0;

    const/16 v1, 0x10

    invoke-direct {p1, v0, v1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lfw/i;->x:Le10/k0;

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 13

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v1, p1, Lae3/i;->e:Lud3/o0;

    iget-object v0, p0, Lfw/i;->x:Le10/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "request"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lud3/o0;->d:Lud3/v0;

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfw/h;

    iget-object v0, v3, Lfw/h;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfw/g;

    sget-object v6, Lfw/b;->b:Lfw/b;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v0, "curl"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_a

    :cond_0
    sget-object v6, Lfw/f;->b:Lfw/f;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_1

    iget-object v0, v1, Lud3/o0;->a:Lud3/e0;

    iget-object v0, v0, Lud3/e0;->i:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v6, "\"%1$s\""

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_a

    :cond_1
    sget-object v6, Lfw/c;->b:Lfw/c;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v0, v3, Lfw/h;->d:Ljava/lang/Object;

    check-cast v0, Lfw/j;

    iget-object v0, v0, Lfw/j;->a:Ljava/util/List;

    goto/16 :goto_a

    :cond_2
    sget-object v6, Lfw/a;->b:Lfw/a;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    if-eqz v2, :cond_6

    :try_start_0
    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v6

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v8

    if-eqz v6, :cond_4

    invoke-virtual {v6, v8}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    move-object v8, v6

    goto :goto_2

    :cond_4
    :goto_1
    const-string v6, "default"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    iget-wide v9, v3, Lfw/h;->a:J

    const-wide/16 v11, 0x0

    cmp-long v6, v9, v11

    if-lez v6, :cond_5

    new-instance v6, Lfw/l;

    invoke-direct {v6, v0, v9, v10}, Lfw/l;-><init>(Lne3/h;J)V

    invoke-static {v6}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v6

    invoke-virtual {v2, v6}, Lud3/v0;->writeTo(Lne3/i;)V

    invoke-virtual {v6}, Lne3/h0;->flush()V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_5
    invoke-virtual {v2, v0}, Lud3/v0;->writeTo(Lne3/i;)V

    :goto_3
    const-string v6, "-d \'%1$s\'"

    invoke-virtual {v0, v8}, Lne3/h;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Error while reading body: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_a

    :cond_6
    sget-object v0, Lm83/y;->w:Lm83/y;

    goto/16 :goto_a

    :cond_7
    sget-object v6, Lfw/e;->b:Lfw/e;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v0, v1, Lud3/o0;->b:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const-string v8, "getDefault()"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v6, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v6, "-X %1$s"

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_a

    :cond_8
    sget-object v6, Lfw/d;->b:Lfw/d;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, v1, Lud3/o0;->c:Lud3/d0;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Lud3/d0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    move-object v8, v0

    check-cast v8, La0/i1;

    invoke-virtual {v8}, La0/i1;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v8}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/k;

    new-instance v9, Lfw/k;

    iget-object v10, v8, Ll83/k;->w:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-direct {v9, v10, v8}, Lfw/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_a
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lfw/k;

    iget-object v9, v3, Lfw/h;->b:Ljava/util/List;

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_b

    if-eqz v8, :cond_a

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    invoke-static {v9}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    const-string v10, "Content-Type"

    if-eqz v8, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lfw/k;

    iget-object v11, v11, Lfw/k;->a:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v11, v10, v12}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_d

    goto :goto_8

    :cond_e
    move-object v8, v9

    :goto_8
    check-cast v8, Lfw/k;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v6

    if-eqz v6, :cond_f

    iget-object v9, v6, Lud3/h0;->a:Ljava/lang/String;

    :cond_f
    if-nez v8, :cond_10

    if-eqz v9, :cond_10

    new-instance v6, Lfw/k;

    invoke-direct {v6, v10, v9}, Lfw/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v0, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    :cond_10
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lfw/k;

    iget-object v8, v7, Lfw/k;->a:Ljava/lang/String;

    iget-object v7, v7, Lfw/k;->b:Ljava/lang/String;

    filled-new-array {v8, v7}, [Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x2

    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    const-string v8, "-H \"%1$s:%2$s\""

    invoke-static {v8, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_11
    move-object v0, v6

    :goto_a
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v4, v0}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto/16 :goto_0

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_13
    iget-object v0, v3, Lfw/h;->e:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lfw/i;->w:Lio/getstream/chat/android/client/di/ChatModule$baseClientBuilder$1$1;

    invoke-virtual {v2, v0}, Lio/getstream/chat/android/client/di/ChatModule$baseClientBuilder$1$1;->log(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
