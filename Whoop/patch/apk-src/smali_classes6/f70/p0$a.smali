.class final Lf70/p0$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/p0;->b(Lf70/q0;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.MedicarePermissionsHelper"
    f = "MedicarePermissionsHelper.kt"
    l = {
        0x18
    }
    m = "fetchMedicarePermissionsScreens"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lf70/p0;


# direct methods
.method public constructor <init>(Lf70/p0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/p0;",
            "Lq83/d<",
            "-",
            "Lf70/p0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/p0$a;->z:Lf70/p0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf70/p0$a;->y:Ljava/lang/Object;

    iget p1, p0, Lf70/p0$a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/p0$a;->E:I

    iget-object p1, p0, Lf70/p0$a;->z:Lf70/p0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lf70/p0;->b(Lf70/q0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
