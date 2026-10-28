.class final Lcom/whoop/universalcheckout/features/cart/domain/d$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/cart/domain/d;->l(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor"
    f = "CartInteractor.kt"
    l = {
        0x40,
        0x4f
    }
    m = "loadAndReduce"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lcom/whoop/universalcheckout/features/cart/domain/d;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/d$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->I:Lcom/whoop/universalcheckout/features/cart/domain/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->H:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->J:I

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$g;->I:Lcom/whoop/universalcheckout/features/cart/domain/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/whoop/universalcheckout/features/cart/domain/d;->d(Lcom/whoop/universalcheckout/features/cart/domain/d;Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
