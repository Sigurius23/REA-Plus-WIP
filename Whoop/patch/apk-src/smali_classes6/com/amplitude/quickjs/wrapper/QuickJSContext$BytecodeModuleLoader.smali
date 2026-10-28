.class public abstract Lcom/amplitude/quickjs/wrapper/QuickJSContext$BytecodeModuleLoader;
.super Lcom/amplitude/quickjs/wrapper/ModuleLoader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/quickjs/wrapper/QuickJSContext;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "BytecodeModuleLoader"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/amplitude/quickjs/wrapper/ModuleLoader;-><init>()V

    return-void
.end method


# virtual methods
.method public getModuleStringCode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isBytecodeMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
