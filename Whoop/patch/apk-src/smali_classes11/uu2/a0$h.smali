.class final synthetic Luu2/a0$h;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luu2/a0;-><init>(Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lfu2/i;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V
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

    const-string v6, "reduce(Lcom/whoop/weightlifting/feature/builder/details/ExerciseDetailsViewState;Lcom/whoop/weightlifting/feature/builder/details/ExerciseDetailsEvent$ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v2, 0x0

    const/4 v1, 0x3

    const-class v3, Luu2/a0;

    const-string v5, "reduce"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Luu2/b0;Luu2/c$h;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luu2/b0;",
            "Luu2/c$h;",
            "Lq83/d<",
            "-",
            "Luu2/b0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Luu2/a0;

    invoke-static {v0, p1, p2, p3}, Luu2/a0;->o(Luu2/a0;Luu2/b0;Luu2/c$h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luu2/b0;

    check-cast p2, Luu2/c$h;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Luu2/a0$h;->a(Luu2/b0;Luu2/c$h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
