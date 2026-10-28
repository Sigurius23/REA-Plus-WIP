.class public abstract Llb1/b5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TimedContentModel;",
        "Lk41/d;",
        "g",
        "(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "timedContentMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltr2/n;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "TimedContentMapper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Llb1/b5;->a:Ltr2/n;

    new-instance v0, Llb1/z4;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/b5;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b5;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;
    .locals 0

    invoke-static {p0}, Llb1/b5;->f(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b5;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/b5;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TimedContentModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/b5$a;

    invoke-direct {v2, v0}, Llb1/b5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/b5;->g(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;
    .locals 8

    new-instance v0, Llb1/z2;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TimedContentModel;->getPhases()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/PhaseModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/PhaseModel;->getUntil()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    :try_start_0
    invoke-static {v3}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    move-result-object v3
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v5

    sget-object v6, Llb1/b5;->a:Ltr2/n;

    const-string v7, "Failed to parse timed content phase until: "

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    new-array v7, v7, [Lqr2/a$a;

    invoke-interface {v6, v3, v5, v7}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    move-object v3, v4

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/PhaseModel;->getItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object v4

    :cond_1
    new-instance v2, Lk41/a;

    invoke-direct {v2, v3, v4}, Lk41/a;-><init>(Ljava/time/Instant;Lm91/o;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, Lk41/d;

    invoke-direct {p0, v1}, Lk41/d;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
