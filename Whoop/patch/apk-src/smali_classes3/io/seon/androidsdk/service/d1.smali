.class public final Lio/seon/androidsdk/service/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/String;

.field public final g:Lm63/d;

.field public final h:Lm63/d;

.field public i:Ljava/util/ArrayList;

.field public j:Ljava/lang/String;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/lang/Boolean;

.field public final m:La00/g;


# direct methods
.method public constructor <init>(Ld/h1;Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;Ld/l;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/seon/androidsdk/service/d1;->j:Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/seon/androidsdk/service/d1;->k:Ljava/util/ArrayList;

    new-instance v1, La00/g;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, La00/g;-><init>(I)V

    iput-object v1, p0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    iput-object p2, p0, Lio/seon/androidsdk/service/d1;->a:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    const/4 p2, 0x0

    move v1, p2

    :goto_0
    invoke-virtual {p1}, Ld/h1;->o()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-ge v1, v2, :cond_8

    if-eqz v1, :cond_7

    if-eq v1, v5, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_3

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    const/4 v2, 0x7

    if-eq v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    :try_start_0
    invoke-virtual {p1, v2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/h1;

    iget-object v3, p0, Lio/seon/androidsdk/service/d1;->c:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    new-instance v3, Lm63/d;

    invoke-direct {v3, v2}, Lm63/d;-><init>(Ld/h1;)V

    :goto_1
    iput-object v3, p0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/h1;

    new-instance v3, Lm63/d;

    invoke-direct {v3, v2}, Lm63/d;-><init>(Ld/h1;)V

    iput-object v3, p0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v3}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    invoke-static {v2}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v2

    .line 2
    iget-object v2, v2, Ld/x0;->a:[B

    .line 3
    invoke-static {v2}, Lwg/c;->b([B)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lio/seon/androidsdk/service/d1;->f:Ljava/lang/String;

    goto :goto_2

    :cond_4
    invoke-virtual {p1, v4}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/v;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance v3, Ljava/math/BigInteger;

    iget-object v2, v2, Ld/v;->a:[B

    invoke-direct {v3, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 5
    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lio/seon/androidsdk/service/d1;->e:Ljava/lang/Integer;

    goto :goto_2

    :cond_5
    invoke-virtual {p1, v2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/j0;

    invoke-virtual {v2}, Ld/j0;->m()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lio/seon/androidsdk/service/d1;->d:Ljava/lang/Integer;

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v5}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/v;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    new-instance v3, Ljava/math/BigInteger;

    iget-object v2, v2, Ld/v;->a:[B

    invoke-direct {v3, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 7
    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lio/seon/androidsdk/service/d1;->c:Ljava/lang/Integer;

    goto :goto_2

    :cond_7
    invoke-virtual {p1, p2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/j0;

    invoke-virtual {v2}, Ld/j0;->m()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lio/seon/androidsdk/service/d1;->b:Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_8
    if-eqz p3, :cond_d

    .line 8
    :try_start_1
    iget-object p1, p3, Ld/x0;->a:[B

    .line 9
    new-instance p3, Lev/i;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p3, v0}, Lev/i;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 10
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 11
    :goto_3
    invoke-virtual {p3}, Lev/i;->c()Lah/d;

    move-result-object v0

    if-nez v0, :cond_c

    .line 12
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lah/h;

    .line 13
    iget-object p2, p1, Lah/h;->e:Ljava/util/LinkedList;

    .line 14
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lah/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    move-object v0, p3

    check-cast v0, Lah/i;

    .line 15
    iget-object v0, v0, Lah/i;->c:Ljava/math/BigInteger;

    .line 16
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    if-eq v0, v5, :cond_b

    if-eq v0, v4, :cond_a

    if-eq v0, v3, :cond_9

    iget-object v1, p0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    iget-object v1, v1, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 17
    iget-object v2, p1, Lah/h;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lah/d;

    .line 18
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p3

    goto :goto_5

    :cond_9
    iget-object v0, p0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    .line 19
    iget-object v1, p1, Lah/h;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lah/d;

    .line 20
    check-cast p3, Lah/n;

    .line 21
    iget-object p3, p3, Lah/n;->d:Ljava/lang/String;

    .line 22
    iput-object p3, v0, La00/g;->z:Ljava/lang/Object;

    goto :goto_4

    :cond_a
    iget-object v0, p0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    .line 23
    iget-object v1, p1, Lah/h;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lah/d;

    .line 24
    check-cast p3, Lah/n;

    .line 25
    iget-object p3, p3, Lah/n;->d:Ljava/lang/String;

    .line 26
    iput-object p3, v0, La00/g;->y:Ljava/lang/Object;

    goto :goto_4

    :cond_b
    iget-object v0, p0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    .line 27
    iget-object v1, p1, Lah/h;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lah/d;

    .line 28
    check-cast p3, Lah/i;

    .line 29
    iget-object p3, p3, Lah/i;->c:Ljava/math/BigInteger;

    .line 30
    invoke-virtual {p3}, Ljava/math/BigInteger;->intValue()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, v0, La00/g;->x:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :goto_5
    :try_start_3
    const-string v0, "prov-l"

    invoke-static {v0, p3}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 31
    :cond_c
    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_3

    .line 32
    :goto_6
    const-string p2, "prov"

    invoke-static {p2, p1}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lio/seon/androidsdk/service/d1;->l:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/seon/androidsdk/service/d1;->j:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/d1;->k:Ljava/util/ArrayList;

    new-instance v1, La00/g;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, La00/g;-><init>(I)V

    iput-object v1, p0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lio/seon/androidsdk/service/d1;->l:Ljava/lang/Boolean;

    return-void
.end method
