.class final Lio0/p$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/p;->J(Lu02/a$b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor"
    f = "ClinicianVideoSchedulingIntakeInteractor.kt"
    l = {
        0x23c
    }
    m = "toInternalAction"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lio0/p;

.field z:I


# direct methods
.method public constructor <init>(Lio0/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio0/p;",
            "Lq83/d<",
            "-",
            "Lio0/p$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio0/p$j;->y:Lio0/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio0/p$j;->x:Ljava/lang/Object;

    iget p1, p0, Lio0/p$j;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio0/p$j;->z:I

    iget-object p1, p0, Lio0/p$j;->y:Lio0/p;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lio0/p;->m(Lio0/p;Lu02/a$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
