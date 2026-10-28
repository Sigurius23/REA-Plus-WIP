.class final Lpg2/d$l;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg2/d;->o(Lpg2/c;Lpg2/d$a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor"
    f = "PreSessionWidgetInteractor.kt"
    l = {
        0x63
    }
    m = "reduceInternal"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lpg2/d;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpg2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg2/d;",
            "Lq83/d<",
            "-",
            "Lpg2/d$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpg2/d$l;->H:Lpg2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpg2/d$l;->G:Ljava/lang/Object;

    iget p1, p0, Lpg2/d$l;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpg2/d$l;->I:I

    iget-object p1, p0, Lpg2/d$l;->H:Lpg2/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lpg2/d;->g(Lpg2/d;Lpg2/c;Lpg2/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
