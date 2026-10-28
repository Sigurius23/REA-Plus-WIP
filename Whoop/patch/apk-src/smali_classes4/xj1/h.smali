.class public final Lxj1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010#R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lxj1/h;",
        "",
        "Lor2/a0;",
        "fileManager",
        "Landroid/content/Context;",
        "context",
        "Lz92/a;",
        "userInfoAccessor",
        "Ltr2/n;",
        "logger",
        "Lq83/j;",
        "ioContext",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lor2/a0;Landroid/content/Context;Lz92/a;Ltr2/n;Lq83/j;Lzr2/a;)V",
        "",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lud3/a1;",
        "responseBody",
        "Ljava/io/File;",
        "f",
        "(Lud3/a1;Lq83/d;)Ljava/lang/Object;",
        "file",
        "Ll83/a0;",
        "d",
        "(Ljava/io/File;)V",
        "a",
        "Lor2/a0;",
        "b",
        "Landroid/content/Context;",
        "c",
        "Lz92/a;",
        "Ltr2/n;",
        "Lq83/j;",
        "Lzr2/a;",
        "health-monitor_release"
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
.field private final a:Lor2/a0;

.field private final b:Landroid/content/Context;

.field private final c:Lz92/a;

.field private final d:Ltr2/n;

.field private final e:Lq83/j;

.field private final f:Lzr2/a;


# direct methods
.method public constructor <init>(Lor2/a0;Landroid/content/Context;Lz92/a;Ltr2/n;Lq83/j;Lzr2/a;)V
    .locals 1

    const-string v0, "fileManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxj1/h;->a:Lor2/a0;

    iput-object p2, p0, Lxj1/h;->b:Landroid/content/Context;

    iput-object p3, p0, Lxj1/h;->c:Lz92/a;

    iput-object p4, p0, Lxj1/h;->d:Ltr2/n;

    iput-object p5, p0, Lxj1/h;->e:Lq83/j;

    iput-object p6, p0, Lxj1/h;->f:Lzr2/a;

    return-void
.end method

.method public static final synthetic a(Lxj1/h;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lxj1/h;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lxj1/h;)Lor2/a0;
    .locals 0

    iget-object p0, p0, Lxj1/h;->a:Lor2/a0;

    return-object p0
.end method

.method public static final synthetic c(Lxj1/h;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lxj1/h;->d:Ltr2/n;

    return-object p0
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lxj1/h$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxj1/h$a;

    iget v1, v0, Lxj1/h$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxj1/h$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxj1/h$a;

    invoke-direct {v0, p0, p1}, Lxj1/h$a;-><init>(Lxj1/h;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lxj1/h$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxj1/h$a;->y:I

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

    iget-object p1, p0, Lxj1/h;->c:Lz92/a;

    iput v3, v0, Lxj1/h$a;->y:I

    invoke-interface {p1, v0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    const-string p1, ""

    :cond_5
    sget-object v0, Lor2/u;->b:Lor2/u$a;

    iget-object v1, p0, Lxj1/h;->f:Lzr2/a;

    invoke-interface {v1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v1

    const-string v2, "MMMM dd, yyyy"

    invoke-virtual {v0, v1, v2}, Lor2/u$a;->c(Lorg/joda/time/DateTime;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lxj1/h;->b:Landroid/content/Context;

    sget v2, Luj1/a;->e:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lxj1/h;->b:Landroid/content/Context;

    sget v4, Luj1/a;->c:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v1, p1, v1, v0}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, ".pdf"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final d(Ljava/io/File;)V
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxj1/h;->a:Lor2/a0;

    invoke-virtual {v0, p1}, Lor2/a0;->e(Ljava/io/File;)V

    return-void
.end method

.method public final f(Lud3/a1;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/a1;",
            "Lq83/d<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lxj1/h;->e:Lq83/j;

    new-instance v1, Lxj1/h$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lxj1/h$b;-><init>(Lxj1/h;Lud3/a1;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
