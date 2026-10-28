.class public final synthetic Lea2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/DebugFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/DebugFragment;I)V
    .locals 0

    iput p2, p0, Lea2/a;->w:I

    iput-object p1, p0, Lea2/a;->x:Lcom/whoop/settings/DebugFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lea2/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/a;->x:Lcom/whoop/settings/DebugFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/DebugFragment;->e0(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lea2/a;->x:Lcom/whoop/settings/DebugFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/DebugFragment;->Q(Lcom/whoop/settings/DebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
