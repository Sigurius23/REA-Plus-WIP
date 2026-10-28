.class public final synthetic Lhd1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lid1/e;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lid1/e;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lhd1/a;->w:I

    iput-object p1, p0, Lhd1/a;->x:Lid1/e;

    iput-object p2, p0, Lhd1/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhd1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhd1/a;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, Lhd1/a;->x:Lid1/e;

    invoke-static {v1, v0, p1}, Lhd1/b;->d(Lid1/e;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhd1/a;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lo0/s;

    iget-object v1, p0, Lhd1/a;->x:Lid1/e;

    invoke-static {v1, v0, p1}, Lhd1/b;->b(Lid1/e;Lkotlin/jvm/functions/Function1;Lo0/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
