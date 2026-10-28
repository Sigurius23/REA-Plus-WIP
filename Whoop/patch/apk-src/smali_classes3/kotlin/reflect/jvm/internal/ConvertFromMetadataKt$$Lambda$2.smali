.class Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/m;


# instance fields
.field private final arg$0:Ljava/lang/ClassLoader;

.field private final arg$1:Lkotlin/reflect/jvm/internal/TypeParameterTable;

.field private final arg$2:Lc93/a;

.field private final arg$3:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lc93/a;Lkotlin/jvm/internal/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$0:Ljava/lang/ClassLoader;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$1:Lkotlin/reflect/jvm/internal/TypeParameterTable;

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$2:Lc93/a;

    iput-object p4, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$3:Lkotlin/jvm/internal/g0;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$0:Ljava/lang/ClassLoader;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$1:Lkotlin/reflect/jvm/internal/TypeParameterTable;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$2:Lc93/a;

    iget-object v3, p0, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt$$Lambda$2;->arg$3:Lkotlin/jvm/internal/g0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v4

    move-object v5, p2

    check-cast v5, Laa3/e1;

    invoke-static/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt;->accessor$ConvertFromMetadataKt$lambda2(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lc93/a;Lkotlin/jvm/internal/g0;ILaa3/e1;)Lj93/d0;

    move-result-object p1

    return-object p1
.end method
