.class public final synthetic Lcz/i0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Lcz/i0;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcz/i0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p3, Lq83/d;

    iget-object p3, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast p3, Lc93/m;

    invoke-interface {p3, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly00/o4;

    check-cast p2, Lh20/a;

    check-cast p3, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcz/n0;

    invoke-static {v0, p1, p2, p3}, Lcz/n0;->l(Lcz/n0;Ly00/o4;Lh20/a;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
