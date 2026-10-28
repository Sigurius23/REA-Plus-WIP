.class public final Lwk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lwk1/b;",
        "",
        "Lcom/whoop/helpcenter/data/network/HelpCenterApi;",
        "api",
        "Lqw2/c;",
        "actionInteractor",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/helpcenter/data/network/HelpCenterApi;Lqw2/c;Ltr2/n;)V",
        "argument",
        "Lec3/l;",
        "Lwk1/c;",
        "f",
        "(Ljava/lang/Object;)Lec3/l;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lwk1/a;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/helpcenter/data/network/HelpCenterApi;",
        "b",
        "Lqw2/c;",
        "c",
        "Ltr2/n;",
        "help-center_release"
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
.field private final a:Lcom/whoop/helpcenter/data/network/HelpCenterApi;

.field private final b:Lqw2/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/helpcenter/data/network/HelpCenterApi;Lqw2/c;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwk1/b;->a:Lcom/whoop/helpcenter/data/network/HelpCenterApi;

    iput-object p2, p0, Lwk1/b;->b:Lqw2/c;

    iput-object p3, p0, Lwk1/b;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lwk1/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lwk1/b;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lwk1/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lwk1/b;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lwk1/b;Ljava/lang/Object;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lwk1/b;->f(Ljava/lang/Object;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lwk1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwk1/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwk1/b$a;

    iget v1, v0, Lwk1/b$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwk1/b$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwk1/b$a;

    invoke-direct {v0, p0, p1}, Lwk1/b$a;-><init>(Lwk1/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lwk1/b$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwk1/b$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lwk1/b;->a:Lcom/whoop/helpcenter/data/network/HelpCenterApi;

    iput v3, v0, Lwk1/b$a;->y:I

    invoke-interface {p1, v0}, Lcom/whoop/helpcenter/data/network/HelpCenterApi;->getLandingScreenData(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;

    new-instance v0, Lwk1/c$b;

    const/4 v1, 0x0

    invoke-static {p1, v1, v3, v1}, Lyk1/b;->c(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Ljb1/a;ILjava/lang/Object;)Lxk1/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lwk1/c$b;-><init>(Lxk1/e;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_2
    iget-object v0, p0, Lwk1/b;->c:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Error fetching Help Center Landing Screen data"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lwk1/c$a;->a:Lwk1/c$a;

    return-object p1
.end method

.method private final f(Ljava/lang/Object;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-static {p1}, Lyk1/a;->b(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/whoop/design/item/DesignItemInteraction;

    if-nez v0, :cond_0

    iget-object v0, p0, Lwk1/b;->c:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Ignoring call tile event without an action: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    sget-object p1, Lec3/k;->w:Lec3/k;

    return-object p1

    :cond_1
    iget-object p1, p0, Lwk1/b;->b:Lqw2/c;

    new-instance v1, Lqw2/f;

    invoke-direct {v1, v0}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance v0, La6/u;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lwk1/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lwk1/b$d;-><init>(Lec3/l;Lq83/d;Lwk1/b;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
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

    new-instance v0, Lwk1/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lwk1/b$b;-><init>(Lq83/d;Lwk1/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
