.class public final Lkotlin/reflect/jvm/internal/StandardKTypes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u000e\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/StandardKTypes;",
        "",
        "<init>",
        "()V",
        "Lj93/a0;",
        "ANY",
        "Lj93/a0;",
        "getANY",
        "()Lj93/a0;",
        "NULLABLE_ANY",
        "getNULLABLE_ANY",
        "CLONEABLE",
        "getCLONEABLE",
        "SERIALIZABLE",
        "getSERIALIZABLE",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ANY:Lj93/a0;

.field private static final CLONEABLE:Lj93/a0;

.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/StandardKTypes;

.field private static final NULLABLE_ANY:Lj93/a0;

.field private static final SERIALIZABLE:Lj93/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/StandardKTypes;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/StandardKTypes;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->INSTANCE:Lkotlin/reflect/jvm/internal/StandardKTypes;

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    sput-object v1, Lkotlin/reflect/jvm/internal/StandardKTypes;->ANY:Lj93/a0;

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->NULLABLE_ANY:Lj93/a0;

    const-class v0, Ljava/lang/Cloneable;

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->CLONEABLE:Lj93/a0;

    const-class v0, Ljava/io/Serializable;

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->SERIALIZABLE:Lj93/a0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getANY()Lj93/a0;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->ANY:Lj93/a0;

    return-object v0
.end method

.method public final getCLONEABLE()Lj93/a0;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->CLONEABLE:Lj93/a0;

    return-object v0
.end method

.method public final getNULLABLE_ANY()Lj93/a0;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->NULLABLE_ANY:Lj93/a0;

    return-object v0
.end method

.method public final getSERIALIZABLE()Lj93/a0;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/StandardKTypes;->SERIALIZABLE:Lj93/a0;

    return-object v0
.end method
