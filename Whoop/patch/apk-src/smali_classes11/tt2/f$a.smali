.class final Ltt2/f$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltt2/f;->h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weeklyplan.weeklyplan.domain.SummaryV2Interactor"
    f = "SummaryV2Interactor.kt"
    l = {
        0x37
    }
    m = "dismissSummary"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ltt2/f;

.field z:I


# direct methods
.method public constructor <init>(Ltt2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltt2/f;",
            "Lq83/d<",
            "-",
            "Ltt2/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltt2/f$a;->y:Ltt2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ltt2/f$a;->x:Ljava/lang/Object;

    iget p1, p0, Ltt2/f$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ltt2/f$a;->z:I

    iget-object p1, p0, Ltt2/f$a;->y:Ltt2/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ltt2/f;->c(Ltt2/f;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
