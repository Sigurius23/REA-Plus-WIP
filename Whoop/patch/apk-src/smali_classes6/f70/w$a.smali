.class final Lf70/w$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/w;->j(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher"
    f = "DeviceEducationFetcher.kt"
    l = {
        0x65,
        0x72,
        0x79
    }
    m = "fetchDeviceEducationV1"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:J

.field N:J

.field O:I

.field P:I

.field Q:I

.field R:I

.field synthetic S:Ljava/lang/Object;

.field final synthetic T:Lf70/w;

.field U:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf70/w;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/w;",
            "Lq83/d<",
            "-",
            "Lf70/w$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/w$a;->T:Lf70/w;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf70/w$a;->S:Ljava/lang/Object;

    iget p1, p0, Lf70/w$a;->U:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/w$a;->U:I

    iget-object p1, p0, Lf70/w$a;->T:Lf70/w;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lf70/w;->a(Lf70/w;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
