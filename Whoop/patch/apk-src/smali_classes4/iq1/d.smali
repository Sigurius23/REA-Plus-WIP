.class public final Liq1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Liq1/b;",
        "Liq1/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00032\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Liq1/d;",
        "Lod1/g;",
        "Liq1/b;",
        "Liq1/f;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "",
        "path",
        "g",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lec3/l;",
        "Liq1/g;",
        "h",
        "(Ljava/lang/String;)Lec3/l;",
        "La12/a;",
        "parsedPath",
        "",
        "showLoading",
        "i",
        "(La12/a;Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;",
        "cacheResult",
        "j",
        "(Lpm0/a$c;Ljava/lang/String;)Liq1/f;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "behavior-impact_release"
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


# direct methods
.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq1/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Liq1/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Liq1/d;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Liq1/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Liq1/d;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Liq1/d;La12/a;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Liq1/d;->i(La12/a;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Liq1/d;Lpm0/a$c;Ljava/lang/String;)Liq1/f;
    .locals 0

    invoke-direct {p0, p1, p2}, Liq1/d;->j(Lpm0/a$c;Ljava/lang/String;)Liq1/f;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "?"

    invoke-static {p1, v0}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Liq1/d;->i(La12/a;Z)Lec3/l;

    move-result-object p1

    new-instance v0, Liq1/d$a;

    invoke-direct {v0, p1}, Liq1/d$a;-><init>(Lec3/l;)V

    return-object v0
.end method

.method private final i(La12/a;Z)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/impacts/details/domain/journaltrends/BehaviorDetailsImpactJournalTrendsGetRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/impacts/details/domain/journaltrends/BehaviorDetailsImpactJournalTrendsGetRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "cycle"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Liq1/d;->a:Lnm0/e;

    new-instance v2, Liq1/d$b;

    invoke-direct {v2, v3, v1}, Liq1/d$b;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Liq1/d$c;

    invoke-direct {v1, v0, p2, p0, p1}, Liq1/d$c;-><init>(Lec3/l;ZLiq1/d;La12/a;)V

    return-object v1
.end method

.method private final j(Lpm0/a$c;Ljava/lang/String;)Liq1/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Liq1/f;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Liq1/f;

    new-instance v2, Liq1/e$d;

    invoke-direct {v2, p2}, Liq1/e$d;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v2, v1, v0, v1}, Liq1/f;-><init>(Liq1/e;Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    new-instance p1, Liq1/f;

    sget-object p2, Liq1/e$c;->a:Liq1/e$c;

    invoke-direct {p1, p2, v1, v0, v1}, Liq1/f;-><init>(Liq1/e;Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    new-instance v0, Ll83/k;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Liq1/d$e;

    invoke-direct {v1, p0, v2}, Liq1/d$e;-><init>(Liq1/d;Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Liq1/d$d;

    invoke-direct {p1, v2, p0}, Liq1/d$d;-><init>(Lq83/d;Liq1/d;)V

    invoke-static {v3, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Liq1/f;

    sget-object v1, Liq1/e$a;->a:Liq1/e$a;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Liq1/f;-><init>(Liq1/e;Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Liq1/d$f;

    invoke-direct {v1, v2}, Liq1/d$f;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
