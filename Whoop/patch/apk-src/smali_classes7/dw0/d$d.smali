.class final Ldw0/d$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldw0/d;->o(Ldw0/c;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.core.details.domain.CoreDetailsInteractor"
    f = "CoreDetailsInteractor.kt"
    l = {
        0x112
    }
    m = "handleDeleteActivity"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ldw0/d;

.field z:I


# direct methods
.method public constructor <init>(Ldw0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldw0/d;",
            "Lq83/d<",
            "-",
            "Ldw0/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldw0/d$d;->y:Ldw0/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldw0/d$d;->x:Ljava/lang/Object;

    iget p1, p0, Ldw0/d$d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldw0/d$d;->z:I

    iget-object p1, p0, Ldw0/d$d;->y:Ldw0/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ldw0/d;->h(Ldw0/d;Ldw0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
