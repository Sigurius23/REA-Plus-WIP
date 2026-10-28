.class public final synthetic Law0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Z)V
    .locals 0

    .line 1
    iput p3, p0, Law0/c;->w:I

    iput-boolean p5, p0, Law0/c;->y:Z

    iput-object p4, p0, Law0/c;->x:Landroidx/compose/ui/Modifier;

    iput p1, p0, Law0/c;->z:I

    iput p2, p0, Law0/c;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IILandroidx/compose/ui/Modifier;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Law0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Law0/c;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Law0/c;->y:Z

    iput p1, p0, Law0/c;->z:I

    iput p2, p0, Law0/c;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Law0/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Law0/c;->z:I

    iget-boolean v2, p0, Law0/c;->y:Z

    iget-object v3, p0, Law0/c;->x:Landroidx/compose/ui/Modifier;

    iget v5, p0, Law0/c;->E:I

    invoke-static/range {v1 .. v6}, Lh02/f;->c(IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Law0/c;->z:I

    iget-boolean v1, p0, Law0/c;->y:Z

    iget-object v2, p0, Law0/c;->x:Landroidx/compose/ui/Modifier;

    iget v4, p0, Law0/c;->E:I

    invoke-static/range {v0 .. v5}, Lcp0/g;->c(IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Law0/c;->z:I

    iget-boolean v1, p0, Law0/c;->y:Z

    iget-object v2, p0, Law0/c;->x:Landroidx/compose/ui/Modifier;

    iget v4, p0, Law0/c;->E:I

    invoke-static/range {v0 .. v5}, Law0/d;->a(IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
