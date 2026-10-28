.class final Ldd0/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd0/c;->g(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor"
    f = "MultiConsentInteractor.kt"
    l = {
        0x3e
    }
    m = "submitConsent"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldd0/c;


# direct methods
.method public constructor <init>(Ldd0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd0/c;",
            "Lq83/d<",
            "-",
            "Ldd0/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldd0/c$d;->z:Ldd0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldd0/c$d;->y:Ljava/lang/Object;

    iget p1, p0, Ldd0/c$d;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldd0/c$d;->E:I

    iget-object p1, p0, Ldd0/c$d;->z:Ldd0/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Ldd0/c;->c(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
