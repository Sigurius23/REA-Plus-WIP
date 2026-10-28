.class final Lf70/h$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/h;->x(Lec3/m;Lf70/e;Lf70/d$y;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.ActivationInteractor"
    f = "ActivationInteractor.kt"
    l = {
        0x75,
        0x79
    }
    m = "storeMembershipInformation"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lf70/h;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf70/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/h;",
            "Lq83/d<",
            "-",
            "Lf70/h$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/h$f;->F:Lf70/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf70/h$f;->E:Ljava/lang/Object;

    iget p1, p0, Lf70/h$f;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/h$f;->G:I

    iget-object p1, p0, Lf70/h$f;->F:Lf70/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lf70/h;->o(Lf70/h;Lec3/m;Lf70/e;Lf70/d$y;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
