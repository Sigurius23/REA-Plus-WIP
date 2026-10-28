.class final Lt72/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt72/c;->e(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.sanguine.domain.SanguineWaitlistBiomarkerListInteractor"
    f = "SanguineWaitlistBiomarkerListInteractor.kt"
    l = {
        0x19
    }
    m = "fetchData"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lt72/c;

.field y:I


# direct methods
.method public constructor <init>(Lt72/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt72/c;",
            "Lq83/d<",
            "-",
            "Lt72/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt72/c$a;->x:Lt72/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt72/c$a;->w:Ljava/lang/Object;

    iget p1, p0, Lt72/c$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt72/c$a;->y:I

    iget-object p1, p0, Lt72/c$a;->x:Lt72/c;

    invoke-static {p1, p0}, Lt72/c;->c(Lt72/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
