.class public final synthetic Lq00/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Ly00/c0;

.field public final synthetic x:Lg40/m3;

.field public final synthetic y:Lx30/e0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ly00/c0;Lg40/m3;Lx30/e0;ZZLandroidx/compose/ui/Modifier;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/b0;->w:Ly00/c0;

    iput-object p2, p0, Lq00/b0;->x:Lg40/m3;

    iput-object p3, p0, Lq00/b0;->y:Lx30/e0;

    iput-boolean p4, p0, Lq00/b0;->z:Z

    iput-boolean p5, p0, Lq00/b0;->E:Z

    iput-object p6, p0, Lq00/b0;->F:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x201

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v0, p0, Lq00/b0;->w:Ly00/c0;

    iget-object v1, p0, Lq00/b0;->x:Lg40/m3;

    iget-object v2, p0, Lq00/b0;->y:Lx30/e0;

    iget-boolean v3, p0, Lq00/b0;->z:Z

    iget-boolean v4, p0, Lq00/b0;->E:Z

    iget-object v5, p0, Lq00/b0;->F:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v7}, Lse/h;->e(Ly00/c0;Lg40/m3;Lx30/e0;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
