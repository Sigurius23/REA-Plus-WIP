.class final synthetic Lpg2/d$j;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg2/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "reduceInternal(Lcom/whoop/startactivity/presession/domain/PreSessionWidgetDomainState;Lcom/whoop/startactivity/presession/domain/PreSessionWidgetInteractor$Internal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v2, 0x0

    const/4 v1, 0x3

    const-class v3, Lpg2/d;

    const-string v5, "reduceInternal"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lpg2/c;Lpg2/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg2/c;",
            "Lpg2/d$a;",
            "Lq83/d<",
            "-",
            "Lpg2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpg2/d;

    invoke-static {v0, p1, p2, p3}, Lpg2/d;->g(Lpg2/d;Lpg2/c;Lpg2/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpg2/c;

    check-cast p2, Lpg2/d$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lpg2/d$j;->a(Lpg2/c;Lpg2/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
