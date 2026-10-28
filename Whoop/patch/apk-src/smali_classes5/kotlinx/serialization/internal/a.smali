.class public final synthetic Lkotlinx/serialization/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;I)V
    .locals 0

    iput p2, p0, Lkotlinx/serialization/internal/a;->w:I

    iput-object p1, p0, Lkotlinx/serialization/internal/a;->x:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkotlinx/serialization/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkotlinx/serialization/internal/a;->x:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    invoke-static {v0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->a(Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkotlinx/serialization/internal/a;->x:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    invoke-static {v0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->b(Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;)[Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkotlinx/serialization/internal/a;->x:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    invoke-static {v0}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->c(Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;)[Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
