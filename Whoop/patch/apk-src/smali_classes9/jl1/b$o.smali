.class final Ljl1/b$o;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljl1/b;->u(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.home.domain.autopop.AutoPopInteractor"
    f = "AutoPopInteractor.kt"
    l = {
        0x75,
        0x79
    }
    m = "syncPendingDestinations"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field K:I

.field synthetic L:Ljava/lang/Object;

.field final synthetic M:Ljl1/b;

.field N:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljl1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljl1/b;",
            "Lq83/d<",
            "-",
            "Ljl1/b$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljl1/b$o;->M:Ljl1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ljl1/b$o;->L:Ljava/lang/Object;

    iget p1, p0, Ljl1/b$o;->N:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljl1/b$o;->N:I

    iget-object p1, p0, Ljl1/b$o;->M:Ljl1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ljl1/b;->k(Ljl1/b;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
