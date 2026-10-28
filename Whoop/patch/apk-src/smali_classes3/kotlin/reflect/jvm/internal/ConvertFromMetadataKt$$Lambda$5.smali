.class Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$5;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field private final arg$0:Lwb3/a;


# direct methods
.method public constructor <init>(Lwb3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$5;->arg$0:Lwb3/a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$5;->arg$0:Lwb3/a;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt;->accessor$ConvertFromMetadataKt$lambda5(Lwb3/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
