.class public final Ll30/k;
.super Ll30/m;
.source "SourceFile"


# static fields
.field public static final b:Ll30/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll30/o;

    const-string v1, "The integrity of the SDK has been tampered."

    sget-object v2, Ll30/n;->x:Ll30/n;

    const-string v3, "SW02"

    invoke-direct {v0, v3, v1, v2}, Ll30/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll30/n;)V

    sput-object v0, Ll30/k;->b:Ll30/o;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 8

    const-class v0, Lp30/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v2, "getDeclaredFields(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v1, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getDeclaredMethods(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    move v3, v4

    :goto_1
    if-ge v3, v2, :cond_3

    aget-object v5, v0, v3

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isSynthetic()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    return v4

    :cond_4
    const/4 v0, 0x1

    return v0
.end method
