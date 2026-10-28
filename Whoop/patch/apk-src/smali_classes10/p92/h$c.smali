.class final Lp92/h$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp92/h;->A(Lsj0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.realtime.RealTimeStrainController"
    f = "RealTimeStrainController.kt"
    l = {
        0x146
    }
    m = "calculateStrainScore"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp92/h;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp92/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp92/h;",
            "Lq83/d<",
            "-",
            "Lp92/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp92/h$c;->E:Lp92/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp92/h$c;->z:Ljava/lang/Object;

    iget p1, p0, Lp92/h$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp92/h$c;->F:I

    iget-object p1, p0, Lp92/h$c;->E:Lp92/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lp92/h;->h(Lp92/h;Lsj0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
