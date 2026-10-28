.class final Lem1/u$x0;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lem1/u;->D0(Lem1/n;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.home.presentation.HomeViewModel"
    f = "HomeViewModel.kt"
    l = {
        0x15d,
        0x15d,
        0x15e,
        0x15e
    }
    m = "viewEventToHomeAction"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lem1/u;


# direct methods
.method public constructor <init>(Lem1/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lem1/u;",
            "Lq83/d<",
            "-",
            "Lem1/u$x0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lem1/u$x0;->z:Lem1/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lem1/u$x0;->y:Ljava/lang/Object;

    iget p1, p0, Lem1/u$x0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lem1/u$x0;->E:I

    iget-object p1, p0, Lem1/u$x0;->z:Lem1/u;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lem1/u;->Z(Lem1/u;Lem1/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
