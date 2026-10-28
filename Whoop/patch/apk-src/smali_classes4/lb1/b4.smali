.class public abstract Llb1/b4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/b4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SearchBarKeyboardType;",
        "Lq3/n;",
        "f",
        "(Lcom/whoop/design/models/items/SearchBarKeyboardType;)I",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "searchBarMapper",
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/x3;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/b4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b4;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/SearchBarModel;)Lo31/e;
    .locals 0

    invoke-static {p0}, Llb1/b4;->e(Lcom/whoop/design/models/items/SearchBarModel;)Lo31/e;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/b4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SearchBarModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/b4$b;

    invoke-direct {v2, v0}, Llb1/b4$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/SearchBarModel;)Lo31/e;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lo31/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getStateUpdateSearchKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getPlaceholderText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v4, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getStateUpdateSearchKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getKeyboardType()Lcom/whoop/design/models/items/SearchBarKeyboardType;

    move-result-object v0

    invoke-static {v0}, Llb1/b4;->f(Lcom/whoop/design/models/items/SearchBarKeyboardType;)I

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getMaxLength()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SearchBarModel;->getOnTapAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lo31/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Integer;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final f(Lcom/whoop/design/models/items/SearchBarKeyboardType;)I
    .locals 3

    sget-object v0, Llb1/b4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/4 p0, 0x4

    return p0

    :cond_2
    return v0
.end method
