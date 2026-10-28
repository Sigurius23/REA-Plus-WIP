.class public abstract Lwc/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lod/e;Lwc/q0;Lug/a;)Lwc/q0;
    .locals 9

    iget-object v1, p0, Lod/e;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object p2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget v0, p0, Lod/e;->b:I

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lug/b;->d(J)Lug/b;

    move-result-object v2

    iget-object v3, p0, Lod/e;->d:Ljava/lang/String;

    iget-object v4, p1, Lwc/q0;->d:Ljava/lang/String;

    iget-object v5, p1, Lwc/q0;->e:Ljava/lang/String;

    iget-object v6, p1, Lwc/q0;->f:Lug/b;

    iget-object v7, p1, Lwc/q0;->g:Ljava/lang/String;

    iget-object v8, p1, Lwc/q0;->h:Ljava/lang/String;

    new-instance v0, Lwc/q0;

    invoke-direct/range {v0 .. v8}, Lwc/q0;-><init>(Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "missing accessToken from CreateTokenResponse"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final varargs b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lvg/r;->d:Ll83/p;

    invoke-virtual {p0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getValue(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "cacheKey"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p0

    new-instance v0, Llf/b;

    invoke-direct {v0}, Llf/b;-><init>()V

    invoke-static {v0, p0}, Lse/h;->J(Llf/a;[B)[B

    move-result-object p0

    invoke-static {p0}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".json"

    invoke-static {p0, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;Lvg/n;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lwc/y0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/y0;

    iget v1, v0, Lwc/y0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/y0;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/y0;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwc/y0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/y0;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p0}, Lwc/z0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p2, "sso"

    const-string v2, "cache"

    const-string v4, "~"

    const-string v5, ".aws"

    filled-new-array {v4, v5, p2, v2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lwc/z0;->b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lx30/s0;->z(Ljava/lang/String;Lvg/n;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lwc/z0;->b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput v3, v0, Lwc/y0;->x:I

    check-cast p1, Lvg/r;

    invoke-virtual {p1, p0, v0}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, [B

    const/4 p0, 0x0

    if-eqz p2, :cond_19

    new-instance p1, Lz7/a;

    invoke-direct {p1, p2}, Lz7/a;-><init>([B)V

    :try_start_0
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-class v1, Ljg/h;

    const-string v2, "; found "

    const-string v3, "expected "

    if-ne v0, v1, :cond_18

    :try_start_1
    check-cast p2, Ljg/h;

    move-object p2, p0

    move-object v5, p2

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    :goto_2
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    instance-of v1, v0, Ljg/l;

    if-nez v1, :cond_15

    instance-of v1, v0, Ljg/m;

    if-eqz v1, :cond_14

    check-cast v0, Ljg/m;

    iget-object v0, v0, Ljg/m;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-class v4, Ljg/p;

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    :try_start_2
    const-string v1, "startUrl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_5

    check-cast v0, Ljg/p;

    iget-object v12, v0, Ljg/p;->c:Ljava/lang/String;

    goto :goto_2

    :cond_5
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_1
    const-string v1, "clientId"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_7

    check-cast v0, Ljg/p;

    iget-object v8, v0, Ljg/p;->c:Ljava/lang/String;

    goto :goto_2

    :cond_7
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_2
    const-string v1, "expiresAt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v4, :cond_9

    check-cast p2, Ljg/p;

    iget-object p2, p2, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_2

    :cond_9
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_3
    const-string v1, "refreshToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_3

    :cond_a
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_b

    check-cast v0, Ljg/p;

    iget-object v7, v0, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_2

    :cond_b
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_4
    const-string v1, "region"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_3

    :cond_c
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_d

    check-cast v0, Ljg/p;

    iget-object v11, v0, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_2

    :cond_d
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_5
    const-string v1, "accessToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_3

    :cond_e
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_f

    check-cast v0, Ljg/p;

    iget-object v5, v0, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_2

    :cond_f
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_6
    const-string v1, "registrationExpiresAt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_3

    :cond_10
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_11

    check-cast v0, Ljg/p;

    iget-object v0, v0, Ljg/p;->c:Ljava/lang/String;

    sget-object v1, Lug/b;->x:Lt9/p;

    invoke-static {v0}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v10

    goto/16 :goto_2

    :cond_11
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_7
    const-string v1, "clientSecret"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :goto_3
    invoke-virtual {p1}, Lz7/a;->s()V

    goto/16 :goto_2

    :cond_12
    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v1, v4, :cond_13

    check-cast v0, Ljg/p;

    iget-object v9, v0, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_2

    :cond_13
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "expected either key or end of object"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_15
    if-eqz v5, :cond_17

    if-eqz p2, :cond_16

    sget-object p0, Lug/b;->x:Lt9/p;

    invoke-static {p2}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v6

    new-instance v4, Lwc/q0;

    invoke-direct/range {v4 .. v12}, Lwc/q0;-><init>(Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    :cond_16
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;

    const-string p2, "missing `expiresAt`"

    invoke-direct {p1, p2, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_17
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;

    const-string p2, "missing `accessToken`"

    invoke-direct {p1, p2, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_18
    :try_start_3
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;

    const-string p2, "invalid cached SSO token"

    invoke-direct {p1, p2, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_19
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string p2, "Invalid or missing SSO session cache. Run `aws sso login` to initiate a new SSO session"

    invoke-direct {p1, p2, p0}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x563e15a5 -> :sswitch_7
        -0x4e305632 -> :sswitch_6
        -0x3e262d0b -> :sswitch_5
        -0x37b7d90c -> :sswitch_4
        -0x35e3822 -> :sswitch_3
        0xee9b287 -> :sswitch_2
        0x36253646 -> :sswitch_1
        0x4e7c95ad -> :sswitch_0
    .end sparse-switch
.end method

.method public static final e(Lwc/q0;)[B
    .locals 4

    const-string v0, "token"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le73/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le73/b;-><init>(Z)V

    invoke-virtual {v0}, Le73/b;->f()V

    const-string v1, "accessToken"

    invoke-virtual {v0, v1}, Le73/b;->q(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/q0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Le73/b;->r(Ljava/lang/String;)V

    const-string v1, "expiresAt"

    invoke-virtual {v0, v1}, Le73/b;->q(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/q0;->b:Lug/b;

    sget-object v2, Lug/t;->w:Lug/t;

    invoke-virtual {v1, v2}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le73/b;->r(Ljava/lang/String;)V

    const-string v1, "refreshToken"

    iget-object v3, p0, Lwc/q0;->c:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lwc/z0;->f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "clientId"

    iget-object v3, p0, Lwc/q0;->d:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lwc/z0;->f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "clientSecret"

    iget-object v3, p0, Lwc/q0;->e:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lwc/z0;->f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lwc/q0;->f:Lug/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "registrationExpiresAt"

    invoke-static {v0, v2, v1}, Lwc/z0;->f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "region"

    iget-object v2, p0, Lwc/q0;->g:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lwc/z0;->f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "startUrl"

    iget-object p0, p0, Lwc/q0;->h:Ljava/lang/String;

    invoke-static {v0, v1, p0}, Lwc/z0;->f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Le73/b;->k()V

    invoke-virtual {v0}, Le73/b;->l()[B

    move-result-object p0

    return-object p0
.end method

.method public static final f(Le73/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Le73/b;->r(Ljava/lang/String;)V

    return-void
.end method
