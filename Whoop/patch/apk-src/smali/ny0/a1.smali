.class public final synthetic Lny0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V
    .locals 0

    .line 1
    iput p8, p0, Lny0/a1;->w:I

    iput-object p1, p0, Lny0/a1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lny0/a1;->E:Ljava/lang/Object;

    iput-object p3, p0, Lny0/a1;->F:Ljava/lang/Object;

    iput-object p4, p0, Lny0/a1;->G:Ljava/lang/Object;

    iput-object p5, p0, Lny0/a1;->H:Ljava/lang/Object;

    iput p6, p0, Lny0/a1;->x:I

    iput p7, p0, Lny0/a1;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;ILjava/util/Map;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lny0/a1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/a1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lny0/a1;->F:Ljava/lang/Object;

    iput-object p3, p0, Lny0/a1;->E:Ljava/lang/Object;

    iput-object p4, p0, Lny0/a1;->G:Ljava/lang/Object;

    iput p5, p0, Lny0/a1;->x:I

    iput-object p6, p0, Lny0/a1;->H:Ljava/lang/Object;

    iput p7, p0, Lny0/a1;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lny0/a1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lny0/a1;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll3/g;

    iget-object v0, p0, Lny0/a1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lny0/a1;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll3/v0;

    iget-object v0, p0, Lny0/a1;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lny0/a1;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget v5, p0, Lny0/a1;->x:I

    iget-object v6, p0, Lny0/a1;->H:Ljava/lang/Object;

    invoke-static/range {v1 .. v8}, Lq83/g;->c(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;ILjava/util/Map;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lny0/a1;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg80/f;

    iget-object v0, p0, Lny0/a1;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc03/c;

    iget-object v0, p0, Lny0/a1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lny0/a1;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lny0/a1;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v6, p0, Lny0/a1;->x:I

    iget v7, p0, Lny0/a1;->y:I

    invoke-static/range {v1 .. v9}, Lt90/a;->a(Lg80/f;Lc03/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lny0/a1;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lny0/o;

    iget-object v0, p0, Lny0/a1;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lny0/a1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lny0/a1;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lny0/a1;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v6, p0, Lny0/a1;->x:I

    iget v7, p0, Lny0/a1;->y:I

    invoke-static/range {v1 .. v9}, Lny0/b1;->b(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
