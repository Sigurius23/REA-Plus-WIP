.class public final Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/onboarding/OnboardingStatusDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __featureEducationTypeConverter:Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

.field private final __insertAdapterOfOnboardingStatus:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    invoke-direct {v0}, Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__featureEducationTypeConverter:Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl$1;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__insertAdapterOfOnboardingStatus:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->lambda$getOnboardingStatus$1(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->lambda$isCompletedFlow$3(Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->lambda$deleteAll$4(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/OnboardingStatus;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->lambda$updateTable$0(Lcom/whoop/data/onboarding/OnboardingStatus;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->lambda$isCompleted$2(Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;)Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__featureEducationTypeConverter:Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic lambda$deleteAll$4(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_onboarding_status"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$getOnboardingStatus$1(Ltb/a;)Ljava/util/List;
    .locals 6

    const-string v0, "SELECT * FROM table_onboarding_status"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    const-string v0, "type"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "isCompleted"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v0}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    iget-object v4, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__featureEducationTypeConverter:Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    invoke-virtual {v4, v3}, Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;->toFeatureEducationType(Ljava/lang/String;)Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v3

    invoke-interface {p1, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    new-instance v5, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-direct {v5, v3, v4}, Lcom/whoop/data/onboarding/OnboardingStatus;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$isCompleted$2(Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "SELECT isCompleted FROM table_onboarding_status WHERE type = ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__featureEducationTypeConverter:Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    invoke-virtual {v0, p1}, Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;->fromFeatureEducationType(Lcom/whoop/data/onboarding/FeatureEducationType;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    invoke-interface {p2, v0, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {p2}, Ltb/c;->e1()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    invoke-interface {p2, p1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v0, p1

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_4
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private synthetic lambda$isCompletedFlow$3(Lcom/whoop/data/onboarding/FeatureEducationType;Ltb/a;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "SELECT isCompleted FROM table_onboarding_status WHERE type = ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    :try_start_0
    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__featureEducationTypeConverter:Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;

    invoke-virtual {v0, p1}, Lcom/whoop/data/onboarding/FeatureEducationTypeConverter;->fromFeatureEducationType(Lcom/whoop/data/onboarding/FeatureEducationType;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    invoke-interface {p2, v0, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {p2}, Ltb/c;->e1()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    invoke-interface {p2, p1}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v0, p1

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_4
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private synthetic lambda$updateTable$0(Lcom/whoop/data/onboarding/OnboardingStatus;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__insertAdapterOfOnboardingStatus:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, La11/g;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getOnboardingStatus(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, La6/i;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, La6/i;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCompleted(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/onboarding/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/onboarding/a;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCompletedFlow(Lcom/whoop/data/onboarding/FeatureEducationType;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__db:Landroidx/room/z0;

    const-string v1, "table_onboarding_status"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/data/onboarding/a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lcom/whoop/data/onboarding/a;-><init>(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/FeatureEducationType;I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object p1

    return-object p1
.end method

.method public updateTable(Lcom/whoop/data/onboarding/OnboardingStatus;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbp0/n;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
