.class final Lg72/c$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg72/c;->j(ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor"
    f = "SageOnboardingInteractor.kt"
    l = {
        0x3c,
        0x3e
    }
    m = "fetchData"
    v = 0x2
.end annotation


# instance fields
.field w:Z

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lg72/c;

.field z:I


# direct methods
.method public constructor <init>(Lg72/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg72/c;",
            "Lq83/d<",
            "-",
            "Lg72/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg72/c$b;->y:Lg72/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg72/c$b;->x:Ljava/lang/Object;

    iget p1, p0, Lg72/c$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg72/c$b;->z:I

    iget-object p1, p0, Lg72/c$b;->y:Lg72/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lg72/c;->c(Lg72/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
