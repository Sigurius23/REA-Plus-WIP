.class public final synthetic Lg1/z6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function3;

.field public final synthetic F:Lx1/b;

.field public final synthetic G:I

.field public final synthetic w:Lg1/a2;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/util/Set;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lg1/a2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lx1/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/z6;->w:Lg1/a2;

    iput-object p2, p0, Lg1/z6;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/z6;->y:Ljava/util/Set;

    iput-object p4, p0, Lg1/z6;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lg1/z6;->E:Lkotlin/jvm/functions/Function3;

    iput-object p6, p0, Lg1/z6;->F:Lx1/b;

    iput p8, p0, Lg1/z6;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x36d81

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v0, p0, Lg1/z6;->w:Lg1/a2;

    iget-object v1, p0, Lg1/z6;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lg1/z6;->y:Ljava/util/Set;

    iget-object v3, p0, Lg1/z6;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lg1/z6;->E:Lkotlin/jvm/functions/Function3;

    iget-object v5, p0, Lg1/z6;->F:Lx1/b;

    iget v8, p0, Lg1/z6;->G:I

    invoke-static/range {v0 .. v8}, Lg1/c7;->a(Lg1/a2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
