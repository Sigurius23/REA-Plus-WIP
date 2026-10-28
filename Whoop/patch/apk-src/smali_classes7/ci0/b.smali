.class public final synthetic Lci0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;I)V
    .locals 0

    iput p2, p0, Lci0/b;->w:I

    iput-object p1, p0, Lci0/b;->x:Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lci0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lci0/b;->x:Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;

    check-cast p1, Lzh0/a;

    invoke-static {v0, p1}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->y(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lzh0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lci0/b;->x:Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;

    check-cast p1, Lai0/a;

    invoke-static {v0, p1}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->A(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lai0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
