.class final Lag1/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lag1/c;->l(Lec3/m;Ljava/lang/String;Lag1/b;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.filteredlist.domain.FilteredListInteractor"
    f = "FilteredListInteractor.kt"
    l = {
        0xa3,
        0xa5
    }
    m = "handleLoad"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lag1/c;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lag1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lag1/c;",
            "Lq83/d<",
            "-",
            "Lag1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lag1/c$c;->G:Lag1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lag1/c$c;->F:Ljava/lang/Object;

    iget p1, p0, Lag1/c$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lag1/c$c;->H:I

    iget-object v0, p0, Lag1/c$c;->G:Lag1/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lag1/c;->d(Lag1/c;Lec3/m;Ljava/lang/String;Lag1/b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
