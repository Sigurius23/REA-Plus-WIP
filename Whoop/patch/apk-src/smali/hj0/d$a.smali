.class final Lhj0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj0/d;-><init>(Landroidx/lifecycle/g0;Lbc3/c0;)V
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.base.ApplicationLifecycle$appForegroundFlow$1"
    f = "ApplicationLifecycle.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lhj0/d;


# direct methods
.method public constructor <init>(Lhj0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj0/d;",
            "Lq83/d<",
            "-",
            "Lhj0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhj0/d$a;->z:Lhj0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lhj0/d;Lhj0/d$a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lhj0/d$a;->h(Lhj0/d;Lhj0/d$a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lhj0/d;Lhj0/d$a$c;)Ll83/a0;
    .locals 3

    invoke-static {p0}, Lhj0/d;->b(Lhj0/d;)Lbc3/c0;

    move-result-object v0

    new-instance v1, Lhj0/d$a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lhj0/d$a$b;-><init>(Lhj0/d;Lhj0/d$a$c;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lhj0/d$a;

    iget-object v1, p0, Lhj0/d$a;->z:Lhj0/d;

    invoke-direct {v0, v1, p2}, Lhj0/d$a;-><init>(Lhj0/d;Lq83/d;)V

    iput-object p1, v0, Lhj0/d$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lhj0/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhj0/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lhj0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lhj0/d$a;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lhj0/d$a;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lhj0/d$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lhj0/d$a;->w:Ljava/lang/Object;

    check-cast v0, Lhj0/d$a$c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lhj0/d$a$c;

    invoke-direct {p1, v0}, Lhj0/d$a$c;-><init>(Ldc3/u;)V

    iget-object v2, p0, Lhj0/d$a;->z:Lhj0/d;

    invoke-static {v2}, Lhj0/d;->b(Lhj0/d;)Lbc3/c0;

    move-result-object v2

    new-instance v4, Lhj0/d$a$a;

    iget-object v5, p0, Lhj0/d$a;->z:Lhj0/d;

    const/4 v6, 0x0

    invoke-direct {v4, v5, p1, v6}, Lhj0/d$a$a;-><init>(Lhj0/d;Lhj0/d$a$c;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v2, v6, v6, v4, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v2, p0, Lhj0/d$a;->z:Lhj0/d;

    new-instance v4, Lhj0/c;

    invoke-direct {v4, v2, p1}, Lhj0/c;-><init>(Lhj0/d;Lhj0/d$a$c;)V

    iput-object v6, p0, Lhj0/d$a;->y:Ljava/lang/Object;

    iput-object v6, p0, Lhj0/d$a;->w:Ljava/lang/Object;

    iput v3, p0, Lhj0/d$a;->x:I

    invoke-static {v0, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
