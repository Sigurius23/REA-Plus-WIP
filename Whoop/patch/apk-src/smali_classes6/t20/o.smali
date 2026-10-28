.class public final synthetic Lt20/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lt20/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt20/o;->y:Lc93/a;

    iput-object p2, p0, Lt20/o;->z:Lc93/a;

    iput-object p3, p0, Lt20/o;->x:Ljava/lang/String;

    iput p4, p0, Lt20/o;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lc93/a;Lc93/a;II)V
    .locals 0

    .line 2
    iput p5, p0, Lt20/o;->w:I

    iput-object p1, p0, Lt20/o;->x:Ljava/lang/String;

    iput-object p2, p0, Lt20/o;->y:Lc93/a;

    iput-object p3, p0, Lt20/o;->z:Lc93/a;

    iput p4, p0, Lt20/o;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lt20/o;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lt20/o;->x:Ljava/lang/String;

    iget-object v2, p0, Lt20/o;->y:Lc93/a;

    iget-object v3, p0, Lt20/o;->z:Lc93/a;

    iget v4, p0, Lt20/o;->E:I

    invoke-static/range {v1 .. v6}, Lyw1/i;->k(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lt20/o;->x:Ljava/lang/String;

    iget-object v1, p0, Lt20/o;->y:Lc93/a;

    iget-object v2, p0, Lt20/o;->z:Lc93/a;

    iget v3, p0, Lt20/o;->E:I

    invoke-static/range {v0 .. v5}, Lwi0/e;->i(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lt20/o;->E:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lt20/o;->x:Ljava/lang/String;

    iget-object v1, p0, Lt20/o;->y:Lc93/a;

    iget-object v2, p0, Lt20/o;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Ls9/f;->b(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
