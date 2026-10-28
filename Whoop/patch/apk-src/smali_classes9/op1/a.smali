.class public final synthetic Lop1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lop1/b;


# direct methods
.method public synthetic constructor <init>(Lop1/b;I)V
    .locals 0

    iput p2, p0, Lop1/a;->w:I

    iput-object p1, p0, Lop1/a;->x:Lop1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lop1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lop1/a;->x:Lop1/b;

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;

    invoke-static {v0, p1}, Lop1/b;->d(Lop1/b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;)Lwo1/b0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lop1/a;->x:Lop1/b;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Lop1/b;->b(Lop1/b;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lop1/a;->x:Lop1/b;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Lop1/b;->c(Lop1/b;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
