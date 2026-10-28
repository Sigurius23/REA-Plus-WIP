.class public final synthetic Ls51/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ls51/i;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ls51/i;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ls51/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls51/k;->y:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ls51/k;->x:Ls51/i;

    iput p3, p0, Ls51/k;->z:I

    iput p4, p0, Ls51/k;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ls51/i;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ls51/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls51/k;->x:Ls51/i;

    iput-object p2, p0, Ls51/k;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Ls51/k;->z:I

    iput p4, p0, Ls51/k;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ls51/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Ls51/k;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Ls51/k;->x:Ls51/i;

    iget v3, p0, Ls51/k;->z:I

    iget v4, p0, Ls51/k;->E:I

    invoke-static/range {v1 .. v6}, Ls51/l;->b(Landroidx/compose/ui/Modifier;Ls51/i;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ls51/k;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ls51/k;->x:Ls51/i;

    iget v2, p0, Ls51/k;->z:I

    iget v3, p0, Ls51/k;->E:I

    invoke-static/range {v0 .. v5}, Ls51/l;->c(Landroidx/compose/ui/Modifier;Ls51/i;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
