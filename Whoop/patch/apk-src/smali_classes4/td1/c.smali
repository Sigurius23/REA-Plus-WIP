.class public final synthetic Ltd1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ltd1/d;


# direct methods
.method public synthetic constructor <init>(Ltd1/d;I)V
    .locals 0

    iput p2, p0, Ltd1/c;->w:I

    iput-object p1, p0, Ltd1/c;->x:Ltd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ltd1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltd1/c;->x:Ltd1/d;

    check-cast p1, Lkk0/b;

    invoke-static {v0, p1}, Ltd1/d;->G(Ltd1/d;Lkk0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ltd1/c;->x:Ltd1/d;

    check-cast p1, Ltd1/e;

    invoke-static {v0, p1}, Ltd1/d;->I(Ltd1/d;Ltd1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
