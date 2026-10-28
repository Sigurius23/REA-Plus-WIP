.class final Lsw0/f$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw0/f;->u(Lsw0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        0x7e
    }
    m = "performFuzzySearch"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsw0/f;


# direct methods
.method public constructor <init>(Lsw0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/f;",
            "Lq83/d<",
            "-",
            "Lsw0/f$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsw0/f$i;->z:Lsw0/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsw0/f$i;->y:Ljava/lang/Object;

    iget p1, p0, Lsw0/f$i;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsw0/f$i;->E:I

    iget-object p1, p0, Lsw0/f$i;->z:Lsw0/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lsw0/f;->j(Lsw0/f;Lsw0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
