.class final Lyw2/h$r;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw2/h;->S(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.WhoopLabsServiceModel"
    f = "WhoopLabsServiceModel.kt"
    l = {
        0x180,
        0x184,
        0x187,
        0x18a,
        0x190,
        0x19f,
        0x1a1,
        0x1a3,
        0x1a9,
        0x1ad,
        0x1af
    }
    m = "onSubmitClicked"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lyw2/h;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lyw2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyw2/h;",
            "Lq83/d<",
            "-",
            "Lyw2/h$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyw2/h$r;->F:Lyw2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyw2/h$r;->E:Ljava/lang/Object;

    iget p1, p0, Lyw2/h$r;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyw2/h$r;->G:I

    iget-object p1, p0, Lyw2/h$r;->F:Lyw2/h;

    invoke-virtual {p1, p0}, Lyw2/h;->S(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
