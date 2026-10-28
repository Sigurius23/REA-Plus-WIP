.class final Ld22/c$e$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld22/c$e$a;->b(Ld22/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor$interact$1$1"
    f = "MembershipAdjustmentInteractor.kt"
    l = {
        0x1d,
        0x1e,
        0x25
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ld22/c$e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld22/c$e$a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld22/c$e$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld22/c$e$a<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Ld22/c$e$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ld22/c$e$a$a;->z:Ld22/c$e$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ld22/c$e$a$a;->y:Ljava/lang/Object;

    iget p1, p0, Ld22/c$e$a$a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld22/c$e$a$a;->E:I

    iget-object p1, p0, Ld22/c$e$a$a;->z:Ld22/c$e$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ld22/c$e$a;->b(Ld22/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
