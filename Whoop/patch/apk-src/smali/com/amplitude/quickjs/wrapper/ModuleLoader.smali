.class public abstract Lcom/amplitude/quickjs/wrapper/ModuleLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getModuleBytecode(Ljava/lang/String;)[B
.end method

.method public abstract getModuleStringCode(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract isBytecodeMode()Z
.end method

.method public moduleNormalizeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p2
.end method
