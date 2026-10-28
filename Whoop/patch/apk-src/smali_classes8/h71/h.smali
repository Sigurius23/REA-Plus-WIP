.class public final synthetic Lh71/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Li71/g;

.field public final synthetic G:Li71/h;

.field public final synthetic H:Lh2/c;

.field public final synthetic I:F

.field public final synthetic J:I

.field public final synthetic w:Lh71/i;

.field public final synthetic x:Lj71/b;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lh71/i;Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh71/h;->w:Lh71/i;

    iput-object p2, p0, Lh71/h;->x:Lj71/b;

    iput-object p3, p0, Lh71/h;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lh71/h;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lh71/h;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh71/h;->F:Li71/g;

    iput-object p7, p0, Lh71/h;->G:Li71/h;

    iput-object p8, p0, Lh71/h;->H:Lh2/c;

    iput p9, p0, Lh71/h;->I:F

    iput p10, p0, Lh71/h;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lh71/h;->w:Lh71/i;

    iget-object v1, p0, Lh71/h;->x:Lj71/b;

    iget-object v2, p0, Lh71/h;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lh71/h;->z:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lh71/h;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lh71/h;->F:Li71/g;

    iget-object v6, p0, Lh71/h;->G:Li71/h;

    iget-object v7, p0, Lh71/h;->H:Lh2/c;

    iget v8, p0, Lh71/h;->I:F

    iget v9, p0, Lh71/h;->J:I

    invoke-static/range {v0 .. v11}, Lh71/i;->a(Lh71/i;Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
