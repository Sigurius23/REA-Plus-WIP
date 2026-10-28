.class public final synthetic Lrm2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Leb/u0;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Lc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lrm2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrm2/a;->x:Lc93/a;

    iput-object p1, p0, Lrm2/a;->y:Leb/u0;

    return-void
.end method

.method public synthetic constructor <init>(Leb/u0;Lc93/a;I)V
    .locals 0

    .line 2
    iput p3, p0, Lrm2/a;->w:I

    iput-object p1, p0, Lrm2/a;->y:Leb/u0;

    iput-object p2, p0, Lrm2/a;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lrm2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Leb/q;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lrm2/a;->x:Lc93/a;

    iget-object v2, p0, Lrm2/a;->y:Leb/u0;

    invoke-static/range {v1 .. v6}, Lrm2/e;->B(Lc93/a;Leb/u0;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v2, p1

    check-cast v2, Lc0/o;

    move-object v3, p2

    check-cast v3, Leb/q;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lrm2/a;->x:Lc93/a;

    iget-object v1, p0, Lrm2/a;->y:Leb/u0;

    invoke-static/range {v0 .. v5}, Lrm2/e;->N(Lc93/a;Leb/u0;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v2, p1

    check-cast v2, Lc0/o;

    move-object v3, p2

    check-cast v3, Leb/q;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lrm2/a;->x:Lc93/a;

    iget-object v1, p0, Lrm2/a;->y:Leb/u0;

    invoke-static/range {v0 .. v5}, Lrm2/e;->d(Lc93/a;Leb/u0;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v2, p1

    check-cast v2, Lc0/o;

    move-object v3, p2

    check-cast v3, Leb/q;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lrm2/a;->x:Lc93/a;

    iget-object v1, p0, Lrm2/a;->y:Leb/u0;

    invoke-static/range {v0 .. v5}, Lrm2/e;->I(Lc93/a;Leb/u0;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
