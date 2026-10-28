.class public final Lfl0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lfl0/h;",
        "",
        "Lfl0/g;",
        "fileSystemProvider",
        "Lq83/j;",
        "dispatcher",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lfl0/g;Lq83/j;Ltr2/n;)V",
        "Landroid/net/Uri;",
        "uri",
        "",
        "f",
        "(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;",
        "",
        "width",
        "height",
        "maxSize",
        "e",
        "(III)I",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "c",
        "(Landroid/graphics/Bitmap;)Ljava/lang/String;",
        "Lcom/whoop/bot/models/conversation/ImageUploadRequest;",
        "d",
        "a",
        "Lfl0/g;",
        "b",
        "Lq83/j;",
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
.field private final a:Lfl0/g;

.field private final b:Lq83/j;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lfl0/g;Lq83/j;Ltr2/n;)V
    .locals 1

    const-string v0, "fileSystemProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfl0/h;->a:Lfl0/g;

    .line 3
    iput-object p2, p0, Lfl0/h;->b:Lq83/j;

    .line 4
    iput-object p3, p0, Lfl0/h;->c:Ltr2/n;

    return-void
.end method

.method public constructor <init>(Lfl0/g;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    .line 6
    sget-object p2, Lkc3/d;->w:Lkc3/d;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 7
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ImageFileHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lfl0/h;-><init>(Lfl0/g;Lq83/j;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lfl0/h;)Lfl0/g;
    .locals 0

    iget-object p0, p0, Lfl0/h;->a:Lfl0/g;

    return-object p0
.end method

.method public static final synthetic b(Lfl0/h;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lfl0/h;->f(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lfl0/e;->a:Lfl0/e;

    invoke-virtual {v0, p1}, Lfl0/e;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final e(III)I
    .locals 2

    const/4 v0, 0x1

    :goto_0
    div-int v1, p1, v0

    if-gt v1, p3, :cond_1

    div-int v1, p2, v0

    if-le v1, p3, :cond_0

    goto :goto_1

    :cond_0
    return v0

    :cond_1
    :goto_1
    mul-int/lit8 v0, v0, 0x2

    goto :goto_0
.end method

.method private final f(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lfl0/h$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfl0/h$b;

    iget v1, v0, Lfl0/h$b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfl0/h$b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfl0/h$b;

    invoke-direct {v0, p0, p2}, Lfl0/h$b;-><init>(Lfl0/h;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfl0/h$b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfl0/h$b;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lfl0/h$b;->w:Ljava/lang/Object;

    check-cast p1, Landroid/net/Uri;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lfl0/h$b;->w:Ljava/lang/Object;

    check-cast p1, Landroid/net/Uri;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, Lfl0/h;->a:Lfl0/g;

    iput-object p1, v0, Lfl0/h$b;->w:Ljava/lang/Object;

    iput v5, v0, Lfl0/h$b;->G:I

    invoke-interface {p2, p1, v0}, Lfl0/g;->c(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ll83/k;

    iget-object v2, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const/16 v5, 0x400

    invoke-direct {p0, v2, p2, v5}, Lfl0/h;->e(III)I

    move-result v5

    iget-object v6, p0, Lfl0/h;->a:Lfl0/g;

    iput-object v3, v0, Lfl0/h$b;->w:Ljava/lang/Object;

    iput v2, v0, Lfl0/h$b;->x:I

    iput p2, v0, Lfl0/h$b;->y:I

    iput v5, v0, Lfl0/h$b;->z:I

    iput v4, v0, Lfl0/h$b;->G:I

    invoke-interface {v6, p1, v5, v0}, Lfl0/g;->a(Landroid/net/Uri;ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-direct {p0, p2}, Lfl0/h;->c(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_4
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lfl0/h;->c:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to convert uri to base64 "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3
.end method


# virtual methods
.method public final d(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/models/conversation/ImageUploadRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lfl0/h;->b:Lq83/j;

    new-instance v1, Lfl0/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lfl0/h$a;-><init>(Lfl0/h;Landroid/net/Uri;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
