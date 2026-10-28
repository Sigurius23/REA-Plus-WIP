.class public final Lnu1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lnu1/b;",
        "Lnu1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lnu1/d;",
        "Lod1/g;",
        "Lnu1/b;",
        "Lnu1/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Llu1/a;",
        "analytics",
        "<init>",
        "(Lnm0/e;Llu1/a;)V",
        "previousState",
        "action",
        "f",
        "(Lnu1/c;Lnu1/b;)Lnu1/c;",
        "",
        "path",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Llu1/a;",
        "last-night-sleep_release"
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

.field private final b:Llu1/a;


# direct methods
.method public constructor <init>(Lnm0/e;Llu1/a;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnu1/d;->a:Lnm0/e;

    iput-object p2, p0, Lnu1/d;->b:Llu1/a;

    return-void
.end method

.method public static final synthetic c(Lnu1/d;)Llu1/a;
    .locals 0

    iget-object p0, p0, Lnu1/d;->b:Llu1/a;

    return-object p0
.end method

.method public static final synthetic d(Lnu1/d;Lnu1/c;Lnu1/b;)Lnu1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lnu1/d;->f(Lnu1/c;Lnu1/b;)Lnu1/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lnu1/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lnu1/d;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lnu1/c;Lnu1/b;)Lnu1/c;
    .locals 9

    instance-of v0, p2, Lnu1/b$c;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lnu1/c;->f()Lnu1/g;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnu1/g;->b()Lmc1/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    check-cast p2, Lnu1/b$c;

    invoke-virtual {p2}, Lnu1/b$c;->b()Lmc1/b;

    move-result-object v2

    if-ne v0, v2, :cond_1

    :goto_1
    move-object v5, v1

    goto :goto_2

    :cond_1
    new-instance v1, Lnu1/g;

    invoke-virtual {p2}, Lnu1/b$c;->b()Lmc1/b;

    move-result-object v0

    invoke-virtual {p2}, Lnu1/b$c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, v0, p2}, Lnu1/g;-><init>(Lmc1/b;Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lnu1/c;->b(Lnu1/c;Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILjava/lang/Object;)Lnu1/c;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v0, p1

    instance-of p1, p2, Lnu1/b$d;

    if-eqz p1, :cond_3

    return-object v0

    :cond_3
    instance-of p1, p2, Lnu1/b$b;

    if-eqz p1, :cond_6

    check-cast p2, Lnu1/b$b;

    invoke-virtual {p2}, Lnu1/b$b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Lnu1/b$b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Lnu1/b$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lnu1/b$b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p2}, Lnu1/b$b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p2}, Lnu1/b$b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_4
    move-object v3, p1

    invoke-virtual {p2}, Lnu1/b$b;->b()Ly81/e;

    move-result-object v6

    new-instance v1, Lnu1/f;

    invoke-direct/range {v1 .. v6}, Lnu1/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly81/e;)V

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v4, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lnu1/c;->b(Lnu1/c;Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILjava/lang/Object;)Lnu1/c;

    move-result-object p1

    return-object p1

    :cond_5
    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lnu1/c;->b(Lnu1/c;Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILjava/lang/Object;)Lnu1/c;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v0
.end method

.method private final g(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/lastnightsleep/domain/GetLastNightSleepRequest;

    invoke-virtual {v0}, La12/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, La12/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/whoop/lastnightsleep/domain/GetLastNightSleepRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v0, La6/u;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v1, "home"

    const-string v2, "cycle"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lnu1/d;->a:Lnm0/e;

    new-instance v2, Lnu1/d$f;

    invoke-direct {v2, v3, v1}, Lnu1/d$f;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lnu1/d$g;

    invoke-direct {v1, v0, p0, p1}, Lnu1/d$g;-><init>(Lec3/l;Lnu1/d;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
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

    new-instance v0, Lnu1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lnu1/d$a;-><init>(Lq83/d;Lnu1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lnu1/c;

    sget-object v3, Lnu1/a$b;->a:Lnu1/a$b;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lnu1/c;-><init>(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lnu1/d$d;

    invoke-direct {v0, p0, v1}, Lnu1/d$d;-><init>(Lnu1/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
