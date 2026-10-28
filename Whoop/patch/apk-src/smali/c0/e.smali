.class public final Lc0/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lc93/n;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lb2/h;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;II)V
    .locals 0

    iput-object p1, p0, Lc0/e;->w:Ljava/lang/Object;

    iput-object p2, p0, Lc0/e;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lc0/e;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lc0/e;->z:Lb2/h;

    iput-object p5, p0, Lc0/e;->E:Ljava/lang/String;

    iput-object p6, p0, Lc0/e;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lc0/e;->G:Lc93/n;

    iput p8, p0, Lc0/e;->H:I

    iput p9, p0, Lc0/e;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lc0/e;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget v9, p0, Lc0/e;->I:I

    iget-object v0, p0, Lc0/e;->w:Ljava/lang/Object;

    iget-object v1, p0, Lc0/e;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc0/e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lc0/e;->z:Lb2/h;

    iget-object v4, p0, Lc0/e;->E:Ljava/lang/String;

    iget-object v5, p0, Lc0/e;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lc0/e;->G:Lc93/n;

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
