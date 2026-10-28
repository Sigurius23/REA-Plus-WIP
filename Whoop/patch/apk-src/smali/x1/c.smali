.class public abstract Lx1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:[Ljava/lang/StackTraceElement;

.field public static final c:Lx1/i;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx1/c;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    sput-object v0, Lx1/c;->b:[Ljava/lang/StackTraceElement;

    new-instance v0, Lx1/i;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Lx1/i;-><init>(I[J[Ljava/lang/Object;)V

    sput-object v0, Lx1/c;->c:Lx1/i;

    return-void
.end method

.method public static final a(II)I
    .locals 0

    rem-int/lit8 p1, p1, 0xa

    mul-int/lit8 p1, p1, 0x3

    add-int/lit8 p1, p1, 0x1

    shl-int/2addr p0, p1

    return p0
.end method

.method public static final b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;
    .locals 3

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    check-cast p1, Lp1/q;

    sget-object v2, Lx1/c;->a:Ljava/lang/Object;

    invoke-virtual {p1, v1, v2}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_0

    new-instance v1, Lx1/b;

    invoke-direct {v1, p2, v0, p0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p0, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lx1/b;

    invoke-virtual {v1, p2}, Lx1/b;->k(Ll83/e;)V

    :goto_0
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    return-object v1
.end method

.method public static final c()J
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final d(Lp1/q;Lc93/m;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v0, p1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;
    .locals 2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lx1/b;

    invoke-virtual {v0, p2}, Lx1/b;->k(Ll83/e;)V

    return-object v0
.end method

.method public static final f(Lp1/v1;Lp1/v1;)Z
    .locals 1

    if-eqz p0, :cond_1

    instance-of v0, p0, Lp1/v1;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp1/v1;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Lp1/v1;->c:Lp1/a;

    iget-object p1, p1, Lp1/v1;->c:Lp1/a;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
