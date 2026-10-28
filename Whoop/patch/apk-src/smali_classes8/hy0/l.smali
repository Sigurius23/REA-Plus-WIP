.class public final synthetic Lhy0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lhy0/l;->w:I

    iput-object p1, p0, Lhy0/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhy0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/l;->x:Ljava/lang/Object;

    check-cast v0, Lhy0/a;

    invoke-static {v0, p1}, Lhy0/t1;->b(Lhy0/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/l;->x:Ljava/lang/Object;

    check-cast v0, Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lhy0/g1;->e(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhy0/l;->x:Ljava/lang/Object;

    check-cast v0, Lg1/n7;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lhy0/b1;->e(Lg1/n7;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhy0/l;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lhy0/n;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
