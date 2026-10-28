.class public final Lc0/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/n;

.field public final synthetic G:I

.field public final synthetic w:Ld0/z1;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lb2/h;


# direct methods
.method public constructor <init>(Ld0/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Lkotlin/jvm/functions/Function1;Lc93/n;I)V
    .locals 0

    iput-object p1, p0, Lc0/k;->w:Ld0/z1;

    iput-object p2, p0, Lc0/k;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lc0/k;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lc0/k;->z:Lb2/h;

    iput-object p5, p0, Lc0/k;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lc0/k;->F:Lc93/n;

    iput p7, p0, Lc0/k;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc0/k;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v0, p0, Lc0/k;->w:Ld0/z1;

    iget-object v1, p0, Lc0/k;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc0/k;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lc0/k;->z:Lb2/h;

    iget-object v4, p0, Lc0/k;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lc0/k;->F:Lc93/n;

    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/a;->a(Ld0/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
