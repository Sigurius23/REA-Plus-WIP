.class final Lfx1/d$h$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx1/d$h$a;->b(Lfx1/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.membership.management.domain.interactors.membershipAdjustment.MembershipAdjustmentCheckoutInteractor$interact$1$1"
    f = "MembershipAdjustmentCheckoutInteractor.kt"
    l = {
        0x37,
        0x50,
        0x56
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfx1/d$h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfx1/d$h$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfx1/d$h$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfx1/d$h$a<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Lfx1/d$h$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfx1/d$h$a$a;->E:Lfx1/d$h$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfx1/d$h$a$a;->z:Ljava/lang/Object;

    iget p1, p0, Lfx1/d$h$a$a;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfx1/d$h$a$a;->F:I

    iget-object p1, p0, Lfx1/d$h$a$a;->E:Lfx1/d$h$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfx1/d$h$a;->b(Lfx1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
