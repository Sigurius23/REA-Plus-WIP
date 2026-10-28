.class final Ldy1/d$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/d;->z(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.memfault.NewMemfaultManager"
    f = "NewMemfaultManager.kt"
    l = {
        0xda,
        0x85
    }
    m = "processChunks"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Ldy1/d;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ldy1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldy1/d;",
            "Lq83/d<",
            "-",
            "Ldy1/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldy1/d$h;->G:Ldy1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldy1/d$h;->F:Ljava/lang/Object;

    iget p1, p0, Ldy1/d$h;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldy1/d$h;->H:I

    iget-object p1, p0, Ldy1/d$h;->G:Ldy1/d;

    invoke-static {p1, p0}, Ldy1/d;->p(Ldy1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
