.class final Lg92/d$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg92/d;->a(Ljava/util/List;Lcu0/c;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.firmware.rawdatacollection.RawDataRepositoryImpl"
    f = "RawDataRepositoryImpl.kt"
    l = {
        0x46,
        0x48
    }
    m = "saveListOfRawDataPackets"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg92/d;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg92/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg92/d;",
            "Lq83/d<",
            "-",
            "Lg92/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg92/d$d;->E:Lg92/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg92/d$d;->z:Ljava/lang/Object;

    iget p1, p0, Lg92/d$d;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg92/d$d;->F:I

    iget-object p1, p0, Lg92/d$d;->E:Lg92/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lg92/d;->a(Ljava/util/List;Lcu0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
