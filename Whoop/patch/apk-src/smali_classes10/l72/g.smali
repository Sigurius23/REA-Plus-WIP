.class public final synthetic Ll72/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lz1/p;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lz1/p;II)V
    .locals 0

    iput p3, p0, Ll72/g;->w:I

    iput-object p1, p0, Ll72/g;->x:Lz1/p;

    iput p2, p0, Ll72/g;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll72/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ll72/g;->y:I

    check-cast p1, Ljava/lang/Integer;

    iget-object v1, p0, Ll72/g;->x:Lz1/p;

    invoke-static {v1, v0, p1}, Ll72/i;->n(Lz1/p;ILjava/lang/Integer;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Ll72/g;->y:I

    check-cast p1, Ljava/lang/Integer;

    iget-object v1, p0, Ll72/g;->x:Lz1/p;

    invoke-static {v1, v0, p1}, Ll72/i;->j(Lz1/p;ILjava/lang/Integer;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
