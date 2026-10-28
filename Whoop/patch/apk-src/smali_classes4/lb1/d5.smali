.class public abstract Llb1/d5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "toggleDesignModelMapper",
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

    new-instance v0, Llb1/z4;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/d5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/d5;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ToggleDesignModel;)Lp41/j;
    .locals 0

    invoke-static {p0}, Llb1/d5;->e(Lcom/whoop/design/models/items/ToggleDesignModel;)Lp41/j;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/d5;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ToggleDesignModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/d5$a;

    invoke-direct {v2, v0}, Llb1/d5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ToggleDesignModel;)Lp41/j;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled()Z

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly()Z

    move-result v5

    const/4 v2, 0x0

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v6, v2

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v6, Lp41/f;

    invoke-direct {v6, v0, v1}, Lp41/f;-><init>(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {}, Lp41/k;->values()[Lp41/k;

    move-result-object v1

    array-length v7, v1

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_3

    aget-object v9, v1, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v2, v9

    goto :goto_3

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-nez v2, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    move-object v7, v2

    goto :goto_6

    :cond_5
    :goto_5
    sget-object v2, Lp41/k;->TILE:Lp41/k;

    goto :goto_4

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getToggledOnColor()Ly81/f;

    move-result-object p0

    if-nez p0, :cond_6

    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    :cond_6
    move-object v8, p0

    new-instance v2, Lp41/j;

    invoke-direct/range {v2 .. v8}, Lp41/j;-><init>(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;)V

    return-object v2
.end method
