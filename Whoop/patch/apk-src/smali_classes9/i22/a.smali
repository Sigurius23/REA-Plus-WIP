.class public final synthetic Li22/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lg22/a;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lg22/a;Lc93/m;Lc93/a;III)V
    .locals 0

    iput p6, p0, Li22/a;->w:I

    iput-object p1, p0, Li22/a;->x:Lg22/a;

    iput-object p2, p0, Li22/a;->y:Lc93/m;

    iput-object p3, p0, Li22/a;->z:Lc93/a;

    iput p4, p0, Li22/a;->E:I

    iput p5, p0, Li22/a;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Li22/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Li22/a;->x:Lg22/a;

    iget-object v2, p0, Li22/a;->y:Lc93/m;

    iget-object v3, p0, Li22/a;->z:Lc93/a;

    iget v4, p0, Li22/a;->E:I

    iget v5, p0, Li22/a;->F:I

    invoke-static/range {v1 .. v7}, Li22/c;->m(Lg22/a;Lc93/m;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Li22/a;->x:Lg22/a;

    iget-object v1, p0, Li22/a;->y:Lc93/m;

    iget-object v2, p0, Li22/a;->z:Lc93/a;

    iget v3, p0, Li22/a;->E:I

    iget v4, p0, Li22/a;->F:I

    invoke-static/range {v0 .. v6}, Li22/c;->b(Lg22/a;Lc93/m;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
