.class public final synthetic Lf61/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lf61/i;

.field public final synthetic y:Lg61/b;

.field public final synthetic z:Li61/b;


# direct methods
.method public synthetic constructor <init>(Lf61/i;Lg61/b;Li61/b;II)V
    .locals 0

    iput p5, p0, Lf61/c;->w:I

    iput-object p1, p0, Lf61/c;->x:Lf61/i;

    iput-object p2, p0, Lf61/c;->y:Lg61/b;

    iput-object p3, p0, Lf61/c;->z:Li61/b;

    iput p4, p0, Lf61/c;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf61/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lf61/c;->x:Lf61/i;

    iget-object v2, p0, Lf61/c;->y:Lg61/b;

    iget-object v3, p0, Lf61/c;->z:Li61/b;

    iget v4, p0, Lf61/c;->E:I

    invoke-static/range {v1 .. v6}, Lf61/i;->c(Lf61/i;Lg61/b;Li61/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lf61/c;->x:Lf61/i;

    iget-object v1, p0, Lf61/c;->y:Lg61/b;

    iget-object v2, p0, Lf61/c;->z:Li61/b;

    iget v3, p0, Lf61/c;->E:I

    invoke-static/range {v0 .. v5}, Lf61/i;->b(Lf61/i;Lg61/b;Li61/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
