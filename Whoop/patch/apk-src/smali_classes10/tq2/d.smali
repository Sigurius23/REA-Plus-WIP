.class public final synthetic Ltq2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ltq2/g;


# direct methods
.method public synthetic constructor <init>(Ltq2/g;I)V
    .locals 0

    iput p2, p0, Ltq2/d;->w:I

    iput-object p1, p0, Ltq2/d;->x:Ltq2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ltq2/d;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltq2/d;->x:Ltq2/g;

    invoke-static {v0, p1, p2}, Ltq2/e;->b(Ltq2/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ltq2/d;->x:Ltq2/g;

    invoke-static {v0, p1, p2}, Ltq2/e;->c(Ltq2/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
