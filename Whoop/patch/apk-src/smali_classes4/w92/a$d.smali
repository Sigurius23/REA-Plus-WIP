.class final Lw92/a$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/a;->h(JILq83/d;)Ljava/lang/Object;
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
        0x69,
        0x6b,
        0x72
    }
    m = "newExportOldestToFileFromDb"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lw92/a;

.field I:I

.field w:J

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lw92/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw92/a;",
            "Lq83/d<",
            "-",
            "Lw92/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/a$d;->H:Lw92/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lw92/a$d;->G:Ljava/lang/Object;

    iget p1, p0, Lw92/a$d;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw92/a$d;->I:I

    iget-object p1, p0, Lw92/a$d;->H:Lw92/a;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2, p0}, Lw92/a;->f(Lw92/a;JILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
