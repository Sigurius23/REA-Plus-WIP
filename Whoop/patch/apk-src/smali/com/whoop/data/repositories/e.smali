.class public final synthetic Lcom/whoop/data/repositories/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/data/repositories/UserStrapsRepository;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/data/repositories/UserStrapsRepository;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/data/repositories/e;->w:I

    iput-object p1, p0, Lcom/whoop/data/repositories/e;->x:Lcom/whoop/data/repositories/UserStrapsRepository;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/data/repositories/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/repositories/e;->x:Lcom/whoop/data/repositories/UserStrapsRepository;

    check-cast p1, Ltd1/e;

    invoke-static {v0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->b(Lcom/whoop/data/repositories/UserStrapsRepository;Ltd1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/repositories/e;->x:Lcom/whoop/data/repositories/UserStrapsRepository;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->a(Lcom/whoop/data/repositories/UserStrapsRepository;Lod1/u$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
