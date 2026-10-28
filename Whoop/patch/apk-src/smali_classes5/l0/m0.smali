.class public final synthetic Ll0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Lkotlin/jvm/functions/Function3;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ll0/i;

.field public final synthetic y:Ll0/l;

.field public final synthetic z:Lb2/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/m0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ll0/m0;->x:Ll0/i;

    iput-object p3, p0, Ll0/m0;->y:Ll0/l;

    iput-object p4, p0, Ll0/m0;->z:Lb2/g;

    iput p5, p0, Ll0/m0;->E:I

    iput p6, p0, Ll0/m0;->F:I

    iput-object p7, p0, Ll0/m0;->G:Lkotlin/jvm/functions/Function3;

    iput p8, p0, Ll0/m0;->H:I

    iput p9, p0, Ll0/m0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll0/m0;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Ll0/m0;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ll0/m0;->x:Ll0/i;

    iget-object v2, p0, Ll0/m0;->y:Ll0/l;

    iget-object v3, p0, Ll0/m0;->z:Lb2/g;

    iget v4, p0, Ll0/m0;->E:I

    iget v5, p0, Ll0/m0;->F:I

    iget-object v6, p0, Ll0/m0;->G:Lkotlin/jvm/functions/Function3;

    iget v9, p0, Ll0/m0;->I:I

    invoke-static/range {v0 .. v9}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
