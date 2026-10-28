.class final Ldv0/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv0/b;-><init>(Ltr2/n;Lyu0/f;Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "exception",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$realtimeDataFlow$3"
    f = "RealtimeGapDetector.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ldv0/b;


# direct methods
.method public constructor <init>(Ldv0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv0/b;",
            "Lq83/d<",
            "-",
            "Ldv0/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv0/b$a;->y:Ldv0/b;

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

    new-instance v0, Ldv0/b$a;

    iget-object v1, p0, Ldv0/b$a;->y:Ldv0/b;

    invoke-direct {v0, v1, p2}, Ldv0/b$a;-><init>(Ldv0/b;Lq83/d;)V

    iput-object p1, v0, Ldv0/b$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ldv0/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldv0/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldv0/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldv0/b$a;->f(Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ldv0/b$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldv0/b$a;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldv0/b$a;->y:Ldv0/b;

    invoke-static {p1}, Ldv0/b;->g(Ldv0/b;)Ltr2/n;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Caught an exception when trying to find gaps in realtime data"

    invoke-interface {p1, v2, v0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    instance-of p1, v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
