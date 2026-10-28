.class public final synthetic Lih0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lah0/c;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lah0/c;ZZLc93/a;II)V
    .locals 0

    iput p6, p0, Lih0/q;->w:I

    iput-object p1, p0, Lih0/q;->x:Lah0/c;

    iput-boolean p2, p0, Lih0/q;->y:Z

    iput-boolean p3, p0, Lih0/q;->z:Z

    iput-object p4, p0, Lih0/q;->E:Lc93/a;

    iput p5, p0, Lih0/q;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lih0/q;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lih0/q;->x:Lah0/c;

    iget-boolean v2, p0, Lih0/q;->y:Z

    iget-boolean v3, p0, Lih0/q;->z:Z

    iget-object v4, p0, Lih0/q;->E:Lc93/a;

    iget v5, p0, Lih0/q;->F:I

    invoke-static/range {v1 .. v7}, Lih0/e0;->Z(Lah0/c;ZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lih0/q;->x:Lah0/c;

    iget-boolean v1, p0, Lih0/q;->y:Z

    iget-boolean v2, p0, Lih0/q;->z:Z

    iget-object v3, p0, Lih0/q;->E:Lc93/a;

    iget v4, p0, Lih0/q;->F:I

    invoke-static/range {v0 .. v6}, Lih0/e0;->G(Lah0/c;ZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
