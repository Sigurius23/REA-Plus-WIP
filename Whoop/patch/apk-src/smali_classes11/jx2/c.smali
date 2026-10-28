.class public final synthetic Ljx2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/whooplabs/feature/navigation/b;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplabs/feature/navigation/b;I)V
    .locals 0

    iput p2, p0, Ljx2/c;->w:I

    iput-object p1, p0, Ljx2/c;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljx2/c;->w:I

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljx2/c;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-static {v0, p1, p2, p3}, Ljx2/f;->p(Lcom/whoop/whooplabs/feature/navigation/b;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljx2/c;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-static {v0, p1, p2, p3}, Ljx2/f;->f(Lcom/whoop/whooplabs/feature/navigation/b;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljx2/c;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-static {v0, p1, p2, p3}, Ljx2/f;->g(Lcom/whoop/whooplabs/feature/navigation/b;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljx2/c;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-static {v0, p1, p2, p3}, Ljx2/f;->u(Lcom/whoop/whooplabs/feature/navigation/b;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ljx2/c;->x:Lcom/whoop/whooplabs/feature/navigation/b;

    invoke-static {v0, p1, p2, p3}, Ljx2/f;->w(Lcom/whoop/whooplabs/feature/navigation/b;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
