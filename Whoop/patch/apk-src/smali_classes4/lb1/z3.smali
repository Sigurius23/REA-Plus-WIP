.class public abstract Llb1/z3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "e",
        "()Ljb1/a;",
        "rewardsSectionNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "rewardsSectionMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/z3;->a:Ll83/h;

    new-instance v0, Llb1/x3;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/z3;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/z3;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/RewardsSectionModel;)Lh81/g;
    .locals 0

    invoke-static {p0}, Llb1/z3;->g(Lcom/whoop/design/models/items/RewardsSectionModel;)Lh81/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljb1/a;
    .locals 1

    invoke-static {}, Llb1/z3;->h()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/z3;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e()Ljb1/a;
    .locals 1

    sget-object v0, Llb1/z3;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/RewardsSectionModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/z3$a;

    invoke-direct {v2, v0}, Llb1/z3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/RewardsSectionModel;)Lh81/g;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RewardsSectionModel;->getTitle()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v0

    invoke-static {v0}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object v0

    invoke-static {}, Llb1/z3;->e()Ljb1/a;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RewardsSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/RewardsSectionModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-static {}, Lh81/f;->values()[Lh81/f;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_3

    sget-object v5, Lh81/f;->AMERICA_250:Lh81/f;

    :cond_3
    new-instance p0, Lh81/g;

    invoke-direct {p0, v0, v1, v5}, Lh81/g;-><init>(Lsz0/c0;Ljava/util/List;Lh81/f;)V

    return-object p0
.end method

.method private static final h()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method
