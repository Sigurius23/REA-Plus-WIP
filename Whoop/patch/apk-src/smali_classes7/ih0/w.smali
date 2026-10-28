.class public final synthetic Lih0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Lah0/f;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lah0/f;ZZZLc93/a;III)V
    .locals 0

    iput p8, p0, Lih0/w;->w:I

    iput-object p1, p0, Lih0/w;->x:Lah0/f;

    iput-boolean p2, p0, Lih0/w;->y:Z

    iput-boolean p3, p0, Lih0/w;->z:Z

    iput-boolean p4, p0, Lih0/w;->E:Z

    iput-object p5, p0, Lih0/w;->F:Lc93/a;

    iput p6, p0, Lih0/w;->G:I

    iput p7, p0, Lih0/w;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lih0/w;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lih0/w;->x:Lah0/f;

    iget-boolean v2, p0, Lih0/w;->y:Z

    iget-boolean v3, p0, Lih0/w;->z:Z

    iget-boolean v4, p0, Lih0/w;->E:Z

    iget-object v5, p0, Lih0/w;->F:Lc93/a;

    iget v6, p0, Lih0/w;->G:I

    iget v7, p0, Lih0/w;->H:I

    invoke-static/range {v1 .. v9}, Lih0/e0;->I(Lah0/f;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lih0/w;->x:Lah0/f;

    iget-boolean v1, p0, Lih0/w;->y:Z

    iget-boolean v2, p0, Lih0/w;->z:Z

    iget-boolean v3, p0, Lih0/w;->E:Z

    iget-object v4, p0, Lih0/w;->F:Lc93/a;

    iget v5, p0, Lih0/w;->G:I

    iget v6, p0, Lih0/w;->H:I

    invoke-static/range {v0 .. v8}, Lih0/e0;->x(Lah0/f;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
