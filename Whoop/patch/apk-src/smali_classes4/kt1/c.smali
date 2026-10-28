.class public final Lkt1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkt1/c;",
        "",
        "Lcom/whoop/labrador/domain/LabradorApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lkt1/d;",
        "labradorEligibilityRepository",
        "<init>",
        "(Lcom/whoop/labrador/domain/LabradorApi;Ltr2/n;Lkt1/d;)V",
        "Lkt1/b;",
        "domainState",
        "d",
        "(Lkt1/b;Lq83/d;)Ljava/lang/Object;",
        "",
        "setupRequirement",
        "",
        "selected",
        "f",
        "(Lkt1/b;Ljava/lang/String;Z)Lkt1/b;",
        "Lec3/l;",
        "Lkt1/a;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/labrador/domain/LabradorApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lkt1/d;",
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


# instance fields
.field private final a:Lcom/whoop/labrador/domain/LabradorApi;

.field private final b:Ltr2/n;

.field private final c:Lkt1/d;


# direct methods
.method public constructor <init>(Lcom/whoop/labrador/domain/LabradorApi;Ltr2/n;Lkt1/d;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labradorEligibilityRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkt1/c;->a:Lcom/whoop/labrador/domain/LabradorApi;

    iput-object p2, p0, Lkt1/c;->b:Ltr2/n;

    iput-object p3, p0, Lkt1/c;->c:Lkt1/d;

    return-void
.end method

.method public static final synthetic a(Lkt1/c;Lkt1/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lkt1/c;->d(Lkt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lkt1/c;)Lcom/whoop/labrador/domain/LabradorApi;
    .locals 0

    iget-object p0, p0, Lkt1/c;->a:Lcom/whoop/labrador/domain/LabradorApi;

    return-object p0
.end method

.method public static final synthetic c(Lkt1/c;Lkt1/b;Ljava/lang/String;Z)Lkt1/b;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lkt1/c;->f(Lkt1/b;Ljava/lang/String;Z)Lkt1/b;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lkt1/b;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt1/b;",
            "Lq83/d<",
            "-",
            "Lkt1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lkt1/c$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lkt1/c$a;

    iget v3, v2, Lkt1/c$a;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lkt1/c$a;->z:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lkt1/c$a;

    invoke-direct {v2, v0, v1}, Lkt1/c$a;-><init>(Lkt1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lkt1/c$a;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lkt1/c$a;->z:I

    const/4 v4, 0x1

    const/4 v11, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lkt1/c$a;->w:Ljava/lang/Object;

    check-cast v2, Lkt1/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lkt1/c;->b:Ltr2/n;

    new-instance v7, Lkt1/c$b;

    invoke-direct {v7, v0, v11}, Lkt1/c$b;-><init>(Lkt1/c;Lq83/d;)V

    move-object/from16 v12, p1

    iput-object v12, v8, Lkt1/c$a;->w:Ljava/lang/Object;

    iput v4, v8, Lkt1/c$a;->z:I

    const/4 v5, 0x0

    const-string v6, "Failed to fetch ecg eligibility screen"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v2, v12

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v3, v1, Lu02/a$b;

    if-eqz v3, :cond_4

    sget-object v1, Lkt1/e$a;->a:Lkt1/e$a;

    const/4 v3, 0x2

    invoke-static {v2, v1, v11, v3, v11}, Lkt1/b;->b(Lkt1/b;Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;ILjava/lang/Object;)Lkt1/b;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v3, v1, Lu02/a$c;

    if-eqz v3, :cond_5

    sget-object v3, Lkt1/e$b;->a:Lkt1/e$b;

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getAcknowledgeAllToggle()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    move-result-object v6

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->copy$default(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    move-result-object v13

    const/16 v16, 0x37f

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->copy$default(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lkt1/b;->a(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lkt1/b;

    move-result-object v1

    return-object v1

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final f(Lkt1/b;Ljava/lang/String;Z)Lkt1/b;
    .locals 17

    move-object/from16 v0, p1

    invoke-virtual {v0}, Lkt1/b;->c()Lkt1/e;

    move-result-object v1

    sget-object v2, Lkt1/e$b;->a:Lkt1/e$b;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v1, p0

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lkt1/b;->d()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->getAcknowledgeAllToggle()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->getSetupRequirement()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, p2

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v6, p3

    invoke-static/range {v3 .. v8}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->copy$default(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    move-result-object v3

    :cond_2
    move-object v12, v3

    if-nez v12, :cond_3

    goto :goto_0

    :cond_3
    move-object/from16 v1, p0

    iget-object v3, v1, Lkt1/c;->c:Lkt1/d;

    invoke-virtual {v12}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->getSelected()Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v4, v6, v6, v5}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;-><init>(ZZZ)V

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v4}, Lkt1/d;->b(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;)V

    invoke-virtual {v0}, Lkt1/b;->d()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    move-result-object v4

    const/16 v15, 0x37f

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->copy$default(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lkt1/b;->a(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lkt1/b;

    move-result-object v0

    :goto_2
    return-object v0
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 4
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

    new-instance v0, Lkt1/b;

    sget-object v1, Lkt1/e$c;->a:Lkt1/e$c;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lkt1/b;-><init>(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lkt1/c$c;

    invoke-direct {v1, p0, v3}, Lkt1/c$c;-><init>(Lkt1/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
