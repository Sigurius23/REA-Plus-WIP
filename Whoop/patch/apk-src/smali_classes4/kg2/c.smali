.class public abstract Lkg2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0002\u001a\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "childItemReducer",
        "b",
        "i",
        "()Ljb1/a;",
        "collapsibleToggleContainerDesignItemReducer",
        "Lm91/p;",
        "c",
        "Lm91/p;",
        "j",
        "()Lm91/p;",
        "collapsibleToggleContainerDesignItemViewFactory",
        "start-activity_release"
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

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lkg2/c;->a:Ljb1/a;

    new-instance v0, Lji0/b;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lkg2/c;->b:Ljb1/a;

    new-instance v0, Lji0/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lkg2/c;->c:Lm91/p;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkg2/c;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkg2/c;->h(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkg2/c;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;)Lkg2/b;
    .locals 0

    invoke-static {p0}, Lkg2/c;->g(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;)Lkg2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lji0/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lji0/b;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lkg2/c$a;

    invoke-direct {v2, v0}, Lkg2/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;)Lkg2/b;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkg2/b;

    sget-object v1, Lkg2/c;->a:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lkg2/b;-><init>(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v0
.end method

.method private static final h(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lkg2/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lkg2/a;

    invoke-direct {v1}, Lkg2/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i()Ljb1/a;
    .locals 1

    sget-object v0, Lkg2/c;->b:Ljb1/a;

    return-object v0
.end method

.method public static final j()Lm91/p;
    .locals 1

    sget-object v0, Lkg2/c;->c:Lm91/p;

    return-object v0
.end method
