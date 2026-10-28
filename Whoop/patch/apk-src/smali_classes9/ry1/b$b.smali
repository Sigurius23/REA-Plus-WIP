.class final Lry1/b$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b;->v(Ljava/lang/String;Ldj0/u$a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor"
    f = "MfaChallengeInteractor.kt"
    l = {
        0x1d0,
        0x1db,
        0x213,
        0x214
    }
    m = "handleSetupVerification"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Z

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lry1/b;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lry1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lry1/b;",
            "Lq83/d<",
            "-",
            "Lry1/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lry1/b$b;->H:Lry1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lry1/b$b;->G:Ljava/lang/Object;

    iget p1, p0, Lry1/b$b;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lry1/b$b;->I:I

    iget-object p1, p0, Lry1/b$b;->H:Lry1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lry1/b;->i(Lry1/b;Ljava/lang/String;Ldj0/u$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
