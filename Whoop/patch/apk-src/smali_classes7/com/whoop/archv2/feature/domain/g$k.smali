.class final synthetic Lcom/whoop/archv2/feature/domain/g$k;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->r(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/m;"
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

    const-string v6, "performActionForLanes(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;"

    const/4 v2, 0x0

    const/4 v1, 0x2

    const-class v3, Lcom/whoop/archv2/feature/domain/g;

    const-string v5, "performActionForLanes"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/navigation/models/ApiRequest;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/feature/domain/g;

    invoke-static {v0, p1, p2}, Lcom/whoop/archv2/feature/domain/g;->m(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    check-cast p2, Lcom/whoop/navigation/models/ApiRequest;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$k;->a(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
