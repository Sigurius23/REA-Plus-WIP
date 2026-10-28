.class public final Lam/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lam/a;

.field public final synthetic F:F

.field public final synthetic G:Lam/g;

.field public final synthetic H:Lx1/b;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lam/h;

.field public final synthetic y:Lam/g;

.field public final synthetic z:F


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;I)V
    .locals 0

    iput-object p1, p0, Lam/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lam/e;->x:Lam/h;

    iput-object p3, p0, Lam/e;->y:Lam/g;

    iput p4, p0, Lam/e;->z:F

    iput-object p5, p0, Lam/e;->E:Lam/a;

    iput p6, p0, Lam/e;->F:F

    iput-object p7, p0, Lam/e;->G:Lam/g;

    iput-object p8, p0, Lam/e;->H:Lx1/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    const p1, 0xc30d87

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Lam/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lam/e;->x:Lam/h;

    iget-object v2, p0, Lam/e;->y:Lam/g;

    iget v3, p0, Lam/e;->z:F

    iget-object v4, p0, Lam/e;->E:Lam/a;

    iget v5, p0, Lam/e;->F:F

    iget-object v6, p0, Lam/e;->G:Lam/g;

    iget-object v7, p0, Lam/e;->H:Lx1/b;

    invoke-static/range {v0 .. v9}, Lo73/a;->b(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
