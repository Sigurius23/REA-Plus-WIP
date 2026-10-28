.class public final Ll83/j;
.super Ljava/lang/Error;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "An operation is not implemented."

    invoke-direct {p0, v0}, Ll83/j;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    return-void
.end method
