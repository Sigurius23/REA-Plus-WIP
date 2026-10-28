.class public final Ln92/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Ln92/d;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "whoopUriParser",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "<init>",
        "(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V",
        "",
        "html",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "messageContent",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;)V",
        "Liy1/c;",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "c",
        "Lj92/t;",
        "Lyb3/p;",
        "d",
        "Lyb3/p;",
        "regex",
        "app_prodStandardRelease"
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
.field private final a:Liy1/c;

.field private final b:Lcom/whoop/domain/model/WhoopUriParser;

.field private final c:Lj92/t;

.field private final d:Lyb3/p;


# direct methods
.method public constructor <init>(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopUriParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topPrivateDomainHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln92/d;->a:Liy1/c;

    .line 3
    iput-object p2, p0, Ln92/d;->b:Lcom/whoop/domain/model/WhoopUriParser;

    .line 4
    iput-object p3, p0, Ln92/d;->c:Lj92/t;

    .line 5
    new-instance p1, Lyb3/p;

    .line 6
    sget-object p2, Lyb3/q;->x:Lyb3/q;

    invoke-static {p2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    .line 7
    const-string p3, "<a\\b(?=[^>]*\\bclass\\s*=\\s*\"cta-button\")(?=[^>]*\\bhref\\s*=\\s*\"([^\"]+)\")[^>]*>"

    invoke-direct {p1, p3, p2}, Lyb3/p;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    iput-object p1, p0, Ln92/d;->d:Lyb3/p;

    return-void
.end method

.method public synthetic constructor <init>(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    sget-object p2, Lcom/whoop/domain/model/WhoopUriParser;->Companion:Lcom/whoop/domain/model/WhoopUriParser$Companion;

    invoke-virtual {p2}, Lcom/whoop/domain/model/WhoopUriParser$Companion;->parser()Lcom/whoop/domain/model/WhoopUriParser;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 9
    new-instance p3, Lj92/t;

    invoke-direct {p3}, Lj92/t;-><init>()V

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ln92/d;-><init>(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln92/d;->d:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    check-cast p1, Lyb3/l;

    invoke-virtual {p1, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 9

    const-string v0, "messageContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln92/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string v0, "unparseable"

    goto :goto_0

    :cond_0
    sget-object v0, Ln92/b;->q:Ln92/b$a;

    invoke-virtual {v0, p1}, Ln92/b$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljy1/a;

    const-string v2, "scheme:"

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ln92/h;->d:Ln92/h$a;

    iget-object v3, p0, Ln92/d;->c:Lj92/t;

    iget-object v4, p0, Ln92/d;->b:Lcom/whoop/domain/model/WhoopUriParser;

    invoke-virtual {v2, v3, v4, p1}, Ln92/h$a;->a(Lj92/t;Lcom/whoop/domain/model/WhoopUriParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "intent:"

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "iterable.inapp.display"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Ln92/d;->a:Liy1/c;

    invoke-interface {p1, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
