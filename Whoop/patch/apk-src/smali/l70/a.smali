.class public final Ll70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll70/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ&\u0010\u0012\u001a\u00020\u000c2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ll70/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "ffChecker",
        "Lhf1/b;",
        "experimentsChecker",
        "Lh80/c;",
        "activationAnalyticsHelper",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;Lh80/c;)V",
        "Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;",
        "screenModel",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;Lq83/d;)Ljava/lang/Object;",
        "",
        "",
        "experimentProperties",
        "c",
        "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lhf1/b;",
        "Lh80/c;",
        "activation_release"
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
.field private static final d:Ll70/a$a;

.field public static final e:I


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Lhf1/b;

.field private final c:Lh80/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll70/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll70/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll70/a;->d:Ll70/a$a;

    const/16 v0, 0x8

    sput v0, Ll70/a;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;Lh80/c;)V
    .locals 1

    const-string v0, "ffChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentsChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activationAnalyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll70/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Ll70/a;->b:Lhf1/b;

    iput-object p3, p0, Ll70/a;->c:Lh80/c;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "WHAT_TO_EXPECT_PRIMER"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_0

    new-instance v1, Llf1/c;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Llf1/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Ll70/a;->b:Lhf1/b;

    const/4 v2, 0x1

    invoke-interface {p1, v1, v2, p2}, Lhf1/b;->e(Lhf1/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Ll70/a$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ll70/a$b;

    iget v3, v2, Ll70/a$b;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ll70/a$b;->z:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ll70/a$b;

    invoke-direct {v2, v0, v1}, Ll70/a$b;-><init>(Ll70/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Ll70/a$b;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v9, Ll70/a$b;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v9, Ll70/a$b;->w:Ljava/lang/Object;

    check-cast v2, Llf1/g;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ll70/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v3, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FAMILY_PLAN_STARTER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v10, Llf1/g;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Llf1/g;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Ll70/a;->b:Lhf1/b;

    const/4 v1, 0x0

    iput-object v1, v9, Ll70/a$b;->w:Ljava/lang/Object;

    iput v4, v9, Ll70/a$b;->z:I

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v10

    const/4 v10, 0x6

    invoke-static/range {v3 .. v11}, Lhf1/b;->d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_2
    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Ll70/a;->c:Lh80/c;

    new-instance v3, Lh80/b$b;

    const-string v4, "fp-nonadmin-explainer-activation-flow-screen"

    invoke-direct {v3, v4, v1}, Lh80/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lh80/c;->p(Lh80/b;)V

    return-object v1

    :cond_4
    const-string v1, "control"

    return-object v1
.end method

.method public final c(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llf1/q;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Llf1/q;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Llf1/q;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Ll70/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "whoop-loop-and-healthspan-primer-droid"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    const-string v1, "error"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    move-object v1, v0

    iget-object v0, p0, Ll70/a;->b:Lhf1/b;

    const/16 v7, 0xa

    const/4 v8, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Lhf1/b;->d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Ll70/a$c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ll70/a$c;

    iget v3, v2, Ll70/a$c;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ll70/a$c;->z:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ll70/a$c;

    invoke-direct {v2, v0, v1}, Ll70/a$c;-><init>(Ll70/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Ll70/a$c;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v9, Ll70/a$c;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v9, Ll70/a$c;->w:Ljava/lang/Object;

    check-cast v2, Llf1/i;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ll70/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v3, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PASSWORD_RESET_FLOW:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v10, Llf1/i;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Llf1/i;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Ll70/a;->b:Lhf1/b;

    const/4 v1, 0x0

    iput-object v1, v9, Ll70/a$c;->w:Ljava/lang/Object;

    iput v4, v9, Ll70/a$c;->z:I

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v10

    const/4 v10, 0x2

    invoke-static/range {v3 .. v11}, Lhf1/b;->d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_2
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    const-string v3, "error"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, v0, Ll70/a;->c:Lh80/c;

    new-instance v4, Lh80/b$b;

    const-string v5, "passwordpolicy"

    invoke-direct {v4, v5, v2}, Lh80/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lh80/c;->p(Lh80/b;)V

    :cond_4
    const-string v2, "test"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method
