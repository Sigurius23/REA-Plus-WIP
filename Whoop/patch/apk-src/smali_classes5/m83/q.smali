.class public final Lm83/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lm83/q;->w:I

    iput-object p1, p0, Lm83/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lm83/q;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La0/i1;

    iget-object v1, p0, Lm83/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlinx/serialization/internal/EnumDescriptor;

    invoke-direct {v0, v1}, La0/i1;-><init>(Lkotlinx/serialization/internal/EnumDescriptor;)V

    return-object v0

    :pswitch_0
    new-instance v0, La0/i1;

    iget-object v1, p0, Lm83/q;->x:Ljava/lang/Object;

    check-cast v1, Lyc3/g;

    invoke-direct {v0, v1}, La0/i1;-><init>(Lyc3/g;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lm83/d0;

    iget-object v1, p0, Lm83/q;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Iterator;

    invoke-direct {v0, v1}, Lm83/d0;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lm83/q;->x:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
