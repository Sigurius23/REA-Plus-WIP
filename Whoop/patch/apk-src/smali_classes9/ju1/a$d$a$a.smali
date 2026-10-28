.class public final Lju1/a$d$a$a;
.super Ls83/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lju1/a$d$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labradorService.domain.LabradorServiceImpl$selectWristAndPrepEcg-gIAlu-s$$inlined$map$1$2"
    f = "LabradorServiceImpl.kt"
    l = {
        0x34,
        0x3b,
        0x32
    }
    m = "emit"
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

.field M:I

.field N:I

.field O:I

.field P:I

.field synthetic w:Ljava/lang/Object;

.field x:I

.field y:Ljava/lang/Object;

.field final synthetic z:Lju1/a$d$a;


# direct methods
.method public constructor <init>(Lju1/a$d$a;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lju1/a$d$a$a;->z:Lju1/a$d$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lju1/a$d$a$a;->w:Ljava/lang/Object;

    iget p1, p0, Lju1/a$d$a$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lju1/a$d$a$a;->x:I

    iget-object p1, p0, Lju1/a$d$a$a;->z:Lju1/a$d$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lju1/a$d$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
