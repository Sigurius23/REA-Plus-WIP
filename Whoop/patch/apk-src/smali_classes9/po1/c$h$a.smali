.class final Lpo1/c$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpo1/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Lu02/a;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)Lu02/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$unHideCycle$responses$1$1$1"
    f = "MciCyclesInteractor.kt"
    l = {
        0x50
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lpo1/c;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpo1/c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpo1/c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpo1/c$h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpo1/c$h$a;->x:Lpo1/c;

    iput-object p2, p0, Lpo1/c$h$a;->y:Ljava/lang/String;

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

    new-instance p1, Lpo1/c$h$a;

    iget-object v0, p0, Lpo1/c$h$a;->x:Lpo1/c;

    iget-object v1, p0, Lpo1/c$h$a;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lpo1/c$h$a;-><init>(Lpo1/c;Ljava/lang/String;Lq83/d;)V

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
            "Lu02/a<",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lpo1/c$h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpo1/c$h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpo1/c$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpo1/c$h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpo1/c$h$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lpo1/c$h$a;->x:Lpo1/c;

    invoke-static {p1}, Lpo1/c;->e(Lpo1/c;)Ltr2/n;

    move-result-object p1

    new-instance v5, Lpo1/c$h$a$a;

    iget-object v3, p0, Lpo1/c$h$a;->x:Lpo1/c;

    iget-object v4, p0, Lpo1/c$h$a;->y:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v4, v6}, Lpo1/c$h$a$a;-><init>(Lpo1/c;Ljava/lang/String;Lq83/d;)V

    iput v2, p0, Lpo1/c$h$a;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v6, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
