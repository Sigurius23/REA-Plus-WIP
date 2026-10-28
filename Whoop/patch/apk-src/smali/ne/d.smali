.class public final Lne/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne/c;


# instance fields
.field public final E:Ljava/util/Map;

.field public final F:Lad3/z;

.field public final G:Ljava/lang/String;

.field public final H:Luf/t;

.field public final I:Lge/b;

.field public final w:Lne/b;

.field public final x:Lmc/h;

.field public final y:Lmf/u;

.field public final z:Laj/c;


# direct methods
.method public constructor <init>(Lne/b;)V
    .locals 7

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne/d;->w:Lne/b;

    new-instance v0, Lmc/h;

    invoke-direct {v0}, Lmc/h;-><init>()V

    iput-object v0, p0, Lne/d;->x:Lmc/h;

    new-instance v1, Lmf/u;

    iget-object v2, p1, Lne/b;->w:Lad3/z;

    iget-object v3, v2, Lad3/z;->x:Ljava/lang/Object;

    check-cast v3, Lpf/a;

    invoke-direct {v1, v3}, Lmf/u;-><init>(Lpf/a;)V

    iput-object v1, p0, Lne/d;->y:Lmf/u;

    new-instance v1, Laj/c;

    invoke-direct {v1, p1}, Laj/c;-><init>(Lne/b;)V

    iput-object v1, p0, Lne/d;->z:Laj/c;

    iget-object v1, p1, Lne/b;->E:Lm83/y;

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

    const-string v6, "cognito-idp"

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

    iput-object v1, p0, Lne/d;->E:Ljava/util/Map;

    new-instance v1, Lad3/z;

    invoke-direct {v1, p1}, Lad3/z;-><init>(Lne/b;)V

    iput-object v1, p0, Lne/d;->F:Lad3/z;

    const-string v1, "aws.sdk.kotlin.services.cognitoidentityprovider"

    iput-object v1, p0, Lne/d;->G:Ljava/lang/String;

    new-instance v3, Luf/t;

    iget-object v4, p1, Lne/b;->L:Lmg/h;

    invoke-direct {v3, v1, v4}, Luf/t;-><init>(Ljava/lang/String;Lmg/h;)V

    iput-object v3, p0, Lne/d;->H:Luf/t;

    iget-object v1, v2, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Lpf/a;

    invoke-static {v0, v1}, Lvo/c;->a(Lmc/h;Ljava/lang/Object;)V

    iget-object v1, p1, Lne/b;->F:Lve/c;

    invoke-static {v0, v1}, Lvo/c;->a(Lmc/h;Ljava/lang/Object;)V

    new-instance v0, Lge/a;

    const-string v1, "Cognito Identity Provider"

    const-string v2, "1.6.2"

    invoke-direct {v0, v1, v2}, Lge/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p1, Lne/b;->O:Ljava/lang/String;

    invoke-static {v0, p1}, Lj93/l0;->v(Lge/a;Ljava/lang/String;)Lge/b;

    move-result-object p1

    iput-object p1, p0, Lne/d;->I:Lge/b;

    return-void
.end method


