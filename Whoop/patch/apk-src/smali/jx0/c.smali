.class public final synthetic Ljx0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljx0/e;

.field public final synthetic y:Ljx0/a;


# direct methods
.method public synthetic constructor <init>(Ljx0/e;Ljx0/a;I)V
    .locals 0

    iput p3, p0, Ljx0/c;->w:I

    iput-object p1, p0, Ljx0/c;->x:Ljx0/e;

    iput-object p2, p0, Ljx0/c;->y:Ljx0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljx0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljx0/c;->y:Ljx0/a;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Ljx0/c;->x:Ljx0/e;

    invoke-static {v1, v0, p1}, Ljx0/e;->f(Ljx0/e;Ljx0/a;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljx0/c;->y:Ljx0/a;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Ljx0/c;->x:Ljx0/e;

    invoke-static {v1, v0, p1}, Ljx0/e;->i(Ljx0/e;Ljx0/a;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljx0/c;->y:Ljx0/a;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Ljx0/c;->x:Ljx0/e;

    invoke-static {v1, v0, p1}, Ljx0/e;->j(Ljx0/e;Ljx0/a;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
