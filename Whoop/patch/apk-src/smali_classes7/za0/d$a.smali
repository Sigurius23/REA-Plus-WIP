.class final Lza0/d$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza0/d;->f(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor"
    f = "BiomarkerDetailsInteractor.kt"
    l = {
        0x59
    }
    m = "fetchData"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lza0/d;


# direct methods
.method public constructor <init>(Lza0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/d;",
            "Lq83/d<",
            "-",
            "Lza0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lza0/d$a;->z:Lza0/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lza0/d$a;->y:Ljava/lang/Object;

    iget p1, p0, Lza0/d$a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lza0/d$a;->E:I

    iget-object p1, p0, Lza0/d$a;->z:Lza0/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lza0/d;->c(Lza0/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
