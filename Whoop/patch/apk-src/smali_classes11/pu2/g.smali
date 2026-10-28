.class public final synthetic Lpu2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lpu2/f;


# direct methods
.method public synthetic constructor <init>(Lpu2/f;I)V
    .locals 0

    iput p2, p0, Lpu2/g;->w:I

    iput-object p1, p0, Lpu2/g;->x:Lpu2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpu2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpu2/g;->x:Lpu2/f;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lpu2/f;->g(Lpu2/f;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpu2/g;->x:Lpu2/f;

    check-cast p1, Lhu2/a$c0;

    invoke-static {v0, p1}, Lpu2/f$f$a;->f(Lpu2/f;Lhu2/a$c0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
