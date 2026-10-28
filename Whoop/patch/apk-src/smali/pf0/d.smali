.class public final Lpf0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpf0/b;",
        "Lpf0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ9\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00032\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpf0/d;",
        "Lod1/g;",
        "Lpf0/b;",
        "Lpf0/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "previousState",
        "action",
        "e",
        "(Lpf0/c;Lpf0/b;)Lpf0/c;",
        "",
        "manualRefresh",
        "",
        "source",
        "testCount",
        "initiallySelectedSegmentId",
        "Lec3/l;",
        "g",
        "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;",
        "cacheResult",
        "f",
        "(Lpm0/a$c;)Lpf0/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "advanced-labs-join_release"
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

    iput-object p1, p0, Lpf0/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lpf0/d;Lpf0/c;Lpf0/b;)Lpf0/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpf0/d;->e(Lpf0/c;Lpf0/b;)Lpf0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lpf0/d;Lpm0/a$c;)Lpf0/c;
    .locals 0

    invoke-direct {p0, p1}, Lpf0/d;->f(Lpm0/a$c;)Lpf0/c;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lpf0/c;Lpf0/b;)Lpf0/c;
    .locals 10

    instance-of v0, p2, Lpf0/b$b;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p2, Lpf0/b$a;

    if-eqz v0, :cond_1

    sget-object v3, Lpf0/a$a;->a:Lpf0/a$a;

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lpf0/c;->b(Lpf0/c;Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILjava/lang/Object;)Lpf0/c;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, p1

    instance-of p1, p2, Lpf0/b$c;

    if-eqz p1, :cond_2

    check-cast p2, Lpf0/b$c;

    invoke-virtual {p2}, Lpf0/b$c;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x37

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lpf0/c;->b(Lpf0/c;Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILjava/lang/Object;)Lpf0/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lpm0/a$c;)Lpf0/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;",
            ">;)",
            "Lpf0/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lpf0/c;

    sget-object v2, Lpf0/a$f;->a:Lpf0/a$f;

    const/16 v7, 0x3d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Lpf0/c;

    sget-object v3, Lpf0/a$d;->a:Lpf0/a$d;

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final g(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;

    invoke-direct {v0, p3, p4}, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "advancedlabsjoin"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lpf0/d;->a:Lnm0/e;

    new-instance v2, Lpf0/d$f;

    invoke-direct {v2, v3, v1}, Lpf0/d$f;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v5

    new-instance v4, Lpf0/d$g;

    move-object v8, p0

    move v7, p1

    move-object v6, p2

    move-object v10, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v10}, Lpf0/d$g;-><init>(Lec3/l;Ljava/lang/String;ZLpf0/d;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method

.method public static synthetic h(Lpf0/d;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const-string p4, ""

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lpf0/d;->g(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 11
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

    new-instance v0, Lpf0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lpf0/d$a;-><init>(Lq83/d;Lpf0/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lpf0/c;

    sget-object v4, Lpf0/a$c;->a:Lpf0/a$c;

    const/16 v9, 0x3d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lpf0/c;-><init>(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lpf0/d$d;

    invoke-direct {v0, p0, v1}, Lpf0/d$d;-><init>(Lpf0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
