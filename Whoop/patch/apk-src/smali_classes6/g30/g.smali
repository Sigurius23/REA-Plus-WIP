.class public final Lg30/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lab/i0;

.field public final b:Lwy/a;

.field public final c:Lq30/w0;


# direct methods
.method public constructor <init>(Lab/i0;Ljava/lang/String;)V
    .locals 2

    const-string v0, "apiVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg30/g;->a:Lab/i0;

    new-instance p1, Lwy/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg30/g;->b:Lwy/a;

    new-instance p1, Lq30/w0;

    const/4 v0, 0x0

    const-string v1, "AndroidBindings/22.6.1"

    invoke-direct {p1, v0, p2, v1}, Lq30/w0;-><init>(Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lg30/g;->c:Lq30/w0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lyy/f;Le00/a;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Ly00/j8;->w:[Ly00/j8;

    const-string v0, "consumers/sessions/confirm_verification"

    const-string v1, "https://api.stripe.com/v1/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "request_surface"

    invoke-direct {v1, v2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v2, "credentials"

    invoke-direct {p3, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v2, "type"

    const-string v3, "SMS"

    invoke-direct {p1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "code"

    invoke-direct {v2, v3, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v3, "consent_granted"

    invoke-direct {p2, v3, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p3, p1, v2, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p4, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, v0, p5, p2, p1}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/b;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, p6}, Lyy/q;->e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p6, Lg30/a;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lg30/a;

    iget v1, v0, Lg30/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg30/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg30/a;

    invoke-direct {v0, p0, p6}, Lg30/a;-><init>(Lg30/g;Ls83/c;)V

    :goto_0
    iget-object p6, v0, Lg30/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg30/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p6, Ll83/n;

    iget-object p1, p6, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p6, "consumers/link_account_sessions"

    const-string v2, "https://api.stripe.com/v1/"

    invoke-virtual {v2, p6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v4, "credentials"

    invoke-direct {v2, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v4, "intent_token"

    invoke-direct {p1, v4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p3, :cond_3

    iget-object p2, p3, Ly00/p2;->w:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    new-instance p3, Ll83/k;

    const-string v4, "link_mode"

    invoke-direct {p3, v4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v4, "request_surface"

    invoke-direct {p2, v4, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p1, p3, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, p6, p5, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->F:Lz00/a;

    iput v3, v0, Lg30/a;->y:I

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, v0}, Lyy/q;->f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public final c(Ljava/lang/String;Ly00/g0;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p5, Lg30/b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lg30/b;

    iget v1, v0, Lg30/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg30/b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg30/b;

    invoke-direct {v0, p0, p5}, Lg30/b;-><init>(Lg30/g;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Lg30/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg30/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p1, p5, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p5, "consumers/payment_details"

    const-string v2, "https://api.stripe.com/v1/"

    invoke-virtual {v2, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    new-instance v2, Ll83/k;

    const-string v4, "request_surface"

    invoke-direct {v2, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v4, "credentials"

    invoke-direct {p3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p2}, Ly00/e8;->c0()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, p5, p4, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->x:Lz00/a;

    iput v3, v0, Lg30/b;->y:I

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, v0}, Lyy/q;->f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLyy/f;Ljava/lang/String;Ls83/i;)Ljava/lang/Object;
    .locals 3

    if-eqz p5, :cond_0

    const-string p5, "do_not_log_consumer_funnel_event"

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, p5}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p5

    goto :goto_0

    :cond_0
    sget-object p5, Lm83/z;->w:Lm83/z;

    :goto_0
    const-string v0, "consumers/sessions/lookup"

    const-string v1, "https://api.stripe.com/v1/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "request_surface"

    invoke-direct {v1, v2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p3, Ll83/k;

    const-string v2, "session_id"

    invoke-direct {p3, v2, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p4, "toLowerCase(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    new-instance p4, Ll83/k;

    const-string v2, "email_address"

    invoke-direct {p4, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v2, "link_auth_intent_id"

    invoke-direct {p1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v2, "customer_id"

    invoke-direct {p2, v2, p7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p3, p4, p1, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-eqz p4, :cond_2

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p4, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {p2, p5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, v0, p6, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/c;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lz00/c;-><init>(I)V

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, p8}, Lyy/q;->e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lyy/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le00/o;)Ljava/lang/Object;
    .locals 11

    const-string v0, "consumers/mobile/sessions/lookup"

    const-string v1, "https://api.stripe.com/v1/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "request_surface"

    invoke-direct {v1, v2, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "toLowerCase(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object p1, v2

    move-object v3, p1

    :goto_0
    new-instance v2, Ll83/k;

    const-string v4, "email_address"

    invoke-direct {v2, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v3

    new-instance v3, Ll83/k;

    const-string v4, "link_auth_intent_id"

    invoke-direct {v3, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "android_verification_token"

    move-object/from16 v6, p5

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "session_id"

    move-object/from16 v7, p9

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p2, :cond_1

    iget-object p1, p2, Ly00/c2;->w:Ljava/lang/String;

    :cond_1
    new-instance v6, Ll83/k;

    const-string p2, "email_source"

    invoke-direct {v6, p2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string p1, "app_id"

    move-object/from16 p2, p6

    invoke-direct {v7, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string p1, "customer_id"

    move-object/from16 p2, p10

    invoke-direct {v8, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const-string p1, "supported_verification_types"

    move-object/from16 p2, p7

    invoke-direct {v9, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const-string p1, "link_auth_token_client_secret"

    move-object/from16 p2, p11

    invoke-direct {v10, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v10}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    const/16 p1, 0x8

    iget-object v1, p0, Lg30/g;->c:Lq30/w0;

    move-object/from16 v2, p8

    invoke-static {v1, v0, v2, p2, p1}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/c;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lz00/c;-><init>(I)V

    iget-object v0, p0, Lg30/g;->a:Lab/i0;

    iget-object v1, p0, Lg30/g;->b:Lwy/a;

    move-object/from16 v2, p12

    invoke-static {v0, v1, p1, p2, v2}, Lyy/q;->e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ly00/k6;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lg30/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lg30/c;

    iget v1, v0, Lg30/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg30/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg30/c;

    invoke-direct {v0, p0, p3}, Lg30/c;-><init>(Lg30/g;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lg30/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg30/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "consumers/mobile/sign_up"

    const-string v2, "https://api.stripe.com/v1/"

    invoke-virtual {v2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ly00/k6;->a()Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->z:Lz00/a;

    iput v3, v0, Lg30/c;->y:I

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object v2, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, v2, p1, p2, v0}, Lyy/q;->f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final g(Ljava/lang/String;ZLjava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p5, Lg30/d;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lg30/d;

    iget v1, v0, Lg30/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg30/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg30/d;

    invoke-direct {v0, p0, p5}, Lg30/d;-><init>(Lg30/g;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Lg30/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg30/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p1, p5, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p5, "consumers/sessions/consent_update"

    const-string v2, "https://api.stripe.com/v1/"

    invoke-virtual {v2, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    new-instance v2, Ll83/k;

    const-string v4, "request_surface"

    invoke-direct {v2, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v4, "credentials"

    invoke-direct {p3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v4, "consent_granted"

    invoke-direct {p2, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p3, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, p5, p4, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    iput v3, v0, Lg30/d;->y:I

    iget-object p2, p0, Lg30/g;->a:Lab/i0;

    iget-object p3, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p2, p3, p1, v0}, Lyy/q;->d(Lab/i0;Lwy/a;Lyy/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lyy/f;Lcz/d;)Ljava/lang/Object;
    .locals 3

    const-string v0, "consumers/sessions/refresh"

    const-string v1, "https://api.stripe.com/v1/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "app_id"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v2, "request_surface"

    invoke-direct {p1, v2, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p4, "consumer_session_client_secret"

    invoke-static {p4, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    new-instance p4, Ll83/k;

    const-string v2, "credentials"

    invoke-direct {p4, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v2, "supported_verification_types"

    invoke-direct {p2, v2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p1, p4, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, v0, p5, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/c;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lz00/c;-><init>(I)V

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, p6}, Lyy/q;->e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyy/f;Ljava/util/LinkedHashMap;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p8, Lg30/e;

    if-eqz v0, :cond_0

    move-object v0, p8

    check-cast v0, Lg30/e;

    iget v1, v0, Lg30/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg30/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg30/e;

    invoke-direct {v0, p0, p8}, Lg30/e;-><init>(Lg30/g;Ls83/c;)V

    :goto_0
    iget-object p8, v0, Lg30/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg30/e;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p8}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p8, Ll83/n;

    iget-object p1, p8, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p8}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p8, "consumers/payment_details/share"

    const-string v2, "https://api.stripe.com/v1/"

    invoke-virtual {v2, p8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p8

    new-instance v2, Ll83/k;

    const-string v4, "request_surface"

    invoke-direct {v2, v4, p5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p5, Ll83/k;

    const-string v4, "id"

    invoke-direct {p5, v4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v4, "expected_payment_method_type"

    invoke-direct {p2, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p3, "consumer_session_client_secret"

    invoke-static {p3, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v4, "credentials"

    invoke-direct {p3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v4, "billing_phone"

    invoke-direct {p1, v4, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p5, p2, p3, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1, p7}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, p8, p6, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->H:Lz00/a;

    iput v3, v0, Lg30/e;->y:I

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, v0}, Lyy/q;->f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final j(Ly00/k6;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lg30/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lg30/f;

    iget v1, v0, Lg30/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg30/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg30/f;

    invoke-direct {v0, p0, p3}, Lg30/f;-><init>(Lg30/g;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lg30/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg30/f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "consumers/accounts/sign_up"

    const-string v2, "https://api.stripe.com/v1/"

    invoke-virtual {v2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ly00/k6;->a()Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->z:Lz00/a;

    iput v3, v0, Lg30/f;->y:I

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object v2, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, v2, p1, p2, v0}, Lyy/q;->f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lyy/f;ZLe00/u;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Ly00/j8;->w:[Ly00/j8;

    const-string v0, "consumers/sessions/start_verification"

    const-string v1, "https://api.stripe.com/v1/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ln83/f;

    invoke-direct {v1}, Ln83/f;-><init>()V

    const-string v2, "request_surface"

    invoke-virtual {v1, v2, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Ll83/k;

    const-string v2, "consumer_session_client_secret"

    invoke-direct {p3, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string p3, "credentials"

    invoke-virtual {v1, p3, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "type"

    const-string p3, "SMS"

    invoke-virtual {v1, p1, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "locale"

    invoke-virtual {p2}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p5, :cond_0

    const-string p1, "is_resend_sms_code"

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lg30/g;->c:Lq30/w0;

    invoke-static {p3, v0, p4, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/b;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object p3, p0, Lg30/g;->a:Lab/i0;

    iget-object p4, p0, Lg30/g;->b:Lwy/a;

    invoke-static {p3, p4, p1, p2, p6}, Lyy/q;->e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
