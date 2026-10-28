.class public abstract Lpl0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u001b\u0010\u0014\u001a\u00020\u000f8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/MarkdownTextWidget;",
        "Li2/t;",
        "colorBrush",
        "Loh0/c;",
        "Y",
        "(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;)Loh0/c;",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;",
        "model",
        "Lbm0/s;",
        "W",
        "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;",
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "Luz0/i;",
        "X",
        "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "U",
        "()Ljb1/a;",
        "aiConversationDesignItemReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "V",
        "()Llb1/y0;",
        "botDesignModelMapper",
        "bot_release"
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
    .locals 5

    new-instance v0, Lma1/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lpl0/c;->a:Ll83/h;

    new-instance v0, Llb1/z0;

    invoke-direct {v0}, Llb1/z0;-><init>()V

    new-instance v1, Lnm1/g;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lnm1/g;-><init>(I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$p;

    invoke-direct {v4, v1}, Lpl0/c$p;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lnm1/g;

    const/16 v3, 0x1d

    invoke-direct {v1, v3}, Lnm1/g;-><init>(I)V

    const-class v3, Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$q;

    invoke-direct {v4, v1}, Lpl0/c$q;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$r;

    invoke-direct {v4, v1}, Lpl0/c$r;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$s;

    invoke-direct {v4, v1}, Lpl0/c$s;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$t;

    invoke-direct {v4, v1}, Lpl0/c$t;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x3

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/AdditionalContextModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$u;

    invoke-direct {v4, v1}, Lpl0/c$u;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x4

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$v;

    invoke-direct {v4, v1}, Lpl0/c$v;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$w;

    invoke-direct {v4, v1}, Lpl0/c$w;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x6

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$x;

    invoke-direct {v4, v1}, Lpl0/c$x;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$f;

    invoke-direct {v4, v1}, Lpl0/c$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0x8

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/design/models/items/IconMarkdownCalloutModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$g;

    invoke-direct {v4, v1}, Lpl0/c$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0x9

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$h;

    invoke-direct {v4, v1}, Lpl0/c$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$i;

    invoke-direct {v4, v1}, Lpl0/c$i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0xb

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$j;

    invoke-direct {v4, v1}, Lpl0/c$j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0xc

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$k;

    invoke-direct {v4, v1}, Lpl0/c$k;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0xd

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/design/models/items/StartTurnButtonModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$l;

    invoke-direct {v4, v1}, Lpl0/c$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0xe

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$m;

    invoke-direct {v4, v1}, Lpl0/c$m;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lpl0/a;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, Lpl0/a;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lpl0/c$n;

    invoke-direct {v4, v1}, Lpl0/c$n;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lnm1/g;

    const/16 v3, 0x1b

    invoke-direct {v1, v3}, Lnm1/g;-><init>(I)V

    const-class v3, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lpl0/c$o;

    invoke-direct {v3, v1}, Lpl0/c$o;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Llb1/z0;->b()Llb1/y0;

    move-result-object v0

    sput-object v0, Lpl0/c;->b:Llb1/y0;

    return-void
.end method

.method private static final A(Lcom/whoop/design/models/items/SingleSelectModel;)Lt31/c;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt31/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SingleSelectModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SingleSelectModel;->getSelectionId()I

    move-result v2

    invoke-static {}, Lpl0/c;->U()Ljb1/a;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SingleSelectModel;->getItems()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lt31/c;-><init>(Ljava/lang/String;ILjava/util/List;)V

    return-object v0
.end method

.method private static final B(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lr71/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lpl0/c;->U()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getAccessibilityLabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getScrollBehavior()Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/HorizontalScrollContainerModel;->getPagingIndicatorEnabled()Z

    move-result v7

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final C(Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;)Lhh0/a;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/ai/chat/models/Attachment;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/Attachment;->getType()Lcom/whoop/ai/chat/models/AttachmentType;

    move-result-object v3

    sget-object v4, Lcom/whoop/ai/chat/models/AttachmentType;->IMAGE:Lcom/whoop/ai/chat/models/AttachmentType;

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/ai/chat/models/Attachment;

    new-instance v4, Lkd1/o$c;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/Attachment;->getUrl()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;->getAttachments()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/ai/chat/models/Attachment;

    invoke-virtual {v4}, Lcom/whoop/ai/chat/models/Attachment;->getType()Lcom/whoop/ai/chat/models/AttachmentType;

    move-result-object v4

    sget-object v5, Lcom/whoop/ai/chat/models/AttachmentType;->PDF:Lcom/whoop/ai/chat/models/AttachmentType;

    if-ne v4, v5, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/ai/chat/models/Attachment;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/Attachment;->getUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x3f

    invoke-static {v3, v4}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x2f

    invoke-static {v4, v3, v3}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_5

    const-string v3, "document.pdf"

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/Attachment;->getDate()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    const-string v5, " - "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    :cond_6
    const-string v4, ""

    :cond_7
    const-string v5, "PDF"

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lhh0/c;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/Attachment;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2, v3, v4}, Lhh0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    new-instance v1, Lhh0/a;

    invoke-direct {v1, v0, p0}, Lhh0/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method private static final D(Lcom/whoop/design/models/items/IconMarkdownCalloutModel;)Lf21/d;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IconMarkdownCalloutModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IconMarkdownCalloutModel;->getBodyIcon()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/IconMarkdownCalloutModel;->getBodyText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/IconMarkdownCalloutModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    sget-object v4, Lf21/a;->COMPACT:Lf21/a;

    invoke-static {}, Lf21/a;->values()[Lf21/a;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v2, v8

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v2

    :goto_3
    new-instance p0, Lf21/d;

    invoke-direct {p0, v0, v1, v3, v4}, Lf21/d;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V

    return-object p0
.end method

.method private static final E(Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;)Lxl0/d;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxl0/d;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;->getPage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lxl0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final F(Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;)Leh0/d;
    .locals 23

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;->getDescription()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;->getTags()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/ai/chat/models/ContextDetailsHeaderTagModel;

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/ContextDetailsHeaderTagModel;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/ContextDetailsHeaderTagModel;->getTagStyle()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/whoop/design/models/items/TagBackgroundStyle;->CONTEXT_DEFAULT:Lcom/whoop/design/models/items/TagBackgroundStyle;

    invoke-static {}, Lcom/whoop/design/models/items/TagBackgroundStyle;->values()[Lcom/whoop/design/models/items/TagBackgroundStyle;

    move-result-object v8

    array-length v10, v8

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_2

    aget-object v12, v8, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    move-object v12, v4

    :goto_3
    if-nez v12, :cond_3

    move-object v11, v7

    goto :goto_4

    :cond_3
    move-object v11, v12

    :goto_4
    new-instance v7, Lcom/whoop/design/models/items/TagModel;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1ff5

    const/16 v22, 0x0

    invoke-direct/range {v7 .. v22}, Lcom/whoop/design/models/items/TagModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/IconSize;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7}, Llb1/q4;->d(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v1, Leh0/d;

    invoke-direct {v1, v0, v2, v3, v5}, Leh0/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;)V

    return-object v1
.end method

.method private static final G(Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;)Ljh0/c;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljh0/c;

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;->getStartIcon()Ljava/lang/String;

    move-result-object v2

    const-string v3, "COACH_HISTORY"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Lwk0/a;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;->getStartIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Ljh0/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0
.end method

.method private static final H(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;)Lfh0/h;
    .locals 16

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    new-instance v4, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    new-instance v5, Lcom/whoop/whoopaction/domain/models/Request;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getMethod()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object v9

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/whoop/whoopaction/domain/models/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/whoop/whoopaction/domain/models/UpdateAction;-><init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v7, v3

    :goto_2
    if-eqz v7, :cond_3

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :cond_3
    move-object v7, v3

    new-instance v8, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    new-instance v9, Lcom/whoop/whoopaction/domain/models/Request;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getMethod()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getRequest()Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object v12

    invoke-direct {v9, v3, v10, v11, v12}, Lcom/whoop/whoopaction/domain/models/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V

    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/whoop/whoopaction/domain/models/UpdateAction;-><init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getCurrentState()Ljava/lang/String;

    move-result-object v3

    const-string v10, "ACTIVE"

    const/4 v11, 0x1

    invoke-static {v3, v10, v11}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->getErrorState()Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;->getErrorMessageText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v1, Lfh0/h;

    move-object v3, v0

    invoke-direct/range {v1 .. v11}, Lfh0/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lcom/whoop/analytics/AnalyticEventModel;ZLcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method private static final I(Lcom/whoop/design/models/items/StartTurnButtonModel;)Lmh0/h;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move-object v1, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    move-object v3, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getStyle()Lcom/whoop/design/models/items/StartTurnButtonStyleModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/StartTurnButtonStyleModel;->getButtonType()Lcom/whoop/design/models/items/ActionButtonStyle;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getStyle()Lcom/whoop/design/models/items/StartTurnButtonStyleModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/StartTurnButtonStyleModel;->getForegroundColor()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Ly81/f;->BRAND_BLACK:Ly81/f;

    :cond_2
    move-object v5, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getStyle()Lcom/whoop/design/models/items/StartTurnButtonStyleModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/StartTurnButtonStyleModel;->getIconColor()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Ly81/f;->BRAND_BLACK:Ly81/f;

    :cond_3
    move-object v6, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getStyle()Lcom/whoop/design/models/items/StartTurnButtonStyleModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/StartTurnButtonStyleModel;->getBackgroundColor()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_4
    move-object v7, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StartTurnButtonModel;->getRequest()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v8

    new-instance v1, Lmh0/h;

    invoke-direct/range {v1 .. v8}, Lmh0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/ApiRequest;)V

    return-object v1
.end method

.method private static final J(Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;)Lvl0/e;
    .locals 6

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvl0/e;

    new-instance v1, Lol0/c;

    new-instance v2, Lol0/c$a;

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5, v4}, Lol0/c$a;-><init>(Le31/c;Lol0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2, v4, v5, v4}, Lol0/c;-><init>(Lol0/c$a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lvl0/e;-><init>(Lol0/c;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final K(Lcom/whoop/bot/models/conversation/FormWidgetModel;)Lih0/h0;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lih0/h0;

    new-instance v2, Lah0/i;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lah0/d;->b(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lah0/c;

    move-result-object v4

    const/16 v9, 0x3d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v10}, Lah0/i;-><init>(Lah0/i$a;Lm91/u;ZZLcom/whoop/ai/chat/domain/formwidget/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getKey()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-direct/range {v1 .. v8}, Lih0/h0;-><init>(Lah0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final L(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;)Lul0/d;
    .locals 21

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v2}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->getSleepBounds()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/bot/models/conversation/SleepBoundModel;

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lgz0/m0;->SLEEP:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v9

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_1

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    move-object v12, v2

    :goto_2
    if-nez v12, :cond_2

    move-object v15, v8

    goto :goto_3

    :cond_2
    move-object v15, v12

    :goto_3
    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getLabel()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getPredictedTime()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getTimeUnit()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getTypicalTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getTypicalTime()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->getAlarm()Lcom/whoop/bot/models/conversation/AlarmModel;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance v7, Lul0/a;

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/AlarmModel;->isEnabled()Z

    move-result v8

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/AlarmModel;->getLabel()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v7, v8, v6}, Lul0/a;-><init>(ZLcom/whoop/design/util/TextResource;)V

    move-object/from16 v20, v7

    goto :goto_4

    :cond_3
    move-object/from16 v20, v2

    :goto_4
    new-instance v13, Lul0/e;

    invoke-direct/range {v13 .. v20}, Lul0/e;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lul0/a;)V

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->getPredictionTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->getHoursOfSleepStat()Lcom/whoop/design/models/items/HorizontalStatModel;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->getConsistencyStat()Lcom/whoop/design/models/items/HorizontalStatModel;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->getEditButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v9

    new-instance v3, Lul0/d;

    invoke-direct/range {v3 .. v9}, Lul0/d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lm91/u;Lm91/u;Lm91/u;)V

    return-object v3
