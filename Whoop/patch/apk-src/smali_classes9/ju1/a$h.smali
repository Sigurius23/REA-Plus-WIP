.class final Lju1/a$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lju1/a;->b(Lfu1/c;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labradorService.domain.LabradorServiceImpl"
    f = "LabradorServiceImpl.kt"
    l = {
        0x52
    }
    m = "toggleEcgRealtime-gIAlu-s"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lju1/a;

.field z:I


# direct methods
.method public constructor <init>(Lju1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lju1/a;",
            "Lq83/d<",
            "-",
            "Lju1/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lju1/a$h;->y:Lju1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lju1/a$h;->x:Ljava/lang/Object;

    iget p1, p0, Lju1/a$h;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lju1/a$h;->z:I

    iget-object p1, p0, Lju1/a$h;->y:Lju1/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lju1/a;->b(Lfu1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
