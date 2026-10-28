.class final Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->p(JLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.pendingsave.SaveActivityWorker"
    f = "SaveActivityWorker.kt"
    l = {
        0x3f
    }
    m = "removePendingSave"
    v = 0x2
.end annotation


# instance fields
.field w:J

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->y:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->x:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->z:I

    iget-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->y:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->l(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
