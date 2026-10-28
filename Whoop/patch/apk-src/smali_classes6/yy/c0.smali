.class public final Lyy/c0;
.super Lyy/e0;
.source "SourceFile"


# instance fields
.field public final b:Lyy/b0;

.field public final c:Lqy/c;

.field public final d:Ljava/util/Locale;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Lyy/i0;

.field public final h:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lyy/f;Lqy/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "options"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "locale"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "apiVersion"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyy/b0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lyy/c0;->b:Lyy/b0;

    iput-object p2, p0, Lyy/c0;->c:Lqy/c;

    iput-object v0, p0, Lyy/c0;->d:Ljava/util/Locale;

    iput-object p3, p0, Lyy/c0;->e:Ljava/lang/String;

    iput-object p4, p0, Lyy/c0;->f:Ljava/lang/String;

    new-instance p1, Lyy/i0;

    invoke-direct {p1}, Lyy/i0;-><init>()V

    iput-object p1, p0, Lyy/c0;->g:Lyy/i0;

    sget-object p1, Lyy/l0;->x:Lyy/l0;

    sget-object p1, Lyy/e0;->a:Ljava/lang/String;

    const-string p2, "application/x-www-form-urlencoded; charset="

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Content-Type"

    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lyy/c0;->h:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 6

    iget-object v0, p0, Lyy/c0;->b:Lyy/b0;

    iget-object v0, v0, Lyy/b0;->x:Ljava/lang/Object;

    check-cast v0, Lyy/f;

    new-instance v1, Ll83/k;

    const-string v2, "Accept"

    const-string v3, "application/json"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "Stripe-Version"

    iget-object v4, p0, Lyy/c0;->e:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v0, Lyy/f;->w:Ljava/lang/String;

    const-string v4, "Bearer "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v5, "Authorization"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lyy/c0;->g:Lyy/i0;

    iget-object v3, p0, Lyy/c0;->c:Lqy/c;

    invoke-virtual {v2, v3}, Lyy/i0;->a(Lqy/c;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v0}, Lyy/f;->h()Z

    move-result v2

    sget-object v3, Lm83/z;->w:Lm83/z;

    if-eqz v2, :cond_0

    const-string v2, "Stripe-Livemode"

    invoke-static {v2}, Landroid/system/Os;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "false"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iget-object v2, v0, Lyy/f;->x:Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const-string v5, "Stripe-Account"

    invoke-static {v5, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    if-nez v2, :cond_2

    move-object v2, v3

    :cond_2
    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iget-object v0, v0, Lyy/f;->y:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v2, "Idempotency-Key"

    invoke-static {v2, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v4

    :goto_2
    if-nez v0, :cond_4

    move-object v0, v3

    :cond_4
    invoke-static {v1, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Lyy/c0;->d:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "und"

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    move-object v1, v4

    :goto_3
    if-eqz v1, :cond_6

    const-string v2, "Accept-Language"

    invoke-static {v2, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    :cond_6
    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    move-object v3, v4

    :goto_4
    invoke-static {v0, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 8

    const-string v0, "sdkVersion"

    iget-object v1, p0, Lyy/c0;->f:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Stripe/v1 "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lyy/c0;->c:Lqy/c;

    if-eqz v2, :cond_2

    iget-object v3, v2, Lqy/c;->w:Ljava/lang/String;

    iget-object v4, v2, Lqy/c;->x:Ljava/lang/String;

    if-eqz v4, :cond_0

    const-string v5, "/"

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    iget-object v2, v2, Lqy/c;->y:Ljava/lang/String;

    if-eqz v2, :cond_1

    const-string v1, " ("

    const-string v5, ")"

    invoke-static {v1, v2, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    filled-new-array {v3, v4, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    :cond_2
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, " "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 8

    invoke-static {}, Lyy/e0;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Lyy/c0;->c:Lqy/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lqy/c;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v4, "\":\""

    const-string v5, "\""

    invoke-static {v5, v3, v4, v1, v5}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, ","

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{"

    const-string v2, "}"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
