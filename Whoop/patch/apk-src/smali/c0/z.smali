.class public final Lc0/z;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc0/e1;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lkotlin/jvm/functions/Function3;

.field public final synthetic H:I

.field public final synthetic w:Ld0/z1;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc0/c1;


# direct methods
.method public constructor <init>(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lc93/m;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    iput-object p1, p0, Lc0/z;->w:Ld0/z1;

    iput-object p2, p0, Lc0/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lc0/z;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lc0/z;->z:Lc0/c1;

    iput-object p5, p0, Lc0/z;->E:Lc0/e1;

    iput-object p6, p0, Lc0/z;->F:Lc93/m;

    iput-object p7, p0, Lc0/z;->G:Lkotlin/jvm/functions/Function3;

    iput p8, p0, Lc0/z;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc0/z;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Lc0/z;->w:Ld0/z1;

    iget-object v1, p0, Lc0/z;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lc0/z;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lc0/z;->z:Lc0/c1;

    iget-object v4, p0, Lc0/z;->E:Lc0/e1;

    iget-object v5, p0, Lc0/z;->F:Lc93/m;

    iget-object v6, p0, Lc0/z;->G:Lkotlin/jvm/functions/Function3;

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->a(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lc93/m;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
