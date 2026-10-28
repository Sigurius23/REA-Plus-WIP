.class public final Lc0/b0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc0/e1;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lx1/b;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Ll0/y;

.field public final synthetic x:Ld0/q0;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc0/d1;


# direct methods
.method public constructor <init>(Ll0/y;Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;II)V
    .locals 0

    iput-object p1, p0, Lc0/b0;->w:Ll0/y;

    iput-object p2, p0, Lc0/b0;->x:Ld0/q0;

    iput-object p3, p0, Lc0/b0;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lc0/b0;->z:Lc0/d1;

    iput-object p5, p0, Lc0/b0;->E:Lc0/e1;

    iput-object p6, p0, Lc0/b0;->F:Ljava/lang/String;

    iput-object p7, p0, Lc0/b0;->G:Lx1/b;

    iput p8, p0, Lc0/b0;->H:I

    iput p9, p0, Lc0/b0;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc0/b0;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget v9, p0, Lc0/b0;->I:I

    iget-object v0, p0, Lc0/b0;->w:Ll0/y;

    iget-object v1, p0, Lc0/b0;->x:Ld0/q0;

    iget-object v2, p0, Lc0/b0;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lc0/b0;->z:Lc0/d1;

    iget-object v4, p0, Lc0/b0;->E:Lc0/e1;

    iget-object v5, p0, Lc0/b0;->F:Ljava/lang/String;

    iget-object v6, p0, Lc0/b0;->G:Lx1/b;

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/b;->d(Ll0/y;Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
