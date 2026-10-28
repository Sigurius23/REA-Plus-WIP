.class final Lwu0/f$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu0/f;->e(Z)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Z)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityNotifications.offbody.WhoopStrapOffBodyNotifierImpl$createOffBodyNotifier$3"
    f = "WhoopStrapOffBodyNotifierImpl.kt"
    l = {
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Z

.field final synthetic F:Lwu0/f;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lwu0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu0/f;",
            "Lq83/d<",
            "-",
            "Lwu0/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu0/f$e;->F:Lwu0/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lwu0/f$e;

    iget-object v1, p0, Lwu0/f$e;->F:Lwu0/f;

    invoke-direct {v0, v1, p2}, Lwu0/f$e;-><init>(Lwu0/f;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lwu0/f$e;->E:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwu0/f$e;->invoke(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lwu0/f$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwu0/f$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwu0/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-boolean v0, p0, Lwu0/f$e;->E:Z

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lwu0/f$e;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget v0, p0, Lwu0/f$e;->y:I

    iget-object v1, p0, Lwu0/f$e;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lwu0/f$e;->w:Ljava/lang/Object;

    check-cast v2, Lwu0/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwu0/f$e;->F:Lwu0/f;

    invoke-static {p1}, Lwu0/f;->b(Lwu0/f;)Lwu0/a;

    move-result-object v2

    xor-int/lit8 p1, v0, 0x1

    iget-object v4, p0, Lwu0/f$e;->F:Lwu0/f;

    invoke-static {v4}, Lwu0/f;->d(Lwu0/f;)J

    move-result-wide v4

    const/16 v6, 0x3e8

    int-to-long v6, v6

    div-long/2addr v4, v6

    const/16 v6, 0x3c

    int-to-long v6, v6

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lwu0/f$e;->F:Lwu0/f;

    invoke-static {v5}, Lwu0/f;->c(Lwu0/f;)Lci2/b;

    move-result-object v5

    invoke-interface {v5}, Lci2/b;->c()Lec3/f2;

    move-result-object v5

    iput-object v2, p0, Lwu0/f$e;->w:Ljava/lang/Object;

    iput-object v4, p0, Lwu0/f$e;->x:Ljava/lang/Object;

    iput-boolean v0, p0, Lwu0/f$e;->E:Z

    iput p1, p0, Lwu0/f$e;->y:I

    iput v3, p0, Lwu0/f$e;->z:I

    invoke-static {v5, p0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, v0

    move v0, p1

    move-object p1, v1

    move-object v1, v4

    :goto_0
    check-cast p1, Ljk0/d;

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljk0/d;->b()Lkk0/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lkk0/a;->d()B

    move-result p1

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, p1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_1

    :cond_3
    move-object v5, v4

    :goto_1
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v5, p0, Lwu0/f$e;->F:Lwu0/f;

    invoke-static {v5}, Lwu0/f;->c(Lwu0/f;)Lci2/b;

    move-result-object v5

    invoke-interface {v5}, Lci2/b;->b()Lec3/t1;

    move-result-object v5

    invoke-interface {v5}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljk0/d;

    if-eqz v5, :cond_4

    invoke-interface {v5}, Ljk0/d;->w0()Lst0/v;

    move-result-object v5

    if-eqz v5, :cond_4

    sget-object v4, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {v4, v5}, Lst0/v$a;->b(Lst0/v;)Ljava/lang/String;

    move-result-object v4

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v2, v1, p1, v4, v3}, Lwu0/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
