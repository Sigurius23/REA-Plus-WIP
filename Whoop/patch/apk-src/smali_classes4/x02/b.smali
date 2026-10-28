.class public abstract Lx02/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lud3/l0;",
        "okHttpClient",
        "Lcom/google/gson/Gson;",
        "gson",
        "Lad3/c;",
        "kotlinSerialization",
        "Lv53/c;",
        "d",
        "(Lud3/l0;Lcom/google/gson/Gson;Lad3/c;)Lv53/c;",
        "network_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lud3/l0;Lz53/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lx02/b;->g(Lud3/l0;Lz53/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(La63/f0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lx02/b;->i(La63/f0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lad3/c;Lcom/google/gson/Gson;Lb63/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lx02/b;->h(Lad3/c;Lcom/google/gson/Gson;Lb63/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lud3/l0;Lcom/google/gson/Gson;Lad3/c;)Lv53/c;
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv53/e;

    invoke-direct {v0}, Lv53/e;-><init>()V

    invoke-static {p0, p2, p1, v0}, Lx02/b;->f(Lud3/l0;Lad3/c;Lcom/google/gson/Gson;Lv53/e;)Ll83/a0;

    iget-object p0, v0, Lv53/e;->d:Lkotlin/jvm/internal/m;

    const-string p1, "block"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lz53/g;

    new-instance p2, Lz53/b;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lz53/a;->x:Lz53/a;

    iput-object v1, p2, Lz53/b;->a:Lz53/a;

    const/16 v1, 0xa

    iput v1, p2, Lz53/b;->c:I

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p1, p2}, Lz53/g;-><init>(Lz53/b;)V

    new-instance p0, Lv53/c;

    invoke-direct {p0, p1, v0}, Lv53/c;-><init>(Lz53/g;Lv53/e;)V

    iget-object p2, p0, Lv53/c;->z:Lq83/j;

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p2, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Lbc3/k1;

    new-instance v0, La3/m1;

    const/16 v1, 0x1b

    invoke-direct {v0, p1, v1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p2, v0}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-object p0
.end method

.method public static synthetic e(Lud3/l0;Lcom/google/gson/Gson;Lad3/c;ILjava/lang/Object;)Lv53/c;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lx02/b;->d(Lud3/l0;Lcom/google/gson/Gson;Lad3/c;)Lv53/c;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lud3/l0;Lad3/c;Lcom/google/gson/Gson;Lv53/e;)Ll83/a0;
    .locals 3

    const-string v0, "$this$HttpClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p3, Lv53/e;->g:Z

    new-instance v0, Lrf/p;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    iget-object p0, p3, Lv53/e;->d:Lkotlin/jvm/internal/m;

    new-instance v1, Lb3/t0;

    const/16 v2, 0xb

    invoke-direct {v1, v2, p0, v0}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p3, Lv53/e;->d:Lkotlin/jvm/internal/m;

    sget-object p0, Lb63/f;->c:Lb63/c;

    new-instance v0, Lp3/b0;

    const/16 v1, 0x11

    invoke-direct {v0, v1, p1, p2}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p0, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, La63/h0;->d:La63/g0;

    new-instance p1, Lvb1/a;

    const/16 p2, 0xd

    invoke-direct {p1, p2}, Lvb1/a;-><init>(I)V

    invoke-virtual {p3, p0, p1}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lud3/l0;Lz53/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lz53/b;->b:Lud3/l0;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lad3/c;Lcom/google/gson/Gson;Lb63/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$install"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static {p2, p0}, Ln63/b;->a(Lb63/b;Lad3/c;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p1, p0, v0, p0}, Lx02/a;->b(Lk63/a;Lcom/google/gson/Gson;Li63/d;ILjava/lang/Object;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(La63/f0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$install"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v0, p0, La63/f0;->b:Ljava/lang/Long;

    invoke-static {v0}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v0, p0, La63/f0;->c:Ljava/lang/Long;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
