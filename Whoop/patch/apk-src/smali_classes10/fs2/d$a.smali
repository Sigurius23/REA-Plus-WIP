.class final Lfs2/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs2/d;-><init>(Lcom/whoop/videocall/api/HmsVideoCallApi;Lfs2/f;Ltr2/n;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lfs2/l;",
        "override",
        "Lfs2/b;",
        "phase",
        "<anonymous>",
        "(Lfs2/l;Lfs2/b;)Lfs2/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.videocall.manager.HmsVideoCallManager$callStateFlow$1"
    f = "HmsVideoCallManager.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfs2/d$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lfs2/l;Lfs2/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs2/l;",
            "Lfs2/b;",
            "Lq83/d<",
            "-",
            "Lfs2/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfs2/d$a;

    invoke-direct {v0, p3}, Lfs2/d$a;-><init>(Lq83/d;)V

    iput-object p1, v0, Lfs2/d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfs2/d$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfs2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfs2/l;

    check-cast p2, Lfs2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfs2/d$a;->f(Lfs2/l;Lfs2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfs2/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lfs2/l;

    iget-object v1, p0, Lfs2/d$a;->y:Ljava/lang/Object;

    check-cast v1, Lfs2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfs2/d$a;->w:I

    if-nez v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez v0, :cond_4

    if-nez v1, :cond_0

    sget-object p1, Lfs2/l$d;->a:Lfs2/l$d;

    return-object p1

    :cond_0
    sget-object p1, Lfs2/b$a;->a:Lfs2/b$a;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lfs2/l$f;->a:Lfs2/l$f;

    return-object p1

    :cond_1
    sget-object p1, Lfs2/b$c;->a:Lfs2/b$c;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lfs2/l$e;->a:Lfs2/l$e;

    return-object p1

    :cond_2
    instance-of p1, v1, Lfs2/b$b;

    if-eqz p1, :cond_3

    new-instance p1, Lfs2/l$c;

    check-cast v1, Lfs2/b$b;

    invoke-virtual {v1}, Lfs2/b$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lfs2/l$c;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
