.class final Lrd2/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd2/c;->e(Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.shepherd.feature.detail.domain.ShepherdHistoryDetailInteractor"
    f = "ShepherdHistoryDetailInteractor.kt"
    l = {
        0x4b,
        0x51
    }
    m = "clearHistoryByDate"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lrd2/c;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrd2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd2/c;",
            "Lq83/d<",
            "-",
            "Lrd2/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrd2/c$a;->H:Lrd2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lrd2/c$a;->G:Ljava/lang/Object;

    iget p1, p0, Lrd2/c$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrd2/c$a;->I:I

    iget-object p1, p0, Lrd2/c$a;->H:Lrd2/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lrd2/c;->a(Lrd2/c;Lrd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
