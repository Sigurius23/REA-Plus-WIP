.class public final synthetic Luf/i0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Luf/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Luf/i0;

    const-string v4, "<init>(Ljava/lang/String;Ljava/lang/Throwable;)V"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-class v2, Laws/smithy/kotlin/runtime/http/operation/CallTimeoutException;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Luf/i0;->w:Luf/i0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Throwable;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laws/smithy/kotlin/runtime/http/operation/CallTimeoutException;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Laws/smithy/kotlin/runtime/http/operation/ClientTimeoutException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-object v0
.end method
