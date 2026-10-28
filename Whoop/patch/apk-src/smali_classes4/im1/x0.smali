.class public final synthetic Lim1/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lim1/d0;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lem1/v;

.field public final synthetic y:Lc03/c;

.field public final synthetic z:Lep0/j;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lem1/v;Lc03/c;Lep0/j;Lc93/a;Lim1/d0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/x0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lim1/x0;->x:Lem1/v;

    iput-object p3, p0, Lim1/x0;->y:Lc03/c;

    iput-object p4, p0, Lim1/x0;->z:Lep0/j;

    iput-object p5, p0, Lim1/x0;->E:Lc93/a;

    iput-object p6, p0, Lim1/x0;->F:Lim1/d0;

    iput-object p7, p0, Lim1/x0;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lim1/x0;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lim1/x0;->I:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Lim1/x0;->J:I

    iput p11, p0, Lim1/x0;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lim1/x0;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lim1/x0;->x:Lem1/v;

    iget-object v2, p0, Lim1/x0;->y:Lc03/c;

    iget-object v3, p0, Lim1/x0;->z:Lep0/j;

    iget-object v4, p0, Lim1/x0;->E:Lc93/a;

    iget-object v5, p0, Lim1/x0;->F:Lim1/d0;

    iget-object v6, p0, Lim1/x0;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lim1/x0;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lim1/x0;->I:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lim1/x0;->J:I

    iget v10, p0, Lim1/x0;->K:I

    invoke-static/range {v0 .. v12}, Lim1/a1;->i(Landroidx/compose/ui/Modifier;Lem1/v;Lc03/c;Lep0/j;Lc93/a;Lim1/d0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
