.class public final synthetic Lq00/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ly00/c0;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly00/c0;ZZZZZLc93/a;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/q;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lq00/q;->x:Ly00/c0;

    iput-boolean p3, p0, Lq00/q;->y:Z

    iput-boolean p4, p0, Lq00/q;->z:Z

    iput-boolean p5, p0, Lq00/q;->E:Z

    iput-boolean p6, p0, Lq00/q;->F:Z

    iput-boolean p7, p0, Lq00/q;->G:Z

    iput-object p8, p0, Lq00/q;->H:Lc93/a;

    iput-object p9, p0, Lq00/q;->I:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x7

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Lq00/q;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lq00/q;->x:Ly00/c0;

    iget-boolean v2, p0, Lq00/q;->y:Z

    iget-boolean v3, p0, Lq00/q;->z:Z

    iget-boolean v4, p0, Lq00/q;->E:Z

    iget-boolean v5, p0, Lq00/q;->F:Z

    iget-boolean v6, p0, Lq00/q;->G:Z

    iget-object v7, p0, Lq00/q;->H:Lc93/a;

    iget-object v8, p0, Lq00/q;->I:Lc93/a;

    invoke-static/range {v0 .. v10}, Lse/a;->k(Landroidx/compose/ui/Modifier;Ly00/c0;ZZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
