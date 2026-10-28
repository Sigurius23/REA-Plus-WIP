.class final Lvo0/c$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo0/c;->n(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor"
    f = "CoachOnboardingInteractor.kt"
    l = {
        0x53,
        0x58
    }
    m = "loadSteps"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lvo0/c;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvo0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo0/c;",
            "Lq83/d<",
            "-",
            "Lvo0/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvo0/c$g;->F:Lvo0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvo0/c$g;->E:Ljava/lang/Object;

    iget p1, p0, Lvo0/c$g;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvo0/c$g;->G:I

    iget-object p1, p0, Lvo0/c$g;->F:Lvo0/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lvo0/c;->h(Lvo0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
