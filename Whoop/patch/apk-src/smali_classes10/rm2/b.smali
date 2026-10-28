.class public final synthetic Lrm2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/u0;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Lc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lrm2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrm2/b;->y:Lc93/a;

    iput-object p1, p0, Lrm2/b;->x:Leb/u0;

    return-void
.end method

.method public synthetic constructor <init>(Leb/u0;Lc93/a;I)V
    .locals 0

    .line 2
    iput p3, p0, Lrm2/b;->w:I

    iput-object p1, p0, Lrm2/b;->x:Leb/u0;

    iput-object p2, p0, Lrm2/b;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lrm2/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm2/b;->y:Lc93/a;

    iget-object v1, p0, Lrm2/b;->x:Leb/u0;

    invoke-static {v0, v1, p1, p2}, Lrm2/e;->H(Lc93/a;Leb/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrm2/b;->y:Lc93/a;

    iget-object v1, p0, Lrm2/b;->x:Leb/u0;

    invoke-static {v0, v1, p1, p2}, Lrm2/e;->q(Lc93/a;Leb/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lrm2/b;->y:Lc93/a;

    iget-object v1, p0, Lrm2/b;->x:Leb/u0;

    invoke-static {v0, v1, p1, p2}, Lrm2/e;->j(Lc93/a;Leb/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lrm2/b;->y:Lc93/a;

    iget-object v1, p0, Lrm2/b;->x:Leb/u0;

    invoke-static {v0, v1, p1, p2}, Lrm2/e;->K(Lc93/a;Leb/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
