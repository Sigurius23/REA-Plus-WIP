.class public final synthetic Lwm1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lwm1/c;

.field public final synthetic z:Lwm1/b;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lwm1/c;Lwm1/b;III)V
    .locals 0

    .line 1
    iput p6, p0, Lwm1/h;->w:I

    iput-object p1, p0, Lwm1/h;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lwm1/h;->y:Lwm1/c;

    iput-object p3, p0, Lwm1/h;->z:Lwm1/b;

    iput p4, p0, Lwm1/h;->E:I

    iput p5, p0, Lwm1/h;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwm1/c;Lwm1/b;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lwm1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwm1/h;->y:Lwm1/c;

    iput-object p2, p0, Lwm1/h;->z:Lwm1/b;

    iput-object p3, p0, Lwm1/h;->x:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lwm1/h;->E:I

    iput p5, p0, Lwm1/h;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lwm1/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lwm1/h;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lwm1/h;->y:Lwm1/c;

    iget-object v3, p0, Lwm1/h;->z:Lwm1/b;

    iget v4, p0, Lwm1/h;->E:I

    iget v5, p0, Lwm1/h;->F:I

    invoke-static/range {v1 .. v7}, Lwm1/k;->d(Landroidx/compose/ui/Modifier;Lwm1/c;Lwm1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lwm1/h;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lwm1/h;->y:Lwm1/c;

    iget-object v2, p0, Lwm1/h;->z:Lwm1/b;

    iget v3, p0, Lwm1/h;->E:I

    iget v4, p0, Lwm1/h;->F:I

    invoke-static/range {v0 .. v6}, Lwm1/k;->n(Landroidx/compose/ui/Modifier;Lwm1/c;Lwm1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lwm1/h;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lwm1/h;->y:Lwm1/c;

    iget-object v2, p0, Lwm1/h;->z:Lwm1/b;

    iget v3, p0, Lwm1/h;->E:I

    iget v4, p0, Lwm1/h;->F:I

    invoke-static/range {v0 .. v6}, Lwm1/k;->a(Landroidx/compose/ui/Modifier;Lwm1/c;Lwm1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
