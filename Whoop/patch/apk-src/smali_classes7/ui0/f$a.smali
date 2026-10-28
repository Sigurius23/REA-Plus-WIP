.class final Lui0/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui0/f;->c(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Landroidx/compose/runtime/Composer;I)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.view.CyclingProgressModalKt$CyclingProgressModal$2$1"
    f = "CyclingProgressModal.kt"
    l = {
        0x20
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/a1;

.field w:J

.field x:I

.field final synthetic y:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Ljava/util/List;Lp1/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lp1/a1;",
            "Lq83/d<",
            "-",
            "Lui0/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lui0/f$a;->y:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    iput-object p2, p0, Lui0/f$a;->z:Ljava/util/List;

    iput-object p3, p0, Lui0/f$a;->E:Lp1/a1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lui0/f$a;

    iget-object v0, p0, Lui0/f$a;->y:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    iget-object v1, p0, Lui0/f$a;->z:Ljava/util/List;

    iget-object v2, p0, Lui0/f$a;->E:Lp1/a1;

    invoke-direct {p1, v0, v1, v2, p2}, Lui0/f$a;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Ljava/util/List;Lp1/a1;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lui0/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui0/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui0/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui0/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lui0/f$a;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lui0/f$a;->w:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lui0/f$a;->y:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;->getMessageCycleIntervalSeconds()F

    move-result p1

    const/16 v1, 0x3e8

    int-to-float v1, v1

    mul-float/2addr p1, v1

    float-to-long v3, p1

    const-wide/16 v5, 0x64

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :goto_0
    iput-wide v3, p0, Lui0/f$a;->w:J

    iput v2, p0, Lui0/f$a;->x:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    iget-object p1, p0, Lui0/f$a;->E:Lp1/a1;

    invoke-static {p1}, Lui0/f;->h(Lp1/a1;)I

    move-result v1

    add-int/2addr v1, v2

    iget-object v5, p0, Lui0/f$a;->z:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    rem-int/2addr v1, v5

    invoke-static {p1, v1}, Lui0/f;->i(Lp1/a1;I)V

    goto :goto_0
.end method
