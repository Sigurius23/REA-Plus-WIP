.class final Lw92/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/a;->b(Lq83/d;)Ljava/lang/Object;
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
        0x131,
        0x48,
        0x4f
    }
    m = "getHeartDataFromTable"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lw92/a;

.field H:I

.field w:Ljava/lang/Object;

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
            "Lw92/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/a$b;->G:Lw92/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw92/a$b;->F:Ljava/lang/Object;

    iget p1, p0, Lw92/a$b;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw92/a$b;->H:I

    iget-object p1, p0, Lw92/a$b;->G:Lw92/a;

    invoke-virtual {p1, p0}, Lw92/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
