.class public final synthetic Lq00/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ly00/c0;

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lx1/b;

.field public final synthetic J:Lx1/b;

.field public final synthetic K:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZFZLy00/c0;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/w;->w:Ljava/lang/String;

    iput-object p2, p0, Lq00/w;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lq00/w;->y:Z

    iput p4, p0, Lq00/w;->z:F

    iput-boolean p5, p0, Lq00/w;->E:Z

    iput-object p6, p0, Lq00/w;->F:Ly00/c0;

    iput-object p7, p0, Lq00/w;->G:Landroidx/compose/ui/Modifier;

    iput-object p8, p0, Lq00/w;->H:Lc93/a;

    iput-object p9, p0, Lq00/w;->I:Lx1/b;

    iput-object p10, p0, Lq00/w;->J:Lx1/b;

    iput p11, p0, Lq00/w;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lq00/w;->K:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v0, p0, Lq00/w;->w:Ljava/lang/String;

    iget-object v1, p0, Lq00/w;->x:Ljava/lang/String;

    iget-boolean v2, p0, Lq00/w;->y:Z

    iget v3, p0, Lq00/w;->z:F

    iget-boolean v4, p0, Lq00/w;->E:Z

    iget-object v5, p0, Lq00/w;->F:Ly00/c0;

    iget-object v6, p0, Lq00/w;->G:Landroidx/compose/ui/Modifier;

    iget-object v7, p0, Lq00/w;->H:Lc93/a;

    iget-object v8, p0, Lq00/w;->I:Lx1/b;

    iget-object v9, p0, Lq00/w;->J:Lx1/b;

    invoke-static/range {v0 .. v11}, Lse/h;->o(Ljava/lang/String;Ljava/lang/String;ZFZLy00/c0;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
