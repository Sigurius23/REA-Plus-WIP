.class final Lsh2/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh2/b;->a(Ljk0/d;[BLsj2/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strapauth.certificatetransfer.CertificateTransferApiImpl"
    f = "CertificateTransferApiImpl.kt"
    l = {
        0x19
    }
    m = "transfer"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lsh2/b;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsh2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh2/b;",
            "Lq83/d<",
            "-",
            "Lsh2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsh2/b$a;->H:Lsh2/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lsh2/b$a;->G:Ljava/lang/Object;

    iget p1, p0, Lsh2/b$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsh2/b$a;->I:I

    iget-object v0, p0, Lsh2/b$a;->H:Lsh2/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lsh2/b;->a(Ljk0/d;[BLsj2/a;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
