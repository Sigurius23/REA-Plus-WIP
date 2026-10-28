.class public final Lzx0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lzx0/b;",
        "Lzx0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u00020\u0003*\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ1\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00032\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00132\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lzx0/d;",
        "Lod1/g;",
        "Lzx0/b;",
        "Lzx0/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lhf1/b;",
        "experimentsChecker",
        "<init>",
        "(Lnm0/e;Lhf1/b;)V",
        "Ltu1/a;",
        "state",
        "g",
        "(Lzx0/c;Ltu1/a;)Lzx0/c;",
        "",
        "pillar",
        "date",
        "",
        "manualRefresh",
        "Lec3/l;",
        "j",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/deepdive/domain/models/DeepDiveModels;",
        "cacheResult",
        "h",
        "(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzx0/c;",
        "i",
        "(Lq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lhf1/b;",
        "deep-dive_release"
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

.field private final b:Lhf1/b;


# direct methods
.method public constructor <init>(Lnm0/e;Lhf1/b;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experimentsChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzx0/d;->a:Lnm0/e;

    iput-object p2, p0, Lzx0/d;->b:Lhf1/b;

    return-void
.end method

.method public static final synthetic c(Lzx0/d;Lzx0/c;Ltu1/a;)Lzx0/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzx0/d;->g(Lzx0/c;Ltu1/a;)Lzx0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lzx0/d;Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzx0/c;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzx0/d;->h(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzx0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lzx0/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lzx0/d;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lzx0/d;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzx0/d;->j(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lzx0/c;Ltu1/a;)Lzx0/c;
    .locals 8

    new-instance v1, Lzx0/a$b;

    invoke-direct {v1, p2}, Lzx0/a$b;-><init>(Ltu1/a;)V

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lzx0/c;->b(Lzx0/c;Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILjava/lang/Object;)Lzx0/c;

    move-result-object p1

    return-object p1
.end method

.method private final h(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzx0/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/deepdive/domain/models/DeepDiveModels;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lzx0/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lzx0/c;

    new-instance v1, Lzx0/a$f;

    invoke-direct {v1, p2, p3}, Lzx0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Lzx0/c;

    new-instance v2, Lzx0/a$e;

    invoke-direct {v2, p2, p3}, Lzx0/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final i(Lq83/d;)Ljava/lang/Object;
    .locals 11
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

    instance-of v0, p1, Lzx0/d$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lzx0/d$f;

    iget v1, v0, Lzx0/d$f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzx0/d$f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzx0/d$f;

    invoke-direct {v0, p0, p1}, Lzx0/d$f;-><init>(Lzx0/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lzx0/d$f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzx0/d$f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzx0/d;->b:Lhf1/b;

    new-instance v4, Llf1/h;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Llf1/h;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v3, v0, Lzx0/d$f;->y:I

    invoke-interface {p1, v4, v0}, Lhf1/b;->f(Lhf1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    const-string v0, "test"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final j(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
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

    new-instance v0, Lcom/whoop/deepdive/domain/GetDeepDiveRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/deepdive/domain/GetDeepDiveRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "home"

    const-string v2, "cycle"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lzx0/d;->a:Lnm0/e;

    new-instance v2, Lzx0/d$g;

    invoke-direct {v2, v3, v1}, Lzx0/d$g;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v5

    new-instance v4, Lzx0/d$h;

    move-object v7, p0

    move-object v8, p1

    move-object v9, p2

    move v6, p3

    invoke-direct/range {v4 .. v9}, Lzx0/d$h;-><init>(Lec3/l;ZLzx0/d;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
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

    new-instance v0, Lzx0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lzx0/d$a;-><init>(Lq83/d;Lzx0/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lzx0/c;

    sget-object v3, Lzx0/a$d;->a:Lzx0/a$d;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lzx0/d$d;

    invoke-direct {v0, p0, v1}, Lzx0/d$d;-><init>(Lzx0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
