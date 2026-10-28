.class public final synthetic Ld30/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Lh20/d1;

.field public final synthetic G:Lx1/b;

.field public final synthetic H:I

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Ll0/l1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZZLl0/l1;Lc93/a;Landroidx/compose/ui/Modifier;Lh20/d1;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld30/j0;->w:Z

    iput-boolean p2, p0, Ld30/j0;->x:Z

    iput-object p3, p0, Ld30/j0;->y:Ll0/l1;

    iput-object p4, p0, Ld30/j0;->z:Lc93/a;

    iput-object p5, p0, Ld30/j0;->E:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Ld30/j0;->F:Lh20/d1;

    iput-object p7, p0, Ld30/j0;->G:Lx1/b;

    iput p8, p0, Ld30/j0;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ld30/j0;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-boolean v0, p0, Ld30/j0;->w:Z

    iget-boolean v1, p0, Ld30/j0;->x:Z

    iget-object v2, p0, Ld30/j0;->y:Ll0/l1;

    iget-object v3, p0, Ld30/j0;->z:Lc93/a;

    iget-object v4, p0, Ld30/j0;->E:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Ld30/j0;->F:Lh20/d1;

    iget-object v6, p0, Ld30/j0;->G:Lx1/b;

    invoke-static/range {v0 .. v8}, Lkotlin/jvm/internal/j;->n(ZZLl0/l1;Lc93/a;Landroidx/compose/ui/Modifier;Lh20/d1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
