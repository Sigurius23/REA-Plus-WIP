.class public abstract Ly72/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0008\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getBaseDesignItemReducer",
        "()Ljb1/a;",
        "baseDesignItemReducer",
        "b",
        "g",
        "sanguineDesignItemReducer",
        "Lm91/p;",
        "c",
        "Lm91/p;",
        "h",
        "()Lm91/p;",
        "sanguineItemViewFactory",
        "sanguine_release"
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
.field private static final a:Ljb1/a;

.field private static final b:Ljb1/a;

.field private static final c:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly41/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ly72/a;->a:Ljb1/a;

    new-instance v0, Ly41/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ly72/a;->b:Ljb1/a;

    new-instance v0, Ly41/b;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Ly72/a;->c:Lm91/p;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly72/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly72/a;->j(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;)Lx72/a;
    .locals 0

    invoke-static {p0}, Ly72/a;->k(Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;)Lx72/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly72/a;->l(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly72/a;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lh51/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ly72/a$a;

    invoke-direct {v1}, Ly72/a$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g()Ljb1/a;
    .locals 1

    sget-object v0, Ly72/a;->b:Ljb1/a;

    return-object v0
.end method

.method public static final h()Lm91/p;
    .locals 1

    sget-object v0, Ly72/a;->c:Lm91/p;

    return-object v0
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly41/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly41/b;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    const-class v1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ly72/a$b;

    invoke-direct {v2, v0}, Ly72/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;)Lx72/a;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;->getBodyText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;->getContent()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v4, v4, Lcom/whoop/design/models/items/UnknownDesignModel;

    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v4, Ly72/a;->a:Ljb1/a;

    invoke-virtual {v4, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v2, Lx72/a;

    invoke-direct {v2, v0, v1, p0}, Lx72/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v2
.end method

.method private static final l(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lx72/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lz72/h;

    invoke-direct {v1}, Lz72/h;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
