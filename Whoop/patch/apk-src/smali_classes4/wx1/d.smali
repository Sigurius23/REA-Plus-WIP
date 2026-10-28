.class public final Lwx1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lwx1/d;",
        "",
        "Lcom/whoop/data/remote/api/FileDownloaderApi;",
        "fileDownloaderApi",
        "Lor2/a0;",
        "fileManager",
        "Ltr2/n;",
        "logger",
        "Lq83/j;",
        "ioContext",
        "<init>",
        "(Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Ltr2/n;Lq83/j;)V",
        "",
        "labelUrl",
        "Lu02/a;",
        "Lud3/a1;",
        "e",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "responseBody",
        "fileName",
        "Ljava/io/File;",
        "f",
        "(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
        "button",
        "d",
        "(Lcom/whoop/membership/returns/domain/models/DownloadButton;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/data/remote/api/FileDownloaderApi;",
        "b",
        "Lor2/a0;",
        "c",
        "Ltr2/n;",
        "Lq83/j;",
        "membership_release"
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
.field private final a:Lcom/whoop/data/remote/api/FileDownloaderApi;

.field private final b:Lor2/a0;

.field private final c:Ltr2/n;

.field private final d:Lq83/j;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Ltr2/n;Lq83/j;)V
    .locals 1

    const-string v0, "fileDownloaderApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwx1/d;->a:Lcom/whoop/data/remote/api/FileDownloaderApi;

    iput-object p2, p0, Lwx1/d;->b:Lor2/a0;

    iput-object p3, p0, Lwx1/d;->c:Ltr2/n;

    iput-object p4, p0, Lwx1/d;->d:Lq83/j;

    return-void
.end method

.method public static final synthetic a(Lwx1/d;)Lcom/whoop/data/remote/api/FileDownloaderApi;
    .locals 0

    iget-object p0, p0, Lwx1/d;->a:Lcom/whoop/data/remote/api/FileDownloaderApi;

    return-object p0
.end method

.method public static final synthetic b(Lwx1/d;)Lor2/a0;
    .locals 0

    iget-object p0, p0, Lwx1/d;->b:Lor2/a0;

    return-object p0
.end method

.method public static final synthetic c(Lwx1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lwx1/d;->c:Ltr2/n;

    return-object p0
.end method

.method private final e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "+",
            "Lud3/a1;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lwx1/d;->c:Ltr2/n;

    new-instance v4, Lwx1/d$b;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, v2}, Lwx1/d$b;-><init>(Lwx1/d;Ljava/lang/String;Lq83/d;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Failed to download pdf"

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final f(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/a1;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lwx1/d;->d:Lq83/j;

    new-instance v1, Lwx1/d$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lwx1/d$c;-><init>(Lwx1/d;Ljava/lang/String;Lud3/a1;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final d(Lcom/whoop/membership/returns/domain/models/DownloadButton;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwx1/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwx1/d$a;

    iget v1, v0, Lwx1/d$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwx1/d$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwx1/d$a;

    invoke-direct {v0, p0, p2}, Lwx1/d$a;-><init>(Lwx1/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwx1/d$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwx1/d$a;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lwx1/d$a;->y:Ljava/lang/Object;

    check-cast p1, Lud3/a1;

    iget-object p1, v0, Lwx1/d$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lwx1/d$a;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/membership/returns/domain/models/DownloadButton;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwx1/d$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lwx1/d$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/membership/returns/domain/models/DownloadButton;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/DownloadButton;->getText()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "toLowerCase(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, " "

    const-string v7, "_"

    invoke-static {p2, v2, v7, v3}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    const-string v2, "whoop_"

    const-string v7, ".pdf"

    invoke-static {v2, p2, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/membership/returns/domain/models/DownloadButton;->getUrl()Ljava/lang/String;

    move-result-object p1

    iput-object v6, v0, Lwx1/d$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lwx1/d$a;->x:Ljava/lang/Object;

    iput v5, v0, Lwx1/d$a;->G:I

    invoke-direct {p0, p1, v0}, Lwx1/d;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_1
    check-cast p2, Lu02/a;

    invoke-static {p2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lud3/a1;

    if-eqz p2, :cond_6

    iput-object v6, v0, Lwx1/d$a;->w:Ljava/lang/Object;

    iput-object v6, v0, Lwx1/d$a;->x:Ljava/lang/Object;

    iput-object v6, v0, Lwx1/d$a;->y:Ljava/lang/Object;

    iput v3, v0, Lwx1/d$a;->z:I

    iput v4, v0, Lwx1/d$a;->G:I

    invoke-direct {p0, p2, p1, v0}, Lwx1/d;->f(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Ljava/io/File;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v6
.end method
