.class public final Lrj/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic F:I

.field public final synthetic w:Z

.field public final synthetic x:Lkotlin/jvm/internal/m;

.field public final synthetic y:Luj/i;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Lx1/b;I)V
    .locals 0

    iput-boolean p1, p0, Lrj/n;->w:Z

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lrj/n;->x:Lkotlin/jvm/internal/m;

    iput-object p3, p0, Lrj/n;->y:Luj/i;

    iput-object p4, p0, Lrj/n;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lrj/n;->E:Lx1/b;

    iput p6, p0, Lrj/n;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lrj/n;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v0, p0, Lrj/n;->w:Z

    iget-object v1, p0, Lrj/n;->x:Lkotlin/jvm/internal/m;

    iget-object v2, p0, Lrj/n;->y:Luj/i;

    iget-object v3, p0, Lrj/n;->z:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lrj/n;->E:Lx1/b;

    invoke-static/range {v0 .. v6}, Lrj/o;->f(ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
