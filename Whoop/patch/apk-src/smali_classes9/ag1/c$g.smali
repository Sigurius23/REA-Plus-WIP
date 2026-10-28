.class final Lag1/c$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lag1/c;->q(Lec3/m;Lqw2/b;Ljava/lang/String;Lag1/b;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;
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
        0x61,
        0x62
    }
    m = "handleTerminalActionState$filtered_list_arch_mini_release"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

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
            "Lag1/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lag1/c$g;->G:Lag1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lag1/c$g;->F:Ljava/lang/Object;

    iget p1, p0, Lag1/c$g;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lag1/c$g;->H:I

    iget-object v0, p0, Lag1/c$g;->G:Lag1/c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lag1/c;->q(Lec3/m;Lqw2/b;Ljava/lang/String;Lag1/b;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
