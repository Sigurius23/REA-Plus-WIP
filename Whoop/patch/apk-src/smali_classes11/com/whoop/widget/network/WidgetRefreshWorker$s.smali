.class final Lcom/whoop/widget/network/WidgetRefreshWorker$s;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/network/WidgetRefreshWorker;->G(Lq83/d;)Ljava/lang/Object;
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
        0x80,
        0x84,
        0x88,
        0x8e,
        0x9c
    }
    m = "updateStressWidget"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lcom/whoop/widget/network/WidgetRefreshWorker;

.field K:I

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
            "Lcom/whoop/widget/network/WidgetRefreshWorker$s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->J:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->I:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    iget-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->J:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-static {p1, p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->r(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
