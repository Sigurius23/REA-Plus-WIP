.class final Lcom/whoop/widget/network/WidgetRefreshWorker$v;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/network/WidgetRefreshWorker;->j(Lq83/d;)Ljava/lang/Object;
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
        0x4f,
        0x50,
        0x52,
        0x53,
        0x54,
        0x55,
        0x56,
        0x59,
        0x5c
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lcom/whoop/widget/network/WidgetRefreshWorker;

.field H:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/network/WidgetRefreshWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/network/WidgetRefreshWorker$v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->G:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->F:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    iget-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->G:Lcom/whoop/widget/network/WidgetRefreshWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
