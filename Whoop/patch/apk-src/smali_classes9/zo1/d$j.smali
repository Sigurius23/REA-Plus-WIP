.class final Lzo1/d$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo1/d;->t(Lzo1/b;Lzo1/f;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.onboarding.domain.MciOnboardingInteractor"
    f = "MciOnboardingInteractor.kt"
    l = {
        0x8a
    }
    m = "performSave"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lzo1/d;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzo1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo1/d;",
            "Lq83/d<",
            "-",
            "Lzo1/d$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzo1/d$j;->E:Lzo1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lzo1/d$j;->z:Ljava/lang/Object;

    iget p1, p0, Lzo1/d$j;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzo1/d$j;->F:I

    iget-object p1, p0, Lzo1/d$j;->E:Lzo1/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lzo1/d;->i(Lzo1/d;Lzo1/b;Lzo1/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
