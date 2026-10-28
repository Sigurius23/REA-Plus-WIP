.class public final synthetic Lop1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lad3/c;


# direct methods
.method public synthetic constructor <init>(Lad3/c;I)V
    .locals 0

    iput p2, p0, Lop1/c;->w:I

    iput-object p1, p0, Lop1/c;->x:Lad3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lop1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lop1/c;->x:Lad3/c;

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    invoke-static {v0, p1}, Lop1/d;->d(Lad3/c;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;)Lso1/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lop1/c;->x:Lad3/c;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Lop1/d;->a(Lad3/c;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lop1/c;->x:Lad3/c;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Lop1/d;->c(Lad3/c;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
