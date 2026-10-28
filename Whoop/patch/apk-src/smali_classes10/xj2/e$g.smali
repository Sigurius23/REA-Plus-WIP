.class final Lxj2/e$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxj2/e;->m(Lxj2/a;Lxj2/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor"
    f = "TiltGraphCalendarInteractor.kt"
    l = {
        0x77,
        0x8c
    }
    m = "interactingStateToDomainData"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lxj2/e;


# direct methods
.method public constructor <init>(Lxj2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxj2/e;",
            "Lq83/d<",
            "-",
            "Lxj2/e$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxj2/e$g;->z:Lxj2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxj2/e$g;->y:Ljava/lang/Object;

    iget p1, p0, Lxj2/e$g;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxj2/e$g;->E:I

    iget-object p1, p0, Lxj2/e$g;->z:Lxj2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lxj2/e;->h(Lxj2/e;Lxj2/a;Lxj2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
