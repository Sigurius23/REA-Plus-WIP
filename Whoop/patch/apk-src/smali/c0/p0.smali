.class public final Lc0/p0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function3;

.field public final synthetic F:I

.field public final synthetic w:Ld0/z1;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ld0/c0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ld0/z1;Landroidx/compose/ui/Modifier;Ld0/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    iput-object p1, p0, Lc0/p0;->w:Ld0/z1;

    iput-object p2, p0, Lc0/p0;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lc0/p0;->y:Ld0/c0;

    iput-object p4, p0, Lc0/p0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lc0/p0;->E:Lkotlin/jvm/functions/Function3;

    iput p6, p0, Lc0/p0;->F:I

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

    iget p1, p0, Lc0/p0;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lc0/p0;->w:Ld0/z1;

    iget-object v1, p0, Lc0/p0;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc0/p0;->y:Ld0/c0;

    iget-object v3, p0, Lc0/p0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lc0/p0;->E:Lkotlin/jvm/functions/Function3;

    invoke-static/range {v0 .. v6}, Lpf/c;->a(Ld0/z1;Landroidx/compose/ui/Modifier;Ld0/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
