.class final Lhx0/b$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhx0/b;->k(Lcu0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.dataSyncService.rawdata.NewRawDataUploaderImpl"
    f = "NewRawDataUploaderImpl.kt"
    l = {
        0x5f,
        0x6c,
        0x6e
    }
    m = "processRawData"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field J:I

.field K:I

.field L:I

.field M:Z

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lhx0/b;

.field P:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhx0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhx0/b;",
            "Lq83/d<",
            "-",
            "Lhx0/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhx0/b$d;->O:Lhx0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lhx0/b$d;->N:Ljava/lang/Object;

    iget p1, p0, Lhx0/b$d;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhx0/b$d;->P:I

    iget-object p1, p0, Lhx0/b$d;->O:Lhx0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lhx0/b;->h(Lhx0/b;Lcu0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
