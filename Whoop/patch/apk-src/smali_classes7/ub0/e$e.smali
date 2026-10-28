.class final Lub0/e$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub0/e;->p(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor"
    f = "EditBiomarkersInteractor.kt"
    l = {
        0x120
    }
    m = "deleteTest"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Z

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lub0/e;


# direct methods
.method public constructor <init>(Lub0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub0/e;",
            "Lq83/d<",
            "-",
            "Lub0/e$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lub0/e$e;->z:Lub0/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lub0/e$e;->y:Ljava/lang/Object;

    iget p1, p0, Lub0/e$e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lub0/e$e;->E:I

    iget-object p1, p0, Lub0/e$e;->z:Lub0/e;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lub0/e;->f(Lub0/e;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
