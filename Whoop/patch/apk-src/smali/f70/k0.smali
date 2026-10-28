.class public final Lf70/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lf70/k0;",
        "",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "activationApi",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "emailDataStoreHelper",
        "Lwn0/b;",
        "passwordRequirementsFetcher",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Ltr2/n;)V",
        "",
        "logPrefix",
        "",
        "Lcom/whoop/service/network/model/PasswordRequirement;",
        "f",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lf70/e;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "c",
        "email",
        "d",
        "a",
        "Lcom/whoop/activation/domain/ActivationApi;",
        "b",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "Lwn0/b;",
        "Ltr2/n;",
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


# instance fields
.field private final a:Lcom/whoop/activation/domain/ActivationApi;

.field private final b:Lcom/whoop/data/datastore/EmailDataStoreHelper;

.field private final c:Lwn0/b;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Ltr2/n;)V
    .locals 1

    const-string v0, "activationApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailDataStoreHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordRequirementsFetcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/k0;->a:Lcom/whoop/activation/domain/ActivationApi;

    .line 3
    iput-object p2, p0, Lf70/k0;->b:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    .line 4
    iput-object p3, p0, Lf70/k0;->c:Lwn0/b;

    .line 5
    iput-object p4, p0, Lf70/k0;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "IAJFV2BffFetcher"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lf70/k0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/k0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf70/k0;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lf70/k0;)Lcom/whoop/activation/domain/ActivationApi;
    .locals 0

    iget-object p0, p0, Lf70/k0;->a:Lcom/whoop/activation/domain/ActivationApi;

    return-object p0
.end method

