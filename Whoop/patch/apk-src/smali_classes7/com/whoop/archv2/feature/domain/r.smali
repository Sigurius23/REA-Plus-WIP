.class public final Lcom/whoop/archv2/feature/domain/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/n;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000f*\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/r;",
        "Lj02/n;",
        "Lu02/c;",
        "apiClient",
        "Ltr2/n;",
        "logger",
        "Lfy1/g;",
        "nanoClock",
        "<init>",
        "(Lu02/c;Ltr2/n;Lfy1/g;)V",
        "Lu02/a;",
        "Lf63/c;",
        "result",
        "",
        "name",
        "Lcom/whoop/navigation/c;",
        "f",
        "(Lu02/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "d",
        "(Lf63/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "e",
        "(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Ljava/lang/String;)Lcom/whoop/navigation/c;",
        "query",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lu02/c;",
        "b",
        "Ltr2/n;",
        "c",
        "Lfy1/g;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lu02/c;

.field private final b:Ltr2/n;

.field private final c:Lfy1/g;


# direct methods
.method public constructor <init>(Lu02/c;Ltr2/n;Lfy1/g;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nanoClock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/r;->a:Lu02/c;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/r;->c:Lfy1/g;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Ltr2/n;Lfy1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "TemplateDeeplinkResolver"

    invoke-virtual {p2, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    new-instance p3, Lfy1/n;

    invoke-direct {p3}, Lfy1/n;-><init>()V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/r;-><init>(Lu02/c;Ltr2/n;Lfy1/g;)V

    return-void
.end method

.method public static final synthetic b(Lcom/whoop/archv2/feature/domain/r;Lf63/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/r;->d(Lf63/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/archv2/feature/domain/r;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/archv2/feature/domain/r;->a:Lu02/c;

    return-object p0
.end method

.method private final d(Lf63/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf63/c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-class v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    instance-of v1, p3, Lcom/whoop/archv2/feature/domain/r$a;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lcom/whoop/archv2/feature/domain/r$a;

    iget v2, v1, Lcom/whoop/archv2/feature/domain/r$a;->H:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/archv2/feature/domain/r$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/archv2/feature/domain/r$a;

    invoke-direct {v1, p0, p3}, Lcom/whoop/archv2/feature/domain/r$a;-><init>(Lcom/whoop/archv2/feature/domain/r;Lq83/d;)V

    :goto_0
    iget-object p3, v1, Lcom/whoop/archv2/feature/domain/r$a;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/archv2/feature/domain/r$a;->H:I

    const-string v4, " resolved to an undeserializable body"

    const-string v5, "Deeplink "

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v6, :cond_1

    iget-object p1, v1, Lcom/whoop/archv2/feature/domain/r$a;->z:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/archv2/feature/domain/r;

    iget-object p2, v1, Lcom/whoop/archv2/feature/domain/r$a;->y:Ljava/lang/Object;

    check-cast p2, Lf63/c;

    iget-object p2, v1, Lcom/whoop/archv2/feature/domain/r$a;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v0, v1, Lcom/whoop/archv2/feature/domain/r$a;->w:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/ktor/serialization/ContentConvertException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object p1

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object p3

    invoke-static {p3}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v3

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0, p3, v3}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object p3

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/whoop/archv2/feature/domain/r$a;->w:Ljava/lang/Object;

    iput-object p2, v1, Lcom/whoop/archv2/feature/domain/r$a;->x:Ljava/lang/Object;

    iput-object v0, v1, Lcom/whoop/archv2/feature/domain/r$a;->y:Ljava/lang/Object;

    iput-object p0, v1, Lcom/whoop/archv2/feature/domain/r$a;->z:Ljava/lang/Object;

    iput v7, v1, Lcom/whoop/archv2/feature/domain/r$a;->E:I

    iput v6, v1, Lcom/whoop/archv2/feature/domain/r$a;->H:I

    invoke-virtual {p1, p3, v1}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_3

    return-object v2

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p3, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-direct {p1, p3, p2}, Lcom/whoop/archv2/feature/domain/r;->e(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Ljava/lang/String;)Lcom/whoop/navigation/c;

    move-result-object p1
    :try_end_1
    .catch Lio/ktor/serialization/ContentConvertException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object p3, p0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    invoke-static {v5, p2, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v7, [Lqr2/a$a;

    invoke-interface {p3, p2, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/navigation/c$a;->a:Lcom/whoop/navigation/c$a;

    goto :goto_4

    :goto_3
    iget-object p3, p0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    invoke-static {v5, p2, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v7, [Lqr2/a$a;

    invoke-interface {p3, p2, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/navigation/c$a;->a:Lcom/whoop/navigation/c$a;

    :goto_4
    return-object p1
.end method

.method private final e(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Ljava/lang/String;)Lcom/whoop/navigation/c;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getTemplate()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Lcom/whoop/archv2/model/template/NavigationTemplate;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/whoop/archv2/model/template/NavigationTemplate;

    :cond_1
    const/4 v1, 0x0

    const-string v2, "Deeplink "

    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    sget-object v0, Lcom/whoop/archv2/model/template/UnknownTemplate;->INSTANCE:Lcom/whoop/archv2/model/template/UnknownTemplate;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "it decoded as "

    const-string v3, ", expected NAVIGATE"

    invoke-static {v0, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    const-string p1, "the body could not be decoded as a template. Check the top level \"type\" is \"NAVIGATE\" and that \"content\" is present"

    :goto_2
    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    const-string v3, " did not resolve: "

    invoke-static {v2, p2, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/navigation/c$a;->a:Lcom/whoop/navigation/c$a;

    return-object p1

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/NavigationTemplate;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v3, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    const-string v0, " resolved to a screen unknown to this build"

    invoke-static {v2, p2, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/navigation/c$a;->a:Lcom/whoop/navigation/c$a;

    return-object p1

    :cond_5
    new-instance p2, Lcom/whoop/navigation/c$d;

    invoke-direct {p2, p1}, Lcom/whoop/navigation/c$d;-><init>(Lcom/whoop/navigation/e;)V

    return-object p2
.end method

.method private final f(Lu02/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a<",
            "+",
            "Lf63/c;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_0

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf63/c;

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/r;->d(Lf63/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p3, p1, Lu02/a$b$a$a;

    if-eqz p3, :cond_1

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    const-string p3, "Deeplink "

    const-string v0, " resolved to an undeserializable body"

    invoke-static {p3, p2, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/navigation/c$a;->a:Lcom/whoop/navigation/c$a;

    return-object p1

    :cond_1
    instance-of p2, p1, Lu02/a$b$a;

    if-eqz p2, :cond_3

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p2

    sget-object p3, Li63/v;->h:Li63/v;

    iget p3, p3, Li63/v;->a:I

    if-ne p2, p3, :cond_2

    sget-object p1, Lcom/whoop/navigation/c$b;->a:Lcom/whoop/navigation/c$b;

    return-object p1

    :cond_2
    new-instance p2, Lcom/whoop/navigation/c$e;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    invoke-direct {p2, p1}, Lcom/whoop/navigation/c$e;-><init>(I)V

    return-object p2

    :cond_3
    instance-of p1, p1, Lu02/a$b$b;

    if-eqz p1, :cond_4

    sget-object p1, Lcom/whoop/navigation/c$f;->a:Lcom/whoop/navigation/c$f;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/whoop/archv2/feature/domain/r$b;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/whoop/archv2/feature/domain/r$b;

    iget v4, v3, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/whoop/archv2/feature/domain/r$b;

    invoke-direct {v3, v0, v2}, Lcom/whoop/archv2/feature/domain/r$b;-><init>(Lcom/whoop/archv2/feature/domain/r;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcom/whoop/archv2/feature/domain/r$b;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v5, 0x1

    const/4 v14, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v13, :cond_1

    iget-wide v3, v9, Lcom/whoop/archv2/feature/domain/r$b;->E:J

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->z:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v4, v9, Lcom/whoop/archv2/feature/domain/r$b;->E:J

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;

    invoke-static/range {p2 .. p2}, Lcom/whoop/archv2/feature/domain/s;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    invoke-direct {v2, v1, v4}, Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    iget-object v4, v0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    invoke-virtual {v2}, Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;->getParameters()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "deeplink-migration: GET "

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " params="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " timeout=800ms"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v12, [Lqr2/a$a;

    invoke-interface {v4, v6, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v4, v0, Lcom/whoop/archv2/feature/domain/r;->c:Lfy1/g;

    invoke-interface {v4}, Lfy1/g;->a()J

    move-result-wide v6

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v8, v0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    const-string v10, "Failed to resolve deeplink "

    invoke-static {v10, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object v11, v8

    new-instance v8, Lcom/whoop/archv2/feature/domain/r$c;

    invoke-direct {v8, v0, v2, v14}, Lcom/whoop/archv2/feature/domain/r$c;-><init>(Lcom/whoop/archv2/feature/domain/r;Lcom/whoop/archv2/feature/domain/DeeplinkResolveRequest;Lq83/d;)V

    iput-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->w:Ljava/lang/Object;

    iput-object v14, v9, Lcom/whoop/archv2/feature/domain/r$b;->x:Ljava/lang/Object;

    iput-object v14, v9, Lcom/whoop/archv2/feature/domain/r$b;->y:Ljava/lang/Object;

    iput-wide v6, v9, Lcom/whoop/archv2/feature/domain/r$b;->E:J

    iput v5, v9, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    move-wide v15, v6

    const/4 v6, 0x0

    move-object v7, v10

    const/4 v10, 0x2

    move-object v5, v11

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    goto :goto_3

    :cond_4
    move-wide v4, v15

    :goto_2
    check-cast v2, Lu02/a;

    iput-object v1, v9, Lcom/whoop/archv2/feature/domain/r$b;->w:Ljava/lang/Object;

    iput-object v14, v9, Lcom/whoop/archv2/feature/domain/r$b;->x:Ljava/lang/Object;

    iput-object v14, v9, Lcom/whoop/archv2/feature/domain/r$b;->y:Ljava/lang/Object;

    iput-object v14, v9, Lcom/whoop/archv2/feature/domain/r$b;->z:Ljava/lang/Object;

    iput-wide v4, v9, Lcom/whoop/archv2/feature/domain/r$b;->E:J

    iput v13, v9, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    invoke-direct {v0, v2, v1, v9}, Lcom/whoop/archv2/feature/domain/r;->f(Lu02/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    :goto_3
    return-object v3

    :cond_5
    move-wide v3, v4

    :goto_4
    move-object v5, v2

    check-cast v5, Lcom/whoop/navigation/c;

    iget-object v6, v0, Lcom/whoop/archv2/feature/domain/r;->c:Lfy1/g;

    invoke-interface {v6}, Lfy1/g;->a()J

    move-result-wide v6

    sub-long/2addr v6, v3

    const v3, 0xf4240

    int-to-long v3, v3

    div-long/2addr v6, v3

    iget-object v3, v0, Lcom/whoop/archv2/feature/domain/r;->b:Ltr2/n;

    invoke-static {v5}, Lcom/whoop/archv2/feature/domain/s;->a(Lcom/whoop/navigation/c;)Ljava/lang/String;

    move-result-object v4

    const-string v5, " outcome="

    const-string v8, " in "

    const-string v9, "deeplink-migration: resolve name="

    invoke-static {v9, v1, v5, v4, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "ms"

    invoke-static {v6, v7, v4, v1}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v12, [Lqr2/a$a;

    invoke-interface {v3, v1, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2
.end method
