.class public final synthetic Lfu0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfu0/f;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lfu0/f;Ljava/util/List;I)V
    .locals 0

    iput p3, p0, Lfu0/e;->w:I

    iput-object p1, p0, Lfu0/e;->x:Lfu0/f;

    iput-object p2, p0, Lfu0/e;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lfu0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfu0/e;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfu0/e;->x:Lfu0/f;

    invoke-static {v1, v0, p1}, Lfu0/f;->e(Lfu0/f;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfu0/e;->y:Ljava/util/List;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfu0/e;->x:Lfu0/f;

    invoke-static {v1, v0, p1}, Lfu0/f;->d(Lfu0/f;Ljava/util/List;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
