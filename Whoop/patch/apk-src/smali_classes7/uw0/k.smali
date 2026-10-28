.class public final synthetic Luw0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lg2/i;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lkm0/e;

.field public final synthetic y:I

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lkm0/e;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lg2/i;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luw0/k;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Luw0/k;->x:Lkm0/e;

    iput p3, p0, Luw0/k;->y:I

    iput-object p4, p0, Luw0/k;->z:Lbc3/c0;

    iput-object p5, p0, Luw0/k;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Luw0/k;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Luw0/k;->G:Lg2/i;

    iput p8, p0, Luw0/k;->H:I

    iput p9, p0, Luw0/k;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Luw0/k;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Luw0/k;->x:Lkm0/e;

    iget v2, p0, Luw0/k;->y:I

    iget-object v3, p0, Luw0/k;->z:Lbc3/c0;

    iget-object v4, p0, Luw0/k;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Luw0/k;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Luw0/k;->G:Lg2/i;

    iget v7, p0, Luw0/k;->H:I

    iget v8, p0, Luw0/k;->I:I

    invoke-static/range {v0 .. v10}, Luw0/l;->k(Landroidx/compose/ui/Modifier;Lkm0/e;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lg2/i;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
