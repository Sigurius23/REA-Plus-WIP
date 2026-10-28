.class public final synthetic Lpp2/m;
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

    iput p2, p0, Lpp2/m;->w:I

    iput-object p1, p0, Lpp2/m;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpp2/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp2/m;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lpp2/e;->d(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpp2/m;->x:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    check-cast p1, Lh2/b;

    invoke-static {v0, p1}, Lpp2/n$a;->a(Lg2/i;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