.method private final f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/PasswordRequirement;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lf70/k0$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf70/k0$g;

    iget v1, v0, Lf70/k0$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/k0$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf70/k0$g;

    invoke-direct {v0, p0, p2}, Lf70/k0$g;-><init>(Lf70/k0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf70/k0$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/k0$g;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lf70/k0$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lf70/k0;->c:Lwn0/b;

    iput-object p1, v0, Lf70/k0$g;->w:Ljava/lang/Object;

    iput v3, v0, Lf70/k0$g;->z:I

    invoke-virtual {p2, v0}, Lwn0/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lwn0/a;

    instance-of v0, p2, Lwn0/a$b;

    if-eqz v0, :cond_4

    check-cast p2, Lwn0/a$b;

    invoke-virtual {p2}, Lwn0/a$b;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p2, Lwn0/a$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lf70/k0;->d:Ltr2/n;

    check-cast p2, Lwn0/a$a;

    invoke-virtual {p2}, Lwn0/a$a;->a()Lwn0/c;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": Failed to fetch password requirements: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lf70/k0$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/k0$a;

    iget v3, v2, Lf70/k0$a;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/k0$a;->y:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/k0$a;

    invoke-direct {v2, v0, v1}, Lf70/k0$a;-><init>(Lf70/k0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/k0$a;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/k0$a;->y:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

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

    iget-object v1, v0, Lf70/k0;->d:Ltr2/n;

    new-instance v7, Lf70/k0$b;

    const/4 v5, 0x0

    invoke-direct {v7, v0, v5}, Lf70/k0$b;-><init>(Lf70/k0;Lq83/d;)V

    iput v4, v8, Lf70/k0$a;->y:I

    const-string v6, "Failed to fetch IAJF V2 country screen"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_2
    check-cast v1, Lu02/a;

    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_7

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v5, :cond_4

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, v0, Lf70/k0;->d:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "IAJF V2 country BFF returned an empty list of screens."

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lf70/e$b;

    sget-object v9, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v18, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v22, 0x1dfef

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_6
    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;->getCountries()Ljava/util/List;

    move-result-object v6

    new-instance v5, Ln70/e;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    sget-object v11, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->IN_APP_JOIN_FLOW:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v7, v5

    invoke-direct/range {v7 .. v12}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    sget-object v8, Lf70/b0;->CONTENT:Lf70/b0;

    sget-object v17, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    new-instance v3, Lf70/e$b;

    const v21, 0x1dfe8

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v22}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_7
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_8

    new-instance v2, Lf70/e$b;

    sget-object v7, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v16, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v20, 0x1dfef

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v2 .. v21}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lf70/k0$c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/k0$c;

    iget v3, v2, Lf70/k0$c;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/k0$c;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/k0$c;

    invoke-direct {v2, v0, v1}, Lf70/k0$c;-><init>(Lf70/k0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/k0$c;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/k0$c;->E:I

    const/4 v11, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Lf70/k0$c;->x:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v3, v8, Lf70/k0$c;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lf70/k0$c;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lf70/k0;->d:Ltr2/n;

    new-instance v7, Lf70/k0$d;

    move-object/from16 v5, p1

    invoke-direct {v7, v0, v5, v12}, Lf70/k0$d;-><init>(Lf70/k0;Ljava/lang/String;Lq83/d;)V

    iput-object v12, v8, Lf70/k0$c;->w:Ljava/lang/Object;

    iput v4, v8, Lf70/k0$c;->E:I

    const/4 v5, 0x0

    const-string v6, "Failed to fetch IAJF V2 create-account screens"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast v1, Lu02/a;

    iput-object v12, v8, Lf70/k0$c;->w:Ljava/lang/Object;

    iput-object v1, v8, Lf70/k0$c;->x:Ljava/lang/Object;

    iput v11, v8, Lf70/k0$c;->E:I

    const-string v3, "IAJF V2 create-account"

    invoke-direct {v0, v3, v8}, Lf70/k0;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    move-object v2, v1

    move-object v1, v3

    :goto_4
    move-object/from16 v18, v1

    check-cast v18, Ljava/util/List;

    instance-of v1, v2, Lu02/a$c;

    if-eqz v1, :cond_9

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;->getActivationBff()Lcom/whoop/activation/domain/models/ActivationFlowBff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowBff;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v5, :cond_6

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v0, Lf70/k0;->d:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "IAJF V2 create-account BFF returned an empty list of screens."

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lf70/e$b;

    sget-object v9, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v18, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v22, 0x1dfef

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_8
    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;->getActivationBff()Lcom/whoop/activation/domain/models/ActivationFlowBff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowBff;->getCountries()Ljava/util/List;

    move-result-object v6

    new-instance v5, Ln70/e;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    sget-object v11, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->IN_APP_JOIN_FLOW:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v7, v5

    invoke-direct/range {v7 .. v12}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    sget-object v8, Lf70/b0;->CONTENT:Lf70/b0;

    sget-object v17, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    new-instance v3, Lf70/e$b;

    const v21, 0x19fe8

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v22}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_9
    instance-of v1, v2, Lu02/a$b;

    if-eqz v1, :cond_a

    new-instance v2, Lf70/e$b;

    sget-object v7, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v16, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v20, 0x1dfef

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v2 .. v21}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lf70/k0$e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lf70/k0$e;

    iget v3, v2, Lf70/k0$e;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lf70/k0$e;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lf70/k0$e;

    invoke-direct {v2, v0, v1}, Lf70/k0$e;-><init>(Lf70/k0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lf70/k0$e;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lf70/k0$e;->E:I

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v13, :cond_2

    if-ne v3, v12, :cond_1

    iget-object v2, v8, Lf70/k0$e;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v8, Lf70/k0$e;->w:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v4, v0, Lf70/k0;->d:Ltr2/n;

    new-instance v7, Lf70/k0$f;

    invoke-direct {v7, v0, v11}, Lf70/k0$f;-><init>(Lf70/k0;Lq83/d;)V

    iput v13, v8, Lf70/k0$e;->E:I

    const/4 v5, 0x0

    const-string v6, "Failed to fetch IAJF V2 email screen"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    check-cast v1, Lu02/a;

    instance-of v3, v1, Lu02/a$c;

    if-eqz v3, :cond_d

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/models/InAppJoinFlowResponse;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/InAppJoinFlowResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    if-eqz v5, :cond_5

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lf70/k0;->d:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "IAJF V2 BFF returned an empty list of screens."

    invoke-interface {v1, v3, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lf70/e$b;

    sget-object v9, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v18, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v22, 0x1dfef

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v23}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_7
    iget-object v1, v0, Lf70/k0;->b:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    iput-object v11, v8, Lf70/k0$e;->w:Ljava/lang/Object;

    iput-object v3, v8, Lf70/k0$e;->x:Ljava/lang/Object;

    iput v12, v8, Lf70/k0$e;->E:I

    invoke-virtual {v1, v8}, Lcom/whoop/data/datastore/EmailDataStoreHelper;->getEmail(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    move-object v2, v3

    :goto_5
    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v1, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    instance-of v4, v3, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    if-eqz v4, :cond_b

    move-object/from16 v16, v3

    check-cast v16, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->getTextEntries()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v3, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v12, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    invoke-virtual {v3}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->getFieldType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "EMAIL"

    invoke-static {v4, v5, v13}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v9, 0x1b

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;->copy$default(Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    move-result-object v3

    :cond_9
    invoke-interface {v12, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_a
    const/16 v28, 0x7fb

    const/16 v29, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v19, v12

    invoke-static/range {v16 .. v29}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;->copy$default(Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    move-result-object v3

    :cond_b
    invoke-interface {v15, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    new-instance v14, Lf70/e$b;

    new-instance v16, Ln70/e;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    sget-object v7, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->IN_APP_JOIN_FLOW:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, v16

    invoke-direct/range {v3 .. v8}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;)V

    sget-object v19, Lf70/b0;->CONTENT:Lf70/b0;

    sget-object v28, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v32, 0x1dfec

    const/16 v33, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v14 .. v33}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14

    :cond_d
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_e

    new-instance v2, Lf70/e$b;

    sget-object v7, Lf70/b0;->ERROR:Lf70/b0;

    sget-object v16, Lcom/whoop/activation/iajf/domain/SignUpSource;->IAJF_V2:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const v20, 0x1dfef

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v2 .. v21}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
