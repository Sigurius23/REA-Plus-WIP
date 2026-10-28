.class public final Lcom/mapbox/common/loader/MapboxLibraryLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/LibraryLoader;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/mapbox/common/loader/MapboxLibraryLoader;",
        "Lcom/mapbox/common/module/LibraryLoader;",
        "<init>",
        "()V",
        "",
        "libraryName",
        "Ll83/a0;",
        "load",
        "(Ljava/lang/String;)V",
        "libloader_release"
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
.field public static final INSTANCE:Lcom/mapbox/common/loader/MapboxLibraryLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/loader/MapboxLibraryLoader;

    invoke-direct {v0}, Lcom/mapbox/common/loader/MapboxLibraryLoader;-><init>()V

    sput-object v0, Lcom/mapbox/common/loader/MapboxLibraryLoader;->INSTANCE:Lcom/mapbox/common/loader/MapboxLibraryLoader;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public load(Ljava/lang/String;)V
    .locals 1

    const-string v0, "libraryName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method
