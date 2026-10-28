.class final Lfp1/f$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfp1/f;->o(Lfp1/d;Lfp1/g;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor"
    f = "PostPartumInteractor.kt"
    l = {
        0x56
    }
    m = "performSave"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lfp1/f;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfp1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp1/f;",
            "Lq83/d<",
            "-",
            "Lfp1/f$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp1/f$f;->G:Lfp1/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lfp1/f$f;->F:Ljava/lang/Object;

    iget p1, p0, Lfp1/f$f;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfp1/f$f;->H:I

    iget-object p1, p0, Lfp1/f$f;->G:Lfp1/f;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lfp1/f;->g(Lfp1/f;Lfp1/d;Lfp1/g;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
