.class public final Lc4/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Lb2/h;

.field public final synthetic x:J

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lc4/j0;


# direct methods
.method public constructor <init>(Lb2/h;JLc93/a;Lc4/j0;Lx1/b;II)V
    .locals 0

    iput-object p1, p0, Lc4/j;->w:Lb2/h;

    iput-wide p2, p0, Lc4/j;->x:J

    iput-object p4, p0, Lc4/j;->y:Lc93/a;

    iput-object p5, p0, Lc4/j;->z:Lc4/j0;

    iput-object p6, p0, Lc4/j;->E:Lx1/b;

    iput p7, p0, Lc4/j;->F:I

    iput p8, p0, Lc4/j;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc4/j;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget v8, p0, Lc4/j;->G:I

    iget-object v0, p0, Lc4/j;->w:Lb2/h;

    iget-wide v1, p0, Lc4/j;->x:J

    iget-object v3, p0, Lc4/j;->y:Lc93/a;

    iget-object v4, p0, Lc4/j;->z:Lc4/j0;

    iget-object v5, p0, Lc4/j;->E:Lx1/b;

    invoke-static/range {v0 .. v8}, Lc4/r;->b(Lb2/h;JLc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