.end method

.method private static final M(Lcom/whoop/ai/chat/models/MarkdownTextWidget;)Loh0/c;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lpl0/c;->Z(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;ILjava/lang/Object;)Loh0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final N(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;)Lnh0/c;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->getTitle()Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v1}, Lpl0/c;->Z(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;ILjava/lang/Object;)Loh0/c;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->getSummary()Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v4

    invoke-static {v0, v4}, Lpl0/c;->Y(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;)Loh0/c;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-static {}, Lpl0/c;->U()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->getFooter()Lcom/whoop/design/models/items/FooterModel;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/whoop/design/models/items/FooterModel;->getItems()Ljava/util/List;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_3
    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    invoke-static {v1}, Lnh0/b;->p(Lm91/u;)Lm91/u;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v6

    new-instance v1, Lnh0/c;

    invoke-direct/range {v1 .. v6}, Lnh0/c;-><init>(Ljava/lang/String;Lm91/u;Lm91/u;Ljava/util/List;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v1
.end method

.method private static final O(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;)Lam0/e;
    .locals 22

    const-string v0, "it"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->getWorkoutList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/bot/models/conversation/WorkoutListModel;

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/WorkoutListModel;->getSuperset()Z

    move-result v7

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/WorkoutListModel;->getWorkouts()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/bot/models/conversation/WorkoutModel;

    new-instance v10, Lam0/g;

    invoke-virtual {v9}, Lcom/whoop/bot/models/conversation/WorkoutModel;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v9}, Lcom/whoop/bot/models/conversation/WorkoutModel;->getSubtitle()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-direct {v10, v11, v9}, Lam0/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v6, Lam0/f;

    invoke-direct {v6, v7, v8}, Lam0/f;-><init>(ZLjava/util/List;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {}, Lpl0/c;->U()Ljb1/a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;->getNavigationButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v3, v1, Lny0/p0;

    if-eqz v3, :cond_2

    move-object v5, v1

    check-cast v5, Lny0/p0;

    sget-object v1, Lpl0/c$d;->w:Lpl0/c$d;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    const/16 v20, 0x3fef

    const/16 v21, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v5 .. v21}, Lny0/p0;->b(Lny0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILjava/lang/Object;)Lny0/p0;

    move-result-object v1

    :cond_2
    new-instance v3, Lam0/e;

    invoke-direct {v3, v0, v2, v4, v1}, Lam0/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;)V

    return-object v3
