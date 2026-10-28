.class final Lo52/f0$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo52/f0;-><init>(Lbc3/c0;Leq1/a;Lpv2/b;)V
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
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Ldq1/a;",
        "hrZones",
        "",
        "currentHeartRate",
        "Lpv2/a;",
        "<anonymous>",
        "(Ljava/util/List;I)Lpv2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.realtime.presentation.RealTimeStrainRangeViewModel$viewState$1"
    f = "RealTimeStrainRangeViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:I

.field final synthetic z:Lo52/f0;


# direct methods
.method public constructor <init>(Lo52/f0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo52/f0;",
            "Lq83/d<",
            "-",
            "Lo52/f0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo52/f0$c;->z:Lo52/f0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/util/List;ILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldq1/a;",
            ">;I",
            "Lq83/d<",
            "-",
            "Lpv2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lo52/f0$c;

    iget-object v1, p0, Lo52/f0$c;->z:Lo52/f0;

    invoke-direct {v0, v1, p3}, Lo52/f0$c;-><init>(Lo52/f0;Lq83/d;)V

    iput-object p1, v0, Lo52/f0$c;->x:Ljava/lang/Object;

    iput p2, v0, Lo52/f0$c;->y:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lo52/f0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lo52/f0$c;->f(Ljava/util/List;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lo52/f0$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget v1, p0, Lo52/f0$c;->y:I

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lo52/f0$c;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lo52/f0$c;->z:Lo52/f0;

    invoke-static {p1}, Lo52/f0;->g(Lo52/f0;)Lpv2/b;

    move-result-object p1

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v0, v2}, Lpv2/b;->d(Ljava/util/List;Ljava/lang/Integer;)Lpv2/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
