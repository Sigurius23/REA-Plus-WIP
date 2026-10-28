.class final Lcom/whoop/widget/network/WidgetRefreshWorker$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/network/WidgetRefreshWorker;->C(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.widget.network.WidgetRefreshWorker"
    f = "WidgetRefreshWorker.kt"
    l = {
        0xf3,
        0xf4,
        0xf5,
        0xfe,
        0xff,
        0x105,
        0x106,
        0x10b,
        0x10c,
        0x111,
        0x112,
        0x117,
        0x118,
        0x120,
        0x121,
        0x122,
        0x123,
        0x124
    }
    m = "refreshApiAndUpdateWidgets"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:F

.field M:I

.field N:I

.field O:I

.field synthetic P:Ljava/lang/Object;

.field final synthetic Q:Lcom/whoop/widget/network/WidgetRefreshWorker;

.field R:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/network/WidgetRefreshWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/network/WidgetRefreshWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->Q:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->P:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    iget-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->Q:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-static {p1, p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->o(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
