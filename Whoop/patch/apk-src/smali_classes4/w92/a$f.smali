.class final Lw92/a$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/a;->d(Ljava/util/Map;Loh2/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.store.heartdata.HeartDataStoreImpl"
    f = "HeartDataStoreImpl.kt"
    l = {
        0x113
    }
    m = "savePacketsInRoomDbBatchInsert"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lw92/a;

.field L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw92/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw92/a;",
            "Lq83/d<",
            "-",
            "Lw92/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/a$f;->K:Lw92/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw92/a$f;->J:Ljava/lang/Object;

    iget p1, p0, Lw92/a$f;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw92/a$f;->L:I

    iget-object p1, p0, Lw92/a$f;->K:Lw92/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lw92/a;->d(Ljava/util/Map;Loh2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
