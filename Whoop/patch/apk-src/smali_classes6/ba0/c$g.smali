.class final Lba0/c$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba0/c;->k(Lba0/b;Lba0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.add.activity.domain.AddActivityInteractor"
    f = "AddActivityInteractor.kt"
    l = {
        0x32,
        0x38,
        0x3d,
        0x47,
        0x4d,
        0x53,
        0x5d,
        0x5e
    }
    m = "interact"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:Z

.field N:I

.field synthetic O:Ljava/lang/Object;

.field final synthetic P:Lba0/c;

.field Q:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lba0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba0/c;",
            "Lq83/d<",
            "-",
            "Lba0/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lba0/c$g;->P:Lba0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lba0/c$g;->O:Ljava/lang/Object;

    iget p1, p0, Lba0/c$g;->Q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lba0/c$g;->Q:I

    iget-object p1, p0, Lba0/c$g;->P:Lba0/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lba0/c;->k(Lba0/b;Lba0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
