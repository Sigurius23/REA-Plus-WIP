.class final Lke1/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke1/c;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.education.domain.EducationInteractor"
    f = "EducationInteractor.kt"
    l = {
        0x20,
        0x2a
    }
    m = "fetchData"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lke1/c;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lke1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke1/c;",
            "Lq83/d<",
            "-",
            "Lke1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lke1/c$a;->E:Lke1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lke1/c$a;->z:Ljava/lang/Object;

    iget p1, p0, Lke1/c$a;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lke1/c$a;->F:I

    iget-object p1, p0, Lke1/c$a;->E:Lke1/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lke1/c;->a(Lke1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