.end method

.method private static final P(Lcom/whoop/bot/models/conversation/AdditionalContextModel;)Ltl0/c;
    .locals 10

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    sget-object v1, Lcom/whoop/bot/models/conversation/AdditionalContextStyle;->STRAIN_ACTIVITY:Lcom/whoop/bot/models/conversation/AdditionalContextStyle;

    invoke-static {}, Lcom/whoop/bot/models/conversation/AdditionalContextStyle;->values()[Lcom/whoop/bot/models/conversation/AdditionalContextStyle;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    goto :goto_2

    :cond_3
    move-object v1, v5

    :goto_2
    new-instance v2, Ltl0/c;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getS3IconUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v3, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getS3IconUrl()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getIcon()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v3, Lkd1/o$a;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getIcon()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-direct {v3, v0}, Lkd1/o$a;-><init>(I)V

    goto :goto_3

    :cond_5
    new-instance v3, Lkd1/o$a;

    sget-object v0, Lgz0/m0;->OTHER:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-direct {v3, v0}, Lkd1/o$a;-><init>(I)V

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AdditionalContextModel;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance p0, Lpl0/c$e;

    invoke-direct {p0, v1}, Lpl0/c$e;-><init>(Lcom/whoop/bot/models/conversation/AdditionalContextStyle;)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Ltl0/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V

    return-object v2
.end method

.method private static final Q(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpl0/c;->W(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;

    move-result-object p0

    return-object p0
.end method

.method private static final R(Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;)Lbm0/m;
    .locals 6

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;->getRecommendations()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v4, v3, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    if-eqz v4, :cond_0

    check-cast v3, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    invoke-static {v3}, Lpl0/c;->W(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v5, v4, v5}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;->getActionTitle()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Lbm0/m;

    invoke-direct {v1, v0, v2, p0}, Lbm0/m;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final S(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;)Lcm0/e;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcm0/e;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getActivityRecommendation()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getActivityRecommendation()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    move-result-object v0

    invoke-static {v0}, Lpl0/c;->W(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getActivityRecommendationV2()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    move-result-object v3

    invoke-static {v3}, Lpl0/c;->X(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getStartActivityButton()Lcom/whoop/bot/models/conversation/ActionButton;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v2, v5, v2}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt;->toActionButtonState$default(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;ILjava/lang/Object;)Lcm0/a;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getGenerateAlternativeButton()Lcom/whoop/bot/models/conversation/ActionButton;

    move-result-object v6

    invoke-static {v6, v2, v5, v2}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt;->toActionButtonState$default(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;ILjava/lang/Object;)Lcm0/a;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getDecommitButton()Lcom/whoop/bot/models/conversation/ActionButton;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->getActivityRecommendation()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getRecommendationId()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-static {v6, v2}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModelKt;->toActionButtonState(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;)Lcm0/a;

    move-result-object v6

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcm0/e;-><init>(Lbm0/s;Luz0/i;Lcm0/a;Lcm0/a;Lcm0/a;)V

    return-object v1
.end method

.method private static final T(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;)Lm91/u;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->getCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Loh0/c;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->getConfirmationMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->getConfirmationMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Loh0/c;-><init>(Ljava/lang/String;IZZLi2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance v2, Lc41/l5;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->getId()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lc41/l5;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static final U()Ljb1/a;
    .locals 1

    sget-object v0, Lpl0/c;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method public static final V()Llb1/y0;
    .locals 1

    sget-object v0, Lpl0/c;->b:Llb1/y0;

    return-object v0
.end method

.method private static final W(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getRecommendationId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getIcon()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getSubtitles()Ljava/util/List;

    move-result-object v0

    const/16 v4, 0xa

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;

    new-instance v8, Lbm0/b;

    invoke-virtual {v7}, Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;->getLabel()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;->getValue()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v8, v9, v7}, Lbm0/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :cond_1
    if-nez v6, :cond_2

    sget-object v6, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getTargetZones()Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;->getIndicatorPosition()Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;->getTargetZonesTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;->getTargetZones()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;

    invoke-virtual {v4}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->getStyle()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v12

    array-length v13, v12

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v13, :cond_4

    aget-object v15, v12, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_4
    const/4 v15, 0x0

    :goto_3
    if-nez v15, :cond_5

    goto :goto_4

    :cond_5
    move-object v11, v15

    :goto_4
    new-instance v5, Lbm0/t;

    invoke-virtual {v4}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->getSize()F

    move-result v10

    invoke-virtual {v4}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v4}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v5, v10, v11, v12, v4}, Lbm0/t;-><init>(FLy81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v0, Lbm0/c;

    invoke-direct {v0, v7, v8, v9}, Lbm0/c;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    move-object v5, v0

    :goto_5
    move-object v4, v6

    goto :goto_6

    :cond_7
    const/4 v5, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->isSelected()Z

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getCta()Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v7, Lbm0/d;

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;->isSelectedCtaTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;->getNotSelectedCtaTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v7, v8, v0}, Lbm0/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    goto :goto_7

    :cond_8
    const/4 v7, 0x0

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->getContent()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_9

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v9, v8, v9}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    move-object v8, v0

    goto :goto_8

    :cond_9
    const/4 v9, 0x0

    move-object v8, v9

    :goto_8
    new-instance v0, Lbm0/s;

    invoke-direct/range {v0 .. v8}, Lbm0/s;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lbm0/c;ZLbm0/d;Lm91/u;)V

    return-object v0
.end method

.method private static final X(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;
    .locals 22

    if-eqz p0, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected()Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v4, Lkd1/o$c;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance v4, Lkd1/o$a;

    sget-object v1, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-direct {v4, v1}, Lkd1/o$a;-><init>(I)V

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityStrain()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityDuration()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityDurationUnit()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityDurationLabel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getTargetZones()Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getIndicatorPosition()Ljava/lang/Float;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v10

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getTargetZoneStyle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getTargetZoneTitle()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_2

    const-string v12, ""

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getTargetZones()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v1, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;

    invoke-virtual {v14}, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;->getSize()F

    move-result v15

    invoke-virtual {v14}, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v16, Luz0/k;->STRAIN_ZONE_2:Luz0/k;

    move-object/from16 v17, v1

    invoke-static {}, Luz0/k;->values()[Luz0/k;

    move-result-object v1

    move-object/from16 v18, v2

    array-length v2, v1

    const/16 v19, 0x0

    move-object/from16 v20, v1

    move/from16 v1, v19

    :goto_3
    if-ge v1, v2, :cond_4

    aget-object v19, v20, v1

    move/from16 v21, v1

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v1, v21, 0x1

    goto :goto_3

    :cond_4
    const/16 v19, 0x0

    :goto_4
    if-nez v19, :cond_5

    move-object/from16 v0, v16

    goto :goto_5

    :cond_5
    move-object/from16 v0, v19

    :goto_5
    invoke-virtual {v14}, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Luz0/p;

    invoke-direct {v2, v15, v0, v1}, Luz0/p;-><init>(FLuz0/k;Ljava/lang/String;)V

    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    goto :goto_2

    :cond_6
    move-object/from16 v18, v2

    new-instance v0, Luz0/o;

    invoke-direct {v0, v10, v11, v12, v13}, Luz0/o;-><init>(FLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object v10, v0

    goto :goto_6

    :cond_7
    move-object/from16 v18, v2

    const/4 v10, 0x0

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIntensityStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x78ae7c8b

    if-eq v1, v2, :cond_b

    const v2, 0x12734

    if-eq v1, v2, :cond_a

    const v2, 0x21d5a2

    if-eq v1, v2, :cond_8

    goto :goto_7

    :cond_8
    const-string v1, "HIGH"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_7

    :cond_9
    sget-object v0, Luz0/b;->HIGH:Luz0/b;

    goto :goto_8

    :cond_a
    const-string v1, "LOW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Luz0/b;->LOW:Luz0/b;

    goto :goto_8

    :cond_b
    const-string v1, "MEDIUM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    :goto_7
    sget-object v0, Luz0/b;->UNKNOWN:Luz0/b;

    goto :goto_8

    :cond_d
    sget-object v0, Luz0/b;->MEDIUM:Luz0/b;

    :goto_8
    move-object v11, v0

    goto :goto_9

    :cond_e
    const/4 v11, 0x0

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIntensityTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIntensitySubtitle()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getButtonViewState()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Luz0/l;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;->isSelectedCtaTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;->getNotSelectedCtaTitle()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Luz0/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v14, v1

    goto :goto_a

    :cond_f
    const/4 v14, 0x0

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getContent()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_10

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    move-object v15, v0

    goto :goto_b

    :cond_10
    const/4 v2, 0x0

    move-object v15, v2

    :goto_b
    new-instance v1, Luz0/i;

    move-object/from16 v2, v18

    invoke-direct/range {v1 .. v15}, Luz0/i;-><init>(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/o;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;Lm91/u;)V

    return-object v1

    :cond_11
    const/4 v2, 0x0

    return-object v2
.end method

.method private static final Y(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;)Loh0/c;
    .locals 8

    new-instance v0, Loh0/c;

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/MarkdownTextWidget;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/MarkdownTextWidget;->getTextHash()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/MarkdownTextWidget;->getFadeInReveal()Z

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v5, p1

    invoke-direct/range {v0 .. v7}, Loh0/c;-><init>(Ljava/lang/String;IZZLi2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic Z(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;ILjava/lang/Object;)Loh0/c;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lpl0/c;->Y(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Li2/t;)Loh0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;)Leh0/d;
    .locals 0

    invoke-static {p0}, Lpl0/c;->F(Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;)Leh0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;)Lbm0/m;
    .locals 0

    invoke-static {p0}, Lpl0/c;->R(Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;)Lbm0/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;)Lhh0/a;
    .locals 0

    invoke-static {p0}, Lpl0/c;->C(Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;)Lhh0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;)Lxl0/d;
    .locals 0

    invoke-static {p0}, Lpl0/c;->E(Lcom/whoop/bot/models/conversation/HpmlBrowserWidgetModel;)Lxl0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/items/SingleSelectModel;)Lt31/c;
    .locals 0

    invoke-static {p0}, Lpl0/c;->A(Lcom/whoop/design/models/items/SingleSelectModel;)Lt31/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/bot/models/conversation/AdditionalContextModel;)Ltl0/c;
    .locals 0

    invoke-static {p0}, Lpl0/c;->P(Lcom/whoop/bot/models/conversation/AdditionalContextModel;)Ltl0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;)Lcm0/e;
    .locals 0

    invoke-static {p0}, Lpl0/c;->S(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;)Lcm0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/ai/chat/models/MarkdownTextWidget;)Loh0/c;
    .locals 0

    invoke-static {p0}, Lpl0/c;->M(Lcom/whoop/ai/chat/models/MarkdownTextWidget;)Loh0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;)Lm91/u;
    .locals 0

    invoke-static {p0}, Lpl0/c;->T(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/design/models/items/StartTurnButtonModel;)Lmh0/h;
    .locals 0

    invoke-static {p0}, Lpl0/c;->I(Lcom/whoop/design/models/items/StartTurnButtonModel;)Lmh0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpl0/c;->y(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;)Lnh0/c;
    .locals 0

    invoke-static {p0}, Lpl0/c;->N(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;)Lnh0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;)Lam0/e;
    .locals 0

    invoke-static {p0}, Lpl0/c;->O(Lcom/whoop/bot/models/conversation/StrengthTrainerWidgetModel;)Lam0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n()Ljb1/a;
    .locals 1

    invoke-static {}, Lpl0/c;->x()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o(Lcom/whoop/design/models/items/IconMarkdownCalloutModel;)Lf21/d;
    .locals 0

    invoke-static {p0}, Lpl0/c;->D(Lcom/whoop/design/models/items/IconMarkdownCalloutModel;)Lf21/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/whoop/bot/models/conversation/FormWidgetModel;)Lih0/h0;
    .locals 0

    invoke-static {p0}, Lpl0/c;->K(Lcom/whoop/bot/models/conversation/FormWidgetModel;)Lih0/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;)Lvl0/e;
    .locals 0

    invoke-static {p0}, Lpl0/c;->J(Lcom/whoop/bot/models/conversation/ChatMiniArchWidgetModel;)Lvl0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;
    .locals 0

    invoke-static {p0}, Lpl0/c;->B(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;)Lr71/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;)Lul0/d;
    .locals 0

    invoke-static {p0}, Lpl0/c;->L(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;)Lul0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpl0/c;->z(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;)Ljh0/c;
    .locals 0

    invoke-static {p0}, Lpl0/c;->G(Lcom/whoop/ai/chat/models/HealthSnapshotTileModel;)Ljh0/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;)Lfh0/h;
    .locals 0

    invoke-static {p0}, Lpl0/c;->H(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;)Lfh0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;
    .locals 0

    invoke-static {p0}, Lpl0/c;->Q(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;)Lbm0/s;

    move-result-object p0

    return-object p0
.end method

.method private static final x()Ljb1/a;
    .locals 2

    new-instance v0, Lp6/h1;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lp6/h1;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final y(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lny0/p0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lpl0/c$b;

    invoke-direct {v1}, Lpl0/c$b;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lp6/h1;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lp6/h1;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lpl0/c;->b:Llb1/y0;

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpl0/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpl0/b;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SingleSelectModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpl0/c$c;

    invoke-direct {v2, v0}, Lpl0/c$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
