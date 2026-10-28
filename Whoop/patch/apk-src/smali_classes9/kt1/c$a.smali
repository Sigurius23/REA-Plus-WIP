.class final Lkt1/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkt1/c;->d(Lkt1/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labrador.feature.eligibility.domain.LabradorEligibilityInteractor"
    f = "LabradorEligibilityInteractor.kt"
    l = {
        0x17
    }
    m = "fetchLabradorEligibilityScreen"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkt1/c;

.field z:I


# direct methods
.method public constructor <init>(Lkt1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkt1/c;",
            "Lq83/d<",
            "-",
            "Lkt1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkt1/c$a;->y:Lkt1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lkt1/c$a;->x:Ljava/lang/Object;

    iget p1, p0, Lkt1/c$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkt1/c$a;->z:I

    iget-object p1, p0, Lkt1/c$a;->y:Lkt1/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lkt1/c;->a(Lkt1/c;Lkt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
