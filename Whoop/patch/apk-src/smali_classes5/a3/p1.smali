.class public final La3/p1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:La3/v;

.field public final synthetic F:I

.field public final synthetic G:Z

.field public final synthetic H:F

.field public final synthetic I:Z

.field public final synthetic w:Landroidx/compose/ui/node/NodeCoordinator;

.field public final synthetic x:Lb2/v;

.field public final synthetic y:La3/e;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/NodeCoordinator;Lb2/v;La3/e;JLa3/v;IZFZ)V
    .locals 0

    iput-object p1, p0, La3/p1;->w:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object p2, p0, La3/p1;->x:Lb2/v;

    iput-object p3, p0, La3/p1;->y:La3/e;

    iput-wide p4, p0, La3/p1;->z:J

    iput-object p6, p0, La3/p1;->E:La3/v;

    iput p7, p0, La3/p1;->F:I

    iput-boolean p8, p0, La3/p1;->G:Z

    iput p9, p0, La3/p1;->H:F

    iput-boolean p10, p0, La3/p1;->I:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, La3/p1;->y:La3/e;

    invoke-virtual {v0}, La3/e;->b()I

    move-result v0

    iget-object v1, p0, La3/p1;->x:Lb2/v;

    invoke-static {v1, v0}, La3/g;->c(La3/n;I)Lb2/v;

    move-result-object v3

    sget-object v0, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    iget-object v2, p0, La3/p1;->w:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v4, p0, La3/p1;->y:La3/e;

    iget-wide v5, p0, La3/p1;->z:J

    iget-object v7, p0, La3/p1;->E:La3/v;

    iget v8, p0, La3/p1;->F:I

    iget-boolean v9, p0, La3/p1;->G:Z

    iget v10, p0, La3/p1;->H:F

    iget-boolean v11, p0, La3/p1;->I:Z

    invoke-virtual/range {v2 .. v11}, Landroidx/compose/ui/node/NodeCoordinator;->u1(Lb2/v;La3/e;JLa3/v;IZFZ)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
