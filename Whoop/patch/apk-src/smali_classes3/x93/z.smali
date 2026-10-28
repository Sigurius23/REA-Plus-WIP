.class public final Lx93/z;
.super Lx93/v;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "recordComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/z;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/reflect/Member;
    .locals 6

    const-string v0, "recordComponent"

    iget-object v1, p0, Lx93/z;->a:Ljava/lang/Object;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/a;->x:Lso/q;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :try_start_0
    new-instance v3, Lso/q;

    const-string v4, "getType"

    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "getAccessor"

    invoke-virtual {v0, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v3

    goto :goto_0

    :catch_0
    new-instance v0, Lso/q;

    invoke-direct {v0, v2, v2}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    sput-object v0, Ls6/a;->x:Lso/q;

    :cond_0
    iget-object v0, v0, Lso/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.lang.reflect.Method"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/reflect/Method;

    :goto_1
    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    new-instance v0, Ljava/lang/NoSuchMethodError;

    const-string v1, "Can\'t find `getAccessor` method"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()Lma3/e;
    .locals 6

    const-string v0, "recordComponent"

    iget-object v1, p0, Lx93/z;->a:Ljava/lang/Object;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls6/a;->x:Lso/q;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :try_start_0
    new-instance v3, Lso/q;

    const-string v4, "getType"

    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "getAccessor"

    invoke-virtual {v0, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v3

    goto :goto_0

    :catch_0
    new-instance v0, Lso/q;

    invoke-direct {v0, v2, v2}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    sput-object v0, Ls6/a;->x:Lso/q;

    :cond_0
    iget-object v0, v0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.lang.Class<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Class;

    :goto_1
    if-eqz v2, :cond_2

    new-instance v0, Lx93/p;

    invoke-direct {v0, v2}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/NoSuchMethodError;

    const-string v1, "Can\'t find `getType` method"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    throw v0
.end method
