.class public final Lc4/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Lc4/i0;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc4/j0;

.field public final synthetic z:Lx1/b;


# direct methods
.method public constructor <init>(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;II)V
    .locals 0

    iput-object p1, p0, Lc4/p;->w:Lc4/i0;

    iput-object p2, p0, Lc4/p;->x:Lc93/a;

    iput-object p3, p0, Lc4/p;->y:Lc4/j0;

    iput-object p4, p0, Lc4/p;->z:Lx1/b;

    iput p5, p0, Lc4/p;->E:I

    iput p6, p0, Lc4/p;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc4/p;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget v6, p0, Lc4/p;->F:I

    iget-object v0, p0, Lc4/p;->w:Lc4/i0;

    iget-object v1, p0, Lc4/p;->x:Lc93/a;

    iget-object v2, p0, Lc4/p;->y:Lc4/j0;

    iget-object v3, p0, Lc4/p;->z:Lx1/b;

    invoke-static/range {v0 .. v6}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
