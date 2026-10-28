.class final Lfw1/d$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->m(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor"
    f = "ExtensionsInteractor.kt"
    l = {
        0x160,
        0x16a,
        0x17a
    }
    m = "dynamicCheckout"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lfw1/d;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfw1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/d;",
            "Lq83/d<",
            "-",
            "Lfw1/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$b;->I:Lfw1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lfw1/d$b;->H:Ljava/lang/Object;

    iget p1, p0, Lfw1/d$b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfw1/d$b;->J:I

    iget-object v0, p0, Lfw1/d$b;->I:Lfw1/d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lfw1/d;->a(Lfw1/d;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
