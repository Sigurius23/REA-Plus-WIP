.class public final Lss2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lss2/b;",
        "Lss2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lss2/e;",
        "Lod1/g;",
        "Lss2/b;",
        "Lss2/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lls2/b;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lls2/b;Ltr2/n;)V",
        "",
        "source",
        "Lec3/l;",
        "h",
        "(Ljava/lang/String;)Lec3/l;",
        "Ll83/a0;",
        "i",
        "(Ljava/lang/String;)V",
        "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;",
        "response",
        "Lss2/c$c;",
        "g",
        "(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/c$c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lls2/b;",
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
.field private final a:Lnm0/e;

.field private final b:Lls2/b;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lls2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lss2/e;->a:Lnm0/e;

    iput-object p2, p0, Lss2/e;->b:Lls2/b;

    iput-object p3, p0, Lss2/e;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lss2/e;Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/c$c;
    .locals 0

    invoke-direct {p0, p1}, Lss2/e;->g(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/c$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lss2/e;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lss2/e;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lss2/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lss2/e;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lss2/e;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lss2/e;->i(Ljava/lang/String;)V

    return-void
.end method

.method private final g(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/c$c;
    .locals 2

    sget-object v0, Lss2/f;->a:Lss2/f;

    invoke-virtual {v0, p1}, Lss2/f;->a(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/a;

    move-result-object v0

    new-instance v1, Lss2/c$c;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lss2/c$c;-><init>(Lss2/a;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    return-object v1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/weeklyplan/api/WeeklyPlanChallengeGetRequest;->INSTANCE:Lcom/whoop/weeklyplan/api/WeeklyPlanChallengeGetRequest;

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lss2/e;->a:Lnm0/e;

    new-instance v3, Lss2/e$a;

    invoke-direct {v3, v2, v1}, Lss2/e$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lss2/e$b;

    invoke-direct {v1, v0, p0, p1}, Lss2/e$b;-><init>(Lec3/l;Lss2/e;Ljava/lang/String;)V

    return-object v1
.end method

.method private final i(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lss2/e;->b:Lls2/b;

    new-instance v1, Lls2/a$t;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "Empty State"

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-direct/range {v1 .. v7}, Lls2/a$t;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    return-void
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

    new-instance v0, Lss2/e$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lss2/e$c;-><init>(Lq83/d;Lss2/e;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
