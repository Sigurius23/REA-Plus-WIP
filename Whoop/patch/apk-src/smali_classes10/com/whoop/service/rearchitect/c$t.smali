.class final Lcom/whoop/service/rearchitect/c$t;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c;->S0(IIJLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.rearchitect.WhoopStrap"
    f = "WhoopStrap.kt"
    l = {
        0x41f
    }
    m = "sendHighFreqHistorySyncCommand"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/service/rearchitect/c;

.field F:I

.field w:I

.field x:I

.field y:J

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/rearchitect/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/rearchitect/c$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$t;->E:Lcom/whoop/service/rearchitect/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$t;->z:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/service/rearchitect/c$t;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/service/rearchitect/c$t;->F:I

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$t;->E:Lcom/whoop/service/rearchitect/c;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/service/rearchitect/c;->S0(IIJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
