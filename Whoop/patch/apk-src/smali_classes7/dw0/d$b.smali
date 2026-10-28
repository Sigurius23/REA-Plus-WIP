.class final Ldw0/d$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldw0/d;->j(Ljava/lang/String;Lhw0/a;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        0x177
    }
    m = "fetchActivityDetailsCached"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Ldw0/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Ldw0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldw0/d;",
            "Lq83/d<",
            "-",
            "Ldw0/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldw0/d$b;->F:Ldw0/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ldw0/d$b;->E:Ljava/lang/Object;

    iget p1, p0, Ldw0/d$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldw0/d$b;->G:I

    iget-object v0, p0, Ldw0/d$b;->F:Ldw0/d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Ldw0/d;->d(Ldw0/d;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
