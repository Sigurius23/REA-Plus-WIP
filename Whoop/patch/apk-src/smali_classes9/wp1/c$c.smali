.class final Lwp1/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwp1/c;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor"
    f = "SymptomPatternsInteractor.kt"
    l = {
        0x39
    }
    m = "fetchPregnancy"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lwp1/c;

.field z:I


# direct methods
.method public constructor <init>(Lwp1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp1/c;",
            "Lq83/d<",
            "-",
            "Lwp1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwp1/c$c;->y:Lwp1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwp1/c$c;->x:Ljava/lang/Object;

    iget p1, p0, Lwp1/c$c;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwp1/c$c;->z:I

    iget-object p1, p0, Lwp1/c$c;->y:Lwp1/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lwp1/c;->e(Lwp1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
