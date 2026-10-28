.class final Lwx1/d$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwx1/d;->d(Lcom/whoop/membership/returns/domain/models/DownloadButton;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.membership.returns.domain.ReturnsPdfHandler"
    f = "ReturnsPdfHandler.kt"
    l = {
        0x17,
        0x18
    }
    m = "applyPdfPath$membership_release"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lwx1/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lwx1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwx1/d;",
            "Lq83/d<",
            "-",
            "Lwx1/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwx1/d$a;->F:Lwx1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwx1/d$a;->E:Ljava/lang/Object;

    iget p1, p0, Lwx1/d$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwx1/d$a;->G:I

    iget-object p1, p0, Lwx1/d$a;->F:Lwx1/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwx1/d;->d(Lcom/whoop/membership/returns/domain/models/DownloadButton;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
