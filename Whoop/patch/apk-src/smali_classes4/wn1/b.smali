.class public final synthetic Lwn1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FZIFII)V
    .locals 0

    iput p6, p0, Lwn1/b;->w:I

    iput p1, p0, Lwn1/b;->x:F

    iput-boolean p2, p0, Lwn1/b;->y:Z

    iput p3, p0, Lwn1/b;->z:I

    iput p4, p0, Lwn1/b;->E:F

    iput p5, p0, Lwn1/b;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lwn1/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lwn1/b;->x:F

    iget-boolean v2, p0, Lwn1/b;->y:Z

    iget v3, p0, Lwn1/b;->z:I

    iget v4, p0, Lwn1/b;->E:F

    iget v5, p0, Lwn1/b;->F:I

    invoke-static/range {v1 .. v7}, Lwn1/d;->b(FZIFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lwn1/b;->x:F

    iget-boolean v1, p0, Lwn1/b;->y:Z

    iget v2, p0, Lwn1/b;->z:I

    iget v3, p0, Lwn1/b;->E:F

    iget v4, p0, Lwn1/b;->F:I

    invoke-static/range {v0 .. v6}, Lwn1/c;->a(FZIFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
