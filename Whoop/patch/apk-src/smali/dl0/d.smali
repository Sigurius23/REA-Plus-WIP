.class public final Ldl0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ldl0/b;",
        "Ldl0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ#\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Ldl0/d;",
        "Lod1/g;",
        "Ldl0/b;",
        "Ldl0/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Liy1/c;",
        "metricWriter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Liy1/c;Ltr2/n;)V",
        "La12/a;",
        "parsedPath",
        "Lec3/l;",
        "i",
        "(La12/a;)Lec3/l;",
        "parsed",
        "m",
        "(La12/a;)Ldl0/c;",
        "Ldl0/e$b;",
        "reason",
        "Ll83/a0;",
        "l",
        "(La12/a;Ldl0/e$b;)V",
        "j",
        "",
        "httpStatusCode",
        "k",
        "(I)Ldl0/e$b;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Liy1/c;",
        "c",
        "Ltr2/n;",
        "bot_release"
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

.field private final b:Liy1/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Liy1/c;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldl0/d;->a:Lnm0/e;

    iput-object p2, p0, Ldl0/d;->b:Liy1/c;

    iput-object p3, p0, Ldl0/d;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Ldl0/d;La12/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ldl0/d;->i(La12/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ldl0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ldl0/d;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Ldl0/d;)Liy1/c;
    .locals 0

    iget-object p0, p0, Ldl0/d;->b:Liy1/c;

    return-object p0
.end method

.method public static final synthetic f(Ldl0/d;I)Ldl0/e$b;
    .locals 0

    invoke-direct {p0, p1}, Ldl0/d;->k(I)Ldl0/e$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ldl0/d;La12/a;Ldl0/e$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ldl0/d;->l(La12/a;Ldl0/e$b;)V

    return-void
.end method

.method public static final synthetic h(Ldl0/d;La12/a;)Ldl0/c;
    .locals 0

    invoke-direct {p0, p1}, Ldl0/d;->m(La12/a;)Ldl0/c;

    move-result-object p0

    return-object p0
.end method

.method private final i(La12/a;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/bot/domain/chatminiarchwidget/GetMiniArchWidgetRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/bot/domain/chatminiarchwidget/GetMiniArchWidgetRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "FormCompletionRefreshScope"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Ldl0/d;->a:Lnm0/e;

    new-instance v2, Ldl0/d$a;

    invoke-direct {v2, v3, v1}, Ldl0/d$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Ldl0/d$b;

    invoke-direct {v1, v0, p0, p1}, Ldl0/d$b;-><init>(Lec3/l;Ldl0/d;La12/a;)V

    return-object v1
.end method

.method private final j(La12/a;Ldl0/e$b;)V
    .locals 3

    sget-object v0, Ldl0/e;->a:Ldl0/e;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldl0/e;->d(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Ldl0/e;->c(La12/a;)Ll83/k;

    move-result-object p1

    iget-object v1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ldl0/e$a;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, p0, Ldl0/d;->b:Liy1/c;

    invoke-virtual {v0, p2, v1, p1}, Ldl0/e;->b(Ldl0/e$b;Ldl0/e$a;Ljava/lang/String;)Ljy1/a;

    move-result-object p1

    invoke-interface {v2, p1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method private final k(I)Ldl0/e$b;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Ldl0/e$b;->NETWORK:Ldl0/e$b;

    return-object p1

    :cond_0
    const/16 v0, 0x1f4

    if-gt v0, p1, :cond_1

    const/16 v1, 0x258

    if-ge p1, v1, :cond_1

    sget-object p1, Ldl0/e$b;->SERVER:Ldl0/e$b;

    return-object p1

    :cond_1
    const/16 v1, 0x190

    if-gt v1, p1, :cond_2

    if-ge p1, v0, :cond_2

    sget-object p1, Ldl0/e$b;->BAD_REQUEST:Ldl0/e$b;

    return-object p1

    :cond_2
    sget-object p1, Ldl0/e$b;->UNKNOWN:Ldl0/e$b;

    return-object p1
.end method

.method private final l(La12/a;Ldl0/e$b;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Ldl0/d;->j(La12/a;Ldl0/e$b;)V

    iget-object v0, p0, Ldl0/d;->b:Liy1/c;

    sget-object v1, Ldl0/e;->a:Ldl0/e;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Ldl0/e;->f(Ljava/lang/String;Ldl0/e$b;)Ljy1/a;

    move-result-object p1

    invoke-interface {v0, p1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method private final m(La12/a;)Ldl0/c;
    .locals 4

    iget-object v0, p0, Ldl0/d;->c:Ltr2/n;

    invoke-virtual {p1}, La12/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unsupported widget type. Path: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "CMAW"

    invoke-interface {v0, v3, v1, v2}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Ldl0/c;

    new-instance v1, Ldl0/a$d;

    invoke-virtual {p1}, La12/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ldl0/a$d;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v1, p1, v2, p1}, Ldl0/c;-><init>(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    new-instance v0, Ldl0/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ldl0/d$c;-><init>(Lq83/d;Ldl0/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
