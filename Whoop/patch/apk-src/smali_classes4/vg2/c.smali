.class public final Lvg2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvg2/a;",
        "Lvg2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u0016*\u0008\u0012\u0004\u0012\u00020\u00120\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lvg2/c;",
        "Lod1/g;",
        "Lvg2/a;",
        "Lvg2/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lwm0/a;",
        "scopeCoordinator",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lwm0/a;Ltr2/n;)V",
        "",
        "path",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "h",
        "(Lpm0/a;)Lvg2/b;",
        "Lpm0/a$b;",
        "Lvg2/b$a;",
        "i",
        "(Lpm0/a$b;)Lvg2/b$a;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lwm0/a;",
        "c",
        "Ltr2/n;",
        "start-activity_release"
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

.field private final b:Lwm0/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lwm0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvg2/c;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Lvg2/c;->b:Lwm0/a;

    .line 4
    iput-object p3, p0, Lvg2/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lwm0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "TargetsCardInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvg2/c;-><init>(Lnm0/e;Lwm0/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lvg2/c;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lvg2/c;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvg2/c;)Lnm0/e;
    .locals 0

    iget-object p0, p0, Lvg2/c;->a:Lnm0/e;

    return-object p0
.end method

.method public static final synthetic e(Lvg2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvg2/c;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lvg2/c;Lpm0/a;)Lvg2/b;
    .locals 0

    invoke-direct {p0, p1}, Lvg2/c;->h(Lpm0/a;)Lvg2/b;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;)Lec3/l;
    .locals 5
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

    iget-object v1, p0, Lvg2/c;->b:Lwm0/a;

    invoke-virtual {v1}, Lwm0/a;->a()Lec3/t1;

    move-result-object v1

    new-instance v2, Lvg2/c$a;

    invoke-direct {v2, v1}, Lvg2/c$a;-><init>(Lec3/l;)V

    new-instance v1, Lvg2/c$c;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lvg2/c$c;-><init>(Lq83/d;)V

    new-instance v4, Lec3/a0;

    invoke-direct {v4, v1, v2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    new-instance v1, Lvg2/c$b;

    invoke-direct {v1, v3, v0, p1, p0}, Lvg2/c$b;-><init>(Lq83/d;La12/a;Ljava/lang/String;Lvg2/c;)V

    invoke-static {v4, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method

.method private final h(Lpm0/a;)Lvg2/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lvg2/b;"
        }
    .end annotation

    instance-of v0, p1, Lpm0/a$e;

    if-eqz v0, :cond_0

    sget-object p1, Lvg2/b$b;->a:Lvg2/b$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lpm0/a$a;

    if-eqz v0, :cond_1

    new-instance v0, Lvg2/b$c;

    check-cast p1, Lpm0/a$a;

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {v0, p1}, Lvg2/b$c;-><init>(Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lpm0/a$b;

    if-eqz v0, :cond_2

    check-cast p1, Lpm0/a$b;

    invoke-direct {p0, p1}, Lvg2/c;->i(Lpm0/a$b;)Lvg2/b$a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final i(Lpm0/a$b;)Lvg2/b$a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$b<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lvg2/b$a;"
        }
    .end annotation

    iget-object v0, p0, Lvg2/c;->c:Ltr2/n;

    invoke-virtual {p1}, Lpm0/a$b;->b()I

    move-result v1

    invoke-virtual {p1}, Lpm0/a$b;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "TargetsCard fetch failed ["

    const-string v4, "]: "

    invoke-static {v1, v3, v4, v2}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lvg2/b$a;

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {v0, p1}, Lvg2/b$a;-><init>(Z)V

    return-object v0
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

    new-instance v0, Lvg2/c$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvg2/c$g;-><init>(Lq83/d;Lvg2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
