.class public final Lc0/m0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function3;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ld0/c0;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;II)V
    .locals 0

    iput-object p1, p0, Lc0/m0;->w:Ljava/lang/Object;

    iput-object p2, p0, Lc0/m0;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lc0/m0;->y:Ld0/c0;

    iput-object p4, p0, Lc0/m0;->z:Ljava/lang/String;

    iput-object p5, p0, Lc0/m0;->E:Lkotlin/jvm/functions/Function3;

    iput p6, p0, Lc0/m0;->F:I

    iput p7, p0, Lc0/m0;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc0/m0;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v7, p0, Lc0/m0;->G:I

    iget-object v0, p0, Lc0/m0;->w:Ljava/lang/Object;

    iget-object v1, p0, Lc0/m0;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc0/m0;->y:Ld0/c0;

    iget-object v3, p0, Lc0/m0;->z:Ljava/lang/String;

    iget-object v4, p0, Lc0/m0;->E:Lkotlin/jvm/functions/Function3;

    invoke-static/range {v0 .. v7}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
