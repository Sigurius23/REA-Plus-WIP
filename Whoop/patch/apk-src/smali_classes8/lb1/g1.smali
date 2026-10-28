.class public abstract Llb1/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lad3/c;",
        "a",
        "Ll83/h;",
        "g",
        "()Lad3/c;",
        "interactionJson",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "dynamicInformationalImageCardMapper",
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

    new-instance v0, Ll72/f;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ll72/f;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/g1;->a:Ll83/h;

    new-instance v0, Llb1/m;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/g1;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/g1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;)Lu51/d;
    .locals 0

    invoke-static {p0}, Llb1/g1;->e(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;)Lu51/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lad3/c;
    .locals 1

    invoke-static {}, Llb1/g1;->h()Lad3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/g1$a;

    invoke-direct {v2, v0}, Llb1/g1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;)Lu51/d;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getLayoutState()Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    if-eqz v4, :cond_0

    new-instance v3, Lkd1/o$c;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getIconImageUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    new-instance v4, Lkd1/o$c;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v4, v0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object v6, v0

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getTagTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v7, v1

    goto :goto_4

    :cond_4
    move-object v7, v0

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {}, Llb1/g1;->g()Lad3/c;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v0

    :cond_5
    move-object v8, v0

    new-instance v1, Lu51/d;

    invoke-direct/range {v1 .. v8}, Lu51/d;-><init>(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/g1;->b:Llb1/y0;

    return-object v0
.end method

.method private static final g()Lad3/c;
    .locals 1

    sget-object v0, Llb1/g1;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    return-object v0
.end method

.method private static final h()Lad3/c;
    .locals 7

    const/16 v5, 0x1f

    const/4 v6, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/design/json/b;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object v0

    return-object v0
.end method
