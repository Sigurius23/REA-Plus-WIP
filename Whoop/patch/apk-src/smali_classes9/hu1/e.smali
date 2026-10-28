.class public final synthetic Lhu1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhu1/h;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lhu1/h;Ljava/util/List;I)V
    .locals 0

    iput p3, p0, Lhu1/e;->w:I

    iput-object p1, p0, Lhu1/e;->x:Lhu1/h;

    iput-object p2, p0, Lhu1/e;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhu1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhu1/e;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lhu1/e;->x:Lhu1/h;

    invoke-static {v1, v0, p1}, Lhu1/h;->c(Lhu1/h;Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhu1/e;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lhu1/e;->x:Lhu1/h;

    invoke-static {v1, v0, p1}, Lhu1/h;->e(Lhu1/h;Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
