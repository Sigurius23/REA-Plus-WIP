.class public abstract Ljg2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "i",
        "()Ljb1/a;",
        "dropdownDesignItemReducer",
        "Lm91/p;",
        "b",
        "Lm91/p;",
        "j",
        "()Lm91/p;",
        "dropdownDesignItemViewFactory",
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

.field private static final b:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lim1/p0;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ljg2/d;->a:Ljb1/a;

    new-instance v0, Lim1/p0;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Ljg2/d;->b:Lm91/p;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljg2/d;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljg2/d;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljg2/d;->h(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/startactivity/dropdown/DropdownModel;)Ljg2/b;
    .locals 0

    invoke-static {p0}, Ljg2/d;->g(Lcom/whoop/startactivity/dropdown/DropdownModel;)Ljg2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lim1/p0;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lim1/p0;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/dropdown/DropdownModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljg2/d$a;

    invoke-direct {v2, v0}, Ljg2/d$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/startactivity/dropdown/DropdownModel;)Ljg2/b;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/startactivity/dropdown/DropdownModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/startactivity/dropdown/DropdownModel;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/startactivity/dropdown/DropdownModel;->getPlaceholder()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/startactivity/dropdown/DropdownModel;->getSelectedOptionId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/startactivity/dropdown/DropdownModel;->getOptions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/startactivity/dropdown/DropdownOption;

    new-instance v1, Ljg2/b$a;

    invoke-virtual {v0}, Lcom/whoop/startactivity/dropdown/DropdownOption;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/startactivity/dropdown/DropdownOption;->getLabel()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/startactivity/dropdown/DropdownOption;->getIcon()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    const/4 v11, 0x1

    invoke-static {v9, v10, v11, v10}, Lgz0/n0;->d(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)Lgz0/m0;

    move-result-object v10

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/startactivity/dropdown/DropdownOption;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    invoke-direct {v1, v7, v8, v10, v0}, Ljg2/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljg2/b;

    invoke-direct/range {v1 .. v6}, Ljg2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method private static final h(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Ljg2/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ljg2/a;

    invoke-direct {v1}, Ljg2/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i()Ljb1/a;
    .locals 1

    sget-object v0, Ljg2/d;->a:Ljb1/a;

    return-object v0
.end method

.method public static final j()Lm91/p;
    .locals 1

    sget-object v0, Ljg2/d;->b:Lm91/p;

    return-object v0
.end method
