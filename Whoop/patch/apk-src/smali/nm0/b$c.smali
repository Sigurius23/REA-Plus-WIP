.class final Lnm0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnm0/b;->h(Lec3/l;Ls63/a;Lnm0/c;)Lec3/l;
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
        "ResponseT",
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
    c = "com.whoop.cache.api.ApiStream$mapRawApiBytesToTypedApiStreamResult$1$data$1"
    f = "ApiStream.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lnm0/b;

.field final synthetic y:Lu02/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu02/g<",
            "Lne3/l;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Ls63/a;


# direct methods
.method public constructor <init>(Lnm0/b;Lu02/g;Ls63/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnm0/b;",
            "Lu02/g<",
            "Lne3/l;",
            ">;",
            "Ls63/a;",
            "Lq83/d<",
            "-",
            "Lnm0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnm0/b$c;->x:Lnm0/b;

    iput-object p2, p0, Lnm0/b$c;->y:Lu02/g;

    iput-object p3, p0, Lnm0/b$c;->z:Ls63/a;

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

    new-instance p1, Lnm0/b$c;

    iget-object v0, p0, Lnm0/b$c;->x:Lnm0/b;

    iget-object v1, p0, Lnm0/b$c;->y:Lu02/g;

    iget-object v2, p0, Lnm0/b$c;->z:Ls63/a;

    invoke-direct {p1, v0, v1, v2, p2}, Lnm0/b$c;-><init>(Lnm0/b;Lu02/g;Ls63/a;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-TResponseT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnm0/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnm0/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnm0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lnm0/b$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lnm0/b$c;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnm0/b$c;->x:Lnm0/b;

    invoke-static {p1}, Lnm0/b;->a(Lnm0/b;)Lu82/a;

    move-result-object p1

    iget-object v0, p0, Lnm0/b$c;->y:Lu02/g;

    check-cast v0, Lu02/h;

    invoke-virtual {v0}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne3/l;

    invoke-virtual {v0}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnm0/b$c;->z:Ls63/a;

    iget-object v1, v1, Ls63/a;->b:Ljava/lang/reflect/Type;

    invoke-interface {p1, v0, v1}, Lu82/a;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
