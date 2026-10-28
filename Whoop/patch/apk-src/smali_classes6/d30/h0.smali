.class public final synthetic Ld30/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Lkotlin/jvm/functions/Function3;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lx1/b;

.field public final synthetic I:I

.field public final synthetic w:Lh20/g1;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ll0/l1;


# direct methods
.method public synthetic constructor <init>(Lh20/g1;ZZLl0/l1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/h0;->w:Lh20/g1;

    iput-boolean p2, p0, Ld30/h0;->x:Z

    iput-boolean p3, p0, Ld30/h0;->y:Z

    iput-object p4, p0, Ld30/h0;->z:Ll0/l1;

    iput-object p5, p0, Ld30/h0;->E:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Ld30/h0;->F:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Ld30/h0;->G:Lc93/a;

    iput-object p8, p0, Ld30/h0;->H:Lx1/b;

    iput p9, p0, Ld30/h0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ld30/h0;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Ld30/h0;->w:Lh20/g1;

    iget-boolean v1, p0, Ld30/h0;->x:Z

    iget-boolean v2, p0, Ld30/h0;->y:Z

    iget-object v3, p0, Ld30/h0;->z:Ll0/l1;

    iget-object v4, p0, Ld30/h0;->E:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Ld30/h0;->F:Lkotlin/jvm/functions/Function3;

    iget-object v6, p0, Ld30/h0;->G:Lc93/a;

    iget-object v7, p0, Ld30/h0;->H:Lx1/b;

    invoke-static/range {v0 .. v9}, Lkotlin/jvm/internal/j;->m(Lh20/g1;ZZLl0/l1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
