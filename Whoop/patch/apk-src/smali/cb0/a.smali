.class public final Lcb0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcb0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 $2\u00020\u0001:\u0001\"B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n*\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000e\u001a\u00020\n*\u00020\r2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\'\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001c2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcb0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lza0/c$d;",
        "",
        "",
        "dismissedCardIds",
        "Lbb0/d$c;",
        "h",
        "(Lza0/c$d;Ljava/util/Set;)Lbb0/d$c;",
        "Lza0/c$a;",
        "i",
        "(Lza0/c$a;Ljava/util/Set;)Lbb0/d$c;",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;",
        "Lbb0/a;",
        "g",
        "(Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;)Lbb0/a;",
        "Lm91/u;",
        "itemViewState",
        "",
        "isDateSelectorLoading",
        "d",
        "(Lm91/u;Z)Lm91/u;",
        "c",
        "(Lm91/u;Ljava/util/Set;)Lm91/u;",
        "Lec3/l;",
        "Lza0/c;",
        "upstream",
        "Lbb0/d;",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
        "b",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcb0/a$a;

.field public static final c:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcb0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcb0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcb0/a;->b:Lcb0/a$a;

    sget v0, Ljb1/a;->c:I

    sput v0, Lcb0/a;->c:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcb0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcb0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Lcb0/a;Lza0/c$d;Ljava/util/Set;)Lbb0/d$c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcb0/a;->h(Lza0/c$d;Ljava/util/Set;)Lbb0/d$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcb0/a;Lza0/c$a;Ljava/util/Set;)Lbb0/d$c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcb0/a;->i(Lza0/c$a;Ljava/util/Set;)Lbb0/d$c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lm91/u;Ljava/util/Set;)Lm91/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lm91/u;"
        }
    .end annotation

    instance-of v0, p1, Lf01/q;

    if-eqz v0, :cond_1

    check-cast p1, Lf01/q;

    invoke-virtual {p1}, Lf01/q;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1

    :cond_1
    instance-of v0, p1, Lkf0/k;

    if-eqz v0, :cond_4

    move-object v1, p1

    check-cast v1, Lkf0/k;

    invoke-virtual {v1}, Lkf0/k;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    invoke-direct {p0, v0, p2}, Lcb0/a;->c(Lm91/u;Ljava/util/Set;)Lm91/u;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lkf0/k;->b(Lkf0/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lkf0/k;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method private final d(Lm91/u;Z)Lm91/u;
    .locals 21

    move-object/from16 v0, p1

    instance-of v1, v0, Llf0/u;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Llf0/u;

    invoke-virtual {v2}, Llf0/u;->h()Lj71/c;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Llf0/u;->h()Lj71/c;

    move-result-object v1

    invoke-virtual {v1}, Lj71/c;->e()Lj61/h;

    move-result-object v4

    invoke-virtual {v2}, Llf0/u;->h()Lj71/c;

    move-result-object v1

    invoke-virtual {v1}, Lj71/c;->e()Lj61/h;

    move-result-object v1

    invoke-virtual {v1}, Lj61/h;->j()Lh2/c;

    move-result-object v1

    const v5, 0x3ccccccd    # 0.025f

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static {v1, v5, v7, v7, v6}, Lh2/c;->b(Lh2/c;FFFI)Lh2/c;

    move-result-object v9

    invoke-virtual {v2}, Llf0/u;->h()Lj71/c;

    move-result-object v1

    invoke-virtual {v1}, Lj71/c;->e()Lj61/h;

    move-result-object v1

    invoke-virtual {v1}, Lj61/h;->n()Lg61/b;

    move-result-object v10

    if-eqz v10, :cond_0

    const/16 v19, 0xfe

    const/16 v20, 0x0

    const v11, 0x3d99999a    # 0.075f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v10 .. v20}, Lg61/b;->b(Lg61/b;FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILjava/lang/Object;)Lg61/b;

    move-result-object v0

    :cond_0
    move-object v5, v0

    const/16 v19, 0x1fee

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v4 .. v20}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v9}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    :cond_1
    move-object v6, v0

    const/16 v11, 0xf3

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v5, p2

    invoke-static/range {v2 .. v12}, Llf0/u;->b(Llf0/u;Llf0/q;Li11/f;ZLj71/c;Ljava/util/List;Lhy0/h1;Lc41/p2;Llf0/y;ILjava/lang/Object;)Llf0/u;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, v0, Lkf0/k;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Lkf0/k;

    invoke-virtual {v2}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    move-object/from16 v9, p0

    move/from16 v5, p2

    invoke-direct {v9, v1, v5}, Lcb0/a;->d(Lm91/u;Z)Lm91/u;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    move-object/from16 v9, p0

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lkf0/k;->b(Lkf0/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lkf0/k;

    move-result-object v0

    return-object v0

    :cond_4
    move-object/from16 v9, p0

    return-object v0
.end method

.method public static synthetic e(Lcb0/a;Lm91/u;ZILjava/lang/Object;)Lm91/u;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcb0/a;->d(Lm91/u;Z)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;)Lbb0/a;
    .locals 3

    new-instance v0, Lbb0/a;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;->getPills()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lbb0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private final h(Lza0/c$d;Ljava/util/Set;)Lbb0/d$c;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/c$d;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lbb0/d$c;"
        }
    .end annotation

    invoke-virtual {p1}, Lza0/c$d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getHeader()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;

    move-result-object v0

    invoke-direct {p0, v0}, Lcb0/a;->g(Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;)Lbb0/a;

    move-result-object v3

    invoke-virtual {p1}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    iget-object v8, p0, Lcb0/a;->a:Ljb1/a;

    invoke-virtual {v8, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    const/4 v8, 0x2

    invoke-static {p0, v5, v6, v8, v7}, Lcb0/a;->e(Lcb0/a;Lm91/u;ZILjava/lang/Object;)Lm91/u;

    move-result-object v5

    invoke-direct {p0, v5, p2}, Lcb0/a;->c(Lm91/u;Ljava/util/Set;)Lm91/u;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v5

    invoke-virtual {p1}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getStatus()Ljava/lang/String;

    move-result-object p2

    sget-object v0, La01/m;->UNAVAILABLE:La01/m;

    invoke-static {}, La01/m;->values()[La01/m;

    move-result-object v8

    array-length v9, v8

    :goto_1
    if-ge v6, v9, :cond_3

    aget-object v10, v8, v6

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move-object v10, v7

    :goto_2
    if-nez v10, :cond_4

    move-object v6, v0

    goto :goto_3

    :cond_4
    move-object v6, v10

    :goto_3
    invoke-virtual {p1}, Lza0/c$d;->e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v7

    :cond_5
    new-instance v0, Lbb0/d$c;

    invoke-direct/range {v0 .. v7}, Lbb0/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lbb0/a;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;La01/m;Lep0/j;)V

    return-object v0
.end method

.method private final i(Lza0/c$a;Ljava/util/Set;)Lbb0/d$c;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/c$a;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lbb0/d$c;"
        }
    .end annotation

    invoke-virtual {p1}, Lza0/c$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lza0/c$a;->b()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lza0/c$a;->b()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getHeader()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;

    move-result-object v0

    invoke-direct {p0, v0}, Lcb0/a;->g(Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;)Lbb0/a;

    move-result-object v3

    invoke-virtual {p1}, Lza0/c$a;->b()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    iget-object v6, p0, Lcb0/a;->a:Ljb1/a;

    invoke-virtual {v6, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    const/4 v6, 0x1

    invoke-direct {p0, v5, v6}, Lcb0/a;->d(Lm91/u;Z)Lm91/u;

    move-result-object v5

    invoke-direct {p0, v5, p2}, Lcb0/a;->c(Lm91/u;Ljava/util/Set;)Lm91/u;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lza0/c$a;->b()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v5

    invoke-virtual {p1}, Lza0/c$a;->b()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getStatus()Ljava/lang/String;

    move-result-object p2

    sget-object v0, La01/m;->UNAVAILABLE:La01/m;

    invoke-static {}, La01/m;->values()[La01/m;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    const/4 v9, 0x0

    if-ge v8, v7, :cond_3

    aget-object v10, v6, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    move-object v10, v9

    :goto_2
    if-nez v10, :cond_4

    move-object v6, v0

    goto :goto_3

    :cond_4
    move-object v6, v10

    :goto_3
    invoke-virtual {p1}, Lza0/c$a;->b()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v9

    :cond_5
    move-object v7, v9

    new-instance v0, Lbb0/d$c;

    invoke-direct/range {v0 .. v7}, Lbb0/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lbb0/a;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;La01/m;Lep0/j;)V

    return-object v0
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcb0/a$b;

    invoke-direct {v0, p1, p0}, Lcb0/a$b;-><init>(Lec3/l;Lcb0/a;)V

    return-object v0
.end method
