.class final Lf70/k0$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/k0;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher"
    f = "IAJFV2BffFetcher.kt"
    l = {
        0xa9
    }
    m = "fetchPasswordRequirements"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lf70/k0;

.field z:I


# direct methods
.method public constructor <init>(Lf70/k0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/k0;",
            "Lq83/d<",
            "-",
            "Lf70/k0$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/k0$g;->y:Lf70/k0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf70/k0$g;->x:Ljava/lang/Object;

    iget p1, p0, Lf70/k0$g;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/k0$g;->z:I

    iget-object p1, p0, Lf70/k0$g;->y:Lf70/k0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lf70/k0;->a(Lf70/k0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
