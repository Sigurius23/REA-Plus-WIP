.class final Lwe0/f$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe0/f;->m(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor"
    f = "TestUploadInteractor.kt"
    l = {
        0xcf
    }
    m = "tryUploadFiles"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lwe0/f;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwe0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe0/f;",
            "Lq83/d<",
            "-",
            "Lwe0/f$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwe0/f$i;->F:Lwe0/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwe0/f$i;->E:Ljava/lang/Object;

    iget p1, p0, Lwe0/f$i;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwe0/f$i;->G:I

    iget-object p1, p0, Lwe0/f$i;->F:Lwe0/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lwe0/f;->i(Lwe0/f;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
