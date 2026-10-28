.class final Lng2/f$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lng2/f;-><init>(Lpg2/d;Lmg2/a;Lyg2/e;Lng2/b;Lgi1/b;Llm0/a;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lpg2/c;",
        "domain",
        "Lyg2/d;",
        "liveHrState",
        "Lw41/w;",
        "userLocation",
        "Llm0/c;",
        "bluetoothState",
        "Lrg2/c;",
        "<anonymous>",
        "(Lpg2/c;Lyg2/d;Lw41/w;Llm0/c;)Lrg2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.startactivity.presession.PreSessionWidgetViewModel$viewState$1"
    f = "PreSessionWidgetViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lng2/f;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lng2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng2/f;",
            "Lq83/d<",
            "-",
            "Lng2/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lng2/f$e;->F:Lng2/f;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lpg2/c;Lyg2/d;Lw41/w;Llm0/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg2/c;",
            "Lyg2/d;",
            "Lw41/w;",
            "Llm0/c;",
            "Lq83/d<",
            "-",
            "Lrg2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lng2/f$e;

    iget-object v1, p0, Lng2/f$e;->F:Lng2/f;

    invoke-direct {v0, v1, p5}, Lng2/f$e;-><init>(Lng2/f;Lq83/d;)V

    iput-object p1, v0, Lng2/f$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lng2/f$e;->y:Ljava/lang/Object;

    iput-object p3, v0, Lng2/f$e;->z:Ljava/lang/Object;

    iput-object p4, v0, Lng2/f$e;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lng2/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpg2/c;

    check-cast p2, Lyg2/d;

    check-cast p3, Lw41/w;

    check-cast p4, Llm0/c;

    check-cast p5, Lq83/d;

    invoke-virtual/range {p0 .. p5}, Lng2/f$e;->f(Lpg2/c;Lyg2/d;Lw41/w;Llm0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lng2/f$e;->x:Ljava/lang/Object;

    check-cast v0, Lpg2/c;

    iget-object v1, p0, Lng2/f$e;->y:Ljava/lang/Object;

    check-cast v1, Lyg2/d;

    iget-object v2, p0, Lng2/f$e;->z:Ljava/lang/Object;

    check-cast v2, Lw41/w;

    iget-object v3, p0, Lng2/f$e;->E:Ljava/lang/Object;

    check-cast v3, Llm0/c;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lng2/f$e;->w:I

    if-nez v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lng2/f$e;->F:Lng2/f;

    invoke-static {p1}, Lng2/f;->l(Lng2/f;)Lmg2/a;

    move-result-object p1

    sget-object v4, Llm0/c;->OFF:Llm0/c;

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1, v0, v1, v2, v3}, Lmg2/a;->d(Lpg2/c;Lyg2/d;Lw41/w;Z)Lrg2/c;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
