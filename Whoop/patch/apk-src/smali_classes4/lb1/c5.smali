.class public abstract Llb1/c5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TimerMetaDataModel;",
        "Ln41/b;",
        "j",
        "(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;",
        "",
        "displayStyle",
        "Ln41/c;",
        "k",
        "(Ljava/lang/String;)Ln41/c;",
        "expiresAt",
        "",
        "l",
        "(Ljava/lang/String;)J",
        "Lcom/whoop/design/models/tiles/OfferBannerModel;",
        "Lc41/a4;",
        "h",
        "(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "itemList",
        "i",
        "(Ljava/util/List;)Ln41/b;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "timerMapper",
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

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/c5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;
    .locals 0

    invoke-static {p0}, Llb1/c5;->g(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/c5;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;
    .locals 0

    invoke-static {p0}, Llb1/c5;->f(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/c5;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/TimerMetaDataModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/c5$a;

    invoke-direct {v3, v0}, Llb1/c5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/z4;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Llb1/z4;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/tiles/OfferBannerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/c5$b;

    invoke-direct {v2, v0}, Llb1/c5$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/c5;->j(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/c5;->h(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/models/tiles/OfferBannerModel;)Lc41/a4;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc41/a4;

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getOfferId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getMarkdownTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getBorderStyle()Ljava/lang/String;

    move-result-object v0

    const-string v5, "GOLD"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Lc41/b4;->GOLD:Lc41/b4;

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    const-string v5, "ONBOARDING"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lc41/b4;->ONBOARDING:Lc41/b4;

    goto :goto_0

    :cond_1
    sget-object v0, Lc41/b4;->ONBOARDING:Lc41/b4;

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getLeadingIcon()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getShowChevron()Z

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getShowHighlight()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_2
    move v9, v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getTimerMetadata()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Llb1/c5;->i(Ljava/util/List;)Ln41/b;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/OfferBannerModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v11

    invoke-direct/range {v1 .. v11}, Lc41/a4;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc41/b4;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLn41/b;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public static final i(Ljava/util/List;)Ln41/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Ln41/b;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, Lcom/whoop/design/models/items/TimerMetaDataModel;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/whoop/design/models/items/TimerMetaDataModel;

    goto :goto_1

    :cond_1
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_2

    invoke-static {p0}, Llb1/c5;->j(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static final j(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln41/b;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TimerMetaDataModel;->getExpireTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/c5;->l(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TimerMetaDataModel;->getDisplayStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/c5;->k(Ljava/lang/String;)Ln41/c;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TimerMetaDataModel;->getHoursLabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TimerMetaDataModel;->getMinutesLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TimerMetaDataModel;->getSecondsLabel()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Ln41/b;-><init>(JLn41/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final k(Ljava/lang/String;)Ln41/c;
    .locals 6

    const-string v0, "displayStyle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln41/c;->FALL_BACK:Ln41/c;

    invoke-static {}, Ln41/c;->values()[Ln41/c;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method public static final l(Ljava/lang/String;)J
    .locals 5

    const-string v0, "expiresAt"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/time/format/DateTimeFormatterBuilder;

    invoke-direct {v0}, Ljava/time/format/DateTimeFormatterBuilder;-><init>()V

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatterBuilder;->appendPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->optionalStart()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    sget-object v1, Ljava/time/temporal/ChronoField;->NANO_OF_SECOND:Ljava/time/temporal/ChronoField;

    const/16 v2, 0x9

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Ljava/time/format/DateTimeFormatterBuilder;->appendFraction(Ljava/time/temporal/TemporalField;IIZ)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->optionalEnd()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->optionalStart()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    const-string v1, "+HHMM"

    const-string v2, "Z"

    invoke-virtual {v0, v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->optionalStart()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    const-string v1, "+HH:MM"

    invoke-virtual {v0, v1, v2}, Ljava/time/format/DateTimeFormatterBuilder;->appendOffset(Ljava/lang/String;Ljava/lang/String;)Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->optionalEnd()Ljava/time/format/DateTimeFormatterBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/format/DateTimeFormatterBuilder;->toFormatter()Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "toFormatter(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Ljava/time/OffsetDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/OffsetDateTime;

    move-result-object p0

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    move-result-object p0

    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    return-wide v0
.end method
