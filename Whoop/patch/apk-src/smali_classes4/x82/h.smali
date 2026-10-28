.class public final synthetic Lx82/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx82/i;


# direct methods
.method public synthetic constructor <init>(Lx82/i;I)V
    .locals 0

    iput p2, p0, Lx82/h;->w:I

    iput-object p1, p0, Lx82/h;->x:Lx82/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx82/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx82/h;->x:Lx82/i;

    check-cast p1, Ljava/lang/Byte;

    invoke-static {v0, p1}, Lx82/i;->d(Lx82/i;Ljava/lang/Byte;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lx82/h;->x:Lx82/i;

    check-cast p1, Lkk0/b;

    invoke-static {v0, p1}, Lx82/i;->c(Lx82/i;Lkk0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
