.class public final Lr60/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lr60/b;",
        "Lr60/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ3\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00032\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lr60/d;",
        "Lod1/g;",
        "Lr60/b;",
        "Lr60/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "previousState",
        "action",
        "e",
        "(Lr60/c;Lr60/b;)Lr60/c;",
        "",
        "achievementType",
        "source",
        "",
        "manualRefresh",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/achievements/domain/models/AchievementsResponse;",
        "cacheResult",
        "f",
        "(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lr60/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "achievements_release"
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

    iput-object p1, p0, Lr60/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lr60/d;Lr60/c;Lr60/b;)Lr60/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lr60/d;->e(Lr60/c;Lr60/b;)Lr60/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lr60/d;Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lr60/c;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr60/d;->f(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lr60/c;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lr60/c;Lr60/b;)Lr60/c;
    .locals 0

    return-object p1
.end method

.method private final f(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lr60/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/achievements/domain/models/AchievementsResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lr60/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lr60/c;

    sget-object v1, Lr60/a$d;->a:Lr60/a$d;

    const/16 v8, 0x72

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v9}, Lr60/c;-><init>(Lr60/a;Lcom/whoop/achievements/domain/models/AchievementsResponse;Ljava/lang/String;Ljava/lang/String;ZZLu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    move-object v3, p2

    move-object v4, p3

    new-instance v1, Lr60/c;

    sget-object v2, Lr60/a$c;->a:Lr60/a$c;

    const/16 v9, 0x72

    const/4 v10, 0x0

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lr60/c;-><init>(Lr60/a;Lcom/whoop/achievements/domain/models/AchievementsResponse;Ljava/lang/String;Ljava/lang/String;ZZLu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final g(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/achievements/domain/GetAchievementsRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/achievements/domain/GetAchievementsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "achievements_"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lr60/d;->a:Lnm0/e;

    new-instance v2, Lr60/d$f;

    invoke-direct {v2, v3, v1}, Lr60/d$f;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v5

    new-instance v4, Lr60/d$g;

    move-object v9, p0

    move-object v6, p1

    move-object v7, p2

    move v8, p3

    invoke-direct/range {v4 .. v9}, Lr60/d$g;-><init>(Lec3/l;Ljava/lang/String;Ljava/lang/String;ZLr60/d;)V

    return-object v4
.end method

.method public static synthetic h(Lr60/d;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lr60/d;->g(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 12
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

    new-instance v0, Lr60/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lr60/d$a;-><init>(Lq83/d;Lr60/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lr60/c;

    sget-object v3, Lr60/a$b;->a:Lr60/a$b;

    const/16 v10, 0x7e

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lr60/c;-><init>(Lr60/a;Lcom/whoop/achievements/domain/models/AchievementsResponse;Ljava/lang/String;Ljava/lang/String;ZZLu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lr60/d$d;

    invoke-direct {v0, p0, v1}, Lr60/d$d;-><init>(Lr60/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
