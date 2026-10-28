.class public final Lu62/b$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu62/b;->w(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
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
    c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor$startFetchRemoteDeviceConfigs$$inlined$flatMapLatest$1"
    f = "RemoteDeviceConfigInteractor.kt"
    l = {
        0xc2,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lu62/b;


# direct methods
.method public constructor <init>(Lq83/d;Lu62/b;J)V
    .locals 0

    iput-object p2, p0, Lu62/b$k;->z:Lu62/b;

    iput-wide p3, p0, Lu62/b$k;->E:J

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lvk0/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lu62/b$k;

    iget-object v1, p0, Lu62/b$k;->z:Lu62/b;

    iget-wide v2, p0, Lu62/b$k;->E:J

    invoke-direct {v0, p3, v1, v2, v3}, Lu62/b$k;-><init>(Lq83/d;Lu62/b;J)V

    iput-object p1, v0, Lu62/b$k;->x:Ljava/lang/Object;

    iput-object p2, v0, Lu62/b$k;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lu62/b$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lu62/b$k;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lu62/b$k;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lu62/b$k;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lu62/b$k;->H:Ljava/lang/Object;

    check-cast v1, Lvk0/k;

    iget-object v1, p0, Lu62/b$k;->G:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lu62/b$k;->F:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lu62/b$k;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lu62/b$k;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lu62/b$k;->y:Ljava/lang/Object;

    check-cast p1, Lvk0/k;

    invoke-static {p1}, Lvk0/f;->c(Lvk0/k;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    iget-object v3, p0, Lu62/b$k;->z:Lu62/b;

    invoke-virtual {v3}, Lu62/b;->h()Ltr2/n;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Task was "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v5, v6, [Lqr2/a$a;

    invoke-interface {v3, p1, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lu62/a;->FAIL:Lu62/a;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lu62/b$k;->z:Lu62/b;

    iget-wide v7, p0, Lu62/b$k;->E:J

    iput-object v4, p0, Lu62/b$k;->x:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->y:Ljava/lang/Object;

    iput-object v1, p0, Lu62/b$k;->F:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->G:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->H:Ljava/lang/Object;

    iput v6, p0, Lu62/b$k;->I:I

    iput v3, p0, Lu62/b$k;->w:I

    invoke-static {p1, v7, v8, p0}, Lu62/b;->d(Lu62/b;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object v4, p0, Lu62/b$k;->x:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->y:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->F:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->G:Ljava/lang/Object;

    iput-object v4, p0, Lu62/b$k;->H:Ljava/lang/Object;

    iput v2, p0, Lu62/b$k;->w:I

    invoke-static {v1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
