.class public final Lcom/mapbox/common/NativeExceptionController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0004H\u0087 \u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/mapbox/common/NativeExceptionController;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "Ll83/a0;",
        "setRethrowNativeExceptions",
        "(Z)V",
        "getRethrowNativeExceptions",
        "()Z",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/NativeExceptionController;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/NativeExceptionController;

    invoke-direct {v0}, Lcom/mapbox/common/NativeExceptionController;-><init>()V

    sput-object v0, Lcom/mapbox/common/NativeExceptionController;->INSTANCE:Lcom/mapbox/common/NativeExceptionController;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native getRethrowNativeExceptions()Z
.end method

.method public static final native setRethrowNativeExceptions(Z)V
.end method
