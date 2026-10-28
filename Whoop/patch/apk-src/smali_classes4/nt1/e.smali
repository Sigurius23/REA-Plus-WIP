.class public final Lnt1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lnt1/e;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "bffFeed",
        "Lnt1/d;",
        "d",
        "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lnt1/d;",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;",
        "labradorSetupToggle",
        "Lnt1/b;",
        "c",
        "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;)Lnt1/b;",
        "Lec3/l;",
        "Lkt1/b;",
        "upstream",
        "b",
        "(Lec3/l;)Lec3/l;",
        "labrador_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lnt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lnt1/d;
    .locals 0

    invoke-direct {p0, p1}, Lnt1/e;->d(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lnt1/d;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;)Lnt1/b;
    .locals 3

    new-instance v0, Lnt1/b;

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->getSetupRequirement()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->getSelected()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lnt1/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    return-object v0
.end method

.method private final d(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lnt1/d;
    .locals 23

    if-eqz p1, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->getRegions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->getAvailabilityAlert()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->getAvailabilityIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v7, v6

    const/4 v9, 0x0

    move v10, v9

    :goto_1
    const/4 v11, 0x0

    if-ge v10, v7, :cond_2

    aget-object v12, v6, v10

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    move-object v12, v11

    :goto_2
    if-nez v12, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v12

    :goto_3
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->getButtonLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v1, Lnt1/i;

    invoke-direct/range {v1 .. v7}, Lnt1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    :goto_4
    if-ge v9, v4, :cond_5

    aget-object v5, v3, v9

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v11, v5

    goto :goto_5

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-nez v11, :cond_6

    goto :goto_6

    :cond_6
    move-object v2, v11

    :goto_6
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getPageTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v15, Lkd1/o$c;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getBackgroundImage()Ljava/lang/String;

    move-result-object v16

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getConditions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getAcknowledgeAllToggle()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    move-result-object v0

    move-object/from16 v3, p0

    invoke-direct {v3, v0}, Lnt1/e;->c(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;)Lnt1/b;

    move-result-object v20

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getButtonLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v4

    goto :goto_8

    :cond_8
    move-object/from16 v22, v0

    :goto_8
    new-instance v12, Lnt1/d$b;

    move-object/from16 v19, v1

    move-object/from16 v18, v2

    invoke-direct/range {v12 .. v22}, Lnt1/d$b;-><init>(ILcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lnt1/i;Lnt1/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    return-object v12

    :cond_9
    move-object/from16 v3, p0

    sget-object v0, Lnt1/d$a;->h:Lnt1/d$a$a;

    invoke-virtual {v0}, Lnt1/d$a$a;->a()Lnt1/d$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
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

    new-instance v0, Lnt1/e$a;

    invoke-direct {v0, p1, p0}, Lnt1/e$a;-><init>(Lec3/l;Lnt1/e;)V

    return-object v0
.end method
