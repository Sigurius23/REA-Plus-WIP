.class public final Lp1/l2;
.super Lz1/b0;
.source "SourceFile"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/b0;-><init>(J)V

    iput p3, p0, Lp1/l2;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/l2;

    iget p1, p1, Lp1/l2;->c:I

    iput p1, p0, Lp1/l2;->c:I

    return-void
.end method

.method public final b(J)Lz1/b0;
    .locals 2

    new-instance v0, Lp1/l2;

    iget v1, p0, Lp1/l2;->c:I

    invoke-direct {v0, p1, p2, v1}, Lp1/l2;-><init>(JI)V

    return-object v0
.end method
