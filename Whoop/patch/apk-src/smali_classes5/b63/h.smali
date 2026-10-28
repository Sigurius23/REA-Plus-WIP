.class public abstract Lb63/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/io/InputStream;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/d;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Ldt/b;->A([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lb63/h;->a:Ljava/util/Set;

    return-void
.end method
