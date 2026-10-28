.class public final synthetic Ljp2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;I)V
    .locals 0

    iput p2, p0, Ljp2/m;->w:I

    iput-object p1, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljp2/m;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1, p2}, Lz21/c;->d(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1, p2}, Lwq2/b;->c(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1, p2}, Lwo1/i0;->c(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1, p2}, Lqz0/k;->d(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1, p2}, Lqt2/s;->i(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ljp2/m;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1, p2}, Ljp2/n;->n(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
