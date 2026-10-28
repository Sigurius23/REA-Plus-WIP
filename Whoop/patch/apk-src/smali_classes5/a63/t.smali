.class public final La63/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La63/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, La63/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ll83/k;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Float;

    check-cast p1, Ll83/k;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Float;

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/nio/charset/Charset;

    invoke-static {p1}, Lu63/a;->c(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ljava/nio/charset/Charset;

    invoke-static {p2}, Lu63/a;->c(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
