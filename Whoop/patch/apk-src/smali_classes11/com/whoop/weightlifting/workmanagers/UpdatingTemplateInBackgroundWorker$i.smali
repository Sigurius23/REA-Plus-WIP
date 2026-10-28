.class final Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker"
    f = "UpdatingTemplateInBackgroundWorker.kt"
    l = {
        0x40,
        0x49,
        0x4e,
        0x52,
        0x58
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;->G:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;->F:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;->H:I

    iget-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$i;->G:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