# virtual methods
.method public final J(Lre/w0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/w0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/x0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "SetUserMFAPreference"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final T(Lre/c1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/c1;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/d1;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "UpdateUserAttributes"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a0(Lre/e1;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/e1;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/f1;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "VerifyUserAttribute"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lre/a0;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/a0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/b0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "ChangePassword"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lne/d;->x:Lmc/h;

    invoke-virtual {v0}, Lmc/h;->a()V

    return-void
.end method

.method public final h(Lre/l0;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/l0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/m0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "GetUser"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lre/j0;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/j0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/k0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "GetUserAttributeVerificationCode"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lre/n0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/n0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/o0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "InitiateAuth"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ldg/a;)V
    .locals 3

    invoke-static {}, Luf/i;->a()Lgf/a;

    move-result-object v0

    iget-object v1, p0, Lne/d;->w:Lne/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Luf/i;->b()Lgf/a;

    move-result-object v0

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lcf/l;->a()Lgf/a;

    move-result-object v0

    iget-object v2, v1, Lne/b;->y:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lcf/l;->b()Lgf/a;

    move-result-object v0

    iget-object v2, v1, Lne/b;->J:Lcf/e;

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lye/a;->a()Lgf/a;

    move-result-object v0

    iget-object v2, v1, Lne/b;->z:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lwe/f;->j()Lgf/a;

    move-result-object v0

    invoke-static {p1, v0, v2}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lwe/f;->l()Lgf/a;

    move-result-object v0

    const-string v2, "cognito-idp"

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lwe/f;->b()Lgf/a;

    move-result-object v0

    iget-object v2, v1, Lne/b;->F:Lve/c;

    invoke-static {p1, v0, v2}, Ljc/x;->j0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-static {}, Lyd/d;->a()Lgf/a;

    move-result-object v0

    iget-object v1, v1, Lne/b;->O:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ljc/x;->k0(Ldg/a;Lgf/a;Ljava/lang/Object;)V

    return-void
.end method

.method public final s(Lre/r0;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/r0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/s0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "RespondToAuthChallenge"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lre/t0;Lq83/d;)Ljava/lang/Object;
    .locals 7

    new-instance v0, Lev/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lre/t0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lre/u0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v1, Ldd/c;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ldd/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->j(Luf/l;)V

    new-instance v1, Ldd/b;

    invoke-direct {v1, v2}, Ldd/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lev/i;->h(Luf/h;)V

    const-string v1, "RevokeToken"

    invoke-virtual {v0, v1}, Lev/i;->i(Ljava/lang/String;)V

    const-string v1, "Cognito Identity Provider"

    invoke-virtual {v0, v1}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v0}, Lev/i;->f()Lb30/m;

    move-result-object v1

    iget-object v2, p0, Lne/d;->w:Lne/b;

    iget-object v3, v2, Lne/b;->L:Lmg/h;

    invoke-virtual {v1, v3}, Lb30/m;->K(Lmg/h;)V

    iget-object v3, p0, Lne/d;->G:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lb30/m;->L(Ljava/lang/String;)V

    iget-object v3, p0, Lne/d;->H:Luf/t;

    invoke-virtual {v1, v3}, Lb30/m;->J(Luf/t;)V

    new-instance v3, Le10/k0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Le10/k0;-><init>(I)V

    invoke-virtual {v3}, Le10/k0;->N()V

    invoke-virtual {v3}, Le10/k0;->y()Lgf/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb30/m;->H(Lgf/c;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Luf/p;

    iget-object v4, p0, Lne/d;->E:Ljava/util/Map;

    iget-object v5, p0, Lne/d;->z:Laj/c;

    iget-object v6, p0, Lne/d;->F:Lad3/z;

    invoke-direct {v3, v6, v4, v5}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->k(Luf/p;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    new-instance v3, Lq30/u0;

    invoke-direct {v3, v2}, Lq30/u0;-><init>(Lne/b;)V

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->x:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Leg/o;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->n(Leg/o;)V

    invoke-virtual {v0}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object v1

    iget-object v3, v2, Lne/b;->K:Lle/a;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/video/d;->m(Lgg/g;)V

    invoke-virtual {v0}, Lev/i;->a()Lm63/d;

    move-result-object v0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lne/d;->m(Ldg/a;)V

    new-instance v1, Lje/a;

    invoke-direct {v1}, Lje/a;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->h(Lje/a;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    sget-object v3, Lhe/c;->a:Lhe/c;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lie/c;

    invoke-direct {v3}, Lie/c;-><init>()V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lne/b;->F:Lve/c;

    instance-of v1, v1, Lwc/a1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm63/d;->d()Ldg/a;

    move-result-object v1

    sget-object v3, Lie/a;->x:Lie/a;

    invoke-static {v1, v3}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_0
    new-instance v1, Lz40/i;

    invoke-direct {v1}, Lz40/i;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lhm/d;

    iget-object v3, p0, Lne/d;->I:Lge/b;

    invoke-direct {v1, v3}, Lhm/d;-><init>(Lge/b;)V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    new-instance v1, Lje/b;

    invoke-direct {v1}, Lje/b;-><init>()V

    invoke-virtual {v0, v1}, Lm63/d;->i(Luf/o;)V

    invoke-virtual {v0}, Lm63/d;->f()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, v2, Lne/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lne/d;->y:Lmf/u;

    invoke-static {v0, v1, p1, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
