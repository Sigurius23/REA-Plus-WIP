.class public final synthetic Lb61/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lj71/c;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic I:Lj71/c;

.field public final synthetic J:Lb61/l;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lj71/c;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lj71/c;Lp1/c1;Lp1/c1;Lj71/c;Lp1/c1;Lp1/c1;Lj71/c;Lb61/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb61/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb61/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lb61/e;->y:Lj71/c;

    iput-object p4, p0, Lb61/e;->z:Lp1/c1;

    iput-object p5, p0, Lb61/e;->E:Lp1/c1;

    iput-object p6, p0, Lb61/e;->F:Lj71/c;

    iput-object p7, p0, Lb61/e;->G:Lp1/c1;

    iput-object p8, p0, Lb61/e;->H:Lp1/c1;

    iput-object p9, p0, Lb61/e;->I:Lj71/c;

    iput-object p10, p0, Lb61/e;->J:Lb61/l;

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

    iget-object v0, p0, Lb61/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb61/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb61/e;->y:Lj71/c;

    iget-object v3, p0, Lb61/e;->z:Lp1/c1;

    iget-object v4, p0, Lb61/e;->E:Lp1/c1;

    iget-object v5, p0, Lb61/e;->F:Lj71/c;

    iget-object v6, p0, Lb61/e;->G:Lp1/c1;

    iget-object v7, p0, Lb61/e;->H:Lp1/c1;

    iget-object v8, p0, Lb61/e;->I:Lj71/c;

    iget-object v9, p0, Lb61/e;->J:Lb61/l;

    invoke-static/range {v0 .. v11}, Lb61/k;->g(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lj71/c;Lp1/c1;Lp1/c1;Lj71/c;Lp1/c1;Lp1/c1;Lj71/c;Lb61/l;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
