.class final Lol1/b$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lol1/b;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
        "Lol1/a;",
        "<unused var>",
        "Lol1/c;",
        "action",
        "<anonymous>",
        "(Lol1/a;Lol1/c;)Lol1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$2"
    f = "ProcessNowInteractor.kt"
    l = {
        0x6c,
        0x75
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lol1/b;


# direct methods
.method public constructor <init>(Lol1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lol1/b;",
            "Lq83/d<",
            "-",
            "Lol1/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lol1/b$f;->y:Lol1/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lol1/a;Lol1/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lol1/a;",
            "Lol1/c;",
            "Lq83/d<",
            "-",
            "Lol1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lol1/b$f;

    iget-object v0, p0, Lol1/b$f;->y:Lol1/b;

    invoke-direct {p1, v0, p3}, Lol1/b$f;-><init>(Lol1/b;Lq83/d;)V

    iput-object p2, p1, Lol1/b$f;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lol1/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lol1/a;

    check-cast p2, Lol1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lol1/b$f;->f(Lol1/a;Lol1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lol1/b$f;->x:Ljava/lang/Object;

    check-cast v0, Lol1/c;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lol1/b$f;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lol1/c$a;

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lol1/b$f;->y:Lol1/b;

    invoke-static {p1}, Lol1/b;->f(Lol1/b;)Ldt0/e;

    move-result-object p1

    check-cast v0, Lol1/c$a;

    invoke-virtual {v0}, Lol1/c$a;->a()Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    move-result-object v0

    invoke-interface {p1, v0}, Ldt0/e;->a(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V

    iget-object p1, p0, Lol1/b$f;->y:Lol1/b;

    invoke-static {p1}, Lol1/b;->e(Lol1/b;)Lus0/f;

    move-result-object p1

    invoke-virtual {p1}, Lus0/f;->c()V

    iget-object p1, p0, Lol1/b$f;->y:Lol1/b;

    invoke-static {p1}, Lol1/b;->g(Lol1/b;)Lwm0/a;

    move-result-object p1

    iput-object v2, p0, Lol1/b$f;->x:Ljava/lang/Object;

    iput v4, p0, Lol1/b$f;->w:I

    invoke-static {p1, v2, p0, v4, v2}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    sget-object p1, Lol1/a$b;->a:Lol1/a$b;

    return-object p1

    :cond_4
    instance-of p1, v0, Lol1/c$c;

    if-eqz p1, :cond_5

    new-instance p1, Lol1/a$c;

    check-cast v0, Lol1/c$c;

    invoke-virtual {v0}, Lol1/c$c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {p1, v0}, Lol1/a$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_5
    instance-of p1, v0, Lol1/c$e;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lol1/b$f;->y:Lol1/b;

    invoke-static {p1}, Lol1/b;->g(Lol1/b;)Lwm0/a;

    move-result-object p1

    iput-object v0, p0, Lol1/b$f;->x:Ljava/lang/Object;

    iput v3, p0, Lol1/b$f;->w:I

    invoke-static {p1, v2, p0, v4, v2}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    :goto_2
    new-instance p1, Lol1/a$d;

    check-cast v0, Lol1/c$e;

    invoke-virtual {v0}, Lol1/c$e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lol1/c$e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lol1/a$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_7
    instance-of p1, v0, Lol1/c$d;

    if-eqz p1, :cond_8

    new-instance p1, Lol1/a$a;

    check-cast v0, Lol1/c$d;

    invoke-virtual {v0}, Lol1/c$d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lol1/c$d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lol1/c$d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {p1, v1, v2, v0}, Lol1/a$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_8
    sget-object p1, Lol1/c$b;->a:Lol1/c$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Lol1/a$b;->a:Lol1/a$b;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
