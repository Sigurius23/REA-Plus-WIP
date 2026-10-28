.class final Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->j(Lq83/d;)Ljava/lang/Object;
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
        0x19,
        0x26,
        0x29
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->H:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->G:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    iget-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->H:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
