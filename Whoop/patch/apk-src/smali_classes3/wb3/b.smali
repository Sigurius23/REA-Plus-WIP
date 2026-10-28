.class public final synthetic Lwb3/b;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lwb3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lwb3/b;

    const-string v4, "javaTypeNotSupported()Ljava/lang/Void;"

    const/4 v5, 0x1

    const/4 v1, 0x0

    const-class v2, Lwb3/f;

    const-string v3, "javaTypeNotSupported"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lwb3/b;->w:Lwb3/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    const-string v1, "javaType for captured types is not supported"

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method
