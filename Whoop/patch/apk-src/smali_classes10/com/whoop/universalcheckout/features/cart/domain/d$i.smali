.class final Lcom/whoop/universalcheckout/features/cart/domain/d$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/cart/domain/d;->o(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
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
        0xb6
    }
    m = "updateQuantity"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/universalcheckout/features/cart/domain/d;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->E:Lcom/whoop/universalcheckout/features/cart/domain/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->z:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->F:I

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$i;->E:Lcom/whoop/universalcheckout/features/cart/domain/d;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lcom/whoop/universalcheckout/features/cart/domain/d;->f(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
