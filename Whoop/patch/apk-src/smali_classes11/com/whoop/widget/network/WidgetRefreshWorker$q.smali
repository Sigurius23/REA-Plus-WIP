.class final Lcom/whoop/widget/network/WidgetRefreshWorker$q;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/network/WidgetRefreshWorker;->E(Lq83/d;)Ljava/lang/Object;
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
        0xb0,
        0xb3,
        0xb7,
        0xbc,
        0xbc,
        0xbe
    }
    m = "updateHealthspanWidget"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/widget/network/WidgetRefreshWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/network/WidgetRefreshWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/network/WidgetRefreshWorker$q;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->z:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    iget-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->z:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-static {p1, p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->q(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
