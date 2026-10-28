.class final Lsw0/f$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw0/f;->r(Lsw0/e;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor"
    f = "CustomBottomSheetInteractor.kt"
    l = {
        0x6a
    }
    m = "handleSaveCustomBehaviorApiCall"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Z

.field H:Z

.field I:I

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lsw0/f;

.field L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsw0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/f;",
            "Lq83/d<",
            "-",
            "Lsw0/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsw0/f$e;->K:Lsw0/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lsw0/f$e;->J:Ljava/lang/Object;

    iget p1, p0, Lsw0/f$e;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsw0/f$e;->L:I

    iget-object p1, p0, Lsw0/f$e;->K:Lsw0/f;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lsw0/f;->h(Lsw0/f;Lsw0/e;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
