.class final Lyw2/h$t;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw2/h;->W(ZLq83/d;)Ljava/lang/Object;
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
        0x1bd,
        0x1c1,
        0x1c6,
        0x1c7,
        0x1c8,
        0x1c9,
        0x1ca,
        0x1cb,
        0x1cc,
        0x1cd,
        0x1ce
    }
    m = "resetStudy"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lyw2/h;

.field G:I

.field w:Z

.field x:I

.field y:I

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyw2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyw2/h;",
            "Lq83/d<",
            "-",
            "Lyw2/h$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyw2/h$t;->F:Lyw2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyw2/h$t;->E:Ljava/lang/Object;

    iget p1, p0, Lyw2/h$t;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyw2/h$t;->G:I

    iget-object p1, p0, Lyw2/h$t;->F:Lyw2/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lyw2/h;->i(Lyw2/h;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
