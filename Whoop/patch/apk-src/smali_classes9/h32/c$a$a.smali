.class final Lh32/c$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh32/c$a;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.payments.stripemanager.StripeManagerImpl$CachedStripe"
    f = "StripeManagerImpl.kt"
    l = {
        0x60,
        0x3d
    }
    m = "get"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lh32/c$a;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lh32/c$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh32/c$a;",
            "Lq83/d<",
            "-",
            "Lh32/c$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh32/c$a$a;->F:Lh32/c$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh32/c$a$a;->E:Ljava/lang/Object;

    iget p1, p0, Lh32/c$a$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh32/c$a$a;->G:I

    iget-object p1, p0, Lh32/c$a$a;->F:Lh32/c$a;

    invoke-virtual {p1, p0}, Lh32/c$a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
