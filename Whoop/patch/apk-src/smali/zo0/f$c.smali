.class final synthetic Lzo0/f$c;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo0/f;-><init>(Lso0/a;Lzo0/h;Lap0/a;Lzo0/d;Lpo0/a;Lbc3/c0;)V
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

    const-string v6, "accumulate(Lcom/whoop/coacheverywherecommon/models/ProactiveAnimationState;Lcom/whoop/coacheverywhere/domain/ProactiveResult;)Lcom/whoop/coacheverywherecommon/models/ProactiveAnimationState;"

    const/4 v2, 0x4

    const/4 v1, 0x3

    const-class v3, Lzo0/f;

    const-string v5, "accumulate"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lep0/e;Lro0/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep0/e;",
            "Lro0/b;",
            "Lq83/d<",
            "-",
            "Lep0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lzo0/f;

    invoke-static {v0, p1, p2, p3}, Lzo0/f;->a(Lzo0/f;Lep0/e;Lro0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lep0/e;

    check-cast p2, Lro0/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzo0/f$c;->a(Lep0/e;Lro0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
