.class final Lrk2/g$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrk2/g;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.pendingsave.RoomPendingActivitySaveStore"
    f = "RoomPendingActivitySaveStore.kt"
    l = {
        0x16
    }
    m = "enqueue-bMdYcbs"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:Z

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lrk2/g;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrk2/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrk2/g;",
            "Lq83/d<",
            "-",
            "Lrk2/g$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrk2/g$b;->H:Lrk2/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lrk2/g$b;->G:Ljava/lang/Object;

    iget p1, p0, Lrk2/g$b;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrk2/g$b;->I:I

    iget-object v0, p0, Lrk2/g$b;->H:Lrk2/g;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lrk2/g;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
