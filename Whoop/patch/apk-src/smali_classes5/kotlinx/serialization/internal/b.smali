.class public final synthetic Lkotlinx/serialization/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlinx/serialization/internal/TaggedDecoder;

.field public final synthetic y:Lwc3/b;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/serialization/internal/TaggedDecoder;Lwc3/b;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lkotlinx/serialization/internal/b;->w:I

    iput-object p1, p0, Lkotlinx/serialization/internal/b;->x:Lkotlinx/serialization/internal/TaggedDecoder;

    iput-object p2, p0, Lkotlinx/serialization/internal/b;->y:Lwc3/b;

    iput-object p3, p0, Lkotlinx/serialization/internal/b;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkotlinx/serialization/internal/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkotlinx/serialization/internal/b;->y:Lwc3/b;

    iget-object v1, p0, Lkotlinx/serialization/internal/b;->z:Ljava/lang/Object;

    iget-object v2, p0, Lkotlinx/serialization/internal/b;->x:Lkotlinx/serialization/internal/TaggedDecoder;

    invoke-static {v2, v0, v1}, Lkotlinx/serialization/internal/TaggedDecoder;->c(Lkotlinx/serialization/internal/TaggedDecoder;Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkotlinx/serialization/internal/b;->y:Lwc3/b;

    iget-object v1, p0, Lkotlinx/serialization/internal/b;->z:Ljava/lang/Object;

    iget-object v2, p0, Lkotlinx/serialization/internal/b;->x:Lkotlinx/serialization/internal/TaggedDecoder;

    invoke-static {v2, v0, v1}, Lkotlinx/serialization/internal/TaggedDecoder;->d(Lkotlinx/serialization/internal/TaggedDecoder;Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
