.class final synthetic Lto1/e$f;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lto1/e;->e(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
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

    const-string v6, "accumulate(Lcom/whoop/hormonalinsights/menstrualcycleinsights/presentation/reducers/MciOverviewViewStateReducer$AccumulatedState;Lcom/whoop/hormonalinsights/menstrualcycleinsights/presentation/MciOverviewViewState;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/presentation/reducers/MciOverviewViewStateReducer$AccumulatedState;"

    const/4 v2, 0x4

    const/4 v1, 0x3

    const-class v3, Lto1/e;

    const-string v5, "accumulate"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lto1/e$a;Lso1/c0;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lto1/e$a;",
            "Lso1/c0;",
            "Lq83/d<",
            "-",
            "Lto1/e$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lto1/e;

    invoke-static {v0, p1, p2, p3}, Lto1/e;->a(Lto1/e;Lto1/e$a;Lso1/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lto1/e$a;

    check-cast p2, Lso1/c0;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lto1/e$f;->a(Lto1/e$a;Lso1/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
