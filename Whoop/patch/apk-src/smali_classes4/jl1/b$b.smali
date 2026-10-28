.class final Ljl1/b$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljl1/b;->m(Ljl1/a;Lil1/a;Lbc3/c0;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.home.domain.autopop.AutoPopInteractor"
    f = "AutoPopInteractor.kt"
    l = {
        0x4e,
        0x5a
    }
    m = "handleMultipleDestinationAction"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljl1/b;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljl1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljl1/b;",
            "Lq83/d<",
            "-",
            "Ljl1/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljl1/b$b;->E:Ljl1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ljl1/b$b;->z:Ljava/lang/Object;

    iget p1, p0, Ljl1/b$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljl1/b$b;->F:I

    iget-object p1, p0, Ljl1/b$b;->E:Ljl1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Ljl1/b;->e(Ljl1/b;Ljl1/a;Lil1/a;Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
