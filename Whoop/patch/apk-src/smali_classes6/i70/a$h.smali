.class final Li70/a$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li70/a;->y(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher"
    f = "ScreenFetchDispatcher.kt"
    l = {
        0xea,
        0xec
    }
    m = "fetchAlPermissionsScreens"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Li70/a;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li70/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li70/a;",
            "Lq83/d<",
            "-",
            "Li70/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li70/a$h;->E:Li70/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li70/a$h;->z:Ljava/lang/Object;

    iget p1, p0, Li70/a$h;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li70/a$h;->F:I

    iget-object p1, p0, Li70/a$h;->E:Li70/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Li70/a;->g(Li70/a;Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
