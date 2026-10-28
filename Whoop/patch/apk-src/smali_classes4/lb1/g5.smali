.class public abstract Llb1/g5;
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
        "unlockTrendsMapper",
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

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/g5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/UnlockTrendsCardModel;)Lp81/c;
    .locals 0

    invoke-static {p0}, Llb1/g5;->e(Lcom/whoop/design/models/items/UnlockTrendsCardModel;)Lp81/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/g5;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/g5;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/g5$a;

    invoke-direct {v2, v0}, Llb1/g5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/UnlockTrendsCardModel;)Lp81/c;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lp81/c;

    new-instance v2, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getTopImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getFilledCount()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getTotalCount()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v6, Lc41/s4;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getFilledCount()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->getTotalCount()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    sget v9, Lgy0/a;->N:I

    sget-object v10, Ly81/f;->ACCENT_ONBOARDING_ACTION:Ly81/f;

    sget-object v11, Ly81/f;->NEUTRAL_15:Ly81/f;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v13}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZ)V

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-direct/range {v1 .. v6}, Lp81/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/s4;)V

    return-object v1
.end method
