.class final Li51/q$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li51/q;->d(Lqi/i;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.organism.celebration.DynamicLottieImageProvider"
    f = "DynamicLottieImageProvider.kt"
    l = {
        0x82
    }
    m = "overlayBitmapLayers"
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

.field synthetic M:Ljava/lang/Object;

.field final synthetic N:Li51/q;

.field O:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li51/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li51/q;",
            "Lq83/d<",
            "-",
            "Li51/q$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li51/q$d;->N:Li51/q;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li51/q$d;->M:Ljava/lang/Object;

    iget p1, p0, Li51/q$d;->O:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li51/q$d;->O:I

    iget-object p1, p0, Li51/q$d;->N:Li51/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Li51/q;->d(Lqi/i;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
