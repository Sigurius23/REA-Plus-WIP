.class final Lf70/w0$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/w0;->f(Lu02/a$b;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper"
    f = "RemoteAccountInfoHelper.kt"
    l = {
        0x75,
        0x7b
    }
    m = "handlePostAccountInfoError"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf70/w0;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Z

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf70/w0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/w0;",
            "Lq83/d<",
            "-",
            "Lf70/w0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/w0$b;->E:Lf70/w0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lf70/w0$b;->z:Ljava/lang/Object;

    iget p1, p0, Lf70/w0$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf70/w0$b;->F:I

    iget-object p1, p0, Lf70/w0$b;->E:Lf70/w0;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lf70/w0;->b(Lf70/w0;Lu02/a$b;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
