.class public abstract Lfn2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lfn2/j;",
        "b",
        "(I)Lfn2/j;",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(I)Lfn2/j;
    .locals 0

    invoke-static {p0}, Lfn2/m;->b(I)Lfn2/j;

    move-result-object p0

    return-object p0
.end method

.method private static final b(I)Lfn2/j;
    .locals 0

    if-nez p0, :cond_0

    sget-object p0, Lfn2/j;->Landscape:Lfn2/j;

    return-object p0

    :cond_0
    sget-object p0, Lfn2/j;->Portrait:Lfn2/j;

    return-object p0
.end method
