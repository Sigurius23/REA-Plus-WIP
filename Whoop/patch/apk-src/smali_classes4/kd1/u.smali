.class public final Lkd1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd1/u$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J(\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lkd1/u;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lud3/l0;",
        "okHttpClient",
        "Lsr2/y;",
        "urlProvider",
        "<init>",
        "(Landroid/content/Context;Lud3/l0;Lsr2/y;)V",
        "",
        "url",
        "Ljava/io/File;",
        "i",
        "(Ljava/lang/String;)Ljava/io/File;",
        "l",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lhy0/p;",
        "type",
        "Ll83/n;",
        "j",
        "(Ljava/lang/String;Lhy0/p;Lq83/d;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "uri",
        "g",
        "(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lud3/l0;",
        "c",
        "Lsr2/y;",
        "h",
        "()Ljava/io/File;",
        "cacheDir",
        "d",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lkd1/u$a;

.field public static final e:I


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lud3/l0;

.field private final c:Lsr2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkd1/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkd1/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkd1/u;->d:Lkd1/u$a;

    const/16 v0, 0x8

    sput v0, Lkd1/u;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lud3/l0;Lsr2/y;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "okHttpClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd1/u;->a:Landroid/content/Context;

    iput-object p2, p0, Lkd1/u;->b:Lud3/l0;

    iput-object p3, p0, Lkd1/u;->c:Lsr2/y;

    return-void
.end method

.method public static synthetic a(B)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lkd1/u;->m(B)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lkd1/u;)Ljava/io/File;
    .locals 0

    invoke-direct {p0}, Lkd1/u;->h()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lkd1/u;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-direct {p0, p1}, Lkd1/u;->i(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lkd1/u;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lkd1/u;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lkd1/u;)Lud3/l0;
    .locals 0

    iget-object p0, p0, Lkd1/u;->b:Lud3/l0;

    return-object p0
.end method

.method public static final synthetic f(Lkd1/u;)Lsr2/y;
    .locals 0

    iget-object p0, p0, Lkd1/u;->c:Lsr2/y;

    return-object p0
.end method

.method private final h()Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkd1/u;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "pdf_preview_cache"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    return-object v0
.end method

.method private final i(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lkd1/u;->h()Ljava/io/File;

    move-result-object v1

    invoke-direct {p0, p1}, Lkd1/u;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, ".pdf"

    invoke-static {p1, v2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic k(Lkd1/u;Ljava/lang/String;Lhy0/p;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Lhy0/p;->ABSOLUTE:Lhy0/p;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lkd1/u;->j(Ljava/lang/String;Lhy0/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final l(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const-string v0, "digest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljp2/f;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ljp2/f;-><init>(I)V

    const/16 v1, 0x1e

    const-string v2, ""

    invoke-static {p1, v2, v0, v1}, Lm83/n;->C0([BLjava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final m(B)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%02x"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final g(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lkd1/u$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkd1/u$b;

    iget v1, v0, Lkd1/u$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkd1/u$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkd1/u$b;

    invoke-direct {v0, p0, p2}, Lkd1/u$b;-><init>(Lkd1/u;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkd1/u$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkd1/u$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkd1/u$b;->w:Ljava/lang/Object;

    check-cast p1, Landroid/net/Uri;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    sget-object p2, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lkd1/u$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lkd1/u$c;-><init>(Lkd1/u;Landroid/net/Uri;Lq83/d;)V

    iput-object v4, v0, Lkd1/u$b;->w:Ljava/lang/Object;

    iput v3, v0, Lkd1/u$b;->z:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final j(Ljava/lang/String;Lhy0/p;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhy0/p;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lkd1/u$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lkd1/u$d;

    iget v1, v0, Lkd1/u$d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkd1/u$d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkd1/u$d;

    invoke-direct {v0, p0, p3}, Lkd1/u$d;-><init>(Lkd1/u;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lkd1/u$d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkd1/u$d;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkd1/u$d;->x:Ljava/lang/Object;

    check-cast p1, Lhy0/p;

    iget-object p1, v0, Lkd1/u$d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    sget-object p3, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lkd1/u$e;

    const/4 v4, 0x0

    invoke-direct {v2, p2, p0, p1, v4}, Lkd1/u$e;-><init>(Lhy0/p;Lkd1/u;Ljava/lang/String;Lq83/d;)V

    iput-object v4, v0, Lkd1/u$d;->w:Ljava/lang/Object;

    iput-object v4, v0, Lkd1/u$d;->x:Ljava/lang/Object;

    iput v3, v0, Lkd1/u$d;->E:I

    invoke-static {p3, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method
