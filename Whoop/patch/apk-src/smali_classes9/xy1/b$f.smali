.class final Lxy1/b$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxy1/b;->g(Ljava/lang/String;Lxy1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.mfa.setup.domain.MfaInputInteractor"
    f = "MfaInputInteractor.kt"
    l = {
        0x62,
        0x7a,
        0x81
    }
    m = "performSubmit"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lxy1/b;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxy1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxy1/b;",
            "Lq83/d<",
            "-",
            "Lxy1/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxy1/b$f;->H:Lxy1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxy1/b$f;->G:Ljava/lang/Object;

    iget p1, p0, Lxy1/b$f;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxy1/b$f;->I:I

    iget-object p1, p0, Lxy1/b$f;->H:Lxy1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lxy1/b;->c(Lxy1/b;Ljava/lang/String;Lxy1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
