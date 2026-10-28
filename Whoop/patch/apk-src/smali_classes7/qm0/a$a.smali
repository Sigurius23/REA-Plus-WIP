.class final Lqm0/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqm0/a;->b(Lne3/l;Ljava/lang/reflect/Type;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "T",
        "Lbc3/c0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.cache.decoder.CacheDecoder$deserialize$2"
    f = "CacheDecoder.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lne3/l;

.field final synthetic y:Lqm0/a;

.field final synthetic z:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lne3/l;Lqm0/a;Ljava/lang/reflect/Type;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne3/l;",
            "Lqm0/a;",
            "Ljava/lang/reflect/Type;",
            "Lq83/d<",
            "-",
            "Lqm0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqm0/a$a;->x:Lne3/l;

    iput-object p2, p0, Lqm0/a$a;->y:Lqm0/a;

    iput-object p3, p0, Lqm0/a$a;->z:Ljava/lang/reflect/Type;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lqm0/a$a;

    iget-object v0, p0, Lqm0/a$a;->x:Lne3/l;

    iget-object v1, p0, Lqm0/a$a;->y:Lqm0/a;

    iget-object v2, p0, Lqm0/a$a;->z:Ljava/lang/reflect/Type;

    invoke-direct {p1, v0, v1, v2, p2}, Lqm0/a$a;-><init>(Lne3/l;Lqm0/a;Ljava/lang/reflect/Type;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lqm0/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqm0/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqm0/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqm0/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lqm0/a$a;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lqm0/a$a;->x:Lne3/l;

    iget-object v1, p0, Lqm0/a$a;->y:Lqm0/a;

    iget-object v2, p0, Lqm0/a$a;->z:Ljava/lang/reflect/Type;

    :try_start_0
    invoke-virtual {p1, v0}, Lne3/h;->l1(Lne3/l;)V

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Lne3/h;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lqm0/a;->a(Lqm0/a;)Lu82/a;

    move-result-object v1

    invoke-interface {v1, v0, v2}, Lu82/a;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
