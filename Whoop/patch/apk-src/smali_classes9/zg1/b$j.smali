.class final Lzg1/b$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg1/b;->n(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl"
    f = "FirmwareFeatureFlagUpdateServiceImpl.kt"
    l = {
        0xd0
    }
    m = "updateFeatureFlagStatusOnStrap"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field J:I

.field K:I

.field L:I

.field M:Z

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lzg1/b;

.field P:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzg1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg1/b;",
            "Lq83/d<",
            "-",
            "Lzg1/b$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzg1/b$j;->O:Lzg1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lzg1/b$j;->N:Ljava/lang/Object;

    iget p1, p0, Lzg1/b$j;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzg1/b$j;->P:I

    iget-object p1, p0, Lzg1/b$j;->O:Lzg1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lzg1/b;->f(Lzg1/b;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
