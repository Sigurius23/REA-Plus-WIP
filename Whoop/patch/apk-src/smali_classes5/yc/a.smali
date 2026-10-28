.class public final Lyc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/i;


# instance fields
.field public final E:Ljava/util/Map;

.field public final F:Lbd/b;

.field public final G:Ljava/lang/String;

.field public final H:Luf/t;

.field public final I:Lge/b;

.field public final w:Lyc/f;

.field public final x:Lmc/h;

.field public final y:Lmf/u;

.field public final z:Lbd/b;


# direct methods
.method public constructor <init>(Lyc/f;)V
    .locals 4

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc/a;->w:Lyc/f;

    new-instance v0, Lmc/h;

    invoke-direct {v0}, Lmc/h;-><init>()V

    iput-object v0, p0, Lyc/a;->x:Lmc/h;

    new-instance v0, Lmf/u;

    iget-object v1, p1, Lyc/f;->w:Lad3/z;

    iget-object v1, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Lpf/a;

    invoke-direct {v0, v1}, Lmf/u;-><init>(Lpf/a;)V

    iput-object v0, p0, Lyc/a;->y:Lmf/u;

    new-instance v0, Lbd/b;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lbd/b;-><init>(Lyc/f;I)V

    iput-object v0, p0, Lyc/a;->z:Lbd/b;

    iget-object p1, p1, Lyc/f;->G:Lm83/y;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lnf/e;

    invoke-interface {v2}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lue/b;

    invoke-direct {v3, v2}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    new-instance v0, Lue/b;

    const-string v1, "aws.auth#sigv4"

    invoke-direct {v0, v1}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lnf/j;

    sget-object v2, Lwe/p;->a:Lwe/o;

    const-string v3, "signin"

    invoke-direct {v1, v3, v2}, Lnf/j;-><init>(Ljava/lang/String;Lwe/o;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance v0, Lue/b;

    const-string v1, "smithy.api#noAuth"

    invoke-direct {v0, v1}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, Lnf/a;->a:Lnf/a;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {p1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lyc/a;->E:Ljava/util/Map;

    new-instance p1, Lbd/b;

    iget-object v0, p0, Lyc/a;->w:Lyc/f;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lbd/b;-><init>(Lyc/f;I)V

    iput-object p1, p0, Lyc/a;->F:Lbd/b;

    const-string p1, "aws.sdk.kotlin.runtime.auth.credentials.internal.signin"

    iput-object p1, p0, Lyc/a;->G:Ljava/lang/String;

    new-instance v0, Luf/t;

    iget-object v1, p0, Lyc/a;->w:Lyc/f;

    iget-object v1, v1, Lyc/f;->N:Lmg/h;

    invoke-direct {v0, p1, v1}, Luf/t;-><init>(Ljava/lang/String;Lmg/h;)V

    iput-object v0, p0, Lyc/a;->H:Luf/t;

    iget-object p1, p0, Lyc/a;->x:Lmc/h;

    iget-object v0, p0, Lyc/a;->w:Lyc/f;

    iget-object v0, v0, Lyc/f;->w:Lad3/z;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lpf/a;

    invoke-static {p1, v0}, Lvo/c;->a(Lmc/h;Ljava/lang/Object;)V

    iget-object p1, p0, Lyc/a;->x:Lmc/h;

    iget-object v0, p0, Lyc/a;->w:Lyc/f;

    iget-object v0, v0, Lyc/f;->H:Lve/f;

    invoke-static {p1, v0}, Lvo/c;->a(Lmc/h;Ljava/lang/Object;)V

    new-instance p1, Lge/a;

    const-string v0, "Signin"

    const-string v1, "1.6.2"

    invoke-direct {p1, v0, v1}, Lge/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lyc/a;->w:Lyc/f;

    iget-object v0, v0, Lyc/f;->Q:Ljava/lang/String;

    invoke-static {p1, v0}, Lj93/l0;->v(Lge/a;Ljava/lang/String;)Lge/b;

    move-result-object p1

    iput-object p1, p0, Lyc/a;->I:Lge/b;

    return-void
.end method


# virtual methods
.method public final b(Lcd/c;Lwc/c0;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcd/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v2, Lcd/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v2, "inputType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "outputType"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lb30/m;

    const/16 v2, 0x14

    invoke-direct {v9, v2}, Lb30/m;-><init>(I)V

    sget-object v2, Lmg/h;->a:Lmg/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lmg/g;->b:Lmg/f;

    iput-object v2, v9, Lb30/m;->x:Ljava/lang/Object;

    sget-object v2, Lrg/d;->x:Lrg/d;

    iput-object v2, v9, Lb30/m;->y:Ljava/lang/Object;

    sget-object v2, Lgf/i;->w:Lgf/i;

    iput-object v2, v9, Lb30/m;->z:Ljava/lang/Object;

    sget-object v2, Luf/t;->n:Luf/t;

    iput-object v2, v9, Lb30/m;->E:Ljava/lang/Object;

    new-instance v4, Lio/sentry/android/replay/video/d;

    const/4 v2, 0x4

    invoke-direct {v4, v2}, Lio/sentry/android/replay/video/d;-><init>(I)V

    new-instance v5, Ldg/a;

    invoke-direct {v5}, Ldg/a;-><init>()V

    new-instance v6, Ldd/c;

    const/4 v2, 0x0

    invoke-direct {v6, v2}, Ldd/c;-><init>(I)V

    new-instance v7, Ldd/b;

    invoke-direct {v7, v2}, Ldd/b;-><init>(I)V

    iget-object v2, p0, Lyc/a;->w:Lyc/f;

    iget-object v3, v2, Lyc/f;->N:Lmg/h;

    invoke-virtual {v9, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lyc/a;->G:Ljava/lang/String;

    iput-object v3, v9, Lb30/m;->F:Ljava/lang/Object;

    iget-object v3, p0, Lyc/a;->H:Luf/t;

    invoke-virtual {v9, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Lgf/c;

    invoke-direct {v3}, Lgf/c;-><init>()V

    new-instance v8, Lgf/a;

    const-string v10, "rpc.system"

    invoke-direct {v8, v10}, Lgf/a;-><init>(Ljava/lang/String;)V

    const-string v10, "aws-api"

    invoke-virtual {v3, v8, v10}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    iput-object v3, v9, Lb30/m;->z:Ljava/lang/Object;

    new-instance v3, Luf/p;

    iget-object v8, p0, Lyc/a;->E:Ljava/util/Map;

    iget-object v10, p0, Lyc/a;->z:Lbd/b;

    iget-object v11, p0, Lyc/a;->F:Lbd/b;

    invoke-direct {v3, v11, v8, v10}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    iput-object v3, v4, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    new-instance v3, Lbd/b;

    const/4 v8, 0x0

    invoke-direct {v3, v2, v8}, Lbd/b;-><init>(Lyc/f;I)V

    iput-object v3, v4, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    iget-object v3, v2, Lyc/f;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v4, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    iget-object v3, v2, Lyc/f;->M:Lgg/g;

    invoke-virtual {v4, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    sget-object v3, Lcf/l;->a:Lgf/a;

    const-string v8, "CreateOAuth2Token"

    invoke-virtual {v5, v3, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    sget-object v3, Lcf/l;->b:Lgf/a;

    const-string v8, "Signin"

    invoke-virtual {v5, v3, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v8, Luf/v;

    invoke-direct {v8, v1, v0}, Luf/v;-><init>(Lj93/d;Lj93/d;)V

    new-instance v3, Lm63/d;

    invoke-direct/range {v3 .. v9}, Lm63/d;-><init>(Lio/sentry/android/replay/video/d;Ldg/a;Luf/l;Luf/h;Luf/v;Lb30/m;)V

    sget-object v0, Luf/i;->a:Lgf/a;

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Luf/i;->b:Lgf/a;

    invoke-static {v5, v0, v1}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lcf/l;->c:Lgf/a;

    iget-object v1, v2, Lyc/f;->y:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lcf/l;->d:Lgf/a;

    iget-object v1, v2, Lyc/f;->L:Lcf/e;

    invoke-static {v5, v0, v1}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lye/a;->a:Lgf/a;

    iget-object v1, v2, Lyc/f;->z:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lwe/f;->a:Lgf/a;

    invoke-static {v5, v0, v1}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lwe/f;->d:Lgf/a;

    const-string v1, "signin"

    invoke-static {v5, v0, v1}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lwe/f;->f:Lgf/a;

    iget-object v1, v2, Lyc/f;->H:Lve/f;

    invoke-static {v5, v0, v1}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lyd/d;->a:Lgf/a;

    iget-object v4, v2, Lyc/f;->Q:Ljava/lang/String;

    invoke-static {v5, v0, v4}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    new-instance v0, Lje/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v0}, Lm63/d;->h(Lje/a;)V

    iget-object v0, v3, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    sget-object v4, Lhe/c;->a:Lhe/c;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lie/c;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    sget-object v1, Lie/a;->x:Lie/a;

    invoke-static {v5, v1}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lhm/d;

    iget-object v4, p0, Lyc/a;->I:Lge/b;

    invoke-direct {v1, v4}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v1, v3}, Lhm/d;->c(Lm63/d;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-interface {v1, v3}, Luf/o;->c(Lm63/d;)V

    iget-object v1, v2, Lyc/f;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lyc/a;->y:Lmf/u;

    invoke-static {v3, v0, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lyc/a;->x:Lmc/h;

    invoke-virtual {v0}, Lmc/h;->a()V

    return-void
.end method
