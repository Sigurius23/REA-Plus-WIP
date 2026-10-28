.class final Ldw0/d$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldw0/d;->t(Ldw0/c;Ldw0/b;Lq83/d;)Ljava/lang/Object;
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
        0x23,
        0x33,
        0x6c,
        0x7f,
        0x86,
        0x8b
    }
    m = "interactOld"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Ldw0/d;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldw0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldw0/d;",
            "Lq83/d<",
            "-",
            "Ldw0/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldw0/d$h;->G:Ldw0/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldw0/d$h;->F:Ljava/lang/Object;

    iget p1, p0, Ldw0/d$h;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldw0/d$h;->H:I

    iget-object p1, p0, Ldw0/d$h;->G:Ldw0/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ldw0/d;->t(Ldw0/c;Ldw0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
