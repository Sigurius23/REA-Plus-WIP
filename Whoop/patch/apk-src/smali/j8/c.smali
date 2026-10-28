.class public abstract Lj8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Landroidx/lifecycle/g0;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v2, "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"

    const-string v3, "getLocalLifecycleOwner"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    instance-of v5, v5, Ll83/c;

    if-eqz v5, :cond_1

    :cond_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lp1/t1;

    if-eqz v2, :cond_0

    check-cast v1, Lp1/t1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_2
    instance-of v2, v1, Ll83/m;

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    check-cast v0, Lp1/t1;

    if-nez v0, :cond_4

    new-instance v0, Lj02/w;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    move-object v0, v1

    :cond_4
    sput-object v0, Lj8/c;->a:Lp1/t1;

    return-void
.end method
