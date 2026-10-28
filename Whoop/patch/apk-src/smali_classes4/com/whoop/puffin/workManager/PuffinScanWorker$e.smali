.class final Lcom/whoop/puffin/workManager/PuffinScanWorker$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/puffin/workManager/PuffinScanWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.puffin.workManager.PuffinScanWorker"
    f = "PuffinScanWorker.kt"
    l = {
        0x28,
        0x33
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/puffin/workManager/PuffinScanWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/puffin/workManager/PuffinScanWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/workManager/PuffinScanWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/workManager/PuffinScanWorker$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->z:Lcom/whoop/puffin/workManager/PuffinScanWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    iget-object p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->z:Lcom/whoop/puffin/workManager/PuffinScanWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/puffin/workManager/PuffinScanWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
