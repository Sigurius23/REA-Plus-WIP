.class final Ldt1/h$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->u(Lqk1/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0x150,
        0x157,
        0x158
    }
    m = "doUpload"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Ldt1/h;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldt1/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/h;",
            "Lq83/d<",
            "-",
            "Ldt1/h$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$d;->H:Ldt1/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldt1/h$d;->G:Ljava/lang/Object;

    iget p1, p0, Ldt1/h$d;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldt1/h$d;->I:I

    iget-object p1, p0, Ldt1/h$d;->H:Ldt1/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ldt1/h;->c(Ldt1/h;Lqk1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
