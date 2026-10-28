.class public final Lrf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/c;


# instance fields
.field public final b:Lpf/t;


# direct methods
.method public constructor <init>(Lpf/t;)V
    .locals 1

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/u;->b:Lpf/t;

    return-void
.end method


# virtual methods
.method public final a(Lud3/b1;Lud3/x0;)Lud3/o0;
    .locals 16

    move-object/from16 v0, p2

    iget-object v1, v0, Lud3/x0;->w:Lud3/o0;

    iget-object v2, v1, Lud3/o0;->c:Lud3/d0;

    const-string v3, "Proxy-Authorization"

    invoke-virtual {v2, v3}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move-object/from16 v2, p0

    goto/16 :goto_6

    :cond_0
    iget-object v2, v1, Lud3/o0;->a:Lud3/e0;

    sget-object v5, Lbg/l;->c:Lbg/l;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lcg/u;->w:Lcg/u;

    new-instance v7, Landroidx/room/u;

    sget-object v9, Ltg/g;->i:Ltg/g;

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v8, 0x1

    const-class v10, Ltg/e;

    const-string v11, "encodableFromDecoded"

    const-string v12, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v7 .. v14}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v5, v6, v7}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    sget-object v6, Lcg/v;->w:Lcg/v;

    new-instance v8, Landroidx/room/u;

    const/4 v14, 0x0

    const/4 v15, 0x7

    move-object v10, v9

    const/4 v9, 0x1

    const-class v11, Ltg/e;

    const-string v12, "encodableFromEncoded"

    const-string v13, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v8 .. v15}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v5, v6, v8}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    new-instance v6, Lcg/g;

    invoke-direct {v6}, Lcg/g;-><init>()V

    sget-object v7, Ltg/b;->f:Ltg/b;

    new-instance v9, Lbg/l;

    iget-object v8, v2, Lud3/e0;->a:Ljava/lang/String;

    iget v10, v2, Lud3/e0;->e:I

    invoke-direct {v9, v8, v10}, Lbg/l;-><init>(Ljava/lang/String;I)V

    iget-object v8, v2, Lud3/e0;->d:Ljava/lang/String;

    invoke-static {v8}, Lwb3/f;->V(Ljava/lang/String;)Lbg/e;

    move-result-object v10

    iget v11, v2, Lud3/e0;->e:I

    new-instance v8, Lcg/o;

    new-instance v12, Lcg/x;

    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x0

    invoke-direct {v12, v2, v5}, Lcg/x;-><init>(Ljava/util/List;Z)V

    invoke-virtual {v6}, Lcg/g;->b()Lcg/i;

    move-result-object v13

    new-instance v14, Lcg/y;

    invoke-direct {v14, v7, v7}, Lcg/y;-><init>(Ltg/b;Ltg/b;)V

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lcg/o;-><init>(Lbg/l;Lbg/e;ILcg/x;Lcg/i;Lcg/y;Ltg/b;)V

    move-object/from16 v2, p0

    iget-object v6, v2, Lrf/u;->b:Lpf/t;

    invoke-interface {v6, v8}, Lpf/t;->q(Lcg/o;)Lpf/r;

    move-result-object v6

    instance-of v7, v6, Lpf/q;

    if-eqz v7, :cond_1

    check-cast v6, Lpf/q;

    iget-object v6, v6, Lpf/q;->a:Lcg/o;

    iget-object v6, v6, Lcg/o;->f:Lcg/y;

    goto :goto_0

    :cond_1
    move-object v6, v4

    :goto_0
    if-nez v6, :cond_2

    goto/16 :goto_6

    :cond_2
    iget-object v7, v0, Lud3/x0;->F:Lud3/d0;

    iget v0, v0, Lud3/x0;->z:I

    const/16 v8, 0x191

    if-eq v0, v8, :cond_4

    const/16 v8, 0x197

    if-eq v0, v8, :cond_3

    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_5

    :cond_3
    const-string v0, "Proxy-Authenticate"

    :goto_1
    move-object v8, v0

    goto :goto_2

    :cond_4
    const-string v0, "WWW-Authenticate"

    goto :goto_1

    :goto_2
    sget-object v0, Lae3/h;->a:Lne3/l;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Lud3/d0;->size()I

    move-result v10

    :goto_3
    if-ge v5, v10, :cond_6

    invoke-virtual {v7, v5}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v7, v5}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Lne3/h;->u1(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v0, v9}, Lae3/h;->b(Lne3/h;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    sget-object v11, Lfe3/e;->a:Lfe3/e;

    sget-object v11, Lfe3/e;->a:Lfe3/e;

    const-string v12, "Unable to parse challenge"

    const/4 v13, 0x5

    invoke-virtual {v11, v12, v13, v0}, Lfe3/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    :cond_5
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    move-object v0, v9

    :goto_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lud3/m;

    iget-object v7, v5, Lud3/m;->a:Ljava/lang/String;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "toLowerCase(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "okhttp-preemptive"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    iget-object v5, v5, Lud3/m;->a:Ljava/lang/String;

    const-string v7, "Basic"

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    :cond_8
    invoke-virtual {v1}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    iget-object v1, v6, Lcg/y;->a:Ltg/b;

    iget-object v1, v1, Ltg/b;->a:Ljava/lang/String;

    iget-object v4, v6, Lcg/y;->b:Ltg/b;

    iget-object v4, v4, Ltg/b;->a:Ljava/lang/String;

    sget-object v5, Lyb3/a;->e:Ljava/nio/charset/Charset;

    const-string v6, "username"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "password"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "charset"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Lne3/l;->z:Lne3/k;

    const-string v4, "<this>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lne3/l;

    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v5, "getBytes(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v1}, Lne3/l;-><init>([B)V

    invoke-static {v1}, Lne3/a;->b([B)Ljava/lang/String;

    move-result-object v1

    const-string v4, "Basic "

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object v1

    :cond_9
    :goto_6
    return-object v4
.end method
