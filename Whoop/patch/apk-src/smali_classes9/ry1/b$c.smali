.class final Lry1/b$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry1/b;->w(Lry1/a;Ldj0/h$b;Lq83/d;)Ljava/lang/Object;
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
        0x89
    }
    m = "handleSignInSuccess"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lry1/b;


# direct methods
.method public constructor <init>(Lry1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lry1/b;",
            "Lq83/d<",
            "-",
            "Lry1/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lry1/b$c;->z:Lry1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lry1/b$c;->y:Ljava/lang/Object;

    iget p1, p0, Lry1/b$c;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lry1/b$c;->E:I

    iget-object p1, p0, Lry1/b$c;->z:Lry1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lry1/b;->j(Lry1/b;Lry1/a;Ldj0/h$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
