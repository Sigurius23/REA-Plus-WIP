.class final Lrw2/h$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrw2/h;->i(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler"
    f = "UpdateActionHandler.kt"
    l = {
        0x77
    }
    m = "attachMedia"
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

.field L:I

.field M:I

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lrw2/h;

.field P:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrw2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrw2/h;",
            "Lq83/d<",
            "-",
            "Lrw2/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrw2/h$c;->O:Lrw2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lrw2/h$c;->N:Ljava/lang/Object;

    iget p1, p0, Lrw2/h$c;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrw2/h$c;->P:I

    iget-object p1, p0, Lrw2/h$c;->O:Lrw2/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lrw2/h;->c(Lrw2/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
