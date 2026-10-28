.class final Lsh2/e$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh2/e;->j(Lvk0/i;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strapauth.certificatetransfer.CertificateTransferTask"
    f = "CertificateTransferTask.kt"
    l = {
        0x33
    }
    m = "transfer"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lsh2/e;

.field H:I

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lsh2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh2/e;",
            "Lq83/d<",
            "-",
            "Lsh2/e$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsh2/e$h;->G:Lsh2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsh2/e$h;->F:Ljava/lang/Object;

    iget p1, p0, Lsh2/e$h;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsh2/e$h;->H:I

    iget-object p1, p0, Lsh2/e$h;->G:Lsh2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lsh2/e;->e(Lsh2/e;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
