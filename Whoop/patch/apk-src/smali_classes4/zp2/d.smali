.class public final Lzp2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzp2/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lzp2/d;",
        "",
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "userJourneyApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Ltr2/n;)V",
        "",
        "year",
        "Lcom/whoop/user/journey/model/UserJourneyContentState;",
        "b",
        "(ILq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "Ltr2/n;",
        "c",
        "user-journey_release"
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
.field public static final c:Lzp2/d$a;

.field public static final d:I


# instance fields
.field private final a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

.field private final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzp2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzp2/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzp2/d;->c:Lzp2/d$a;

    const/16 v0, 0x8

    sput v0, Lzp2/d;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Ltr2/n;)V
    .locals 1

    const-string v0, "userJourneyApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp2/d;->a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    iput-object p2, p0, Lzp2/d;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lzp2/d;)Lcom/whoop/user/journey/sources/data/UserJourneyApi;
    .locals 0

    iget-object p0, p0, Lzp2/d;->a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    return-object p0
.end method


# virtual methods
.method public final b(ILq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/user/journey/model/UserJourneyContentState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lzp2/d$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzp2/d$b;

    iget v1, v0, Lzp2/d$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzp2/d$b;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lzp2/d$b;

    invoke-direct {v0, p0, p2}, Lzp2/d$b;-><init>(Lzp2/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lzp2/d$b;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lzp2/d$b;->z:I

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v11, :cond_2

    if-ne v1, v10, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p2, -0x1

    if-ne p1, p2, :cond_9

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lzp2/d;->b:Ltr2/n;

    new-instance v5, Lzp2/d$c;

    invoke-direct {v5, p0, v12}, Lzp2/d$c;-><init>(Lzp2/d;Lq83/d;)V

    iput p1, v6, Lzp2/d$b;->w:I

    iput v11, v6, Lzp2/d$b;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch Weekly in review steps"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    new-instance p1, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV1;

    invoke-direct {p1, v12, v11, v11, v12}, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV1;-><init>(Lcom/whoop/user/journey/model/UserJourneyContentModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_8

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/user/journey/model/UserJourneyContentModel;

    invoke-virtual {p1}, Lcom/whoop/user/journey/model/UserJourneyContentModel;->getSteps()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/user/journey/model/UserJourneyStep;

    sget-object v3, Lcom/whoop/user/journey/model/UnknownUserJourneyStep;->INSTANCE:Lcom/whoop/user/journey/model/UnknownUserJourneyStep;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV1;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/user/journey/model/UserJourneyContentModel;

    invoke-static {p2, v0, v12, v10, v12}, Lcom/whoop/user/journey/model/UserJourneyContentModel;->copy$default(Lcom/whoop/user/journey/model/UserJourneyContentModel;Ljava/util/List;Lcom/whoop/user/journey/model/HeaderContentModel;ILjava/lang/Object;)Lcom/whoop/user/journey/model/UserJourneyContentModel;

    move-result-object p2

    invoke-direct {p1, p2, v9}, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV1;-><init>(Lcom/whoop/user/journey/model/UserJourneyContentModel;Z)V

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lzp2/d;->b:Ltr2/n;

    const-string p2, "Failed to fetch YIR for "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lzp2/d$d;

    invoke-direct {v5, p0, p1, v12}, Lzp2/d$d;-><init>(Lzp2/d;ILq83/d;)V

    iput p1, v6, Lzp2/d$b;->w:I

    iput v10, v6, Lzp2/d$b;->z:I

    const/4 v3, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_a

    :goto_4
    return-object v0

    :cond_a
    :goto_5
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_b

    new-instance p1, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV2;

    invoke-direct {p1, v12, v11, v11, v12}, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV2;-><init>(Lcom/whoop/user/journey/model/UserJourneyContentModelV2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_b
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_f

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    invoke-virtual {p1}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/user/journey/model/UserJourneySection;

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/UserJourneySection;->getSteps()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/user/journey/model/UserJourneyStep;

    sget-object v6, Lcom/whoop/user/journey/model/UnknownUserJourneyStep;->INSTANCE:Lcom/whoop/user/journey/model/UnknownUserJourneyStep;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    invoke-static {v1, v12, v3, v11, v12}, Lcom/whoop/user/journey/model/UserJourneySection;->copy$default(Lcom/whoop/user/journey/model/UserJourneySection;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/user/journey/model/UserJourneySection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    new-instance p1, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV2;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    invoke-static {p2, v12, v0, v11, v12}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->copy$default(Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Lcom/whoop/user/journey/model/LandingContent;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    move-result-object p2

    invoke-direct {p1, p2, v9}, Lcom/whoop/user/journey/model/UserJourneyContentState$UserJourneyContentStateV2;-><init>(Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Z)V

    return-object p1

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
