.class public final synthetic Lz1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lz1/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz1/k;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lz81/f;->a(Lkd1/g;)Lz81/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lz81/d;->b(Lkd1/g;)Lz81/b;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lz1/j;

    sget-object p1, Lz1/l;->a:Lz1/k;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
