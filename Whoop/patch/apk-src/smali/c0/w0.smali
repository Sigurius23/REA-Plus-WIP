.class public abstract Lc0/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/f2;

.field public static final b:Ld0/i1;

.field public static final c:Ld0/i1;

.field public static final d:Ld0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    sget-object v0, Lc0/d;->F:Lc0/d;

    sget-object v1, Lc0/d;->G:Lc0/d;

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Lc0/w0;->a:Ld0/f2;

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v2, v3, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Lc0/w0;->b:Ld0/i1;

    const/4 v0, 0x1

    int-to-long v4, v0

    const/16 v1, 0x20

    shl-long v6, v4, v1

    const-wide v8, 0xffffffffL

    and-long/2addr v4, v8

    or-long/2addr v4, v6

    new-instance v1, Ly3/j;

    invoke-direct {v1, v4, v5}, Ly3/j;-><init>(J)V

    invoke-static {v2, v3, v0, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    sput-object v1, Lc0/w0;->c:Ld0/i1;

    new-instance v1, Ly3/l;

    invoke-direct {v1, v4, v5}, Ly3/l;-><init>(J)V

    invoke-static {v2, v3, v0, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Lc0/w0;->d:Ld0/i1;

    return-void
.end method

.method public static a(Ld0/i1;Lb2/k;I)Lc0/d1;
    .locals 9

    sget-object v0, Lb2/e;->O:Lb2/k;

    and-int/lit8 v1, p2, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    int-to-long v3, v2

    const/16 p0, 0x20

    shl-long v5, v3, p0

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    new-instance p0, Ly3/l;

    invoke-direct {p0, v3, v4}, Ly3/l;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v1, v3, v2, p0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move-object p1, v0

    :cond_1
    sget-object p2, Lb2/e;->M:Lb2/k;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p1, Lb2/e;->z:Lb2/m;

    goto :goto_0

    :cond_2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lb2/e;->F:Lb2/m;

    goto :goto_0

    :cond_3
    sget-object p1, Lb2/e;->E:Lb2/m;

    :goto_0
    new-instance p2, Lc0/d;

    const/16 v0, 0xa

    invoke-direct {p2, v2, v0}, Lc0/d;-><init>(II)V

    invoke-static {p1, p0, p2, v2}, Lc0/w0;->b(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/d1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/d1;
    .locals 8

    new-instance v0, Lc0/d1;

    new-instance v1, Lc0/u1;

    new-instance v4, Lc0/k0;

    invoke-direct {v4, p0, p1, p2, p3}, Lc0/k0;-><init>(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)V

    const/4 v6, 0x0

    const/16 v7, 0x3b

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {v0, v1}, Lc0/d1;-><init>(Lc0/u1;)V

    return-object v0
.end method

.method public static c(Ld0/e2;I)Lc0/d1;
    .locals 9

    sget-object v0, Lb2/e;->E:Lb2/m;

    and-int/lit8 v1, p1, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    int-to-long v3, v2

    const/16 p0, 0x20

    shl-long v5, v3, p0

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    new-instance p0, Ly3/l;

    invoke-direct {p0, v3, v4}, Ly3/l;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v1, v3, v2, p0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 v1, p1, 0x2

    if-eqz v1, :cond_1

    sget-object v0, Lb2/e;->I:Lb2/m;

    :cond_1
    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    sget-object p1, Lc0/c;->I:Lc0/c;

    invoke-static {v0, p0, p1, v2}, Lc0/w0;->b(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/d1;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;
    .locals 10

    sget-object v0, Lb2/e;->L:Lb2/l;

    sget-object v1, Lb2/e;->J:Lb2/l;

    and-int/lit8 v2, p2, 0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    int-to-long v4, v3

    const/16 p0, 0x20

    shl-long v6, v4, p0

    const-wide v8, 0xffffffffL

    and-long/2addr v4, v8

    or-long/2addr v4, v6

    new-instance p0, Ly3/l;

    invoke-direct {p0, v4, v5}, Ly3/l;-><init>(J)V

    const/4 v2, 0x0

    const/high16 v4, 0x43c80000    # 400.0f

    invoke-static {v2, v4, v3, p0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 v2, p2, 0x2

    if-eqz v2, :cond_1

    move-object v2, v0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_2

    sget-object p1, Lc0/d;->H:Lc0/d;

    :cond_2
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lb2/e;->x:Lb2/m;

    goto :goto_1

    :cond_3
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lb2/e;->H:Lb2/m;

    goto :goto_1

    :cond_4
    sget-object p2, Lb2/e;->E:Lb2/m;

    :goto_1
    new-instance v0, Lc0/v0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p2, p0, v0, v3}, Lc0/w0;->b(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/d1;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ld0/c0;I)Lc0/d1;
    .locals 9

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 v0, 0x5

    const/4 v2, 0x0

    invoke-static {v1, p0, v0, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const v1, 0x3e99999a    # 0.3f

    :goto_0
    new-instance p1, Lc0/d1;

    new-instance v2, Lc0/u1;

    new-instance v3, Lc0/g1;

    invoke-direct {v3, v1, p0}, Lc0/g1;-><init>(FLd0/c0;)V

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p1, v2}, Lc0/d1;-><init>(Lc0/u1;)V

    return-object p1
.end method

.method public static f(Ld0/c0;I)Lc0/f1;
    .locals 8

    and-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p1, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, p1, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    new-instance p1, Lc0/f1;

    new-instance v1, Lc0/u1;

    new-instance v2, Lc0/g1;

    invoke-direct {v2, v0, p0}, Lc0/g1;-><init>(FLd0/c0;)V

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p1, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    return-object p1
.end method

.method public static g(Ld0/e2;FI)Lc0/d1;
    .locals 9

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    sget-wide v0, Li2/e1;->b:J

    new-instance p2, Lc0/d1;

    new-instance v2, Lc0/u1;

    new-instance v6, Lc0/l1;

    invoke-direct {v6, p1, v0, v1, p0}, Lc0/l1;-><init>(FJLd0/c0;)V

    const/4 v7, 0x0

    const/16 v8, 0x37

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p2, v2}, Lc0/d1;-><init>(Lc0/u1;)V

    return-object p2
.end method

.method public static h(Ld0/e2;JI)Lc0/f1;
    .locals 9

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 v0, 0x5

    const/4 v2, 0x0

    invoke-static {v1, p0, v0, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const v1, 0x3f733333    # 0.95f

    :goto_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    sget-wide p1, Li2/e1;->b:J

    :cond_2
    new-instance p3, Lc0/f1;

    new-instance v2, Lc0/u1;

    new-instance v6, Lc0/l1;

    invoke-direct {v6, v1, p1, p2, p0}, Lc0/l1;-><init>(FJLd0/c0;)V

    const/4 v7, 0x0

    const/16 v8, 0x37

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p3, v2}, Lc0/f1;-><init>(Lc0/u1;)V

    return-object p3
.end method

.method public static i()Lc0/f1;
    .locals 7

    const/4 v0, 0x1

    int-to-long v1, v0

    const/16 v3, 0x20

    shl-long v3, v1, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    or-long/2addr v1, v3

    new-instance v3, Ly3/l;

    invoke-direct {v3, v1, v2}, Ly3/l;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, v0, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    sget-object v2, Lb2/e;->O:Lb2/k;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v2, Lb2/e;->z:Lb2/m;

    goto :goto_0

    :cond_0
    invoke-static {v2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lb2/e;->F:Lb2/m;

    goto :goto_0

    :cond_1
    sget-object v2, Lb2/e;->E:Lb2/m;

    :goto_0
    new-instance v3, Lc0/d;

    const/16 v4, 0xb

    invoke-direct {v3, v0, v4}, Lc0/d;-><init>(II)V

    invoke-static {v2, v1, v3, v0}, Lc0/w0;->j(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/f1;

    move-result-object v0

    return-object v0
.end method

.method public static final j(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/f1;
    .locals 8

    new-instance v0, Lc0/f1;

    new-instance v1, Lc0/u1;

    new-instance v4, Lc0/k0;

    invoke-direct {v4, p0, p1, p2, p3}, Lc0/k0;-><init>(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)V

    const/4 v6, 0x0

    const/16 v7, 0x3b

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {v0, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    return-object v0
.end method

.method public static k(Ld0/e2;I)Lc0/f1;
    .locals 9

    sget-object v0, Lb2/e;->E:Lb2/m;

    and-int/lit8 v1, p1, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    int-to-long v3, v2

    const/16 p0, 0x20

    shl-long v5, v3, p0

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    new-instance p0, Ly3/l;

    invoke-direct {p0, v3, v4}, Ly3/l;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v1, v3, v2, p0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 v1, p1, 0x2

    if-eqz v1, :cond_1

    sget-object v0, Lb2/e;->I:Lb2/m;

    :cond_1
    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    sget-object p1, Lc0/c;->J:Lc0/c;

    invoke-static {v0, p0, p1, v2}, Lc0/w0;->j(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/f1;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;
    .locals 9

    sget-object v0, Lb2/e;->L:Lb2/l;

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    int-to-long v3, v2

    const/16 p0, 0x20

    shl-long v5, v3, p0

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    new-instance p0, Ly3/l;

    invoke-direct {p0, v3, v4}, Ly3/l;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v1, v3, v2, p0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 v1, p3, 0x2

    if-eqz v1, :cond_1

    move-object p1, v0

    :cond_1
    and-int/lit8 p3, p3, 0x8

    if-eqz p3, :cond_2

    sget-object p2, Lc0/d;->I:Lc0/d;

    :cond_2
    sget-object p3, Lb2/e;->J:Lb2/l;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p1, Lb2/e;->x:Lb2/m;

    goto :goto_0

    :cond_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lb2/e;->H:Lb2/m;

    goto :goto_0

    :cond_4
    sget-object p1, Lb2/e;->E:Lb2/m;

    :goto_0
    new-instance p3, Lc0/v0;

    const/4 v0, 0x1

    invoke-direct {p3, p2, v0}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p1, p0, p3, v2}, Lc0/w0;->j(Lb2/h;Ld0/c0;Lkotlin/jvm/functions/Function1;Z)Lc0/f1;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;
    .locals 8

    new-instance v0, Lc0/v0;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance p1, Lc0/d1;

    new-instance v1, Lc0/u1;

    new-instance v3, Lc0/s1;

    invoke-direct {v3, p0, v0}, Lc0/s1;-><init>(Ld0/c0;Lkotlin/jvm/functions/Function1;)V

    const/4 v6, 0x0

    const/16 v7, 0x3d

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p1, v1}, Lc0/d1;-><init>(Lc0/u1;)V

    return-object p1
.end method

.method public static n(ILkotlin/jvm/functions/Function1;)Lc0/d1;
    .locals 7

    const/4 v0, 0x1

    int-to-long v1, v0

    const/16 v3, 0x20

    shl-long v3, v1, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    or-long/2addr v1, v3

    new-instance v3, Ly3/j;

    invoke-direct {v3, v1, v2}, Ly3/j;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, v0, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    sget-object p1, Lc0/d;->J:Lc0/d;

    :cond_0
    invoke-static {v0, p1}, Lc0/w0;->m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;
    .locals 8

    new-instance v0, Lc0/v0;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance p1, Lc0/d1;

    new-instance v1, Lc0/u1;

    new-instance v3, Lc0/s1;

    invoke-direct {v3, p0, v0}, Lc0/s1;-><init>(Ld0/c0;Lkotlin/jvm/functions/Function1;)V

    const/4 v6, 0x0

    const/16 v7, 0x3d

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p1, v1}, Lc0/d1;-><init>(Lc0/u1;)V

    return-object p1
.end method

.method public static p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;
    .locals 6

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    int-to-long v0, p0

    const/16 v2, 0x20

    shl-long v2, v0, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    new-instance v2, Ly3/j;

    invoke-direct {v2, v0, v1}, Ly3/j;-><init>(J)V

    const/4 v0, 0x0

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1, p0, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p1, Lc0/c;->K:Lc0/c;

    :cond_1
    invoke-static {p0, p1}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;
    .locals 8

    new-instance v0, Lc0/v0;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance p1, Lc0/f1;

    new-instance v1, Lc0/u1;

    new-instance v3, Lc0/s1;

    invoke-direct {v3, p0, v0}, Lc0/s1;-><init>(Ld0/c0;Lkotlin/jvm/functions/Function1;)V

    const/4 v6, 0x0

    const/16 v7, 0x3d

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p1, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    return-object p1
.end method

.method public static r(Lkotlin/jvm/functions/Function1;)Lc0/f1;
    .locals 7

    const/4 v0, 0x1

    int-to-long v1, v0

    const/16 v3, 0x20

    shl-long v3, v1, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    or-long/2addr v1, v3

    new-instance v3, Ly3/j;

    invoke-direct {v3, v1, v2}, Ly3/j;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, v0, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    invoke-static {v0, p0}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;
    .locals 8

    new-instance v0, Lc0/v0;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance p1, Lc0/f1;

    new-instance v1, Lc0/u1;

    new-instance v3, Lc0/s1;

    invoke-direct {v3, p0, v0}, Lc0/s1;-><init>(Ld0/c0;Lkotlin/jvm/functions/Function1;)V

    const/4 v6, 0x0

    const/16 v7, 0x3d

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {p1, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    return-object p1
.end method

.method public static t(ILkotlin/jvm/functions/Function1;)Lc0/f1;
    .locals 7

    const/4 v0, 0x1

    int-to-long v1, v0

    const/16 v3, 0x20

    shl-long v3, v1, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    or-long/2addr v1, v3

    new-instance v3, Ly3/j;

    invoke-direct {v3, v1, v2}, Ly3/j;-><init>(J)V

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, v0, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    sget-object p1, Lc0/d;->K:Lc0/d;

    :cond_0
    invoke-static {v0, p1}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    return-object p0
.end method
