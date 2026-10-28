.class public final Lu0/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:Lbc3/c0;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lj0/i;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public constructor <init>(Lbc3/c0;Lp1/c1;Lj0/i;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/k1;->w:Lbc3/c0;

    iput-object p2, p0, Lu0/k1;->x:Lp1/c1;

    iput-object p3, p0, Lu0/k1;->y:Lj0/i;

    iput-object p4, p0, Lu0/k1;->z:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v2, Lu0/j1;

    iget-object v0, p0, Lu0/k1;->y:Lj0/i;

    const/4 v1, 0x0

    iget-object v3, p0, Lu0/k1;->w:Lbc3/c0;

    iget-object v4, p0, Lu0/k1;->x:Lp1/c1;

    invoke-direct {v2, v3, v4, v0, v1}, Lu0/j1;-><init>(Lbc3/c0;Lp1/c1;Lj0/i;Lq83/d;)V

    new-instance v3, Lq12/c;

    const/16 v0, 0xe

    iget-object v1, p0, Lu0/k1;->z:Lp1/c1;

    invoke-direct {v3, v0, v1}, Lq12/c;-><init>(ILp1/c1;)V

    sget-object v0, Lh0/o3;->a:Lh0/d3;

    new-instance v4, Lh0/h2;

    invoke-direct {v4, p1}, Lh0/h2;-><init>(Ly3/c;)V

    new-instance v0, Lcz/d;

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcz/d;-><init>(Lu2/v;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method
