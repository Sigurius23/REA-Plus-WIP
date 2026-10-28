.class public final La3/a1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:La3/c1;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(La3/c1;J)V
    .locals 0

    iput-object p1, p0, La3/a1;->w:La3/c1;

    iput-wide p2, p0, La3/a1;->x:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La3/a1;->w:La3/c1;

    iget-object v0, v0, La3/c1;->F:La3/r0;

    invoke-virtual {v0}, La3/r0;->a()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v1, p0, La3/a1;->x:J

    invoke-interface {v0, v1, v2}, Ly2/q0;->T(J)Ly2/j1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
