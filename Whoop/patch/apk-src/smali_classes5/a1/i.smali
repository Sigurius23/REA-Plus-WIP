.class public final La1/i;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/s;


# instance fields
.field public Q:Ls83/i;

.field public final R:Lp1/k1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    invoke-direct {p0}, La3/o;-><init>()V

    check-cast p1, Ls83/i;

    iput-object p1, p0, La1/i;->Q:Ls83/i;

    sget-object p1, Lp1/v0;->y:Lp1/v0;

    new-instance v0, Lp1/k1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v0, p0, La1/i;->R:Lp1/k1;

    new-instance p1, La1/f;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object p1

    invoke-virtual {p0, p1}, La3/o;->X0(La3/n;)La3/n;

    return-void
.end method


# virtual methods
.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1

    iget-object v0, p0, La1/i;->R:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
