.class final Lkx0/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkx0/a;->l(Lec3/f2;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForMidSyncUpload$1"
    f = "HistorySyncRouterImpl.kt"
    l = {
        0xa2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field final synthetic z:Lkx0/a;


# direct methods
.method public constructor <init>(Lec3/f2;Lkx0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lkx0/a;",
            "Lq83/d<",
            "-",
            "Lkx0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkx0/a$b;->y:Lec3/f2;

    iput-object p2, p0, Lkx0/a$b;->z:Lkx0/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lkx0/a$b;

    iget-object v0, p0, Lkx0/a$b;->y:Lec3/f2;

    iget-object v1, p0, Lkx0/a$b;->z:Lkx0/a;

    invoke-direct {p1, v0, v1, p2}, Lkx0/a$b;-><init>(Lec3/f2;Lkx0/a;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkx0/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkx0/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkx0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkx0/a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkx0/a$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkx0/a$b;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/e0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lkx0/a$b;->y:Lec3/f2;

    new-instance v3, Lkx0/a$b$a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lkx0/a$b$a;-><init>(Lq83/d;)V

    new-instance v5, Lec3/a0;

    const/4 v6, 0x4

    invoke-direct {v5, v6, v3, v1}, Lec3/a0;-><init>(ILc93/m;Lec3/l;)V

    new-instance v1, Lkx0/a$b$b;

    iget-object v3, p0, Lkx0/a$b;->z:Lkx0/a;

    invoke-direct {v1, p1, v3}, Lkx0/a$b$b;-><init>(Lkotlin/jvm/internal/e0;Lkx0/a;)V

    iput-object v4, p0, Lkx0/a$b;->w:Ljava/lang/Object;

    iput v2, p0, Lkx0/a$b;->x:I

    invoke-virtual {v5, v1, p0}, Lec3/a0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
