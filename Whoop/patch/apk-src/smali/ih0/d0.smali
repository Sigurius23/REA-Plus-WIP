.class public abstract synthetic Lih0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V
    .locals 0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p2, p3}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p2, p4, p0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    return-void
.end method

.method public static B(Lp1/q;ZLb2/t;FLp1/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lp1/q;->q(Z)V

    invoke-static {p3, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p4, p0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    return-void
.end method

.method public static C(Lx81/d;)I
    .locals 0

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/w;->q()I

    move-result p0

    return p0
.end method

.method public static D(Lx81/d;Lp1/q;IZ)J
    .locals 2

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->b1()J

    move-result-wide v0

    invoke-virtual {p1, p3}, Lp1/q;->q(Z)V

    return-wide v0
.end method

.method public static E(Lx81/d;)I
    .locals 0

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/w;->b()I

    move-result p0

    return p0
.end method

.method public static final a(I)Z
    .locals 0

    invoke-static {}, Lks/a;->a()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final b(I)Z
    .locals 2

    invoke-static {}, Lks/a;->a()Z

    move-result p0

    if-eqz p0, :cond_1

    :try_start_0
    const-string p0, "org.conscrypt.Conscrypt"

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const-string v0, "isBoringSslFIPSBuild"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Lks/a;->a:Ljava/util/logging/Logger;

    const-string v0, "Conscrypt is not available or does not support checking for FIPS build."

    invoke-virtual {p0, v0}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 p0, 0x1

    :goto_2
    return p0
.end method

.method public static c(Lx81/d;)I
    .locals 0

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/i0;->a()I

    move-result p0

    return p0
.end method

.method public static d(Lx81/d;Lp1/q;IZ)J
    .locals 2

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->X0()J

    move-result-wide v0

    invoke-virtual {p1, p3}, Lp1/q;->q(Z)V

    return-wide v0
.end method

.method public static e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 0

    mul-float/2addr p1, p2

    invoke-static {p1}, Lt0/j;->e(F)Lt0/i;

    move-result-object p1

    invoke-static {p0, p1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    mul-float/2addr p2, p3

    invoke-static {p2, p4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lcom/google/gson/GsonBuilder;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/google/gson/GsonBuilder;

    invoke-direct {p0}, Lcom/google/gson/GsonBuilder;-><init>()V

    return-object p0
.end method

.method public static h(Lci2/b;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, Lci2/b;->b()Lec3/t1;

    move-result-object p0

    invoke-interface {p0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    add-int/2addr p0, p2

    invoke-virtual {p1, p3, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static q(FFLb2/l;Lp1/q;I)Ll0/r1;
    .locals 0

    mul-float/2addr p0, p1

    invoke-static {p0}, Ll0/m;->i(F)Ll0/k;

    move-result-object p0

    invoke-static {p0, p2, p3, p4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lx81/d;Lp1/q;I)Ll3/v0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->b()Lb91/a;

    move-result-object p0

    invoke-virtual {p0}, Lb91/a;->d()Ll3/v0;

    move-result-object p0

    return-object p0
.end method

.method public static s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;
    .locals 0

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    invoke-static {p0, p3, p4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object p0

    return-object p0
.end method

.method public static t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;
    .locals 1

    new-instance v0, Lrf3/d;

    invoke-direct {v0, p0}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p1, p2, v0, p3}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance p0, Lvf3/c;

    invoke-direct {p0, p4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static u(FFLb2/t;Lp1/q;)V
    .locals 0

    mul-float/2addr p0, p1

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p3, p0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    return-void
.end method

.method public static v(FFLb2/t;Lp1/q;Z)V
    .locals 0

    mul-float/2addr p0, p1

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p3, p0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {p3, p4}, Lp1/q;->q(Z)V

    return-void
.end method

.method public static synthetic w(ILjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    const-class p1, Lkotlin/jvm/internal/k;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->n(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p0
.end method

.method public static x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static y(ILx1/b;Lp1/q;Z)V
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-void
.end method

.method public static z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V
    .locals 0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p2, p3}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p2, p4, p0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    return-void
.end method
