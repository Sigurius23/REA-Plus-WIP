.class final Lcom/whoop/service/rearchitect/c$u;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c;->Y(ZJLq83/d;)Ljava/lang/Object;
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
        0x45e
    }
    m = "sendHistoricalImuStreamCommand"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Z

.field x:J

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/rearchitect/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/rearchitect/c$u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$u;->z:Lcom/whoop/service/rearchitect/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$u;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/service/rearchitect/c$u;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/service/rearchitect/c$u;->E:I

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$u;->z:Lcom/whoop/service/rearchitect/c;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lcom/whoop/service/rearchitect/c;->Y(ZJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
