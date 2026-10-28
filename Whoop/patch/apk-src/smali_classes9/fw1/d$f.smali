.class final Lfw1/d$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->p(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        0x132
    }
    m = "fetchDynamicOrderData"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfw1/d;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfw1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/d;",
            "Lq83/d<",
            "-",
            "Lfw1/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$f;->E:Lfw1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfw1/d$f;->z:Ljava/lang/Object;

    iget p1, p0, Lfw1/d$f;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfw1/d$f;->F:I

    iget-object p1, p0, Lfw1/d$f;->E:Lfw1/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lfw1/d;->d(Lfw1/d;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
