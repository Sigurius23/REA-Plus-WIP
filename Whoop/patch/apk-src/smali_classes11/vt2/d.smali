.class public final synthetic Lvt2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvt2/h;


# direct methods
.method public synthetic constructor <init>(Lvt2/h;I)V
    .locals 0

    iput p2, p0, Lvt2/d;->w:I

    iput-object p1, p0, Lvt2/d;->x:Lvt2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvt2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvt2/d;->x:Lvt2/h;

    check-cast p1, Lvt2/g;

    invoke-static {v0, p1}, Lvt2/f;->p(Lvt2/h;Lvt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvt2/d;->x:Lvt2/h;

    check-cast p1, Lvt2/g;

    invoke-static {v0, p1}, Lvt2/f;->k(Lvt2/h;Lvt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
