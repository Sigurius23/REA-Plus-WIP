.class public final Lqd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/i;


# instance fields
.field public final E:Ljava/util/Map;

.field public final F:Lrd/a;

.field public final G:Ljava/lang/String;

.field public final H:Luf/t;

.field public final I:Lge/b;

.field public final w:Lqd/f;

.field public final x:Lmc/h;

.field public final y:Lmf/u;

.field public final z:Lrd/a;


# direct methods
.method public constructor <init>(Lqd/f;)V
    .locals 7

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/a;->w:Lqd/f;

    new-instance v0, Lmc/h;

    invoke-direct {v0}, Lmc/h;-><init>()V

    iput-object v0, p0, Lqd/a;->x:Lmc/h;

    new-instance v1, Lmf/u;

    iget-object v2, p1, Lqd/f;->w:Lad3/z;

    iget-object v3, v2, Lad3/z;->x:Ljava/lang/Object;

    check-cast v3, Lpf/a;

    invoke-direct {v1, v3}, Lmf/u;-><init>(Lpf/a;)V

    iput-object v1, p0, Lqd/a;->y:Lmf/u;

    new-instance v1, Lrd/a;

    const/4 v3, 0x1

    invoke-direct {v1, p1, v3}, Lrd/a;-><init>(Lqd/f;I)V

    iput-object v1, p0, Lqd/a;->z:Lrd/a;

    iget-object v1, p1, Lqd/f;->E:Lm83/y;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v3, 0x10

    if-ge v1, v3, :cond_0

    move v1, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    new-instance v3, Lue/b;

    const-string v4, "aws.auth#sigv4"

    invoke-direct {v3, v4}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    new-instance v4, Lnf/j;

    sget-object v5, Lwe/p;->a:Lwe/o;

    const-string v6, "sts"

    invoke-direct {v4, v6, v5}, Lnf/j;-><init>(Ljava/lang/String;Lwe/o;)V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    new-instance v3, Lue/b;

    const-string v4, "smithy.api#noAuth"

    invoke-direct {v3, v4}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    sget-object v4, Lnf/a;->a:Lnf/a;

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lqd/a;->E:Ljava/util/Map;

    new-instance v1, Lrd/a;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lrd/a;-><init>(Lqd/f;I)V

    iput-object v1, p0, Lqd/a;->F:Lrd/a;

    const-string v1, "aws.sdk.kotlin.runtime.auth.credentials.internal.sts"

    iput-object v1, p0, Lqd/a;->G:Ljava/lang/String;

    new-instance v3, Luf/t;

    iget-object v4, p1, Lqd/f;->L:Lmg/h;

    invoke-direct {v3, v1, v4}, Luf/t;-><init>(Ljava/lang/String;Lmg/h;)V

    iput-object v3, p0, Lqd/a;->H:Luf/t;

    iget-object v1, v2, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Lpf/a;

    invoke-static {v0, v1}, Lvo/c;->a(Lmc/h;Ljava/lang/Object;)V

    iget-object v1, p1, Lqd/f;->F:Lve/f;

    invoke-static {v0, v1}, Lvo/c;->a(Lmc/h;Ljava/lang/Object;)V

    new-instance v0, Lge/a;

    const-string v1, "STS"

    const-string v2, "1.6.2"

    invoke-direct {v0, v1, v2}, Lge/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p1, Lqd/f;->O:Ljava/lang/String;

    invoke-static {v0, p1}, Lj93/l0;->v(Lge/a;Ljava/lang/String;)Lge/b;

    move-result-object p1

    iput-object p1, p0, Lqd/a;->I:Lge/b;

    return-void
.end method


