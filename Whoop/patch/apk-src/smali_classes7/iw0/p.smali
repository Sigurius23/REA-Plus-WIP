.class public final synthetic Liw0/p;
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

    iput p2, p0, Liw0/p;->w:I

    iput-object p1, p0, Liw0/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Liw0/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liw0/p;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0, p1}, Liw0/c0;->g(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liw0/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Liw0/x;->c0(Ljava/util/List;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
