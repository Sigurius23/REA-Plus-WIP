.class public final Ltt2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ltt2/a;",
        "Ltt2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Ltt2/c;",
        "Lod1/g;",
        "Ltt2/a;",
        "Ltt2/b;",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "api",
        "Lnm0/e;",
        "cachedApiSource",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Ltr2/n;)V",
        "Lec3/l;",
        "j",
        "()Lec3/l;",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;",
        "response",
        "Ltt2/b$f;",
        "h",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;)Ltt2/b$f;",
        "",
        "planId",
        "i",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "b",
        "Lnm0/e;",
        "c",
        "Ltr2/n;",
        "weekly-plan_release"
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
.field private final a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

.field private final b:Lnm0/e;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltt2/c;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    .line 3
    iput-object p2, p0, Ltt2/c;->b:Lnm0/e;

    .line 4
    iput-object p3, p0, Ltt2/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "PresetLandingInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ltt2/c;-><init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Ltt2/c;Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;)Ltt2/b$f;
    .locals 0

    invoke-direct {p0, p1}, Ltt2/c;->h(Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;)Ltt2/b$f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltt2/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltt2/c;->i(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ltt2/c;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;
    .locals 0

    iget-object p0, p0, Ltt2/c;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    return-object p0
.end method

.method public static final synthetic f(Ltt2/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Ltt2/c;->j()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ltt2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ltt2/c;->c:Ltr2/n;

    return-object p0
.end method

.method private final h(Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;)Ltt2/b$f;
    .locals 2

    new-instance v0, Ltt2/b$f;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;->getMetadata()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p1, v1}, Ltt2/b$f;-><init>(Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    return-object v0
.end method

.method private final i(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ltt2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltt2/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltt2/c$a;

    iget v1, v0, Ltt2/c$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltt2/c$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ltt2/c$a;

    invoke-direct {v0, p0, p2}, Ltt2/c$a;-><init>(Ltt2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ltt2/c$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ltt2/c$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ltt2/c$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Ltt2/c;->c:Ltr2/n;

    new-instance v5, Ltt2/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Ltt2/c$b;-><init>(Ltt2/c;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v6, Ltt2/c$a;->w:Ljava/lang/Object;

    iput p2, v6, Ltt2/c$a;->z:I

    const-string v4, "Failed to cancel plan"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of v0, p2, Lu02/a$c;

    if-eqz v0, :cond_4

    sget-object p1, Ltt2/b$b;->a:Ltt2/b$b;

    return-object p1

    :cond_4
    instance-of v0, p2, Lu02/a$b;

    if-eqz v0, :cond_5

    new-instance v0, Ltt2/b$a;

    check-cast p2, Lu02/a$b;

    invoke-virtual {p2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ltt2/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final j()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/weeklyplan/api/WeeklyPlanGetPresets;->INSTANCE:Lcom/whoop/weeklyplan/api/WeeklyPlanGetPresets;

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Ltt2/c;->b:Lnm0/e;

    new-instance v3, Ltt2/c$c;

    invoke-direct {v3, v2, v1}, Ltt2/c$c;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Ltt2/c$d;

    invoke-direct {v1, v0, p0}, Ltt2/c$d;-><init>(Lec3/l;Ltt2/c;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Ltt2/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ltt2/c$e;-><init>(Lq83/d;Ltt2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
