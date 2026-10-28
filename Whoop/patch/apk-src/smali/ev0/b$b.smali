.class final Lev0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lev0/b;-><init>(Ltr2/n;Lbc3/c0;Ltd1/b;Lzr2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lev0/b$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lev0/a;",
        "currentCount",
        "Ltd1/e;",
        "strapStatus",
        "<anonymous>",
        "(Lev0/a;Ltd1/e;)Lev0/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityanalytics.strap.status.StrapDisconnectMonitor$strapDisconnectedFlow$1"
    f = "StrapDisconnectMonitor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lev0/b;


# direct methods
.method public constructor <init>(Lev0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lev0/b;",
            "Lq83/d<",
            "-",
            "Lev0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lev0/b$b;->z:Lev0/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lev0/a;Ltd1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lev0/a;",
            "Ltd1/e;",
            "Lq83/d<",
            "-",
            "Lev0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lev0/b$b;

    iget-object v1, p0, Lev0/b$b;->z:Lev0/b;

    invoke-direct {v0, v1, p3}, Lev0/b$b;-><init>(Lev0/b;Lq83/d;)V

    iput-object p1, v0, Lev0/b$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lev0/b$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lev0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lev0/a;

    check-cast p2, Ltd1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lev0/b$b;->f(Lev0/a;Ltd1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lev0/b$b;->x:Ljava/lang/Object;

    check-cast v0, Lev0/a;

    iget-object v1, p0, Lev0/b$b;->y:Ljava/lang/Object;

    check-cast v1, Ltd1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lev0/b$b;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lev0/b$b$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p1, p1, v2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 v2, 0x3

    if-eq p1, v2, :cond_0

    invoke-static {v0, v1}, Lev0/c;->c(Lev0/a;Ltd1/e;)Lev0/a;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lev0/b$b;->z:Lev0/b;

    invoke-static {p1, v0}, Lev0/b;->c(Lev0/b;Lev0/a;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lev0/c;->d(Lev0/a;J)Lev0/a;

    move-result-object p1

    invoke-static {p1, v1}, Lev0/c;->c(Lev0/a;Ltd1/e;)Lev0/a;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lev0/b$b;->z:Lev0/b;

    invoke-static {p1}, Lev0/b;->a(Lev0/b;)Lzr2/a;

    move-result-object p1

    invoke-interface {p1}, Lzr2/a;->b()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lev0/c;->b(Lev0/a;J)Lev0/a;

    move-result-object p1

    invoke-static {p1}, Lev0/c;->a(Lev0/a;)Lev0/a;

    move-result-object p1

    invoke-static {p1, v1}, Lev0/c;->c(Lev0/a;Ltd1/e;)Lev0/a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
