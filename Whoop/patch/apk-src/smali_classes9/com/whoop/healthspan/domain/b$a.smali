.class final Lcom/whoop/healthspan/domain/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/healthspan/domain/b;->k(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.healthspan.domain.HealthspanInteractor"
    f = "HealthspanInteractor.kt"
    l = {
        0x70
    }
    m = "buildHealthspanDomainResult"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcom/whoop/healthspan/domain/b;

.field G:I

.field w:Ljava/lang/Object;

.field x:Z

.field y:Z

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/healthspan/domain/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthspan/domain/b;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/healthspan/domain/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/healthspan/domain/b$a;->F:Lcom/whoop/healthspan/domain/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/whoop/healthspan/domain/b$a;->E:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/healthspan/domain/b$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/healthspan/domain/b$a;->G:I

    iget-object p1, p0, Lcom/whoop/healthspan/domain/b$a;->F:Lcom/whoop/healthspan/domain/b;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lcom/whoop/healthspan/domain/b;->c(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
