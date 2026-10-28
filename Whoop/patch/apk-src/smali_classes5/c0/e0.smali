.class public final Lc0/e0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lx1/b;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Z

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lc0/c1;

.field public final synthetic z:Lc0/e1;


# direct methods
.method public constructor <init>(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lx1/b;II)V
    .locals 0

    iput-boolean p1, p0, Lc0/e0;->w:Z

    iput-object p2, p0, Lc0/e0;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lc0/e0;->y:Lc0/c1;

    iput-object p4, p0, Lc0/e0;->z:Lc0/e1;

    iput-object p5, p0, Lc0/e0;->E:Ljava/lang/String;

    iput-object p6, p0, Lc0/e0;->F:Lx1/b;

    iput p7, p0, Lc0/e0;->G:I

    iput p8, p0, Lc0/e0;->H:I

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

    iget p1, p0, Lc0/e0;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget v8, p0, Lc0/e0;->H:I

    iget-boolean v0, p0, Lc0/e0;->w:Z

    iget-object v1, p0, Lc0/e0;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc0/e0;->y:Lc0/c1;

    iget-object v3, p0, Lc0/e0;->z:Lc0/e1;

    iget-object v4, p0, Lc0/e0;->E:Ljava/lang/String;

    iget-object v5, p0, Lc0/e0;->F:Lx1/b;

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->g(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
