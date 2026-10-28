.class final Lvk2/d$c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk2/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lvk2/b;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lvk2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2$3"
    f = "TrackSessionStateHolder.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lvk2/d;


# direct methods
.method public constructor <init>(Lvk2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk2/d;",
            "Lq83/d<",
            "-",
            "Lvk2/d$c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvk2/d$c$c;->y:Lvk2/d;

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

    new-instance v0, Lvk2/d$c$c;

    iget-object v1, p0, Lvk2/d$c$c;->y:Lvk2/d;

    invoke-direct {v0, v1, p2}, Lvk2/d$c$c;-><init>(Lvk2/d;Lq83/d;)V

    iput-object p1, v0, Lvk2/d$c$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lvk2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lvk2/d$c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk2/d$c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk2/d$c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvk2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk2/d$c$c;->f(Lvk2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvk2/d$c$c;->x:Ljava/lang/Object;

    check-cast v0, Lvk2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvk2/d$c$c;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvk2/d$c$c;->y:Lvk2/d;

    invoke-static {p1}, Lvk2/d;->m(Lvk2/d;)Lec3/p1;

    move-result-object p1

    iget-object v1, p0, Lvk2/d$c$c;->y:Lvk2/d;

    invoke-static {v1}, Lvk2/d;->b(Lvk2/d;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lvk2/b;->j(J)Lmk2/l;

    move-result-object v0

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
