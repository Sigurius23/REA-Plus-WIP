.class final Lzg1/b$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg1/b;->k(Lq83/d;)Ljava/lang/Object;
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
        0x70,
        0x71,
        0x74,
        0x75
    }
    m = "performUpdate"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzg1/b;


# direct methods
.method public constructor <init>(Lzg1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg1/b;",
            "Lq83/d<",
            "-",
            "Lzg1/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzg1/b$e;->z:Lzg1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lzg1/b$e;->y:Ljava/lang/Object;

    iget p1, p0, Lzg1/b$e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzg1/b$e;->E:I

    iget-object p1, p0, Lzg1/b$e;->z:Lzg1/b;

    invoke-static {p1, p0}, Lzg1/b;->d(Lzg1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
