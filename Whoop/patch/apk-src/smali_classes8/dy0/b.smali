.class public final synthetic Ldy0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljb1/a;


# direct methods
.method public synthetic constructor <init>(Ljb1/a;I)V
    .locals 0

    iput p2, p0, Ldy0/b;->w:I

    iput-object p1, p0, Ldy0/b;->x:Ljb1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldy0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldy0/b;->x:Ljb1/a;

    check-cast p1, Lcom/whoop/design/models/items/ContributorTileModel;

    invoke-static {v0, p1}, Ldy0/c;->e(Ljb1/a;Lcom/whoop/design/models/items/ContributorTileModel;)Lc41/i1;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldy0/b;->x:Ljb1/a;

    check-cast p1, Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;

    invoke-static {v0, p1}, Ldy0/c;->c(Ljb1/a;Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;)Lqu1/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ldy0/b;->x:Ljb1/a;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Ldy0/c;->d(Ljb1/a;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
