.class public final synthetic Lmt2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmt2/f;


# direct methods
.method public synthetic constructor <init>(Lmt2/f;I)V
    .locals 0

    iput p2, p0, Lmt2/b;->w:I

    iput-object p1, p0, Lmt2/b;->x:Lmt2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmt2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmt2/b;->x:Lmt2/f;

    check-cast p1, Lmt2/g;

    invoke-static {v0, p1}, Lmt2/e;->e(Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmt2/b;->x:Lmt2/f;

    check-cast p1, Lmt2/g;

    invoke-static {v0, p1}, Lmt2/e;->g(Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmt2/b;->x:Lmt2/f;

    check-cast p1, Lmt2/g;

    invoke-static {v0, p1}, Lmt2/e;->c(Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