# virtual methods
.method public final b(Lud/a;Lwc/c1;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v2, Lud/b;

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

    const/16 v2, 0xc

    invoke-direct {v6, v2}, Ldd/c;-><init>(I)V

    new-instance v7, Ldd/b;

    invoke-direct {v7, v2}, Ldd/b;-><init>(I)V

    iget-object v2, p0, Lqd/a;->w:Lqd/f;

    iget-object v3, v2, Lqd/f;->L:Lmg/h;

    invoke-virtual {v9, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lqd/a;->G:Ljava/lang/String;

    iput-object v3, v9, Lb30/m;->F:Ljava/lang/Object;

    iget-object v3, p0, Lqd/a;->H:Luf/t;

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

    iget-object v8, p0, Lqd/a;->E:Ljava/util/Map;

    iget-object v10, p0, Lqd/a;->z:Lrd/a;

    iget-object v11, p0, Lqd/a;->F:Lrd/a;

    invoke-direct {v3, v11, v8, v10}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    iput-object v3, v4, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    new-instance v3, Lrd/a;

    const/4 v8, 0x2

    invoke-direct {v3, v2, v8}, Lrd/a;-><init>(Lqd/f;I)V

    iput-object v3, v4, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    iget-object v3, v2, Lqd/f;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v4, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    iget-object v3, v2, Lqd/f;->K:Lle/a;

    invoke-virtual {v4, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    sget-object v3, Lcf/l;->a:Lgf/a;

    const-string v8, "AssumeRole"

    invoke-virtual {v5, v3, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    sget-object v3, Lcf/l;->b:Lgf/a;

    const-string v8, "STS"

    invoke-virtual {v5, v3, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v8, Luf/v;

    invoke-direct {v8, v1, v0}, Luf/v;-><init>(Lj93/d;Lj93/d;)V

    new-instance v3, Lm63/d;

    invoke-direct/range {v3 .. v9}, Lm63/d;-><init>(Lio/sentry/android/replay/video/d;Ldg/a;Luf/l;Luf/h;Luf/v;Lb30/m;)V

    invoke-virtual {p0, v5}, Lqd/a;->i(Ldg/a;)V

    new-instance v0, Lje/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v0}, Lm63/d;->h(Lje/a;)V

    iget-object v0, v3, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    sget-object v1, Lhe/c;->a:Lhe/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lie/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lqd/f;->F:Lve/f;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    sget-object v1, Lie/a;->x:Lie/a;

    invoke-static {v5, v1}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lq30/w0;

    const/16 v4, 0xe

    invoke-direct {v1, v4}, Lq30/w0;-><init>(I)V

    iget-object v4, v1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lmf/c;

    const-string v5, "application/x-www-form-urlencoded"

    const-string v6, "Content-Type"

    invoke-virtual {v4, v5, v6}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Luf/o;->c(Lm63/d;)V

    new-instance v1, Lhm/d;

    iget-object v4, p0, Lqd/a;->I:Lge/b;

    invoke-direct {v1, v4}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v1, v3}, Lhm/d;->c(Lm63/d;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-interface {v1, v3}, Luf/o;->c(Lm63/d;)V

    iget-object v1, v2, Lqd/f;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lqd/a;->y:Lmf/u;

    invoke-static {v3, v0, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lqd/a;->x:Lmc/h;

    invoke-virtual {v0}, Lmc/h;->a()V

    return-void
.end method

.method public final h(Lud/c;Lwc/g1;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v2, Lud/d;

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

    const/16 v2, 0xd

    invoke-direct {v6, v2}, Ldd/c;-><init>(I)V

    new-instance v7, Ldd/b;

    invoke-direct {v7, v2}, Ldd/b;-><init>(I)V

    iget-object v2, p0, Lqd/a;->w:Lqd/f;

    iget-object v3, v2, Lqd/f;->L:Lmg/h;

    invoke-virtual {v9, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lqd/a;->G:Ljava/lang/String;

    iput-object v3, v9, Lb30/m;->F:Ljava/lang/Object;

    iget-object v3, p0, Lqd/a;->H:Luf/t;

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

    iget-object v8, p0, Lqd/a;->E:Ljava/util/Map;

    iget-object v10, p0, Lqd/a;->z:Lrd/a;

    iget-object v11, p0, Lqd/a;->F:Lrd/a;

    invoke-direct {v3, v11, v8, v10}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    iput-object v3, v4, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    new-instance v3, Lrd/a;

    const/4 v8, 0x2

    invoke-direct {v3, v2, v8}, Lrd/a;-><init>(Lqd/f;I)V

    iput-object v3, v4, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    iget-object v3, v2, Lqd/f;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v4, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    iget-object v3, v2, Lqd/f;->K:Lle/a;

    invoke-virtual {v4, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    sget-object v3, Lcf/l;->a:Lgf/a;

    const-string v8, "AssumeRoleWithWebIdentity"

    invoke-virtual {v5, v3, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    sget-object v3, Lcf/l;->b:Lgf/a;

    const-string v8, "STS"

    invoke-virtual {v5, v3, v8}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v8, Luf/v;

    invoke-direct {v8, v1, v0}, Luf/v;-><init>(Lj93/d;Lj93/d;)V

    new-instance v3, Lm63/d;

    invoke-direct/range {v3 .. v9}, Lm63/d;-><init>(Lio/sentry/android/replay/video/d;Ldg/a;Luf/l;Luf/h;Luf/v;Lb30/m;)V

    invoke-virtual {p0, v5}, Lqd/a;->i(Ldg/a;)V

    new-instance v0, Lje/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v0}, Lm63/d;->h(Lje/a;)V

    iget-object v0, v3, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    sget-object v1, Lhe/c;->a:Lhe/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lie/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lqd/f;->F:Lve/f;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    sget-object v1, Lie/a;->x:Lie/a;

    invoke-static {v5, v1}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lq30/w0;

    const/16 v4, 0xe

    invoke-direct {v1, v4}, Lq30/w0;-><init>(I)V

    iget-object v4, v1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lmf/c;

    const-string v5, "application/x-www-form-urlencoded"

    const-string v6, "Content-Type"

    invoke-virtual {v4, v5, v6}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Luf/o;->c(Lm63/d;)V

    new-instance v1, Lhm/d;

    iget-object v4, p0, Lqd/a;->I:Lge/b;

    invoke-direct {v1, v4}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v1, v3}, Lhm/d;->c(Lm63/d;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-interface {v1, v3}, Luf/o;->c(Lm63/d;)V

    iget-object v1, v2, Lqd/f;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lqd/a;->y:Lmf/u;

    invoke-static {v3, v0, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ldg/a;)V
    .locals 3

    sget-object v0, Luf/i;->a:Lgf/a;

    iget-object v1, p0, Lqd/a;->w:Lqd/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Luf/i;->b:Lgf/a;

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lcf/l;->c:Lgf/a;

    iget-object v2, v1, Lqd/f;->y:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lcf/l;->d:Lgf/a;

    iget-object v2, v1, Lqd/f;->J:Lcf/e;

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lye/a;->a:Lgf/a;

    iget-object v2, v1, Lqd/f;->z:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lwe/f;->a:Lgf/a;

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lwe/f;->d:Lgf/a;

    const-string v2, "sts"

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lwe/f;->f:Lgf/a;

    iget-object v2, v1, Lqd/f;->F:Lve/f;

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lyd/d;->a:Lgf/a;

    iget-object v1, v1, Lqd/f;->O:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    return-void
.end method
