.class final Lis0/z$f$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/z$f;->b(ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.communityreactions.view.ReactionsCommentListKt$keepNewestVisibleWhenViewportShrinks$3"
    f = "ReactionsCommentList.kt"
    l = {
        0x48
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lis0/z$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lis0/z$f<",
            "TT;>;"
        }
    .end annotation
.end field

.field z:I


# direct methods
.method public constructor <init>(Lis0/z$f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lis0/z$f<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Lis0/z$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lis0/z$f$a;->y:Lis0/z$f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lis0/z$f$a;->x:Ljava/lang/Object;

    iget p1, p0, Lis0/z$f$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lis0/z$f$a;->z:I

    iget-object p1, p0, Lis0/z$f$a;->y:Lis0/z$f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lis0/z$f;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
