.class public final Lo9/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/p0;

.field public final b:[I


# direct methods
.method public constructor <init>(ILu8/p0;[I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length p1, p3

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const-string v0, "ETSDefinition"

    const-string v1, "Empty tracks are not allowed"

    invoke-static {v0, v1, p1}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p2, p0, Lo9/r;->a:Lu8/p0;

    iput-object p3, p0, Lo9/r;->b:[I

    return-void
.end method
