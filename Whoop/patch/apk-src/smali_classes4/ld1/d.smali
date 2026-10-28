.class public abstract Lld1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u001a\u0089\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0014\u0008\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00020\t2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bj\u0004\u0018\u0001`\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0091\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0014\u0008\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00020\t2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bj\u0004\u0018\u0001`\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "VS",
        "VE",
        "Lld1/c;",
        "T",
        "Landroidx/lifecycle/f2;",
        "viewModelStoreOwner",
        "defaultViewState",
        "Landroid/app/Application;",
        "application",
        "Lj93/d;",
        "clazz",
        "Lkotlin/Function0;",
        "Luf3/a;",
        "Lorg/koin/core/parameter/ParametersDefinition;",
        "parameters",
        "",
        "key",
        "d",
        "(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;",
        "defaultValue",
        "b",
        "(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;",
        "design_release"
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
.method public static synthetic a(Landroidx/lifecycle/f2;)Ljf3/a;
    .locals 0

    invoke-static {p0}, Lld1/d;->c(Landroidx/lifecycle/f2;)Ljf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VS:",
            "Ljava/lang/Object;",
            "VE:",
            "Ljava/lang/Object;",
            "T:",
            "Lld1/c<",
            "TVS;TVE;>;>(",
            "Landroid/app/Application;",
            "Landroidx/lifecycle/f2;",
            "Lj93/d;",
            "Lc93/a;",
            "Lld1/c<",
            "TVS;TVE;>;",
            "Ljava/lang/String;",
            ")",
            "Lld1/c<",
            "TVS;TVE;>;"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultValue"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_1

    :try_start_0
    invoke-static {p0}, Lug/m;->B(Landroid/content/ComponentCallbacks;)Lnf3/a;

    move-result-object p0

    new-instance v0, Lld1/d$a;

    invoke-direct {v0, p0, p2, p3}, Lld1/d$a;-><init>(Lnf3/a;Lj93/d;Lc93/a;)V

    invoke-interface {p1}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p0

    instance-of p3, p1, Landroidx/lifecycle/r;

    if-eqz p3, :cond_0

    check-cast p1, Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll8/a;->b:Ll8/a;

    :goto_0
    const-string p3, "store"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "defaultCreationExtras"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lzt/q;

    invoke-direct {p3, p0, v0, p1}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    invoke-static {p2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {p3, p5, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Lld1/c;

    return-object p0

    :cond_1
    new-instance p5, Landroidx/lifecycle/p1;

    const/4 v0, 0x1

    invoke-direct {p5, p1, v0}, Landroidx/lifecycle/p1;-><init>(Landroidx/lifecycle/f2;I)V

    const/4 p1, 0x0

    invoke-static {p0, p1, p2, p5, p3}, Lts/o;->B(Landroid/content/ComponentCallbacks;Lvf3/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object p0

    check-cast p0, Lld1/c;
    :try_end_0
    .catch Lorg/koin/core/error/NoBeanDefFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p4
.end method

.method private static final c(Landroidx/lifecycle/f2;)Ljf3/a;
    .locals 2

    const-string v0, "storeOwner"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljf3/a;

    invoke-interface {p0}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p0

    const-string v1, "storeOwner.viewModelStore"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljf3/a;-><init>(Landroidx/lifecycle/e2;Lpb/f;)V

    return-object v0
.end method

.method public static final d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VS:",
            "Ljava/lang/Object;",
            "VE:",
            "Ljava/lang/Object;",
            "T:",
            "Lld1/c<",
            "TVS;TVE;>;>(",
            "Landroidx/lifecycle/f2;",
            "TVS;",
            "Landroid/app/Application;",
            "Lj93/d;",
            "Lc93/a;",
            "Ljava/lang/String;",
            ")",
            "Lld1/c<",
            "TVS;TVE;>;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, p3

    move-object p3, p4

    new-instance p4, Lld1/b;

    invoke-direct {p4, v0}, Lld1/b;-><init>(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    :goto_0
    return-object p4

    :cond_1
    invoke-static/range {p0 .. p5}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object p0

    return-object p0
.end method
