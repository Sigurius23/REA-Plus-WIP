.class public final Lp1/n2;
.super Lz1/b0;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/b0;-><init>(J)V

    iput-object p3, p0, Lp1/n2;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/n2;

    iget-object p1, p1, Lp1/n2;->c:Ljava/lang/Object;

    iput-object p1, p0, Lp1/n2;->c:Ljava/lang/Object;

    return-void
.end method

.method public final b(J)Lz1/b0;
    .locals 2

    new-instance p1, Lp1/n2;

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p2

    invoke-virtual {p2}, Lz1/f;->g()J

    move-result-wide v0

    iget-object p2, p0, Lp1/n2;->c:Ljava/lang/Object;

    invoke-direct {p1, v0, v1, p2}, Lp1/n2;-><init>(JLjava/lang/Object;)V

    return-object p1
.end method
