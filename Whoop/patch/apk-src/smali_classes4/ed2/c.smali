.class public final Led2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Led2/a;",
        "Led2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Led2/c;",
        "Lod1/g;",
        "Led2/a;",
        "Led2/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcd2/b;",
        "shareAnalyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lcd2/b;Ltr2/n;)V",
        "",
        "path",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;)Lec3/l;",
        "Lcom/whoop/share/model/ShareResponse;",
        "data",
        "Ll83/a0;",
        "h",
        "(Lcom/whoop/share/model/ShareResponse;)V",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lcd2/b;",
        "c",
        "Ltr2/n;",
        "share_release"
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

.field private final b:Lcd2/b;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lcd2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareAnalyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Led2/c;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Led2/c;->b:Lcd2/b;

    .line 4
    iput-object p3, p0, Led2/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lcd2/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ShareInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Led2/c;-><init>(Lnm0/e;Lcd2/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Led2/c;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Led2/c;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Led2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Led2/c;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Led2/c;)Lcd2/b;
    .locals 0

    iget-object p0, p0, Led2/c;->b:Lcd2/b;

    return-object p0
.end method

.method public static final synthetic f(Led2/c;Lcom/whoop/share/model/ShareResponse;)V
    .locals 0

    invoke-direct {p0, p1}, Led2/c;->h(Lcom/whoop/share/model/ShareResponse;)V

    return-void
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

    new-instance v1, Lcom/whoop/share/domain/GetShareRequest;

    invoke-virtual {v0}, La12/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, La12/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/whoop/share/domain/GetShareRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v0, La6/u;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Led2/c;->a:Lnm0/e;

    new-instance v3, Led2/c$a;

    invoke-direct {v3, v2, v1}, Led2/c$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Led2/c$b;

    invoke-direct {v1, v0, p0, p1}, Led2/c$b;-><init>(Lec3/l;Led2/c;Ljava/lang/String;)V

    return-object v1
.end method

.method private final h(Lcom/whoop/share/model/ShareResponse;)V
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getAssets()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Led2/c;->b:Lcd2/b;

    sget-object v0, Lfd2/c;->SUCCESS:Lfd2/c;

    invoke-virtual {p1, v0}, Lcd2/b;->c(Lfd2/c;)V

    return-void

    :cond_0
    iget-object v0, p0, Led2/c;->c:Ltr2/n;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getAssets()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v2, "title="

    const-string v3, ", assets="

    invoke-static {p1, v2, v1, v3}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "null"

    :cond_2
    const-string v1, "Asset build failed: response summary="

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Led2/c;->b:Lcd2/b;

    sget-object v0, Lfd2/c;->FAILURE:Lfd2/c;

    invoke-virtual {p1, v0}, Lcd2/b;->c(Lfd2/c;)V

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

    new-instance v0, Led2/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Led2/c$c;-><init>(Lq83/d;Led2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
