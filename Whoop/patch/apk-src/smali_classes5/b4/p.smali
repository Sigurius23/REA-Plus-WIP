.class public final Lb4/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput-object p1, p0, Lb4/p;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb4/p;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lb4/p;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lb4/p;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lb4/p;->E:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lb4/p;->F:I

    iput p7, p0, Lb4/p;->G:I

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

    iget p1, p0, Lb4/p;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v7, p0, Lb4/p;->G:I

    iget-object v0, p0, Lb4/p;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb4/p;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lb4/p;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lb4/p;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lb4/p;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/viewinterop/a;->b(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
